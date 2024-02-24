package cibertec.ArtesanoMarket.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.ArtesanoMarket.Repo.VentaRepo;
import cibertec.ArtesanoMarket.Service.VentaService;
import cibertec.ArtesanoMarket.model.Venta;

@Service
public class VentaServiceImpl  implements VentaService {

	@Autowired
	VentaRepo ventaRepo;
	
	
	@Override
	public List<Venta> list() {
		return ventaRepo.findAll();
	}

	@Override
	public Venta add(Venta v) {
		return ventaRepo.save(v);
	}

	@Override
	public Venta update(Venta v) {
		return ventaRepo.save(v);
	}

	@Override
	public void delete(int id) {
		ventaRepo.deleteById(id);
	}

}
