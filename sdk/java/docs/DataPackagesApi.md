# DataPackagesApi

All URIs are relative to *https://api.gurufocus.com/data*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadIdGet**](DataPackagesApi.md#downloadIdGet) | **GET** /download/{id} | Get download url of the data package |
| [**downloadListGet**](DataPackagesApi.md#downloadListGet) | **GET** /download/list | List available data packages |


<a id="downloadIdGet"></a>
# **downloadIdGet**
> DownloadIdGet200Response downloadIdGet(id)

Get download url of the data package

Returns the download URL of the specified data package, please consume the url within then expiration time. After that, the url will be invalid. The default expiration time is 5 minutes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gurufocus.com/data");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataPackagesApi apiInstance = new DataPackagesApi(defaultClient);
    String id = "ebe74eed-6a33-4988-b94f-c7afb6b3e919"; // String | Data package ID
    try {
      DownloadIdGet200Response result = apiInstance.downloadIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataPackagesApi#downloadIdGet");
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
| **id** | **String**| Data package ID | |

### Return type

[**DownloadIdGet200Response**](DownloadIdGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download URL of the data package |  -  |
| **403** | 403003: No permission to check resource |  -  |
| **404** | 404001: Resource not found |  -  |
| **500** | 500001: There are internal error |  -  |

<a id="downloadListGet"></a>
# **downloadListGet**
> List&lt;DownloadListGet200ResponseInner&gt; downloadListGet()

List available data packages

Returns a list of all data packages available in the system.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gurufocus.com/data");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataPackagesApi apiInstance = new DataPackagesApi(defaultClient);
    try {
      List<DownloadListGet200ResponseInner> result = apiInstance.downloadListGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataPackagesApi#downloadListGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DownloadListGet200ResponseInner&gt;**](DownloadListGet200ResponseInner.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of data packages |  -  |
| **403** | 403003: No permission to check resource |  -  |
| **404** | 404001: Resource not found |  -  |
| **500** | 500001: There are internal error |  -  |

