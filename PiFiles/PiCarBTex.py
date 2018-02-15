import os
import time

try:
    text_file = open("/home/owner/Desktop/example.txt")
    #PI LOCATION:
    #home/pi/Desktop/Bluetooth/example.txt
    os.remove("/home/owner/Desktop/example.txt")
    
except:
    print("THIS FILE DOES NOT EXIST, LET ME MAKE THAT FOR YOU SIR!")
    os.mknod("/home/owner/Desktop/example.txt")

while True:
    try:
        os.remove("/home/owner/Desktop/right.txt")
        break
    except:
        print("it's not here, dude...")
        time.sleep(3)  # sleep for 3 seconds
