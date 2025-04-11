# StockApi

All URIs are relative to *https://api.gurufocus.com/data*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**stocksSymbolFundamentalsGet**](StockApi.md#stocksSymbolFundamentalsGet) | **GET** /stocks/{symbol}/fundamentals | Complete historical financial statements providing the data needed for in-depth analysis, valuation modeling, and building investment research platforms. |
| [**stocksSymbolProfileGet**](StockApi.md#stocksSymbolProfileGet) | **GET** /stocks/{symbol}/profile | Access essential company details and current valuation metrics to power investment platforms, populate company directories, or enhance financial analysis tools with up-to-date market data. |
| [**stocksSymbolRankingsGet**](StockApi.md#stocksSymbolRankingsGet) | **GET** /stocks/{symbol}/rankings | Proprietary scoring and ranking systems that assess company quality, valuation, and performance for powering data-driven investment platforms. |
| [**stocksSymbolSegmentGet**](StockApi.md#stocksSymbolSegmentGet) | **GET** /stocks/{symbol}/segment | Gain insights into a company&#39;s revenue breakdown by product and geography to build detailed financial visualizations, enhance stock research platforms, or create data-driven market analysis tools |
| [**stocksSymbolValuationsGet**](StockApi.md#stocksSymbolValuationsGet) | **GET** /stocks/{symbol}/valuations | A deep dataset of historical valuation metrics to support investors and entrepreneurs in the development of data-driven investment platforms. |


<a id="stocksSymbolFundamentalsGet"></a>
# **stocksSymbolFundamentalsGet**
> StocksSymbolFundamentalsGet200Response stocksSymbolFundamentalsGet(symbol)

Complete historical financial statements providing the data needed for in-depth analysis, valuation modeling, and building investment research platforms.

&lt;ul&gt; &lt;li&gt;Income Statement&lt;/li&gt; &lt;li&gt;Balance Sheet&lt;/li&gt; &lt;li&gt;Cash Flow Statement&lt;/li&gt; &lt;/ul&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gurufocus.com/data");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    StockApi apiInstance = new StockApi(defaultClient);
    String symbol = "symbol_example"; // String | Stock symbol
    try {
      StocksSymbolFundamentalsGet200Response result = apiInstance.stocksSymbolFundamentalsGet(symbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StockApi#stocksSymbolFundamentalsGet");
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
| **symbol** | **String**| Stock symbol | |

### Return type

[**StocksSymbolFundamentalsGet200Response**](StocksSymbolFundamentalsGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Complete historical financial statements providing the data needed for in-depth analysis, valuation modeling, and building investment research platforms. |  -  |
| **403** | 403003: No permission to check resource |  -  |
| **404** | 404001: Resource not found |  -  |
| **500** | 500001: There are internal error |  -  |

<a id="stocksSymbolProfileGet"></a>
# **stocksSymbolProfileGet**
> StocksSymbolProfileGet200Response stocksSymbolProfileGet(symbol)

Access essential company details and current valuation metrics to power investment platforms, populate company directories, or enhance financial analysis tools with up-to-date market data.

&lt;ul&gt; &lt;li&gt;Basic company info &lt;p&gt;Name, description, address, etc.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;Current stock price&lt;/li&gt; &lt;li&gt;Current key valuation ratios &lt;p&gt;P/E, P/B, P/S, etc.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;And more!&lt;/li&gt; &lt;/ul&gt; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gurufocus.com/data");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    StockApi apiInstance = new StockApi(defaultClient);
    String symbol = "symbol_example"; // String | Stock symbol
    try {
      StocksSymbolProfileGet200Response result = apiInstance.stocksSymbolProfileGet(symbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StockApi#stocksSymbolProfileGet");
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
| **symbol** | **String**| Stock symbol | |

### Return type

[**StocksSymbolProfileGet200Response**](StocksSymbolProfileGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Access essential company details and current valuation metrics to power investment platforms, populate company directories, or enhance financial analysis tools with up-to-date market data. |  -  |
| **403** | 403003: No permission to check resource |  -  |
| **404** | 404001: Resource not found |  -  |
| **500** | 500001: There are internal error |  -  |

<a id="stocksSymbolRankingsGet"></a>
# **stocksSymbolRankingsGet**
> StocksSymbolRankingsGet200Response stocksSymbolRankingsGet(symbol)

Proprietary scoring and ranking systems that assess company quality, valuation, and performance for powering data-driven investment platforms.

&lt;ul&gt; &lt;li&gt;GF Score&lt;/li&gt; &lt;li&gt;GF Value&lt;/li&gt; &lt;li&gt;Predictability Rank&lt;/li&gt; &lt;li&gt;Financial Strength&lt;/li&gt; &lt;li&gt;Profitability Rank&lt;/li&gt; &lt;li&gt;and more!&lt;/li&gt; &lt;/ul&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gurufocus.com/data");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    StockApi apiInstance = new StockApi(defaultClient);
    String symbol = "symbol_example"; // String | Stock symbol
    try {
      StocksSymbolRankingsGet200Response result = apiInstance.stocksSymbolRankingsGet(symbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StockApi#stocksSymbolRankingsGet");
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
| **symbol** | **String**| Stock symbol | |

### Return type

[**StocksSymbolRankingsGet200Response**](StocksSymbolRankingsGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Proprietary scoring and ranking systems that assess company quality, valuation, and performance for powering data-driven investment platforms. |  -  |
| **403** | 403003: No permission to check resource |  -  |
| **404** | 404001: Resource not found |  -  |
| **500** | 500001: There are internal error |  -  |

<a id="stocksSymbolSegmentGet"></a>
# **stocksSymbolSegmentGet**
> StocksSymbolSegmentGet200Response stocksSymbolSegmentGet(symbol)

Gain insights into a company&#39;s revenue breakdown by product and geography to build detailed financial visualizations, enhance stock research platforms, or create data-driven market analysis tools

&lt;ul&gt; &lt;li&gt;Geographic segment data&lt;/li&gt; &lt;li&gt;Product and service segment data&lt;/li&gt; &lt;/ul&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gurufocus.com/data");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    StockApi apiInstance = new StockApi(defaultClient);
    String symbol = "symbol_example"; // String | Stock symbol
    try {
      StocksSymbolSegmentGet200Response result = apiInstance.stocksSymbolSegmentGet(symbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StockApi#stocksSymbolSegmentGet");
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
| **symbol** | **String**| Stock symbol | |

### Return type

[**StocksSymbolSegmentGet200Response**](StocksSymbolSegmentGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gain insights into a company&#39;s revenue breakdown by product and geography to build detailed financial visualizations, enhance stock research platforms, or create data-driven market analysis tools |  -  |
| **403** | 403003: No permission to check resource |  -  |
| **404** | 404001: Resource not found |  -  |
| **500** | 500001: There are internal error |  -  |

<a id="stocksSymbolValuationsGet"></a>
# **stocksSymbolValuationsGet**
> StocksSymbolValuationsGet200Response stocksSymbolValuationsGet(symbol)

A deep dataset of historical valuation metrics to support investors and entrepreneurs in the development of data-driven investment platforms.

&lt;ul&gt; &lt;li&gt;P/E Ratios&lt;/li&gt; &lt;li&gt;P/B Ratios&lt;/li&gt; &lt;li&gt;Dividend Yields&lt;/li&gt; &lt;li&gt;F-Scores&lt;/li&gt; &lt;li&gt;Z-Scores&lt;/li&gt; &lt;li&gt;And more!&lt;/li&gt; &lt;/ul&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.gurufocus.com/data");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    StockApi apiInstance = new StockApi(defaultClient);
    String symbol = "symbol_example"; // String | Stock symbol
    try {
      StocksSymbolValuationsGet200Response result = apiInstance.stocksSymbolValuationsGet(symbol);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StockApi#stocksSymbolValuationsGet");
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
| **symbol** | **String**| Stock symbol | |

### Return type

[**StocksSymbolValuationsGet200Response**](StocksSymbolValuationsGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A deep dataset of historical valuation metrics to support investors and entrepreneurs in the development of data-driven investment platforms. |  -  |
| **403** | 403003: No permission to check resource |  -  |
| **404** | 404001: Resource not found |  -  |
| **500** | 500001: There are internal error |  -  |

