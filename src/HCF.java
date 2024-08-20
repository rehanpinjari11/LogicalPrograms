import java.util.Scanner;

public class HCF {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second Number:");
        int num2 = sc.nextInt();

        System.out.println("Highest Common Factor is: "+HighestCommonFactor(num1, num2));
//        System.out.println(HighestCommonFactor(num1, num2));

    }

    public static int HighestCommonFactor(int num1, int num2)
    {
        int hcf = 0;

        for (int i = 1; i < num1 || i < num2; i++)
        {
            if (num1 % i == 0 && num2 % i == 0)
            {
                hcf = i;
            }

        }

        return hcf;
    }
}
