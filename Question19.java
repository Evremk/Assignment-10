package assignment_10;

public class Question19 {

	public static void main(String[] args) {
		
		String word = "xxxjavaxxxxx";
		String word2="java";
		int counter=0;
	
		for(int i =0;i<word.length()-word2.length();i++) {
		
		if(word.substring(i).contains(word2)) {
			counter++;
			i=i+4;
			
				}
		}
		
		System.out.println(counter);
			
		}
}

	


