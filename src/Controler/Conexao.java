package Controler;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.org.glassfish.external.statistics.annotations.Reset;

public class Conexao {

	public static Connection conexao=null;
	public static ResultSet rs=null;

	public static PreparedStatement stmt;
	public static Statement st=null;
	
	int numRegistros=0;


	private static final String URL_MYSQL = "jdbc:mysql://localhost:3306/sysescala";
	    private static final String DRIVER_CLASS_MYSQL = "com.mysql.jdbc.Driver";
	    private static final String USER = "root";
	    private static final String PASS = "";
	    
	    public static Connection getConnection() throws SQLException{
	    	
	    try{
	    	
	    	Class.forName(DRIVER_CLASS_MYSQL);
	    	System.out.println("Conectado");
	    	conexao = DriverManager.getConnection(URL_MYSQL, USER, PASS);
	    	
	    	return DriverManager.getConnection(URL_MYSQL, USER, PASS);
	    }catch(ClassNotFoundException e){
	    	e.printStackTrace();
	    	
	    }catch (SQLException e) {
			System.out.println("Erro ao se conectar" +e.getMessage());
		}
	    	
	    	return null;
	    }

	public static void main(String[] args) throws SQLException {
		getConnection();
	}
	}
