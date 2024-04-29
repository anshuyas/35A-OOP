package week3;
import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {
        /*Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and performs the corresponding arithmetic operation using a switch case statement*/
        Scanner input = new Scanner(System.in);
 
         System.out.print("Enter first number: ");
         int n1 = input.nextInt();
 
         System.out.print("Enter first number: ");
         int n2 = input.nextInt();
 
         System.out.print("Give me an operator: ");
         String o = input.next();
 
         switch (o) {
         case "+":   
             System.out.println(n1 + n2);
             break;
         case "-":   
             System.out.println(n1 - n2);
             break;
         case "*":   
             System.out.println(n1 * n2);
             break;
         case "/":   
             System.out.println(n1 / n2);
             break;
 
         default:
             System.out.println("Error, invalid operand.");
        
       }
    }
}
