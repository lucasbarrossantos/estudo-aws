#!/bin/sh

cd /home/ec2-user/application/target
sudo java -jar estudoapp.jar >/dev/null 2>&1 &
