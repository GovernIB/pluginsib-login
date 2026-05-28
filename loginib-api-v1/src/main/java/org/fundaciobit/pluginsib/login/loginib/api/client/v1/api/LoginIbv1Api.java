package org.fundaciobit.pluginsib.login.loginib.api.client.v1.api;

import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.ApiException;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.ApiClient;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.Configuration;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.Pair;

import javax.ws.rs.core.GenericType;

import org.fundaciobit.pluginsib.login.loginib.api.client.v1.model.RDatosAutenticacion;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.model.REvidenciasAutenticacion;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.model.RLoginParams;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.model.RLogoutParams;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.model.RestExceptionInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class LoginIbv1Api {
  private ApiClient apiClient;

  public LoginIbv1Api() {
    this(Configuration.getDefaultApiClient());
  }

  public LoginIbv1Api(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Obtener evidencias autenticación
   * 
   * @param idSesion  (required)
   * @return a {@code REvidenciasAutenticacion}
   * @throws ApiException if fails to make API call
   */
  public REvidenciasAutenticacion evidencias(String idSesion) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'idSesion' is set
    if (idSesion == null) {
      throw new ApiException(400, "Missing the required parameter 'idSesion' when calling evidencias");
    }
    
    // create path and map variables
    String localVarPath = "/evidencias/{idSesion}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "idSesion" + "\\}", apiClient.escapeString(idSesion.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "BasicAuth" };

    GenericType<REvidenciasAutenticacion> localVarReturnType = new GenericType<REvidenciasAutenticacion>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Iniciar proceso de inicio de sesión
   * 
   * @param rloginParams Solicita i configura una transacció de firma web (optional)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String login(RLoginParams rloginParams) throws ApiException {
    Object localVarPostBody = rloginParams;
    
    // create path and map variables
    String localVarPath = "/login".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "BasicAuth" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Realiza logout en Cl@ve
   * 
   * @param rlogoutParams Logout params (optional)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String logout(RLogoutParams rlogoutParams) throws ApiException {
    Object localVarPostBody = rlogoutParams;
    
    // create path and map variables
    String localVarPath = "/logout".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "BasicAuth" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Obtiene datos autenticación a partir del ticket
   * 
   * @param ticket  (required)
   * @return a {@code RDatosAutenticacion}
   * @throws ApiException if fails to make API call
   */
  public RDatosAutenticacion ticket(String ticket) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ticket' is set
    if (ticket == null) {
      throw new ApiException(400, "Missing the required parameter 'ticket' when calling ticket");
    }
    
    // create path and map variables
    String localVarPath = "/ticket/{ticket}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ticket" + "\\}", apiClient.escapeString(ticket.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "BasicAuth" };

    GenericType<RDatosAutenticacion> localVarReturnType = new GenericType<RDatosAutenticacion>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
