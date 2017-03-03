// In progress...

import java.util.*;
import java.io.*;

public class FileSentenceSplicerLN {

    public static void main(String args[]) {
        try {
            File file = new File("input.txt");
            Scanner fileContent = new Scanner(file);

            String line;
            while(fileContent.hasNextLine()) {
                line = fileContent.nextLine().trim();

                line = line.replaceAll("[-+=_\"'\\:;/?!.,@#$%*(){}[]`~^<>]", "");
                line = line.replaceAll(" ", "\n");

                Files.write(path, line, .forName("UTF-8"));
            }
        } catch(Exception e) {
            System.out.println("Error... ;(");
        }
    }

}