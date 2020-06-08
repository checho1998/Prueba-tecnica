package com.principal.DAO;

import java.sql.Date;
import java.util.List;

import com.principal.entities.Usuario;

public interface UsuarioDAO {
	
	void insertarUsuario(String nombre,String apellido, String nacionalidad, String tipoDocumento, int numDocumento, String email, String observaciones,int telefono, Date fecha, String estado );
	
	List<Usuario> getUsuario(int numDocumento,String nombre,String apellido);
	
	void editarUsuario( String nombre,String apellido, String nacionalidad, String tipoDocumento, int numDocumento, String email, String observaciones,int telefono, Date fecha, String estado );
	
	void eliminarUsuario(int numDocumento);

}
