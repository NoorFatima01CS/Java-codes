import java.util.Scanner;
public class banana{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter total num of students in class:");
int students=in.nextInt();
System.out.println("Enter fee per student:");
int fees=in.nextInt();
int result=students*fees;
System.out.println("result="+result);
}
}