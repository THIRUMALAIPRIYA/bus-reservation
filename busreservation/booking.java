package busreservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class booking {
	String passengername;
	int busno;
	Date date;
	booking(){
		Scanner sc= new Scanner(System.in);
		System.out.println(" passenger name: ");
		passengername=sc.next();
		System.out.println(" enter bus no: ");
		busno= sc.nextInt();
		System.out.println("date dd-mm-yyyy");
		String dateip = sc.next();
		SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateFormat.parse(dateip);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isAvailable(ArrayList<booking> bookings, ArrayList<bus> buses) {
		int capacity=0;
		for(bus Bus:buses) {
			if(Bus.getBusno()==busno)
				capacity= Bus.getCapacity();
		}
		int booked=0;
		for(booking b:bookings) {
			if(b.busno==busno && b.date.equals(date)) {
				booked++;
			}
		}
		return booked<capacity?true:false;
	}
}
