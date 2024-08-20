import java.util.Scanner;

public class DecimalToHexadecimal1 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int num = sc.nextInt();

        System.out.println(deciToHexa(num));

    }

    public static String deciToHexa(int num)
    {
        String hex = "";
        int rem;

        while(num != 0)
        {
            rem = num % 16;

            if(num > 9)
            {
                hex = (char) (rem + 55) + hex;
            }
            else
            {
                hex = rem + hex;
            }

            num = num / 16;
        }

        return hex;
    }
}
