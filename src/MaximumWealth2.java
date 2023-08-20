
public class MaximumWealth2 {

	public static void main(String[] args) {
		int [][] banksAccount = {
				{1,5},
				{7,3},
				{3,5}
				
		};	
		int max = maximumWealth2(banksAccount);
		System.out.println("Maximum wealth = " + max);

	}
	static int maximumWealth2(int [][] array) {
		int max = Integer.MIN_VALUE;
		for(int person = 0; person < array.length; person++) {
			int sum = 0;
			for(int account = 0; account < array[person].length; account++) {
				sum += array[person][account];
			}
			if(sum > max)
				max = sum;
		}
		return max;
	}
}
