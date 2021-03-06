/*

Este codigo es propiedad del canal mitocode 
https://www.youtube.com/channel/UC9fAeSPVw7mAAbexCS7gPqw 

solo se sube el repositorio con ambitos academicos 

*/


package com.mitocode.inter.impl;

import com.mitocode.inter.IConexion;

public class ConexionMySQL implements IConexion {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionMySQL() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		// Aqui puede ir código JDBC
		System.out.println("Se conectó a MySQL");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectó de MySQL");
	}

	@Override
	public String toString() {
		return "ConexionMySQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}
}