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
        if (IsOp(x[i])) {
          stack.push(x[i]);
        }
      }
      else if (IsOp(x[i])) {
        stack.push(x[i]);
      }
      else {
        post += x[i];
      }
    }
    return post;
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
