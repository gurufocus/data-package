# DownloadListGet200ResponseInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **str** |  | [optional] 
**file_name** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**region** | **str** |  | [optional] 
**updated_at** | **datetime** |  | [optional] 

## Example

```python
from openapi_client.models.download_list_get200_response_inner import DownloadListGet200ResponseInner

# TODO update the JSON string below
json = "{}"
# create an instance of DownloadListGet200ResponseInner from a JSON string
download_list_get200_response_inner_instance = DownloadListGet200ResponseInner.from_json(json)
# print the JSON string representation of the object
print(DownloadListGet200ResponseInner.to_json())

# convert the object into a dict
download_list_get200_response_inner_dict = download_list_get200_response_inner_instance.to_dict()
# create an instance of DownloadListGet200ResponseInner from a dict
download_list_get200_response_inner_from_dict = DownloadListGet200ResponseInner.from_dict(download_list_get200_response_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


