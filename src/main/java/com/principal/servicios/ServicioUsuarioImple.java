package com.principal.servicios;

import java.sql.Date;
import java.util.List;

import com.principal.entities.Usuario;

public class ServicioUsuarioImple implements  ServiciosUsuario{
	
	//@Inject
	//private UsuarioDAO usuario;

	


	@Override
	public List<Usuario> getUsuario(int numDocumento, String nombre, String apellido) {
		// TODO Auto-generated method stub
		return null;
	}

	


	@Override
	public void eliminarUsuario(int numDocumento) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void insertarUsuario(String nombre, String apellido, String nacionalidad, String tipoDocumento,
			int numDocumento, String email, String observaciones, int telefono, Date fecha, String estado) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void editarUsuario(String nombre, String apellido, String nacionalidad, String tipoDocumento,
			int numDocumento, String email, String observaciones, int telefono, Date fecha, String estado) {
		// TODO Auto-generated method stub
		
	}
	
	
}
