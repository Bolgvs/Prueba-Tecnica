package service;

import java.util.List;

import dto.Usuario;

public class IUsuarioService {
	
	public List<Usuario> listUsuario();
	
	public List<Usuario> UsuarioByName(String name);
	
	public Usuario createUsuario(Usuario usuario);
	
	public Usuario UsuarioById(Long id);
	
	public void deleteUsuario(Long id);
	
	public Usuario updateUsuario(Usuario usuario);
}