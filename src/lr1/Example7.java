package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("День недели: ");
        String dayOfWeek = in.nextLine();

        System.out.println("Месяц: ");
        String month = in.nextLine();

        System.out.println("Число: ");
        int numberOfMonth = in.nextInt();
        in.close();
        
        System.out.println(
            String.format("%d (%s), %s", numberOfMonth, dayOfWeek, month)
        );
    }
}
