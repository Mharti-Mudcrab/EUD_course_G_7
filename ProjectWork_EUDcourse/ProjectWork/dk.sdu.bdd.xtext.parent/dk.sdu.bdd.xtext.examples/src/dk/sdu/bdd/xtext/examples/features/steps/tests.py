from msilib.schema import Feature
from behave import when, given, then
import time
import environment as env
import os
import re
from behave.matchers import use_step_matcher

# Specify that matchers in step decorators should be parsed as Regular Expressions
use_step_matcher("re")

def test_for_pause(context, pause):
    if pause is not None:
        context.step_mode = 1
        
def save_step_details_for_print(context, identifier, position):
    context.identifier = identifier
    context.position = position

@then('the position (.+) the robot "([^"]+)" is "([^"]+)"( pause)?')
@given('the position (.+) the robot "([^"]+)" is "([^"]+)"( pause)?')
def step_given(context, prep, identifier, position, pause):
    test_for_pause(context, pause)
    save_step_details_for_print(context, identifier, position)
    
    """
    joint_positions = env.get_position(position)
    if(context.receiver.getActualQ() != joint_positions):
        context.controller.moveJ(joint_positions, env.get_speed(), env.get_acceleration())
    
    """

@when('the robot "([^"]+)" moves to position "([^"]+)"( pause)?')
def step_when(context, identifier, position, pause):
    test_for_pause(context, pause)
    save_step_details_for_print(context, identifier, position)

    """
    joint_position = env.get_position(position)
    controller = context.controller
    
    controller.moveJ(joint_position, env.get_speed(), env.get_acceleration())
    """