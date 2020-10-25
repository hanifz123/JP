package bikeproject;

public interface RoadParts {
//	public final String TERRAIN = "track_racing";

	BikeUses bikeuses = BikeUses.TRACK;
	public void setTyreWidth(String newValue);
	public String getTyreWidth();
	public void setPostHeight(String newValue);
	public String getPostHeight();
}
