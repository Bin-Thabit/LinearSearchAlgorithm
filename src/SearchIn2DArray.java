import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		
		int [][] array = {
				{35,2,3},
				{9,13,7},
				{22,54,24,17},
				{19,35}		
		};
		int target = 13;
		int [] answer = search(array,target); //Format of return value {row,col}
		int max = max(array);
		System.out.println(target + " index = " + Arrays.toString(answer));
		System.out.println("The max number in the array = " + max);
	}
	
	// Search an element in the array,
	//return array contains the index of row and col of the element if it is found
	//Otherwise return {-1,-1}  
	static int [] search(int [][] array, int target) {
		
		for(int row = 0; row < array.length; row++) {
			for(int col = 0; col < array[row].length; col++) {
				if(array[row][col] == target)
					return new int[]{row,col};
			}
		}
		return new int[] {-1,-1};
	}
	
	// Searching the max number in the array
	static int max(int [][] array) {
		int max = Integer.MIN_VALUE;
		for(int row = 0; row < array.length; row++) {
			for(int col = 0; col < array[row].length; col++) {
				if(array[row][col] > max)
					max = array[row][col];
			}
		}
		return max;
	}
	
	
}
