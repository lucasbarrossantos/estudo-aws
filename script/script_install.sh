#!/bin/sh
sudo rm -r /home/ec2-user/application/target

cd /home/ec2-user/application/target
sudo ./mvnw install