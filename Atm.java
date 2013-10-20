import java.util.Scanner;

public class Atm {
	private int [] users;
	private String pin;
	private String name;


	//construction
	public Atm(int users, String pin, String name) {
		setUsers(users);
		setPin(pin);
		setName(name);
	}


	//getters
	public Int[] user() {
		return user;
	}
	public String pin() {
		return pin;
	}
	public String name() {
		return name;
	}

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
		String enteredname = reader.nextLine();
		System.out.println("Enter your pin: ");
		String enteredpin = reader.nextLine();

		
	}

	public static void main(String[] args) {

		Atm account1 = new Atm("Bob", "7814");
		Atm account2 = new Atm("Amy", "4024");
		Atm account3 = new Atm("Sean", "0000");

		int[] users = { account1, account2, account3};

	} 



} 

