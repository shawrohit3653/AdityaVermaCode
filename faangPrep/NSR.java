package faangPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NSR {
	public static void main(String[] args) {
		int[] arr= {4,5,2,10,8};
		int[] result=NSR(arr);
		System.out.println(Arrays.toString(result));
	}

	private static int[] NSR(int[] nums) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<>();
		Stack<Integer> s=new Stack<>();
		for(int i=nums.length-1;i>=0;i--)
		{
			while(!s.isEmpty() && s.peek()>=nums[i])
			{
				s.pop();
			}
			if(s.isEmpty())
			{
				arr.add(-1);
			}
			else
			{
				arr.add(s.peek());
			}
			s.push(nums[i]);
		}
		int result[]=new int[arr.size()];
		for(int i=0;i<arr.size();i++)
		{
			result[i]=arr.get(arr.size()-1-i);
		}
		
		return result;
	}
}
