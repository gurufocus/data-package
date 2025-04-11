# StocksSymbolRankingsGet200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basic_information** | [**StockRankingsBasicInformation**](StockRankingsBasicInformation.md) |  | [optional] 
**guru_focus_rankings** | [**StockRankingsGuruFocusRankings**](StockRankingsGuruFocusRankings.md) |  | [optional] 

## Example

```python
from openapi_client.models.stocks_symbol_rankings_get200_response import StocksSymbolRankingsGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of StocksSymbolRankingsGet200Response from a JSON string
stocks_symbol_rankings_get200_response_instance = StocksSymbolRankingsGet200Response.from_json(json)
# print the JSON string representation of the object
print(StocksSymbolRankingsGet200Response.to_json())

# convert the object into a dict
stocks_symbol_rankings_get200_response_dict = stocks_symbol_rankings_get200_response_instance.to_dict()
# create an instance of StocksSymbolRankingsGet200Response from a dict
stocks_symbol_rankings_get200_response_from_dict = StocksSymbolRankingsGet200Response.from_dict(stocks_symbol_rankings_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


