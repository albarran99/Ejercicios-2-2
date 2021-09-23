package org.iesfm.readerText;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FilesReader files = new FilesReader("/home/raul/files/");

//        files.showFile("/home/raul/files/");
        files.readFiles();

    }
}
