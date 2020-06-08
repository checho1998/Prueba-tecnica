package com.principal.mappers;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.principal.entities.Usuario;


public interface UsuarioMapper {

	public void agregarUsuario(@Param("nomb") String nombre,
								@Param("apellid") String apellido,
								@Param("nacionalid") String nacionalidad,
								@Param("tipoDocument") String tipoDocumento,
								@Param("numDocument") int numDocumento, 
								@Param("emai") String email,
								@Param("observacion") String observaciones,
								@Param("telefon") int telefono,
								@Param("fech") Date fecha, 
								@Param("estad") String estado );
	
	public List<Usuario> getUsuarios( @Param("numDocumento") int numDocumento,
										@Param("nombre") String nombre,
										@Param("apellido") String apellido );
	
	public void editarUsuario (@Param("nomb") String nombre,
			@Param("apellid") String apellido,
			@Param("nacionalid") String nacionalidad,
			@Param("tipoDocument") String tipoDocumento,
			@Param("numDocument") int numDocumento, 
			@Param("emai") String email,
			@Param("observacion") String observaciones,
			@Param("telefon") int telefono,
			@Param("fech") Date fecha, 
			@Param("estad") String estado );
	
	public void eliminarUsuario(@Param("numDocument") int numDocumento);
		
	
	
}
