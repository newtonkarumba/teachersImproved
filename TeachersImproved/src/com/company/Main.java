package com.company;
import java.sql.SQLException;
import java.util.*;
import java.sql.*;

import java.util.Scanner;

public class Main {
    public static int n;
  //  public int n;
    public int choices;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Teachers teachers = new Teachers();
        Student students = new Student();

        for (n = 1; n <= 20; n++) {
            System.out.println("Welcome to Highschool! What would you like to do? ");
            System.out.println("1: View Students ");
            System.out.println("2: View Teachers ");
            System.out.println("3: View Grades ");

            System.out.println("4: AUpdate database  ");
            Scanner scanner2 = new Scanner(System.in);
            n = scanner2.nextInt();



            switch (n) {
                case 1:
                    students.getName();
                    break;
                case 2:
                    teachers.getName();
                    break;
                case 3:
                    students.getGrade();
                    break;
                case 4:
                    //Register the driver
                    Class.forName("com.mysql.jdbc.Driver");
                    //Get the connection driver
                    DBConnection connection = (DBConnection) DriverManager.getConnection("jdbc:mysql://localhost:3306/newtons", "root", "1234");
                    //creating a statement
                    Statement statement = connection.getconnection().createStatement();
                    statement.execute("INSERT INTO newtons(name,subject)values(John,English");
                    ResultSet resultSet = statement.executeQuery("SLECT * FROM newtons");
                    while (resultSet.next()) {
                        System.out.println(resultSet.getString("name") + resultSet.getString("subject"));

                    }
                    //Close the connection
                    connection.close();

                    break;


                default:
                    System.out.println("You have entered the wrong value");
            }



        }
    }
}
