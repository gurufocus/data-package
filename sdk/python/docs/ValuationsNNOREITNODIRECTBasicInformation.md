# ValuationsNNOREITNODIRECTBasicInformation


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
from openapi_client.models.valuations_nnoreitnodirect_basic_information import ValuationsNNOREITNODIRECTBasicInformation

# TODO update the JSON string below
json = "{}"
# create an instance of ValuationsNNOREITNODIRECTBasicInformation from a JSON string
valuations_nnoreitnodirect_basic_information_instance = ValuationsNNOREITNODIRECTBasicInformation.from_json(json)
# print the JSON string representation of the object
print(ValuationsNNOREITNODIRECTBasicInformation.to_json())

# convert the object into a dict
valuations_nnoreitnodirect_basic_information_dict = valuations_nnoreitnodirect_basic_information_instance.to_dict()
# create an instance of ValuationsNNOREITNODIRECTBasicInformation from a dict
valuations_nnoreitnodirect_basic_information_from_dict = ValuationsNNOREITNODIRECTBasicInformation.from_dict(valuations_nnoreitnodirect_basic_information_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


