// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class main
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number 1");
        int a = s.nextInt();
        System.out.println("enter number 2");
     int b = s.nextInt();
     System.out.println("enter 1 for addition and 2 for Subtraction");
 int c = s.nextInt();
        switch(c) {
        case 1:{
            System.out.println("addition -> " +(a+b));
            break;}
        case 2:{
              System.out.println("substraction -> " +(a-b));
              break;}
        default: System.out.println("invalid");
    }
}
}
