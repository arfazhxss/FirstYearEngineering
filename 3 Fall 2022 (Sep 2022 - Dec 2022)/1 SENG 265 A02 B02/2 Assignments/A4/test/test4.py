from reprlib import recursive_repr

class MyList(list):

    @recursive_repr()
    def __repr__(self):

        return '|'.join(map(repr, self))


m = MyList('abc')
m.append(m)
m.append('x')
print(m)