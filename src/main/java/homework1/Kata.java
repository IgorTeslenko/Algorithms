package homework1;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            sb.append(number);
        }
        sb.insert(0, '(').insert(4,')').insert(5,' ').insert(9, '-');
        return sb.toString();
    }
}