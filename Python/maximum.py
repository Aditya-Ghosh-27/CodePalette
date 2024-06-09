def max(lst):
    if not lst:
        return None
    
    max_Number = lst[0]
    for item in lst:
        if max_Number < item:
            max_Number = item
    
    return max_Number

n = int(input("Enter the number of elements: "))
lst = []
print("Enter the elements: ")
for i in range(1, n+1):
    lst.append(int(input()))

max_Number = max(lst)
print("The largest number from the list is: ",max_Number)