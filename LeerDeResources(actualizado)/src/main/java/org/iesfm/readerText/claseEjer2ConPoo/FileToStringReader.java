package org.iesfm.readerText.claseEjer2ConPoo;

import java.io.*;

public class FileToStringReader {
    public String readFile(File file) throws FileNotFoundException {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null ) {
                builder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
}
