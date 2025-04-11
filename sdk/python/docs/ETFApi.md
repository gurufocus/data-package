# openapi_client.ETFApi

All URIs are relative to *https://api.gurufocus.com/data*

Method | HTTP request | Description
------------- | ------------- | -------------
[**etf_symbol_get**](ETFApi.md#etf_symbol_get) | **GET** /etf/{symbol} | ETF profile, key statistics and holdings.


# **etf_symbol_get**
> EtfSymbolGet200Response etf_symbol_get(symbol)

ETF profile, key statistics and holdings.



### Example

* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.etf_symbol_get200_response import EtfSymbolGet200Response
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
    api_instance = openapi_client.ETFApi(api_client)
    symbol = 'symbol_example' # str | ETF symbol

    try:
        # ETF profile, key statistics and holdings.
        api_response = api_instance.etf_symbol_get(symbol)
        print("The response of ETFApi->etf_symbol_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ETFApi->etf_symbol_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| ETF symbol | 

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
**200** | ETF profile, key statistics and holdings. |  -  |
**403** | 403003: No permission to check resource |  -  |
**404** | 404001: Resource not found |  -  |
**500** | 500001: There are internal error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

