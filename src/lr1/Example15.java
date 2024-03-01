package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        in.close();

        System.out.println(
            String.format(
                "%d, %d", 
                (number1+number2), (number1-number2)
            )
        );
    }
}
