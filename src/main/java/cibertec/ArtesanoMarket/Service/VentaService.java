package cibertec.ArtesanoMarket.Service;

import java.util.List;

import cibertec.ArtesanoMarket.model.Venta;

public interface VentaService {

	public List<Venta> list();
	public Venta add(Venta v);
	public Venta update(Venta v);
	public void delete(int id);

}
