import java.util.Scanner;
public class mango{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter age in years:");
int age=in.nextInt();
int months=age*12;
System.out.println("months="+months);
int days=months*365;
System.out.println("days="+days);
System.out.println("age="+age);
}
}