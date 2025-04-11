

# StockProfilePrice


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**beta** | **BigDecimal** | Beta measures the volatility or systematic risk of a security in comparison to the market. It is calculated using the latest three years of monthly returns of the stock and the benchmark.&lt;br&gt;- A beta of 1 indicates that the stock&#39;s price will move with the market. &lt;br&gt;- A beta of less than 1 indicates that the stock will be less volatile than the market. &lt;br&gt;- A beta greater than 1 indicates that the stock&#39;s price will be more volatile than the market. |  [optional] |
|**deathCrossEma20Vs200** | **String** | A death cross (EMA 20 vs 200) occurs when a stock&#39;s 20-day exponential moving average crosses from above to below its 200-day exponential moving average at some point in the past week. |  [optional] |
|**deathCrossEma20Vs50** | **String** | A death cross (EMA 20 vs 50) occurs when a stock&#39;s 20-day exponential moving average crosses from above to below its 50-day exponential moving average at some point in the past week. |  [optional] |
|**deathCrossEma50Vs200** | **String** | A death cross (EMA 50 vs 200) occurs when a stock&#39;s 50-day exponential moving average crosses from above to below its 200-day exponential moving average at some point in the past week. |  [optional] |
|**deathCrossSma20Vs200** | **String** | A death cross occurs when a stock&#39;s 20-day moving average crosses from above to below its 200-day moving average at some point in the past week. |  [optional] |
|**deathCrossSma20Vs50** | **String** | A death cross occurs when a stock&#39;s 20-day moving average crosses from above to below its 50-day moving average at some point in the past week. |  [optional] |
|**deathCrossSma50Vs200** | **String** | A death cross occurs when a stock&#39;s 50-day moving average crosses from above to below its 200-day moving average at some point in the past week. |  [optional] |
|**displayTimestamp** | **String** |  |  [optional] |
|**ema20** | **BigDecimal** | The exponential moving average, i.e., the exponential smoothing average share price, over the past 20 days. |  [optional] |
|**ema200** | **BigDecimal** | The exponential moving average, i.e., the exponential smoothing average share price, over the past 200 days. |  [optional] |
|**ema50** | **BigDecimal** | The exponential moving average, i.e., the exponential smoothing average share price, over the past 50 days. |  [optional] |
|**_float** | **BigDecimal** | The actual number of company shares available for trading |  [optional] |
|**goldenCrossEma20Vs200** | **String** | A golden cross (EMA 20 vs 200) occurs when a stock&#39;s 20-day exponential moving average crosses above its 200-day exponential moving average at some point in the past week. |  [optional] |
|**goldenCrossEma20Vs50** | **String** | A golden cross (EMA 20 vs 50) occurs when a stock&#39;s 20-day exponential moving average crosses above its 50-day exponential moving average at some point in the past week. |  [optional] |
|**goldenCrossEma50Vs200** | **String** | A golden cross (EMA 50 vs 200) occurs when a stock&#39;s 50-day exponential moving average crosses above its 200-day exponential moving average at some point in the past week. |  [optional] |
|**goldenCrossSma20Vs200** | **String** | A golden cross occurs when a stock&#39;s 20-day moving average crosses above its 200-day moving average at some point in the past week. |  [optional] |
|**goldenCrossSma20Vs50** | **String** | A golden cross occurs when a stock&#39;s 20-day moving average crosses above its 50-day moving average at some point in the past week. |  [optional] |
|**goldenCrossSma50Vs200** | **String** | A golden cross occurs when a stock&#39;s 50-day moving average crosses above its 200-day moving average at some point in the past week. |  [optional] |
|**high** | **BigDecimal** | The company&#39;s intraday high share price |  [optional] |
|**low** | **BigDecimal** | The company&#39;s intraday low share price |  [optional] |
|**macdDeathCrossSignal** | **String** | MACD Crossed Below Signal indicates that the macd line crossed below the signal line at some point in the past week. |  [optional] |
|**macdGoldenCrossSignal** | **String** | MACD Crossed Above Signal indicates that the macd line crossed above the signal line at some point in the past week. |  [optional] |
|**macdLine** | **BigDecimal** | An MACD Line is created by subtracting the 26-period EMA from the 12-period EMA.  |  [optional] |
|**macdSignalLine** | **BigDecimal** | An MACD Signal Line is a nine-day EMA of the MACD line. |  [optional] |
|**open** | **BigDecimal** | The company&#39;s share price at market open |  [optional] |
|**pPctChange** | **BigDecimal** | The percent change of a company&#39;s share price based on the previous close. |  [optional] |
|**pchangeSP10y** | **BigDecimal** | The annulized total return of the stock over the past ten years, relative to the S&amp;P 500. |  [optional] |
|**pchangeSP12w** | **BigDecimal** | The total return of the stock over the past three months, relative to the S&amp;P 500 |  [optional] |
|**pchangeSP15y** | **BigDecimal** | The annulized total return of the stock over the past 15 years, relative to the S&amp;P 500. |  [optional] |
|**pchangeSP1w** | **BigDecimal** | The total return of the stock over the past week, relative to the S&amp;P 500 |  [optional] |
|**pchangeSP20y** | **BigDecimal** | The annulized total return of the stock over the past 20 years, relative to the S&amp;P 500. |  [optional] |
|**pchangeSP24w** | **BigDecimal** | The total return of the stock over the past six months, relative to the S&amp;P 500 |  [optional] |
|**pchangeSP3y** | **BigDecimal** | The annulized total return of the stock over the past three years, relative to the S&amp;P 500. |  [optional] |
|**pchangeSP4w** | **BigDecimal** | The total return of the stock over the past month, relative to the S&amp;P 500 |  [optional] |
|**pchangeSP52w** | **BigDecimal** | The total return of the stock over the past 12 months, relative to the S&amp;P 500 |  [optional] |
|**pchangeSP5y** | **BigDecimal** | The annulized total return of the stock over the past five years, relative to the S&amp;P 500. |  [optional] |
|**pchangeSPYtd** | **BigDecimal** | The total return of the stock year to date, relative to the S&amp;P 500 |  [optional] |
|**pchange10y** | **BigDecimal** | The total return of the stock on a 10-year, annualized basis |  [optional] |
|**pchange121m** | **BigDecimal** | The total return of the stock from 12-month ago to 1-month ago. |  [optional] |
|**pchange12w** | **BigDecimal** | The total return of the stock over the past three months |  [optional] |
|**pchange15y** | **BigDecimal** | The annulized total return of the stock over the past 15 years. |  [optional] |
|**pchange1w** | **BigDecimal** | The total return of the stock over the past week |  [optional] |
|**pchange20y** | **BigDecimal** | The annulized total return of the stock over the past 20 years. |  [optional] |
|**pchange24w** | **BigDecimal** | The total return of the stock over the past six months |  [optional] |
|**pchange31m** | **BigDecimal** | The total return of the stock from 3-month ago to 1-month ago. |  [optional] |
|**pchange3y** | **BigDecimal** | The total return of the stock on a three-year, annualized basis |  [optional] |
|**pchange4w** | **BigDecimal** | The total return of the stock over the past month |  [optional] |
|**pchange52w** | **BigDecimal** | The total return of the stock over the past 12 months |  [optional] |
|**pchange5y** | **BigDecimal** | The total return of the stock on a five-year, annualized basis |  [optional] |
|**pchange61m** | **BigDecimal** | The total return of the stock from 6-month ago to 1-month ago. |  [optional] |
|**pchangeYtd** | **BigDecimal** | The total return of the stock year to date |  [optional] |
|**price** | **BigDecimal** | The current share price of the stock |  [optional] |
|**price10yhigh** | **BigDecimal** | The highest share price over the past 10 years |  [optional] |
|**price10ylow** | **BigDecimal** | The lowest share price over the past 10 years |  [optional] |
|**price3yhigh** | **BigDecimal** | The highest share price over the past three years |  [optional] |
|**price3ylow** | **BigDecimal** | The lowest share price over the past three years |  [optional] |
|**price52whigh** | **BigDecimal** | The highest share price over the past 52 weeks |  [optional] |
|**price52wlow** | **BigDecimal** | The lowest share price over the past 52 weeks |  [optional] |
|**price5yhigh** | **BigDecimal** | The highest share price over the past five years |  [optional] |
|**price5ylow** | **BigDecimal** | The lowest share price over the past five years |  [optional] |
|**priceStdv20** | **BigDecimal** |  |  [optional] |
|**priceStdv200** | **BigDecimal** |  |  [optional] |
|**priceStdv50** | **BigDecimal** |  |  [optional] |
|**pricehishigh** | **BigDecimal** |  |  [optional] |
|**pricehislow** | **BigDecimal** |  |  [optional] |
|**priceindex6m** | **BigDecimal** | The six-month price index: Current Share Price divided by Share Price Six Months Ago |  [optional] |
|**rsi14** | **BigDecimal** | The relative strength index, i.e., a value that closely captures the average gain on up days divided by the average loss non down days, over the past 14 days |  [optional] |
|**rsi30** | **BigDecimal** |  |  [optional] |
|**rsi5** | **BigDecimal** |  |  [optional] |
|**rsi9** | **BigDecimal** |  |  [optional] |
|**sharpeRatio** | **BigDecimal** | The 1-Year Sharpe Ratio measures the risk-adjusted return of an investment over the past year. It is calculated as the annualized result of the average monthly excess return divided by its standard deviation over the past year. The monthly excess return is the monthly investment return minus the monthly risk-free rate (typically the 10-year Treasury Constant Maturity Rate). If the risk-free rate for a specific region is not available, U.S. data is used by default. |  [optional] |
|**sharpeRatio10y** | **BigDecimal** | The 10-Year Sharpe Ratio measures the risk-adjusted return of an investment over the past ten years. It is calculated as the annualized result of the average monthly excess return divided by its standard deviation over the past ten years. The monthly excess return is the monthly investment return minus the monthly risk-free rate (typically the 10-year Treasury Constant Maturity Rate). If the risk-free rate for a specific region is not available, U.S. data is used by default. |  [optional] |
|**sharpeRatio3y** | **BigDecimal** | The 3-Year Sharpe Ratio measures the risk-adjusted return of an investment over the past three years. It is calculated as the annualized result of the average monthly excess return divided by its standard deviation over the past three years. The monthly excess return is the monthly investment return minus the monthly risk-free rate (typically the 10-year Treasury Constant Maturity Rate). If the risk-free rate for a specific region is not available, U.S. data is used by default. |  [optional] |
|**sharpeRatio5y** | **BigDecimal** | The 5-Year Sharpe Ratio measures the risk-adjusted return of an investment over the past five years. It is calculated as the annualized result of the average monthly excess return divided by its standard deviation over the past five years. The monthly excess return is the monthly investment return minus the monthly risk-free rate (typically the 10-year Treasury Constant Maturity Rate). If the risk-free rate for a specific region is not available, U.S. data is used by default. |  [optional] |
|**sma20** | **BigDecimal** | The simple moving average, i.e., the arithmetic average share price, over the past 20 days. |  [optional] |
|**sma200** | **BigDecimal** | The simple moving average, i.e., the arithmetic average share price, over the past 200 days. |  [optional] |
|**sma50** | **BigDecimal** | The simple moving average, i.e., the arithmetic average share price, over the past 50 days. |  [optional] |
|**sortinoRatio10y** | **BigDecimal** | The 10-Year Sortino Ratio measures the risk-adjusted return of an investment over the past ten years, focusing specifically on downside risk rather than total risk. It is calculated as the annualized result of the average monthly excess return divided by its downside deviation (accounts for negative excess return) over the past ten years. The monthly excess return is the monthly investment return minus the monthly risk-free rate (typically the 10-year Treasury Constant Maturity Rate). If the risk-free rate for a specific region is not available, U.S. data is used by default. |  [optional] |
|**sortinoRatio1y** | **BigDecimal** | The 1-Year Sortino Ratio measures the risk-adjusted return of an investment over the past year, focusing specifically on downside risk rather than total risk. It is calculated as the annualized result of the average monthly excess return divided by its downside deviation (accounts for negative excess return) over the past year. The monthly excess return is the monthly investment return minus the monthly risk-free rate (typically the 10-year Treasury Constant Maturity Rate). If the risk-free rate for a specific region is not available, U.S. data is used by default. |  [optional] |
|**sortinoRatio3y** | **BigDecimal** | The 3-Year Sortino Ratio measures the risk-adjusted return of an investment over the past three years, focusing specifically on downside risk rather than total risk. It is calculated as the annualized result of the average monthly excess return divided by its downside deviation (accounts for negative excess return) over the past three years. The monthly excess return is the monthly investment return minus the monthly risk-free rate (typically the 10-year Treasury Constant Maturity Rate). If the risk-free rate for a specific region is not available, U.S. data is used by default. |  [optional] |
|**sortinoRatio5y** | **BigDecimal** | The 5-Year Sortino Ratio measures the risk-adjusted return of an investment over the past five years, focusing specifically on downside risk rather than total risk. It is calculated as the annualized result of the average monthly excess return divided by its downside deviation (accounts for negative excess return) over the past five years. The monthly excess return is the monthly investment return minus the monthly risk-free rate (typically the 10-year Treasury Constant Maturity Rate). If the risk-free rate for a specific region is not available, U.S. data is used by default. |  [optional] |
|**volatility** | **BigDecimal** | The annualized volatility of the stock over the past year |  [optional] |
|**volatility10y** | **BigDecimal** |  |  [optional] |
|**volatility1m** | **BigDecimal** | The stock&#39;s daily volatility over the past month. |  [optional] |
|**volatility1w** | **BigDecimal** | The stock&#39;s daily volatility over the past week. |  [optional] |
|**volatility3y** | **BigDecimal** |  |  [optional] |
|**volatility5y** | **BigDecimal** |  |  [optional] |
|**volume** | **BigDecimal** | The average daily trading volume of a security over the last two months. |  [optional] |
|**volume3m** | **BigDecimal** | The average daily trading volume of a security over the last three months. |  [optional] |
|**volumeTotal** | **BigDecimal** | The sum of average daily trading volume for all securities of the company over the last two months. |  [optional] |
|**volumeTotal3m** | **BigDecimal** | The sum of average daily trading volume for all securities of the company over the last three months. |  [optional] |
|**volumnDay** | **BigDecimal** | The daily trading volume of a security. |  [optional] |
|**volumnDayTotal** | **BigDecimal** | The sum of daily trading volume for all securities of the company. |  [optional] |



