import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int num = sc.nextInt();

        System.out.println(DeciToBin(num));;

    }

    public static String DeciToBin(int num)
    {
        String bin = "";
        int rem;

        while(num != 0)
        {
            rem = num % 2;
            bin = rem + bin;
            num = num / 2;

        }

        return bin;
    }
}
