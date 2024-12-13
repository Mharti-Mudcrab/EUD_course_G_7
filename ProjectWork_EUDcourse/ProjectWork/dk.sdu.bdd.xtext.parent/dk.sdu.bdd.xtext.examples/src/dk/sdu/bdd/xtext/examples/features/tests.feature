Feature: New Test
 using robotic_domain

 

 Scenario: "Assembling 1" 

 Given the position of the robot "Assembler" is "default" 

 When the robot "Assembler" moves to position "point299" pause 

 Then the position of the robot "Assembler" is "point2" pause

 Scenario: "Assembling 2" 

 Given the position of the robot "Assembler" is "default" 

 When the robot "Assembler" moves to position "point299" 

 Then the position of the robot "Assembler" is "point2" 
