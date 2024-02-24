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

import cibertec.ArtesanoMarket.Service.CategoriaService;
import cibertec.ArtesanoMarket.model.Categoria;


@RestController
@RequestMapping("/Categoria")
public class CategoriaController {

	@Autowired
	CategoriaService categoriaService;
	

	@GetMapping
	public ResponseEntity<List<Categoria>> list() {
		return new ResponseEntity<List<Categoria>>(categoriaService.list(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Categoria> add( @RequestBody Categoria c){
		return new ResponseEntity<Categoria>(categoriaService.add(c),HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Categoria> update( @RequestBody Categoria c) {
		return new ResponseEntity<Categoria>(categoriaService.update(c),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		categoriaService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
