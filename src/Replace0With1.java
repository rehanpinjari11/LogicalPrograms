import java.util.Scanner;

public class Replace0With1 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int num = sc.nextInt();

        System.out.println(Replace(num));

    }

    public static String Replace(int num)
    {
        int rem;
        String temp = "";

        while(num != 0)
        {
            rem = num % 10;

            if(rem == 0){
                rem = 1;
            }

            temp = rem + temp;
            num = num / 10;
        }

        return temp;


    }
}
