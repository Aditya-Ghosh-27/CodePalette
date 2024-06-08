n = int(input("Enter a number: "))
flag = 0
if(n <= 1):
    print("Not a prime number")
else:
    for i in range(2, int(n ** 0.5)+1):
        if n % i == 0:
            flag = 1
            break
    if(flag == 1):
        print("Not a prime number")
    else:
        print("Prime Number")