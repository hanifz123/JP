package bikeproject;

public enum BikeUses{
	OFF_ROAD("OR"),
	TRACK("TK"),
	ROAD("RD"),
	DOWNHILL("DL"),
	TRAIL("TL");
	
	private String terrain;
	
	private BikeUses(String terrain) {
		this.terrain = terrain;
	}
	
	public String getTerrain() {
		return terrain;
	}
}