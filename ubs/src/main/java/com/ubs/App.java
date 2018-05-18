package com.ubs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class App extends Application  {
	
	
	@Override
	public void start(Stage primaryStage) {
   	 try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection(
              "jdbc:mysql://160.153.128.35:3306/UbsProject", "thehavays", "ubs12345");
//here sonoo is database name, root is username and password
      Statement stmt =  con.createStatement();
      ResultSet rs = ( stmt).executeQuery("select * from Persons");
      while (rs.next())
          System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4));
      con.close();
  } catch (Exception e) {
      System.out.println(e);
  }
		
		
		
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Login.fxml"));
			Scene scene = new Scene(root,700,600);
	//		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

    public static void main( String[] args ) throws SQLException
    {
    	
    	

    
    	 launch(args);
    	 
    }
}
