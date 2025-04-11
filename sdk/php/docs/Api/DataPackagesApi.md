# OpenAPI\Client\DataPackagesApi

All URIs are relative to https://api.gurufocus.com/data, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**downloadIdGet()**](DataPackagesApi.md#downloadIdGet) | **GET** /download/{id} | Get download url of the data package |
| [**downloadListGet()**](DataPackagesApi.md#downloadListGet) | **GET** /download/list | List available data packages |


## `downloadIdGet()`

```php
downloadIdGet($id): \OpenAPI\Client\Model\DownloadIdGet200Response
```

Get download url of the data package

Returns the download URL of the specified data package, please consume the url within then expiration time. After that, the url will be invalid. The default expiration time is 5 minutes.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\DataPackagesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = ebe74eed-6a33-4988-b94f-c7afb6b3e919; // string | Data package ID

try {
    $result = $apiInstance->downloadIdGet($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataPackagesApi->downloadIdGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **string**| Data package ID | |

### Return type

[**\OpenAPI\Client\Model\DownloadIdGet200Response**](../Model/DownloadIdGet200Response.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `downloadListGet()`

```php
downloadListGet(): \OpenAPI\Client\Model\DownloadListGet200ResponseInner[]
```

List available data packages

Returns a list of all data packages available in the system.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\DataPackagesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->downloadListGet();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataPackagesApi->downloadListGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\DownloadListGet200ResponseInner[]**](../Model/DownloadListGet200ResponseInner.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
