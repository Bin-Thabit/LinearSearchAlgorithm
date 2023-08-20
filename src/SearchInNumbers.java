
public class SearchInNumbers {

	public static void main(String[] args) {
		
		int [] array = {55,12,19,27,7,3,33,97,22,-1};
		int target = 0;
		int index = linearSearch1(array,target);
		int element = linearSearch2(array,target);
		System.out.println(target +" index = " + index);
		System.out.println(element);
		System.out.println("Is " + target +" in the array? \n" + linearSearch3(array,target));
	}
	
	// Search an element int the array: return the index if it is found
	// Otherwise return -1
	public static int linearSearch1(int[] array, int target) {
		if(array.length == 0)
			return -1;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == target)
				return i;
		}
		//This mean if the element has not found in the array 
		//This return statement will be executed and return -1
		return -1;
	}
	
	public static int linearSearch2(int[] array, int target) {
		if(array.length == 0)
			return -1;
		for(int element : array) {
			if(element == target)
				return element;
		}
		//This mean if the element has not found in the array 
		//This return statement will be executed and return -1
		return Integer.MAX_VALUE;
	}
	
	public static boolean linearSearch3(int[] array, int target) {
		if(array.length == 0)
			return false;
		for(int element : array) {
			if(element == target)
				return true;
		}
		//This mean if the element has not found in the array 
		//This return statement will be executed and return false
		return false;
	}
}
