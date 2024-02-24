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

import cibertec.ArtesanoMarket.Service.ClienteService;
import cibertec.ArtesanoMarket.model.Cliente;

@RestController
@RequestMapping("/Cliente")
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	

	@GetMapping
	public ResponseEntity<List<Cliente>> list() {
		return new ResponseEntity<List<Cliente>>(clienteService.list(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Cliente> add( @RequestBody Cliente c){
		return new ResponseEntity<Cliente>(clienteService.add(c),HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Cliente> update( @RequestBody Cliente c) {
		return new ResponseEntity<Cliente>(clienteService.update(c),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		clienteService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
