# OpenAPI\Client\INSIDERApi

All URIs are relative to https://api.gurufocus.com/data, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**insidersDateGet()**](INSIDERApi.md#insidersDateGet) | **GET** /insiders/{date} | A comprehensive record of insider trading and institutional ownership for investment research or powering data-driven financial tools that track executive trading behavior over time |


## `insidersDateGet()`

```php
insidersDateGet($date): \OpenAPI\Client\Model\InsiderTransaction[]
```

A comprehensive record of insider trading and institutional ownership for investment research or powering data-driven financial tools that track executive trading behavior over time

For all publicly traded companies: <ul><li>Open market insider trading transactions since 2004</li></ul>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\INSIDERApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$date = Sun Oct 01 00:00:00 UTC 2023; // \DateTime | Date in YYYY-MM-DD format

try {
    $result = $apiInstance->insidersDateGet($date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling INSIDERApi->insidersDateGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **date** | **\DateTime**| Date in YYYY-MM-DD format | |

### Return type

[**\OpenAPI\Client\Model\InsiderTransaction[]**](../Model/InsiderTransaction.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
