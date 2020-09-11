package CS245TwoSum;

import java.util.Arrays;

public class CS245TwoSum {
	public static void main(String[] args) {
		int array[] = {2, 12, 8, 7};
		int target = 9;
		
		//Creates an array that is initialized to hold the values found in the function twoSum
		int indicesOfNumbs[] = twoSum(array, target);
		
		//Prints out the contents of indicesOfNumbs
		System.out.println(Arrays.toString(indicesOfNumbs));
	}
	
	
	public static int[] twoSum(int[] sumArr, int target) {
		//Outer loop locks onto a single value
		for (int i = 0; i < sumArr.length; i++) {
			//Inner loop compares each value to i (the locked value)
			//After comparing each value to the locked value, i is incremented if no sums are found
			//The effect of starting a j = i + 1 is so that it only checks values from i and beyond instead of checking values located
			//before i that have previously been checked
			for (int j = i + 1; j < sumArr.length; j++) {
				//If the sum of two values is equal to our target, return a new array of the indices
				if (sumArr[i] + sumArr[j] == target) {
					return new int[] {i, j};
				}
			}
		}	
		//If this is reached, no values were found that add up to our target, return -1
		return new int[] {-1};
	}
}
