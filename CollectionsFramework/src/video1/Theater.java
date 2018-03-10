package video1;

import java.util.*;

public class Theater {
	private final String theaterName;

	private List<Seat> seats = new ArrayList<>();
	private double price;
	public Theater(String theaterName, int numRows, int seatsPerRow) {
		super();
		this.theaterName = theaterName;
		int lastRow = 'A' + (numRows - 1);
		for (char row = 'A'; row <= lastRow; row++) {
			for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
				 price = 12.00;
				if((row<'D')&&(seatNum>=4&& seatNum<=9)) {
					price =14.00;
				}else if((row>'F')||(seatNum<4||seatNum>9)) {
					price=7.00;
				}
				Seat seat = new Seat(row + String.format("%02d", seatNum), price);
				seats.add(seat);
			}
		}
	}

	public String getTheaterName() {
		return theaterName;
	}

	public boolean reserveSeat(String seatNumber) {
//		int low=0;
//		int high = seats.size()-1;
//		while(low<=high) {
//			System.out.print(".");
//			int mid=(low+high)/2;
//			Seat midVal=seats.get(mid);
//			int cmp=midVal.getSeatNumber().compareTo(seatNumber);
//			
//			if(cmp<0) {
//				low=mid+1;
//			}else if(cmp>0) {
//				high=mid-1;
//				
//			}else {
//				return seats.get(mid).reserve();
//			}
//		
//			
//			
//		}
//		System.out.println("there is not seat: "+seatNumber);
//		return false;
//		
		
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////		
		Seat requestSeat = new Seat(seatNumber, price);
		int foundSeat= Collections.binarySearch(seats, requestSeat,null);
		if(foundSeat>=0) {
			return seats.get(foundSeat).reserve();
		}else {
			System.out.println("there is not seat: "+ seatNumber);
			return false;
		}
		
////////////////////////////////////////////////////////////////////////////////////////////////////////		
//		for (Seat seat : seats) {
//			System.out.print(".");
//			if (seat.getSeatNumber().equals(seatNumber)) {
//				requestSeat = seat;
//				break;
//			}
//			
//		}
	
//		return requestSeat.reserve();
	}

	public Collection<Seat> getSeats() {
		return seats;
	}

	private class Seat implements Comparable<Seat>{
		private final String seatNumber;
		public double getPrice() {
			return price;
		}

		public boolean isReserved() {
			return reserved;
		}

		private double price;
		public String getSeatNumber() {
			return seatNumber;
		}

		private boolean reserved = false;

		public Seat(String seatNumber, double price) {
			super();
			this.price=price;
			this.seatNumber = seatNumber;
		}

		public boolean reserve() {
			if (!this.reserved) {
				this.reserved = true;
				System.out.println("seat : " + seatNumber + " reserved");
				return true;
			} else {
				return false;
			}
		}

		public boolean cancel() {
			if (this.reserved) {
				this.reserved = false;
				System.out.println("reservation of seat: " + seatNumber + " cancelled");
				return true;

			} else {
				return false;
			}
		}

	

		@Override
		public int compareTo(Seat seat) {
			
			return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
		}

	}
	
	


}
