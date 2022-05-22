package DB;

import java.sql.*;

public class DBConnection {

    public String db() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/lee";
        String userName = "root";
        String password = "1224bear";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from person");

        resultSet.next();
        String name = resultSet.getString("name");
        String part= resultSet.getString("part");
        System.out.println(name);
        System.out.println(part);

        resultSet.close();
        statement.close();
        connection.close();

        return name;
    }



}
