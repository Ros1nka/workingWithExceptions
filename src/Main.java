import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String login = "r213wf12345671134DDg";
        String password = "sfeb_reWf1235";
        String confirmPassword = "sfeb_reWf1235";

        try {
            verificationUser(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void verificationUser(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!verification(login)) {
            throw new WrongLoginException();
        }
        if (!verification(password) || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }

    public static boolean verification(String item) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_]{1,20}$");
        Matcher matcher = pattern.matcher(item);

        return matcher.matches();
    }
}
