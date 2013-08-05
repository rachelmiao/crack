import java.util.LinkedList;
import java.util.Queue;

public class Test {
	public static void main(String[] args) {
 
		int[] testArr = {15,16,19,20,25,1,3,4,5,7,10,14};
		int result = searchRotated(testArr, 0, testArr.length - 1, 16);
		System.out.println(result);
	}

	static int searchRotated(int[] arr, int lo, int hi, int n) {
		// base case
		if (lo > hi) return -1;
		if (lo == hi) return n == arr[lo] ? lo : -1;
		
		// recursive case
		boolean override = n > arr[hi];
		int mid = lo + (hi - lo) / 2;
		if (arr[mid] == n) return mid;
		if (arr[mid] > n) return searchRotated(arr, lo, mid - 1, n);
		if (arr[mid] < n) {
			if (override) {
				return searchRotated(arr, lo, mid - 1, n);
			} else {
				return searchRotated(arr, mid + 1, hi, n);
			}
		}
		return -1;
	}
}
