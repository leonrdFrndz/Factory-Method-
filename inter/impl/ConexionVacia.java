/*

Este codigo es propiedad del canal mitocode 
https://www.youtube.com/channel/UC9fAeSPVw7mAAbexCS7gPqw 

solo se sube el repositorio con ambitos academicos 

*/


package com.mitocode.inter.impl;

import com.mitocode.inter.IConexion;

public class ConexionVacia implements IConexion{

	@Override
	public void conectar() {
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");		
	}

	@Override
	public void desconectar() {
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");		
	}

}