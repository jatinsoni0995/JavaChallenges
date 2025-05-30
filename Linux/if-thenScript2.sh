#!/bin/bash

echo 
echo "What is your name?"
echo read name
echo

echo "Hello $name sir"
echo 
echo "Do you like working in IT? (y/n)"
read like
echo

if [ $like == y ]
then
   echo "You are cool"
elif [ $like == n]
   echo "You should try IT" 
fi