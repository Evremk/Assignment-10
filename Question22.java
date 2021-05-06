package assignment_10;

public class Question22 {

	public static void main(String[] args) {
	/*Write a program, that will read HTML variable and output 
	 * attribute value of id attribute (tag) into the console. 
	 * Input will be provided in a single line as outlined below. 
	 * If HTML variable doesn't contain <html> attribute, print out 
	 * into the console message: "Invalid input!".
	 *Sample Output:
	input: <!DOCTYPE html><html><head><title>Java</title></head><body><p 
	id="myid"></p></body></html>
     output: myid
     */

		
	String str= "<!DOCTYPE html><html><head><title>Java</title></head><body>"
			+ "<p id=\"mervesid\"></p></body></html>";
	String html= "<html>";
	
	if(!(str.contains(html))) {
		System.out.println("Invalid input!");
	}else {
		String newstr[]=str.split("\"");
				
		System.out.println(newstr[1]);
	}
	}

}
