package javaio;

import java.io.*;
import java.util.Properties;

public class ReadPropertiesFile {

    public static void main(String[] args) {
       // ReadPropertiesFile readPropertiesFile = new ReadPropertiesFile();
        readApplicationProperties();
    }

    public static Properties readApplicationProperties() {
        Properties  properties = new Properties();
        String pathname = System.getProperty("user.dir") + "/src/resources/application.properties";
        File file = new File(pathname);
        try {

            FileInputStream fileOutputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileOutputStream);
            /**
             * Load the properties object with all the application properties
             * */
            properties.load(inputStreamReader);
        }
        catch (IOException e){

        }

      /* String userName = properties.getProperty("userName");
       String passCode = properties.getProperty("password");
       System.out.println("userName "+ userName );
       System.out.println("password "+ passCode );
*/
      return properties;
    }

}
