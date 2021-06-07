
import java.util.*;
import java.io.*;

class Solution {

	public static void main(String[] args) {
		{
			int cost[]={10,15,20};
			System.out.println(minCostClimbingStairs(cost));
		}
		
     public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(helper(cost ,dp, 0) , helper(cost ,dp, 1));
    }
    public int helper(int[] cost ,int[] dp, int k){
        if(k>=cost.length)
            return 0;
        if(dp[k]!=-1)
            return dp[k];
        return dp[k]= cost[k]+Math.min(helper(cost ,dp, k+1) , helper(cost ,dp, k+2));
    }
}