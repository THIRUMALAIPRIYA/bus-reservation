package busreservation;
import java.util.*;
import java.util.ArrayList;
public class busdemo {

	public static void main(String[] args) {
		ArrayList<bus> buses= new ArrayList<bus>();
		ArrayList<booking> bookings= new ArrayList<booking>();
		buses.add(new bus(1,true,2));
		buses.add(new bus(2,true,45));
		buses.add(new bus(3,false,45));
		buses.add(new bus(4,true,45));
		buses.add(new bus(5,false,45));
		buses.add(new bus(6,true,45));
		
		
		
		int useropt = 0;
		for(bus b:buses) {
			b.displaybusinfo();
		}
		Scanner sc= new Scanner(System.in); 
		while(useropt==0) {
		System.out.println("enter 0 to book and 1 to exit");
		useropt = sc.nextInt();
		if(useropt==0) {
			booking Booking = new booking();
			if(Booking.isAvailable(bookings,buses)) {
				bookings.add(Booking);
				System.out.println("your booking is confirmed...");
			}
			else
				System.out.println("sorry, bus is full. try another bus or date");
		}
		
		
		}
	}
}

