import time
def duration(func):
    def stopwatch(*args):
        t0 = time.perf_counter()
        result = func(*args)
        elapsed = time.perf_counter() - t0
        print('[%0.8fs]' % (elapsed))
        return result
    return stopwatch
@duration
def obtain_name(greeting):
    n = input(greeting + " What is your name? ")
    return n
@duration
def obtain_age():
    while (True):
        try:
            age = input("What is your age (in years)? ")
            age = int(age)
            return age
        except ValueError:
            print("Sorry, we need a whole number. Try again.") 
def main():
    n = obtain_name("Welcome to Bluefish Insurance Brokers.")
    a = obtain_age()
    print(n, "is", a, "years of age. Woot, I say.")
main()