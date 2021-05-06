package assignment_10;

public class Question25 {

	public static void main(String[] args) {
		
		//NOT SURE IF 100% CORRECT
		String s1 = "12345678";
		String s2 = "abcdefg";
		String s3= "";
		
		for(int i=0,j=0;(i<s1.length())&& (j<s2.length());i++,j++) {
			
			s3=s3+s1.charAt(i)+s2.charAt(j);
			
			
			
		}
		System.out.print(s3);

		if(s1.length()>s2.length()) {
			System.out.print(s1.charAt(s1.length()-1));
	}else if(s2.length()>s1.length()) {
		System.out.print(s2.charAt(s2.length()-1));
	}

}
}