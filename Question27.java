package assignment_10;

public class Question27 {

	public static void main(String[] args) {
		
		coverString("javam","a");
		
		//NO IDEA HOW TO DO IT SORRY

	}

	public static void coverString(String main, String toCover) {
		
		
		if(!(main.contains(toCover))){
				System.out.println("["+main+"]");	
				
	}else  {
		
		
		for(int i=0;i<main.length();i++) {
			
			if(main.substring(i, toCover.length()).contains(toCover)) {
				System.out.print("["+main.substring(i, toCover.length())+"]");
			}else {
			System.out.print(main.charAt(i));
		
		}
		
		
		}
		
	}

	}}
