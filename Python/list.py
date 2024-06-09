l = [3, 4, 5, "Aditya", True]
# A list can have any type of data type within it
# print(l)
# print(type(l))
# print(l[0])
# print(l[1])
# print(l[2])
# print(l[3])
# print(l[4])

colors = ["Red", "Blue", "Yellow", "Green", "Purple"] 
# Negative indexing
# print(colors[-1])
# print(colors[-2])
# print(colors[-3])
# print(colors[-4])
# print(colors[-5])

# check whether an item is present in the list
colors = ["Red", "Blue", "Yellow", "Green", "Purple"]
if "Yellow" in colors:
    print("Yellow is present")
else:
    print("Yellow is absent")

if "Orange" in colors:
    print("Orange is present");
else:
    print("Orange is absent");

# printing all the elements of a particular range
animals = ["cat", "dog", "bat", "mouse", "pig", "horse", "donkey", "goat", "cow"]
# print(animals)
# print(animals[:])

marks = [1, 2, 3, "Aditya", "True", 4, 5, 6, 32, 345]
# print(marks[1: -1])  # is same as print(marks[1, len(marks) - 1]) or print(marks[1: 4])
# print(marks[1: 4: 2])

# print(marks[1: 8])
# print(marks[1: 8: 2])
# print(marks[1: 8: 3])

# List comprehension
# List = [Expression(item) for item in iterable if Condition]
# Expression: It is the item which is being iterated.
# Iterable: It can be list, tuples, dictionaries, sets, and even in arrays and strings.
# Condition: Condition checks if the item should be added to the new list or not.

names = ["Aditya", "Anindo", "Firdous", "Suvodeep", "Priyo", "Sayan", "Mohok"]
namesWith_o = [item for item in names if "o" in item]
print(namesWith_o)

lst = [i*i for i in range(10)]
print(lst)
lst = [i*i for i in range(10) if i % 2 == 0]
print(lst)