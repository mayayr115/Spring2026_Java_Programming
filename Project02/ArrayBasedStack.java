// package Project02;

public class ArrayBasedStack implements StackADT {
  private String[] stack;
  private int capacity = 5;
  private int topIdx = stack[0];
  
  @Override
  public void push(String item) {
    stack.resize();
  }

  @Override
  public String pop() {
    return "";
  }

  @Override
  public String peek() {
    return "";
  }

  @Override
  public boolean isEmpty() {
    return true;
  }

  public void resize() {
    if (stack.length == capacity) {
      String[] newStack = new String[capacity*2];
    };
  }
}
