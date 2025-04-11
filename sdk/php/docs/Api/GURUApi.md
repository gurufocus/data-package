# OpenAPI\Client\GURUApi

All URIs are relative to https://api.gurufocus.com/data, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**gurusIdGet()**](GURUApi.md#gurusIdGet) | **GET** /gurus/{id} | Access the holdings and trades of over 4,500 institutional investors, enabling broad market trend analysis or fueling investment research tools with extensive institutional activity data |
| [**gurusListGet()**](GURUApi.md#gurusListGet) | **GET** /gurus/list | Get the list of available gurus&#39; basic information |


## `gurusIdGet()`

```php
gurusIdGet($id): \OpenAPI\Client\Model\GurusIdGet200Response
```

Access the holdings and trades of over 4,500 institutional investors, enabling broad market trend analysis or fueling investment research tools with extensive institutional activity data

Last four quarters and future: <ul> <li>Quarterly portfolio holdings of the last 4 quarters</li> <li>13D/G Data of the last 12 months</li> </ul>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\GURUApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = 3.4; // float | Guru ID

try {
    $result = $apiInstance->gurusIdGet($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GURUApi->gurusIdGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **float**| Guru ID | |

### Return type

[**\OpenAPI\Client\Model\GurusIdGet200Response**](../Model/GurusIdGet200Response.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `gurusListGet()`

```php
gurusListGet($per_page, $page): \OpenAPI\Client\Model\GurusListGet200Response
```

Get the list of available gurus' basic information

Returns the list of available gurus' basic information. You can use this api to map Gurufocus guru id and the id in your own system. The list is sorted by the id. You can use the `page` and `per_page` parameters to paginate the results.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\GURUApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$per_page = 10; // int | The number of items to return per page. Default is 100.
$page = 1; // int | The page number to return. Default is 1.

try {
    $result = $apiInstance->gurusListGet($per_page, $page);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GURUApi->gurusListGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **per_page** | **int**| The number of items to return per page. Default is 100. | [optional] |
| **page** | **int**| The page number to return. Default is 1. | [optional] |

### Return type

[**\OpenAPI\Client\Model\GurusListGet200Response**](../Model/GurusListGet200Response.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
