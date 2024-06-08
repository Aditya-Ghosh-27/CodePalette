n = int(input("Enter rows: "))
for i in range(1, n+1):
    for k in range(n - i):
        print(" ", end = "")
    for j in range(1, 2*i):
        print("*", end = "")
    print(" ")

