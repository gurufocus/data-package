# \STOCKAPI

All URIs are relative to *https://api.gurufocus.com/data*

Method | HTTP request | Description
------------- | ------------- | -------------
[**StocksSymbolFundamentalsGet**](STOCKAPI.md#StocksSymbolFundamentalsGet) | **Get** /stocks/{symbol}/fundamentals | Complete historical financial statements providing the data needed for in-depth analysis, valuation modeling, and building investment research platforms.
[**StocksSymbolProfileGet**](STOCKAPI.md#StocksSymbolProfileGet) | **Get** /stocks/{symbol}/profile | Access essential company details and current valuation metrics to power investment platforms, populate company directories, or enhance financial analysis tools with up-to-date market data.
[**StocksSymbolRankingsGet**](STOCKAPI.md#StocksSymbolRankingsGet) | **Get** /stocks/{symbol}/rankings | Proprietary scoring and ranking systems that assess company quality, valuation, and performance for powering data-driven investment platforms.
[**StocksSymbolSegmentGet**](STOCKAPI.md#StocksSymbolSegmentGet) | **Get** /stocks/{symbol}/segment | Gain insights into a company&#39;s revenue breakdown by product and geography to build detailed financial visualizations, enhance stock research platforms, or create data-driven market analysis tools
[**StocksSymbolValuationsGet**](STOCKAPI.md#StocksSymbolValuationsGet) | **Get** /stocks/{symbol}/valuations | A deep dataset of historical valuation metrics to support investors and entrepreneurs in the development of data-driven investment platforms.



## StocksSymbolFundamentalsGet

> StocksSymbolFundamentalsGet200Response StocksSymbolFundamentalsGet(ctx, symbol).Execute()

Complete historical financial statements providing the data needed for in-depth analysis, valuation modeling, and building investment research platforms.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	symbol := "symbol_example" // string | Stock symbol

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.STOCKAPI.StocksSymbolFundamentalsGet(context.Background(), symbol).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `STOCKAPI.StocksSymbolFundamentalsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `StocksSymbolFundamentalsGet`: StocksSymbolFundamentalsGet200Response
	fmt.Fprintf(os.Stdout, "Response from `STOCKAPI.StocksSymbolFundamentalsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**symbol** | **string** | Stock symbol | 

### Other Parameters

Other parameters are passed through a pointer to a apiStocksSymbolFundamentalsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**StocksSymbolFundamentalsGet200Response**](StocksSymbolFundamentalsGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## StocksSymbolProfileGet

> StocksSymbolProfileGet200Response StocksSymbolProfileGet(ctx, symbol).Execute()

Access essential company details and current valuation metrics to power investment platforms, populate company directories, or enhance financial analysis tools with up-to-date market data.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	symbol := "symbol_example" // string | Stock symbol

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.STOCKAPI.StocksSymbolProfileGet(context.Background(), symbol).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `STOCKAPI.StocksSymbolProfileGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `StocksSymbolProfileGet`: StocksSymbolProfileGet200Response
	fmt.Fprintf(os.Stdout, "Response from `STOCKAPI.StocksSymbolProfileGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**symbol** | **string** | Stock symbol | 

### Other Parameters

Other parameters are passed through a pointer to a apiStocksSymbolProfileGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**StocksSymbolProfileGet200Response**](StocksSymbolProfileGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## StocksSymbolRankingsGet

> StocksSymbolRankingsGet200Response StocksSymbolRankingsGet(ctx, symbol).Execute()

Proprietary scoring and ranking systems that assess company quality, valuation, and performance for powering data-driven investment platforms.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	symbol := "symbol_example" // string | Stock symbol

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.STOCKAPI.StocksSymbolRankingsGet(context.Background(), symbol).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `STOCKAPI.StocksSymbolRankingsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `StocksSymbolRankingsGet`: StocksSymbolRankingsGet200Response
	fmt.Fprintf(os.Stdout, "Response from `STOCKAPI.StocksSymbolRankingsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**symbol** | **string** | Stock symbol | 

### Other Parameters

Other parameters are passed through a pointer to a apiStocksSymbolRankingsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**StocksSymbolRankingsGet200Response**](StocksSymbolRankingsGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## StocksSymbolSegmentGet

> StocksSymbolSegmentGet200Response StocksSymbolSegmentGet(ctx, symbol).Execute()

Gain insights into a company's revenue breakdown by product and geography to build detailed financial visualizations, enhance stock research platforms, or create data-driven market analysis tools



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	symbol := "symbol_example" // string | Stock symbol

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.STOCKAPI.StocksSymbolSegmentGet(context.Background(), symbol).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `STOCKAPI.StocksSymbolSegmentGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `StocksSymbolSegmentGet`: StocksSymbolSegmentGet200Response
	fmt.Fprintf(os.Stdout, "Response from `STOCKAPI.StocksSymbolSegmentGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**symbol** | **string** | Stock symbol | 

### Other Parameters

Other parameters are passed through a pointer to a apiStocksSymbolSegmentGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**StocksSymbolSegmentGet200Response**](StocksSymbolSegmentGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## StocksSymbolValuationsGet

> StocksSymbolValuationsGet200Response StocksSymbolValuationsGet(ctx, symbol).Execute()

A deep dataset of historical valuation metrics to support investors and entrepreneurs in the development of data-driven investment platforms.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	symbol := "symbol_example" // string | Stock symbol

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.STOCKAPI.StocksSymbolValuationsGet(context.Background(), symbol).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `STOCKAPI.StocksSymbolValuationsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `StocksSymbolValuationsGet`: StocksSymbolValuationsGet200Response
	fmt.Fprintf(os.Stdout, "Response from `STOCKAPI.StocksSymbolValuationsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**symbol** | **string** | Stock symbol | 

### Other Parameters

Other parameters are passed through a pointer to a apiStocksSymbolValuationsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**StocksSymbolValuationsGet200Response**](StocksSymbolValuationsGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

