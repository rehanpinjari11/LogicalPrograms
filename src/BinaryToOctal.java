import java.util.Scanner;

public class BinaryToOctal {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Binary Number:");
        int num = sc.nextInt();

        System.out.println(BinToOct(num));

    }

    public static String BinToOct(int num)
    {
        int rem, sum = 0, rem_new = 0;
        int count = 0;
        String temp = "";

        while(num != 0)
        {
            rem = num % 1000;

            while(rem != 0)
            {
                rem_new = rem % 10;
                sum = sum + rem_new * (int) Math.pow(2, count);
                count++;
                rem /= 10;

            }

            temp = sum + temp;
            sum = 0;
            count = 0;
            num /= 1000;
        }

        return temp;
    }
}
