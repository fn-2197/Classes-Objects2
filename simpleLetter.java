
public class simpleLetter {
private String sender;
private String recipient;
private String body = "";
	public simpleLetter(String f, String t){
		sender = f;
		recipient = t;
		
	}
	public void addline(String line){
		body += line + "\n";
	}
	public String getText(){
		return( "Dear " + recipient + "\n\n" + body + "\nSincerely, \n \n" + sender);
	}
}
