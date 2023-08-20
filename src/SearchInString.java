
public class SearchInString {

	public static void main(String[] args) {
		
		String text = "Khalid".toLowerCase();
		char target = 'k';
		boolean isFound1 = search1(text, target);
		boolean isFound2 = search2(text, target);
		System.out.println("Using normal for loop");
		System.out.println("Does " + target +" exists? " + isFound1 +"\n");
		System.out.println("Using for each");
		System.out.println("Does " + target +" exists? " + isFound2);
	}
	
	// Search character in string: it will return true if it is found
	// Otherwise return false
	public static boolean search1(String text , char target) {
		// If the length of the string = 0, that means no character in the word
		// so return false
		if(text.length() == 0)
			return false;
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == target)
				return true;
		}
		// That means if the character has not found return false
		return false;
	}
	
	public static boolean search2(String text , char target) {
		// If the length of the string = 0, that means no character in the word
		// so return false
		if(text.length() == 0)
			return false;
		for(char element : text.toCharArray() ) {
			if(element == target)
				return true;
		}
		// That means if the character has not found return false
		return false;
	}
}
