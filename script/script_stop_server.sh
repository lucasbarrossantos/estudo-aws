#!/usr/bin/env bash

cd /opt/codedeploy-agent/deployment-root/4b5b10a8-640d-4959-bb38-7abf28ccbb20
sudo rm -r d-* || true

sudo rm -r /home/ec2-user/application || true

sudo killall java
exit 0