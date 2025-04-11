# EtfSymbolGet200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basic_information** | [**EtfEtfBasicInformation**](EtfEtfBasicInformation.md) |  | [optional] 
**dividends** | [**EtfEtfDividends**](EtfEtfDividends.md) |  | [optional] 
**fundamental** | [**EtfEtfFundamental**](EtfEtfFundamental.md) |  | [optional] 
**key_statistics** | [**EtfEtfKeyStatistics**](EtfEtfKeyStatistics.md) |  | [optional] 
**portfolio_holdings** | [**EtfEtfPortfolioHoldings**](EtfEtfPortfolioHoldings.md) |  | [optional] 
**sector_breakdowns** | [**EtfEtfSectorBreakdowns**](EtfEtfSectorBreakdowns.md) |  | [optional] 

## Example

```python
from openapi_client.models.etf_symbol_get200_response import EtfSymbolGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of EtfSymbolGet200Response from a JSON string
etf_symbol_get200_response_instance = EtfSymbolGet200Response.from_json(json)
# print the JSON string representation of the object
print(EtfSymbolGet200Response.to_json())

# convert the object into a dict
etf_symbol_get200_response_dict = etf_symbol_get200_response_instance.to_dict()
# create an instance of EtfSymbolGet200Response from a dict
etf_symbol_get200_response_from_dict = EtfSymbolGet200Response.from_dict(etf_symbol_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


