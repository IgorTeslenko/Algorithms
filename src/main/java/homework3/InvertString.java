package homework3;

public class InvertString {

    public static String invertString(String original) {
        StringBuilder sb = new StringBuilder();
        for (int i = original.toCharArray().length - 1; i >= 0; i--) {
            sb.append(original.toCharArray()[i]);
        }
        return sb.toString();
    }
}
