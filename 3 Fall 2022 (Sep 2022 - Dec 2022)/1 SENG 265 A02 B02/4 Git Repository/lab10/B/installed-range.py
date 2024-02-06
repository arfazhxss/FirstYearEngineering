#!/usr/bin/env python3

import re
import sys

def main():
    if len(sys.argv) < 3:
        sys.exit(0)

    date_from = sys.argv[1]
    date_to   = sys.argv[2]

    pattern = re.compile(r" installed ((.+):(.+)) .*")

    for line in sys.stdin:
        line = line.rstrip()

        m = pattern.search(line)
        if m:
            print("%d: %s" % (999, m.group(2)))

if __name__ == "__main__":
    main()
