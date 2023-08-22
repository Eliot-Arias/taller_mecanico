package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JPanel;

import java.sql.CallableStatement;

import Data.DConection;
import Interfaz.I_testIngreso;

public class M_usuario {
	private String nombreUsuario;
	private char[] contrasenia;
	
	
	public M_usuario() {
		
	}
	
	public M_usuario(String nombreUsuario, char[] contrasenia) {
		this.nombreUsuario = nombreUsuario;
		this.contrasenia = contrasenia;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public char[] getContraseña() {
		return contrasenia;
	}

	public void setContraseña(char[] cs) {
		this.contrasenia = cs;
	}
	
	
	public void ingesar(M_usuario usuario) {
		
		
		DConection cn = new DConection();
		
		//String consulta = "CALL validar_usuario(?, ?);";
		String consulta = "SELECT * FROM usuarios WHERE nombre_usuario = ? AND contraseña = ?;";
		System.out.println(usuario.getContraseña());
		try {
			CallableStatement stmt = cn.conectar().prepareCall(consulta);
			stmt.setString(1, usuario.getNombreUsuario());
			stmt.setString(2, usuario.getContraseña());
			ResultSet resultado = stmt.executeQuery();
			//System.out.println(resultado.getString("nombre_usuario"));
			if (resultado.next()) {
				System.out.println("Resultado: " + resultado.getString("nombre_usuario"));
				//I_testIngreso frame = new I_testIngreso();
				//frame.setVisible(true);
			}else {
				System.out.println("Contraseña Erronea");
			}
			
			stmt.close();
            			
		} catch (SQLException e) {
			System.out.println("Error: " + e.toString());
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
