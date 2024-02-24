package cibertec.ArtesanoMarket.Service;

import java.util.List;

import cibertec.ArtesanoMarket.model.Cliente;

public interface ClienteService {

	public List<Cliente> list();
	public Cliente add(Cliente e);
	public Cliente update(Cliente e);
	public void delete (int id);
	
	
}
