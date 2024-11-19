Feature: New Test




Scenario: "Assembling Lego"
Given the output "light" is OFF pause
And the robot "Bob" moves to position "SENSOR_AREA"
Given the position of the robot "Assembler" is "default" pause
When the robot "Assembler" moves to position "point299"
Then the position of the robot "Assembler" is "point2"

Scenario: "Sensing object"
Given the sensor "Sensor" is active
When the robot "Bob" picks the object "Ball" pause
And the robot "Bob" moves to position "SENSOR_AREA"
Then the object "Ball" is sensed

Scenario: "PickAnd Place2"
Given the position of the robot "Rob" is "aboveObject" pause
And the gripper "gripper" is open
When the gripper "gripper" closes
And the robot "Rob" moves to position "placementLocation" with "fast" speed
And the gripper "gripper" opens
And the output "light" deactivates pause
Then the output "light" is OFF
And the position of the robot "Rob" is "placementLocation"
And the gripper "gripper" is open