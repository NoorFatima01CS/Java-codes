import java.util.*;
public class PrintBill{
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
        System.out.println("input");
        System.out.println("enter no of pages");
        int Mono1=in.nextInt();
        System.out.println("enter no of pages");
         int Colour1=in.nextInt();
        final double MONOPAGE_RATE=2.50;
        final double COLOURPAGE_RATE=8.00;
         double Mono=Mono1*MONOPAGE_RATE;
        double Colour=Colour1*COLOURPAGE_RATE;
        double binding=40.00;
        double Subtotal= Mono+Colour+binding;
        double Tax=0.05;
        Tax=(Subtotal*0.05);
        double Total=Subtotal+Tax;
        System.out.printf( java.util.Locale.US, "Mono: %.2f%n",  Mono);
        System.out.printf(java.util.Locale.US,  "Colour: %.2f%n",  Colour);
         System.out.printf(java.util.Locale.US, "Subtotal: %.2f%n",  Subtotal);
        System.out.printf(java.util.Locale.US,  "Tax: %.2f%n",  Tax);
         System.out.printf(java.util.Locale.US, "Total: %.2f%n",  Total);




























    }
























}
