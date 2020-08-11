package com.company;
import java.sql.SQLException;
import java.util.*;
import java.sql.*;

import java.util.Scanner;

public class Main {
    public int n;
    public int choices;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        for (int n = 0; n <= 20; n++)
            //Register the driver
        Class.forName("com.mysql.jdbc.Driver");
        //Get the connection driver
       DBConnection connection = (DBConnection) DriverManager.getConnection("jdbc:mysql://localhost:3306/newtons");
       //creating a statement
        Statement statement =  connection.getconnection().createStatement();
        statement.execute("INSERT INTO newtons(name,subject)values(John,English");
        ResultSet resultSet = statement.executeQuery("SLECT * FROM newtons");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name")+resultSet.getString("subject"));

        }
        //Close the connection
        connection.close();



    }
}
