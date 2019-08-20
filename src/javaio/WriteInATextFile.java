package javaio;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInATextFile {
    public static void main(String[] args) {
        writeInTextFile();
    }

    private static void writeInTextFile() {
        String pathname = System.getProperty("user.dir") + "/src/resources/writeDemo.txt";
        FileWriter fileWriter = null;
        try {
            File file = new File(pathname);
            fileWriter = new FileWriter(file);
            fileWriter.write("Hello");
            fileWriter.write("\r\n");
            fileWriter.write("How are you?");

        }
       catch (IOException e){
            e.printStackTrace();
       }

       finally {
            try {
                fileWriter.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}
