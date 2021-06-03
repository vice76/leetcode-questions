
import java.util.*;
import java.io.*;

class Solution {

	public static void main(String[] args) {
		{
			String s1="aabcc" , s2="dbbca" , s3="aadbbcbcac" ;
			System.out.println(isInterleave(s1,s2,s3));
		}
    public boolean isInterleave(String s1, String s2, String s3) {
        int n=s1.length();
        int m=s2.length();
        int fin=s3.length();
        boolean dp[][]=new boolean[n+1][m+1];
        if((n+m)!=fin)
            return false;
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        char ch3[]=s3.toCharArray();
        for(int i=0;i<=n;i+=1)
        {
            for(int j=0;j<=m;j+=1)
            {
                if(i==0 && j==0)
                    dp[i][j]=true;
                else if(i==0)
                    dp[i][j]=dp[i][j-1] && ch2[j-1]==ch3[j-1];
                else if(j==0)
                     dp[i][j]=dp[i-1][j] && ch1[i-1]==ch3[i-1];
                else
                    dp[i][j]=(dp[i][j-1] && ch2[j-1]==ch3[i+j-1]) || (dp[i-1][j] && ch1[i-1]==ch3[i+j-1]);
            }
        }
        return dp[n][m];
    }
}