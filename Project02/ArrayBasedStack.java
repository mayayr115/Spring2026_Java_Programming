package Project02;

public class ArrayBasedStack implements StackADT {
  private String[] stack;
  private int capacity = 5;
  private int size = 0;
  
  @Override
  public void push(String item) {
    if (stack.length == capacity) resize();
    stack[size] = item;
    size++;
  }

  @Override
  public String pop() {
    if (size >= 0) {
      size--;
    }
    return stack[size];
  }

  @Override
  public String peek() {
    return stack[size];
  }

  @Override
  public boolean isEmpty() {
    return stack.length == 0;
  }

  public void resize() {
    String[] newStack = new String[capacity*2];
    for (int i = 0; i < stack.length; i++) {
      newStack[i] = stack[i];
    }
    stack = newStack;
  }
}
