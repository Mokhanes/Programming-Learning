import datetime

# get the current system time
now = datetime.datetime.now().time()

# format the time as HH:MM:SS
time= now.strftime("%I:%M %p")

# print the system time
print("The current system time is:", time)
