
import java.util.*;
import java.io.*;

class Solution {

	public static void main(String[] args) {
		{
			int  matchsticks[]={1,1,2,2,2};
			System.out.println(makesquare(matchsticks));
		}
        //backtracking technique is used
    public boolean helper(int i,int[] matchsticks,int s1,int s2,int s3,int s4)
    {
        if(s1==0 && s2==0 && s3==0 && s4==0)
            return true;
        if(s1<0 || s2<0|| s3<0|| s4<0)
            return false;
        if(i<0)
            return true;
        
            return (helper(i-1,matchsticks,s1-matchsticks[i],s2,s3,s4) || helper(i-1,matchsticks,s1,s2-matchsticks[i],s3,s4) || helper(i-1,matchsticks,s1,s2,s3-matchsticks[i],s4) || helper(i-1,matchsticks,s1,s2,s3,s4-matchsticks[i]));
    }
    
    public boolean makesquare(int[] matchsticks) {
        int n=matchsticks.length;
        int su=0;
        for(int i=0;i<n;i++)
        {
            su+=matchsticks[i];
        }
        if(su%4!=0)
            return false;
        
        return helper(n-1,matchsticks,su/4,su/4,su/4,su/4);
    }
}