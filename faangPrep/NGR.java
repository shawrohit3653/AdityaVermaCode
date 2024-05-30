package faangPrep;
import java.util.*;
public class NGR {
public static void main(String[] args) {
	int[] arr= {6,2,5,4,5,1,6};
	int[] result=NGR(arr);
	System.out.println(Arrays.toString(result));
}

private static int[] NGR(int[] nums) {
	// TODO Auto-generated method stub
	ArrayList<Integer> arr=new ArrayList<>();
	Stack<Integer> s=new Stack<>();
	for(int i=nums.length-1;i>=0;i--)
	{
		while(!s.isEmpty() && s.peek()<=nums[i])
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
