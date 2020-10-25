package bikeproject;

public interface MountainParts {
	//public final String TERRAIN = "off_road";
	
	BikeUses bikeuses = BikeUses.OFF_ROAD;
	public void setSuspension(String newValue);
	public String getSuspension();
	public void setType(String newValue);
	public String getType();
	public String getTerrain();
	
}
