# DownloadListGet500Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **float** | Error code | [optional] 
**message** | **str** | Error message | [optional] 

## Example

```python
from openapi_client.models.download_list_get500_response import DownloadListGet500Response

# TODO update the JSON string below
json = "{}"
# create an instance of DownloadListGet500Response from a JSON string
download_list_get500_response_instance = DownloadListGet500Response.from_json(json)
# print the JSON string representation of the object
print(DownloadListGet500Response.to_json())

# convert the object into a dict
download_list_get500_response_dict = download_list_get500_response_instance.to_dict()
# create an instance of DownloadListGet500Response from a dict
download_list_get500_response_from_dict = DownloadListGet500Response.from_dict(download_list_get500_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


