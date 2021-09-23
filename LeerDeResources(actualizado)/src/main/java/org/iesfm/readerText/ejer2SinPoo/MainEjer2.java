package org.iesfm.readerText.ejer2SinPoo;

import org.iesfm.readerText.ejer2SinPoo.FilesReader;

import java.io.IOException;

public class MainEjer2 {
    public static void main(String[] args) throws IOException {
        FilesReader files = new FilesReader("/home/raulalbarran/files/");
        files.readFiles();

    }
}
