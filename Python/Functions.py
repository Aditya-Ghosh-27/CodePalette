def name(fname, lname):
    print("Hello,", fname, lname)

# name("Tanisha", "Ghosh")

def calculateGmean(a, b):
  mean = (a*b)/(a+b)
  print(mean)

# calculateGmean(10, 11)

def greater(a,b):
  if a>b:
    print(a,"is greater than ",b)
  else:
    print(b,"is greater than ",a)

# greater(5,6)

def isLesser(a, b):
  pass # pass means if we don't write anything inside the function, then it will not give any error.

# The different types of arguements that we can provide to a function is:
# 1. Default arguements
# 2. Varible-length arguements
# 3. Keyword arguements
# 4. Required arguements


# In this case, a and b are required arguements
def average(a, b):
    print("The average is:",(a+b)/2)

average(5, 6)

def add(a = 9, b = 1):
    print("The sum is:",(a+b))
add()

# Variable length arguements
def name(*name):
    print("Hello,",name[0],name[1],name[2])
name("Aditya", "Kumar", "Ghosh")

# function with return statements
def names(fname, mname, lname):
    return "Hello, " + fname + " " +  mname + " " + lname

print(names("Adi", "Tanisha", "Tanitya"))