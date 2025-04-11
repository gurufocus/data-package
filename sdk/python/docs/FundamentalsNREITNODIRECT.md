# FundamentalsNREITNODIRECT


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balance_sheet** | [**FundamentalsNREITNODIRECTBalanceSheet**](FundamentalsNREITNODIRECTBalanceSheet.md) |  | [optional] 
**basic_information** | [**FundamentalsNREITNODIRECTBasicInformation**](FundamentalsNREITNODIRECTBasicInformation.md) |  | [optional] 
**cashflow_statement** | [**FundamentalsNREITNODIRECTCashflowStatement**](FundamentalsNREITNODIRECTCashflowStatement.md) |  | [optional] 
**income_statement** | [**FundamentalsNREITNODIRECTIncomeStatement**](FundamentalsNREITNODIRECTIncomeStatement.md) |  | [optional] 

## Example

```python
from openapi_client.models.fundamentals_nreitnodirect import FundamentalsNREITNODIRECT

# TODO update the JSON string below
json = "{}"
# create an instance of FundamentalsNREITNODIRECT from a JSON string
fundamentals_nreitnodirect_instance = FundamentalsNREITNODIRECT.from_json(json)
# print the JSON string representation of the object
print(FundamentalsNREITNODIRECT.to_json())

# convert the object into a dict
fundamentals_nreitnodirect_dict = fundamentals_nreitnodirect_instance.to_dict()
# create an instance of FundamentalsNREITNODIRECT from a dict
fundamentals_nreitnodirect_from_dict = FundamentalsNREITNODIRECT.from_dict(fundamentals_nreitnodirect_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


