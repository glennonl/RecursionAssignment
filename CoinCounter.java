import java.util.*;
/**
Contains static methods that count coins.


@author Glennon Langan
		11/18/19

*/

public class CoinCounter{

    //Note, you may NOT add any data fields.

	/**
	prints all combinations of the given denominations of coins that add up to the total given value.

	@param denominations  an array of integers that represents the values of different denominations of coins.
	@param total  the value that a combination of coins should add up to.

	The makeChange solution is correct because it ensures that all combinations are unique by
	finding using as much as one denomination fits in the total and working back from there,
	using as much as the next as possible and so on. This solution ensures that it does not
	recurse and find combinations that are just different orderings of the same combination
	*/
	public static void makeChange(int[] denominations, int total){
		// calls private method to get all solutions
		int[] denomCount = new int[denominations.length];

		makeChange(denominations, total, denomCount, 0);
	}//makeChange(wrapper method)


	private static void makeChange(int[] denominations, int total, int[] denomCount, int start){

		if(total == 0){
			StringBuilder sb = new StringBuilder();

			for(int j = 0; j < denominations.length; j++){
				if(denomCount[j] != 0){
					if(sb.length() != 0)
						sb.append(", ");
					sb.append(denomCount[j]);
					sb.append(" ");
					sb.append(denominations[j]);
					sb.append("-coins");
				}// adds only coin values that are used to the string
			}// end of string building loop
			System.out.println(sb.toString());
		}// base case
		else{
			for(int i = start; i < denominations.length; i++){
				if(total-denominations[i] >= 0){
					// move down a level of tree, adding a coin to the combination
					denomCount[i] = denomCount[i] + 1;
					makeChange(denominations, total-denominations[i], denomCount, i);
					// moving back up the tree
					denomCount[i] = denomCount[i] - 1;
				}// general solution
			}// for loop
		}// else
	}// makeChange

	/**
	returns the least amount of coins of the given denominations that add up to the total given value.

	@param denominations  an array of integers that represents the values of different denominations of coins
	@param total  the value that a combination of coins should add up to.
	@return the minimum number of coins needed to make total with the given denominations or -1 if it's not possible

	This solution is correct partially due to the same reason makeChange is correct, in that it does not look at
	repeat combinations. It also compares all previous results to find a minimum for each subtree returning that
	minimum to the parent node which then compares all its children's values.
	*/
	public static int makeChangeMin(int[] denominations, int total){
		int result = makeChangeMin(denominations, total, 0);
		if(result == total+1)
			result = -1;
		return result;
	}//makeChangeMin

	private static int makeChangeMin(int[] denominations, int total, int start){
			int min = total+1;
			// base case
			if(total == 0)
				return 0;
			else{
				int temp = total+1;
				for(int i = start; i < denominations.length; i++){
					// as long as the coin is less than the remaining total, decrease
					if(total-denominations[i] >= 0)
						temp = 1 + makeChangeMin(denominations, total-denominations[i], i);
					// compares the latest result to the stored value to find new minimum
					if(temp < min)
						min = temp;
				}// for loop
			}// else
			return min;
	}//makeChangeMin




}
