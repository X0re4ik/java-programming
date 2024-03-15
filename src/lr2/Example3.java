package lr2;
import java.util.Scanner;

public class Example3
{
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
	    System.out.println("Введите текст для шифрования");
        String message = in.nextLine();
        System.out.println("Введите ключ");
        int key = in.nextInt();
        String codeMessage = getCodingIncodeMessage(message, key);
        System.out.println("Текст после преобразования: " + codeMessage);
        
        System.out.println("Выполнить обратное преобразование? (y/n)");
        String code = in.nextLine();
        
        if (code == "y") {
            String deCodeMessage = getCodingIncodeMessage(codeMessage, -key);
            System.out.println("Текст после обратного преобразования: " + deCodeMessage);
        }
        else if (code == "n") {
            System.out.println("Досвидание");
        }
        else {
            System.out.println("Введите корректный ответ");
        }
        in.close();
	    
	}
	
	private static String getCodingIncodeMessage(String message, int key) {
        StringBuilder strBox = new StringBuilder(message.length());
        char tmp;
        for (int i = 0; i < message.length(); i++) {
            tmp = message.charAt(i);
            if (Character.isLetter(message.charAt(i))) {
                tmp += key % 26;
                if (tmp > 'z')
                    tmp = (char)(tmp % 'z' + 'a');
                else if (tmp < 'a')
                    tmp = (char)(tmp + 25);
            }
            strBox.append(tmp);
        }
        return strBox.toString();
    }
}