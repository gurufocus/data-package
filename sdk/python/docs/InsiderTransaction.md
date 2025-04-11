# InsiderTransaction

Insider transaction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cik_reporting** | **str** | Reported CIK of insider | [optional] 
**company** | **str** | The name of the company as identified on its SEC filings. | [optional] 
**cost** | **float** |  | [optional] 
**var_date** | **str** | Insiders tab: the date of the insider transaction | [optional] 
**exchange** | **str** | The company&#39;s stock exchange. Example: NAS for Apple. | [optional] 
**final_share** | **float** |  | [optional] 
**name** | **str** |  | [optional] 
**position** | **str** |  | [optional] 
**price** | **float** |  | [optional] 
**split_factor** | **float** |  | [optional] 
**stockid** | **str** | A unique identifier for the stock | [optional] 
**symbol** | **str** | The company&#39;s stock ticker symbol | [optional] 
**trans_share** | **float** |  | [optional] 
**type** | **str** | Type of transaction, S for sale, P for purchase | [optional] 

## Example

```python
from openapi_client.models.insider_transaction import InsiderTransaction

# TODO update the JSON string below
json = "{}"
# create an instance of InsiderTransaction from a JSON string
insider_transaction_instance = InsiderTransaction.from_json(json)
# print the JSON string representation of the object
print(InsiderTransaction.to_json())

# convert the object into a dict
insider_transaction_dict = insider_transaction_instance.to_dict()
# create an instance of InsiderTransaction from a dict
insider_transaction_from_dict = InsiderTransaction.from_dict(insider_transaction_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


