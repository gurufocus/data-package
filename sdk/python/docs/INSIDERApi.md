# openapi_client.INSIDERApi

All URIs are relative to *https://api.gurufocus.com/data*

Method | HTTP request | Description
------------- | ------------- | -------------
[**insiders_date_get**](INSIDERApi.md#insiders_date_get) | **GET** /insiders/{date} | A comprehensive record of insider trading and institutional ownership for investment research or powering data-driven financial tools that track executive trading behavior over time


# **insiders_date_get**
> List[InsiderTransaction] insiders_date_get(var_date)

A comprehensive record of insider trading and institutional ownership for investment research or powering data-driven financial tools that track executive trading behavior over time

For all publicly traded companies: <ul><li>Open market insider trading transactions since 2004</li></ul>

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.insider_transaction import InsiderTransaction
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
    api_instance = openapi_client.INSIDERApi(api_client)
    var_date = 'Sun Oct 01 00:00:00 UTC 2023' # date | Date in YYYY-MM-DD format

    try:
        # A comprehensive record of insider trading and institutional ownership for investment research or powering data-driven financial tools that track executive trading behavior over time
        api_response = api_instance.insiders_date_get(var_date)
        print("The response of INSIDERApi->insiders_date_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling INSIDERApi->insiders_date_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **var_date** | **date**| Date in YYYY-MM-DD format | 

### Return type

[**List[InsiderTransaction]**](InsiderTransaction.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A comprehensive record of insider trading and institutional ownership for investment research or powering data-driven financial tools that track executive trading behavior over time |  -  |
**403** | 403003: No permission to check resource |  -  |
**404** | 404001: Resource not found |  -  |
**500** | 500001: There are internal error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

