# GurusListGet200ResponseDataInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_13f** | **datetime** |  | [optional] 
**id** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**package** | **str** | Needed subscribed package name of the guru. | [optional] 

## Example

```python
from openapi_client.models.gurus_list_get200_response_data_inner import GurusListGet200ResponseDataInner

# TODO update the JSON string below
json = "{}"
# create an instance of GurusListGet200ResponseDataInner from a JSON string
gurus_list_get200_response_data_inner_instance = GurusListGet200ResponseDataInner.from_json(json)
# print the JSON string representation of the object
print(GurusListGet200ResponseDataInner.to_json())

# convert the object into a dict
gurus_list_get200_response_data_inner_dict = gurus_list_get200_response_data_inner_instance.to_dict()
# create an instance of GurusListGet200ResponseDataInner from a dict
gurus_list_get200_response_data_inner_from_dict = GurusListGet200ResponseDataInner.from_dict(gurus_list_get200_response_data_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


