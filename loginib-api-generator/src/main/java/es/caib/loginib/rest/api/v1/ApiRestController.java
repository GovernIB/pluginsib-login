package es.caib.loginib.rest.api.v1;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.fundaciobit.pluginsib.utils.rest.RestExceptionInfo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * Operaciones login.
 *
 * @author anadal
 *
 */
@Path("/") // La versió v1 ja ve implicita en elpath
@OpenAPIDefinition(
        info = @io.swagger.v3.oas.annotations.info.Info(
                title = "LoginIB API REST v1",
                version = "1.0",
                description = "API REST per interactuar amb el servei de LoginIB."),
        tags = @Tag(
                name = ApiRestController.TAG_NAME,
                description = "LoginIB Swagger v1. "
                        + "Operacions per interactuar amb l'API de LoginIB."))
@SecurityScheme(type = SecuritySchemeType.HTTP, name = ApiRestController.SECURITY_NAME, scheme = "basic")
@ApiResponses(
        value = {
                @ApiResponse(
                        responseCode = "400",
                        description = "Paràmetres incorrectes",
                        content = @Content(
                                mediaType = MediaType.APPLICATION_JSON,
                                schema = @Schema(implementation = RestExceptionInfo.class))),
                @ApiResponse(
                        responseCode = "401",
                        description = "No Autenticat",
                        content = { @Content(
                                mediaType = MediaType.APPLICATION_JSON,
                                schema = @Schema(implementation = RestExceptionInfo.class)) }),
                @ApiResponse(
                        responseCode = "403",
                        description = "No autoritzat",
                        content = {
                                @Content(
                                        mediaType = MediaType.APPLICATION_JSON,
                                        schema = @Schema(implementation = RestExceptionInfo.class)) }),
                @ApiResponse(
                        responseCode = "500",
                        description = "Error no controlat",
                        content = {
                                @Content(
                                        mediaType = MediaType.APPLICATION_JSON,
                                        schema = @Schema(implementation = RestExceptionInfo.class)
                                ) }) })
public class ApiRestController {

    public static final String SECURITY_NAME = "BasicAuth";
    
    /**
     * IMPORTANT: Alerta a canviar aquest nom, ja que s'utilitza com a nom de servei en el Client Swagger
     */
    public static final String TAG_NAME = "LoginIBV1";

	/**
	 * Login.
	 *
	 * @return Url redirección Clave
	 */	
	
	@Path(value = "/login")
    @POST
    @SecurityRequirement(name = SECURITY_NAME)
    @Produces({ MediaType.APPLICATION_JSON })
    @Operation(
            summary = "Iniciar proceso de inicio de sesión",
            tags = TAG_NAME,
            operationId = "login",
            requestBody = @RequestBody(
                    description = "Solicita i configura una transacció de firma web",
                    content = @Content(
                            mediaType = MediaType.APPLICATION_JSON,
                            schema = @Schema(
                                    name = "parametros",
                                    requiredMode = RequiredMode.NOT_REQUIRED,
                                    implementation = RLoginParams.class)))
            )
	@ApiResponses(
            value = { @ApiResponse(
                    responseCode = "200",
                    description = "Url redirección Clave",
                    content = @Content(
                            mediaType = MediaType.APPLICATION_JSON,
                            schema = @Schema(implementation = String.class))) })
	public String login(@RequestBody(required = false) final RLoginParams parametros) {

		
		return null;

	}

	/**
	 * Recupera datos ticket.
	 *
	 * @param ticket ticket
	 * @return datos ticket
	 */

	@Path( "/ticket/{ticket}")
	@GET
    @SecurityRequirement(name = SECURITY_NAME)
    @Produces({ MediaType.APPLICATION_JSON })
    @Operation(
            summary = "Obtiene datos autenticación a partir del ticket",
            tags = TAG_NAME,
            operationId = "ticket"           
            )
    @ApiResponses(
            value = { @ApiResponse(
                    responseCode = "200",
                    description = "Datos autenticación",
                    content = @Content(
                            mediaType = MediaType.APPLICATION_JSON,
                            schema = @Schema(implementation = RDatosAutenticacion.class))) })
	public RDatosAutenticacion obtenerDatosTicket(@PathParam("ticket") final String ticket) {
		
		return null;

	}

	/**
	 * Logout.
	 *
	 * @return Url redirección Clave
	 */
	@Path("/logout")
	@POST
    @SecurityRequirement(name = SECURITY_NAME)
    @Produces({ MediaType.APPLICATION_JSON })
    @Operation(
            summary = "Realiza logout en Cl@ve",
            tags = TAG_NAME,
            operationId = "logout",
            requestBody = @RequestBody(
                    description = "Logout params",
                    content = @Content(
                            mediaType = MediaType.APPLICATION_JSON,
                            schema = @Schema(
                                    name = "parametros",
                                    requiredMode = RequiredMode.REQUIRED,
                                    implementation = RLogoutParams.class)))
            )
    @ApiResponses(
            value = { @ApiResponse(
                    responseCode = "200",
                    description = "Url redirección ",
                    content = @Content(
                            mediaType = MediaType.APPLICATION_JSON,
                            schema = @Schema(implementation = String.class))) })
	public String logout(@RequestBody(required = false) final RLogoutParams parametros) {

		

		return null;

	}

	/**
	 * Obtener evidencias autenticación.
	 *
	 * @return obtiene evidencias autenticación-
	 */
	@Path("/evidencias/{idSesion}")
	@GET
    @SecurityRequirement(name = SECURITY_NAME)
    @Produces({ MediaType.APPLICATION_JSON })
    @Operation(
            summary = "Obtener evidencias autenticación",
            tags = TAG_NAME,
            operationId = "evidencias"
            // Definir
            )
    @ApiResponses(
            value = { @ApiResponse(
                    responseCode = "200",
                    description = "Evidencies autenticación",
                    content = @Content(
                            mediaType = MediaType.APPLICATION_JSON,
                            schema = @Schema(implementation = REvidenciasAutenticacion.class))) })
	public REvidenciasAutenticacion obtenerEvidenciasAutenticacion(@PathParam("idSesion") final String idSesion) {
		
		return null;
	}

}
