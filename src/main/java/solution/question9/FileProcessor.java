package solution.question9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Solution to question 9
public class FileProcessor {

    private List<String> upperCaseWords = new ArrayList<>();

    public void parseFile(String filename)  { // removed "catches IOException" - wrong syntax
        String line = "";
        // Using "try with resources" - since then BufferedReader and FileReader will
        // be closed automatically regardless of whether the exception occurs
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            while ((line = br.readLine()) != null) {
                upperCaseWords.add(line.toUpperCase());
                // line = br.readLine();// remove, otherwise you will skip every other line
                // every time we call readLine, we go to the next line

            }

        }
        catch (IOException e) { // should be IOException; catch more specific exceptions first
            System.out.println(e);

        }
        catch (Exception e) {  // not really required here, but  no harm to catch a more general exception at the end, just in case some unknown exception occurs
            System.out.println(e);
        }
    }
}
