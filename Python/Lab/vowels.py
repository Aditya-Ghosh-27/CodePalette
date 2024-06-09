string = input("Enter a string: ")
vowels = 0
consonants = 0
for char in string:
    if char in "aeiouAEIOU":
        vowels+=1
    else:
        consonants+=1

print("Vowels: ",vowels)
print("Consonants:",consonants)