function readFile() {
	let input = document.getElementById('file-input')
	let file = input.files[0]
	let reader = new FileReader()
	reader.readAsText(file, 'UTF-8')
	reader.onload = () => {
		var fileContent = reader.result
		let editor = getCurrentAceEditor()
		let doc = editor.env.document.doc
		if (doc !== null || doc !== undefined) {
			doc.setValue(fileContent)
			let fileName = document.getElementById('fileName');
			fileName.value = file.name
			localStorage.setItem("fileName", file.name)
		}
	}
}

function printChildren(a) {
	let s = "";
	a.forEach((element) => {
		s = s + element.getFieldValue("TEXT");
	})
	return s;
}

function onDocumentChange() {
	let editor = getCurrentAceEditor()
	let document = editor.env.document.doc
	let fileContent = document.getValue()
	localStorage.setItem(editor.container.id + "fileContent", fileContent)
}

function getSavedDocument(editor) {
	let doc = editor.env.document.doc
	let editorId = editor.container.id
	let fileContent = localStorage.getItem(editorId + "fileContent");
	if (fileContent !== null) {
		doc.insert({ row: 0, column: 0 }, fileContent)
	}
	let fileName = localStorage.getItem(editorId + "fileName")
	if (fileContent !== null) {
		let fileNameElement = document.getElementById(editorId + 'fileName');
		if (fileNameElement !== null)
			fileNameElement.value = fileName
	}
}

let entities = document.getElementById('xtext-editor-entities')
let entitiesTab = document.getElementById('entity-tab')
let entitiesBlock = document.getElementById('blockly-editor')
let scenario = document.getElementById('xtext-editor-scenarios')
let scenarioTab = document.getElementById('scenario-tab')
let scenarioBlock = document.getElementById('blockly-editor2')
let warningMessage = document.getElementById('warning-message')
let originalToolbox;
let entitiesToolboxInjected = false;
let scenarioToolboxInjected = false;
let scenarioWorkspace;
let entityWorkspace;
let blockArray;
let autoGeneratedEntityBlocks = false;
let autoGeneratedScenarioBlocks = false;
let currentAst;
let currentTab = entitiesTab;
let currentBlockly = entitiesBlock;
let enabledByText = false;
let enabledByCodeBlocks = false;

const runCodeForEntity = (element) => {
	if (entitiesToolboxInjected && element === entitiesTab && !autoGeneratedEntityBlocks)
	{
		let entityCode = getBddGenerator(blockArray).workspaceToCode(entityWorkspace);

		entityCode = entityCode.replaceAll('declarative entity', '\n declarative entity');
		entityCode = entityCode.replaceAll('imperative entity', '\n imperative entity');
		entityCode = entityCode.replaceAll('actions:', '\n actions:');
		entityCode = entityCode.replaceAll('states:', '\n states:');
		entityCode = entityCode.replaceAll('properties:', '\n properties:');


		let editor = getCurrentAceEditor()
		let doc = editor.env.document.doc
		if (doc !== null || doc !== undefined) {
			doc.setValue(entityCode.replace(/^\s*$\n?/gm, '').replace(/ +/g, ' ')); // removes blank lines & multiple spaces
			autoGeneratedEntityBlocks = false;
		}
	}	
};

const runCodeForScenario = (element) => {
	if (scenarioToolboxInjected && element === scenarioTab && !autoGeneratedScenarioBlocks)
	{
		console.log("runCodeForScenario");
		let scenarioCode = getBddGenerator(blockArray).workspaceToCode(scenarioWorkspace);
		
		scenarioCode = scenarioCode.replaceAll('Scenario:', '\n Scenario:');
		scenarioCode = scenarioCode.replaceAll('Given', '\n Given');
		scenarioCode = scenarioCode.replaceAll('When', '\n When');
		scenarioCode = scenarioCode.replaceAll('Then', '\n Then');
		scenarioCode = scenarioCode.replaceAll('And', '\n And');
		
		let editor = getCurrentAceEditor()
		let doc = editor.env.document.doc
		if (doc !== null || doc !== undefined) {
			doc.setValue(scenarioCode.replace(/^\s*$\n?/gm, '').replace(/ +/g, ' ')); // removes blank lines & multiple spaces	
			autoGeneratedScenarioBlocks = false;
		}
	}	
};

