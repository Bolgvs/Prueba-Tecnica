package service;

import java.util.List;

import dto.Mensaje;

public class IMensajeService {
	
	public List<Mensaje> listMensaje();
	
	public List<Mensaje> MensajeByName(String name);
	
	public Mensaje createMensaje(Mensaje mensaje);
	
	public Mensaje MensajeById(Long id);
	
	public void deleteMensaje(Long id);
	
	public Mensaje updateMensaje(Mensaje mensaje);
}
