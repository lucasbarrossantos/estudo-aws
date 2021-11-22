#!/bin/sh

sudo yum install java-11-amazon-corretto-headless -y
pwd
ls -la
sudo ./mvnw clean install