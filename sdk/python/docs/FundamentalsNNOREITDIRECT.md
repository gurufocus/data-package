# FundamentalsNNOREITDIRECT


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balance_sheet** | [**FundamentalsNNOREITDIRECTBalanceSheet**](FundamentalsNNOREITDIRECTBalanceSheet.md) |  | [optional] 
**basic_information** | [**FundamentalsNNOREITDIRECTBasicInformation**](FundamentalsNNOREITDIRECTBasicInformation.md) |  | [optional] 
**cashflow_statement** | [**FundamentalsNNOREITDIRECTCashflowStatement**](FundamentalsNNOREITDIRECTCashflowStatement.md) |  | [optional] 
**income_statement** | [**FundamentalsNNOREITDIRECTIncomeStatement**](FundamentalsNNOREITDIRECTIncomeStatement.md) |  | [optional] 

## Example

```python
from openapi_client.models.fundamentals_nnoreitdirect import FundamentalsNNOREITDIRECT

# TODO update the JSON string below
json = "{}"
# create an instance of FundamentalsNNOREITDIRECT from a JSON string
fundamentals_nnoreitdirect_instance = FundamentalsNNOREITDIRECT.from_json(json)
# print the JSON string representation of the object
print(FundamentalsNNOREITDIRECT.to_json())

# convert the object into a dict
fundamentals_nnoreitdirect_dict = fundamentals_nnoreitdirect_instance.to_dict()
# create an instance of FundamentalsNNOREITDIRECT from a dict
fundamentals_nnoreitdirect_from_dict = FundamentalsNNOREITDIRECT.from_dict(fundamentals_nnoreitdirect_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


