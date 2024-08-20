import java.util.Scanner;

public class CalculateNoOfDigit {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n = sc.nextInt();

        System.out.println(calDigit(n));
    }

    public static int calDigit(int n)
    {
        int count = 0;

        while(n != 0)
        {
            n = n / 10;
            count++;

        }

        return count;
    }
}
