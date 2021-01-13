package test.stack_queue;

import stack_queue.EvaluateReversePolishNotation;

public class EvaluateReversePolishNotationTest {
    public static void main(String[] args) {
        EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();
        String[] token1 = {"2", "1", "+", "3", "*"};  //9
        int result1 = evaluateReversePolishNotation.evalRPN(token1);
        System.out.println("result:" + result1);
        String[] token2 = {"4", "13", "5", "/", "+"}; //6
        int result2 = evaluateReversePolishNotation.evalRPN(token2);
        System.out.println("result:" + result2);
    }
}
