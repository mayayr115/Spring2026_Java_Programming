package StackADT;

import java.util.EmptyStackException;

/**
 * This class represents an Array Based Stack.
 * This class includes methods for pushing an item into the stack,
 * popping the top item from the stack, peeking the top of the stack,
 * checking if the stack is empty, and resizing the stack if it's at max capacity.
 *
 * All methods are able to be called after creating an instance.
 *
 * Example usage:
 * ArrayBasedStack.push("10");  // Puts 10 in the stack
 * ArrayBasedStack.pop();    // Pops 10 from the stack and returns the value
 * ArrayBasedStack.peek();   // Returns 10
 * ArrayBasedStack.isEmpty();   // Returns false
 * ArrayBasedStack.resize();   // Doubles the capacity of the stack
 *
 * @author Maya Ramkishun
 * @version 1.1
 * @since Spring 2026
 */

public class ArrayBasedStack implements StackADT {
  private String[] stack;
  private int capacity = 5;
  private int size = 0;

  /**
   * Constructs an Array Based Stack with a capacity of 5.
   */
  public ArrayBasedStack() {
    stack = new String[capacity];
  } // ArrayBasedStack
  
  /**
   * Pushes an item into the stack.
   * If the stack is at max capacity, it will resize itself to double the previous capacity.
   *
   * @param item the item that's being pushed into the stack
   */
  @Override
  public void push(String item) {
    if (size == capacity) resize();
    stack[size] = item;
    size++;
  } // push

  /**
   * Pops the top item from the stack and returns the value.
   * Stack cannot be empty.
   * 
   * the method may throw an exception
   *
   * @return {@code item} after popping it from the top of the stack
   * @throws EmptyStackException if stack is empty
   */
  @Override
  public String pop() {
    if (isEmpty()) throw new EmptyStackException();
    size--;
    String item = stack[size];
    stack[size] = null;
    return item;
  } // pop

  /**
   * Returns the value of the top item of the stack.
   * Stack cannot be empty.
   * 
   * the method may throw an exception
   *
   * @return the top value of the stack
   * @throws EmptyStackException if stack is empty
   */
  @Override
  public String peek() {
    if (isEmpty()) throw new EmptyStackException();
    return stack[size - 1];
  } // peek

  /**
   * Returns true if the stack is empty.
   *
   * @return {@code true} if the stack is empty
   */
  @Override
  public boolean isEmpty() {
    return size == 0;
  } // isEmpty

  /**
   * Resizes the stack when it's at max capacity.
   */
  public void resize() {
    String[] newStack = new String[capacity * 2];
    for (int i = 0; i < size; i++) {
      newStack[i] = stack[i];
    }
    stack = newStack;
  } // resize
}
