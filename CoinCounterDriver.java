/**

Tests the CoinCounter class methods

@author Glennon Langan

*/
public class CoinCounterDriver{

	public static void main(String[] args){

		//TEST 1: Assignment Example
		int[] denominations1 = {10,5,25};
		int[] denominations2 = {45,3,11,50};

		System.out.println(" Total: 20 ");
		CoinCounter.makeChange(denominations1, 20);
		System.out.println();
		System.out.println(" Total: 20 ");
		CoinCounter.makeChange(denominations2, 20);
		System.out.println();
		System.out.println(" Total: 75 ");
		CoinCounter.makeChange(denominations1, 75);
		System.out.println();
		System.out.println(" Total: 75 ");
		CoinCounter.makeChange(denominations2, 75);
		System.out.println();
		System.out.println(" Total: 135 ");
		CoinCounter.makeChange(denominations1, 135);
		System.out.println();
		System.out.println(" Total: 135 ");
		CoinCounter.makeChange(denominations2, 135);
		System.out.println();
		System.out.println(" Total: 160 ");
		CoinCounter.makeChange(denominations1, 160);
		System.out.println();
		System.out.println(" Total: 160 ");
		CoinCounter.makeChange(denominations2, 160);
		System.out.println();

		System.out.println("Minimum Coins Expected:2 Actual:" + CoinCounter.makeChangeMin(denominations1, 50));
		System.out.println("Minimum Coins Expected:1 Actual:" + CoinCounter.makeChangeMin(denominations1, 5));
		System.out.println("Minimum Coins Expected:2 Actual:" + CoinCounter.makeChangeMin(denominations1, 20));
		System.out.println("Minimum Coins Expected:2 Actual:" + CoinCounter.makeChangeMin(denominations1, 30));
		System.out.println("Minimum Coins Expected:3 Actual:" + CoinCounter.makeChangeMin(denominations1, 75));
		System.out.println("Minimum Coins Expected:4 Actual:" + CoinCounter.makeChangeMin(denominations1, 80));
		System.out.println("Minimum Coins Expected:5 Actual:" + CoinCounter.makeChangeMin(denominations1, 95));
		System.out.println("Minimum Coins Expected:2 Actual:" + CoinCounter.makeChangeMin(denominations1, 15));
		System.out.println("Minimum Coins Expected:40 Actual:" + CoinCounter.makeChangeMin(denominations1, 1000));
		System.out.println("Minimum Coins Expected:-1 Actual:" + CoinCounter.makeChangeMin(denominations1, 1));


		System.out.println();
		System.out.println("Minimum Coins Expected:2 Actual:" + CoinCounter.makeChangeMin(denominations2, 90));
		System.out.println("Minimum Coins Expected:6 Actual:" + CoinCounter.makeChangeMin(denominations2, 66));
		System.out.println("Minimum Coins Expected:1 Actual:" + CoinCounter.makeChangeMin(denominations2, 50));
		System.out.println("Minimum Coins Expected:6 Actual:" + CoinCounter.makeChangeMin(denominations2, 42));
		System.out.println("Minimum Coins Expected:2 Actual:" + CoinCounter.makeChangeMin(denominations2, 95));
		System.out.println("Minimum Coins Expected:20 Actual:" + CoinCounter.makeChangeMin(denominations2, 1000));
		System.out.println("Minimum Coins Expected:-1 Actual:" + CoinCounter.makeChangeMin(denominations2, 1));

		System.out.println();
		int[] denominations3 = {5};
		System.out.println(" Total: 20 ");
		CoinCounter.makeChange(denominations3, 20);
		System.out.println();
		System.out.println(" Total: 75 ");
		CoinCounter.makeChange(denominations3, 75);
		System.out.println();
		System.out.println(" Total: 135 ");
		CoinCounter.makeChange(denominations3, 135);
		System.out.println();
		System.out.println(" Total: 160 ");
		CoinCounter.makeChange(denominations3, 160);
		System.out.println();


		System.out.println("Minimum Coins Expected:10 Actual:" + CoinCounter.makeChangeMin(denominations3, 50));
		System.out.println("Minimum Coins Expected:1 Actual:" + CoinCounter.makeChangeMin(denominations3, 5));
		System.out.println("Minimum Coins Expected:4 Actual:" + CoinCounter.makeChangeMin(denominations3, 20));
		System.out.println("Minimum Coins Expected:6 Actual:" + CoinCounter.makeChangeMin(denominations3, 30));
		System.out.println("Minimum Coins Expected:15 Actual:" + CoinCounter.makeChangeMin(denominations3, 75));
		System.out.println("Minimum Coins Expected:16 Actual:" + CoinCounter.makeChangeMin(denominations3, 80));
		System.out.println("Minimum Coins Expected:19 Actual:" + CoinCounter.makeChangeMin(denominations3, 95));
		System.out.println("Minimum Coins Expected:3 Actual:" + CoinCounter.makeChangeMin(denominations3, 15));
		System.out.println("Minimum Coins Expected:200 Actual:" + CoinCounter.makeChangeMin(denominations3, 1000));
		System.out.println("Minimum Coins Expected:-1 Actual:" + CoinCounter.makeChangeMin(denominations3, 1));
		System.out.println();


	}//main


}//class