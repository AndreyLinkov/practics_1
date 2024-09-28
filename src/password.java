//5. Проверка пароля:
//   * Программа запрашивает у пользователя пароль.
//   * Программа проверяет, соответствует ли пароль определенным требованиям
//   (длина, наличие цифр, больших и маленьких букв).
//   * Программа выводит сообщение о результатах проверки.

import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter the password: ");
            // Пароль должен быть не менее 8 символов, с минимум 1 цифрой, 1 большой буквой
            String password = input.nextLine();
            if (password.length()<8) {
                System.out.println("The password must be at least 8 characters!");
            } else {
                boolean foundInt = false;
                boolean foundChar = false;

                for (int i = 0; i < password.length(); i++) {
                    if (Character.isDigit(password.charAt(i))) {
                        foundInt = true;
                    } else if (Character.isUpperCase(password.charAt(i))) {
                        foundChar = true;
                    }
                }
                if (foundInt && foundChar) {
                    System.out.println("Password created successfully!");
                    break;
                } else {
                    System.out.println("The password does not contain a capital letter or number!");
                }
            }
        } while(true);
    }
}
