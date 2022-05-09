package ar.edu.unlam.pb2.cajafuerte;

public class CajaFuerte {
	private Boolean estado = true;
	private String codigo ="";

	public boolean estaAbierta() {
	
		return estado;
	}

	public void cajaCerrar() {
		this.estado = false;
	}

	public void estaAbiertaConElCodigoDeApertura(String codigoApertura) {
		if(codigoApertura==this.codigo) {
			this.estado=true;
		}else estado=false; 
	
	}

	public void cajaCerrarConCodigoDeApertura(String codigoApertura) {
	this.codigo=codigoApertura;
	}

}
