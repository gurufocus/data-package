# \INSIDERAPI

All URIs are relative to *https://api.gurufocus.com/data*

Method | HTTP request | Description
------------- | ------------- | -------------
[**InsidersDateGet**](INSIDERAPI.md#InsidersDateGet) | **Get** /insiders/{date} | A comprehensive record of insider trading and institutional ownership for investment research or powering data-driven financial tools that track executive trading behavior over time



## InsidersDateGet

> []InsiderTransaction InsidersDateGet(ctx, date).Execute()

A comprehensive record of insider trading and institutional ownership for investment research or powering data-driven financial tools that track executive trading behavior over time



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
    "time"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	date := time.Now() // string | Date in YYYY-MM-DD format

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.INSIDERAPI.InsidersDateGet(context.Background(), date).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `INSIDERAPI.InsidersDateGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `InsidersDateGet`: []InsiderTransaction
	fmt.Fprintf(os.Stdout, "Response from `INSIDERAPI.InsidersDateGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**date** | **string** | Date in YYYY-MM-DD format | 

### Other Parameters

Other parameters are passed through a pointer to a apiInsidersDateGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**[]InsiderTransaction**](InsiderTransaction.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

