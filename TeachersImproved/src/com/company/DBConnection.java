package com.company;
import java.sql.*;
import java.sql.Connection;

public interface DBConnection {
Connection getconnection() throws SQLException;
    ResultSet executeQuery(PreparedStatement preparedStatement) throws SQLException;
    ResultSet executeQuery(String sql) throws SQLException;
    boolean execute(PreparedStatement preparedStatement) throws SQLException;
    boolean execute(String sql) throws SQLException;
    void close() throws SQLException;


}
