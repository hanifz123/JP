

public class DayDuaLima {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "2";
		String y = "8";
		B(x,y);
		System.out.println("x" + x);
		System.out.println("y"+ y);
//		temp = 8
//		y = 2
//		x = 8
		checkBinary("1025");
}
	public static void B(String x, String y) {
		String temp  = y;
		y = x;
		x = temp;
	}
	public static void checkBinary(String input) {
		System.out.println(input.length());
		for (int i = 0; i<input.length(); i++) {
			if(input.charAt(i)!='1' && input.charAt(i)!='0') {
//				return false;
				System.out.println("bukan binary");
			}
		}
		System.out.println("binary");
	}
	
	//int x = 2 + (-2) + 6 + 8 - 4 = 10 //x
	//x = 10
	//i = 4
	//a = 6
}	
