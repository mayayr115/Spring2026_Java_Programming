package StackADT;

/**
 * This class represents the Infix Converter.
 * This class includes methods for converting the infix expression to a postfix expression,
 * utilizing PEMDAS order of operations, and checking if the string has an operation present.
 *
 * All methods are able to be called after creating an instance.
 *
 * Example usage:
 * InfixConverter.toPostfix("10 + 2 * 6");  // Returns 10 2 6 * +
 * InfixConverter.pemdas();    // Checks for the presence of parentheses, then determines what operation to prioritize first
 * InfixConverter.isOp();   // Returns true if it finds +, -, /, or * in the infix expression
 *
 * @author Maya Ramkishun
 * @version 1.1
 * @since Spring 2026
 */

public class InfixConverter {
  public StackADT stack;

  /**
   * Constructs the InfixConverter class to take a stack as an input.
   * 
   * @param stack the expression that needs to be converted
   */
  public InfixConverter(StackADT stack) {
    this.stack = stack;
  } // InfixConverter

  /**
   * Converts the infix expression to a postfix expression.
   * 
   * @param input the infix expression being converted to a postfix expression
   * @return the postfix expression
   */
  public String toPostfix(String input) {
    String[] x = input.split(" ");
    String post = "";

    for (int i = 0; i < x.length; i++) {
      if (x[i].equals("(")) {
        stack.push(x[i]);
      }

      else if (x[i].equals(")")) {
        while (!stack.isEmpty() && !stack.peek().equals("(")) {
          post += stack.pop() + " ";
        }
        stack.pop();
      }

      // When current element is +, -, /, *
      else if (isOp(x[i])) {
        while (!stack.isEmpty() && pemdas(x[i], stack.peek())) {
          post += stack.pop() + " ";
        }
        stack.push(x[i]);
      }

      else {
        post += x[i] + " ";
      }
    }
    while (!stack.isEmpty()) {
      post += stack.pop() + " ";
    }
    return post.trim();
  } // toPostfix

  /**
   * Checks for the presence of parentheses, then determines what operation to prioritize first.
   * 
   * @param op1 an element in the String[]
   * @param op2 another element in the String[]
   * @return {@code true} if there are no parentheses present, and if the operations are not in the following order: 
   * * +, / +, * -, / -
   */
  public boolean pemdas(String op1, String op2) {
    if (op2.equals("(") || op2.equals(")")) return false;
    if ((op1.equals("*") || op1.equals("/")) && (op2.equals("+") || op2.equals("-"))) return false;
    return true;
  } // pemdas

  /**
   * Checks if the parameter is one of the 4 math operators.
   * 
   * @param el an element in the String[]
   * @return {@code true} if {@code el} is one of the 4 operators: +, -, /, or *
   */
  public boolean isOp(String el) {
    return el.equals("+") | el.equals("-") | el.equals("/") | el.equals("*");
  }
} // isOp
