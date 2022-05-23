package DB;

import java.sql.*;
import java.util.ArrayList;

public class DBConnection {

    public ArrayList<trans> db() throws SQLException {
        ArrayList<trans> arrayList = new ArrayList();

        String url = "jdbc:mysql://localhost:3306/kobe";
        String userName = "root";
        String password = "1224bear";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from person");

        while (resultSet.next())
        {
            Integer number= resultSet.getInt("number");
            String name = resultSet.getString("name");
            arrayList.add(new trans(number,name));
        }


        resultSet.close();
        statement.close();
        connection.close();



        return arrayList;
    }



}
