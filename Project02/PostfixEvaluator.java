package Project02;

public class PostfixEvaluator {
  public StackADT stack;

  public PostfixEvaluator(StackADT stack) {
    this.stack = stack;
  }

  public int evaluate (String input) {
    String[] split = input.split(" ");;
    applyOp(split);
    return 0;
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
