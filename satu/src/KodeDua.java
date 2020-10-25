import java.util.*;

public class KodeDua {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Misikin kilimitnyi: \n");
		String coba = sc.nextLine();
		System.out.println(i(coba));
		sc.close();
	}
	public static String i(String str) {
		
		char[] ch = new char[str.length()]; 
		
		for (int j = 0; j<str.length();j++) {
			ch[j] = str.charAt(j); 
		}
		
		for (int j = 0; j<str.length();j++) {
			if (ch[j] == 'a') {
				ch[j] = 'i';
			}
			else if (ch[j] == 'A') {
				ch[j] = 'I';
			}
			else if (ch[j] == 'u') {
				ch[j] = 'i';
			}
			else if (ch[j] == 'U') {
				ch[j] = 'I';
			}
			else if (ch[j] == 'e') {
				ch[j] = 'i';
			}
			else if (ch[j] == 'E') {
				ch[j] = 'I';
			}
			else if (ch[j] == 'o') {
				ch[j] = 'i';
			}
			else if (ch[j] == 'O') {
				ch[j] = 'I';
			}
			else {
				ch[j] = ch[j];
			}
		}
		
		//coba pake method replace
		String stri = new String(ch);
		return stri;
//		return 
		}

}
