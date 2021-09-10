import java.util.Scanner;
public class convert1{
public static void main(String args[])
{
System.out.print("Enter an integer: ");
Scanner sc1 = new Scanner(System.in);
int a = sc1.nextInt(); 
long num1 = a;
System.out.println("Long value of "+a+" is: "+num1); 

System.out.print("Enter a long number: ");
Scanner sc2 = new Scanner(System.in);
long b = sc2.nextInt();
float num2 = b;
System.out.println("Float value of "+b+" is: "+num2); 
   }
}