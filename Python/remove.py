n = int(input("Enter the number of elements: "))
lst = []
print("Enter the elements: ")
for i in range(1, n+1):
    lst.append(int(input()))
unique_list = []
for item in lst:
    if item not in unique_list:
        unique_list.append(item)
print(unique_list)