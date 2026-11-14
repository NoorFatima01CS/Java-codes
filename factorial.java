import java.util.Scanner;
public class factorial{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter number of miles:");
int miles=in.nextInt();
double kilometers=miles*1.60934;
System.out.println("kilometers="+kilometers);
}
}