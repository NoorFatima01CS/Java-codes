import java.util.*;
public class J1{
public static void main(String arg[]){
Scanner in=new Scanner(System.in);
System.out.print("Enter a number");
int n=in.nextInt();
int fact=1;
int i=1;
while(i<=n){
fact*=i;
i++;
}
System.out.println("Factorial : "+fact);
}
}