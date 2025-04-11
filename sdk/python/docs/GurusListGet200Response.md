# GurusListGet200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[GurusListGet200ResponseDataInner]**](GurusListGet200ResponseDataInner.md) |  | [optional] 
**page** | **int** |  | [optional] 
**per_page** | **int** |  | [optional] 
**total** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.gurus_list_get200_response import GurusListGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GurusListGet200Response from a JSON string
gurus_list_get200_response_instance = GurusListGet200Response.from_json(json)
# print the JSON string representation of the object
print(GurusListGet200Response.to_json())

# convert the object into a dict
gurus_list_get200_response_dict = gurus_list_get200_response_instance.to_dict()
# create an instance of GurusListGet200Response from a dict
gurus_list_get200_response_from_dict = GurusListGet200Response.from_dict(gurus_list_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


