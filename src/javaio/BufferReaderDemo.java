package javaio;

import java.io.*;

public class BufferReaderDemo {

    public static void main(String[] args)   {
        readFile();
    }

    public static void readFile()   {


        String pathname = System.getProperty("user.dir")+"/src/resources/demo.txt" ;
        try {

            File file = new File(pathname);
            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int i;

            while ((i = bufferedReader.read()) != -1) {
                System.out.print((char) i);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

        finally {
            System.out.println("Finally I know how to read file");
        }
    }
}
