import java.util.Scanner;


public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbscanner = new Scanner(System.in);
		System.out.println("Inital amount: ");
		double bal = kbscanner.nextDouble();
		System.out.println("Name, without spaces: ");
		String name = kbscanner.next();
		System.out.println("Intrest Rate: ");
		double rate = kbscanner.nextDouble();
		SavingsAccount myAccount = new SavingsAccount(bal,name, rate);
		myAccount.addIntrest();
		System.out.println("The " + myAccount.name + " account balance is, $" + myAccount.balance);
	}

}
