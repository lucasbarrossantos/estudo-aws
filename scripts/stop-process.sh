#!/bin/bash

ps -ef | grep estudoapp.jar | grep -v grep | awk '{print $2}' | xargs kill