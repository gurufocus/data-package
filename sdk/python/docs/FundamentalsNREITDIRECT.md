# FundamentalsNREITDIRECT


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balance_sheet** | [**FundamentalsNREITDIRECTBalanceSheet**](FundamentalsNREITDIRECTBalanceSheet.md) |  | [optional] 
**basic_information** | [**FundamentalsNREITDIRECTBasicInformation**](FundamentalsNREITDIRECTBasicInformation.md) |  | [optional] 
**cashflow_statement** | [**FundamentalsNREITDIRECTCashflowStatement**](FundamentalsNREITDIRECTCashflowStatement.md) |  | [optional] 
**income_statement** | [**FundamentalsNREITDIRECTIncomeStatement**](FundamentalsNREITDIRECTIncomeStatement.md) |  | [optional] 

## Example

```python
from openapi_client.models.fundamentals_nreitdirect import FundamentalsNREITDIRECT

# TODO update the JSON string below
json = "{}"
# create an instance of FundamentalsNREITDIRECT from a JSON string
fundamentals_nreitdirect_instance = FundamentalsNREITDIRECT.from_json(json)
# print the JSON string representation of the object
print(FundamentalsNREITDIRECT.to_json())

# convert the object into a dict
fundamentals_nreitdirect_dict = fundamentals_nreitdirect_instance.to_dict()
# create an instance of FundamentalsNREITDIRECT from a dict
fundamentals_nreitdirect_from_dict = FundamentalsNREITDIRECT.from_dict(fundamentals_nreitdirect_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


