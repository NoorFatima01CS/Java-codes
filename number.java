import java.util.Scanner;
public class number{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter number of hours:");
int hours=in.nextInt();
int weeks=hours/168;
int remainingHours=hours%168;
int days=remainingHours/24;
System.out.println("Weeks = "+weeks);
System.out.println("Days = "+days);
}
}