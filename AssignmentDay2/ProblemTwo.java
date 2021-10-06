import java.util.*;

// Problem Statement:
//          Given an array of N distinct elements where elements are between 1 and N both inclusive, check if it is stack-sortable or not. 
//           An array A[] is said to be stack sortable if it can be stored in another array B[], using a temporary stack S.
//           The operations that are allowed on array are:
//           1.Remove the starting element of array A[] and push it into the stack.
//           2.Remove the top element of the stack S and append it to the end of array B.
//           3.If all the element of A[] can be moved to B[] by performing these operations such that array B is sorted in ascending order, 
//                then array A[] is stack sortable.


public class ProblemTwo {
    
    public static boolean StackSortableOrNot(int[] list,int size){
        Stack<Integer> s = new Stack<Integer>(); 
        int j=0;                                    // pointer and temp var to track of element at stack
        for(int i=0;i<size;i++) {                   // iterate over list and perform opperation
            if(!s.empty()){                         // if stack is not empty
                int k=s.peek();                     // temporary store the top element from stack
                while(k==j+1){                      // while pointer is to equal to that top element 
                    j=j+1;                          // keep incrementing pointer , pointing to current element
                    s.pop();                        // pop that element until stack is not empty
                    if(s.empty()) break;            // when stack is empty break the loop
                    k=s.peek();                     // keep updating the top element from stack
                } 
                if(s.empty() ) s.push(list[i]);     // if stack is empty push current element list[i] into stack
                else{ 
                    k=s.peek();
                    if(list[i]<k) s.push(list[i]); 
                    else return false; 
                } 
            } 
            else s.push(list[i]); // if stack is empty simply push current element to stack
        } 
        return true; 
    }
    
    public static void main(String[] args) {
        int[] list = new int[]{4,1,2,3};
        boolean res = StackSortableOrNot(list, list.length);
        System.out.println(res);
    }
}
