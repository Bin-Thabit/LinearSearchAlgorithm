
public class EvenDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {12,789,3,5954,22};
		int ans = getEvenDigit(array);
		System.out.println("Even digits in the array = " + ans);
	}

	static int getEvenDigit(int [] array) {
		int counter = 0;
		for(int i = 0; i < array.length; i++) {
			String num = array[i] +"";
			if(num.length()%2 == 0)
				counter++;
		}
		return counter;
	}
}
