package test.stack_queue;

import stack_queue.EvaluateReversePolishNotation;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

public class EvaluateReversePolishNotationTest {
    public static void main(String[] args) throws EmptyStackException {
        EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();
        String str = "57 * 21 + ( ( 135 + 2 * 67 ) * 4 - 216 + ( 34 - 16 * 5 + 18 * 9 ) * 6 - 73 ) * 3 - 32 * 13 - 119";
        // 实现中缀表达式转后置
        List<String> strArr = evaluateReversePolishNotation.infixToPostfix(str);
        System.out.println("result:" + strArr);
        // 逆波兰表达式的计算
        int result = evaluateReversePolishNotation.evalRPN(strArr);
        System.out.println("result: " + result);
    }
}