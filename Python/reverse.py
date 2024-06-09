string = input("Enter a string: ")
rev = string[::-1]
if(rev == string):
    print("Palindrome string")
else:
    print("Not a palindrome string")