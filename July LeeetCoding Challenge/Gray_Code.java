
import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(grayCode(n));
    }
	public List<Integer> grayCode(int n) {
        List<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<(1<<n);i++)
            l.add(i^(i>>1));
       return l;
    }
}