function displayEditor(currEditor, newEditor, currBlockly, newBlockly) {
	currEditor.style.display = "none"
	currBlockly.style.display = "none"
	newEditor.style.display = "block"
	newBlockly.style.display = "block"
}

function switchEditor(e) {
	if (e.target.disabled)
		return;

	var b = ""
	if (e.target != currentTab) {
		removeSelectionBorder(currentTab)
		let editorId = e.target.dataset.editorId

		if (editorId == "xtext-editor-entities") { b = "blockly-editor" }
		else if (editorId == "xtext-editor-scenarios") { b = "blockly-editor2" }

		let editor = document.getElementById(editorId)
		let blockly = document.getElementById(b)
		displayEditor(currentEditor, editor, currentBlockly, blockly)
		currentEditor = editor
		currentTab = e.target
		currentBlockly = blockly
		setSelectionBorder(currentTab)
    	loadBlocks(currentTab, true);
	}
}

function onEntityEditorChange() {
	if (entities.innerText != null && entities.innerText.replace(/[^a-zA-Z]/g, '').trim() !== '') {
		setEnabled(scenarioTab);
		enabledByText = true;

		fetch('/xtext-service/ast?resource=multi-resource/scenarios.bdd')
			.then(response => response.json())
			.then(response => {
				autoGeneratedEntityBlocks = true;
				if (currentAst !== response.ast)
				{
					generateBlocksFromAst(response.ast, entityWorkspace, blockArray, 'entities');
					currentAst = response.ast;
				}
			});
	}
	else if (!enabledByCodeBlocks) {
		setDisabled(scenarioTab);
		enabledByText = false;
	}
}

function onScenarioEditorChange() {
	fetch('/xtext-service/ast?resource=multi-resource/scenarios.bdd')
		.then(response => response.json())
		.then(response => {
			autoGeneratedScenarioBlocks = true;
			if (currentAst !== response.ast)
			{
				generateBlocksFromAst(response.ast, scenarioWorkspace, blockArray, 'scenarios');
				currentAst = response.ast;
			}
		});
}

function setSelectionBorder(element) {
	element.style.border = "2px black solid";
}

function removeSelectionBorder(element) {
	element.style.border = "2px white solid"
}

function setDisabled(element) {
	element.style.backgroundColor = "#f2f2f2";
	element.style.pointerEvents = "none";
	element.disabled = true;
	warningMessage.style.visibility = "visible";
}

function setEnabled(element) {
	element.style.backgroundColor = "#ddd";
	element.style.pointerEvents = "auto";
	element.disabled = false;
	warningMessage.style.visibility = "hidden";
}

if (entitiesTab != undefined)
	entitiesTab.onclick = switchEditor
if (scenarioTab != undefined)
	scenarioTab.onclick = switchEditor

setEnabled(entitiesTab);
setSelectionBorder(entitiesTab);

window.onload = () => {
  setTimeout (() => {
	currentEditor = entities;
    for (let editor of editors) {
      getSavedDocument(editor)
      let document = editor.env.document.doc
      document.on('change', onDocumentChange)
    }
    let input = document.getElementById('file-input')
    input.addEventListener('change', readFile) 

    loadBlocks(currentTab, false);
	onEntityEditorChange();
  }, 200)
}

let astBtn = document.getElementById('get-ast')
astBtn.onclick = () => {
	fetch('/xtext-service/ast?resource=multi-resource/scenarios.bdd')
		.then(response => response.json())
		.then(response => {
			console.log(response);
			console.log(JSON.stringify(response));
		})
}

