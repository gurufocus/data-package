# EtfEtfKeyStatistics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**beta** | **float** | Beta measures the volatility or systematic risk of a security in comparison to the market. It is calculated using the latest three years of monthly returns of the stock and the benchmark.&lt;br&gt;- A beta of 1 indicates that the stock&#39;s price will move with the market. &lt;br&gt;- A beta of less than 1 indicates that the stock will be less volatile than the market. &lt;br&gt;- A beta greater than 1 indicates that the stock&#39;s price will be more volatile than the market. | [optional] 
**display_timestamp** | **str** |  | [optional] 
**high** | **float** | The company&#39;s intraday high share price | [optional] 
**low** | **float** | The company&#39;s intraday low share price | [optional] 
**open** | **float** | The company&#39;s share price at market open | [optional] 
**p_pct_change** | **float** | The percent change of a company&#39;s share price based on the previous close. | [optional] 
**price** | **float** | The current share price of the stock | [optional] 
**price52whigh** | **float** | The highest share price over the past 52 weeks | [optional] 
**price52wlow** | **float** | The lowest share price over the past 52 weeks | [optional] 
**rsi_14** | **float** | The relative strength index, i.e., a value that closely captures the average gain on up days divided by the average loss non down days, over the past 14 days | [optional] 
**sharpe_ratio_3y** | **float** | The 3-Year Sharpe Ratio measures the risk-adjusted return of an investment over the past three years. It is calculated as the annualized result of the average monthly excess return divided by its standard deviation over the past three years. The monthly excess return is the monthly investment return minus the monthly risk-free rate (typically the 10-year Treasury Constant Maturity Rate). If the risk-free rate for a specific region is not available, U.S. data is used by default. | [optional] 
**sma_20** | **float** | The simple moving average, i.e., the arithmetic average share price, over the past 20 days. | [optional] 
**sortino_ratio_3y** | **float** | The 3-Year Sortino Ratio measures the risk-adjusted return of an investment over the past three years, focusing specifically on downside risk rather than total risk. It is calculated as the annualized result of the average monthly excess return divided by its downside deviation (accounts for negative excess return) over the past three years. The monthly excess return is the monthly investment return minus the monthly risk-free rate (typically the 10-year Treasury Constant Maturity Rate). If the risk-free rate for a specific region is not available, U.S. data is used by default. | [optional] 
**volatility** | **float** | The annualized volatility of the stock over the past year | [optional] 
**volumn_day** | **float** | The daily trading volume of a security. | [optional] 

## Example

```python
from openapi_client.models.etf_etf_key_statistics import EtfEtfKeyStatistics

# TODO update the JSON string below
json = "{}"
# create an instance of EtfEtfKeyStatistics from a JSON string
etf_etf_key_statistics_instance = EtfEtfKeyStatistics.from_json(json)
# print the JSON string representation of the object
print(EtfEtfKeyStatistics.to_json())

# convert the object into a dict
etf_etf_key_statistics_dict = etf_etf_key_statistics_instance.to_dict()
# create an instance of EtfEtfKeyStatistics from a dict
etf_etf_key_statistics_from_dict = EtfEtfKeyStatistics.from_dict(etf_etf_key_statistics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


