package assignment_10;

public class Question23 {

	public static void main(String[] args) {
		
		
		String word = "breadabread";
		int firstBread=word.indexOf("bread");
		
		if((word.contains("bread"))   && (word.substring(firstBread+6).contains("bread")) ) {
				
		String [] str1= word.split("bread");
		
		System.out.println(str1[1]);
		
			
		}else {
			System.out.println("nothing");
		}
		
	}

}
