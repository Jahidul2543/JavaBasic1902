package databaseconnectivity;

import javaio.ReadPropertiesFile;

import java.sql.*;

public class DBConnectionBasics {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        connectDB();
    }

    private static void connectDB() throws ClassNotFoundException, SQLException {

           String userName = "root";
           String password = "root";
           /**
            * protocol//[hosts][/database][?properties]
            * */

           String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url,userName, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from students");

        resultSet.next();
        String name = resultSet.getString("name");
        System.out.println(name);


    }

}
