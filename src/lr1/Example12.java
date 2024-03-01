package lr1;

import java.util.Scanner;
import java.time.LocalDate;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Возраст: ");
        int age = in.nextInt();
        in.close();

        LocalDate currentDate = LocalDate.now();
        int yearOfBirth = currentDate.getYear() - age;
        
        System.out.println(
            String.format(
                "Вы родились вот тогда то: %d", yearOfBirth)
        );
    }
}
