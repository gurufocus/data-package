# StockFundamentalsTtm


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balance_sheet** | [**FundamentalsNNOREITNODIRECTBalanceSheet**](FundamentalsNNOREITNODIRECTBalanceSheet.md) |  | [optional] 
**basic_information** | [**FundamentalsNNOREITNODIRECTBasicInformation**](FundamentalsNNOREITNODIRECTBasicInformation.md) |  | [optional] 
**cashflow_statement** | [**FundamentalsNNOREITNODIRECTCashflowStatement**](FundamentalsNNOREITNODIRECTCashflowStatement.md) |  | [optional] 
**income_statement** | [**FundamentalsNNOREITNODIRECTIncomeStatement**](FundamentalsNNOREITNODIRECTIncomeStatement.md) |  | [optional] 

## Example

```python
from openapi_client.models.stock_fundamentals_ttm import StockFundamentalsTtm

# TODO update the JSON string below
json = "{}"
# create an instance of StockFundamentalsTtm from a JSON string
stock_fundamentals_ttm_instance = StockFundamentalsTtm.from_json(json)
# print the JSON string representation of the object
print(StockFundamentalsTtm.to_json())

# convert the object into a dict
stock_fundamentals_ttm_dict = stock_fundamentals_ttm_instance.to_dict()
# create an instance of StockFundamentalsTtm from a dict
stock_fundamentals_ttm_from_dict = StockFundamentalsTtm.from_dict(stock_fundamentals_ttm_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


