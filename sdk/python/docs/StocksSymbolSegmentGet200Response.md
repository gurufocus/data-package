# StocksSymbolSegmentGet200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annually** | **List[object]** |  | [optional] 
**basic_information** | [**StockSegmentBasicInformation**](StockSegmentBasicInformation.md) |  | [optional] 
**quarterly** | **List[object]** |  | [optional] 
**ttm** | **object** |  | [optional] 

## Example

```python
from openapi_client.models.stocks_symbol_segment_get200_response import StocksSymbolSegmentGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of StocksSymbolSegmentGet200Response from a JSON string
stocks_symbol_segment_get200_response_instance = StocksSymbolSegmentGet200Response.from_json(json)
# print the JSON string representation of the object
print(StocksSymbolSegmentGet200Response.to_json())

# convert the object into a dict
stocks_symbol_segment_get200_response_dict = stocks_symbol_segment_get200_response_instance.to_dict()
# create an instance of StocksSymbolSegmentGet200Response from a dict
stocks_symbol_segment_get200_response_from_dict = StocksSymbolSegmentGet200Response.from_dict(stocks_symbol_segment_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


