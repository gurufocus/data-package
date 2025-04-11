# ValuationsNNOREITDIRECT


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basic_information** | [**ValuationsNNOREITDIRECTBasicInformation**](ValuationsNNOREITDIRECTBasicInformation.md) |  | [optional] 
**per_share_data** | [**ValuationsNNOREITDIRECTPerShareData**](ValuationsNNOREITDIRECTPerShareData.md) |  | [optional] 
**ratios** | [**ValuationsNNOREITDIRECTRatios**](ValuationsNNOREITDIRECTRatios.md) |  | [optional] 
**valuation_ratios** | [**ValuationsNNOREITDIRECTValuationRatios**](ValuationsNNOREITDIRECTValuationRatios.md) |  | [optional] 
**valuationand_quality** | [**ValuationsNNOREITDIRECTValuationandQuality**](ValuationsNNOREITDIRECTValuationandQuality.md) |  | [optional] 

## Example

```python
from openapi_client.models.valuations_nnoreitdirect import ValuationsNNOREITDIRECT

# TODO update the JSON string below
json = "{}"
# create an instance of ValuationsNNOREITDIRECT from a JSON string
valuations_nnoreitdirect_instance = ValuationsNNOREITDIRECT.from_json(json)
# print the JSON string representation of the object
print(ValuationsNNOREITDIRECT.to_json())

# convert the object into a dict
valuations_nnoreitdirect_dict = valuations_nnoreitdirect_instance.to_dict()
# create an instance of ValuationsNNOREITDIRECT from a dict
valuations_nnoreitdirect_from_dict = ValuationsNNOREITDIRECT.from_dict(valuations_nnoreitdirect_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


