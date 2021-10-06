// Problem Statement :
//      Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. 
//      Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
//      1. Each student gets exactly one packet.
//      2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.


public class ProblemOne {
    public static void Sort(int[] list,int n){
        int i,j,k;
        for(i=1;i<n;i++){
            k = list[i];
            j = i-1;
            while(j>=0 && list[j]>k){
                list[j+1] = list[j];
                j -= 1;
            }
            list[j+1] = k;
        }
    }
    //Sliding window technique, Complexity O(nlogn)
    public static int FindMinDifference(int[] list,int m){
        int minDiff=Integer.MAX_VALUE;
        int i=0;
        int j = i+m-1;
        Sort(list, list.length);
        while(j<list.length){
            if((list[j]-list[i])<minDiff) minDiff = list[j]-list[i];
            i += 1;
            j += 1;
        }
        return minDiff;
    }
    public static void main(String[] args) {
        int m=3;
        int [] list = new int[] {8,5,6,2,6,1,7,9};
        int result = FindMinDifference(list,m);
        System.out.println("Min Dif "+ result);
    }
}
