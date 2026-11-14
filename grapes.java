import java.util.Scanner;
public class grapes{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int totalmarks=250;
System.out.println("enter obtained");
int eng=in.nextInt();
int urdu=in.nextInt();
int chem=in.nextInt();
int comp=in.nextInt();
int phy=in.nextInt();
int sum=(eng+urdu+chem+comp+phy);
System.out.println("sum="+sum);
double percentage=(sum/250.0)*100;
System.out.println("percentage="+percentage);
}
}