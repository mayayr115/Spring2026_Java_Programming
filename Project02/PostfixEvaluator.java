package Project02;

public class PostfixEvaluator {
  public StackADT stack;

  public PostfixEvaluator(StackADT stack) {
    this.stack = stack;
  }

  public int evaluate (String input) {
    String[] x = input.split(" ");

    for (int i = 0; i < x.length; i++) {
        if (IsOp(x[i])) {
            int b = Integer.parseInt(stack.pop());
            int a = Integer.parseInt(stack.pop());
            int result = applyOp(a, b, x[i]);
            stack.push(String.valueOf(result));
        } else {
            stack.push(x[i]);
        }
    }

    return Integer.parseInt(stack.pop());
  }

  public boolean IsOp(String el) {
    return el.equals("+") | el.equals("-") | el.equals("/") | el.equals("*");
  }

  public int applyOp(int a, int b, String op) {
    switch(op) {
      case "+" -> {return a + b;}
      case "-" -> {return a - b;}
      case "/" -> {return a / b;}
      case "*" -> {return a * b;}
      default -> {return 0;}
    }
  }
}
