print("-"*40)
m = 10
f = 10.0
print(type(m)) # print the type-class returned for value of m
print(type(f)) # print the type-class returned for value of f
print("-"*40)
f_converted = type(m)(f) # type(m) is an object; type(m)(f) calls a type-constructor with value of f
m_converted = type(f)(m) # type(f) is an object; type(f)(m) calls a type-constructor with value of m
print(type(f_converted))
print(type(m_converted))
print("-"*40)

class ArithmeticProgression:
    def __init__(self, begin, step, end=None):
        self.begin = begin
        self.step = step
        self.end = end # None implies an
    # "infinite sequence/series"
    def __iter__(self):
        result = type(self.begin + self.step)(self.begin)
        forever = self.end is None
        index = 0
        while forever or result < self.end:
            yield result
            index += 1
            result = self.begin + self.step * index
print("-"*40)

cardinal = ArithmeticProgression(0, 1.0)
cc = iter(cardinal)
for _ in range(1000000000):
    p = next(cc)
print(p)
print("-"*40)
