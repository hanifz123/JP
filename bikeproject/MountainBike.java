package bikeproject;

public class MountainBike extends Bike implements MountainParts{

	private String suspension, type;
	private int frameSize;
	
	public MountainBike()
	{
		this("Bull Horn", "Hardtail", "Maxxis", "dropper", 27, "RockShox XC32", "Pro", 19);
	}//end constructor
	
    public MountainBike(String handleBars, String frame, String tyres, String seatType, int numGears, 
    		            String suspension, String type, int frameSize) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.suspension = suspension;
		this.type = type;
		this.frameSize = frameSize;
	}//end constructor
    
	public String toString()
	{
		//super.printDescription();
		return "This mountain bike is a " + this.type + " bike and has a " + this.suspension + " suspension and a frame size of " + this.frameSize + "inches."
				+"This bike is best for "+ BikeUses.OFF_ROAD;
		
	}//end method printDescription

	@Override
	public void setSuspension(String newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getSuspension() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setType(String newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTerrain() {
		// TODO Auto-generated method stub
		return null;
	}
}//end class MountainBike
