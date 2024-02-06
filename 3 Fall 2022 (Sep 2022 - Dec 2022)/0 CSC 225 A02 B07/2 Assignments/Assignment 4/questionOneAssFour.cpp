#include <iostream>
#include <stack> 
using namespace std; 
  
stack<int> sortStack(stack<int> input){ 
    stack<int> tmpStack; 
    while(!input.empty()){ 
        int tmp = input.top(); 
        input.pop(); 
        cout << "sortStack_1 Item popped :\t" << tmp << "\n";
  
        while (!tmpStack.empty() && tmpStack.top() < tmp){ 
            cout << "\tsortStack_2 inside WhileLoop, top of tmpStack is :\t" << tmpStack.top() << "\n";
            input.push(tmpStack.top()); 
            tmpStack.pop(); 
        } 
  
        tmpStack.push(tmp); 
    } 
  
    return tmpStack; 
} 
  
void sortUsingStack(int arr[], int n){ 
     
    stack<int> input; 
    for(int i=0; i<n; i++){ 
       input.push(arr[i]); 
    }
  
    stack<int> tmpStack = sortStack(input); 
  
    for(int i=0; i<n; i++){ 
        arr[i] = tmpStack.top(); 
        tmpStack.pop(); 
    } 
} 
  
int main(){ 
    int a[] = {2, 30, -5, 43, 100}; 
    cout << "Before Storm\n";
    int n = sizeof(a)/sizeof(a[0]); 
    for(int i=0; i<n; i++) 
       cout << a[i] << " "; 
    cout << "\n\n";
    sortUsingStack(a, n); 
    
    cout << "\n\nAfter Storm\n";
    for(int i=0; i<n; i++) 
       cout << a[i] << " "; 
    cout << "\n\n";
    return 0; 
}