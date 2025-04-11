# ValuationsNREITDIRECT


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basic_information** | [**ValuationsNREITDIRECTBasicInformation**](ValuationsNREITDIRECTBasicInformation.md) |  | [optional] 
**per_share_data** | [**ValuationsNREITDIRECTPerShareData**](ValuationsNREITDIRECTPerShareData.md) |  | [optional] 
**ratios** | [**ValuationsNREITDIRECTRatios**](ValuationsNREITDIRECTRatios.md) |  | [optional] 
**valuation_ratios** | [**ValuationsNREITDIRECTValuationRatios**](ValuationsNREITDIRECTValuationRatios.md) |  | [optional] 
**valuationand_quality** | [**ValuationsNREITDIRECTValuationandQuality**](ValuationsNREITDIRECTValuationandQuality.md) |  | [optional] 

## Example

```python
from openapi_client.models.valuations_nreitdirect import ValuationsNREITDIRECT

# TODO update the JSON string below
json = "{}"
# create an instance of ValuationsNREITDIRECT from a JSON string
valuations_nreitdirect_instance = ValuationsNREITDIRECT.from_json(json)
# print the JSON string representation of the object
print(ValuationsNREITDIRECT.to_json())

# convert the object into a dict
valuations_nreitdirect_dict = valuations_nreitdirect_instance.to_dict()
# create an instance of ValuationsNREITDIRECT from a dict
valuations_nreitdirect_from_dict = ValuationsNREITDIRECT.from_dict(valuations_nreitdirect_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


