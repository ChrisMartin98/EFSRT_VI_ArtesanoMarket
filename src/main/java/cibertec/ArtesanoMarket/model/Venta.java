package cibertec.ArtesanoMarket.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Venta {
	
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	   
	    private int ventaId;
	    private String tipo_Comprobante;
	    private String serie_Comprobante;
	    private String num_Comprobante;
	    private Date fecha;
	    private double impuesto;
	    private double total;
	    private String estado;

	  
}

