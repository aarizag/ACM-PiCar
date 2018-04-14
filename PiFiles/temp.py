import os

try:
    file_example = open("/home/owner/Desktop/example.txt")
    print("Hey! I found the thing!")
    os.remove("/home/owner/Desktop/example.txt")
    print("AND NOW IT'S GONE!")

except:
    print("HEY! THIS FILE DOESN'T EXIST!")
    os.mknod("/home/owner/Desktop/example.txt")
    print("BUT NOW IT DOES CAUSE IM AWESOME!")
