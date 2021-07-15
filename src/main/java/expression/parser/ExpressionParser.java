package expression.parser;

import java.util.Stack;

public class ExpressionParser {
    public static char[][] TOKENS = {{'{', '}'}, {'[', ']'}, {'(', ')'}};

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : expression.toCharArray()) {
            if (isOpenTerm(c)) {
                stack.push(c);
            } else {
                if (!isTokenExpression(c))
                    continue;
                if (stack.empty() || !matchs(stack.pop(), c))
                    return false;
            }
        }
        return stack.empty();
    }

    private static boolean isTokenExpression(char term) {
        for (char[] array :
                TOKENS) {
            if (array[0] == term || array[1] == term)
                return true;
        }
        return false;
    }

    private static boolean matchs(Character openTerm, char closeTerm) {
        for (char[] array :
                TOKENS) {
            if (array[0] == openTerm)
                return array[1] == closeTerm;
        }
        return false;
    }

    private static boolean isOpenTerm(char c) {
        for (char[] array :
                TOKENS) {
            if (array[0] == c)
                return true;
        }
        return false;
    }
}
