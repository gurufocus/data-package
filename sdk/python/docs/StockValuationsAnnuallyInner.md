# StockValuationsAnnuallyInner


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
from openapi_client.models.stock_valuations_annually_inner import StockValuationsAnnuallyInner

# TODO update the JSON string below
json = "{}"
# create an instance of StockValuationsAnnuallyInner from a JSON string
stock_valuations_annually_inner_instance = StockValuationsAnnuallyInner.from_json(json)
# print the JSON string representation of the object
print(StockValuationsAnnuallyInner.to_json())

# convert the object into a dict
stock_valuations_annually_inner_dict = stock_valuations_annually_inner_instance.to_dict()
# create an instance of StockValuationsAnnuallyInner from a dict
stock_valuations_annually_inner_from_dict = StockValuationsAnnuallyInner.from_dict(stock_valuations_annually_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


