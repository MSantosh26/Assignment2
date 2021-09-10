import java.util.Scanner;
public class Sq
{
public static void main(String[] args)
{
System.out.print("Enter a number: ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
 
System.out.println("The square root of "+ n+ " is: "+squareRoot(n));
System.out.println("The square of "+ n+ " is: "+square(n));
}

public static double square(int num)
{
    double sq= num*num;
    return sq;
}

public static double squareRoot(int num)
{
double t;
double sqrtroot=num/2;
do
{
t=sqrtroot;
sqrtroot=(t+(num/t))/2;
}
while((t-sqrtroot)!= 0);
return sqrtroot;
}
}