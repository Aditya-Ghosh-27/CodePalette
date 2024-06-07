pie = "ApplePie"

# print(pie[:5])
# print(pie[0:5])

pie = "ApplePie"
# print(pie[:5])      #Slicing from Start
# print(pie[5:])      #Slicing till End
# print(pie[2:6])     #Slicing in between from 2 till 5 i.e 6 - 1


# Negative Slicing in Python

# Whenever we see any negative index like pie[:-1], it means pie[: len(pie) - 1], therefore the Output is "ApplePi"
print(pie[: -1])
print(pie[0: -3])
print(pie[-3:-1]) # this will give Pi as output
print
# print(pie[-8:])     #Slicing using negative index

for character in pie:
    print(character)