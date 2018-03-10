package video1;

public class Main {
	public static void main(String[] args) {
		Theater theater = new Theater("olympian",8,12);
	//	theater.getSeats();
		if(theater.reserveSeat("F12")) {
			System.out.println("please pay");
		}else {
			System.out.println("sorry, no seats");
		}
		
	}
}