function loadBlocks(element, skipAddingBlocks) {
	fetch('/xtext-service/blocks?resource=multi-resource/scenarios.bdd')
		.then(response => response.json())
		.then(response => {
			response.blocks = JSON.parse(response.blocks)
			response.toolBox = JSON.parse(response.toolBox)
			blockArray = response.blocks

      		if (!skipAddingBlocks)
			  Blockly.defineBlocksWithJsonArray(response.blocks)

			let id_validator = function(newValue) {
				//if it returns '', then the input is correct
				let res = newValue.replace(/[\^a-zA-Z_][a-zA-Z_0-9]*/g, '')

				if (res == '') {
					return undefined;
				}
				return null;
			}
			
			//if ID block
			Blockly.Blocks["ID"] = {
				init: function() {
					this.setColour(200)
					this.setOutput(true, 'ID')
					this.appendDummyInput()
						.appendField(new Blockly.FieldTextInput('ID', id_validator), 'TEXT_INPUT');

				}
			}

			let string_validator = function(newValue) {

				let res = newValue.replace(/[^\"]*/g, '')
				if (res == '') {
					return undefined;
				}
				return null;
			}

			//if string block
			Blockly.Blocks["STRING"] = {
				init: function() {
					this.setColour(300)
					this.setOutput(true, 'STRING')
					this.appendDummyInput()
						.appendField("\"")
						.appendField(new Blockly.FieldTextInput('String', string_validator), 'TEXT_INPUT')
						.appendField("\"");
				}
			}

			let termArr = []
			termArr.push({ "kind": "block", "type": "ID" })
			termArr.push({ "kind": "block", "type": "STRING" })

			response.toolBox.contents.push({ "kind": "category", "name": "Terminals", contents: termArr })

			//Debugging toolbox
			let debugArr = []
			debugArr.push({ "kind": "block", "type": "DebugStatement" });  // Add debug_pause block here
			response.toolBox.contents.push({ "kind": "category", "name": "Debugging", contents: debugArr })
			
      		originalToolbox = response.toolBox;
			response.toolBox.contents = filterCategories(element, originalToolbox.contents);

			if (element === scenarioTab && !scenarioToolboxInjected)
			{
				scenarioWorkspace = Blockly.inject("blockly-editor2", { "toolbox": response.toolBox });
				scenarioToolboxInjected = true;
			}

			if (element === entitiesTab && !entitiesToolboxInjected)
			{
				entityWorkspace = Blockly.inject("blockly-editor", { "toolbox": response.toolBox });
				entitiesToolboxInjected = true;
			}

			if (entities != undefined) {
				entities.addEventListener("input", onEntityEditorChange);
			}

			if (scenario != undefined) {
				scenario.addEventListener("input", onScenarioEditorChange);
			}

			function onEntityWorkspaceChange(event) {
				var scenarioTabElement = document.getElementById('scenario-tab')

				if (entityWorkspace.getAllBlocks().length > 0) {
					setEnabled(scenarioTabElement);
					enabledByCodeBlocks = true;
				}
				else if (!enabledByText) {
					setDisabled(scenarioTabElement);
					enabledByCodeBlocks = false;
				}

				if (event.type == 'drag' || event.entityCode === 'selected') {
					autoGeneratedEntityBlocks = false;					
				}
				
				if (element === entitiesTab)
					runCodeForEntity(element);
			}

			function onScenarioWorkspaceChange(event) {
				if (event.type == 'drag' || event.entityCode === 'selected') {
					autoGeneratedScenarioBlocks = false;					
				}

				if (element === scenarioTab)
					runCodeForScenario(element);
			}

      		if (entityWorkspace !== undefined) {
				entityWorkspace.addChangeListener(onEntityWorkspaceChange);
			}

      		if (scenarioWorkspace !== undefined) {
				scenarioWorkspace.addChangeListener(onScenarioWorkspaceChange);
			}
		})
}

function filterCategories(element, contents) {
	if (element === entitiesTab) {
		let categories = ["Declarative Scenarios", "Imperative Scenarios"];
		return contents.filter(item => !categories.includes(item.name));
	}
	else if (element === scenarioTab) {
		let categories = ["Declarative Entities", "Imperative Entities"];
		return contents.filter(item => !categories.includes(item.name));
	}
}

function saveScenario() {
  const scenarioEditor = ace.edit("xtext-editor-scenarios");
  const scenarioContent = scenarioEditor.getValue();

  appendToConsole(`Hi: ${scenarioContent}!\n`);

  // Save the scenario content
  fetch('/save-scenario', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ content: scenarioContent })
  })
  .then(response => {
    if (response.ok) {
      appendToConsole('Scenario saved successfully!\n');
    } else {
      appendToConsole('Error saving scenario.\n');
    }
  })
  .catch(error => {
    appendToConsole('Error: An error occurred while saving the scenario.\n');
  });
}

