package bikeproject;

public class BikeDriver {

	public static void main(String[] args) {
		
		RoadBike bike1 = new RoadBike(22);
		RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);		
		MountainBike bike3 = new MountainBike(); //bike(MB)
		//Bike bike4 = new Bike();
		
		System.out.println(bike1.toString());
		System.out.println(bike2.toString());
		System.out.println(bike3.toString());
		
		//bike4.printDescription();
	}//end method main

}//end class BikeDriver
