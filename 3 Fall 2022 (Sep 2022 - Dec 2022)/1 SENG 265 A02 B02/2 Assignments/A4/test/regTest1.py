# import re

# my_string = ["2\n","''''\n","something","\"\"\"\""]
# newstr=""
# for element in my_string:
#     if (re.search(r"^''''",element)!=None): continue
#     elif (re.search(r"^2",element)!=None): continue
#     elif (re.search(r"^\"\"\"\"",element)!=None): break
#     print("["+element+"]")
def vowel(c): return c.upper() in 'AEIOU'
print(list(filter(vowel, "eelgrass")))