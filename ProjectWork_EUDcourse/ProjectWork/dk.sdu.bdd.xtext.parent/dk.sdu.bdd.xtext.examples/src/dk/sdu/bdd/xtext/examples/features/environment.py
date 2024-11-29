import os
import json
from msilib.schema import Feature
from pyexpat import features
from behave import fixture
import rtde_receive
import rtde_control
import rtde_io
from logic.sdu_robotics.robotiq_gripper_control import RobotiqGripper
from behave.model import Scenario
from pyspark.resource import information
import math

# Dynamically find the path to Environment.json
current_dir = os.path.dirname(os.path.abspath(__file__))
json_file_path = os.path.join(current_dir, 'Environment.json')




# Check if the file exists
if not os.path.exists(json_file_path):
    raise FileNotFoundError(f"File not found: {json_file_path}")

with open(json_file_path) as f:
    data = json.load(f)

def before_all(context):
    if not hasattr(context, "step_mode"):
        context.step_mode = 0
    """
    print("Setting up Environment...")

    ip = get_robot_ip()
    
    # Initialize interfaces
    context.controller = rtde_control.RTDEControlInterface(ip)
    context.receiver = rtde_receive.RTDEReceiveInterface(ip)
    context.io = rtde_io.RTDEIOInterface(ip)
    
    """

    # Initialize gripper
    """
    context.gripper = RobotiqGripper(context.controller)
    context.gripper.activate()
    context.gripper.set_speed(get_gripper_speed())
    context.gripper.set_force(get_gripper_force())
    """

def before_feature(context, feature): 
    #context.controller.moveJ(get_position("default"), get_speed(), get_acceleration())
    pass

def after_feature(context, feature):
    pass

def before_scenario(context, scenario): 
    pass

def after_scenario(context, scenario):
    pass

def before_step(context, step):
    pass
    
def after_step(context, step):
    if context.step_mode in [1, 2]:
        if context.step_mode == 1:
            print("\t\t=== Pause was detected === pausetag")
        elif context.step_mode == 2:
            print("\t\t=== Step mode is on and triggered a pause === pausetag")
        
        #print all robot information here
        print(get_robot_information(context))
        clear_robot_information(context)
                
        if input() == '1':
            context.step_mode = 2
        else:
            context.step_mode = 0
    #else:
        #print("\t\t\t=== No-pause in step_when ===")
            
        

def to_degrees_str(radian_list):
    degrees = [round(math.degrees(radian), 2) for radian in radian_list]
    return ", ".join(f"J{i+1}: {angle}" for i, angle in enumerate(degrees))

def clear_robot_information(context):
    if hasattr(context, "name"):
        context.name = ''   
    if hasattr(context, "position"):
        context.position = ''
    if hasattr(context, "speed"):
        context.speed = ''
    if hasattr(context, "acceleration"):
        context.acceleration = ''
    if hasattr(context, 'is_str'):
        context.is_str = ''

def get_robot_information(context):
    information_string = "\t\tThe robot information at the current step is:\n"
    if hasattr(context, "name") and context.name != '':
        information_string += f"\t\t\tRobot name:\t\t{context.name}\n"     
    if hasattr(context, "position") and context.position != '':
        information_string += f"\t\t\tPosition:\t\t{context.position}\n" 
    if hasattr(context, "speed") and context.speed != '':
        information_string += f"\t\t\tSpeed:\t\t\t{context.speed}\n"
    if hasattr(context, "acceleration") and context.acceleration != '':
        information_string += f"\t\t\tAcceleration:\t\t{context.acceleration}\n"
    if hasattr(context, "is_str") and context.is_str != '':
        information_string += f"\t\t\t{context.is_str[0]}:\t\t{context.is_str[1]}\n"
    return information_string

# Get coordinate-location based on configured name
def get_position(name):
    locations = data["Positions"]
    coordinate = locations[name]

    return coordinate

# Get speed based naming (if not set, returns moderately)
def get_name():
    name = data["Robot"]["name"]
    return name

# Get speed based naming (if not set, returns moderately)
def get_speed(identifier="moderate"):
    speed = data["Speeds"][identifier]["speed"]
    return speed

# Get acceleration based naming (if not set, returns moderately)
def get_acceleration(identifier="moderate"):
    acceleration = data["Speeds"][identifier]["acceleration"]
    return acceleration

# Get IP-address of robot based on configured name
def get_robot_ip():
    ip = data["Robot"]["IP"]
    return ip

# Get coordinate-location based
