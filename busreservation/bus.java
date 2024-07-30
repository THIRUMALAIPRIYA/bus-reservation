package busreservation;

public class bus {
	private int busno;
	private boolean ac;
	private int capacity; //get and set method to access --> get (data va eduko) and set(data set pannum)
	
	bus(int no,boolean ac,int cap){
		this.busno=no;
		this.ac=ac;
		this.capacity=cap;
		
	}
	public int getBusno() {
		return busno;
	}
	public boolean isAc() {
		return ac;
	}
	public int getCapacity(){   //access
		return capacity;
	}
	public void setCapacity(int cap) {  //changes set
		capacity = cap;

	}
	public void setAc(boolean val) {
		ac=val;
		
	}
	public void displaybusinfo() {
		System.out.println(" busno " + busno + " AC:" + ac + " capacity " + capacity);
	}
}