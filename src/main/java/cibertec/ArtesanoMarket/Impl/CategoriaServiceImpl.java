package cibertec.ArtesanoMarket.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cibertec.ArtesanoMarket.Repo.CategoriaRepo;

import cibertec.ArtesanoMarket.Service.CategoriaService;

import cibertec.ArtesanoMarket.model.Categoria;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	CategoriaRepo categoriaRepo;
	
	
	
	@Override
	public List<Categoria> list() {
		// TODO Auto-generated method stub
		return categoriaRepo.findAll();
	}



	@Override
	public void delete(int id) {
		categoriaRepo.deleteById(id);
		
	}

	@Override
	public Categoria add(Categoria e) {
		// TODO Auto-generated method stub
		return categoriaRepo.save(e);
	}

	@Override
	public Categoria update(Categoria e) {
		// TODO Auto-generated method stub
		 return categoriaRepo.save(e);
	}

}
