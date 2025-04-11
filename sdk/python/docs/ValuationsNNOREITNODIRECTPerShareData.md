# ValuationsNNOREITNODIRECTPerShareData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**book_value_per_share** | **float** | Per share value of a company based on common shareholders&#39; equity in the company. | [optional] 
**cash_flow_from_operations_per_share** | **float** | Operating Cash Flow per Share is the amount of Operating Cash Flow per outstanding share of the company | [optional] 
**cash_per_share** | **float** |  | [optional] 
**dividends_per_share** | **float** | Dividends paid to per common share | [optional] 
**earning_per_share_diluted** | **float** | The company&#39;s diluted earnings per share | [optional] 
**ebit_per_share** | **float** | The earnings before interest and taxes divided by shares outstanding | [optional] 
**ebitda_per_share** | **float** | EBITDA per Share is the amount of Earnings Before Interest, Taxes, Depreciation, and  Amortization (EBITDA) per outstanding share of the company™s stock.     Earnings Before Interest, Taxes, Depreciation, and  Amortization (EBITDA) is what the company earns before  it expenses interest, taxes, depreciation and amortization.  EBITDA is calculated as   EBITDA   &#x3D; {Revenue} - {Cost of Goods Sold} - {Selling, General, &amp; Admin. Expense} - {Research &amp; Development}  &#x3D; {Gross Profit} - {Selling, General, &amp; Admin. Expense} - {Research &amp; Development} | [optional] 
**eps_without_nri** | **float** | Earnings Per Share (EPS) is the single most important variable used by Wall Street in determining the earnings power of a company. But investors need to be aware that Earnings per Share can be easily manipulated by adjusting depreciation and amortization rate or non-recurring items. That&#39;s why GuruFocus lists Earnings per share without Non-Recurring Items, which better reflects the company&#39;s underlying performance.    Earnings Per Share without Non-Recurring Items is the amount of earnings without non-recurring items per outstanding share of the company&amp;#146;s stock. In calculating earnings per share without non-recurring items, the dividends of preferred stocks and non-recurring items need to subtracted from the total net income first. | [optional] 
**free_cash_flow_per_share** | **float** | The company&#39;s free cash flow divided by shares outstanding | [optional] 
**month_end_stock_price** | **float** | The company&#39;s share price at the final day of the month | [optional] 
**owner_earnings** | **float** | If we think through these questions, we can gain some insights about what may be called &#39;owner earnings.&#39; These represent (A) reported earnings plus (B) depreciation, depletion, amortization, and certain other non-cash charges such as Company N&#39;s items (1) and (4) less the average annual amount of capitalized expenditures for plant and equipment, etc. that the business requires to fully maintain its long-term competitive position and its unit volume. (If the business requires additional working capital to maintain its competitive position and unit volume, the increment also should be included in (c). However, businesses following the LIFO inventory method usually do not require additional working capital if unit volume does not change. | [optional] 
**revenue_per_share** | **float** | The company&#39;s total revenue divided by shares outstanding. | [optional] 
**tangibles_book_per_share** | **float** | The per share value of a company based on common shareholder&#39;s equity less intangible assets | [optional] 
**total_debt_per_share** | **float** | The amount of long-term debt divided by the shares outstanding | [optional] 

## Example

```python
from openapi_client.models.valuations_nnoreitnodirect_per_share_data import ValuationsNNOREITNODIRECTPerShareData

# TODO update the JSON string below
json = "{}"
# create an instance of ValuationsNNOREITNODIRECTPerShareData from a JSON string
valuations_nnoreitnodirect_per_share_data_instance = ValuationsNNOREITNODIRECTPerShareData.from_json(json)
# print the JSON string representation of the object
print(ValuationsNNOREITNODIRECTPerShareData.to_json())

# convert the object into a dict
valuations_nnoreitnodirect_per_share_data_dict = valuations_nnoreitnodirect_per_share_data_instance.to_dict()
# create an instance of ValuationsNNOREITNODIRECTPerShareData from a dict
valuations_nnoreitnodirect_per_share_data_from_dict = ValuationsNNOREITNODIRECTPerShareData.from_dict(valuations_nnoreitnodirect_per_share_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


