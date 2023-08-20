
public class FindMin {

	public static void main(String[] args) {
		int [] array = {18,12,5,-7,5,-1,22};
		int ans = min(array); 
		System.out.println("The minimum number = " + min(array));
	}
	
	// Return the minimum number in the array
	public static int min(int [] array) {
		int min = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] < min)
				min = array[i];
		}
		return min;
	}
}
