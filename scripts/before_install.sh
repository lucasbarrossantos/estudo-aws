#!/bin/sh

sudo yum install java-11-amazon-corretto-headless -y
pwd
sudo ./mvnw clean install