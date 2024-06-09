tup = (1, 5, 6, "green", True)
print(type(tup), tup)

# if it was tup = (1)
# then print(type(tup)) would print class 'int
# to avoid that, write like tup = (1, )

print(tup[0])
if 6 in tup:
    print("yes 6 is present in tuple")

tup2 = tup[1: 4]
print(tup2)