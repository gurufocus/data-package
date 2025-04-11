# DownloadListGet403Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **float** | Error code | [optional] 
**message** | **str** | Error message | [optional] 

## Example

```python
from openapi_client.models.download_list_get403_response import DownloadListGet403Response

# TODO update the JSON string below
json = "{}"
# create an instance of DownloadListGet403Response from a JSON string
download_list_get403_response_instance = DownloadListGet403Response.from_json(json)
# print the JSON string representation of the object
print(DownloadListGet403Response.to_json())

# convert the object into a dict
download_list_get403_response_dict = download_list_get403_response_instance.to_dict()
# create an instance of DownloadListGet403Response from a dict
download_list_get403_response_from_dict = DownloadListGet403Response.from_dict(download_list_get403_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


