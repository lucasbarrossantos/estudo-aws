#!/bin/bash

ps -ef | grep estudoapp.war | grep -v grep | awk '{print $2}' | xargs kill