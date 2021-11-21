#!/bin/sh
cd /home/ec2-user/application/target/target
sudo java -jar estudoapp.war > /dev/null 2> /dev/null < /dev/null &