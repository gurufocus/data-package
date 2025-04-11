# ValuationsNNOREITNODIRECTValuationRatios


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cyclically_adjusted_pb_ratio** | **float** | The Cyclically Adjusted PB Ratio, also known as the CAPB Ratio, is the stock price divided by the average of the inflation adjusted book value per share of a company over the past 10 years. | [optional] 
**cyclically_adjusted_price_to_fcf** | **float** |  | [optional] 
**cyclically_adjusted_ps_ratio** | **float** | The Cyclically Adjusted PS Ratio, also referred to as the CAPS Ratio, is the stock price divided by the average of the inflation adjusted revenue per share of a company over the past 10 years. | [optional] 
**earning_yield_greenblatt** | **float** | The standard definition of earnings yield is the earnings per share divided by the price of a share. It&#39;s the inverse of P/E and shows the amount of money earned compared to the price you pay for a share. | [optional] 
**enterprise_value_to_ebit** | **float** | EV-to-EBIT is calculated as Enterprise Value divided by its EBIT. | [optional] 
**enterprise_value_to_ebitda** | **float** | EV-to-EBITDA is calculated as enterprise value divided by its EBITDA. | [optional] 
**enterprise_value_to_fcf** | **float** |  | [optional] 
**enterprise_value_to_revenue** | **float** | EV-to-Revenue is calculated as enterprise value divided by its revenue. | [optional] 
**fcf_yield** | **float** | Free cash flow yield: the free cash flow divided by share price | [optional] 
**pb_ratio** | **float** | Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio. | [optional] 
**pe_ratio** | **float** | &lt;p&gt;The PE ratio, or Price-to-Earnings ratio, is the most widely used metric in the valuation of stocks. It is calculated as:  &lt;b&gt;PE Ratio &#x3D; Share Price / {{eps_diluated}}&lt;/b&gt;.   It can also be calculated from the numbers for the whole company:  &lt;b&gt;PE Ratio &#x3D; {{mktcap}} / {{net_income}}&lt;/b&gt;.&lt;/p&gt;  &lt;p&gt;There are at least three kinds of PE ratios used among different investors. They are Trailing Twelve Month PE Ratio({{pettm}}), {{forwardPE}}, and {{penri}}. A new PE ratio based on inflation-adjusted normalized PE ratio is called {{ShillerPE}}, after Yale professor Robert Shiller.&lt;/p&gt;  &lt;p&gt;In the calculation of {{pettm}}, the earnings per share used are the earnings per share over the past 12 months({{ttm_eps}}). For {{forwardPE}}, the earnings are the expected earnings for the next twelve months({{forward_eps}}). In the case of {{penri}}, the reported earnings less the non-recurring items are used({{eps_nri}}).For the {{ShillerPE}}, the earnings of the past 10 years are inflation-adjusted and averaged. Since {{ShillerPE}} looks at the average over the last 10 years, it is also called PE10.&lt;/p&gt; | [optional] 
**peg_ratio** | **float** | PEG is defined as the PE Ratio without NRI divided by the growth ratio. The growth rate we use is the 5-year average EBITDA growth rate. | [optional] 
**penri** | **float** |  | [optional] 
**price_to_free_cash_flow** | **float** | Price to free cash flow is an equity valuation metric used to compare a company&#39;s per-share market price to its per-share amount of free cash flow (FCF). | [optional] 
**price_to_operating_cash_flow** | **float** | The price/cash flow ratio (also called price-to-cash flow ratio or P/CF), is a ratio used to compare a company&#39;s market value to its cash flow. | [optional] 
**price_to_owner_earnings** | **float** | In 1986 Berkshire Hathaway Shareholder Letter, Warren Buffett defined owner earnings as follows:  \&quot;These represent (a) reported earnings plus (b) depreciation, depletion, amortization, and certain other non-cash charges...less (c) the average annual amount of capitalized expenditures for plant and equipment, etc. that the business requires to fully maintain its long-term competitive position and its unit volume. (If the business requires additional working capital to maintain its competitive position and unit volume, the increment also should be included in (c))...Our owner-earnings equation does not yield the deceptively precise figures provided by GAAP, since (c) must be a guess - and one sometimes very difficult to make. Despite this problem, we consider the owner earnings figure, not the GAAP figure, to be the relevant item for valuation purposes - both for investors in buying stocks and for managers in buying entire businesses...All of this points up the absurdity of the &#39;cash flow&#39; numbers that are often set forth in Wall Street reports. These numbers routinely include (a) plus (b) - but do not subtract (c).\&quot; | [optional] 
**price_to_tangible_book** | **float** | The Price to Tangible Book Value ratio (PTBV) expresses share price as a proportion of the company&#39;s tangible book value reported on the company&#39;s balance sheet. | [optional] 
**ps_ratio** | **float** | Price–sales ratio, P/S ratio, or PSR, is a valuation metric for stocks. | [optional] 
**rate_of_return_value** | **float** | Yacktman defines forward rate of return as the normalized free cash flow yield plus real growth plus inflation. | [optional] 
**shiller_pe_ratio** | **float** | Price earnings ratio is based on average inflation-adjusted earnings from the previous 10 years, known as the Cyclically Adjusted PE Ratio (CAPE Ratio), Shiller PE Ratio, or PE 10 | [optional] 
**var_yield** | **float** | The dividend yield is the ratio of a company&#39;s annual dividend compared to its share price. | [optional] 

## Example

```python
from openapi_client.models.valuations_nnoreitnodirect_valuation_ratios import ValuationsNNOREITNODIRECTValuationRatios

# TODO update the JSON string below
json = "{}"
# create an instance of ValuationsNNOREITNODIRECTValuationRatios from a JSON string
valuations_nnoreitnodirect_valuation_ratios_instance = ValuationsNNOREITNODIRECTValuationRatios.from_json(json)
# print the JSON string representation of the object
print(ValuationsNNOREITNODIRECTValuationRatios.to_json())

# convert the object into a dict
valuations_nnoreitnodirect_valuation_ratios_dict = valuations_nnoreitnodirect_valuation_ratios_instance.to_dict()
# create an instance of ValuationsNNOREITNODIRECTValuationRatios from a dict
valuations_nnoreitnodirect_valuation_ratios_from_dict = ValuationsNNOREITNODIRECTValuationRatios.from_dict(valuations_nnoreitnodirect_valuation_ratios_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


