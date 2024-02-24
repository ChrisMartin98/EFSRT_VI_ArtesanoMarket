package cibertec.ArtesanoMarket.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.ArtesanoMarket.Repo.ArticuloRepo;
import cibertec.ArtesanoMarket.Service.ArticuloService;
import cibertec.ArtesanoMarket.model.Articulo;

@Service
public class ArticuloServiceImpl implements ArticuloService {

	@Autowired
	ArticuloRepo articuloRepo;
	
	
	
	@Override
	public List<Articulo> list() {
		// TODO Auto-generated method stub
		return articuloRepo.findAll();
	}

	@Override
	public Articulo add(Articulo e) {
		// TODO Auto-generated method stub
		return articuloRepo.save(e);
	}

	@Override
	public Articulo update(Articulo e) {
		// TODO Auto-generated method stub
		return articuloRepo.save(e);
	}

	@Override
	public void delete(int id) {
		articuloRepo.deleteById(id);
		
	}

}
