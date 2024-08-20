import java.util.Scanner;

public class DecimalToOctal {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int num = sc.nextInt();

        System.out.println(DeciToOct(num));

    }

    public static String DeciToOct(int num)
    {
        String oct = "";
        int rem;

        while(num != 0)
        {
            rem = num % 8;
            oct = rem + oct;
            num = num / 8;
        }

        return oct;
    }
}
