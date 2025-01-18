import pyautogui as p
import emoji
import time
import datetime as dt

def type():
    for i in range(3):
    
        p.typewrite("Advance Happy Birthday Daa Kavin....!")
        p.press("Enter")

def type2():
    print("Working")

    
set_time="08:01:50 PM"
print("program start..!")

while(True):
    now=dt.datetime.now().time()
    time=now.strftime("%I:%M:%S %p")
    if(time==set_time):
        type2()
        type()
        exit()


print("program Ented..!")
