#!/bin/bash
# Reading data from user input
# Method of passing a linux command to a variable

a=`hostname`

echo "Hello, My server name is $a"
echo "What is your name?" 
read name
echo 

echo "What is your occupation?"
read occupation
echo

echo "What is your favourite show?"
read show
echo

echo "Hello $name"
echo "Your $occupation is awesome"
echo "$show is really a very nice show"

