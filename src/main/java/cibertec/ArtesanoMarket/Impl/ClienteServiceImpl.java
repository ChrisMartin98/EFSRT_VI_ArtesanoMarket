package cibertec.ArtesanoMarket.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.ArtesanoMarket.Repo.ClienteRepo;
import cibertec.ArtesanoMarket.Service.ClienteService;
import cibertec.ArtesanoMarket.model.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService{

	
	@Autowired
	ClienteRepo clienteRepo;
	
	@Override
	public List<Cliente> list() {
		// TODO Auto-generated method stub
		return clienteRepo.findAll();
	}

	@Override
	public Cliente add(Cliente e) {
		// TODO Auto-generated method stub
		return clienteRepo.save(e);
	}

	@Override
	public Cliente update(Cliente e) {
		// TODO Auto-generated method stub
		return clienteRepo.save(e);
	}

	@Override
	public void delete(int id) {
		clienteRepo.deleteById(id);
		
	}

}
