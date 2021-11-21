#!/bin/sh
sudo yum install java-11-amazon-corretto

cd /home/ec2-user/application
sudo ./mvnw install