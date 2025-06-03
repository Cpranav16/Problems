import java.util.Scanner;

public class OddEven {
public static void main (String [] args){
int a;
String res;
System.out.print("Enter a Number: ");
Scanner sc = new Scanner (System.in);
a=sc.nextInt();
res=(a%2==0)?"Even" : "Odd";
System.out.print("The Number "+a+" is "+res);}
}
