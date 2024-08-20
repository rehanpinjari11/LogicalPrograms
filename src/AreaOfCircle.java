import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the raduis:");
        int r = sc.nextInt();

        System.out.println(areaOfCircle(r));
    }

    public static double areaOfCircle(int r)
    {
        double pi = 3.14;
        double area;

        area = pi * r * r;

        return area;
    }
}
