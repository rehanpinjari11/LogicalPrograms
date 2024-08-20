public class NumberToWord {

    public static void main(String[] args)
    {
        int num = 9;

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", " Six", "Seven", "Eight", " Nine", "Ten"};

        if (num >= 0 && num <= 9)
        {
            System.out.println(words[num]);
        }
        else
        {
            System.out.println("Invalid Input, Please enter the number between 0 to 9");
        }

    }
}
