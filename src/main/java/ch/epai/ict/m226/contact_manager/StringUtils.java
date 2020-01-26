package ch.epai.ict.m226.contact_manager;

public class StringUtils {

    public static String emptyStringIfNull(String value) {
        if (value != null) {
            return value;
        }
        return "";
    }
}
