package com.developerDev.Libris.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class ImageToBase64 {

    public static String encodeImageToBase64(String imagePath) throws IOException{
        Path path= Paths.get(imagePath);
        byte[] imageBytes = Files.readAllBytes(path);
        return Base64.getEncoder().encodeToString(imageBytes);

    }

}
