num = int(input("Enter a number: "))
temp = num
sum = 0
while temp > 0:
    rem = temp%10
    sum = (sum*10) + rem
    temp = temp//10   # use floor division instead of just plain division
if(sum == num):
    print("Palindrome Number")
else:
    print("Not Palindrome Number")