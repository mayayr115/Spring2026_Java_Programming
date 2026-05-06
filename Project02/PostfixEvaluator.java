package Project02;

/**
 * This class represents the Postfix Evaluator.
 * This class includes methods for evaluating the postfix expression, checking if the string has an operation present,
 * and applying the appropriate operation to evaluate the postfix expression.
 *
 * All methods are able to be called after creating an instance.
 *
 * Example usage:
 * PostfixEvaluator.evaluate("10 2 6 * +");  // Returns 22
 * PostfixEvaluator.isOp();    // Returns true if it finds +, -, /, or * in the infix expression
 * PostfixEvaluator.applyOp();   // Evaluates the appropriate operation between the two numbers it was previously in between
 *
 * @author Maya Ramkishun
 * @version 1.1
 * @since Spring 2026
 */

public class PostfixEvaluator {
  public StackADT stack;

  /**
   * Constructs the PostfixEvaluator class to take a stack as an input.
   * 
   * @param stack the expression that needs to be evaluated
   */
  public PostfixEvaluator(StackADT stack) {
    this.stack = stack;
  } // PostfixEvaluator

  /**
   * Evaluates the postfix expression to a number.
   * 
   * @param input the postfix expression being evaluated
   * @return the value of the postfix expression
   */
  public int evaluate (String input) {
    String[] x = input.split(" ");

    for (int i = 0; i < x.length; i++) {
      if (isOp(x[i])) {
        int b = Integer.parseInt(stack.pop());
        int a = Integer.parseInt(stack.pop());
        int result = applyOp(a, b, x[i]);
        stack.push(String.valueOf(result));
      } else {
        stack.push(x[i]);
      }
    }
    return Integer.parseInt(stack.pop());
  } // evaluate

  /**
   * Checks if the parameter is one of the 4 math operators.
   * 
   * @param el an element in the String[]
   * @return {@code true} if {@ el} is one of the 4 operators: +, -, /, or *
   */
  public boolean isOp(String el) {
    return el.equals("+") | el.equals("-") | el.equals("/") | el.equals("*");
  } // isOp

  /**
   * Computes the value of the postfix expression.
   * 
   * @param a a number from the stack
   * @param b another number from the stack
   * @return the value of the postfix expression
   */
  public int applyOp(int a, int b, String op) {
    switch(op) {
      case "+" -> {return a + b;}
      case "-" -> {return a - b;}
      case "/" -> {return a / b;}
      case "*" -> {return a * b;}
      default -> {return 0;}
    }
  } // applyOp
}
