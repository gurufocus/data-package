# GuruApi

All URIs are relative to *https://api.gurufocus.com/data*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gurusIdGet**](GuruApi.md#gurusIdGet) | **GET** /gurus/{id} | Access the holdings and trades of over 4,500 institutional investors, enabling broad market trend analysis or fueling investment research tools with extensive institutional activity data |
| [**gurusListGet**](GuruApi.md#gurusListGet) | **GET** /gurus/list | Get the list of available gurus&#39; basic information |


<a id="gurusIdGet"></a>
# **gurusIdGet**
> GurusIdGet200Response gurusIdGet(id)

Access the holdings and trades of over 4,500 institutional investors, enabling broad market trend analysis or fueling investment research tools with extensive institutional activity data

Last four quarters and future: &lt;ul&gt; &lt;li&gt;Quarterly portfolio holdings of the last 4 quarters&lt;/li&gt; &lt;li&gt;13D/G Data of the last 12 months&lt;/li&gt; &lt;/ul&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuruApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gurufocus.com/data");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GuruApi apiInstance = new GuruApi(defaultClient);
    BigDecimal id = new BigDecimal(78); // BigDecimal | Guru ID
    try {
      GurusIdGet200Response result = apiInstance.gurusIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuruApi#gurusIdGet");
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
| **id** | **BigDecimal**| Guru ID | |

### Return type

[**GurusIdGet200Response**](GurusIdGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Access the holdings and trades of over 4,500 institutional investors, enabling broad market trend analysis or fueling investment research tools with extensive institutional activity data |  -  |
| **403** | 403003: No permission to check resource |  -  |
| **404** | 404001: Resource not found |  -  |
| **500** | 500001: There are internal error |  -  |

<a id="gurusListGet"></a>
# **gurusListGet**
> GurusListGet200Response gurusListGet(perPage, page)

Get the list of available gurus&#39; basic information

Returns the list of available gurus&#39; basic information. You can use this api to map Gurufocus guru id and the id in your own system. The list is sorted by the id. You can use the &#x60;page&#x60; and &#x60;per_page&#x60; parameters to paginate the results.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuruApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gurufocus.com/data");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GuruApi apiInstance = new GuruApi(defaultClient);
    Integer perPage = 10; // Integer | The number of items to return per page. Default is 100.
    Integer page = 1; // Integer | The page number to return. Default is 1.
    try {
      GurusListGet200Response result = apiInstance.gurusListGet(perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuruApi#gurusListGet");
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
| **perPage** | **Integer**| The number of items to return per page. Default is 100. | [optional] |
| **page** | **Integer**| The page number to return. Default is 1. | [optional] |

### Return type

[**GurusListGet200Response**](GurusListGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of gurus |  -  |
| **403** | 403003: No permission to check resource |  -  |
| **404** | 404001: Resource not found |  -  |
| **500** | 500001: There are internal error |  -  |

