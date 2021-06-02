
import java.util.*;
import java.io.*;

class Solution {

	public static void main(String[] args) {
		{
			int grid[]={{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
			System.out.println(maxAreaOfIsland(grid));
		}
    private int n,m;
    public int helper(int i,int j,int[][] grid)
    {
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0)
            return 0;
        grid[i][j]=0;
        return 1+helper(i-1,j,grid)+helper(i,j-1,grid)+helper(i+1,j,grid)+helper(i,j+1,grid);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
        n=grid.length;
        m=grid[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                    ans=Math.max(ans,helper(i,j,grid));
            }
        }
        return ans;
    }
}