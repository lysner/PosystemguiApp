package com.posystem.gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    
    public static Connection getConnection(){
        
        Connection conn = null;
        try{
            Class<?> forName = Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/posystemdb", "root", "");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println(ex.getMessage());
        }        
        return conn;
    }
}
