package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Имя ");
        String name = in.nextLine();

        System.out.println("Возраст: ");
        int age = in.nextInt();
        in.close();
        
        System.out.println(
            String.format("Имя: %s. Возраст: %d", name, age)
        );
    }
}
