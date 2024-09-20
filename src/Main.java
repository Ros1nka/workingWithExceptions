import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String login = "rwfDDg45gf";
        String password = "sfeb_rewf1235";
        String confirmPassword = "sfeb_rewf1235";

        try {
            registration(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Ошибка логина");
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка пароля");
        }
    }

    public static void registration(String login, String password, String confirmPassword) {
        if (!compliance(login)) {
            throw new WrongLoginException();
        }
        if (!compliance(password) || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }
  
    public static boolean compliance(String item) {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9_]");
        Matcher matcher = pattern.matcher(item);

        return item.length() <= 20 && !matcher.find();
    }
}
