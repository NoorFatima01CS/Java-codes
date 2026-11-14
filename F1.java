import java.util.*;
public class F1{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
float n1=in.nextFloat();
char op=in.next().charAt(0);
float n2=in.nextFloat();

switch(op){
case '+':
System.out.println(n1+n2);
break;

case '-':
System.out.println(n1-n2);
break;

case '*':
System.out.println(n1*n2);
break;

case '/':
if(n2!=0){
System.out.println(n1/n2);
}
else{
System.out.println("Divisor cannot be zero");
}
break;

default:
System.out.println("Invalid operation");
}
}
}