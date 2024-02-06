# CSC 225: Fall 2019: Lab 6
# Python Solution
# Creator: Yichun Zhao :)

def parent(i):
    return i/2

def left(i):
    return 2*i

def right(i):
    return 2*i + 1

# Heapify to maintain heap property
def max_heapify(arr, i, curr_heap_size):
    i_largest = -1
    iL = left(i)
    iR = right(i)
    
    # Find largest key out of the current key at i and its two children
    if (iL <= curr_heap_size) and (arr[iL-1] > arr[i-1]):
        i_largest = iL
    else: 
        i_largest = i
    if (iR <= curr_heap_size) and (arr[iR-1] > arr[i_largest-1]):
        i_largest = iR
    
    # If key at i is not the largest
    if (i_largest != i):
        # Swap key at i and key at i_largest
        temp = arr[i-1]
        arr[i-1] = arr[i_largest-1]
        arr[i_largest-1] = temp
        
        # If key at i is changed, go down the tree to continue to maintain property
        # The new i is i_largest! Because key at i_largest is not the largest anymore after swapping.
        max_heapify(arr, i_largest, curr_heap_size)

# To start building a max heap, we convert the input array to a heap by maintaining heap property
def build_max_heap(arr, curr_heap_size):
    # We need to maintain heap property by using a for loop and calling max_heapify
    # For loop starts from middle of array down to 1 because we do not need to care about leaves!
    # Remember, the assumption is that both left subtrees and right subtrees are already max heaps. 
    i_middle = len(arr)//2
    for i in range(i_middle, 1-1, -1):
        max_heapify(arr, i, curr_heap_size)

def heap_sort(arr):
    # We need to define the current heap size, which is decreasing as we sort 
    curr_heap_size = len(arr)
    
    # Build the heap in arr first
    build_max_heap(arr, curr_heap_size)
    
    # In each iteration, we put current max in the correct position by swapping, 
    # reduce the heap size, and then fix the heap property
    for i in range(len(arr), 2-1, -1):
        # Put max in correct position
        temp = arr[1-1]
        arr[1-1] = arr[i-1]
        arr[i-1] = temp
        
        # Reduce heap size by 1
        curr_heap_size -= 1
        
        # Maintain heap property
        max_heapify(arr, 1, curr_heap_size)

# TESTS
print("----------------------------------------------------")
arr1 = [3, 2, 7, 9, 1, 19, 3, 2, 99, 11, 100, 0, 1, 2, 5, 4554634, 3.5]
print(arr1)
heap_sort(arr1)
print("Sorted: ", arr1)

# Yikes