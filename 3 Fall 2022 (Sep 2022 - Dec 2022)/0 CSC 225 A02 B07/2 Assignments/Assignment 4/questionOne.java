import java.util.Stack;
  
public class questionOne {
    public static Stack<Integer> stackSort (Stack<Integer> input){ 
        Stack<Integer> tempStack = new Stack<Integer>(); 
        while(!input.empty()) { 
            int tmp = input.peek(); 
            input.pop(); 
            while (!tempStack.empty() && tempStack.peek() < tmp){ 
                input.push(tempStack.peek()); 
                tempStack.pop(); 
            } 
      
            tempStack.push(tmp); 
        } 
      
        return tempStack; 
    } 
      
    public static void arrToStackSort(int arr[], int n){ 
        Stack<Integer> input = new Stack<Integer>(); 
        for(int i=0; i<n; i++){input.push(arr[i]);}
      
        Stack<Integer> tempStack = stackSort(input); 
        for(int i=0; i<n; i++){ 
            arr[i] = tempStack.peek(); 
            tempStack.pop(); 
        } 
    } 
      
    public static void main(String[] args) { 
        int a[] = {5,7,0,3,4,2,6,1}; 
        
        System.out.println("Before Storm");
        int n = a.length;
        for(int i=0; i<n; i++) {System.out.print(a[i]+" ");}
        System.out.println("\nStorm Ends");
        
        arrToStackSort (a, n); 
        
        System.out.println("\n\nAfter Storm");
        for(int i=0; i<n; i++) {System.out.print(a[i]+" ");}
        System.out.println("\nStorm Ends");
    }
}