package assignment_10;

public class Question_16 {

	public static void main(String[] args) {
		
		String word = "ccccjava";
		
		if(word.length()>=4) {
		if(word.substring(0, 4).equals("java")||word.substring(1, 5).equals("java")) {
			
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		

	}else {
		System.out.println("Error: enter at least 4 characters");
	}

}
}
