
import java.util.*;
import java.io.*;

class Solution {

	public static void main(String[] args) {
		{
			System.out.println(Arrays.toString(countBits(5)));
		}
    public int[] countBits(int n) {
        int c[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            c[i]=c[i/2]+(i%2);
        }
        return c;
    }
}