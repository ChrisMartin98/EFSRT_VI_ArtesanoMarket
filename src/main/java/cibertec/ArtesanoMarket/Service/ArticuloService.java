package cibertec.ArtesanoMarket.Service;

import java.util.List;

import cibertec.ArtesanoMarket.model.Articulo;

public interface ArticuloService {


	public List<Articulo> list();
	public Articulo add(Articulo e);
	public Articulo update(Articulo e);
	public void delete (int id);
	
}
