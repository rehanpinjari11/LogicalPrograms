import java.util.Scanner;

public class GCD {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second Number:");
        int num2 = sc.nextInt();

        System.out.println("Highest Common Factor is: "+GreatestCommonDivisor(num1, num2));
//        System.out.println(GreatestCommonDivisor(num1, num2));

    }

    public static int GreatestCommonDivisor(int num1, int num2)
    {
        int gcd = 0;

        for (int i = 1; i < num1 || i < num2; i++)
        {
            if (num1 % i == 0 && num2 % i == 0)
            {
                gcd = i;
            }

        }

        return gcd;
    }
}
