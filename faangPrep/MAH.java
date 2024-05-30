package faangPrep;

import java.util.*;

public class MAH {
    public static void main(String[] args) {
        int arr[] = {2,4};
        int ans = MAH(arr);
        System.out.print(ans);    
    }

    private static int MAH(int[] arr) {
        int[] width = new int[arr.length];
        int[] right = NSR(arr);
        int[] left = NGL(arr);
        for (int i = 0; i < left.length; i++) {
            width[i] = right[i] - left[i] - 1;    
        }
        
        int[] area = new int[arr.length];
        for (int i = 0; i < area.length; i++) {
            area[i] = arr[i] * width[i];    
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < area.length; i++) {
            max = Math.max(max, area[i]);
        }
        return max;
    }

    private static int[] NGL(int[] arr) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                arr1.add(-1);
            } else {
                arr1.add(st.peek());
            }
            st.push(i);
        }
        int[] result = new int[arr1.size()];
        for (int i = 0; i < arr1.size(); i++) {
            result[i] = arr1.get(i);
        }
        return result;
    }

    private static int[] NSR(int[] arr) {
        ArrayList<Integer> arr2 = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                arr2.add(arr.length);
            } else {
                arr2.add(s.peek());
            }
            s.push(i);
        }
        int[] result = new int[arr2.size()];
        for (int i = 0; i < arr2.size(); i++) {
            result[i] = arr2.get(arr2.size() - 1 - i);
        }
        return result;
    }
}
