
public class letterprinter {

	public static void main(String[] args) {
	simpleLetter john = new simpleLetter("Mary" , "John");
	john.addline("I am sorry we must part.");
	john.addline("I wish you all the best.");
	System.out.println(john.getText());

	}

}
