
import java.util.*;
import java.io.*;

class Solution {

	public static void main(String[] args) {
		{
			int nums[]={3,6,9,1};
			System.out.println(maximumgap(nums));
		}
		
    public int maximumgap(int[] nums) {
            Arrays.sort(nums);
        if(nums.length < 2)
            return 0;
        int ans=nums[1]-nums[0];
        for(int i=1;i<nums.length-1;i++)
        {
            ans=Math.max(ans,nums[i+1]-nums[i]);
        }
        return ans;
    }
}