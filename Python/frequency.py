n = int(input("Enter the number of elements: "))
lst = []
print("Enter the elements: ")
for i in range(1, n+1):
    lst.append(int(input()))
c = int(input("Enter the element whose frequency you want: "))
print("Frequncey is: ",lst.count(c))