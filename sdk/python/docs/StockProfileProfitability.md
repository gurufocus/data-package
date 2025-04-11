# StockProfileProfitability


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fc_fmargin** | **float** | FCF Margin is calculated as Free Cash Flow divided by total Revenue. | [optional] 
**fc_fmargin_high** | **float** | The FCF Margin % (10y High) refers to the highest value of the FCF Margin over a 10-year period, where FCF Margin is calculated as Free Cash Flow divided by total Revenue. | [optional] 
**fc_fmargin_low** | **float** | The FCF Margin % (10y Low) refers to the lowest value of FCF Margin over a 10-year period, where FCF Margin is calculated as Free Cash Flow divided by total Revenue. | [optional] 
**fc_fmargin_med** | **float** | The FCF Margin % (10y Median) refers to the median value of FCF Margin over a 10-year period, where FCF Margin is calculated as Free Cash Flow divided by total Revenue. | [optional] 
**fc_fmargin_med_5y** | **float** | The median free cash flow margin over the past five years | [optional] 
**net_interest_margin** | **float** | Net interest margin is a performance metric that examines how successful a firm&#39;s investment decisions are compared to its debt situations. | [optional] 
**cash_conversion_ratio** | **float** | Cash Conversion Ratio is calculated as Free Cash Flow divided by Net Income. | [optional] 
**cash_conversion_ratio_high** | **float** | The Cash Conversion Ratio (10y High) refers to the highest value of the Cash Conversion Ratio over a 10-year period, where Cash Conversion Ratio is calculated as Free Cash Flow divided by Net Income. | [optional] 
**cash_conversion_ratio_low** | **float** | The Cash Conversion Ratio (10y Low) refers to the lowest value of Cash Conversion Ratio over a 10-year period, where Cash Conversion Ratio is calculated as Free Cash Flow divided by Net Income. | [optional] 
**cash_conversion_ratio_med** | **float** | The Cash Conversion Ratio (10y Median) refers to the median value of Cash Conversion Ratio over a 10-year period, where Cash Conversion Ratio is calculated as Free Cash Flow divided by Net Income. | [optional] 
**cash_conversion_ratio_med_5y** | **float** | The Cash Conversion Ratio (5y Median) refers to the median value of Cash Conversion Ratio over a 5-year period, where Cash Conversion Ratio is calculated as Free Cash Flow divided by Net Income. | [optional] 
**ebit_margin** | **float** |  | [optional] 
**ebit_margin_high** | **float** |  | [optional] 
**ebit_margin_low** | **float** |  | [optional] 
**ebit_margin_med** | **float** |  | [optional] 
**ebitda_margin** | **float** |  | [optional] 
**ebitda_margin_high** | **float** |  | [optional] 
**ebitda_margin_low** | **float** |  | [optional] 
**ebitda_margin_med** | **float** |  | [optional] 
**fcf_year_num** | **float** |  | [optional] 
**grossmargin** | **float** | Gross Margin % is calculated as gross profit divided by its revenue. | [optional] 
**grossmargin_high** | **float** | Gross Margin % is calculated as gross profit divided by its revenue. | [optional] 
**grossmargin_low** | **float** | Gross Margin % is calculated as gross profit divided by its revenue. | [optional] 
**grossmargin_med** | **float** | Gross Margin % is calculated as gross profit divided by its revenue. | [optional] 
**grossmargin_med_5y** | **float** | The Gross Margin % (5y Median) refers to the median value of the gross margin over a period of five years, where gross margin is calculated as gross profit divided by its revenue. | [optional] 
**net_margain** | **float** | Net margin is calculated as Net Income divided by its Revenue. | [optional] 
**net_margain_high** | **float** | Net margin is calculated as Net Income divided by its Revenue. | [optional] 
**net_margain_low** | **float** | Net margin is calculated as Net Income divided by its Revenue. | [optional] 
**net_margain_med** | **float** | Net margin is calculated as Net Income divided by its Revenue. | [optional] 
**net_margain_med_5y** | **float** | The Net Margin % (5y Median) refers to the median value of the net margin over a period of five years, where net margin is calculated as net Income divided by its revenue. | [optional] 
**oprt_margain** | **float** | Operating Margin % is calculated as Operating Income divided by its Revenue. | [optional] 
**oprt_margain_high** | **float** | Operating Margin % is calculated as Operating Income divided by its Revenue. | [optional] 
**oprt_margain_low** | **float** | Operating Margin % is calculated as Operating Income divided by its Revenue. | [optional] 
**oprt_margain_med** | **float** | Operating Margin % is calculated as Operating Income divided by its Revenue. | [optional] 
**oprt_margain_med_5y** | **float** | Operating Margin % is calculated as Operating Income divided by its Revenue. | [optional] 
**pretax_margain** | **float** | The company&#39;s pretax earnings divided by total revenue | [optional] 
**pretax_margain_high** | **float** | The highest pretax margin over the past 10 years | [optional] 
**pretax_margain_low** | **float** | The lowest pretax margin over the past 10 years | [optional] 
**pretax_margain_med** | **float** | The median pretax margin over the past 10 years | [optional] 
**pretax_margain_med_5y** | **float** | The Pretax Margin % (5y Median) refers to the median value of the pretax margin over a period of five years, where pretax margin is calculated as pretax Income divided by its revenue. | [optional] 
**profit_year_num** | **float** | The number of years a company had positive earnings over the past 10 years | [optional] 

## Example

```python
from openapi_client.models.stock_profile_profitability import StockProfileProfitability

# TODO update the JSON string below
json = "{}"
# create an instance of StockProfileProfitability from a JSON string
stock_profile_profitability_instance = StockProfileProfitability.from_json(json)
# print the JSON string representation of the object
print(StockProfileProfitability.to_json())

# convert the object into a dict
stock_profile_profitability_dict = stock_profile_profitability_instance.to_dict()
# create an instance of StockProfileProfitability from a dict
stock_profile_profitability_from_dict = StockProfileProfitability.from_dict(stock_profile_profitability_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


