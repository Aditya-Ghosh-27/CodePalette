Shell Programming Theory

Standard Practises is to write the lower line at first of any shell program
#! /bin/bash

#! is known as "hashbang" followed by the location of the shell (which we get using the command "which bash" - gives the location of the bash executable file)

There are 2 ways to execute a shell file
1. sh hello.sh  (Output: Hello World)
2. ./hello.sh (Output: Hello World)

echo command is used to print what we write in the "" 

How to comment in shell?
-> Just start with a # symbol

How to declare a variable in Java?
-> Using the '$' symbol. 
eg:-   $a, $b are variables

How to take input?
->  echo "Enter a number: "
    read a b
    echo Entered numbers are $a and $b

How to take input on the same line?

use -p flag to take inout the 
->  read -p 'username : ' user_var

Default variable in which our input goes is REPLY variable

### Conditionals in Bash Script

Conditionals let us decide whether to perform an action or not, this decision is taken by evaluating an expression. The most basic form is:
 

      if [ expression ];

      then

            statements

      elif [ expression ];

      then

            statements

      else

            statements

      fi
 

the elif (else if) and else sections are optional
Put spaces after [ and before ], and around the operators and operands.
Expressions
An expression can be: String comparison, Numeric comparison, File operators and Logical operators and it is represented by [expression]:
Number Comparisons:

-eq - is equal to - if [ "$a" -eq "$b" ]

-ne - is not equal to - if [ "$a" -ne "$b" ]

-gt - is greater than - if [ "$a" -gt "$b" ]

-ge - is greater than or equal to - if [ "$a" -ge "$b" ]

-lt - is less than - if [ "$a" -lt "$b" ]

-le - is less than or equal to - if [ "$a" -le "$b" ]

< - is less than - (("$a" < "$b"))

<= - is less than or equal to - (("$a" <= "$b"))

> - is greater than - (("$a" > "$b"))

>= - is greater than or equal to - (("$a" >= "$b"))
Examples:
[ n1 -eq n2 ]  (true if n1 same as n2, else false)

[ n1 -ge n2 ]  (true if n1greater then or equal to n2, else false)

[ n1 -le n2 ]  (true if n1 less then or equal to n2, else false)

[ n1 -ne n2 ]  (true if n1 is not same as n2, else false)

[ n1 -gt n2 ]  (true if n1 greater then n2, else false)

[ n1 -lt n2 ]  (true if n1 less then n2, else false)
String Comparisons:

= - is equal to - if [ "$a" = "$b" ]

== - is equal to - if [ "$a" == "$b" ]

!= - is not equal to - if [ "$a" != "$b" ]

< - is less than, in ASCII alphabetical order - if [[ "$a" < "$b" ]]

> - is greater than, in ASCII alphabetical order - if [[ "$a" > "$b" ]]


-z - string is null, that is, has zero length
Examples:
[ s1 = s2 ]  (true if s1 same as s2, else false)

[ s1 != s2 ]  (true if s1 not same as s2, else false)

[ s1 ]   (true if s1 is not empty, else false)

[ -n s1 ]   (true if s1 has a length greater then 0, else false)

[ -z s2 ]   (true if s2 has a length of 0, otherwise false)
Example Script

number.sh

#!/bin/bash

      echo -n “Enter a number 1 < x < 10: "

      read num

      if [ “$num” -lt 10 ]; then

            if [ “$num” -gt 1 ]; then

                  echo “$num*$num=$(($num*$num))”

            else

                  echo “Wrong insertion !”

            fi

      else

            echo “Wrong insertion !”

      fi
string.sh

#! /bin/bash

word=a

if  [[ $word == "b" ]]
then
  echo "condition b is true"
elif [[ $word == "a" ]]
then 
  echo "condition a is true" 
else
  echo "condition is false"    
fi