# StocksSymbolProfileGet200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basic_information** | [**StockProfileBasicInformation**](StockProfileBasicInformation.md) |  | [optional] 
**dividends** | [**StockProfileDividends**](StockProfileDividends.md) |  | [optional] 
**fundamental** | [**StockProfileFundamental**](StockProfileFundamental.md) |  | [optional] 
**general** | [**StockProfileGeneral**](StockProfileGeneral.md) |  | [optional] 
**growth** | [**StockProfileGrowth**](StockProfileGrowth.md) |  | [optional] 
**price** | [**StockProfilePrice**](StockProfilePrice.md) |  | [optional] 
**profitability** | [**StockProfileProfitability**](StockProfileProfitability.md) |  | [optional] 
**valuation_ratio** | [**StockProfileValuationRatio**](StockProfileValuationRatio.md) |  | [optional] 

## Example

```python
from openapi_client.models.stocks_symbol_profile_get200_response import StocksSymbolProfileGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of StocksSymbolProfileGet200Response from a JSON string
stocks_symbol_profile_get200_response_instance = StocksSymbolProfileGet200Response.from_json(json)
# print the JSON string representation of the object
print(StocksSymbolProfileGet200Response.to_json())

# convert the object into a dict
stocks_symbol_profile_get200_response_dict = stocks_symbol_profile_get200_response_instance.to_dict()
# create an instance of StocksSymbolProfileGet200Response from a dict
stocks_symbol_profile_get200_response_from_dict = StocksSymbolProfileGet200Response.from_dict(stocks_symbol_profile_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


