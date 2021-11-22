#!/usr/bin/env bash

sudo rm -r /home/ec2-user/application

sudo killall java || true
exit 0