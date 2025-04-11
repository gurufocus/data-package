# StocksSymbolFundamentalsGet200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annually** | [**List[StockFundamentalsAnnuallyInner]**](StockFundamentalsAnnuallyInner.md) |  | [optional] 
**basic_information** | [**StockFundamentalsBasicInformation**](StockFundamentalsBasicInformation.md) |  | [optional] 
**quarterly** | [**List[StockFundamentalsAnnuallyInner]**](StockFundamentalsAnnuallyInner.md) |  | [optional] 
**ttm** | [**StockFundamentalsTtm**](StockFundamentalsTtm.md) |  | [optional] 

## Example

```python
from openapi_client.models.stocks_symbol_fundamentals_get200_response import StocksSymbolFundamentalsGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of StocksSymbolFundamentalsGet200Response from a JSON string
stocks_symbol_fundamentals_get200_response_instance = StocksSymbolFundamentalsGet200Response.from_json(json)
# print the JSON string representation of the object
print(StocksSymbolFundamentalsGet200Response.to_json())

# convert the object into a dict
stocks_symbol_fundamentals_get200_response_dict = stocks_symbol_fundamentals_get200_response_instance.to_dict()
# create an instance of StocksSymbolFundamentalsGet200Response from a dict
stocks_symbol_fundamentals_get200_response_from_dict = StocksSymbolFundamentalsGet200Response.from_dict(stocks_symbol_fundamentals_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


