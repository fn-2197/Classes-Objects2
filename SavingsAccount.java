
public class SavingsAccount {
	public  double balance;
	public  String name;
	public double intrest;
		public SavingsAccount(double a, String b, double c){
		balance = a;
		name = b;
		intrest = c;
	}
		public void deposit(double a) {
			
	balance += a;
		}
		public void withdraw(double a){
			balance -= a;
		}
		public void addIntrest(){
			balance += balance * (intrest/100);
			
		}
}
