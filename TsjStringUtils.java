package TekkSparrowJavaUtils;

public class TsjStringUtils {
    /**
     * Trims a String of a repeating character (leading & trailing). 
     * Used to remove superfluous delimiters.
     * @param input String with target trailing characters to remove.
     * @param target char value to remove from string.
     * @return
     */
    public static String trimRepeatingDelimiters(final String input, final char target) {
        final StringBuilder sb = new StringBuilder();
        if (input.isEmpty()) {
            return sb.toString();
        }
        
        Character current = input.charAt(0);
        Character previous = null;
        
        for (int i = 0; i < input.length(); i++) {
            current = input.charAt(i);
            if (!current.equals(target)) {
                sb.append(current);
            } else {
                if (current.equals(target) && !current.equals(previous) && (i != 0)) {
                    sb.append(current);
                }
            }
            previous = current;
        }
        if (sb.toString().isEmpty()) {
            return null;
        } else if (sb.toString().charAt(sb.toString().length()-1) == target) {
            return sb.toString().substring(0, sb.toString().length()-1);
        } else {
            return sb.toString();
        }
    }
}