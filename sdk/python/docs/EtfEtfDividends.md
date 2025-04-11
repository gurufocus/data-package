# EtfEtfDividends


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dividend_freq** | **float** | The number of times a company pays a dividend per year. Example: 4 means quarterly. | [optional] 
**next_dividend_payment_date** | **str** |  | [optional] 
**ttm_dividend** | **float** | The aggregate amount of dividends over the trailing 12 months | [optional] 
**var_yield** | **float** | The dividend yield is the ratio of a company&#39;s annual dividend compared to its share price. | [optional] 
**yield_high** | **float** | The dividend yield is the ratio of a company&#39;s annual dividend compared to its share price. | [optional] 
**yield_low** | **float** | The dividend yield is the ratio of a company&#39;s annual dividend compared to its share price. | [optional] 
**yield_med** | **float** | The dividend yield is the ratio of a company&#39;s annual dividend compared to its share price. | [optional] 

## Example

```python
from openapi_client.models.etf_etf_dividends import EtfEtfDividends

# TODO update the JSON string below
json = "{}"
# create an instance of EtfEtfDividends from a JSON string
etf_etf_dividends_instance = EtfEtfDividends.from_json(json)
# print the JSON string representation of the object
print(EtfEtfDividends.to_json())

# convert the object into a dict
etf_etf_dividends_dict = etf_etf_dividends_instance.to_dict()
# create an instance of EtfEtfDividends from a dict
etf_etf_dividends_from_dict = EtfEtfDividends.from_dict(etf_etf_dividends_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


