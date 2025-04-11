# StockValuationsTtm


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basic_information** | [**ValuationsNNOREITNODIRECTBasicInformation**](ValuationsNNOREITNODIRECTBasicInformation.md) |  | [optional] 
**per_share_data** | [**ValuationsNNOREITNODIRECTPerShareData**](ValuationsNNOREITNODIRECTPerShareData.md) |  | [optional] 
**ratios** | [**ValuationsNNOREITNODIRECTRatios**](ValuationsNNOREITNODIRECTRatios.md) |  | [optional] 
**valuation_ratios** | [**ValuationsNNOREITNODIRECTValuationRatios**](ValuationsNNOREITNODIRECTValuationRatios.md) |  | [optional] 
**valuationand_quality** | [**ValuationsNNOREITNODIRECTValuationandQuality**](ValuationsNNOREITNODIRECTValuationandQuality.md) |  | [optional] 

## Example

```python
from openapi_client.models.stock_valuations_ttm import StockValuationsTtm

# TODO update the JSON string below
json = "{}"
# create an instance of StockValuationsTtm from a JSON string
stock_valuations_ttm_instance = StockValuationsTtm.from_json(json)
# print the JSON string representation of the object
print(StockValuationsTtm.to_json())

# convert the object into a dict
stock_valuations_ttm_dict = stock_valuations_ttm_instance.to_dict()
# create an instance of StockValuationsTtm from a dict
stock_valuations_ttm_from_dict = StockValuationsTtm.from_dict(stock_valuations_ttm_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


