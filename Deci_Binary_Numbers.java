
import java.util.*;
import java.io.*;

class Solution {

	public static void main(String[] args) {
		{
			String s="32";
			System.out.println(minPartitions(s));
		}
		
    public int minPartitions(String n) {
        int f=0;
        if(n.contains('9'+""))
        {
            f=9;
        }
        else if(n.contains('8'+""))
        {
            f=8;
        }
        else if(n.contains('7'+""))
        {
            f=7;
        }else if(n.contains('6'+""))
        {
           f=6;
        }else if(n.contains('5'+""))
        {
            f=5;
        }else if(n.contains('4'+""))
        {
            f=4;
        }else if(n.contains('3'+""))
        {
            f=3;
        }else if(n.contains('2'+""))
        {
            f=2;
        }else if(n.contains('1'+""))
        {
            f=1;
        }
        return f;
    }
}