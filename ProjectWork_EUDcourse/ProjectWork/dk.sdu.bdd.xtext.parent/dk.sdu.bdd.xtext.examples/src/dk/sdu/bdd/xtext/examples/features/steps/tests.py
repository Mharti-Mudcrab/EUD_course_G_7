from msilib.schema import Feature
from behave import when, given, then
import time
import environment as env
import os
from prompt_toolkit import input


@then('the position {prep} the robot "{identifier}" is "{position}" {pause}')
@given('the position {prep} the robot "{identifier}" is "{position}" {pause}')
def step_given(context, identifier : str, position, prep, pause):
    if (pause == "pause"):
        print("\t\t\t=== Pause in step_given ===")
        s = input() # could contain prompt message with context? eks: input("step_when debug pause")
        # Use s to determine wether to run from now on or step?
    else:
        print("\t\t\t=== No pause in step_given ===")
    """
    joint_positions = env.get_position(position)
    if(context.receiver.getActualQ() != joint_positions):
        context.controller.moveJ(joint_positions, env.get_speed(), env.get_acceleration())
    
    """


@when('the robot "{identifier}" moves to position "{position}" {pause}')
def step_when(context, identifier : str, position, pause):
    if (pause == "pause"):
        print("\t\t\t=== Pause in step_when ===")
        s = input() # could contain prompt message with context? eks: input("step_when debug pause")
        # Use s to determine wether to run from now on or step?
    else:
        print("\t\t\t=== No pause in step_when ===")
    """
    joint_position = env.get_position(position)
    controller = context.controller
    
    controller.moveJ(joint_position, env.get_speed(), env.get_acceleration())
    """
