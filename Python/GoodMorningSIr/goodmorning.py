import time
timestamp = time.strftime('%H:%M:%S')
print(timestamp)
timestamp = time.strftime('%H')
print(timestamp)
t = int(timestamp)
if(t >= 1 and t <= 10):
    print("Good Morning")
elif(t > 10 and t <= 16):
    print("Good afternoon")
elif(t > 16 and t <= 20):
    print("Good evening")
# timestamp = time.strftime('%M')
# print(timestamp)
# timestamp = time.strftime('%S')
# print(timestamp)