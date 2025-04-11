# ValuationsIREITNODIRECTRatios


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capex_to_operating_cash_flow** | **float** |  | [optional] 
**capex_to_revenue** | **float** |  | [optional] 
**debt_to_asset** | **float** | Debt to assets is a leverage ratio that defines the total amount of debt relative to assets | [optional] 
**debt_to_equity** | **float** | The Debt/Equity (D/E) Ratio is calculated by dividing a company’s total liabilities by its shareholder equity. The ratio is used to evaluate a company&#39;s financial leverage. | [optional] 
**degree_of_financial_leverage** | **float** |  | [optional] 
**degree_of_operating_leverage** | **float** |  | [optional] 
**dividend_to_ffo** | **float** | Cash dividends declared on the company&#39;s primary issue of common stock as a percent of funds from operations, on a per-share basis | [optional] 
**ebitda_margin** | **float** |  | [optional] 
**effective_interest_rate** | **float** | Effective interest rate on debt is the usage rate that a borrower actually pays on a debt. It is calculated as the positive value of interest expense divided by its average total debt. | [optional] 
**equity_to_asset** | **float** | Equity to Asset ratio is calculated as shareholder&#39;s tangible equity divided by its total asset. | [optional] 
**fcf_margin** | **float** | FCF Margin is calculated as Free Cash Flow divided by total Revenue. | [optional] 
**liabilities_to_assets** | **float** |  | [optional] 
**net_margin** | **float** | Net margin is calculated as Net Income divided by its Revenue. | [optional] 
**payout** | **float** | The dividend payout ratio is the ratio of the total amount of dividends paid out to shareholders relative to the net income of the company. | [optional] 
**return_on_tangible_asset** | **float** | Return on tangible assets is calculated as Net Income divided by its average total tangible assets. Total tangible assets equals to Total Assets minus Intangible Assets. | [optional] 
**return_on_tangible_equity** | **float** | Return on tangible equity is calculated as Net Income attributable to Common Stockholders divided by its average total shareholder tangible equity. | [optional] 
**roa** | **float** | Return on assets is calculated as Net Income divided by its Total Assets. | [optional] 
**roe** | **float** |  | [optional] 
**roe_adj** | **float** | The return on equity adjusted to book values | [optional] 
**roic** | **float** | Return on Invested Capital (ROIC) is calculated as follows:    Return on Invested Capital (ROIC) &#x3D; (EBIT - Adjusted Taxes) / (Book Value of Debt + Book Value of Equity - Cash) | [optional] 
**roiic_1y** | **float** | 1-Year Return on Invested Incremental Capital (1-Year ROIIC %) measures the change in earnings as a percentage of change in investment over 1-year. | [optional] 
**rore_5y** | **float** | Return on Retained Earnings (RORE) is an indicator of a company&#39;s growth potential, it shows how much a company earns by reinvesting its retained earnings. | [optional] 
**turnover** | **float** | Asset Turnover measures how quickly a company turns over its asset through sales. It is defined as     &lt;b&gt;Asset Turnover &#x3D; Sales / {Total Assets}&lt;/b&gt;    Companies with low profit margins tend to have high asset turnover, while those with high profit margins have low asset turnover. Companies in the retail industry tend to have a very high turnover ratio. | [optional] 
**wacc** | **float** | The weighted average cost of capital (WACC) is the rate that a company is expected to pay on average to all its security holders to finance its assets. | [optional] 

## Example

```python
from openapi_client.models.valuations_ireitnodirect_ratios import ValuationsIREITNODIRECTRatios

# TODO update the JSON string below
json = "{}"
# create an instance of ValuationsIREITNODIRECTRatios from a JSON string
valuations_ireitnodirect_ratios_instance = ValuationsIREITNODIRECTRatios.from_json(json)
# print the JSON string representation of the object
print(ValuationsIREITNODIRECTRatios.to_json())

# convert the object into a dict
valuations_ireitnodirect_ratios_dict = valuations_ireitnodirect_ratios_instance.to_dict()
# create an instance of ValuationsIREITNODIRECTRatios from a dict
valuations_ireitnodirect_ratios_from_dict = ValuationsIREITNODIRECTRatios.from_dict(valuations_ireitnodirect_ratios_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


