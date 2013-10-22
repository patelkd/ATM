import java.util.Scanner;

public class Atm {
	private String [] username;
	private int [] userpin;
	private String pin;
	private String name;


	//construction
	// public Atm(int users, String pin, String name) {
		
	// }


	//getters
	
	
	//setters
	public void setPin(String pin) {
	if (pin.length() ==4) {	
		this.pin=pin;
		}
		else {
			System.out.println("Invalid pin");
		}
	

	}
	public void logIn() {
		Scanner reader = new Scanner (System.in);
		System.out.println("Enter your name: ");
		String name = reader.nextLine();
		String enteredname = (String)name;
		for (int i=0; i<username.length; i++) {
			if (username[i]==enteredname) {
				System.out.println("Thank you.");
			}
		}
		if (username[0]!=enteredname) {
			System.out.println("Invalid Username");
			logIn();
		}
		System.out.println("Enter your pin: ");
		String enteredpin = reader.nextLine();
		if (userpin[username.length] == enteredpin) {
			System.out.println("Welcome " + enteredname);
		}
			
		}




	public static void main(String[] args) {

		String[] username = {"Bob","Amy", "Sean"};
		int[] userpin = {7814, 4024, 0000};

		logIn();
	} 



	
} 

