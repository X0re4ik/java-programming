package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Месяц: ");
        String month = in.nextLine();

        System.out.println("Количество дней: ");
        int qtyDays = in.nextInt();
        in.close();
        
        System.out.println(
            String.format("В %s вот столько дней %d", month, qtyDays)
        );
    }
}
