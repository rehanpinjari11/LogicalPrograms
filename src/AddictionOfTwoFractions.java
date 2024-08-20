import java.util.Scanner;

public class AddictionOfTwoFractions {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first numerator");
        int n1 = sc.nextInt();

        System.out.println("Enter the first denominator");
        int d1 = sc.nextInt();

        System.out.println("Enter the second numerator");
        int n2 = sc.nextInt();

        System.out.println("Enter the first denominator");
        int d2 = sc.nextInt();

        System.out.println(fraction(n1, d1, n2, d2));
    }

    public static int fraction(int n1, int d1, int n2, int d2)
    {
        int res = 0;
        int x, y = 0;

        x = (n1 * d2) + (n2 * d1);
        y = (d1 * d2);

        res = x / y;

        System.out.println(n1 + "/" + d1);
        System.out.println(n2 + "/" + d2);
        System.out.println(x + "/" + y);

        return res;

    }


}
