package assignment_10;

public class Question18 {

	
	//WAS NOT MY OWN RESPONSE, MINE WAS PRINTING 
	//THE SEPERATOR AT THE END AS WELL
	public static void main(String[] args) {
		returnBigString("Word","X",2);

	}

	public static void returnBigString(String word, String sep, int count) {
		
		
		for(int i=0; i<count;i++) {
			System.out.print(word);
			if(i<(count-1)) {
				System.out.print(sep);
			}
			
		}

	}

}
		
	