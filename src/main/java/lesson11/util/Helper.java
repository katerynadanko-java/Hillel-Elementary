package lesson11.util;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {
    public static Optional checkEmail(String string) {
        Optional<String> emailNull = Optional.empty();
        if (string == null || string.isEmpty()) {
            return emailNull;
        }
        Pattern pattern = Pattern.compile("^\\w+\\@(([g][m][a][i][l]+\\.[c][o][m])|(\\D+\\.[n][e][t] | [u][a]))$");
        Matcher input = pattern.matcher(string);
        boolean matches = input.matches();

        Optional<String> emailNotNull = Optional.of(string);
        if (!matches) {
            return emailNull;
        }
        return emailNotNull;
    }
}
