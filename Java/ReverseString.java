import java.util.Scanner;

public class ReverseString {
	public static void main (String [] args){
		String st = "";
		String Rev = "";
		int len = 0;
		System.out.print("Type Anything: ");
		Scanner sc = new Scanner (System.in);
		// for a Single String. 
		// st = sc.next();
		// for a Entire Line.
		st = sc.nextLine();
		len = st.length();
		System.out.println("BEFORE : "+st);
		Reverse revst = new Reverse();
		String Res = revst.Rev(len,st);
		System.out.println("AFTER : "+Res);

	}
}

public class Reverse {
	public String Rev (int len, String st){
		String Res = "";
		while(len>0){
		char temp = st.charAt(len-1);
		Res = Res + temp;
		len--;
		}
	return Res;
	}
}
