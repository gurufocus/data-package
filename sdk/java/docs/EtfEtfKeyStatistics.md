

# EtfEtfKeyStatistics


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**beta** | **BigDecimal** | Beta measures the volatility or systematic risk of a security in comparison to the market. It is calculated using the latest three years of monthly returns of the stock and the benchmark.&lt;br&gt;- A beta of 1 indicates that the stock&#39;s price will move with the market. &lt;br&gt;- A beta of less than 1 indicates that the stock will be less volatile than the market. &lt;br&gt;- A beta greater than 1 indicates that the stock&#39;s price will be more volatile than the market. |  [optional] |
|**displayTimestamp** | **String** |  |  [optional] |
|**high** | **BigDecimal** | The company&#39;s intraday high share price |  [optional] |
|**low** | **BigDecimal** | The company&#39;s intraday low share price |  [optional] |
|**open** | **BigDecimal** | The company&#39;s share price at market open |  [optional] |
|**pPctChange** | **BigDecimal** | The percent change of a company&#39;s share price based on the previous close. |  [optional] |
|**price** | **BigDecimal** | The current share price of the stock |  [optional] |
|**price52whigh** | **BigDecimal** | The highest share price over the past 52 weeks |  [optional] |
|**price52wlow** | **BigDecimal** | The lowest share price over the past 52 weeks |  [optional] |
|**rsi14** | **BigDecimal** | The relative strength index, i.e., a value that closely captures the average gain on up days divided by the average loss non down days, over the past 14 days |  [optional] |
|**sharpeRatio3y** | **BigDecimal** | The 3-Year Sharpe Ratio measures the risk-adjusted return of an investment over the past three years. It is calculated as the annualized result of the average monthly excess return divided by its standard deviation over the past three years. The monthly excess return is the monthly investment return minus the monthly risk-free rate (typically the 10-year Treasury Constant Maturity Rate). If the risk-free rate for a specific region is not available, U.S. data is used by default. |  [optional] |
|**sma20** | **BigDecimal** | The simple moving average, i.e., the arithmetic average share price, over the past 20 days. |  [optional] |
|**sortinoRatio3y** | **BigDecimal** | The 3-Year Sortino Ratio measures the risk-adjusted return of an investment over the past three years, focusing specifically on downside risk rather than total risk. It is calculated as the annualized result of the average monthly excess return divided by its downside deviation (accounts for negative excess return) over the past three years. The monthly excess return is the monthly investment return minus the monthly risk-free rate (typically the 10-year Treasury Constant Maturity Rate). If the risk-free rate for a specific region is not available, U.S. data is used by default. |  [optional] |
|**volatility** | **BigDecimal** | The annualized volatility of the stock over the past year |  [optional] |
|**volumnDay** | **BigDecimal** | The daily trading volume of a security. |  [optional] |



