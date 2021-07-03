
import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        int k=4,x=3;
        System.out.println(findClosestElements(arr,k,x));
    }
    //Solution -1
	public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> l1 = new ArrayList<Integer>();
        int L=0,R=arr.length-1;
        while(R - L >= k){
            if (x - arr[L] <= arr[R] - x) R--;
            else L++;
        }
        for (int i =L ; i <= R ; i++){
            l1.add(arr[i]);
        }
        return l1;
    }


    //SOLUTION -2
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int L=0;
        int R=arr.length-k;
        while( L < R){
            int mid=(L+R)/2;
            if(x-arr[mid] > arr[mid+k]-x)
                L=mid+1;
            else
                R=mid;
        }
        List<Integer> l1 =new ArrayList<Integer>();
        for(int i=L;i<L+k;i++)
            l1.add(arr[i]);
        return l1;
    }
}