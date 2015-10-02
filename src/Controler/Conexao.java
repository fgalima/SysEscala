package Controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection getConnection() {
		Connection con = null;

		try {
			
			Class.forName("org.postgresql.Driver");
			//referencia para um objeto de conexao
			con = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/cjweb1_banco",
					"postgres", "postgres");
			
			System.out.println("Conectado!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
