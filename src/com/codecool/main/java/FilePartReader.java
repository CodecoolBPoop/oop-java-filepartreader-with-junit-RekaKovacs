package src.com.codecool.main.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FilePartReader {
    private String filePath;
    private Integer fromLine;
    private Integer toLine;

    /*
    It has one constructor :
    it sets the class' instance variables to some invalid default value
     */
    public FilePartReader() {
        filePath = "src/com/codecool/main/resources/dickensTaleOfTwoCities.txt";
        fromLine = 3;
        toLine = 2;
    }

    /*
    public void setup ()
        it's parameters are:
            filePath as a String
            fromLine as an Integer
            toLine as an Integer
        it throws an IllegalArgumentException :
            if toLine is smaller than fromLine
            if fromLine is smaller than 1
     */
    public void setup (String filePath, Integer fromLine, Integer toLine) {

        if (toLine < fromLine || fromLine < 1) {
            throw new IllegalArgumentException();
        }
    }

    /*
    public String read ()
    opens the file on filePath , and gives back it's content as a String
        it doesn't catch the exception being raised, if the file isn't present on filePath ,
        so actually the method throws the exception it received
     */
    public String read () throws IOException {
        BufferedReader in = null;
        String s;
        StringBuilder sb = new StringBuilder();
        in = new BufferedReader(new FileReader(filePath));
        while ((s = in.readLine()) != null)
                sb.append(s + "\n");
        return sb.toString();
    }

    /*
    reads the file with read ()
        it gives back every line from it's content between fromLine and toLine (both of them are included),
        and returns these lines as a String. Take care because if fromLine is 1, it means the very first row in the file.
        Also, if fromLine is 1 and toLine is 1 also, we will read only the very first line.
     */
    public String readLines () throws IOException {

        String allLines = this.read();
        Scanner scanner = new Scanner(allLines);
        StringBuilder sb = new StringBuilder();
        int counter = 0;

        while (scanner.hasNextLine()) {
            counter++;
            if (counter >= fromLine && counter <= toLine) {
                String line = scanner.nextLine();
                sb.append(line);
            }
        }
        scanner.close();
        return sb.toString();
    }
}