# FundamentalsNNOREITDIRECTBasicInformation


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**company** | **str** | The name of the company as identified on its SEC filings. | [optional] 
**company_id** | **str** |  | [optional] 
**exchange** | **str** | The company&#39;s stock exchange. Example: NAS for Apple. | [optional] 
**stockid** | **str** | A unique identifier for the stock | [optional] 
**symbol** | **str** | The company&#39;s stock ticker symbol | [optional] 

## Example

```python
from openapi_client.models.fundamentals_nnoreitdirect_basic_information import FundamentalsNNOREITDIRECTBasicInformation

# TODO update the JSON string below
json = "{}"
# create an instance of FundamentalsNNOREITDIRECTBasicInformation from a JSON string
fundamentals_nnoreitdirect_basic_information_instance = FundamentalsNNOREITDIRECTBasicInformation.from_json(json)
# print the JSON string representation of the object
print(FundamentalsNNOREITDIRECTBasicInformation.to_json())

# convert the object into a dict
fundamentals_nnoreitdirect_basic_information_dict = fundamentals_nnoreitdirect_basic_information_instance.to_dict()
# create an instance of FundamentalsNNOREITDIRECTBasicInformation from a dict
fundamentals_nnoreitdirect_basic_information_from_dict = FundamentalsNNOREITDIRECTBasicInformation.from_dict(fundamentals_nnoreitdirect_basic_information_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


