#!/bin/bash

# Prompt the user to enter the base of the triangle
echo "Enter the base of the triangle: "
read base

# Prompt the user to enter the height of the triangle
echo "Enter the height of the triangle: "
read height

# Calculate the area using bc for floating-point arithmetic
area=$(echo "scale=2; 0.5 * $base * $height" | bc)

# Output the area of the triangle
echo "The area of the triangle is: $area"

