package es.caib.loginib.rest.api.v1;

import java.util.Map;


import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Respuesta datos ticket.
 *
 * @author indra
 *
 */
public final class RDatosAutenticacion {

	/**
	 * Id sesión autenticación.
	 *
	 */
	@Schema(description = "Identificador sesión autenticación", required = true)
	private String idSesion;

	/**
	 * Metodo autenticacion.
	 *
	 */
	@Schema(description = "Metodo autenticacion (Valores: ANONIMO;CLAVE_CERTIFICADO;CLAVE_PIN;CLAVE_PERMANENTE;CLAVE_MOVIL;CLIENTCERT;USUARIO_PASSWORD)", required = true)
	private String metodoAutenticacion;

	/**
	 * QAA.
	 */
	@Schema(description = "QAA (Débil:0 / Bajo:1 / Medio: 2 / Alto: 3)", required = true)
	private String qaa;

	/**
	 * Nif.
	 *
	 */
	@Schema(description = "Nif", required = true)
	private String nif;

	/**
	 * Nombre.
	 *
	 */
	@Schema(description = "Nombre", required = true)
	private String nombre;

	/**
	 * Apellidos.
	 *
	 */
	@Schema(description = "Apellidos", required = false)
	private String apellidos;

	/**
	 * Apellido 1.
	 *
	 */
	@Schema(description = "Apellido 1", required = false)
	private String apellido1;

	/**
	 * Apellido 2.
	 *
	 */
	@Schema(description = "Apellido 2", required = false)
	private String apellido2;

	/**
	 * Representante en caso de persona jurídica.
	 */
	@Schema(description = "Representante en caso de persona jurídica", required = false)
	private RDatosRepresentante representante;

	/**
	 * Apellido 2.
	 *
	 */
	@Schema(description = "Params APP", required = false)
	private Map<String, String> paramsApp;

	/**
	 * Método de acceso a metodoAutenticacion.
	 *
	 * @return metodoAutenticacion
	 */
	public String getMetodoAutenticacion() {
		return metodoAutenticacion;
	}

	/**
	 * Método para establecer metodoAutenticacion.
	 *
	 * @param metodoAutenticacion metodoAutenticacion a establecer
	 */
	public void setMetodoAutenticacion(final String metodoAutenticacion) {
		this.metodoAutenticacion = metodoAutenticacion;
	}

	/**
	 * Método de acceso a nif.
	 *
	 * @return nif
	 */
	public String getNif() {
		return nif;
	}

	/**
	 * Método para establecer nif.
	 *
	 * @param nif nif a establecer
	 */
	public void setNif(final String nif) {
		this.nif = nif;
	}

	/**
	 * Método de acceso a nombre.
	 *
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método para establecer nombre.
	 *
	 * @param nombre nombre a establecer
	 */
	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método de acceso a apellidos.
	 *
	 * @return apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Método para establecer apellidos.
	 *
	 * @param apellidos apellidos a establecer
	 */
	public void setApellidos(final String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Método de acceso a apellido1.
	 *
	 * @return apellido1
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * Método para establecer apellido1.
	 *
	 * @param apellido1 apellido1 a establecer
	 */
	public void setApellido1(final String apellido1) {
		this.apellido1 = apellido1;
	}

	/**
	 * Método de acceso a apellido2.
	 *
	 * @return apellido2
	 */
	public String getApellido2() {
		return apellido2;
	}

	/**
	 * Método para establecer apellido2.
	 *
	 * @param apellido2 apellido2 a establecer
	 */
	public void setApellido2(final String apellido2) {
		this.apellido2 = apellido2;
	}

	/**
	 * Método de acceso a representante.
	 *
	 * @return representante
	 */
	public RDatosRepresentante getRepresentante() {
		return representante;
	}

	/**
	 * Método para establecer representante.
	 *
	 * @param representante representante a establecer
	 */
	public void setRepresentante(final RDatosRepresentante representante) {
		this.representante = representante;
	}

	/**
	 * Método de acceso a qaa.
	 *
	 * @return qaa
	 */
	public String getQaa() {
		return qaa;
	}

	/**
	 * Método para establecer qaa.
	 *
	 * @param qaa qaa a establecer
	 */
	public void setQaa(final String qaa) {
		this.qaa = qaa;
	}

	/**
	 * Método de acceso a idSesion.
	 *
	 * @return idSesion
	 */
	public String getIdSesion() {
		return idSesion;
	}

	/**
	 * Método para establecer idSesion.
	 *
	 * @param idSesion idSesion a establecer
	 */
	public void setIdSesion(final String idSesion) {
		this.idSesion = idSesion;
	}

	public Map<String, String> getParamsApp() {
		return paramsApp;
	}

	public void setParamsApp(final Map<String, String> paramsApp) {
		this.paramsApp = paramsApp;
	}

}
