package com.principal.myBatisDAO;

import java.sql.Date;
import java.util.List;

import com.principal.DAO.UsuarioDAO;
import com.principal.entities.Usuario;
import com.principal.mappers.UsuarioMapper;

import com.google.inject.Inject;

public class MyBatisUsuarioDAO implements UsuarioDAO  {
	
	@Inject
	private UsuarioMapper mapper;

	
	@Override
	public void insertarUsuario(String nombre, String apellido, String nacionalidad, String tipoDocumento,
			int numDocumento, String email, String observaciones, int telefono, Date fecha, String estado) {
		
		mapper.agregarUsuario(nombre, apellido, nacionalidad, tipoDocumento, numDocumento, email, observaciones, telefono, fecha, estado);
	}

	@Override
	public List<Usuario> getUsuario(int numDocumento, String nombre, String apellido) {
		
		return mapper.getUsuarios(numDocumento, nombre, apellido);
	}

	@Override
	public void editarUsuario(String nombre, String apellido, String nacionalidad, String tipoDocumento,
			int numDocumento, String email, String observaciones, int telefono, Date fecha, String estado) {
		mapper.editarUsuario(nombre, apellido, nacionalidad, tipoDocumento, numDocumento, email, observaciones, telefono, fecha, estado);
	}

	@Override
	public void eliminarUsuario(int numDocumento) {
		mapper.eliminarUsuario(numDocumento);
	}

}
