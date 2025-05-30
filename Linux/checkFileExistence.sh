#!/bin/bash
# To check if a file exists or not

if [ -e /home/jatinkumar/error.txt]
then
   echo "File does exist"
else
   echo "File not found"
fi