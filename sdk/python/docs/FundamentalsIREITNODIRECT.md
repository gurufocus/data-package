# FundamentalsIREITNODIRECT


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balance_sheet** | [**FundamentalsIREITNODIRECTBalanceSheet**](FundamentalsIREITNODIRECTBalanceSheet.md) |  | [optional] 
**basic_information** | [**FundamentalsIREITNODIRECTBasicInformation**](FundamentalsIREITNODIRECTBasicInformation.md) |  | [optional] 
**cashflow_statement** | [**FundamentalsIREITNODIRECTCashflowStatement**](FundamentalsIREITNODIRECTCashflowStatement.md) |  | [optional] 
**income_statement** | [**FundamentalsIREITNODIRECTIncomeStatement**](FundamentalsIREITNODIRECTIncomeStatement.md) |  | [optional] 

## Example

```python
from openapi_client.models.fundamentals_ireitnodirect import FundamentalsIREITNODIRECT

# TODO update the JSON string below
json = "{}"
# create an instance of FundamentalsIREITNODIRECT from a JSON string
fundamentals_ireitnodirect_instance = FundamentalsIREITNODIRECT.from_json(json)
# print the JSON string representation of the object
print(FundamentalsIREITNODIRECT.to_json())

# convert the object into a dict
fundamentals_ireitnodirect_dict = fundamentals_ireitnodirect_instance.to_dict()
# create an instance of FundamentalsIREITNODIRECT from a dict
fundamentals_ireitnodirect_from_dict = FundamentalsIREITNODIRECT.from_dict(fundamentals_ireitnodirect_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


