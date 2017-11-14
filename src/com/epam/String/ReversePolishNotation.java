package com.epam.String;


import java.util.ArrayList;

public class ReversePolishNotation {
    public static void main(String[] args) {
        //divide by zero test
        //String reversePolishString = "1 1 8 0 / - / 3 0 * 2 1 1 + + -";
        String reversePolishString = "5 1 2 + 4 * + 3 -";
        String result = null;
        try {
            result = ReversePolishNotation.parseString(reversePolishString);
        } catch (RPNParserException e) {
            e.printStackTrace();
        }
        System.out.println("Result = " + result);

    }


    /**
     * @param reversePolishString String
     * @return String
     * @throws RPNParserException
     */
    private static String parseString (String reversePolishString) throws RPNParserException {
        ArrayList<String> stack = new ArrayList<String>();
        String[] charArray =  reversePolishString.split(" ");
        String regexp = "[-+*\\/]";
        String charRegexp = "[a-zA-Z]+$";
        for (int i = 0; i <= charArray.length - 1; i++) {
            String currentChar = charArray[i];
            if (currentChar.matches(charRegexp)){
                throw new RPNParserException();
            }
            boolean matchArithmeticsOperator = currentChar.matches(regexp);
            if (!matchArithmeticsOperator) {
                stack.add(stack.size(), currentChar);
            } else {
                String result = ReversePolishNotation.calculate(currentChar, stack);
                stack.add(stack.size(), result);
            }
        }
        return String.valueOf(stack.get(0));
    }

    /**
     * @param operator String
     * @param stack ArrayList
     * @return string
     */
    private static String calculate(String operator, ArrayList stack) {
        int length = stack.size();
        int operand1 = Integer.parseInt(String.valueOf(stack.get(length - 2)));
        int operand2 = Integer.parseInt(String.valueOf(stack.get(length - 1)));
        stack.remove(length - 1);
        stack.remove(length - 2);
        int result = 0;
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                try {
                    result = operand1 / operand2;
                } catch (ArithmeticException e){
                    System.out.println("divide by zero");
                }
                break;
        }
        return String.valueOf(result);
    }
}
