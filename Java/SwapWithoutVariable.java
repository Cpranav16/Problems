import java.util.Scanner;

public class SwapWithoutVariable{
public static void main (String [] args){
System.out.println("Enter Two Numbers to Swap");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("Frist Number is "+a);
System.out.println("Second Number is "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swapping");
System.out.println("First Number is "+a);
System.out.println("Second Number is "+b);
}
}

