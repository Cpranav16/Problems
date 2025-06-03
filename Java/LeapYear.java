import java.util.Scanner;

public class LeapYear {
public static void main (String [] args){

	System.out.print("Enter a Year: ");
	Scanner sc = new Scanner(System.in);
	int y = sc.nextInt();
	if((y%4==0 && y%100!=0)||y%400==0){
	System.out.print("Its a Leap Year !!");}
	else{System.out.print("Its Not a Leap Year !!");}
}
}
