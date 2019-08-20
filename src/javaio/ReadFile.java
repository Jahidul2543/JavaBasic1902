package javaio;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/Users/jahidul/IdeaProjects/JavaBasic1902/src/resources/demo.txt");

        int i;

        while((i=fr.read())!=-1)

            System.out.print((char) i);
           // writer.write((char)i);

        fr.close();
    }

}
/**
 * while(true){
 *     go inside
 * }
 *
 * */