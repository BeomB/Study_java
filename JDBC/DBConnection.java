package JDBC;

import java.sql.*;
import java.util.ArrayList;

public class DBConnection {

    public DBConnection() {
    }

    public ArrayList<Dto> dbTest() throws SQLException {

        ArrayList<Dto> dtoArrayList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String url = "jdbc:mysql://localhost:3306/kobe";
        String userName = "root";
        String password = "1224bear";


        String SQL = "select * from transact_test;";
        connection = DriverManager.getConnection(url,userName,password);
        preparedStatement = connection.prepareStatement(SQL);
        resultSet = preparedStatement.executeQuery();


        while (resultSet.next())
        {
            String TRANSNO  = resultSet.getString("TRANSNO");
            String TRANSID  = resultSet.getString("TRANSID");
            String MERCHANTID  = resultSet.getString("MERCHANTID");
            String MERCHANTID  = resultSet.getString("MERCHANTID");
            String RESMSG  = resultSet.getString("RESMSG");


            dtoArrayList.add(new Dto(TRANSNO,TRANSID,MERCHANTID,))

        }



        return dtoArrayList;

    }




}
