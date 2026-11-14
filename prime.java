import java.util.Scanner;
public class prime{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter four number:");
int num1=in.nextInt();
int num2=in.nextInt();
int num3=in.nextInt();
int num4=in.nextInt();
int sum=num1+num2+num3+num4;
double average=sum/4.0;
int product=num1*num2*num3*num4;
System.out.println("Sum = "+sum);
System.out.println("Average = "+average);
System.out.println("Product = "+product);
}
}