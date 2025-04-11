# OpenAPI\Client\ETFApi

All URIs are relative to https://api.gurufocus.com/data, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**etfSymbolGet()**](ETFApi.md#etfSymbolGet) | **GET** /etf/{symbol} | ETF profile, key statistics and holdings. |


## `etfSymbolGet()`

```php
etfSymbolGet($symbol): \OpenAPI\Client\Model\EtfSymbolGet200Response
```

ETF profile, key statistics and holdings.



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ETFApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$symbol = 'symbol_example'; // string | ETF symbol

try {
    $result = $apiInstance->etfSymbolGet($symbol);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ETFApi->etfSymbolGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **symbol** | **string**| ETF symbol | |

### Return type

[**\OpenAPI\Client\Model\EtfSymbolGet200Response**](../Model/EtfSymbolGet200Response.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
