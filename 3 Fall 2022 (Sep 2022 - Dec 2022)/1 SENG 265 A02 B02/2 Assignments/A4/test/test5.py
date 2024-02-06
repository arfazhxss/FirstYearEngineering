import reprlib
class Sentence:
    def __init__(self, text):
        self.text = text
        self.words = text.split()
    def __repr__(self):
        return 'Sentence(%s)' % reprlib.repr(self.text)
    def __iter__(self):
        for word in self.words:
            yield word
        return

s = Sentence("Shall I compare thee to a summer's day?")
print("_"*40)
it = s.__iter__()
# print(next(it))
# try:
while (it!=None):
    print(next(it))
# except:
    # print

print("-"*40)


s = Sentence("You are my sunshine, my darling sunshine.")
# for w in s:
#     print(w)
print("_"*40)
