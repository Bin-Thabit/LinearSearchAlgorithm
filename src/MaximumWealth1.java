
public class MaximumWealth1{

	public static void main(String[] args) {
		
		int [][] banksAccount = {
				{1,5},
				{7,3},
				{3,5}
				
		};
		int max = maximumWealth1(banksAccount);
		System.out.println("Maximum wealth = " + max);
		

	}
	static int[] customerAccounts(int [][] array) {
		int [] accounts = new int[array.length];
		
		for(int person = 0; person < array.length; person++) {
			int sum = 0;
			for(int account = 0; account < array[person].length; account++) {
				sum += array[person][account];
			}
			accounts[person] = sum;
		}
		return accounts;
	}
	
	static int maximumWealth1(int [][] array) {
		int [] accounts = customerAccounts(array);
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] > max)
				max = accounts[i];
		}
		return max;
	}
	
	
}
