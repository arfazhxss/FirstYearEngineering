import re
def isAnagram(a,b):
    an=""
    bn=""
    for words in a:
        for elements in words:
            if elements.isalpha():
                an+=elements
    for words in b:
        for elements in words:
            if elements.isalpha():
                bn+=elements
    if (sorted(an.lower())==sorted(bn.lower())): return True
    else: return False

def main ():
    a = "I sat there with Sally"
    b = "Aha! Lithely twisters!"
    if (isAnagram(a,b)):
        print("The two strings are anagram of each other")
    else:
        print("The two strings are not anagram of each other")

if __name__ == "__main__":
    main()