import java.util.*;

public class SaikyoDesu {
	double firePower,rateOfFire,accuracy,evasion;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukkan Nama Tactical Doll: ");
		String nama = sc.nextLine();
		
		System.out.println("Masukkan Firepower: ");
//		double firepower = sc.nextDouble(); 
		int firepower = sc.nextInt();
		
		System.out.println("Masukkan Rate of Fire: ");
//		double rateOfFire = sc.nextDouble(); 
		int rateOfFire = sc.nextInt();
		
		System.out.println("Masukkan Accuracy: ");
//		double accuracy = sc.nextDouble(); 
		int accuracy = sc.nextInt(); 
		
		System.out.println("Masukkan Evasion: "); 
//		double evasion = sc.nextDouble(); 
		int evasion = sc.nextInt();
		
		double theDPS = giveDPS(firepower,rateOfFire);
		double theCombatEff = giveCombat(firepower,rateOfFire,accuracy,evasion);
		
		System.out.println("\nTactical doll: "+nama+
							"\nFirepower: "+rateOfFire+
							"\nAccuracy: "+accuracy+
							"\nEvasion: "+evasion+
							"\nDPS: \t"+theDPS+
							"\nCombat Effectiveness: "+theCombatEff);
		sc.close();
	}
	
	public static double giveDPS(int firePow, int rateFaia) {
		
		double dps = (firePow*rateFaia)/60.0;
		double dps1 = Math.ceil(dps * 100) / 100; //pake print f
		return dps1;
	}
	
	public static double giveCombat(int firePow, int rateFaia, int accuracy, int evasion) {
		
		double combateff = 30*firePow+(40*(Math.pow(rateFaia, 2)/120)+(15*(accuracy+evasion)));
		double combateff1 = Math.floor(combateff); //convert jad integer
		return combateff1;
	} //56 74 62 52 
}
