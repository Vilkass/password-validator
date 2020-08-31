package Input;

import java.util.Scanner;

public class Input {

	Scanner scanner = new Scanner(System.in);
	private String PASSWORD;
	
	
	public void inputListener() {
		System.out.println("Password: ");
		PASSWORD = scanner.next();
	}


	public void validator() {
		
		if(containsNumber() && passwordLength() && containsChar()) {
			System.out.println("Great Password!");
		}
		else {
			System.out.println("Poor Password!");
			
		}
		
	}
	
	
	private boolean passwordLength() {
		if(PASSWORD.length()>6 && PASSWORD.length()<16) {
			return true;
		}
		else return false;
	}
	
	private boolean containsNumber() {
		
		int k = 0;
		char[] containNumber = PASSWORD.toCharArray();
		for(int i =0; i < containNumber.length; i++) {
			
			switch(containNumber[i]) {
			
			case '0': ++k; break; 
			case '1': ++k; break; 
			case '2': ++k; break; 
			case '3': ++k; break; 
			case '4': ++k; break; 
			case '5': ++k; break; 
			case '6': ++k; break; 
			case '7': ++k; break; 
			case '8': ++k; break; 
			case '9': ++k; break; 
			default: continue;
			}
			
		}
		
		if(k>0) {
			return true;
		}
		else return false;
		
	}
	
	private boolean containsChar() {
	
			
			int p = 0;
			char[] containChar = PASSWORD.toCharArray();
			for(int i =0; i < containChar.length; i++) {
				
				switch(containChar[i]) {
				
				case '!': ++p; break; 
				case '@': ++p; break; 
				case '#': ++p; break; 
				case '$': ++p; break; 
				case '%': ++p; break; 
				case '^': ++p; break; 
				case '&': ++p; break; 
				case '*': ++p; break; 
				case '~': ++p; break; 
				case '+': ++p; break;
				case '-': ++p; break; 
				case ' ': return false;
				default: continue;
				}
				
			}
			
			if(p>0) {
				return true;
			}
			else return false;
			
	}
	
	
	
	
}
