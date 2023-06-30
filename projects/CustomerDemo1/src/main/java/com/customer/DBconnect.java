package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {

	//create database connection
			private static String url = "jdbc:mysql://localhost:3306/hotel";
			private static String user = "root";
			private static String pass = "0000";
			private static Connection con ;
			public static Connection getConnection() {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection con = DriverManager.getConnection(url,user,pass);
				}
				
				catch(Exception e){
					System.out.println("database connection is not success!");
				}
				
				return con;
			}

}
