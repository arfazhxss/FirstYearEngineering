#!/usr/bin/env python3

# from symbol import argument
import sys
import math

if (len(sys.argv)<2):
    print("Please type proper number of inputs.")
    sys.exit(1)

def pythag(a,b):
    return math.sqrt((a**2)+(b**2))

def main():
 
    # parse the command-line arguments
    # print an error and quit if there aren't the right number

    # convert the command line arguments from strings to floats

    # print(sys.argv[0])
    # print(sys.argv[1])
    # print(sys.argv[2])
    a=float(sys.argv[1])
    b=float(sys.argv[2])
    print("Sides ", a, " and ", b, ", hypotenuse ", end="", sep="")
    print("%.4f" % pythag(a, b))


if __name__ == "__main__":
    main()
