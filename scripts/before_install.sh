#!/bin/sh

sudo yum install java-11-amazon-corretto-headless -y

sudo rm -r /home/ec2-user/application/target

cd /home/ec2-user/application
sudo ./mvnw clean install

