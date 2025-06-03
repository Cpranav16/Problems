
import java.util.Scanner;

public class Greatest {
public static void main (String [] args){
int a,b;
System.out.print("Enter A: ");
Scanner sc = new Scanner(System.in);
a=sc.nextInt();
System.out.print("Enter B: ");
b=sc.nextInt();
if (a>b){
System.out.println("A is Greater");
}
else{
System.out.println("B is Greater");
} 
}  
}
