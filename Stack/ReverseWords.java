package Stack;

import java.util.Stack;

public class ReverseWords {
    public static void main(String[] args) {

        //declare and initialize string sentence.
        String originalSentence = "hope is what defines humanity";
        System.out.println("Original Sentence: " + originalSentence);

        //Declare String to store individual words.
        String word = "";

        //Declare stack of Strings.
        Stack<String> wordStack = new Stack<>();


        // Iterate through each character in the sentence
        for (int i = 0; i < originalSentence.length(); i++) {
            char ch = originalSentence.charAt(i);
            //check if the character is a space
            if (ch == ' ') {
                //if it is a space, push the current word into the stack
                wordStack.push(word);
                // Reset the word to an empty String for the next word
                word = "";
            } else {
                //if it is not a space, append the character to the current word.
                word += ch;  // Building the word
            }
        }

        // Check if there is a non-empty word remaining.
        if (!word.isEmpty()) {
            wordStack.push(word); //push the last word in the stack.
        }


        // Display the new sentence constructed from the stack
        String reversedSentence = "";
        while (!wordStack.isEmpty()) {
            reversedSentence += wordStack.pop(); // pop the top word in the stack and add it to the string
            if (!wordStack.isEmpty()) { // as long as the stack is not empty add white space after each word
                reversedSentence += " ";
            }
        }
        System.out.println("Reversed Sentence: " + reversedSentence);

    }

}
