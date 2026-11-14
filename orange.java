import java.util.Scanner;
public class orange{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter petrol in liters:");
int petrol=in.nextInt();
int distance=petrol*3;
System.out.println("distance="+distance+"miles");
}
}