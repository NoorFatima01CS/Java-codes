import java.util.Scanner;
public class swap{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
System.out.println("Enter even number");
int a=in.nextInt();
System.out.println("Enter odd number");
int b=in.nextInt();
System.out.println(a*5);
System.out.println(b*3);
int result=((a*5)+(b*3));
System.out.println("result="+result);
System.out.println("subtraction="+(1000-result));
}
}