package javaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GetInfoFromKeyboard {
    public static void main(String[] args) {
       // readFromKeyboard();
        readFromKeyboardUsingScanner();
    }

    private static void readFromKeyboardUsingScanner() {
        Scanner scanner = new Scanner(System.in);

        String inputFromKeyBoard = scanner.nextLine();
    }

    private static void readFromKeyboard() {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
           String name = bufferedReader.readLine();
            System.out.println(name);
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }


}
