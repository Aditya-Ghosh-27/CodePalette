string = input("Enter a string: ")
rev = string[::-1]
if(string == rev):
    print("Palindrome String")
else:
    print("Non Palindrome String")