import collections # Part of base Python
Card = collections.namedtuple('Card', ['rank', 'suit'])
class AnotherFrenchDeck: # The card deck you know and love was invented in France
    ranks = [str(n) for n in range(2, 11)] + list("JQKA")
    suits = "spades hearts diamonds clubs".split()
    def __init__(self):
        self._cards = [Card(rank, suit) for suit in self.suits for rank in self.ranks]
    def __len__(self):
        return len(self._cards)
    def __getitem__(self, position):
        return self._cards[position]

def main():
    deck = AnotherFrenchDeck()
    print("-" * 40)
    from random import choice
    print(choice(deck))
    print(choice(deck))
    print("-" * 40)

main()
