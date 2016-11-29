package com.dreamerz.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;

/**
 * Created by naveen1291 on 27/11/16.
 */
public class FileUtil {

    //Convert my file to a Base64 String
    public static final String convertFileToString(File file) throws IOException {
        byte[] bytes = Files.readAllBytes(file.toPath());
        return new String(Base64.getEncoder().encode(bytes));
    }

}
