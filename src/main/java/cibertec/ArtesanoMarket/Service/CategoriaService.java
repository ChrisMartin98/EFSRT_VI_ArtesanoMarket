package cibertec.ArtesanoMarket.Service;

import java.util.List;

import cibertec.ArtesanoMarket.model.Categoria;

public interface CategoriaService {


	public List<Categoria> list();
	public Categoria add(Categoria e);
	public Categoria update(Categoria e);
	public void delete (int id);
	
}
