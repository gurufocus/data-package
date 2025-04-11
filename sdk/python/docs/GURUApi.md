# openapi_client.GURUApi

All URIs are relative to *https://api.gurufocus.com/data*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gurus_id_get**](GURUApi.md#gurus_id_get) | **GET** /gurus/{id} | Access the holdings and trades of over 4,500 institutional investors, enabling broad market trend analysis or fueling investment research tools with extensive institutional activity data
[**gurus_list_get**](GURUApi.md#gurus_list_get) | **GET** /gurus/list | Get the list of available gurus&#39; basic information


# **gurus_id_get**
> GurusIdGet200Response gurus_id_get(id)

Access the holdings and trades of over 4,500 institutional investors, enabling broad market trend analysis or fueling investment research tools with extensive institutional activity data

Last four quarters and future: <ul> <li>Quarterly portfolio holdings of the last 4 quarters</li> <li>13D/G Data of the last 12 months</li> </ul>

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.gurus_id_get200_response import GurusIdGet200Response
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
    api_instance = openapi_client.GURUApi(api_client)
    id = 3.4 # float | Guru ID

    try:
        # Access the holdings and trades of over 4,500 institutional investors, enabling broad market trend analysis or fueling investment research tools with extensive institutional activity data
        api_response = api_instance.gurus_id_get(id)
        print("The response of GURUApi->gurus_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GURUApi->gurus_id_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**| Guru ID | 

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
**200** | Access the holdings and trades of over 4,500 institutional investors, enabling broad market trend analysis or fueling investment research tools with extensive institutional activity data |  -  |
**403** | 403003: No permission to check resource |  -  |
**404** | 404001: Resource not found |  -  |
**500** | 500001: There are internal error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **gurus_list_get**
> GurusListGet200Response gurus_list_get(per_page=per_page, page=page)

Get the list of available gurus' basic information

Returns the list of available gurus' basic information. You can use this api to map Gurufocus guru id and the id in your own system. The list is sorted by the id. You can use the `page` and `per_page` parameters to paginate the results.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.gurus_list_get200_response import GurusListGet200Response
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
    api_instance = openapi_client.GURUApi(api_client)
    per_page = 10 # int | The number of items to return per page. Default is 100. (optional)
    page = 1 # int | The page number to return. Default is 1. (optional)

    try:
        # Get the list of available gurus' basic information
        api_response = api_instance.gurus_list_get(per_page=per_page, page=page)
        print("The response of GURUApi->gurus_list_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GURUApi->gurus_list_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **per_page** | **int**| The number of items to return per page. Default is 100. | [optional] 
 **page** | **int**| The page number to return. Default is 1. | [optional] 

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
**200** | List of gurus |  -  |
**403** | 403003: No permission to check resource |  -  |
**404** | 404001: Resource not found |  -  |
**500** | 500001: There are internal error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

