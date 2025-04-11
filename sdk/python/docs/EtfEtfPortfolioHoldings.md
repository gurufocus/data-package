# EtfEtfPortfolioHoldings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holdings** | [**List[GuruTransaction]**](GuruTransaction.md) |  | [optional] 
**portdate** | **date** | Portfolio date | [optional] 

## Example

```python
from openapi_client.models.etf_etf_portfolio_holdings import EtfEtfPortfolioHoldings

# TODO update the JSON string below
json = "{}"
# create an instance of EtfEtfPortfolioHoldings from a JSON string
etf_etf_portfolio_holdings_instance = EtfEtfPortfolioHoldings.from_json(json)
# print the JSON string representation of the object
print(EtfEtfPortfolioHoldings.to_json())

# convert the object into a dict
etf_etf_portfolio_holdings_dict = etf_etf_portfolio_holdings_instance.to_dict()
# create an instance of EtfEtfPortfolioHoldings from a dict
etf_etf_portfolio_holdings_from_dict = EtfEtfPortfolioHoldings.from_dict(etf_etf_portfolio_holdings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


