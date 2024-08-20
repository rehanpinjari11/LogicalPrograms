import java.util.Scanner;

public class FindRepeatNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int num = sc.nextInt();

        System.out.println("Enter the digit to find the count:");
        int d = sc.nextInt();

        System.out.println("Total Count of "+d+" is:");
        System.out.println(repeatDigit(num, d));

    }

    public static int repeatDigit(int num, int d)
    {
        int count = 0;

        while(num != 0)
        {
            int rem = num % 10;

            if(rem == d)
            {
                d = rem;
                count++;
            }

            num = num / 10;
        }

        return count;

    }
}
