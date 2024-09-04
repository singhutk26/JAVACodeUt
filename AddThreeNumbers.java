import java.util.Scanner;
public class Main 
{
    public static void main (String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        a=sc.nextInt();
        System.out.println("Enter Second Number");
        b=sc.nextInt();
        System.out.println("Enter Third Number");
        c=sc.nextInt();
        int sum=a+b+c;
        System.out.println("Sum : "+sum);
    }
}