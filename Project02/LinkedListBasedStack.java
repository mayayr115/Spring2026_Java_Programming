package Project02;

import java.util.EmptyStackException;

public class LinkedListBasedStack implements StackADT{
private String[] stack;
  private int capacity = 5;
  private int size = 0;

  public LinkedListBasedStack() {
    stack = new String[capacity];
  }
  
  @Override
  public void push(String item) {
    if (size == capacity) resize();
    stack[size] = item;
    size++;
  }

  @Override
  public String pop() {
    if (isEmpty()) throw new EmptyStackException();
    size--;
    String item = stack[size];
    stack[size] = null;
    return item;
  }

  @Override
  public String peek() {
    if (isEmpty()) throw new EmptyStackException();
    return stack[size - 1];
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  public void resize() {
    String[] newStack = new String[capacity * 2];
    for (int i = 0; i < size; i++) {
      newStack[i] = stack[i];
    }
    stack = newStack;
  }
}
