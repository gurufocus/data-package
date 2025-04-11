# DownloadIdGet200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expiration** | **datetime** |  | [optional] 
**id** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.download_id_get200_response import DownloadIdGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of DownloadIdGet200Response from a JSON string
download_id_get200_response_instance = DownloadIdGet200Response.from_json(json)
# print the JSON string representation of the object
print(DownloadIdGet200Response.to_json())

# convert the object into a dict
download_id_get200_response_dict = download_id_get200_response_instance.to_dict()
# create an instance of DownloadIdGet200Response from a dict
download_id_get200_response_from_dict = DownloadIdGet200Response.from_dict(download_id_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


