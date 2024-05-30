package faangPrep;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;

public class NGL_Stack {
public static void main(String[] args) {
	int arr[]= {1,3,2,4};
	int[] result=NGl(arr);
	System.out.println(Arrays.toString(result));
	
}
public static int[] NGl(int[] nums)
{
	ArrayList<Integer> arr=new ArrayList<>();
	Stack<Integer> s=new Stack<>();
	for(int i=0;i<nums.length;i++)
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
	int[] result=new int[arr.size()];
	for(int i=0;i<arr.size();i++)
	{
		result[i]=arr.get(i);
	}
	return result;
	
	
}
}
