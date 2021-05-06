package assignment_10;

public class Question24 {

	public static void main(String[] args) {
		
		int counter1=0;
		int counter2=0;
		String str = "We study java not phython";
		String word1="java";
		String word2="phython";
		for(int i =0; i<str.length()-word1.length();i++) {
			
		if(str.substring(i, i+word1.length()+1).contains(word1)) {
			
			counter1++;
			i= i+word1.length();
		}
				

	}
		for(int i =0; i<str.length()-word2.length();i++) {
			
			if(str.substring(i, i+word2.length()+1).contains(word2)) {
				
				counter2++;
				i= i+word2.length();
		
		

}
}
		
		if(counter1==counter2) {
			System.out.println(true);
		}else
			System.out.println(false);
		
		
		
		
	}}