from msilib.schema import Feature
from behave import when, given, then
import time
import environment as env
import os
import re
from behave.matchers import use_step_matcher

# Specify that matchers in step decorators should be parsed as Regular Expressions
use_step_matcher("re")

@then('the position (.+) the robot "([^"]+)" is "([^"]+)"( pause)?')
@given('the position (.+) the robot "([^"]+)" is "([^"]+)"( pause)?')
def step_given(context, prep, identifier, position, pause):
    if pause is not None or context.step_mode:
        if pause is None:
            print("\t\t\t=== Step mode is on and triggered a pause ===")
        else:
            print("\t\t\t=== Pause was detected ===")
        
        # could contain prompt message with context? eks: input("step_when debug pause")
        context.step_mode = input() == "1"
    #else:
        #print("\t\t\t=== No-pause in step_given ===")
    """
    joint_positions = env.get_position(position)
    if(context.receiver.getActualQ() != joint_positions):
        context.controller.moveJ(joint_positions, env.get_speed(), env.get_acceleration())
    
    """

@when('the robot "([^"]+)" moves to position "([^"]+)"( pause)?')
def step_when(context, identifier, position, pause):
    if pause is not None or context.step_mode:
        if pause is None:
            print("\t\t\t=== Step mode is on and triggered a pause ===")
        else:
            print("\t\t\t=== Pause was detected ===")
        
        # could contain prompt message with context? eks: input("step_when debug pause")
        context.step_mode = input() == "1"
    #else:
        #print("\t\t\t=== No-pause in step_when ===")
    """
    joint_position = env.get_position(position)
    controller = context.controller
    
    controller.moveJ(joint_position, env.get_speed(), env.get_acceleration())
    """
