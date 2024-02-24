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

import cibertec.ArtesanoMarket.Service.VentaService;
import cibertec.ArtesanoMarket.model.Venta;


@RestController
@RequestMapping("/venta")
public class VentaController {
	
@Autowired
VentaService ventaService;

@GetMapping
public ResponseEntity<List<Venta>> list(){
	return  new ResponseEntity<>(ventaService.list(), HttpStatus.OK)  ;
}

@PostMapping
public ResponseEntity<Venta> add(@RequestBody Venta v) {
	return new ResponseEntity<>(ventaService.add(v), HttpStatus.CREATED);
}

@PutMapping
public ResponseEntity<Venta> update(@RequestBody Venta v) {
	return new ResponseEntity<>(ventaService.update(v), HttpStatus.CREATED);
}

@DeleteMapping("/{id}")
public ResponseEntity<Void> delete(@PathVariable("id") int id) {
	ventaService.delete(id);
	return new ResponseEntity<>(HttpStatus.OK);
	
}

}
