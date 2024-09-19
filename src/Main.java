import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

    }

    public static void registration(String login, String password, String confirmPassword) {
        Pattern pattern = Pattern.compile("^a-ZA-Z_0-9");
        Matcher matcher = pattern.matcher(password);

    }
}