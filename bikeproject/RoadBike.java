package bikeproject;

public class RoadBike extends Bike implements RoadParts{
	
	private int  tyreWidth, postHeight;
	
	public RoadBike()
	{
		this("drop", "racing", "tread less", "razor", 19, 20, 22);
	}//end constructor
	
	public RoadBike(int postHeight)
	{
		this("drop", "racing", "tread less", "razor", 19, 20, postHeight);
	}//end constructor
		
	public RoadBike(String handleBars, String frame, String tyres, String seatType, int numGears,
			int tyreWidth, int postHeight) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.tyreWidth = tyreWidth;
		this.postHeight = postHeight;
	}//end constructor
	
	public String toString()
	{
		//super.printDescription();
		return "This Roadbike bike has " + this.tyreWidth + "mm tyres and a post height of " + this.postHeight + ".";
	}//end method printDescription

	@Override
	public void setTyreWidth(String newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTyreWidth() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPostHeight(String newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPostHeight() {
		// TODO Auto-generated method stub
		return null;
	}
}//end class RoadBike
