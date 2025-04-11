# StockFundamentalsAnnuallyInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balance_sheet** | [**FundamentalsNNOREITNODIRECTBalanceSheet**](FundamentalsNNOREITNODIRECTBalanceSheet.md) |  | [optional] 
**basic_information** | [**FundamentalsNNOREITNODIRECTBasicInformation**](FundamentalsNNOREITNODIRECTBasicInformation.md) |  | [optional] 
**cashflow_statement** | [**FundamentalsNNOREITNODIRECTCashflowStatement**](FundamentalsNNOREITNODIRECTCashflowStatement.md) |  | [optional] 
**income_statement** | [**FundamentalsNNOREITNODIRECTIncomeStatement**](FundamentalsNNOREITNODIRECTIncomeStatement.md) |  | [optional] 

## Example

```python
from openapi_client.models.stock_fundamentals_annually_inner import StockFundamentalsAnnuallyInner

# TODO update the JSON string below
json = "{}"
# create an instance of StockFundamentalsAnnuallyInner from a JSON string
stock_fundamentals_annually_inner_instance = StockFundamentalsAnnuallyInner.from_json(json)
# print the JSON string representation of the object
print(StockFundamentalsAnnuallyInner.to_json())

# convert the object into a dict
stock_fundamentals_annually_inner_dict = stock_fundamentals_annually_inner_instance.to_dict()
# create an instance of StockFundamentalsAnnuallyInner from a dict
stock_fundamentals_annually_inner_from_dict = StockFundamentalsAnnuallyInner.from_dict(stock_fundamentals_annually_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


