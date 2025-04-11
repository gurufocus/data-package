# StockProfileGeneral


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ipo_date** | **str** | The date of the company&#39;s initial public offering. | [optional] 
**is_direct** | **str** | Does the company report its cash flow statement using the direct method (cash collections, cash payments) or the indirect method (net income -&gt; free cash flow)? | [optional] 
**naics** | **float** | A six-digit code that identifies the company&#39;s main business operation | [optional] 
**cik** | **str** | A unique 10-digit number the SEC assigns to companies, mutual funds and hedge funds | [optional] 
**class_descpt** | **str** | A unique identifier that describes the stock ticker&#39;s share class. Examples: Class A, Class C, ADR | [optional] 
**company** | **str** | The name of the company as identified on its SEC filings. | [optional] 
**company_id** | **str** |  | [optional] 
**country_iso** | **str** | The country containing the company&#39;s headquarters. | [optional] 
**currency** | **str** | The currency symbol used to report a company&#39;s financial data. For example, NYSE stocks have currency USD | [optional] 
**currency_comp** | **str** | The currency symbol used to report a company&#39;s financial data. For example, NYSE stocks have currency USD | [optional] 
**depositary_receipt_ratio** | **float** |  | [optional] 
**exchange** | **str** | The company&#39;s stock exchange. Example: NAS for Apple. | [optional] 
**fiscal_year_end** | **float** | The month representing the company&#39;s fiscal year end. | [optional] 
**group** | **str** |  | [optional] 
**ind_template** | **str** | The company&#39;s financial statement type: either bank, insurance or nonfinancial | [optional] 
**industry** | **str** | The company&#39;s industry. Example: Discount Stores for WMT. | [optional] 
**latest_quarter** | **str** | The company&#39;s latest quarter-end date | [optional] 
**optionable_stock** | **bool** | Does the stock offer options? If yes, the stock is \&quot;optionable.\&quot; | [optional] 
**primary_exch** | **str** | The stock ticker&#39;s primary exchange, which most likely connects to the company&#39;s headquarter country | [optional] 
**primary_stockid** | **str** |  | [optional] 
**primary_symbol** | **str** | The ticker symbol the company trades under its primary exchange | [optional] 
**report_frequency** | **str** | How frequently does a company report its earnings? | [optional] 
**sector** | **str** | A three-digit code indicating a company&#39;s market sector | [optional] 
**sic** | **float** | A four-digit code that classifies a company by its business type | [optional] 
**stockid** | **str** | A unique identifier for the stock | [optional] 
**symbol** | **str** | The company&#39;s stock ticker symbol | [optional] 
**type** | **str** | A code that determines if a security represents common stock or preferred stock | [optional] 

## Example

```python
from openapi_client.models.stock_profile_general import StockProfileGeneral

# TODO update the JSON string below
json = "{}"
# create an instance of StockProfileGeneral from a JSON string
stock_profile_general_instance = StockProfileGeneral.from_json(json)
# print the JSON string representation of the object
print(StockProfileGeneral.to_json())

# convert the object into a dict
stock_profile_general_dict = stock_profile_general_instance.to_dict()
# create an instance of StockProfileGeneral from a dict
stock_profile_general_from_dict = StockProfileGeneral.from_dict(stock_profile_general_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


