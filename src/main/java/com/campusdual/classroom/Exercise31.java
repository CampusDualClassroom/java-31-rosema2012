package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise31 {
    public static void main(String[] args) {
        String filePath = "src/main/resources/lorem.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
