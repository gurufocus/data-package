# StocksSymbolValuationsGet200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annually** | [**List[StockValuationsAnnuallyInner]**](StockValuationsAnnuallyInner.md) |  | [optional] 
**basic_information** | [**StockValuationsBasicInformation**](StockValuationsBasicInformation.md) |  | [optional] 
**quarterly** | [**List[StockValuationsAnnuallyInner]**](StockValuationsAnnuallyInner.md) |  | [optional] 
**ttm** | [**StockValuationsTtm**](StockValuationsTtm.md) |  | [optional] 

## Example

```python
from openapi_client.models.stocks_symbol_valuations_get200_response import StocksSymbolValuationsGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of StocksSymbolValuationsGet200Response from a JSON string
stocks_symbol_valuations_get200_response_instance = StocksSymbolValuationsGet200Response.from_json(json)
# print the JSON string representation of the object
print(StocksSymbolValuationsGet200Response.to_json())

# convert the object into a dict
stocks_symbol_valuations_get200_response_dict = stocks_symbol_valuations_get200_response_instance.to_dict()
# create an instance of StocksSymbolValuationsGet200Response from a dict
stocks_symbol_valuations_get200_response_from_dict = StocksSymbolValuationsGet200Response.from_dict(stocks_symbol_valuations_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


