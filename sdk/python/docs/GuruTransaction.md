# GuruTransaction

Guru transaction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** | The transaction type: add, buy, reduce, sold out | [optional] 
**change** | **float** |  | [optional] 
**var_class** | **str** | A unique identifier that describes the stock ticker&#39;s share class. Examples: Class A, Class C, ADR | [optional] 
**comment** | **str** |  | [optional] 
**company_name** | **str** |  | [optional] 
**exchange** | **str** | The company&#39;s stock exchange. Example: NAS for Apple. | [optional] 
**impact** | **float** | The ratio of the dollar value of the transaction relative to the total value of the portfolio. | [optional] 
**industry_code** | **float** |  | [optional] 
**portdate** | **str** | If the date is the end of quarters, the trades are made during the quarter ended on the dates. Otherwise, the dates are the estimated trade dates. | [optional] 
**position** | **float** |  | [optional] 
**price_avg** | **float** |  | [optional] 
**price_max** | **float** | For a guru trade, the highest trading price over a specific quarter | [optional] 
**price_min** | **float** | For a guru trade, the minimum trading price over a specific quarter | [optional] 
**share_change** | **float** |  | [optional] 
**shares** | **float** | Outstanding shares refer to a company&#39;s stock currently held by all its shareholders, including share blocks held by institutional investors and restricted shares owned by the company&#39;s officers and insiders. | [optional] 
**shares_outstanding** | **float** | &lt;p&gt;{{Cash_Flow_from_Others}} may include {{ChangeInWorkingCapital}}. These are cash differences caused by the {{ChangeInInventory}}, {{AccountsPayable}}, {{Accts_Rec}} etc. For instance, if a company pays its suppliers slower, its cash position will build up faster. If a company receives payments from its customers slower, its {{Accts_Rec}} will rise, and its cash position will grow more slowly (or even shrink).&lt;/p&gt; | [optional] 
**split_factor** | **float** |  | [optional] 
**stockid** | **str** | A unique identifier for the stock | [optional] 
**symbol** | **str** | The company&#39;s stock ticker symbol | [optional] 
**value** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.guru_transaction import GuruTransaction

# TODO update the JSON string below
json = "{}"
# create an instance of GuruTransaction from a JSON string
guru_transaction_instance = GuruTransaction.from_json(json)
# print the JSON string representation of the object
print(GuruTransaction.to_json())

# convert the object into a dict
guru_transaction_dict = guru_transaction_instance.to_dict()
# create an instance of GuruTransaction from a dict
guru_transaction_from_dict = GuruTransaction.from_dict(guru_transaction_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


