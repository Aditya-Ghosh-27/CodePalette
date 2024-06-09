n = int(input("Enter the number of elements: "))
lst = []
print("Enter the elements: ")
for i in range(1, n+1):
    lst.append(int(input()))

reversed_list = []
reversed_list = lst[:: -1]
print(reversed_list)