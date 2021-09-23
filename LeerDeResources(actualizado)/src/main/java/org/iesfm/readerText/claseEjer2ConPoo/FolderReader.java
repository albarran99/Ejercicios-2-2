package org.iesfm.readerText.claseEjer2ConPoo;

import java.io.File;
import java.io.FileNotFoundException;

public class FolderReader {

    public static void main(String[] args) throws FileNotFoundException {
        FolderReader reader = new FolderReader();

        reader.readAll("/home/raulalbarran/files");
    }

    public String readAll(String folderPath) throws FileNotFoundException {
        FileToStringReader reader = new FileToStringReader();
        File folder = new File(folderPath);
        StringBuilder builder = new StringBuilder();
        for (File file :folder.listFiles()) {
            builder.append(reader.readFile(file)).append("\n");
        }
        System.out.println(builder);

        return builder.toString();
    }
}
