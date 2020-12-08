package homework3;

import homework3.utils.MyStack;

public class InvertString {

    public static String invertString(String original) {
        StringBuilder sb = new StringBuilder();
        MyStack<Character> strStack = new MyStack<>();
        for (char c : original.toCharArray()) {
            strStack.push(c);
        }
        int j = strStack.size();
        for (int i = 0; i < j; i++) {
            sb.append(strStack.pop());
        }
        return sb.toString();
    }
}
