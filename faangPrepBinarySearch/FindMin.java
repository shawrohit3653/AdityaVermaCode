package faangPrepBinarySearch;

public class FindMin {
	public static int findMin(int[] nums) {
	    int n = nums.length;
	    int start = 0;
	    int end = n - 1;

	    // If the array is not rotated (the smallest element is the first element)
	    if (nums[start] <= nums[end]) {
	        System.out.println("The array is not rotated");
	        return nums[start];
	    }

	    // If the minimum element is the last element in the array
	    if (nums[end] < nums[0]) {
	        System.out.println("The minimum element is the last element");
	        return nums[end];
	    }

	    while (start <= end) {
	        int mid = start + (end - start) / 2;
	        int next = (mid + 1) % n;
	        int prev = (mid - 1 + n) % n;

	        System.out.println("mid: " + nums[mid] + ", next: " + nums[next] + ", prev: " + nums[prev]);

	        // Check if the mid element is the minimum element
	        if (nums[mid] <= nums[next] && nums[mid] <= nums[prev]) {
	            System.out.println("Found the minimum element: " + nums[mid]);
	            return nums[mid];
	        }

	        // If the left part is sorted, the minimum is in the right part
	        if (nums[start] <= nums[mid]) {
	            start = mid + 1;
	        } else {
	            // If the right part is sorted, the minimum is in the left part
	            end = mid - 1;
	        }
	    }

	    System.out.println("Could not find the minimum element");
	    return -1; // This line should never be reached
	}
	    public static void main(String[] args) {
	        int[] nums = {4, 5, 6, 1, 2, 3};
	        int result = findMin(nums);
	        System.out.println("The minimum element is: " + result); // Expected output is 1
	    }
	}

