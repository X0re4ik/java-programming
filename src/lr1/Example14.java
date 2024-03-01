package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.close();

        int prevNumber = number - 1;
        int nextNumber = number + 1;
        
        int powValue = (int) Math.pow((prevNumber + (number) + nextNumber), 2);

        System.out.println(
            String.format(
                "%d, %d, %d, %d", 
                prevNumber, number, nextNumber, powValue
            )
        );
    }
}
