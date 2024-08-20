import java.util.Scanner;

public class HexadecimalToDecimal {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value");
        String num = sc.next();

        System.out.println(getDecimal(num));
    }

    public static int getDecimal(String hex)
    {
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();

        int val = 0;

        for (int i = 0; i < hex.length(); i++)
        {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;

        }

        return val;
    }

}
