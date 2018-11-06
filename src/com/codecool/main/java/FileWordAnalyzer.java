package src.com.codecool.main.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

public class FileWordAnalyzer {

    /*
    It has one constructor :
    it's parameter is a FilePartReader object
     */
    public FileWordAnalyzer(FilePartReader filePartReader) {
    }

    /*
    public ArrayList wordsByABC ():
        calls FilePartReader.readLines ()
        returns the words ordered by alphabetically as an ArrayList
     */
    public ArrayList wordsByABC (FilePartReader filePartReader) throws IOException {
        ArrayList<String> listWordsByABC = new ArrayList();
        String text = filePartReader.readLines();
        String[] words = Pattern.compile("\\s+").split(text);
        for (String word : words) {
            listWordsByABC.add(word);
        }
        Collections.sort(listWordsByABC);
        return listWordsByABC;
    }

    /*
    public ArrayList wordsContainingSubString (String subString ):
        calls FilePartReader.readLines ()
        returns the words which contains the subString
     */
    public ArrayList wordsContainingSubString (String subString, FilePartReader filePartReader) throws IOException {
        ArrayList<String> listWordsContainingSubString = new ArrayList();
        String text = filePartReader.readLines ();
        String[] words = Pattern.compile("\\s+").split(text);
        for (String word : words) {
            if (word.toLowerCase().contains(subString.toLowerCase()) {
                listWordsContainingSubString.add(word);
            }
        }
        return listWordsContainingSubString;
    }

    /*
    public ArrayList wordsArePalindrome ():
        calls FilePartReader.readLines ()
        returns the words from the String which are palindrome
    */
    public ArrayList wordsArePalindrome (FilePartReader filePartReader) throws IOException {
        ArrayList<String> listWordsArePalindrome = new ArrayList();
        String text = filePartReader.readLines ();
        String[] words = Pattern.compile("\\s+").split(text);
        for (String word : words) {
            if (word.equals(new StringBuilder(word).reverse().toString())) {
                listWordsArePalindrome.add(word);
            }
        }
        return listWordsArePalindrome;
    }
}

