#!/usr/bin/env python3

# from symbol import argument
import sys
import math

if len(sys.argv) != 2:
    print("Usage: pythag3.py ")
    sys.exit(1)

for x in sys.argv:
    print("Argument: \n", x)

nameofthefile = sys.argv[0]
arguments=sys.argv[1:]

def pythag(a,b):
    return math.sqrt((a**2)+(b**2))

def main():
    print("hey so this is")


if __name__ == "__main__":
    main()
