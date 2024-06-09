def secondLargest(lst):
    if len(lst) < 2:
        return None
    
    largest = float('-inf')
    secondLargest = float('-inf')

    for item in lst:
        if item > largest:
            secondLargest = largest
            largest = item
        elif item > secondLargest and item != largest:
            secondLargest = item
        
    return secondLargest

n = int(input("Enter number of elements: "))
lst = []
print("Enter the elements: ")
for i in range(1, n+1):
    lst.append(int(input()))

secondLargest = secondLargest(lst)
print("The second largest element from the list: ", secondLargest)