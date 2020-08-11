package com.company;

import java.sql.*;

public class DBConnection2 implements DBConnection{
    private String username;
    private String password;
    private String url;
    private Connection connection;

    public DBConnection2() throws SQLException{
        this.url = "jdbc:mysql://localhost:3306";
        this.username = "root";
        this.password ="1234";
        this.connect();
    }

    private void connect() throws SQLException {
        this.connection = this.getconnection();

    }

    @Override
    public Connection getconnection() throws SQLException {
        return DriverManager.getConnection(url,username,password);
    }

    @Override
    public ResultSet executeQuery(PreparedStatement preparedStatement) throws SQLException{
        return preparedStatement.executeQuery();
    }

    @Override
    public ResultSet executeQuery(String sql)  throws SQLException{
        Statement statement = this.connection.createStatement();
        return statement.executeQuery(sql);
    }

    @Override
    public boolean execute(PreparedStatement preparedStatement)  throws SQLException{
        return preparedStatement.execute();
    }

    @Override
    public boolean execute(String sql)  throws SQLException{
        Statement statement = this.connection.createStatement();
        return statement.execute(sql);
    }

    @Override
    public void close() throws SQLException{
        this.connection.close();

    }
}
