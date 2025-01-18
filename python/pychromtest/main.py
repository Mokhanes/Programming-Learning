li=['t','i','e','y']
value=input("Enter the Element to check:")
o=int(input("Enter by using index_fun(1) or for_loop(2):"))
if(o==1):
   index=li.index(value)
else:
    len=len(li)
    for i in (0,3):
        if(value==li[i]):
            index=i
            break
        else:
            index=-1
print("The Idex possecsion is:",index)