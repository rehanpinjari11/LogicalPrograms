import java.util.Scanner;

public class OctalToDecimal {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Octal Number:");
        int num = sc.nextInt();

        num = OctToDeci(num);
        System.out.println("Octal to Decimal num: "+num);
    }

    public static int OctToDeci(int num)
    {
        int sum = 0, i = 0;


        while(num != 0)
        {
            int rem = num % 10;
            num = num / 10;
            sum = (int) (sum + rem * Math.pow(8, i));
            i++;

        }

        return sum;
    }
}
