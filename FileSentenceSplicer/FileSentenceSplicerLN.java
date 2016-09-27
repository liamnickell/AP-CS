// In progress...

import java.util.*;
import java.io.*;

public class FileSentenceSplicerLN {

    public static void main(String args[]) {
        try {
            Path path = new Paths.get("output.txt");
            File file = new File("input.txt");
            Scanner fileInfo = new Scanner(file);

            while(fileInfo.hasNextLine()) {
                String line = fileInfo.nextLine();
                line = line.trim();
                line = line.replaceAll("[-+=_\"'\\:;/?!.,@#$%*(){}[]`~^<>]", "");
                line = line.replaceAll(" ", "\n");

                Files.write(path, line, .forName("UTF-8"));
            }
        } catch(Exception ex) {
            System.out.println("Error... ;(");
        }
    }

}