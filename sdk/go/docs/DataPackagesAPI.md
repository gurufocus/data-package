# \DataPackagesAPI

All URIs are relative to *https://api.gurufocus.com/data*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DownloadIdGet**](DataPackagesAPI.md#DownloadIdGet) | **Get** /download/{id} | Get download url of the data package
[**DownloadListGet**](DataPackagesAPI.md#DownloadListGet) | **Get** /download/list | List available data packages



## DownloadIdGet

> DownloadIdGet200Response DownloadIdGet(ctx, id).Execute()

Get download url of the data package



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
	id := "ebe74eed-6a33-4988-b94f-c7afb6b3e919" // string | Data package ID

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataPackagesAPI.DownloadIdGet(context.Background(), id).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataPackagesAPI.DownloadIdGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DownloadIdGet`: DownloadIdGet200Response
	fmt.Fprintf(os.Stdout, "Response from `DataPackagesAPI.DownloadIdGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **string** | Data package ID | 

### Other Parameters

Other parameters are passed through a pointer to a apiDownloadIdGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**DownloadIdGet200Response**](DownloadIdGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DownloadListGet

> []DownloadListGet200ResponseInner DownloadListGet(ctx).Execute()

List available data packages



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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DataPackagesAPI.DownloadListGet(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DataPackagesAPI.DownloadListGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DownloadListGet`: []DownloadListGet200ResponseInner
	fmt.Fprintf(os.Stdout, "Response from `DataPackagesAPI.DownloadListGet`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiDownloadListGetRequest struct via the builder pattern


### Return type

[**[]DownloadListGet200ResponseInner**](DownloadListGet200ResponseInner.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

