from msilib.schema import Feature
from behave import when, given, then
import time
import environment as env
import os
import re
from behave.matchers import use_step_matcher
import json
from environment import *


# Specify that matchers in step decorators should be parsed as Regular Expressions
use_step_matcher("re")

def get_sister(step_str, ident, rel_pos, no_trim=False):
    if no_trim:
        return step_str.split(' ')[step_str.split(' ').index(ident)+rel_pos]
    else:
        return step_str.split(' ')[step_str.split(' ').index(ident)+rel_pos].replace('"', '')

@step('(.*)')
def step_pause(context, step_str):
    if step_str is not None and (" pause" in step_str or context.step_mode in (1,2)):
        context.step_mode = 1
        for w in step_str.split(' '):
            w = w.replace('"', '')
            if 'position' == w.lower():
                if get_sister(step_str, w.lower(), -1) == 'to':
                    context.position = get_sister(step_str, w.lower(), 1)
            try:
                get_position(w)
                context.position = w
            except:
                pass
            try: 
                get_speed(w)
                context.speed = w
            except:
                pass
            try: 
                get_acceleration(w)
                context.acceleration = w
            except:
                pass
            if 'robot' == w.lower():
                context.name = get_sister(step_str, w.lower(), 1)
            if 'is' == w.lower():
                if '"' not in get_sister(step_str, w.lower(), 1, no_trim=True):
                    is_str = []
                    is_str.append(get_sister(step_str, w.lower(), -2).capitalize() + 
                                  ' ' + 
                                  get_sister(step_str, w.lower(), -1, no_trim=True))
                    is_str.append(get_sister(step_str, w.lower(), 1))
                    context.is_str = is_str
                else:
                    context.position = get_sister(step_str, w.lower(), 1)
             

