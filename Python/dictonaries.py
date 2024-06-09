dic = {
    "Aditya" : "Human",
    "Spoon" : "Cutlary",
    "Graduation" : "BTECH",
    47 : "Tanisha",
    "I love her" : 3847
}

print(dic)
print(dic["Aditya"])
print(dic[47])
print(dic["I love her"])

info = {'name':'Karan', 'age':19, 'eligible':True}
print(info['name'])
print(info.get('eligible'))

# Accessing multiple values
info = {"name" : "Aditya", "age" : 20, "eligible" : True}
print(info.values())
for value in info.values():
    print(value)

# Accessing keys
info = {"name" : "Aditya", "age" : 20, "eligible" : True}
print(info.keys())
for key in info.keys():
    print(key)

# Accessing key-value pairs
info = {"name" : "Aditya", "age" : 20, "eligible" : True}
print(info.items())
for item in info.items():
    print(item)

for key, value in info.items():
    print(f"The value corresponding to the key {key} is {value}")

# Dictionary Methods
info = {'name':'Karan', 'age':19, 'eligible':True}
print(info)
info.update({'age':20})
info.update({'DOB':2001})
print(info)

# Removing items from dictionary
# clear() : removes all the items from the list

info = {'name':'Karan', 'age':19, 'eligible':True}
info.clear()
print(info)

# pop() : removes the key-value pair whose key is passed as parameter
info = {'name':'Karan', 'age':19, 'eligible':True}
info.pop('eligible')
print(info)

# popitem() : removes the last key-value pair from the list
info = {'name':'Karan', 'age':19, 'eligible':True, 'DOB':2003}
info.popitem()
print(info)

#  del keyword removes a dictionary item
info = {'name':'Karan', 'age':19, 'eligible':True, 'DOB':2003}
del info['age']
print(info)

# If key is not provided then del will remove the entire dictionary