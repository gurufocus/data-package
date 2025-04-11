# openapi_client.DataPackagesApi

All URIs are relative to *https://api.gurufocus.com/data*

Method | HTTP request | Description
------------- | ------------- | -------------
[**download_id_get**](DataPackagesApi.md#download_id_get) | **GET** /download/{id} | Get download url of the data package
[**download_list_get**](DataPackagesApi.md#download_list_get) | **GET** /download/list | List available data packages


# **download_id_get**
> DownloadIdGet200Response download_id_get(id)

Get download url of the data package

Returns the download URL of the specified data package, please consume the url within then expiration time. After that, the url will be invalid. The default expiration time is 5 minutes.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.download_id_get200_response import DownloadIdGet200Response
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
    api_instance = openapi_client.DataPackagesApi(api_client)
    id = 'ebe74eed-6a33-4988-b94f-c7afb6b3e919' # str | Data package ID

    try:
        # Get download url of the data package
        api_response = api_instance.download_id_get(id)
        print("The response of DataPackagesApi->download_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataPackagesApi->download_id_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Data package ID | 

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
**200** | Download URL of the data package |  -  |
**403** | 403003: No permission to check resource |  -  |
**404** | 404001: Resource not found |  -  |
**500** | 500001: There are internal error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_list_get**
> List[DownloadListGet200ResponseInner] download_list_get()

List available data packages

Returns a list of all data packages available in the system.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.download_list_get200_response_inner import DownloadListGet200ResponseInner
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
    api_instance = openapi_client.DataPackagesApi(api_client)

    try:
        # List available data packages
        api_response = api_instance.download_list_get()
        print("The response of DataPackagesApi->download_list_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DataPackagesApi->download_list_get: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[DownloadListGet200ResponseInner]**](DownloadListGet200ResponseInner.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of data packages |  -  |
**403** | 403003: No permission to check resource |  -  |
**404** | 404001: Resource not found |  -  |
**500** | 500001: There are internal error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

