package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Имя ");
        String name = in.nextLine();

        System.out.println("Фамилия: ");
        String secondName = in.nextLine();

        System.out.println("Отчество: ");
        String middleName = in.nextLine();
        in.close();
        
        System.out.println(
            String.format("Hello %s %s %s", middleName, name, secondName)
        );
    }
}
