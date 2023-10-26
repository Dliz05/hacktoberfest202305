//Given an array arr[] of size N. The task is to find the sum of the contiguous subarray within a arr[] with the largest sum
//For example - arr[] = {-2, -3, 4, -1, -2, 1, 5, -3}
// 4+(-1)+(-2)+1+5 = 7, Maximum subarray sum is 7


package arrays;

public class KadaneAlgo {

	public static void main(String[] args) {
		// sample input
		int array[] = {18, -6, -6, -5, 7, 10, 16, -6, -2, 0};
		
		//printing the output
		System.out.println("Maximum subarray sum is " + maxSubarraySum(array));

	}
	//function to find the maximum subarray sum
	static int maxSubarraySum(int array[]) {
		int n = array.length;
		int max = Integer.MIN_VALUE, sum =0;
		for(int i = 0; i<n; i++) {
			sum += array[i];
			//assigning the sum to the max variable if it is greater
			if(max < sum) {
				max = sum;
			}
			//the subarray with negative sum is discarded, only carry subarray till its positive sum.
			if(sum < 0) {
				sum =0;
			}
		}
		return max;
	}

}

## another approach
// Java program to print largest contiguous array sum
import java.io.*;
import java.util.*;

class Kadane {
	// Driver Code
	public static void main(String[] args)
	{
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous sum is "
						+ maxSubArraySum(a));
	}

	// Function Call
	static int maxSubArraySum(int a[])
	{
		int size = a.length;
		int max_so_far = Integer.MIN_VALUE, max_ending_here= 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + a[i];
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;
	}
}











