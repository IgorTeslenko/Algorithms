package homework1;

import java.util.HashSet;

public class PangramChecker {

    private static final String ABC = "abcdefghijklmnopqrstuvwxyz";

    public boolean check(String sentence) {

        HashSet<Character> abc = new HashSet<>();

        for (char c : ABC.toCharArray()) {
            abc.add(c);
        }
        for (char c : sentence.toLowerCase().toCharArray()) {
            abc.remove(c);
        }

        return abc.size() == 0;
    }
}