function saveEntities() {
  const entitiesEditor = ace.edit("xtext-editor-entities");
  const entitiesContent = entitiesEditor.getValue();
  
  appendToConsole(`Hi: ${entitiesContent}!\n`);

  // Save the entities content
  fetch('/save-entities', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ content: entitiesContent })
  })
  .then(response => {
    if (response.ok) {
      appendToConsole('Entities saved successfully!\n');
    } else {
      appendToConsole('Error saving entities.\n');
    }
  })
  .catch(error => {
    appendToConsole('Error: An error occurred while saving the entities.\n');
  });
}


/*
function runScenario() {
  fetch('/run-scenario', {
    method: 'POST',
  }).then(response => {
    if (response.ok) {
      alert('Scenario running...');
    } else {
      alert('Error running scenario.');
    }
  });
}*/

document.addEventListener('DOMContentLoaded', function() {
    // Initialize console
    const consoleOutput = document.getElementById('console-output');
    const clearConsoleButton = document.getElementById('clear-console');

    // Clear console button functionality
    clearConsoleButton.addEventListener('click', function() {
        consoleOutput.textContent = '';
    });

    // Add initial message
    appendToConsole('Console ready. Click "Run Scenario" to begin.\n');
});

function appendToConsole(message) {
    const consoleOutput = document.getElementById('console-output');
    consoleOutput.textContent += message;
    consoleOutput.scrollTop = consoleOutput.scrollHeight;
}

function runScenario() {
    const consoleOutput = document.getElementById('console-output');
    consoleOutput.textContent = ''; // Clear previous output
    appendToConsole('Starting scenario execution...\n');

    const eventSource = new EventSource('/console-output');

    eventSource.onmessage = function(event) {
        appendToConsole(event.data + '\n');
    };

    eventSource.onerror = function() {
        appendToConsole('Error: Connection to server lost\n');
        eventSource.close();
    };

    eventSource.addEventListener('close', function(event) {
        appendToConsole('Execution completed\n');
        eventSource.close();
    });
}

function runScenarioInteractive() {
    const websocket = new WebSocket('ws://localhost:8081/run-scenario-interactive'); // Use ws:// for non-secure, wss:// for secure connections
    appendToConsole('Starting scenario execution...\n');
  
    websocket.onopen = function(event) {
        appendToConsole('WebSocket connection opened.\n');
        console.log("WebSocket connection opened.");
    };

    websocket.onmessage = function(event) {
        appendToConsole(event.data + '\n');
        //console.log(event.data);
        if (event.data.includes("../")) {
			updateDebugScenarioVisuals(event.data);
		}
		else if (event.data.includes("pausetag")) {
            // Call update debugging visuals
            websocket.send(prompt("Pause (breakpoint) has been hit\n\t1 - For continue\n\tanything else - For goto next step and pause"));
        }
        else if (event.data.includes("Took ")) {
            websocket.close();
        }
    };

    websocket.onclose = function(event) {
		updateDebugScenarioVisuals('');
        appendToConsole('Execution completed\n');  
        //console.log("WebSocket connection closed.");
    };

    websocket.onerror = function(error) {
        appendToConsole('Error: Connection to server lost\n');
        websocket.close();
        //console.error("WebSocket error:", error);
    };
}

// Find the target element
const textLayer = document.querySelector('.ace_layer.ace_text-layer');

// comment

function updateDebugScenarioVisuals(linetext) {
	const textLayer = document.querySelector('.ace_layer.ace_text-layer');
	if (textLayer) {
		// Get all child elements of the text layer
		const children = textLayer.children;
		
		for (let i = 0; i < children.length; i++) {
		    const child = children[i];
			child.style.backgroundColor = ''; // reset child by default
			if (child.textContent.trim() != '' && linetext.includes(child.textContent)) {
				child.style.backgroundColor = 'rgba(127, 255, 0, 0.5)';
			}
		}
	}
}

