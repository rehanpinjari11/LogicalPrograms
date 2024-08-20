import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args)
    {
        for (int n = 1; n <= 100 ; n++)
        {
            if(n == 0 || n == 1)
            {
                continue;
            }

            int count = 2;

            for (int i = 2; i < n/2 ; i++)
            {
                if(n % i == 0)
                {
                    count++;
                }

            }

            if (count == 2)
            {
                System.out.println("Prime Numbers: "+n);
            }


        }

    }
}
