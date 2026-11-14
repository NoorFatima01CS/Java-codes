
import java.util.*;
public class hello{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
System.out.println("enter first number");
int dividend=in.nextInt();
System.out.println("enter second number");
int divisor=in.nextInt();
int quotient=dividend/divisor;
System.out.println("quotient=" + quotient);
int remainder=dividend%divisor;
System.out.println( "remainder=" +remainder);
}    

}