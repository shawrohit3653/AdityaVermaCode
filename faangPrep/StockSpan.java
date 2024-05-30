package faangPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
public static void main(String[] args) {
	int arr[]= {100,80,60,70,60,75,85};
	int[] result=NGl(arr);
	System.out.println(Arrays.toString(result));
	
	
}
public static int[] NGl(int[] nums)
{
	ArrayList<Integer> arr = new ArrayList<>();
    Stack<Pair<Integer, Integer>> s = new Stack<>();

    for (int i = 0; i < nums.length; ++i) {
        while (!s.isEmpty() && s.peek().getKey() <= nums[i]) {
            s.pop().getValue();
        }
        if (s.isEmpty()) {
            arr.add(-1);
        } else {
            arr.add(s.peek().getValue());
        }
        s.push(new Pair<>(nums[i], i));
    }

    int size = arr.size();
    int[] result = new int[size];

    for (int i = 0; i < size; ++i) {
        result[i] = arr.get(i);
    }

    int[] stock=new int[size];
    for(int i=0;i<nums.length;i++)
	{
		stock[i]=i-result[i];
	}
    return stock;
}
}
