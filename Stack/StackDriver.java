package Stack;

import java.util.Stack;

public class StackDriver {

    public static void main(String[] args){

        Stack<Integer> myStack = new Stack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack.peek());
        System.out.println(myStack.peek());

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        while (!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }


    }
}
