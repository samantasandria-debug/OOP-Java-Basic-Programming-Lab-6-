public class TextFormatter {

    // Converts text to uppercase
    public static String formatText(String text) {
        return text.toUpperCase();
    }

    // Repeats the string the specified number of times, separated by space
    public static String formatText(String text, int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += text;
            if (i < times - 1) {
                result += " ";
            }
        }
        return result;
    }

    // Attaches a prefix block to the front of the text
    public static String formatText(String text, String prefix) {
        return "[" + prefix + "] " + text;
    }

    public static void main(String[] args) {
        System.out.println(formatText("hello"));
        System.out.println(formatText("Echo", 3));
        System.out.println(formatText("System updated", "INFO"));
    }
}
