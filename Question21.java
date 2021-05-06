package assignment_10;

public class Question21 {

	public static void main(String[] args) {
		//
		
		checkPrefix("aaabdw",1);
		checkPrefix("abXYabc",2);
		checkPrefix("abXYabc",3);
		
		
		

	}

	public static void checkPrefix(String str, int nChars) {
		
		if(nChars<1||nChars>str.length()||str.isEmpty()||str.isBlank()) {
			System.out.println("Not valid input");
		}else {
		
		boolean flag= false;
		
 		String Prefix=str.substring(0, nChars);
 		
			
			if(str.substring(nChars).contains(Prefix)) {
				
				flag=true;
				System.out.println(flag);
				System.out.println(Prefix+" appears minimum twice");
					
			}else {
			System.out.println(flag);
			System.out.println(Prefix+ " appears only once");
			
		}}}
		
		
		
		
			}
			
				
					
				
				
			
		
		


