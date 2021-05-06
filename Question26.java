package assignment_10;

public class Question26 {

	public static void main(String[] args) {
		
		uniqueChars("mama");

	}

	public static void uniqueChars(String str) {
		
		String strNew=" ";
		
		for(int i=0;i<str.length();i++) {
		
		if(!(strNew.substring(0).contains(str.substring(i, i+1)))){
			
			strNew= strNew+str.substring(i, i+1);
			
		}
		
		
	}
		System.out.println(strNew);
	}
	
}