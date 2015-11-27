package regulars;

import impl.Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Vaas on 27.11.2015.
 */
public class BracketValidator implements Validate {
    private Pattern pattern;

    private static final String ABC_PATTERN = "(?i)\\{?[a-z\\d]{8}-([a-z\\d]{4}-){3}[a-z\\d]{12}\\}?";

    public BracketValidator() {
        pattern = Pattern.compile(ABC_PATTERN);
    }

    @Override
    public boolean validate(final String line) {
        Matcher matcher = pattern.matcher(line);
        return matcher.matches();
    }
}