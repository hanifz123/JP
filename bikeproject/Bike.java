package bikeproject;

public abstract class Bike implements BikeParts{

	private String handleBars, frame, tyres, seatType;
	private int NumGears;
	private final String make;
	
	public Bike(){	
		this.make = "Oracle Cycles";
	}//end constructor
	
	public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
		this.handleBars = handleBars;
		this.frame = frame;
		this.tyres = tyres;
		this.seatType = seatType;
		NumGears = numGears;
		this.make = "Oracle Cycles";
	}//end constructor

	protected void printDescription()
	{
		System.out.println("\n" + this.make + "\n" 
				          + "This bike has " + this.handleBars + " handlebars on a " 
				          + this.frame + " frame with " + this.NumGears + " gears."  
				          + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
	}//end method printDescription

	@Override
	public String getHandleBars() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setHandleBars(String newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTyres() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTyres(String newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getSeatType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSeatType(String newValue) {
		// TODO Auto-generated method stub
		
	}

}//end class Bike
	
	

