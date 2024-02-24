package cibertec.ArtesanoMarket.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cibertec.ArtesanoMarket.Service.ArticuloService;
import cibertec.ArtesanoMarket.model.Articulo;


@RestController
@RequestMapping("/Articulo")
public class ArticuloController {

	@Autowired
	ArticuloService articuloService;
	

	@GetMapping
	public ResponseEntity<List<Articulo>> list() {
		return new ResponseEntity<List<Articulo>>(articuloService.list(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Articulo> add( @RequestBody Articulo c){
		return new ResponseEntity<Articulo>(articuloService.add(c),HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Articulo> update( @RequestBody Articulo c) {
		return new ResponseEntity<Articulo>(articuloService.update(c),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		articuloService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
}
