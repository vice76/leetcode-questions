
import java.util.*;
import java.io.*;

class Solution {

	public static void main(String[] args) {
		{
			int nums[]={100,4,200,1,3,2};
			System.out.println(longestConsecutive(nums));
		}
    
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Arrays.sort(nums);
        int max=1,c=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                if(nums[i]==(nums[i-1]+1))
                    c+=1;
                else
                {
                    max=Math.max(max,c);
                    c=1;
                }
            }
        }
        return Math.max(max,c);
    }
}