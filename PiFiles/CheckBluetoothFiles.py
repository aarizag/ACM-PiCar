#!/usr/bin/env python3

from pathlib import Path

rightTxt = Path("/home/pi/Desktop/Bluetooth/right.txt")
leftTxt = Path("/home/pi/Desktop/Bluetooth/left.txt")
downTxt = Path("/home/pi/Desktop/Bluetooth/down.txt")
upTxt = Path("/home/pi/Desktop/Bluetooth/up.txt")

print(rightTxt.is_file())

title ="Days of The Week"
path = '/home/pi/Desktop/Bluetooth/days.txt'
days_file = open(path, 'r')
days = days_file.read()

new_path = '/home/pi/Desktop/Bluetooth/new_days.txt'
new_days = open(new_path, 'w')

new_days.write(title)
print(title)

new_days.write(days)
print(days)

days_file.close()
new_days.close()
