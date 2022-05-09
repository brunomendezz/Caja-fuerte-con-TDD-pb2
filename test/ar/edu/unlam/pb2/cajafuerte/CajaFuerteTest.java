package ar.edu.unlam.pb2.cajafuerte;

import org.junit.Assert;
import org.junit.Test;

public class CajaFuerteTest {
	@Test
	public void alCrearUnaCajaFuerteDeberiaEstarAbierta() {
		// EJECUCION
		CajaFuerte caja = cuandoCreoUnaCajaFuerte();

		laCajaFuerteEstaAbierta(caja);

	}

	@Test
	public void alCerrarlaDeberiaQuedarCerrada() {
		// PREPARACION
		CajaFuerte caja = dadoQueExisteUnaCajaFuerte();

		// EJECUCION
		cuandoCierroLaCajaFuerte(caja);

		// CONTRASTACION
		entoncesLaCajaFuerteEstaCerrada(caja);

	}

	@Test
	public void alAbrirLaCajaFuerteConElCodigoDeCierreDeberiaAbrirse() {
		// PREPARACION
		CajaFuerte caja = dadoQueExisteUnaCajaFuerte();
        String codigoApertura = null;
		
		dadoQueCierroCajaFuerte(caja, codigoApertura);
		// EJECUCION
		cuandoAbroLaCajaFuerte(caja, codigoApertura);
		// CONSTRASTACION
		entoncesLaCajaFuerteEstaAbierta(caja);

	}
///////////////////////////////////////////////////////////////////////////////////

	///////////////////////////////////////////////////////////////////////////////////
	

	private void dadoQueCierroCajaFuerte(CajaFuerte caja, String codigoApertura) {
		caja.cajaCerrarConCodigoDeApertura(codigoApertura);

	}

	private void cuandoAbroLaCajaFuerte(CajaFuerte caja, String codigoApertura) {

		caja.estaAbiertaConElCodigoDeApertura(codigoApertura);
	}

	private void entoncesLaCajaFuerteEstaAbierta(CajaFuerte caja) {
		Assert.assertEquals(true, caja.estaAbierta());

	}

///////////////////////////////////////////////////////////////////////////////////

	private void entoncesLaCajaFuerteEstaCerrada(CajaFuerte caja) {
		Assert.assertEquals(false, caja.estaAbierta());

	}

	private void cuandoCierroLaCajaFuerte(CajaFuerte caja) {
		caja.cajaCerrar();
	}

	private CajaFuerte dadoQueExisteUnaCajaFuerte() {

		return new CajaFuerte();
	}

///////////////////////////////////////////////////////////////////////////////////

	// RESULTADO
	private void laCajaFuerteEstaAbierta(CajaFuerte caja) {
		Assert.assertTrue(caja.estaAbierta());
	}

	private CajaFuerte cuandoCreoUnaCajaFuerte() {

		return new CajaFuerte();
	}

}