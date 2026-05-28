# LoginIbv1Api

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**evidencias**](LoginIbv1Api.md#evidencias) | **GET** /evidencias/{idSesion} | Obtener evidencias autenticación |
| [**login**](LoginIbv1Api.md#login) | **POST** /login | Iniciar proceso de inicio de sesión |
| [**logout**](LoginIbv1Api.md#logout) | **POST** /logout | Realiza logout en Cl@ve |
| [**ticket**](LoginIbv1Api.md#ticket) | **GET** /ticket/{ticket} | Obtiene datos autenticación a partir del ticket |



## evidencias

> REvidenciasAutenticacion evidencias(idSesion)

Obtener evidencias autenticación

### Example

```java
// Import classes:
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.ApiClient;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.ApiException;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.Configuration;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.auth.*;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.models.*;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.api.LoginIbv1Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("YOUR USERNAME");
        BasicAuth.setPassword("YOUR PASSWORD");

        LoginIbv1Api apiInstance = new LoginIbv1Api(defaultClient);
        String idSesion = "idSesion_example"; // String | 
        try {
            REvidenciasAutenticacion result = apiInstance.evidencias(idSesion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoginIbv1Api#evidencias");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idSesion** | **String**|  | |

### Return type

[**REvidenciasAutenticacion**](REvidenciasAutenticacion.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Paràmetres incorrectes |  -  |
| **401** | No Autenticat |  -  |
| **403** | No autoritzat |  -  |
| **500** | Error no controlat |  -  |
| **200** | Evidencies autenticación |  -  |


## login

> String login(rloginParams)

Iniciar proceso de inicio de sesión

### Example

```java
// Import classes:
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.ApiClient;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.ApiException;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.Configuration;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.auth.*;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.models.*;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.api.LoginIbv1Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("YOUR USERNAME");
        BasicAuth.setPassword("YOUR PASSWORD");

        LoginIbv1Api apiInstance = new LoginIbv1Api(defaultClient);
        RLoginParams rloginParams = new RLoginParams(); // RLoginParams | Solicita i configura una transacció de firma web
        try {
            String result = apiInstance.login(rloginParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoginIbv1Api#login");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **rloginParams** | [**RLoginParams**](RLoginParams.md)| Solicita i configura una transacció de firma web | [optional] |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Paràmetres incorrectes |  -  |
| **401** | No Autenticat |  -  |
| **403** | No autoritzat |  -  |
| **500** | Error no controlat |  -  |
| **200** | Url redirección Clave |  -  |


## logout

> String logout(rlogoutParams)

Realiza logout en Cl@ve

### Example

```java
// Import classes:
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.ApiClient;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.ApiException;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.Configuration;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.auth.*;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.models.*;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.api.LoginIbv1Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("YOUR USERNAME");
        BasicAuth.setPassword("YOUR PASSWORD");

        LoginIbv1Api apiInstance = new LoginIbv1Api(defaultClient);
        RLogoutParams rlogoutParams = new RLogoutParams(); // RLogoutParams | Logout params
        try {
            String result = apiInstance.logout(rlogoutParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoginIbv1Api#logout");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **rlogoutParams** | [**RLogoutParams**](RLogoutParams.md)| Logout params | [optional] |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Paràmetres incorrectes |  -  |
| **401** | No Autenticat |  -  |
| **403** | No autoritzat |  -  |
| **500** | Error no controlat |  -  |
| **200** | Url redirección  |  -  |


## ticket

> RDatosAutenticacion ticket(ticket)

Obtiene datos autenticación a partir del ticket

### Example

```java
// Import classes:
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.ApiClient;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.ApiException;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.Configuration;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.auth.*;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.services.models.*;
import org.fundaciobit.pluginsib.login.loginib.api.client.v1.api.LoginIbv1Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("YOUR USERNAME");
        BasicAuth.setPassword("YOUR PASSWORD");

        LoginIbv1Api apiInstance = new LoginIbv1Api(defaultClient);
        String ticket = "ticket_example"; // String | 
        try {
            RDatosAutenticacion result = apiInstance.ticket(ticket);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoginIbv1Api#ticket");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ticket** | **String**|  | |

### Return type

[**RDatosAutenticacion**](RDatosAutenticacion.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Paràmetres incorrectes |  -  |
| **401** | No Autenticat |  -  |
| **403** | No autoritzat |  -  |
| **500** | Error no controlat |  -  |
| **200** | Datos autenticación |  -  |

