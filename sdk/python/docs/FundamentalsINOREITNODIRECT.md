# FundamentalsINOREITNODIRECT


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balance_sheet** | [**FundamentalsINOREITNODIRECTBalanceSheet**](FundamentalsINOREITNODIRECTBalanceSheet.md) |  | [optional] 
**basic_information** | [**FundamentalsINOREITNODIRECTBasicInformation**](FundamentalsINOREITNODIRECTBasicInformation.md) |  | [optional] 
**cashflow_statement** | [**FundamentalsINOREITNODIRECTCashflowStatement**](FundamentalsINOREITNODIRECTCashflowStatement.md) |  | [optional] 
**income_statement** | [**FundamentalsINOREITNODIRECTIncomeStatement**](FundamentalsINOREITNODIRECTIncomeStatement.md) |  | [optional] 

## Example

```python
from openapi_client.models.fundamentals_inoreitnodirect import FundamentalsINOREITNODIRECT

# TODO update the JSON string below
json = "{}"
# create an instance of FundamentalsINOREITNODIRECT from a JSON string
fundamentals_inoreitnodirect_instance = FundamentalsINOREITNODIRECT.from_json(json)
# print the JSON string representation of the object
print(FundamentalsINOREITNODIRECT.to_json())

# convert the object into a dict
fundamentals_inoreitnodirect_dict = fundamentals_inoreitnodirect_instance.to_dict()
# create an instance of FundamentalsINOREITNODIRECT from a dict
fundamentals_inoreitnodirect_from_dict = FundamentalsINOREITNODIRECT.from_dict(fundamentals_inoreitnodirect_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


