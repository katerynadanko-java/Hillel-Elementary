package lesson11.util;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {
    private static Pattern pattern = Pattern.compile("^\\w+\\@(([g][m][a][i][l]+\\.[c][o][m])|(\\D+\\.[n][e][t] | [u][a]))$");

    public static Optional checkEmail(String string) {
        return string == null || string.isEmpty() || !pattern.matcher(string).matches() ? Optional.empty() : Optional.of(string);
    }
}
