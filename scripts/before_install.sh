#!/bin/sh

sudo yum install java-11-amazon-corretto-headless -y

sudo ./mvnw clean install