

# RLoginParams

Datos para iniciar proceso de inicio de sesión

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entidad** | **String** | Código Entidad (DIR3) |  |
|**urlCallback** | **String** | Url Callback login |  |
|**urlCallbackError** | **String** | Url Callback error |  |
|**metodosAutenticacion** | **String** | Metodos autenticacion clave (separados por ;). Valores: ANONIMO;CLAVE_CERTIFICADO;CLAVE_PIN;CLAVE_PERMANENTE;CLAVE_MOVIL;CLIENTCERT;USUARIO_PASSWORD |  |
|**qaa** | **Integer** | Nivel autenticacion: 1 (Bajo), 2 (Medio) y 3 (Alto). |  [optional] |
|**idioma** | **String** | Idioma |  |
|**inicioClaveAutomatico** | **Boolean** | Iniciar Cl@ve automatico |  |
|**forzarAutenticacion** | **Boolean** | Forzar autenticación |  |
|**aplicacion** | **String** | Aplicación |  [optional] |
|**auditar** | **Boolean** | Indica si genera auditoría autenticación (con evidencias autenticación) |  [optional] |
|**paramsApp** | [**RParamsApp**](RParamsApp.md) |  |  [optional] |



