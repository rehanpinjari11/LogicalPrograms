import java.util.Scanner;

public class LCM {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the second Number:");
        int num2 = sc.nextInt();

        System.out.println("LCM of "+ num1 +" and "+num2+" is "+lowestCommonFactor(num1, num2));
//        System.out.println(lowestCommonFactor(num1, num2));


    }

    public static int lowestCommonFactor(int num1, int num2)
    {
        int gcd = 1;
        int lcm = 1;

        for (int i = 1; i <= num1 && i <= num2 ; i++)
        {
            if(num1 % i == 0 && num2 % i == 0)
            {
                gcd = i;
            }

            lcm = (num1 * num2) / gcd;

        }

        return lcm;
    }
}
