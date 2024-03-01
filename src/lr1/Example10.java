package lr1;

import java.util.Scanner;
import java.time.LocalDate;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Год рождения: ");
        int yearOfBirth = in.nextInt();
        in.close();

        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - yearOfBirth;
        
        System.out.println(
            String.format(
                "Вам вот столько годиков: %d", age)
        );
    }
}
