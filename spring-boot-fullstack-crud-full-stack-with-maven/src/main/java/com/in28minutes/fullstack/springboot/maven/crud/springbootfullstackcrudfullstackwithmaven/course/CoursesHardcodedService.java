package com.in28minutes.fullstack.springboot.maven.crud.springbootfullstackcrudfullstackwithmaven.course;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Service;

@Service
public class CoursesHardcodedService {
	
	// JDBC driver name and database URL 
	   static final String JDBC_DRIVER = "org.h2.Driver";   
	   static final String DB_URL = "jdbc:h2:./database/test";  
	   
	   //  Database credentials 
	   static final String USER = "sa"; 
	   static final String PASS = ""; 

	public List<Course> findAll() {
		List<Course> courses = new ArrayList<Course>();
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 1: Register JDBC driver 
	         Class.forName(JDBC_DRIVER); 
	         
	         // STEP 2: Open a connection 
	         conn = DriverManager.getConnection(DB_URL,USER,PASS);  
	         
	         // STEP 3: Execute a query 
	         stmt = conn.createStatement(); 
	         String sql = "SELECT id, username, description FROM course"; 
	         ResultSet rs = stmt.executeQuery(sql); 
	         
	         while(rs.next()) {
	        	 int id = rs.getInt("id");
	        	 String username = rs.getString("username");
	        	 String description = rs.getString("description");
	        	 courses.add(new Course(id, username, description));
	         }
		} 
		catch(SQLException se) { 
	         // Handle errors for JDBC 
	         se.printStackTrace(); 
	    } 
		catch(Exception e) { 
	         // Handle errors for Class.forName 
	         e.printStackTrace(); 
	    } 
		finally { 
	         // finally block used to close resources 
	         try { 
	            if(stmt!=null) stmt.close();  
	         } 
	         catch(SQLException se2) {
	         } // nothing we can do 
	         try { 
	            if(conn!=null) conn.close(); 
	         } 
	         catch(SQLException se) { 
	            se.printStackTrace(); 
	         } // end finally try 
	    } // end try 
		return courses;
	}
	
	public Course save(Course course) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 1: Register JDBC driver 
	         Class.forName(JDBC_DRIVER); 
	         
	         // STEP 2: Open a connection 
	         conn = DriverManager.getConnection(DB_URL,USER,PASS);  
	         
	         // STEP 3: Execute a query 
	         stmt = conn.createStatement();
	         String sql;
	         if(course.getId() == -1) {
	        	 sql = "INSERT INTO course (username, description) values('owolman', '"+course.getDescription()+"')";
	         }
	         else {
	        	 sql = "UPDATE course SET description ='"+course.getDescription()+"' WHERE id = "+course.getId();
	         }
	         stmt.executeUpdate(sql);
		} 
		catch(SQLException se) { 
	         // Handle errors for JDBC 
	         se.printStackTrace(); 
	    } 
		catch(Exception e) { 
	         // Handle errors for Class.forName 
	         e.printStackTrace(); 
	    } 
		finally { 
	         // finally block used to close resources 
	         try { 
	            if(stmt!=null) stmt.close();  
	         } 
	         catch(SQLException se2) {
	         } // nothing we can do 
	         try { 
	            if(conn!=null) conn.close(); 
	         } 
	         catch(SQLException se) { 
	            se.printStackTrace(); 
	         } // end finally try 
	    } // end try 
		
		return course;
	}

	public Course deleteById(long id) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 1: Register JDBC driver 
	         Class.forName(JDBC_DRIVER); 
	         
	         // STEP 2: Open a connection 
	         conn = DriverManager.getConnection(DB_URL,USER,PASS);  
	         
	         // STEP 3: Execute a query 
	         stmt = conn.createStatement(); 
	         String sql = "DELETE FROM course WHERE id = "+id; 
	         stmt.executeUpdate(sql);
		} 
		catch(SQLException se) { 
	         // Handle errors for JDBC 
	         se.printStackTrace(); 
	    } 
		catch(Exception e) { 
	         // Handle errors for Class.forName 
	         e.printStackTrace(); 
	    } 
		finally { 
	         // finally block used to close resources 
	         try { 
	            if(stmt!=null) stmt.close();  
	         } 
	         catch(SQLException se2) {
	         } // nothing we can do 
	         try { 
	            if(conn!=null) conn.close(); 
	         } 
	         catch(SQLException se) { 
	            se.printStackTrace(); 
	         } // end finally try 
	    } // end try 
		return null;
	}

	public Course findById(long courseId) {
		Course course = null;
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 1: Register JDBC driver 
	         Class.forName(JDBC_DRIVER); 
	         
	         // STEP 2: Open a connection 
	         conn = DriverManager.getConnection(DB_URL,USER,PASS);  
	         
	         // STEP 3: Execute a query 
	         stmt = conn.createStatement(); 
	         String sql = "SELECT id, username, description FROM course WHERE id = "+courseId; 
	         ResultSet rs = stmt.executeQuery(sql); 
	         
	         if(rs.next()) {
	        	 int id = rs.getInt("id");
	        	 String username = rs.getString("username");
	        	 String description = rs.getString("description");
	        	 course = new Course(id, username, description);
	         }
		} 
		catch(SQLException se) { 
	         // Handle errors for JDBC 
	         se.printStackTrace(); 
	    } 
		catch(Exception e) { 
	         // Handle errors for Class.forName 
	         e.printStackTrace(); 
	    } 
		finally { 
	         // finally block used to close resources 
	         try { 
	            if(stmt!=null) stmt.close();  
	         } 
	         catch(SQLException se2) {
	         } // nothing we can do 
	         try { 
	            if(conn!=null) conn.close(); 
	         } 
	         catch(SQLException se) { 
	            se.printStackTrace(); 
	         } // end finally try 
	    } // end try 
		return course;
	}
}