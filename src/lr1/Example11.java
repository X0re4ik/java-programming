package lr1;

import java.util.Scanner;
import java.time.LocalDate;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Имя: ");
        String name = in.nextLine();

        System.out.println("Год рождения: ");
        int yearOfBirth = in.nextInt();
        in.close();

        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - yearOfBirth;
        
        System.out.println(
            String.format(
                "%s, вам вот столько годиков: %d", name, age)
        );
    }
}
