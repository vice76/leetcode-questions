
import java.util.*;
import java.io.*;

class Solution {

	public static void main(String[] args) {
		{
			int n=6,k=2;
			int speed[]={2,10,3,1,5,8};
			int efficiency[]={5,4,3,9,7,2};
			System.out.println(maxPerformance(n,speed,efficiency,k));
		}
		
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int both[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            both[i]=new int[] {efficiency[i], speed[i]}; 
        }
        Arrays.sort(both,(p1,p2) -> (p2[0]-p1[0]));
        // for(int i=0;i<n;i++)
        // System.out.println(both[i][0]+" "+both[i][1]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long totsum=0,max=0;
        for(int i=0;i<n;i++)
        {
            if(pq.size() >= k)
                totsum -=pq.remove();
            pq.add(both[i][1]);
            totsum+=both[i][1];
            max=Math.max(totsum*both[i][0],max);
        }
        return (int)(max% 1000000007);
    }
}