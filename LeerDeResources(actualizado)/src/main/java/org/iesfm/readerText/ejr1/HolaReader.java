package org.iesfm.readerText.ejr1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HolaReader {

    private static final Logger log = LoggerFactory.getLogger(MainEjer1.class);

    public void readHolaMundo() {
        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(
                                     new File("/tmp/hola.txt")))) {
            StringBuilder str = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                str.append(line + "\n");
            }

            log.info(String.valueOf(str));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
