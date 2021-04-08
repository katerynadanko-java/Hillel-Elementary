package lesson10;
//12345
public class ReverseSolution {
    public int reverse(int x) {
        String result = "";
        int parseInt = 0;
        int resultInt = 0;

        String s = String.valueOf(x);
        char[] chars = s.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            result = result + chars[i];
            if (x < 0)
            parseInt = Integer.parseInt(result);
            else
                parseInt = Integer.parseInt(result) * (-1);
        }
        return parseInt;
    }
}
