package leetCode.string;


public class CountAndSay {

    public String countAndSay(int n) {
        if (n <= 0)
            return "";
        if (n == 1)
            return "1";
        else {
            String values = countAndSay(n-1);
            StringBuilder ret = new StringBuilder();
            char comparator = values.toCharArray()[0];
            int count = 0;
            for (char val : values.toCharArray()) {
                if (val != comparator) {
                    ret.append(String.valueOf(count)).append(String.valueOf(comparator));
                    count = 1;
                    comparator = val;
                }
                else
                    count++;
            }
            return ret.append(count).append(String.valueOf(comparator)).toString();
        }
    }
}
