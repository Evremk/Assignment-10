package assignment_10;

public class Question30 {

	public static void main(String[] args) {
		
		
		at3("longword","foo");
		at3("blabla","a");

	}

	public static void at3(String strMain, String str) {
		
		System.out.println(strMain.substring(0, 3).concat(str).concat(strMain.substring(3)));
		
	}

}
