package org.launchcode;
import java.util.Scanner;

public class AliceInWonderland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by " +
                "her sister on the bank, and of having nothing to do: once or twice she" +
                " had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, and what is the use of a book, " +
                "thought Alice 'without pictures or conversation?'";
        String newSentence = sentence.toLowerCase();
        //System.out.println(newSentence);
        System.out.println("What word or phrase would you like to search for? ");
        String wordSearched = input.nextLine().toLowerCase();
        //System.out.println(wordSearched);
        input.close();
        Boolean isThere = newSentence.contains(wordSearched);
        //System.out.println(isThere);
        if (isThere.equals(true)) {
            System.out.println(wordSearched + " is in the sentence");
        } else {
            System.out.println(wordSearched + " is not in the sentence");
        }


    }
}
