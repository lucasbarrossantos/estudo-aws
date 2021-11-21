#!/bin/sh
sudo rm -r /home/ec2-user/application

cd /home/ec2-user/application
sudo ./mvnw install