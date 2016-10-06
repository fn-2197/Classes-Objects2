
public class Student {
private String name = "";
private double score;
private int taken;
		public Student(String n){
			name = n;
		}
		public String getName(){
			return(name);
		}
		public void addQuiz(int s){
			taken++;
			score +=s;
		}
		public double getTotalScore(){
			return(score);
		}
		public double getAverageScore(){
			return(score/taken);
		}
}
