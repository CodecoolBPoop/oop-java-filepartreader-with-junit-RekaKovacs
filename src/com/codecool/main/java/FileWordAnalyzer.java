package src.com.codecool.main.java;

import java.util.ArrayList;
import java.util.List;

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
    public ArrayList wordsByABC () {
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