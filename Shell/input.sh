#! /bin/bash

echo "Enter a number: "
read number
echo Entered number is $number
echo "Enter 3 names: "
read name1 name2 name3
echo "The names are $name1, $name2, $name3"

read -p "Enter name: " name
read -sp "Enter password: " password
echo "Name is: $name"
echo "Password : $password"

echo "Enter names: " 
read -a names
echo ${names[0]}, ${names[1]}

echo "Enter name: "
read
echo "Name: $REPLY"

