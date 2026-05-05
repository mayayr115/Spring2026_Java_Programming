package Project02;

public class InfixConverter {
  public StackADT stack;

  public InfixConverter(StackADT stack) {
    this.stack = stack;
  }

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
      else if (IsOp(x[i])) {
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
  }

  public boolean pemdas(String op1, String op2) {
    if (op2.equals("(") || op2.equals(")")) return false;
    if ((op1.equals("*") || op1.equals("/")) && (op2.equals("+") || op2.equals("-"))) return false;
    return true;
  }

  public boolean IsOp(String el) {
    return el.equals("+") | el.equals("-") | el.equals("/") | el.equals("*");
  }
}
