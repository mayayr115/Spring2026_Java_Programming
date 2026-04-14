package Stack;

import java.util.Scanner;
import java.util.Stack;

public class WellFormedExpression {

    // Utility function to check if a character is an open bracket
    public static boolean isOpen(char symbol) {
        return (symbol == '(' || symbol == '{' || symbol == '[');
    }

    // Utility function to check if a character is a closed bracket
    public static boolean isClosed(char symbol) {
        return (symbol == ')' || symbol == '}' || symbol == ']');
    }

    // Utility function to check if a closing bracket matches its corresponding open bracket
    public static boolean matches(char symbol, char openSymbol) {
        return (openSymbol == '(' && symbol == ')' ||
                openSymbol == '{' && symbol == '}' ||
                openSymbol == '[' && symbol == ']');
    }


    public static void main(String[] args) {

        // Flag for checking balanced status of an expression.
        boolean balanced = true;
        char symbol;
        char openSymbol;

        // Stack to store open brackets.
        Stack<Character> charStack = new Stack<Character>();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an expression then press enter.");
        String expression = keyboard.nextLine();

        // Iterate through the expression to check if it is well-formed
        for (int i = 0; i < expression.length(); i++) {
            symbol = expression.charAt(i);
            if (isOpen(symbol)) { // if open symbol, push it to the stack
                charStack.push(symbol);
            } else if (isClosed(symbol)) { // if closed symbol
                // if stack has no more open symbols (empty stack)
                if (charStack.isEmpty()) {
                    balanced = false;
                    break; // Exit the loop since the expression is not balanced
                } else {
                    // otherwise pop the top of the stack and make sure it matches the current symbol
                    openSymbol = charStack.pop();
                    if (!matches(symbol, openSymbol)) {
                        balanced = false;
                        break; // Exit the loop since the symbols don't match
                    }
                }
            }
        }

        // Make sure if the stack still has symbols that were not matched
        if (!charStack.isEmpty()) {
            balanced = false;
        }

        // Print the results
        if (balanced) {
            System.out.println("Expression is well formed!");
        } else {
            System.out.println("Expression is not well formed!");
        }
    }
}
