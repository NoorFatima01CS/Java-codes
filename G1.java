import java.util.*;
public class G1
{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("enter marks");
int marks=in.nextInt();
String result=(marks>=50)?"Pass":"Fail";
System.out.print(result);
}
}