#!/bin/sh
cd /home/ec2-user/application/target
sudo ./mvnw spring-boot:run > /dev/null 2> /dev/null < /dev/null &