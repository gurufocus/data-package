# InsiderApi

All URIs are relative to *https://api.gurufocus.com/data*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**insidersDateGet**](InsiderApi.md#insidersDateGet) | **GET** /insiders/{date} | A comprehensive record of insider trading and institutional ownership for investment research or powering data-driven financial tools that track executive trading behavior over time |


<a id="insidersDateGet"></a>
# **insidersDateGet**
> List&lt;InsiderTransaction&gt; insidersDateGet(date)

A comprehensive record of insider trading and institutional ownership for investment research or powering data-driven financial tools that track executive trading behavior over time

For all publicly traded companies: &lt;ul&gt;&lt;li&gt;Open market insider trading transactions since 2004&lt;/li&gt;&lt;/ul&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InsiderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gurufocus.com/data");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InsiderApi apiInstance = new InsiderApi(defaultClient);
    LocalDate date = LocalDate.parse("Sun Oct 01 00:00:00 UTC 2023"); // LocalDate | Date in YYYY-MM-DD format
    try {
      List<InsiderTransaction> result = apiInstance.insidersDateGet(date);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InsiderApi#insidersDateGet");
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
| **date** | **LocalDate**| Date in YYYY-MM-DD format | |

### Return type

[**List&lt;InsiderTransaction&gt;**](InsiderTransaction.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A comprehensive record of insider trading and institutional ownership for investment research or powering data-driven financial tools that track executive trading behavior over time |  -  |
| **403** | 403003: No permission to check resource |  -  |
| **404** | 404001: Resource not found |  -  |
| **500** | 500001: There are internal error |  -  |

