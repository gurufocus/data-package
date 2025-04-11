# \ETFAPI

All URIs are relative to *https://api.gurufocus.com/data*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EtfSymbolGet**](ETFAPI.md#EtfSymbolGet) | **Get** /etf/{symbol} | ETF profile, key statistics and holdings.



## EtfSymbolGet

> EtfSymbolGet200Response EtfSymbolGet(ctx, symbol).Execute()

ETF profile, key statistics and holdings.



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
	symbol := "symbol_example" // string | ETF symbol

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ETFAPI.EtfSymbolGet(context.Background(), symbol).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ETFAPI.EtfSymbolGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `EtfSymbolGet`: EtfSymbolGet200Response
	fmt.Fprintf(os.Stdout, "Response from `ETFAPI.EtfSymbolGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**symbol** | **string** | ETF symbol | 

### Other Parameters

Other parameters are passed through a pointer to a apiEtfSymbolGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**EtfSymbolGet200Response**](EtfSymbolGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

