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
            Integer TRANSNO  = resultSet.getInt("TRANSNO");
            String TRANSID  = resultSet.getString("TRANSID");
            String MERCHANTNO  = resultSet.getString("MERCHANTNO");
            String  MERCHANTID = resultSet.getString("MERCHANTID");
            String RESMSG  = resultSet.getString("RESMSG");


            Dto targetDto = new Dto(TRANSNO, TRANSID, MERCHANTNO, MERCHANTID, RESMSG);

            System.out.println(targetDto.toString());
            dtoArrayList.add(targetDto);
        }



        return dtoArrayList;

    }




}
