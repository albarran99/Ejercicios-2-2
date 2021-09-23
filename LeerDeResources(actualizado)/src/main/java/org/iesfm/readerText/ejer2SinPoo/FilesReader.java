package org.iesfm.readerText.ejer2SinPoo;

import org.iesfm.readerText.ejr1.MainEjer1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FilesReader {

    private static final Logger log = LoggerFactory.getLogger(MainEjer1.class);

    private String pathFile;


    public FilesReader(String pathFile) {
        this.pathFile = pathFile;
    }

    public void readFiles() {
        File file = new File(pathFile);
        for (File lastFile : file.listFiles()) {

            try (BufferedReader reader =
                         new BufferedReader(
                                 new FileReader(
                                         new File(String.valueOf(lastFile))))) {
                StringBuilder str = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    str.append(line).append("\n");
                }

                log.info(String.valueOf((str)));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
