import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String login = "r213wf12345671234DDg";
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
        compliance(login);
//        if (!compliance(login)) {
//            throw new WrongLoginException();
//        }
//        if (!compliance(password) || !password.equals(confirmPassword)) {
//            throw new WrongPasswordException();
//        }
    }

    public static void compliance(String item) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_]{0,20}$");
        Matcher matcher = pattern.matcher(item);
        while (matcher.find()) {
            System.out.println("Найдено совпадение " + item.substring(matcher.start(),matcher.end()) + " с "+ matcher.start() + " по " + (matcher.end()-1) + " позицию");
        }
    }

//    public static boolean compliance(String item) {
//        Pattern pattern = Pattern.compile("[^a-zA-Z0-9_]");
//        Matcher matcher = pattern.matcher(item);
//
//        return item.length() <= 20 && !matcher.find();
//    }
}
