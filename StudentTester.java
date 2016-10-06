import java.util.Scanner;


public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		 System.out.println("Students Name: ");
		String n = kb.next();
		Student one = new Student(n);
		System.out.println("Number of quizes: ");
		int q = kb.nextInt();
			for(int q1 = q; q1 > 0; q1--){
			System.out.println("Quiz grade: ");
			one.addQuiz(kb.nextInt());
			
		}
			System.out.println("Total Score: " + one.getTotalScore() + "\nAverage Score: " + one.getAverageScore());
	}

}
