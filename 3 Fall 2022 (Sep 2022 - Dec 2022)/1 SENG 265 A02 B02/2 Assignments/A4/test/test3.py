import reprlib
class Sentence:
    def __init__(self, text):
        self.text = text
        self.words = text.split()
    def __repr__(self):
        return 'Sentence(%s)' % reprlib.repr(self.text)
    def __iter__(self):
        return SentenceIterator(self.words)

class SentenceIterator:
    def __init__(self, words):
        self.words = words
        self.index = 0
    def __next__(self):
        try:
            word = self.words[self.index]
        except IndexError:
            raise StopIteration() # needed by Python to terminate a `for` loop
        self.index += 1 # update our current "position" in the sequence
        return word
    def __iter__(self):
        return self

s = Sentence("Shall I compare thee to a summer's day?")
for word in s:
    print(word)

# list(s)
# print(s.__repr__)