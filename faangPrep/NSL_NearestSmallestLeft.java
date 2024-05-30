package faangPrep;
import java.util.*;
public class NSL_NearestSmallestLeft {
public static void main(String[] args) {
	int[] arr= {4,5,2,10,8};
	int[] result=NSL(arr);
	System.out.println(Arrays.toString(result));
}

private static int[] NSL(int[] nums) {
	// TODO Auto-generated method stub
	ArrayList<Integer> arr=new ArrayList<>();
	Stack<Integer> s=new Stack<>();
	for(int i=0;i<nums.length;i++)
	{
		while(!s.isEmpty() && s.peek()>=nums[i])
		{
			s.pop();
		}
		if(s.isEmpty())
		{
			arr.add(-1);
		}
		else {
			arr.add(s.peek());
		}
		s.push(nums[i]);
	}
	int result[]=new int[arr.size()];
	for(int i=0;i<arr.size();i++) {
		result[i]=arr.get(i);
		}
	
	
	
	return result;
}
}
