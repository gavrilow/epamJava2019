import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = s.nextInt();
        int m = n;
        String b = Integer.toBinaryString(m);
        System.out.println("Binary: " + b);
        int a = 0;

        while(n > 0)
        {
            int x = n % 2;
            a = a * 2 + x;
            n = n / 2;
        }
        if(a == m)
        {
            System.out.println("Number "+ b +" PALINDROME");
        }
        else
        {
            System.out.println("Number "+ b +" NOT PALINDROM");
        }
    }
}
