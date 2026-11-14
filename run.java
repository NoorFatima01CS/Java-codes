import java.util.*;
public class run{

public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    
System.out.println("enter first num"); 
int a =in.nextInt();
System.out.println("enter second num");
int b=in.nextInt();
 int temp;
 temp= a;
 a=b;
  b=temp;
 System.out.println("After swapping:");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
}
}

