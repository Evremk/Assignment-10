package assignment_10;

public class Question28 {

	public static void main(String[] args) {
		
		
		clean("one two three", "two");
		clean("foo bar", "foo");

	}

	public static void clean(String text, String badWord) {
		
		if(text.contains(badWord)) {
			
			text= text.replace(badWord, "");
			
			System.out.println(text);
		}
		
		
		
		
	}

}
