package week1.day1;

public class Mobiles {

	private void makeCall() {
		System.out.println("Make Call");

	}
	
	private void sendMsg() {
		System.out.println("Send Message");
		
	}
	private void DisplayIssue() {
		System.out.println("Display is Damaged");

	}
	
	public static void main(String[] args) {
         Mobiles mobiles = new Mobiles();
         mobiles.makeCall();
         mobiles.sendMsg();
         mobiles.DisplayIssue();

	}

}
