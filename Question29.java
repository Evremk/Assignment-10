package assignment_10;

public class Question29 {

	public static void main(String[] args) {
		
		
		limit("abcd",2);
		limit("bla bla",3);
	}

	public static void limit(String str, int limit) {
		
		
		System.out.println(str.substring(0, limit));
		
	}

}
