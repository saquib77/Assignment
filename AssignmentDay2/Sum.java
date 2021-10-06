import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Problem Statement
// Find Complexity of Sum of number in a list

public class Sum {

    public static int Soe(int[] list){
        int sum=0;
        for(int i=0;i<list.length;i++){
            sum = sum + list[i];
        }
        return sum;
    }

// Complexity : O(n)
// For loop run for every element 
// loop will run n times



    public static void main(String[] args) {
        int [] list = new int[]{1,2,3,4,5,6,7};
        System.out.println(Soe(list));
    }
}


