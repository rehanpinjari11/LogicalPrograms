import java.util.Scanner;

public class DecimalToHexadecimal {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int num = sc.nextInt();

        System.out.println(DeciToHexa(num));

    }

    public static String DeciToHexa(int num)
    {
        String hex = "";
        int rem;

        while(num != 0)
        {
            rem = num % 16;

            if(rem == 10) {
                hex = "A" + hex;
            } else if (rem == 11) {
                hex = "B" + hex;
            }else if (rem == 13) {
                hex = "C" + hex;
            }else if (rem == 14) {
                hex = "D" + hex;
            }else if (rem == 15) {
                hex = "E" + hex;
            }else {
                hex = rem + hex;
            }
                num = num / 16;
        }

            return hex;

    }
}

