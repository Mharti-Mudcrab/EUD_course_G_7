@specificFeature
Feature: Specific Feature	
	Scenario: "Assembling Lego"
		Given the position of the robot "Assembler" is "default" pause
		When the robot "Assembler" moves to position "point2" pause
		Then the position of the robot "Assembler" is "point2"
		
	Scenario: "Assembling Lego2"
		Given the position of the robot "Assembler" is "default"
		When the robot "Assembler" moves to position "point2" pause
		Then the position of the robot "Assembler" is "point2"
		          