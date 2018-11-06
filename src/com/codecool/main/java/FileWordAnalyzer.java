package src.com.codecool.main.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class FileWordAnalyzer {
    ArrayList<String> wordsByABCList = new ArrayList();
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
        String text = filePartReader.readLines();
        String[] words;
        words = Pattern.compile("\\s+").split(text);
        for (String word : words) {
            wordsByABCList.add(word);
        }
        Collections.sort(wordsByABCList);
        return wordsByABCList;
    }
}

/*

It has three instance methods:

    public ArrayList wordsContainingSubString (String subString ):
        calls FilePartReader.readLines ()
        returns the words which contains the subString
    public ArrayList wordsArePalindrome ():
        calls FilePartReader.readLines ()
        returns the words from the String which are palindrome

 */