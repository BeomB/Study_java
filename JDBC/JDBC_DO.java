package JDBC;

import java.sql.SQLException;

public class JDBC_DO {

    public static void main(String[] args) {

        DBConnection dbConnection = new DBConnection();
        try {
            dbConnection.dbTest();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
