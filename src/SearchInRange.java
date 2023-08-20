
public class SearchInRange {

	public static void main(String[] args) {
		int [] array = {55,12,19,27,7,3,33,97,22,-1};
		int target = 0;
		int start = 1;
		int end = 5;
		int indexAns = linearSearch1(array, target, start, end);
		boolean isFound = linearSearch2(array, target, start, end);
		System.out.println(target + " index = " + indexAns);
		System.out.println("Does " + target + " exists between " + start + " and "
		+ end + " ? "+ isFound);
	}
	
	// Search an element int the array: return the index if it is found
	// Otherwise return -1
	public static int linearSearch1(int[] array, int target , int start, int end) {
		if(array.length == 0)
				return -1;
		for(int i = start; i <= end; i++) {
			if(array[i] == target)
				return i;
			}
		//This mean if the element has not found in the array 
		//This return statement will be executed and return -1
			return -1;
	}
	
	// Search an element int the array: return true if it is found
	// Otherwise return false
	public static boolean linearSearch2(int[] array, int target , int start, int end) {
		if(array.length == 0)
				return false;
		for(int i = start; i <= end; i++) {
			if(array[i] == target)
				return true;
			}
		//This mean if the element has not found in the array 
		//This return statement will be executed and return false
			return false;
	}
}
