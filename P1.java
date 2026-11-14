import java.util.*;

public class P1{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
System.out.print("enter n:");
int n=in.nextInt();
int sum=0;
for(int i=1;i<=n;i++){
sum+=i*i;
}
System.out.println(sum);
}
}