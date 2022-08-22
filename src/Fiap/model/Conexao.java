package Fiap.model;

import java.sql.*;

public class Conexao {
	public static Connection abrirConexao()	{
		Connection con = null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thing:@oracle.fiap.com.br:1521:ORCL";
		final String USER = "rm96256";
		final String PASS = "170887";
		con = DriverManager.getConnection(url, USER, PASS);
		System.out.println("Conexao aberta.");
	} catch (ClassNotFoundException e) {
	System.out.println(e.getMessage());
	} catch (SQLException e) {
	System.out.println(e.getMessage());
	} catch (Exception e) {
	System.out.println(e.getMessage());
    }
	return con;
	
	}

	public static void fecharConexao(Connection con) {
		try {
			con.close();
			System.out.println("conexao fechada");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
}
