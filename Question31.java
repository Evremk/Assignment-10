package assignment_10;

public class Question31 {

	public static void main(String[] args) {
		
		
	System.out.println(isPalindrome("Nurses run"));	
		
	}

	public static boolean isPalindrome(String str) {
		boolean Palindrome=false;
		str= str.toLowerCase().replace(" ", "");
		
for(int i=0; i<=(str.length()/2)-1;i++) {	
for(int j=1;j<=str.length()/2;j++) {
						
if(str.charAt(i)==str.charAt(str.length()-j)) {
		Palindrome= true;
					}else {
		Palindrome= false;
					}}
	
}
return Palindrome;

		
	}}


