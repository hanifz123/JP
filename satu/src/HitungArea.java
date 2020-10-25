import java.util.*;

public class HitungArea{

	public static void main(String []args){
		//        Scanner sc = new Scanner(System.in);
		//        int x;
		//        System.out.println("\nInsert the width of Rectangle: \n");
		//        double width = sc.nextDouble();
		//        System.out.println("\nInsert the height of Rectangle: \n");
		//        double height = sc.nextDouble();
		//        
		//        double area = width*height;
		//        System.out.println("\nYour rectangle area is: "+area);
		//		  f(3);
		
//		int x = 6;
//		while (isAvailable(x)) {
//			System.out.println(--x); //opsi A
//		}
		howMany(true, new boolean[2]);

	}// end of main method
	
	public static boolean isAvailable(int x) {
		System.out.println("isA "+x);
		return --x > 0 ? true : false;
	}
	
	public static int howMany(boolean b, boolean... b2) {
		System.out.println(b2.length);
		return b2.length; 
		
		}

//	public void t(int i) {
//		if(i >= 5);
//		else {
//			System.out.println(i);
//			k(i+1);
//		}
//	}
//
//	public void k(int i) {
//		if(i <= 0);
//		else {
//			t(i-4);
//			System.out.println(i);
//		}
//	}
//
//	public static void f(int i) {
//		int life = i;
//		do {
//			for(int ii = i;ii>0;ii--) {
//				System.out.println("_");
//				if(ii<1)
//					continue;
//				System.out.println("\\");
//
//				i--;
//			}
//		}while(i>=0);
//
//		int j = life;
//		do {
//			System.out.println("/");
//
//			j--;
//
//		}while(j>=0);



	
}