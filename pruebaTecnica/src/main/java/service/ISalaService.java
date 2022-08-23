package service;

import java.util.List;

import dto.Sala;

public class ISalaService {
	
	public List<Sala> listSala();
	
	public List<Sala> SalaByName(String name);
	
	public Sala createSala(Sala sala);
	
	public Sala SalaById(Long id);
	
	public void deleteSala(Long id);
	
	public Sala updateSala(Sala sala);
}