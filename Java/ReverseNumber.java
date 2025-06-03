import java.util.Scanner;

public class ReverseNumber {
public static void main (String [] args){
	int Rev = 0;
	System.out.print("Enter a Number: ");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
  	System.out.println("NUMBER BEFORE: "+a);
	Reverse revobj = new Reverse();
	int res = revobj.RevNumber(a,Rev);
	System.out.println("NUMBER AFTER: "+res);
}
}
class Reverse {
	int RevNumber(int a, int Rev){
	while (a!=0){
		int temp = a % 10;
		Rev = Rev * 10 + temp;
		a /= 10;
	}
	return Rev;
	}
}


