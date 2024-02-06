#!/usr/bin/env python3

import sys

if (len(sys.argv)<2):
    print("Please type proper number of inputs.")
    sys.exit(1)


def main():
    s = sys.argv[1]
    strlists=s.split(",")
    
    for x in strlists:
        print("{",x, "}")


if __name__ == "__main__":
    main()
