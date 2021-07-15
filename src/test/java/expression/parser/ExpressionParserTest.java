package expression.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionParserTest {

    @Test
    void isBalanced() {
        String expression = "[a + b] - { a * ( c + b ) } \\ { a + b }";
        assertTrue(ExpressionParser.isBalanced(expression));

    }
}