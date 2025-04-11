# openapi_client.STOCKApi

All URIs are relative to *https://api.gurufocus.com/data*

Method | HTTP request | Description
------------- | ------------- | -------------
[**stocks_symbol_fundamentals_get**](STOCKApi.md#stocks_symbol_fundamentals_get) | **GET** /stocks/{symbol}/fundamentals | Complete historical financial statements providing the data needed for in-depth analysis, valuation modeling, and building investment research platforms.
[**stocks_symbol_profile_get**](STOCKApi.md#stocks_symbol_profile_get) | **GET** /stocks/{symbol}/profile | Access essential company details and current valuation metrics to power investment platforms, populate company directories, or enhance financial analysis tools with up-to-date market data.
[**stocks_symbol_rankings_get**](STOCKApi.md#stocks_symbol_rankings_get) | **GET** /stocks/{symbol}/rankings | Proprietary scoring and ranking systems that assess company quality, valuation, and performance for powering data-driven investment platforms.
[**stocks_symbol_segment_get**](STOCKApi.md#stocks_symbol_segment_get) | **GET** /stocks/{symbol}/segment | Gain insights into a company&#39;s revenue breakdown by product and geography to build detailed financial visualizations, enhance stock research platforms, or create data-driven market analysis tools
[**stocks_symbol_valuations_get**](STOCKApi.md#stocks_symbol_valuations_get) | **GET** /stocks/{symbol}/valuations | A deep dataset of historical valuation metrics to support investors and entrepreneurs in the development of data-driven investment platforms.


# **stocks_symbol_fundamentals_get**
> StocksSymbolFundamentalsGet200Response stocks_symbol_fundamentals_get(symbol)

Complete historical financial statements providing the data needed for in-depth analysis, valuation modeling, and building investment research platforms.

<ul> <li>Income Statement</li> <li>Balance Sheet</li> <li>Cash Flow Statement</li> </ul>

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.stocks_symbol_fundamentals_get200_response import StocksSymbolFundamentalsGet200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.gurufocus.com/data
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.gurufocus.com/data"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.STOCKApi(api_client)
    symbol = 'symbol_example' # str | Stock symbol

    try:
        # Complete historical financial statements providing the data needed for in-depth analysis, valuation modeling, and building investment research platforms.
        api_response = api_instance.stocks_symbol_fundamentals_get(symbol)
        print("The response of STOCKApi->stocks_symbol_fundamentals_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling STOCKApi->stocks_symbol_fundamentals_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Stock symbol | 

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
**200** | Complete historical financial statements providing the data needed for in-depth analysis, valuation modeling, and building investment research platforms. |  -  |
**403** | 403003: No permission to check resource |  -  |
**404** | 404001: Resource not found |  -  |
**500** | 500001: There are internal error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stocks_symbol_profile_get**
> StocksSymbolProfileGet200Response stocks_symbol_profile_get(symbol)

Access essential company details and current valuation metrics to power investment platforms, populate company directories, or enhance financial analysis tools with up-to-date market data.

<ul> <li>Basic company info <p>Name, description, address, etc.</p></li> <li>Current stock price</li> <li>Current key valuation ratios <p>P/E, P/B, P/S, etc.</p></li> <li>And more!</li> </ul> 

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.stocks_symbol_profile_get200_response import StocksSymbolProfileGet200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.gurufocus.com/data
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.gurufocus.com/data"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.STOCKApi(api_client)
    symbol = 'symbol_example' # str | Stock symbol

    try:
        # Access essential company details and current valuation metrics to power investment platforms, populate company directories, or enhance financial analysis tools with up-to-date market data.
        api_response = api_instance.stocks_symbol_profile_get(symbol)
        print("The response of STOCKApi->stocks_symbol_profile_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling STOCKApi->stocks_symbol_profile_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Stock symbol | 

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
**200** | Access essential company details and current valuation metrics to power investment platforms, populate company directories, or enhance financial analysis tools with up-to-date market data. |  -  |
**403** | 403003: No permission to check resource |  -  |
**404** | 404001: Resource not found |  -  |
**500** | 500001: There are internal error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stocks_symbol_rankings_get**
> StocksSymbolRankingsGet200Response stocks_symbol_rankings_get(symbol)

Proprietary scoring and ranking systems that assess company quality, valuation, and performance for powering data-driven investment platforms.

<ul> <li>GF Score</li> <li>GF Value</li> <li>Predictability Rank</li> <li>Financial Strength</li> <li>Profitability Rank</li> <li>and more!</li> </ul>

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.stocks_symbol_rankings_get200_response import StocksSymbolRankingsGet200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.gurufocus.com/data
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.gurufocus.com/data"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.STOCKApi(api_client)
    symbol = 'symbol_example' # str | Stock symbol

    try:
        # Proprietary scoring and ranking systems that assess company quality, valuation, and performance for powering data-driven investment platforms.
        api_response = api_instance.stocks_symbol_rankings_get(symbol)
        print("The response of STOCKApi->stocks_symbol_rankings_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling STOCKApi->stocks_symbol_rankings_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Stock symbol | 

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
**200** | Proprietary scoring and ranking systems that assess company quality, valuation, and performance for powering data-driven investment platforms. |  -  |
**403** | 403003: No permission to check resource |  -  |
**404** | 404001: Resource not found |  -  |
**500** | 500001: There are internal error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stocks_symbol_segment_get**
> StocksSymbolSegmentGet200Response stocks_symbol_segment_get(symbol)

Gain insights into a company's revenue breakdown by product and geography to build detailed financial visualizations, enhance stock research platforms, or create data-driven market analysis tools

<ul> <li>Geographic segment data</li> <li>Product and service segment data</li> </ul>

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.stocks_symbol_segment_get200_response import StocksSymbolSegmentGet200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.gurufocus.com/data
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.gurufocus.com/data"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.STOCKApi(api_client)
    symbol = 'symbol_example' # str | Stock symbol

    try:
        # Gain insights into a company's revenue breakdown by product and geography to build detailed financial visualizations, enhance stock research platforms, or create data-driven market analysis tools
        api_response = api_instance.stocks_symbol_segment_get(symbol)
        print("The response of STOCKApi->stocks_symbol_segment_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling STOCKApi->stocks_symbol_segment_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Stock symbol | 

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
**200** | Gain insights into a company&#39;s revenue breakdown by product and geography to build detailed financial visualizations, enhance stock research platforms, or create data-driven market analysis tools |  -  |
**403** | 403003: No permission to check resource |  -  |
**404** | 404001: Resource not found |  -  |
**500** | 500001: There are internal error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stocks_symbol_valuations_get**
> StocksSymbolValuationsGet200Response stocks_symbol_valuations_get(symbol)

A deep dataset of historical valuation metrics to support investors and entrepreneurs in the development of data-driven investment platforms.

<ul> <li>P/E Ratios</li> <li>P/B Ratios</li> <li>Dividend Yields</li> <li>F-Scores</li> <li>Z-Scores</li> <li>And more!</li> </ul>

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.stocks_symbol_valuations_get200_response import StocksSymbolValuationsGet200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.gurufocus.com/data
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.gurufocus.com/data"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.STOCKApi(api_client)
    symbol = 'symbol_example' # str | Stock symbol

    try:
        # A deep dataset of historical valuation metrics to support investors and entrepreneurs in the development of data-driven investment platforms.
        api_response = api_instance.stocks_symbol_valuations_get(symbol)
        print("The response of STOCKApi->stocks_symbol_valuations_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling STOCKApi->stocks_symbol_valuations_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Stock symbol | 

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
**200** | A deep dataset of historical valuation metrics to support investors and entrepreneurs in the development of data-driven investment platforms. |  -  |
**403** | 403003: No permission to check resource |  -  |
**404** | 404001: Resource not found |  -  |
**500** | 500001: There are internal error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

