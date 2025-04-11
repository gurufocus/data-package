# EtfApi

All URIs are relative to *https://api.gurufocus.com/data*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**etfSymbolGet**](EtfApi.md#etfSymbolGet) | **GET** /etf/{symbol} | ETF profile, key statistics and holdings. |


<a id="etfSymbolGet"></a>
# **etfSymbolGet**
> EtfSymbolGet200Response etfSymbolGet(symbol)

ETF profile, key statistics and holdings.



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EtfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gurufocus.com/data");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EtfApi apiInstance = new EtfApi(defaultClient);
    String symbol = "symbol_example"; // String | ETF symbol
    try {
      EtfSymbolGet200Response result = apiInstance.etfSymbolGet(symbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EtfApi#etfSymbolGet");
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
| **symbol** | **String**| ETF symbol | |

### Return type

[**EtfSymbolGet200Response**](EtfSymbolGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ETF profile, key statistics and holdings. |  -  |
| **403** | 403003: No permission to check resource |  -  |
| **404** | 404001: Resource not found |  -  |
| **500** | 500001: There are internal error |  -  |

