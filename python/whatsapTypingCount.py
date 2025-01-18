import pyautogui as p
import time


n=int(input("Enter the Count:"))

print("program Started in 5 sec..!")

time.sleep(5) # Sleep for 3 seconds

for i in range(n):
        p.typewrite("Happy Birthday Daa Kavin....!")
       # time.sleep(2)
        p.press("Enter")
       # time.sleep(2)


print("program Ented..!")
