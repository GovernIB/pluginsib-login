package es.caib.loginib.rest.api.v1;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Respuesta datos ticket.
 *
 * @author indra
 *
 */
public final class RPropiedad {

	/**
	 * Propiedad.
	 */
	@Schema(description = "Propiedad", required = true)
	private String propiedad;

	/**
	 * Tipo valor.
	 */
	@Schema(description = "Tipo: String / XML (Base64)", required = true)
	private String tipo;

	/**
	 * Valor.
	 */
	@Schema(description = "Valor", required = true)
	private String valor;

	/**
	 * Valor.
	 */
	@Schema(description = "Valor", required = true)
	private boolean mostrar;

	/**
	 * Método de acceso a propiedad.
	 *
	 * @return propiedad
	 */
	public String getPropiedad() {
		return propiedad;
	}

	/**
	 * Método para establecer propiedad.
	 *
	 * @param propiedad
	 *                      propiedad a establecer
	 */
	public void setPropiedad(final String propiedad) {
		this.propiedad = propiedad;
	}

	/**
	 * Método de acceso a tipo.
	 *
	 * @return tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Método para establecer tipo.
	 *
	 * @param tipo
	 *                 tipo a establecer
	 */
	public void setTipo(final String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Método de acceso a valor.
	 *
	 * @return valor
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * Método para establecer valor.
	 *
	 * @param valor
	 *                  valor a establecer
	 */
	public void setValor(final String valor) {
		this.valor = valor;
	}

	/**
	 * Método de acceso a mostrar.
	 * 
	 * @return mostrar
	 */
	public boolean isMostrar() {
		return mostrar;
	}

	/**
	 * Método para establecer mostrar.
	 * 
	 * @param mostrar
	 *                    mostrar a establecer
	 */
	public void setMostrar(final boolean mostrar) {
		this.mostrar = mostrar;
	}

}
