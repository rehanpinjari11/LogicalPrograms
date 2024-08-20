public class Quadrants {

    public static void main(String[] args)
    {
        int x = 1;
        int y = 5;

        quadrant(x, y);

    }
    public static void quadrant(int x, int y)
    {
       if (x > 0 && y > 0)
           System.out.println("lies in First quadrant");

       else if (x < 0 && y > 0)
           System.out.println("lies in Second quadrant");

       else if (x < 0 && y < 0)
           System.out.println("lies in Third quadrant");

       else if (x > 0 && y < 0)
           System.out.println("lies in Fourth quadrant");

       else if (x == 0 & y > 0)
           System.out.println("lies at Positive y axis");

       else if (x == 0 && y < 0)
           System.out.println("lies at Negative y axis");

       else if (x > 0 && y == 0)
           System.out.println("lies at Positive x axis");

       else if (x < 0 && y == 0)
           System.out.println("lies at Negative x axis");

       else
           System.out.println("lies at origin");

    }
}
