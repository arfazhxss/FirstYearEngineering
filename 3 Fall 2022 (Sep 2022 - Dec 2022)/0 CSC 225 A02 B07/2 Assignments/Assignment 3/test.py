def weird_equal(a,b,n): #function with parameter list a and list b and integer n
    if (n%2!=0): #if length is odd
        c=0
        for i in range(n): #loop for all elements in list
            if a[i]!=b[i]: #compare corresponding indices elements
                c=1 #if any of the elements are not same
        if (c==0): #if the value of c is 0 means all the corresponding elements are same
            return True #return True
        else:
            return False #return False
    else: #if length is even
        c=0
        for i in range(n): #loop for all elements in list
            if a[i]!=b[i]: #compare corresponding indices elements
                c=1 #if any of the elements are not same
        if (c==0): #if the value of c is 0 means all the corresponding elements are same
            return True #return True
        else:
            print(">>>\tisWeirdEqual checking between ", a, " and ",b)
            a1=[a[i] for i in range(0,int(n/2))] #first half part of list a
            a2=[a[i] for i in range(int(n/2),n)] #second half part of list a
            b1=[b[i] for i in range(0,int(n/2))] #first half part of list b
            b2=[b[i] for i in range(int(n/2),n)] #second half part of list b
            
            if weird_equal(a1,b1,int(n/2)) and weird_equal(a2,b2,int(n/2)): #recalling function
                print(">>>\t\tinP1 matched")
                print(">>>\t\t\ta1=",a1)
                print(">>>\t\t\ta1=",a2)
                print(">>>\t\t\ta1=",b1)
                print(">>>\t\t\ta1=",b2)
                return True #if both are True return True
            elif weird_equal(a1,b1,int(n/2)) and weird_equal(a1,b2,int(n/2)): #recalling function
                print(">>>\t\tinP2 matched")
                print(">>>\t\t\ta1=",a1)
                print(">>>\t\t\ta1=",a2)
                print(">>>\t\t\ta1=",b1)
                print(">>>\t\t\ta1=",b2)
                return True #if both are True return True
            elif weird_equal(a2,b2,int(n/2)) and weird_equal(a2,b1,int(n/2)): #recalling function
                print(">>>\t\tinP3 matched")
                print(">>>\t\t\ta1=",a1)
                print(">>>\t\t\ta1=",a2)
                print(">>>\t\t\ta1=",b1)
                print(">>>\t\t\ta1=",b2)
                return True #if both are True return True
            else:
                return False #if all conditions are false return False
    #n=5
    #a=[10,11,5,19,11]
    #b=[10,11,5,19,11]
f=open("TestCases/input/input03.txt","r") #opening input file for values of n,a,b
n=int(f.readline()) #reading first line and take value from that line and change it to integer by using int()
a=list(f.readline().split()) #reading second line and take all values with space separated by using split() split the values and store it in list
b=list(f.readline().split()) #reading third line and take all values with space separated by using split() split the values and store it in list
f.close() #closing file
print("Array1: ",a)
print("Array2: ",b,"\n")
if (weird_equal(a,b,n)): #calling function
    print("YES")
else:
    print("NO")