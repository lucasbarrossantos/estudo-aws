#!/bin/sh

sudo yum install java-11-amazon-corretto-headless -y

cd /home/ec2-user/application
sudo ./mvnw clean install

