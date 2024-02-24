package cibertec.ArtesanoMarket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data //El lombok hace el getters and setters
@Entity
@Table(name = "Articulo")

public class Articulo {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int idArticulo;
	public int idCategoria;
	public String codigo;
	public String nombre;
	public double precio_venta;
	public int stock;
	public String descripcion;
	public String imagen;
	public String estado;

}
