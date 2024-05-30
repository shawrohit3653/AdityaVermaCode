package faangPrepBinarySearch;

public class DesendingSortedArray {
public static void main(String[] args) {
	int[] arr= {20,17,15,14,13,12,10,9,8,4};
	int target=12;
	System.out.println("Return Target Index "+DescendingSearch(arr,target));
}

private static int DescendingSearch(int[] arr, int target) {
	// TODO Auto-generated method stub
	int start=0;
	int end=arr.length-1;
	while(start<=end)
	{
		int mid=start+(end-start)/2;
		if(arr[mid]==target)
		{
			return mid;
		}
		else if(target<arr[mid])
		{
			start=mid+1;
		}
		else {
			end=mid-1;
		}
		
	}
	return -1;
}
}
