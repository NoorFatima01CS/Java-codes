import java.util.*;
public class K1{
public static void main(String args[]){
double sum=0;
int i=1;
while(i<=100){
if(i==1){
sum+=i;
}
else if(i%2==0){
sum+=i;
}
else{
sum+=1.0/i;
}
i++;
}
System.out.println(sum);
}
}