package leetCode.string;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strings){
        if (strings.length>0 ) {
            char[] stringToCompare = strings[0].toCharArray();
            int matchChar = stringToCompare.length;

            for (String str : strings) {
                int i = 0;
                char[] compareWith =  str.toCharArray();
                while ( i <= (stringToCompare.length - 1)
                        && i <= (compareWith.length - 1)
                        && compareWith[i] == stringToCompare[i])
                    i++;
                if (matchChar >= i)
                    matchChar = i;
            }
            return strings[0].substring(0,matchChar);
        }
        return "";
    }
}
