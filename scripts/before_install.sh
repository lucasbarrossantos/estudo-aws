#!/bin/sh

sudo yum install java-11-amazon-corretto-headless -y

cd /home/ec2-user/app
sudo ./mvnw clean install