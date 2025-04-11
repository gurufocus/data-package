# OpenAPI\Client\STOCKApi

All URIs are relative to https://api.gurufocus.com/data, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**stocksSymbolFundamentalsGet()**](STOCKApi.md#stocksSymbolFundamentalsGet) | **GET** /stocks/{symbol}/fundamentals | Complete historical financial statements providing the data needed for in-depth analysis, valuation modeling, and building investment research platforms. |
| [**stocksSymbolProfileGet()**](STOCKApi.md#stocksSymbolProfileGet) | **GET** /stocks/{symbol}/profile | Access essential company details and current valuation metrics to power investment platforms, populate company directories, or enhance financial analysis tools with up-to-date market data. |
| [**stocksSymbolRankingsGet()**](STOCKApi.md#stocksSymbolRankingsGet) | **GET** /stocks/{symbol}/rankings | Proprietary scoring and ranking systems that assess company quality, valuation, and performance for powering data-driven investment platforms. |
| [**stocksSymbolSegmentGet()**](STOCKApi.md#stocksSymbolSegmentGet) | **GET** /stocks/{symbol}/segment | Gain insights into a company&#39;s revenue breakdown by product and geography to build detailed financial visualizations, enhance stock research platforms, or create data-driven market analysis tools |
| [**stocksSymbolValuationsGet()**](STOCKApi.md#stocksSymbolValuationsGet) | **GET** /stocks/{symbol}/valuations | A deep dataset of historical valuation metrics to support investors and entrepreneurs in the development of data-driven investment platforms. |


## `stocksSymbolFundamentalsGet()`

```php
stocksSymbolFundamentalsGet($symbol): \OpenAPI\Client\Model\StocksSymbolFundamentalsGet200Response
```

Complete historical financial statements providing the data needed for in-depth analysis, valuation modeling, and building investment research platforms.

<ul> <li>Income Statement</li> <li>Balance Sheet</li> <li>Cash Flow Statement</li> </ul>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\STOCKApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$symbol = 'symbol_example'; // string | Stock symbol

try {
    $result = $apiInstance->stocksSymbolFundamentalsGet($symbol);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling STOCKApi->stocksSymbolFundamentalsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **symbol** | **string**| Stock symbol | |

### Return type

[**\OpenAPI\Client\Model\StocksSymbolFundamentalsGet200Response**](../Model/StocksSymbolFundamentalsGet200Response.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `stocksSymbolProfileGet()`

```php
stocksSymbolProfileGet($symbol): \OpenAPI\Client\Model\StocksSymbolProfileGet200Response
```

Access essential company details and current valuation metrics to power investment platforms, populate company directories, or enhance financial analysis tools with up-to-date market data.

<ul> <li>Basic company info <p>Name, description, address, etc.</p></li> <li>Current stock price</li> <li>Current key valuation ratios <p>P/E, P/B, P/S, etc.</p></li> <li>And more!</li> </ul>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\STOCKApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$symbol = 'symbol_example'; // string | Stock symbol

try {
    $result = $apiInstance->stocksSymbolProfileGet($symbol);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling STOCKApi->stocksSymbolProfileGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **symbol** | **string**| Stock symbol | |

### Return type

[**\OpenAPI\Client\Model\StocksSymbolProfileGet200Response**](../Model/StocksSymbolProfileGet200Response.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `stocksSymbolRankingsGet()`

```php
stocksSymbolRankingsGet($symbol): \OpenAPI\Client\Model\StocksSymbolRankingsGet200Response
```

Proprietary scoring and ranking systems that assess company quality, valuation, and performance for powering data-driven investment platforms.

<ul> <li>GF Score</li> <li>GF Value</li> <li>Predictability Rank</li> <li>Financial Strength</li> <li>Profitability Rank</li> <li>and more!</li> </ul>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\STOCKApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$symbol = 'symbol_example'; // string | Stock symbol

try {
    $result = $apiInstance->stocksSymbolRankingsGet($symbol);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling STOCKApi->stocksSymbolRankingsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **symbol** | **string**| Stock symbol | |

### Return type

[**\OpenAPI\Client\Model\StocksSymbolRankingsGet200Response**](../Model/StocksSymbolRankingsGet200Response.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `stocksSymbolSegmentGet()`

```php
stocksSymbolSegmentGet($symbol): \OpenAPI\Client\Model\StocksSymbolSegmentGet200Response
```

Gain insights into a company's revenue breakdown by product and geography to build detailed financial visualizations, enhance stock research platforms, or create data-driven market analysis tools

<ul> <li>Geographic segment data</li> <li>Product and service segment data</li> </ul>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\STOCKApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$symbol = 'symbol_example'; // string | Stock symbol

try {
    $result = $apiInstance->stocksSymbolSegmentGet($symbol);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling STOCKApi->stocksSymbolSegmentGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **symbol** | **string**| Stock symbol | |

### Return type

[**\OpenAPI\Client\Model\StocksSymbolSegmentGet200Response**](../Model/StocksSymbolSegmentGet200Response.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `stocksSymbolValuationsGet()`

```php
stocksSymbolValuationsGet($symbol): \OpenAPI\Client\Model\StocksSymbolValuationsGet200Response
```

A deep dataset of historical valuation metrics to support investors and entrepreneurs in the development of data-driven investment platforms.

<ul> <li>P/E Ratios</li> <li>P/B Ratios</li> <li>Dividend Yields</li> <li>F-Scores</li> <li>Z-Scores</li> <li>And more!</li> </ul>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\STOCKApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$symbol = 'symbol_example'; // string | Stock symbol

try {
    $result = $apiInstance->stocksSymbolValuationsGet($symbol);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling STOCKApi->stocksSymbolValuationsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **symbol** | **string**| Stock symbol | |

### Return type

[**\OpenAPI\Client\Model\StocksSymbolValuationsGet200Response**](../Model/StocksSymbolValuationsGet200Response.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
