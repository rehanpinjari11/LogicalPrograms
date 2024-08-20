import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Binary Value:");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0, power = 0;

        while(n != 0)
        {
            int digit = n % 10;
            sum = sum + digit * pow(2, power);
            power++;
            n = n / 10;
        }

        System.out.println("Decimal Value of "+temp+ " is: "+sum);


    }

    public static int pow(int n, int p)
    {
        int res = 1;

        for (int i = 1; i <= p ; i++)
        {
            res = res * i;
            
        }

        return res;
    }
}
