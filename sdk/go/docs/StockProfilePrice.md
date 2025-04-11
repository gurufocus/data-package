# StockProfilePrice

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Beta** | Pointer to **float32** | Beta measures the volatility or systematic risk of a security in comparison to the market. It is calculated using the latest three years of monthly returns of the stock and the benchmark.&lt;br&gt;- A beta of 1 indicates that the stock&#39;s price will move with the market. &lt;br&gt;- A beta of less than 1 indicates that the stock will be less volatile than the market. &lt;br&gt;- A beta greater than 1 indicates that the stock&#39;s price will be more volatile than the market. | [optional] 
**DeathCrossEma20Vs200** | Pointer to **string** | A death cross (EMA 20 vs 200) occurs when a stock&#39;s 20-day exponential moving average crosses from above to below its 200-day exponential moving average at some point in the past week. | [optional] 
**DeathCrossEma20Vs50** | Pointer to **string** | A death cross (EMA 20 vs 50) occurs when a stock&#39;s 20-day exponential moving average crosses from above to below its 50-day exponential moving average at some point in the past week. | [optional] 
**DeathCrossEma50Vs200** | Pointer to **string** | A death cross (EMA 50 vs 200) occurs when a stock&#39;s 50-day exponential moving average crosses from above to below its 200-day exponential moving average at some point in the past week. | [optional] 
**DeathCrossSma20Vs200** | Pointer to **string** | A death cross occurs when a stock&#39;s 20-day moving average crosses from above to below its 200-day moving average at some point in the past week. | [optional] 
**DeathCrossSma20Vs50** | Pointer to **string** | A death cross occurs when a stock&#39;s 20-day moving average crosses from above to below its 50-day moving average at some point in the past week. | [optional] 
**DeathCrossSma50Vs200** | Pointer to **string** | A death cross occurs when a stock&#39;s 50-day moving average crosses from above to below its 200-day moving average at some point in the past week. | [optional] 
**DisplayTimestamp** | Pointer to **string** |  | [optional] 
**Ema20** | Pointer to **float32** | The exponential moving average, i.e., the exponential smoothing average share price, over the past 20 days. | [optional] 
**Ema200** | Pointer to **float32** | The exponential moving average, i.e., the exponential smoothing average share price, over the past 200 days. | [optional] 
**Ema50** | Pointer to **float32** | The exponential moving average, i.e., the exponential smoothing average share price, over the past 50 days. | [optional] 
**Float** | Pointer to **float32** | The actual number of company shares available for trading | [optional] 
**GoldenCrossEma20Vs200** | Pointer to **string** | A golden cross (EMA 20 vs 200) occurs when a stock&#39;s 20-day exponential moving average crosses above its 200-day exponential moving average at some point in the past week. | [optional] 
**GoldenCrossEma20Vs50** | Pointer to **string** | A golden cross (EMA 20 vs 50) occurs when a stock&#39;s 20-day exponential moving average crosses above its 50-day exponential moving average at some point in the past week. | [optional] 
**GoldenCrossEma50Vs200** | Pointer to **string** | A golden cross (EMA 50 vs 200) occurs when a stock&#39;s 50-day exponential moving average crosses above its 200-day exponential moving average at some point in the past week. | [optional] 
**GoldenCrossSma20Vs200** | Pointer to **string** | A golden cross occurs when a stock&#39;s 20-day moving average crosses above its 200-day moving average at some point in the past week. | [optional] 
**GoldenCrossSma20Vs50** | Pointer to **string** | A golden cross occurs when a stock&#39;s 20-day moving average crosses above its 50-day moving average at some point in the past week. | [optional] 
**GoldenCrossSma50Vs200** | Pointer to **string** | A golden cross occurs when a stock&#39;s 50-day moving average crosses above its 200-day moving average at some point in the past week. | [optional] 
**High** | Pointer to **float32** | The company&#39;s intraday high share price | [optional] 
**Low** | Pointer to **float32** | The company&#39;s intraday low share price | [optional] 
**MacdDeathCrossSignal** | Pointer to **string** | MACD Crossed Below Signal indicates that the macd line crossed below the signal line at some point in the past week. | [optional] 
**MacdGoldenCrossSignal** | Pointer to **string** | MACD Crossed Above Signal indicates that the macd line crossed above the signal line at some point in the past week. | [optional] 
**MacdLine** | Pointer to **float32** | An MACD Line is created by subtracting the 26-period EMA from the 12-period EMA.  | [optional] 
**MacdSignalLine** | Pointer to **float32** | An MACD Signal Line is a nine-day EMA of the MACD line. | [optional] 
**Open** | Pointer to **float32** | The company&#39;s share price at market open | [optional] 
**PPctChange** | Pointer to **float32** | The percent change of a company&#39;s share price based on the previous close. | [optional] 
**PchangeSP10y** | Pointer to **float32** | The annulized total return of the stock over the past ten years, relative to the S&amp;P 500. | [optional] 
**PchangeSP12w** | Pointer to **float32** | The total return of the stock over the past three months, relative to the S&amp;P 500 | [optional] 
**PchangeSP15y** | Pointer to **float32** | The annulized total return of the stock over the past 15 years, relative to the S&amp;P 500. | [optional] 
**PchangeSP1w** | Pointer to **float32** | The total return of the stock over the past week, relative to the S&amp;P 500 | [optional] 
**PchangeSP20y** | Pointer to **float32** | The annulized total return of the stock over the past 20 years, relative to the S&amp;P 500. | [optional] 
**PchangeSP24w** | Pointer to **float32** | The total return of the stock over the past six months, relative to the S&amp;P 500 | [optional] 
**PchangeSP3y** | Pointer to **float32** | The annulized total return of the stock over the past three years, relative to the S&amp;P 500. | [optional] 
**PchangeSP4w** | Pointer to **float32** | The total return of the stock over the past month, relative to the S&amp;P 500 | [optional] 
**PchangeSP52w** | Pointer to **float32** | The total return of the stock over the past 12 months, relative to the S&amp;P 500 | [optional] 
**PchangeSP5y** | Pointer to **float32** | The annulized total return of the stock over the past five years, relative to the S&amp;P 500. | [optional] 
**PchangeSPYtd** | Pointer to **float32** | The total return of the stock year to date, relative to the S&amp;P 500 | [optional] 
**Pchange10y** | Pointer to **float32** | The total return of the stock on a 10-year, annualized basis | [optional] 
**Pchange121m** | Pointer to **float32** | The total return of the stock from 12-month ago to 1-month ago. | [optional] 
**Pchange12w** | Pointer to **float32** | The total return of the stock over the past three months | [optional] 
**Pchange15y** | Pointer to **float32** | The annulized total return of the stock over the past 15 years. | [optional] 
**Pchange1w** | Pointer to **float32** | The total return of the stock over the past week | [optional] 
**Pchange20y** | Pointer to **float32** | The annulized total return of the stock over the past 20 years. | [optional] 
**Pchange24w** | Pointer to **float32** | The total return of the stock over the past six months | [optional] 
**Pchange31m** | Pointer to **float32** | The total return of the stock from 3-month ago to 1-month ago. | [optional] 
**Pchange3y** | Pointer to **float32** | The total return of the stock on a three-year, annualized basis | [optional] 
**Pchange4w** | Pointer to **float32** | The total return of the stock over the past month | [optional] 
**Pchange52w** | Pointer to **float32** | The total return of the stock over the past 12 months | [optional] 
**Pchange5y** | Pointer to **float32** | The total return of the stock on a five-year, annualized basis | [optional] 
**Pchange61m** | Pointer to **float32** | The total return of the stock from 6-month ago to 1-month ago. | [optional] 
**PchangeYtd** | Pointer to **float32** | The total return of the stock year to date | [optional] 
**Price** | Pointer to **float32** | The current share price of the stock | [optional] 
**Price10yhigh** | Pointer to **float32** | The highest share price over the past 10 years | [optional] 
**Price10ylow** | Pointer to **float32** | The lowest share price over the past 10 years | [optional] 
**Price3yhigh** | Pointer to **float32** | The highest share price over the past three years | [optional] 
**Price3ylow** | Pointer to **float32** | The lowest share price over the past three years | [optional] 
**Price52whigh** | Pointer to **float32** | The highest share price over the past 52 weeks | [optional] 
**Price52wlow** | Pointer to **float32** | The lowest share price over the past 52 weeks | [optional] 
**Price5yhigh** | Pointer to **float32** | The highest share price over the past five years | [optional] 
**Price5ylow** | Pointer to **float32** | The lowest share price over the past five years | [optional] 
**PriceStdv20** | Pointer to **float32** |  | [optional] 
**PriceStdv200** | Pointer to **float32** |  | [optional] 
**PriceStdv50** | Pointer to **float32** |  | [optional] 
**Pricehishigh** | Pointer to **float32** |  | [optional] 
**Pricehislow** | Pointer to **float32** |  | [optional] 
**Priceindex6m** | Pointer to **float32** | The six-month price index: Current Share Price divided by Share Price Six Months Ago | [optional] 
**Rsi14** | Pointer to **float32** | The relative strength index, i.e., a value that closely captures the average gain on up days divided by the average loss non down days, over the past 14 days | [optional] 
**Rsi30** | Pointer to **float32** |  | [optional] 
**Rsi5** | Pointer to **float32** |  | [optional] 
**Rsi9** | Pointer to **float32** |  | [optional] 
**SharpeRatio** | Pointer to **float32** | The 1-Year Sharpe Ratio measures the risk-adjusted return of an investment over the past year. It is calculated as the annualized result of the average monthly excess return divided by its standard deviation over the past year. The monthly excess return is the monthly investment return minus the monthly risk-free rate (typically the 10-year Treasury Constant Maturity Rate). If the risk-free rate for a specific region is not available, U.S. data is used by default. | [optional] 
**SharpeRatio10y** | Pointer to **float32** | The 10-Year Sharpe Ratio measures the risk-adjusted return of an investment over the past ten years. It is calculated as the annualized result of the average monthly excess return divided by its standard deviation over the past ten years. The monthly excess return is the monthly investment return minus the monthly risk-free rate (typically the 10-year Treasury Constant Maturity Rate). If the risk-free rate for a specific region is not available, U.S. data is used by default. | [optional] 
**SharpeRatio3y** | Pointer to **float32** | The 3-Year Sharpe Ratio measures the risk-adjusted return of an investment over the past three years. It is calculated as the annualized result of the average monthly excess return divided by its standard deviation over the past three years. The monthly excess return is the monthly investment return minus the monthly risk-free rate (typically the 10-year Treasury Constant Maturity Rate). If the risk-free rate for a specific region is not available, U.S. data is used by default. | [optional] 
**SharpeRatio5y** | Pointer to **float32** | The 5-Year Sharpe Ratio measures the risk-adjusted return of an investment over the past five years. It is calculated as the annualized result of the average monthly excess return divided by its standard deviation over the past five years. The monthly excess return is the monthly investment return minus the monthly risk-free rate (typically the 10-year Treasury Constant Maturity Rate). If the risk-free rate for a specific region is not available, U.S. data is used by default. | [optional] 
**Sma20** | Pointer to **float32** | The simple moving average, i.e., the arithmetic average share price, over the past 20 days. | [optional] 
**Sma200** | Pointer to **float32** | The simple moving average, i.e., the arithmetic average share price, over the past 200 days. | [optional] 
**Sma50** | Pointer to **float32** | The simple moving average, i.e., the arithmetic average share price, over the past 50 days. | [optional] 
**SortinoRatio10y** | Pointer to **float32** | The 10-Year Sortino Ratio measures the risk-adjusted return of an investment over the past ten years, focusing specifically on downside risk rather than total risk. It is calculated as the annualized result of the average monthly excess return divided by its downside deviation (accounts for negative excess return) over the past ten years. The monthly excess return is the monthly investment return minus the monthly risk-free rate (typically the 10-year Treasury Constant Maturity Rate). If the risk-free rate for a specific region is not available, U.S. data is used by default. | [optional] 
**SortinoRatio1y** | Pointer to **float32** | The 1-Year Sortino Ratio measures the risk-adjusted return of an investment over the past year, focusing specifically on downside risk rather than total risk. It is calculated as the annualized result of the average monthly excess return divided by its downside deviation (accounts for negative excess return) over the past year. The monthly excess return is the monthly investment return minus the monthly risk-free rate (typically the 10-year Treasury Constant Maturity Rate). If the risk-free rate for a specific region is not available, U.S. data is used by default. | [optional] 
**SortinoRatio3y** | Pointer to **float32** | The 3-Year Sortino Ratio measures the risk-adjusted return of an investment over the past three years, focusing specifically on downside risk rather than total risk. It is calculated as the annualized result of the average monthly excess return divided by its downside deviation (accounts for negative excess return) over the past three years. The monthly excess return is the monthly investment return minus the monthly risk-free rate (typically the 10-year Treasury Constant Maturity Rate). If the risk-free rate for a specific region is not available, U.S. data is used by default. | [optional] 
**SortinoRatio5y** | Pointer to **float32** | The 5-Year Sortino Ratio measures the risk-adjusted return of an investment over the past five years, focusing specifically on downside risk rather than total risk. It is calculated as the annualized result of the average monthly excess return divided by its downside deviation (accounts for negative excess return) over the past five years. The monthly excess return is the monthly investment return minus the monthly risk-free rate (typically the 10-year Treasury Constant Maturity Rate). If the risk-free rate for a specific region is not available, U.S. data is used by default. | [optional] 
**Volatility** | Pointer to **float32** | The annualized volatility of the stock over the past year | [optional] 
**Volatility10y** | Pointer to **float32** |  | [optional] 
**Volatility1m** | Pointer to **float32** | The stock&#39;s daily volatility over the past month. | [optional] 
**Volatility1w** | Pointer to **float32** | The stock&#39;s daily volatility over the past week. | [optional] 
**Volatility3y** | Pointer to **float32** |  | [optional] 
**Volatility5y** | Pointer to **float32** |  | [optional] 
**Volume** | Pointer to **float32** | The average daily trading volume of a security over the last two months. | [optional] 
**Volume3m** | Pointer to **float32** | The average daily trading volume of a security over the last three months. | [optional] 
**VolumeTotal** | Pointer to **float32** | The sum of average daily trading volume for all securities of the company over the last two months. | [optional] 
**VolumeTotal3m** | Pointer to **float32** | The sum of average daily trading volume for all securities of the company over the last three months. | [optional] 
**VolumnDay** | Pointer to **float32** | The daily trading volume of a security. | [optional] 
**VolumnDayTotal** | Pointer to **float32** | The sum of daily trading volume for all securities of the company. | [optional] 

## Methods

### NewStockProfilePrice

`func NewStockProfilePrice() *StockProfilePrice`

NewStockProfilePrice instantiates a new StockProfilePrice object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStockProfilePriceWithDefaults

`func NewStockProfilePriceWithDefaults() *StockProfilePrice`

NewStockProfilePriceWithDefaults instantiates a new StockProfilePrice object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBeta

`func (o *StockProfilePrice) GetBeta() float32`

GetBeta returns the Beta field if non-nil, zero value otherwise.

### GetBetaOk

`func (o *StockProfilePrice) GetBetaOk() (*float32, bool)`

GetBetaOk returns a tuple with the Beta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBeta

`func (o *StockProfilePrice) SetBeta(v float32)`

SetBeta sets Beta field to given value.

### HasBeta

`func (o *StockProfilePrice) HasBeta() bool`

HasBeta returns a boolean if a field has been set.

### GetDeathCrossEma20Vs200

`func (o *StockProfilePrice) GetDeathCrossEma20Vs200() string`

GetDeathCrossEma20Vs200 returns the DeathCrossEma20Vs200 field if non-nil, zero value otherwise.

### GetDeathCrossEma20Vs200Ok

`func (o *StockProfilePrice) GetDeathCrossEma20Vs200Ok() (*string, bool)`

GetDeathCrossEma20Vs200Ok returns a tuple with the DeathCrossEma20Vs200 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeathCrossEma20Vs200

`func (o *StockProfilePrice) SetDeathCrossEma20Vs200(v string)`

SetDeathCrossEma20Vs200 sets DeathCrossEma20Vs200 field to given value.

### HasDeathCrossEma20Vs200

`func (o *StockProfilePrice) HasDeathCrossEma20Vs200() bool`

HasDeathCrossEma20Vs200 returns a boolean if a field has been set.

### GetDeathCrossEma20Vs50

`func (o *StockProfilePrice) GetDeathCrossEma20Vs50() string`

GetDeathCrossEma20Vs50 returns the DeathCrossEma20Vs50 field if non-nil, zero value otherwise.

### GetDeathCrossEma20Vs50Ok

`func (o *StockProfilePrice) GetDeathCrossEma20Vs50Ok() (*string, bool)`

GetDeathCrossEma20Vs50Ok returns a tuple with the DeathCrossEma20Vs50 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeathCrossEma20Vs50

`func (o *StockProfilePrice) SetDeathCrossEma20Vs50(v string)`

SetDeathCrossEma20Vs50 sets DeathCrossEma20Vs50 field to given value.

### HasDeathCrossEma20Vs50

`func (o *StockProfilePrice) HasDeathCrossEma20Vs50() bool`

HasDeathCrossEma20Vs50 returns a boolean if a field has been set.

### GetDeathCrossEma50Vs200

`func (o *StockProfilePrice) GetDeathCrossEma50Vs200() string`

GetDeathCrossEma50Vs200 returns the DeathCrossEma50Vs200 field if non-nil, zero value otherwise.

### GetDeathCrossEma50Vs200Ok

`func (o *StockProfilePrice) GetDeathCrossEma50Vs200Ok() (*string, bool)`

GetDeathCrossEma50Vs200Ok returns a tuple with the DeathCrossEma50Vs200 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeathCrossEma50Vs200

`func (o *StockProfilePrice) SetDeathCrossEma50Vs200(v string)`

SetDeathCrossEma50Vs200 sets DeathCrossEma50Vs200 field to given value.

### HasDeathCrossEma50Vs200

`func (o *StockProfilePrice) HasDeathCrossEma50Vs200() bool`

HasDeathCrossEma50Vs200 returns a boolean if a field has been set.

### GetDeathCrossSma20Vs200

`func (o *StockProfilePrice) GetDeathCrossSma20Vs200() string`

GetDeathCrossSma20Vs200 returns the DeathCrossSma20Vs200 field if non-nil, zero value otherwise.

### GetDeathCrossSma20Vs200Ok

`func (o *StockProfilePrice) GetDeathCrossSma20Vs200Ok() (*string, bool)`

GetDeathCrossSma20Vs200Ok returns a tuple with the DeathCrossSma20Vs200 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeathCrossSma20Vs200

`func (o *StockProfilePrice) SetDeathCrossSma20Vs200(v string)`

SetDeathCrossSma20Vs200 sets DeathCrossSma20Vs200 field to given value.

### HasDeathCrossSma20Vs200

`func (o *StockProfilePrice) HasDeathCrossSma20Vs200() bool`

HasDeathCrossSma20Vs200 returns a boolean if a field has been set.

### GetDeathCrossSma20Vs50

`func (o *StockProfilePrice) GetDeathCrossSma20Vs50() string`

GetDeathCrossSma20Vs50 returns the DeathCrossSma20Vs50 field if non-nil, zero value otherwise.

### GetDeathCrossSma20Vs50Ok

`func (o *StockProfilePrice) GetDeathCrossSma20Vs50Ok() (*string, bool)`

GetDeathCrossSma20Vs50Ok returns a tuple with the DeathCrossSma20Vs50 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeathCrossSma20Vs50

`func (o *StockProfilePrice) SetDeathCrossSma20Vs50(v string)`

SetDeathCrossSma20Vs50 sets DeathCrossSma20Vs50 field to given value.

### HasDeathCrossSma20Vs50

`func (o *StockProfilePrice) HasDeathCrossSma20Vs50() bool`

HasDeathCrossSma20Vs50 returns a boolean if a field has been set.

### GetDeathCrossSma50Vs200

`func (o *StockProfilePrice) GetDeathCrossSma50Vs200() string`

GetDeathCrossSma50Vs200 returns the DeathCrossSma50Vs200 field if non-nil, zero value otherwise.

### GetDeathCrossSma50Vs200Ok

`func (o *StockProfilePrice) GetDeathCrossSma50Vs200Ok() (*string, bool)`

GetDeathCrossSma50Vs200Ok returns a tuple with the DeathCrossSma50Vs200 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeathCrossSma50Vs200

`func (o *StockProfilePrice) SetDeathCrossSma50Vs200(v string)`

SetDeathCrossSma50Vs200 sets DeathCrossSma50Vs200 field to given value.

### HasDeathCrossSma50Vs200

`func (o *StockProfilePrice) HasDeathCrossSma50Vs200() bool`

HasDeathCrossSma50Vs200 returns a boolean if a field has been set.

### GetDisplayTimestamp

`func (o *StockProfilePrice) GetDisplayTimestamp() string`

GetDisplayTimestamp returns the DisplayTimestamp field if non-nil, zero value otherwise.

### GetDisplayTimestampOk

`func (o *StockProfilePrice) GetDisplayTimestampOk() (*string, bool)`

GetDisplayTimestampOk returns a tuple with the DisplayTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayTimestamp

`func (o *StockProfilePrice) SetDisplayTimestamp(v string)`

SetDisplayTimestamp sets DisplayTimestamp field to given value.

### HasDisplayTimestamp

`func (o *StockProfilePrice) HasDisplayTimestamp() bool`

HasDisplayTimestamp returns a boolean if a field has been set.

### GetEma20

`func (o *StockProfilePrice) GetEma20() float32`

GetEma20 returns the Ema20 field if non-nil, zero value otherwise.

### GetEma20Ok

`func (o *StockProfilePrice) GetEma20Ok() (*float32, bool)`

GetEma20Ok returns a tuple with the Ema20 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEma20

`func (o *StockProfilePrice) SetEma20(v float32)`

SetEma20 sets Ema20 field to given value.

### HasEma20

`func (o *StockProfilePrice) HasEma20() bool`

HasEma20 returns a boolean if a field has been set.

### GetEma200

`func (o *StockProfilePrice) GetEma200() float32`

GetEma200 returns the Ema200 field if non-nil, zero value otherwise.

### GetEma200Ok

`func (o *StockProfilePrice) GetEma200Ok() (*float32, bool)`

GetEma200Ok returns a tuple with the Ema200 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEma200

`func (o *StockProfilePrice) SetEma200(v float32)`

SetEma200 sets Ema200 field to given value.

### HasEma200

`func (o *StockProfilePrice) HasEma200() bool`

HasEma200 returns a boolean if a field has been set.

### GetEma50

`func (o *StockProfilePrice) GetEma50() float32`

GetEma50 returns the Ema50 field if non-nil, zero value otherwise.

### GetEma50Ok

`func (o *StockProfilePrice) GetEma50Ok() (*float32, bool)`

GetEma50Ok returns a tuple with the Ema50 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEma50

`func (o *StockProfilePrice) SetEma50(v float32)`

SetEma50 sets Ema50 field to given value.

### HasEma50

`func (o *StockProfilePrice) HasEma50() bool`

HasEma50 returns a boolean if a field has been set.

### GetFloat

`func (o *StockProfilePrice) GetFloat() float32`

GetFloat returns the Float field if non-nil, zero value otherwise.

### GetFloatOk

`func (o *StockProfilePrice) GetFloatOk() (*float32, bool)`

GetFloatOk returns a tuple with the Float field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFloat

`func (o *StockProfilePrice) SetFloat(v float32)`

SetFloat sets Float field to given value.

### HasFloat

`func (o *StockProfilePrice) HasFloat() bool`

HasFloat returns a boolean if a field has been set.

### GetGoldenCrossEma20Vs200

`func (o *StockProfilePrice) GetGoldenCrossEma20Vs200() string`

GetGoldenCrossEma20Vs200 returns the GoldenCrossEma20Vs200 field if non-nil, zero value otherwise.

### GetGoldenCrossEma20Vs200Ok

`func (o *StockProfilePrice) GetGoldenCrossEma20Vs200Ok() (*string, bool)`

GetGoldenCrossEma20Vs200Ok returns a tuple with the GoldenCrossEma20Vs200 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGoldenCrossEma20Vs200

`func (o *StockProfilePrice) SetGoldenCrossEma20Vs200(v string)`

SetGoldenCrossEma20Vs200 sets GoldenCrossEma20Vs200 field to given value.

### HasGoldenCrossEma20Vs200

`func (o *StockProfilePrice) HasGoldenCrossEma20Vs200() bool`

HasGoldenCrossEma20Vs200 returns a boolean if a field has been set.

### GetGoldenCrossEma20Vs50

`func (o *StockProfilePrice) GetGoldenCrossEma20Vs50() string`

GetGoldenCrossEma20Vs50 returns the GoldenCrossEma20Vs50 field if non-nil, zero value otherwise.

### GetGoldenCrossEma20Vs50Ok

`func (o *StockProfilePrice) GetGoldenCrossEma20Vs50Ok() (*string, bool)`

GetGoldenCrossEma20Vs50Ok returns a tuple with the GoldenCrossEma20Vs50 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGoldenCrossEma20Vs50

`func (o *StockProfilePrice) SetGoldenCrossEma20Vs50(v string)`

SetGoldenCrossEma20Vs50 sets GoldenCrossEma20Vs50 field to given value.

### HasGoldenCrossEma20Vs50

`func (o *StockProfilePrice) HasGoldenCrossEma20Vs50() bool`

HasGoldenCrossEma20Vs50 returns a boolean if a field has been set.

### GetGoldenCrossEma50Vs200

`func (o *StockProfilePrice) GetGoldenCrossEma50Vs200() string`

GetGoldenCrossEma50Vs200 returns the GoldenCrossEma50Vs200 field if non-nil, zero value otherwise.

### GetGoldenCrossEma50Vs200Ok

`func (o *StockProfilePrice) GetGoldenCrossEma50Vs200Ok() (*string, bool)`

GetGoldenCrossEma50Vs200Ok returns a tuple with the GoldenCrossEma50Vs200 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGoldenCrossEma50Vs200

`func (o *StockProfilePrice) SetGoldenCrossEma50Vs200(v string)`

SetGoldenCrossEma50Vs200 sets GoldenCrossEma50Vs200 field to given value.

### HasGoldenCrossEma50Vs200

`func (o *StockProfilePrice) HasGoldenCrossEma50Vs200() bool`

HasGoldenCrossEma50Vs200 returns a boolean if a field has been set.

### GetGoldenCrossSma20Vs200

`func (o *StockProfilePrice) GetGoldenCrossSma20Vs200() string`

GetGoldenCrossSma20Vs200 returns the GoldenCrossSma20Vs200 field if non-nil, zero value otherwise.

### GetGoldenCrossSma20Vs200Ok

`func (o *StockProfilePrice) GetGoldenCrossSma20Vs200Ok() (*string, bool)`

GetGoldenCrossSma20Vs200Ok returns a tuple with the GoldenCrossSma20Vs200 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGoldenCrossSma20Vs200

`func (o *StockProfilePrice) SetGoldenCrossSma20Vs200(v string)`

SetGoldenCrossSma20Vs200 sets GoldenCrossSma20Vs200 field to given value.

### HasGoldenCrossSma20Vs200

`func (o *StockProfilePrice) HasGoldenCrossSma20Vs200() bool`

HasGoldenCrossSma20Vs200 returns a boolean if a field has been set.

### GetGoldenCrossSma20Vs50

`func (o *StockProfilePrice) GetGoldenCrossSma20Vs50() string`

GetGoldenCrossSma20Vs50 returns the GoldenCrossSma20Vs50 field if non-nil, zero value otherwise.

### GetGoldenCrossSma20Vs50Ok

`func (o *StockProfilePrice) GetGoldenCrossSma20Vs50Ok() (*string, bool)`

GetGoldenCrossSma20Vs50Ok returns a tuple with the GoldenCrossSma20Vs50 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGoldenCrossSma20Vs50

`func (o *StockProfilePrice) SetGoldenCrossSma20Vs50(v string)`

SetGoldenCrossSma20Vs50 sets GoldenCrossSma20Vs50 field to given value.

### HasGoldenCrossSma20Vs50

`func (o *StockProfilePrice) HasGoldenCrossSma20Vs50() bool`

HasGoldenCrossSma20Vs50 returns a boolean if a field has been set.

### GetGoldenCrossSma50Vs200

`func (o *StockProfilePrice) GetGoldenCrossSma50Vs200() string`

GetGoldenCrossSma50Vs200 returns the GoldenCrossSma50Vs200 field if non-nil, zero value otherwise.

### GetGoldenCrossSma50Vs200Ok

`func (o *StockProfilePrice) GetGoldenCrossSma50Vs200Ok() (*string, bool)`

GetGoldenCrossSma50Vs200Ok returns a tuple with the GoldenCrossSma50Vs200 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGoldenCrossSma50Vs200

`func (o *StockProfilePrice) SetGoldenCrossSma50Vs200(v string)`

SetGoldenCrossSma50Vs200 sets GoldenCrossSma50Vs200 field to given value.

### HasGoldenCrossSma50Vs200

`func (o *StockProfilePrice) HasGoldenCrossSma50Vs200() bool`

HasGoldenCrossSma50Vs200 returns a boolean if a field has been set.

### GetHigh

`func (o *StockProfilePrice) GetHigh() float32`

GetHigh returns the High field if non-nil, zero value otherwise.

### GetHighOk

`func (o *StockProfilePrice) GetHighOk() (*float32, bool)`

GetHighOk returns a tuple with the High field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHigh

`func (o *StockProfilePrice) SetHigh(v float32)`

SetHigh sets High field to given value.

### HasHigh

`func (o *StockProfilePrice) HasHigh() bool`

HasHigh returns a boolean if a field has been set.

### GetLow

`func (o *StockProfilePrice) GetLow() float32`

GetLow returns the Low field if non-nil, zero value otherwise.

### GetLowOk

`func (o *StockProfilePrice) GetLowOk() (*float32, bool)`

GetLowOk returns a tuple with the Low field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLow

`func (o *StockProfilePrice) SetLow(v float32)`

SetLow sets Low field to given value.

### HasLow

`func (o *StockProfilePrice) HasLow() bool`

HasLow returns a boolean if a field has been set.

### GetMacdDeathCrossSignal

`func (o *StockProfilePrice) GetMacdDeathCrossSignal() string`

GetMacdDeathCrossSignal returns the MacdDeathCrossSignal field if non-nil, zero value otherwise.

### GetMacdDeathCrossSignalOk

`func (o *StockProfilePrice) GetMacdDeathCrossSignalOk() (*string, bool)`

GetMacdDeathCrossSignalOk returns a tuple with the MacdDeathCrossSignal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMacdDeathCrossSignal

`func (o *StockProfilePrice) SetMacdDeathCrossSignal(v string)`

SetMacdDeathCrossSignal sets MacdDeathCrossSignal field to given value.

### HasMacdDeathCrossSignal

`func (o *StockProfilePrice) HasMacdDeathCrossSignal() bool`

HasMacdDeathCrossSignal returns a boolean if a field has been set.

### GetMacdGoldenCrossSignal

`func (o *StockProfilePrice) GetMacdGoldenCrossSignal() string`

GetMacdGoldenCrossSignal returns the MacdGoldenCrossSignal field if non-nil, zero value otherwise.

### GetMacdGoldenCrossSignalOk

`func (o *StockProfilePrice) GetMacdGoldenCrossSignalOk() (*string, bool)`

GetMacdGoldenCrossSignalOk returns a tuple with the MacdGoldenCrossSignal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMacdGoldenCrossSignal

`func (o *StockProfilePrice) SetMacdGoldenCrossSignal(v string)`

SetMacdGoldenCrossSignal sets MacdGoldenCrossSignal field to given value.

### HasMacdGoldenCrossSignal

`func (o *StockProfilePrice) HasMacdGoldenCrossSignal() bool`

HasMacdGoldenCrossSignal returns a boolean if a field has been set.

### GetMacdLine

`func (o *StockProfilePrice) GetMacdLine() float32`

GetMacdLine returns the MacdLine field if non-nil, zero value otherwise.

### GetMacdLineOk

`func (o *StockProfilePrice) GetMacdLineOk() (*float32, bool)`

GetMacdLineOk returns a tuple with the MacdLine field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMacdLine

`func (o *StockProfilePrice) SetMacdLine(v float32)`

SetMacdLine sets MacdLine field to given value.

### HasMacdLine

`func (o *StockProfilePrice) HasMacdLine() bool`

HasMacdLine returns a boolean if a field has been set.

### GetMacdSignalLine

`func (o *StockProfilePrice) GetMacdSignalLine() float32`

GetMacdSignalLine returns the MacdSignalLine field if non-nil, zero value otherwise.

### GetMacdSignalLineOk

`func (o *StockProfilePrice) GetMacdSignalLineOk() (*float32, bool)`

GetMacdSignalLineOk returns a tuple with the MacdSignalLine field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMacdSignalLine

`func (o *StockProfilePrice) SetMacdSignalLine(v float32)`

SetMacdSignalLine sets MacdSignalLine field to given value.

### HasMacdSignalLine

`func (o *StockProfilePrice) HasMacdSignalLine() bool`

HasMacdSignalLine returns a boolean if a field has been set.

### GetOpen

`func (o *StockProfilePrice) GetOpen() float32`

GetOpen returns the Open field if non-nil, zero value otherwise.

### GetOpenOk

`func (o *StockProfilePrice) GetOpenOk() (*float32, bool)`

GetOpenOk returns a tuple with the Open field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOpen

`func (o *StockProfilePrice) SetOpen(v float32)`

SetOpen sets Open field to given value.

### HasOpen

`func (o *StockProfilePrice) HasOpen() bool`

HasOpen returns a boolean if a field has been set.

### GetPPctChange

`func (o *StockProfilePrice) GetPPctChange() float32`

GetPPctChange returns the PPctChange field if non-nil, zero value otherwise.

### GetPPctChangeOk

`func (o *StockProfilePrice) GetPPctChangeOk() (*float32, bool)`

GetPPctChangeOk returns a tuple with the PPctChange field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPPctChange

`func (o *StockProfilePrice) SetPPctChange(v float32)`

SetPPctChange sets PPctChange field to given value.

### HasPPctChange

`func (o *StockProfilePrice) HasPPctChange() bool`

HasPPctChange returns a boolean if a field has been set.

### GetPchangeSP10y

`func (o *StockProfilePrice) GetPchangeSP10y() float32`

GetPchangeSP10y returns the PchangeSP10y field if non-nil, zero value otherwise.

### GetPchangeSP10yOk

`func (o *StockProfilePrice) GetPchangeSP10yOk() (*float32, bool)`

GetPchangeSP10yOk returns a tuple with the PchangeSP10y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchangeSP10y

`func (o *StockProfilePrice) SetPchangeSP10y(v float32)`

SetPchangeSP10y sets PchangeSP10y field to given value.

### HasPchangeSP10y

`func (o *StockProfilePrice) HasPchangeSP10y() bool`

HasPchangeSP10y returns a boolean if a field has been set.

### GetPchangeSP12w

`func (o *StockProfilePrice) GetPchangeSP12w() float32`

GetPchangeSP12w returns the PchangeSP12w field if non-nil, zero value otherwise.

### GetPchangeSP12wOk

`func (o *StockProfilePrice) GetPchangeSP12wOk() (*float32, bool)`

GetPchangeSP12wOk returns a tuple with the PchangeSP12w field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchangeSP12w

`func (o *StockProfilePrice) SetPchangeSP12w(v float32)`

SetPchangeSP12w sets PchangeSP12w field to given value.

### HasPchangeSP12w

`func (o *StockProfilePrice) HasPchangeSP12w() bool`

HasPchangeSP12w returns a boolean if a field has been set.

### GetPchangeSP15y

`func (o *StockProfilePrice) GetPchangeSP15y() float32`

GetPchangeSP15y returns the PchangeSP15y field if non-nil, zero value otherwise.

### GetPchangeSP15yOk

`func (o *StockProfilePrice) GetPchangeSP15yOk() (*float32, bool)`

GetPchangeSP15yOk returns a tuple with the PchangeSP15y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchangeSP15y

`func (o *StockProfilePrice) SetPchangeSP15y(v float32)`

SetPchangeSP15y sets PchangeSP15y field to given value.

### HasPchangeSP15y

`func (o *StockProfilePrice) HasPchangeSP15y() bool`

HasPchangeSP15y returns a boolean if a field has been set.

### GetPchangeSP1w

`func (o *StockProfilePrice) GetPchangeSP1w() float32`

GetPchangeSP1w returns the PchangeSP1w field if non-nil, zero value otherwise.

### GetPchangeSP1wOk

`func (o *StockProfilePrice) GetPchangeSP1wOk() (*float32, bool)`

GetPchangeSP1wOk returns a tuple with the PchangeSP1w field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchangeSP1w

`func (o *StockProfilePrice) SetPchangeSP1w(v float32)`

SetPchangeSP1w sets PchangeSP1w field to given value.

### HasPchangeSP1w

`func (o *StockProfilePrice) HasPchangeSP1w() bool`

HasPchangeSP1w returns a boolean if a field has been set.

### GetPchangeSP20y

`func (o *StockProfilePrice) GetPchangeSP20y() float32`

GetPchangeSP20y returns the PchangeSP20y field if non-nil, zero value otherwise.

### GetPchangeSP20yOk

`func (o *StockProfilePrice) GetPchangeSP20yOk() (*float32, bool)`

GetPchangeSP20yOk returns a tuple with the PchangeSP20y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchangeSP20y

`func (o *StockProfilePrice) SetPchangeSP20y(v float32)`

SetPchangeSP20y sets PchangeSP20y field to given value.

### HasPchangeSP20y

`func (o *StockProfilePrice) HasPchangeSP20y() bool`

HasPchangeSP20y returns a boolean if a field has been set.

### GetPchangeSP24w

`func (o *StockProfilePrice) GetPchangeSP24w() float32`

GetPchangeSP24w returns the PchangeSP24w field if non-nil, zero value otherwise.

### GetPchangeSP24wOk

`func (o *StockProfilePrice) GetPchangeSP24wOk() (*float32, bool)`

GetPchangeSP24wOk returns a tuple with the PchangeSP24w field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchangeSP24w

`func (o *StockProfilePrice) SetPchangeSP24w(v float32)`

SetPchangeSP24w sets PchangeSP24w field to given value.

### HasPchangeSP24w

`func (o *StockProfilePrice) HasPchangeSP24w() bool`

HasPchangeSP24w returns a boolean if a field has been set.

### GetPchangeSP3y

`func (o *StockProfilePrice) GetPchangeSP3y() float32`

GetPchangeSP3y returns the PchangeSP3y field if non-nil, zero value otherwise.

### GetPchangeSP3yOk

`func (o *StockProfilePrice) GetPchangeSP3yOk() (*float32, bool)`

GetPchangeSP3yOk returns a tuple with the PchangeSP3y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchangeSP3y

`func (o *StockProfilePrice) SetPchangeSP3y(v float32)`

SetPchangeSP3y sets PchangeSP3y field to given value.

### HasPchangeSP3y

`func (o *StockProfilePrice) HasPchangeSP3y() bool`

HasPchangeSP3y returns a boolean if a field has been set.

### GetPchangeSP4w

`func (o *StockProfilePrice) GetPchangeSP4w() float32`

GetPchangeSP4w returns the PchangeSP4w field if non-nil, zero value otherwise.

### GetPchangeSP4wOk

`func (o *StockProfilePrice) GetPchangeSP4wOk() (*float32, bool)`

GetPchangeSP4wOk returns a tuple with the PchangeSP4w field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchangeSP4w

`func (o *StockProfilePrice) SetPchangeSP4w(v float32)`

SetPchangeSP4w sets PchangeSP4w field to given value.

### HasPchangeSP4w

`func (o *StockProfilePrice) HasPchangeSP4w() bool`

HasPchangeSP4w returns a boolean if a field has been set.

### GetPchangeSP52w

`func (o *StockProfilePrice) GetPchangeSP52w() float32`

GetPchangeSP52w returns the PchangeSP52w field if non-nil, zero value otherwise.

### GetPchangeSP52wOk

`func (o *StockProfilePrice) GetPchangeSP52wOk() (*float32, bool)`

GetPchangeSP52wOk returns a tuple with the PchangeSP52w field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchangeSP52w

`func (o *StockProfilePrice) SetPchangeSP52w(v float32)`

SetPchangeSP52w sets PchangeSP52w field to given value.

### HasPchangeSP52w

`func (o *StockProfilePrice) HasPchangeSP52w() bool`

HasPchangeSP52w returns a boolean if a field has been set.

### GetPchangeSP5y

`func (o *StockProfilePrice) GetPchangeSP5y() float32`

GetPchangeSP5y returns the PchangeSP5y field if non-nil, zero value otherwise.

### GetPchangeSP5yOk

`func (o *StockProfilePrice) GetPchangeSP5yOk() (*float32, bool)`

GetPchangeSP5yOk returns a tuple with the PchangeSP5y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchangeSP5y

`func (o *StockProfilePrice) SetPchangeSP5y(v float32)`

SetPchangeSP5y sets PchangeSP5y field to given value.

### HasPchangeSP5y

`func (o *StockProfilePrice) HasPchangeSP5y() bool`

HasPchangeSP5y returns a boolean if a field has been set.

### GetPchangeSPYtd

`func (o *StockProfilePrice) GetPchangeSPYtd() float32`

GetPchangeSPYtd returns the PchangeSPYtd field if non-nil, zero value otherwise.

### GetPchangeSPYtdOk

`func (o *StockProfilePrice) GetPchangeSPYtdOk() (*float32, bool)`

GetPchangeSPYtdOk returns a tuple with the PchangeSPYtd field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchangeSPYtd

`func (o *StockProfilePrice) SetPchangeSPYtd(v float32)`

SetPchangeSPYtd sets PchangeSPYtd field to given value.

### HasPchangeSPYtd

`func (o *StockProfilePrice) HasPchangeSPYtd() bool`

HasPchangeSPYtd returns a boolean if a field has been set.

### GetPchange10y

`func (o *StockProfilePrice) GetPchange10y() float32`

GetPchange10y returns the Pchange10y field if non-nil, zero value otherwise.

### GetPchange10yOk

`func (o *StockProfilePrice) GetPchange10yOk() (*float32, bool)`

GetPchange10yOk returns a tuple with the Pchange10y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchange10y

`func (o *StockProfilePrice) SetPchange10y(v float32)`

SetPchange10y sets Pchange10y field to given value.

### HasPchange10y

`func (o *StockProfilePrice) HasPchange10y() bool`

HasPchange10y returns a boolean if a field has been set.

### GetPchange121m

`func (o *StockProfilePrice) GetPchange121m() float32`

GetPchange121m returns the Pchange121m field if non-nil, zero value otherwise.

### GetPchange121mOk

`func (o *StockProfilePrice) GetPchange121mOk() (*float32, bool)`

GetPchange121mOk returns a tuple with the Pchange121m field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchange121m

`func (o *StockProfilePrice) SetPchange121m(v float32)`

SetPchange121m sets Pchange121m field to given value.

### HasPchange121m

`func (o *StockProfilePrice) HasPchange121m() bool`

HasPchange121m returns a boolean if a field has been set.

### GetPchange12w

`func (o *StockProfilePrice) GetPchange12w() float32`

GetPchange12w returns the Pchange12w field if non-nil, zero value otherwise.

### GetPchange12wOk

`func (o *StockProfilePrice) GetPchange12wOk() (*float32, bool)`

GetPchange12wOk returns a tuple with the Pchange12w field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchange12w

`func (o *StockProfilePrice) SetPchange12w(v float32)`

SetPchange12w sets Pchange12w field to given value.

### HasPchange12w

`func (o *StockProfilePrice) HasPchange12w() bool`

HasPchange12w returns a boolean if a field has been set.

### GetPchange15y

`func (o *StockProfilePrice) GetPchange15y() float32`

GetPchange15y returns the Pchange15y field if non-nil, zero value otherwise.

### GetPchange15yOk

`func (o *StockProfilePrice) GetPchange15yOk() (*float32, bool)`

GetPchange15yOk returns a tuple with the Pchange15y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchange15y

`func (o *StockProfilePrice) SetPchange15y(v float32)`

SetPchange15y sets Pchange15y field to given value.

### HasPchange15y

`func (o *StockProfilePrice) HasPchange15y() bool`

HasPchange15y returns a boolean if a field has been set.

### GetPchange1w

`func (o *StockProfilePrice) GetPchange1w() float32`

GetPchange1w returns the Pchange1w field if non-nil, zero value otherwise.

### GetPchange1wOk

`func (o *StockProfilePrice) GetPchange1wOk() (*float32, bool)`

GetPchange1wOk returns a tuple with the Pchange1w field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchange1w

`func (o *StockProfilePrice) SetPchange1w(v float32)`

SetPchange1w sets Pchange1w field to given value.

### HasPchange1w

`func (o *StockProfilePrice) HasPchange1w() bool`

HasPchange1w returns a boolean if a field has been set.

### GetPchange20y

`func (o *StockProfilePrice) GetPchange20y() float32`

GetPchange20y returns the Pchange20y field if non-nil, zero value otherwise.

### GetPchange20yOk

`func (o *StockProfilePrice) GetPchange20yOk() (*float32, bool)`

GetPchange20yOk returns a tuple with the Pchange20y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchange20y

`func (o *StockProfilePrice) SetPchange20y(v float32)`

SetPchange20y sets Pchange20y field to given value.

### HasPchange20y

`func (o *StockProfilePrice) HasPchange20y() bool`

HasPchange20y returns a boolean if a field has been set.

### GetPchange24w

`func (o *StockProfilePrice) GetPchange24w() float32`

GetPchange24w returns the Pchange24w field if non-nil, zero value otherwise.

### GetPchange24wOk

`func (o *StockProfilePrice) GetPchange24wOk() (*float32, bool)`

GetPchange24wOk returns a tuple with the Pchange24w field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchange24w

`func (o *StockProfilePrice) SetPchange24w(v float32)`

SetPchange24w sets Pchange24w field to given value.

### HasPchange24w

`func (o *StockProfilePrice) HasPchange24w() bool`

HasPchange24w returns a boolean if a field has been set.

### GetPchange31m

`func (o *StockProfilePrice) GetPchange31m() float32`

GetPchange31m returns the Pchange31m field if non-nil, zero value otherwise.

### GetPchange31mOk

`func (o *StockProfilePrice) GetPchange31mOk() (*float32, bool)`

GetPchange31mOk returns a tuple with the Pchange31m field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchange31m

`func (o *StockProfilePrice) SetPchange31m(v float32)`

SetPchange31m sets Pchange31m field to given value.

### HasPchange31m

`func (o *StockProfilePrice) HasPchange31m() bool`

HasPchange31m returns a boolean if a field has been set.

### GetPchange3y

`func (o *StockProfilePrice) GetPchange3y() float32`

GetPchange3y returns the Pchange3y field if non-nil, zero value otherwise.

### GetPchange3yOk

`func (o *StockProfilePrice) GetPchange3yOk() (*float32, bool)`

GetPchange3yOk returns a tuple with the Pchange3y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchange3y

`func (o *StockProfilePrice) SetPchange3y(v float32)`

SetPchange3y sets Pchange3y field to given value.

### HasPchange3y

`func (o *StockProfilePrice) HasPchange3y() bool`

HasPchange3y returns a boolean if a field has been set.

### GetPchange4w

`func (o *StockProfilePrice) GetPchange4w() float32`

GetPchange4w returns the Pchange4w field if non-nil, zero value otherwise.

### GetPchange4wOk

`func (o *StockProfilePrice) GetPchange4wOk() (*float32, bool)`

GetPchange4wOk returns a tuple with the Pchange4w field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchange4w

`func (o *StockProfilePrice) SetPchange4w(v float32)`

SetPchange4w sets Pchange4w field to given value.

### HasPchange4w

`func (o *StockProfilePrice) HasPchange4w() bool`

HasPchange4w returns a boolean if a field has been set.

### GetPchange52w

`func (o *StockProfilePrice) GetPchange52w() float32`

GetPchange52w returns the Pchange52w field if non-nil, zero value otherwise.

### GetPchange52wOk

`func (o *StockProfilePrice) GetPchange52wOk() (*float32, bool)`

GetPchange52wOk returns a tuple with the Pchange52w field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchange52w

`func (o *StockProfilePrice) SetPchange52w(v float32)`

SetPchange52w sets Pchange52w field to given value.

### HasPchange52w

`func (o *StockProfilePrice) HasPchange52w() bool`

HasPchange52w returns a boolean if a field has been set.

### GetPchange5y

`func (o *StockProfilePrice) GetPchange5y() float32`

GetPchange5y returns the Pchange5y field if non-nil, zero value otherwise.

### GetPchange5yOk

`func (o *StockProfilePrice) GetPchange5yOk() (*float32, bool)`

GetPchange5yOk returns a tuple with the Pchange5y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchange5y

`func (o *StockProfilePrice) SetPchange5y(v float32)`

SetPchange5y sets Pchange5y field to given value.

### HasPchange5y

`func (o *StockProfilePrice) HasPchange5y() bool`

HasPchange5y returns a boolean if a field has been set.

### GetPchange61m

`func (o *StockProfilePrice) GetPchange61m() float32`

GetPchange61m returns the Pchange61m field if non-nil, zero value otherwise.

### GetPchange61mOk

`func (o *StockProfilePrice) GetPchange61mOk() (*float32, bool)`

GetPchange61mOk returns a tuple with the Pchange61m field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchange61m

`func (o *StockProfilePrice) SetPchange61m(v float32)`

SetPchange61m sets Pchange61m field to given value.

### HasPchange61m

`func (o *StockProfilePrice) HasPchange61m() bool`

HasPchange61m returns a boolean if a field has been set.

### GetPchangeYtd

`func (o *StockProfilePrice) GetPchangeYtd() float32`

GetPchangeYtd returns the PchangeYtd field if non-nil, zero value otherwise.

### GetPchangeYtdOk

`func (o *StockProfilePrice) GetPchangeYtdOk() (*float32, bool)`

GetPchangeYtdOk returns a tuple with the PchangeYtd field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPchangeYtd

`func (o *StockProfilePrice) SetPchangeYtd(v float32)`

SetPchangeYtd sets PchangeYtd field to given value.

### HasPchangeYtd

`func (o *StockProfilePrice) HasPchangeYtd() bool`

HasPchangeYtd returns a boolean if a field has been set.

### GetPrice

`func (o *StockProfilePrice) GetPrice() float32`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *StockProfilePrice) GetPriceOk() (*float32, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *StockProfilePrice) SetPrice(v float32)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *StockProfilePrice) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetPrice10yhigh

`func (o *StockProfilePrice) GetPrice10yhigh() float32`

GetPrice10yhigh returns the Price10yhigh field if non-nil, zero value otherwise.

### GetPrice10yhighOk

`func (o *StockProfilePrice) GetPrice10yhighOk() (*float32, bool)`

GetPrice10yhighOk returns a tuple with the Price10yhigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice10yhigh

`func (o *StockProfilePrice) SetPrice10yhigh(v float32)`

SetPrice10yhigh sets Price10yhigh field to given value.

### HasPrice10yhigh

`func (o *StockProfilePrice) HasPrice10yhigh() bool`

HasPrice10yhigh returns a boolean if a field has been set.

### GetPrice10ylow

`func (o *StockProfilePrice) GetPrice10ylow() float32`

GetPrice10ylow returns the Price10ylow field if non-nil, zero value otherwise.

### GetPrice10ylowOk

`func (o *StockProfilePrice) GetPrice10ylowOk() (*float32, bool)`

GetPrice10ylowOk returns a tuple with the Price10ylow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice10ylow

`func (o *StockProfilePrice) SetPrice10ylow(v float32)`

SetPrice10ylow sets Price10ylow field to given value.

### HasPrice10ylow

`func (o *StockProfilePrice) HasPrice10ylow() bool`

HasPrice10ylow returns a boolean if a field has been set.

### GetPrice3yhigh

`func (o *StockProfilePrice) GetPrice3yhigh() float32`

GetPrice3yhigh returns the Price3yhigh field if non-nil, zero value otherwise.

### GetPrice3yhighOk

`func (o *StockProfilePrice) GetPrice3yhighOk() (*float32, bool)`

GetPrice3yhighOk returns a tuple with the Price3yhigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice3yhigh

`func (o *StockProfilePrice) SetPrice3yhigh(v float32)`

SetPrice3yhigh sets Price3yhigh field to given value.

### HasPrice3yhigh

`func (o *StockProfilePrice) HasPrice3yhigh() bool`

HasPrice3yhigh returns a boolean if a field has been set.

### GetPrice3ylow

`func (o *StockProfilePrice) GetPrice3ylow() float32`

GetPrice3ylow returns the Price3ylow field if non-nil, zero value otherwise.

### GetPrice3ylowOk

`func (o *StockProfilePrice) GetPrice3ylowOk() (*float32, bool)`

GetPrice3ylowOk returns a tuple with the Price3ylow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice3ylow

`func (o *StockProfilePrice) SetPrice3ylow(v float32)`

SetPrice3ylow sets Price3ylow field to given value.

### HasPrice3ylow

`func (o *StockProfilePrice) HasPrice3ylow() bool`

HasPrice3ylow returns a boolean if a field has been set.

### GetPrice52whigh

`func (o *StockProfilePrice) GetPrice52whigh() float32`

GetPrice52whigh returns the Price52whigh field if non-nil, zero value otherwise.

### GetPrice52whighOk

`func (o *StockProfilePrice) GetPrice52whighOk() (*float32, bool)`

GetPrice52whighOk returns a tuple with the Price52whigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice52whigh

`func (o *StockProfilePrice) SetPrice52whigh(v float32)`

SetPrice52whigh sets Price52whigh field to given value.

### HasPrice52whigh

`func (o *StockProfilePrice) HasPrice52whigh() bool`

HasPrice52whigh returns a boolean if a field has been set.

### GetPrice52wlow

`func (o *StockProfilePrice) GetPrice52wlow() float32`

GetPrice52wlow returns the Price52wlow field if non-nil, zero value otherwise.

### GetPrice52wlowOk

`func (o *StockProfilePrice) GetPrice52wlowOk() (*float32, bool)`

GetPrice52wlowOk returns a tuple with the Price52wlow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice52wlow

`func (o *StockProfilePrice) SetPrice52wlow(v float32)`

SetPrice52wlow sets Price52wlow field to given value.

### HasPrice52wlow

`func (o *StockProfilePrice) HasPrice52wlow() bool`

HasPrice52wlow returns a boolean if a field has been set.

### GetPrice5yhigh

`func (o *StockProfilePrice) GetPrice5yhigh() float32`

GetPrice5yhigh returns the Price5yhigh field if non-nil, zero value otherwise.

### GetPrice5yhighOk

`func (o *StockProfilePrice) GetPrice5yhighOk() (*float32, bool)`

GetPrice5yhighOk returns a tuple with the Price5yhigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice5yhigh

`func (o *StockProfilePrice) SetPrice5yhigh(v float32)`

SetPrice5yhigh sets Price5yhigh field to given value.

### HasPrice5yhigh

`func (o *StockProfilePrice) HasPrice5yhigh() bool`

HasPrice5yhigh returns a boolean if a field has been set.

### GetPrice5ylow

`func (o *StockProfilePrice) GetPrice5ylow() float32`

GetPrice5ylow returns the Price5ylow field if non-nil, zero value otherwise.

### GetPrice5ylowOk

`func (o *StockProfilePrice) GetPrice5ylowOk() (*float32, bool)`

GetPrice5ylowOk returns a tuple with the Price5ylow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice5ylow

`func (o *StockProfilePrice) SetPrice5ylow(v float32)`

SetPrice5ylow sets Price5ylow field to given value.

### HasPrice5ylow

`func (o *StockProfilePrice) HasPrice5ylow() bool`

HasPrice5ylow returns a boolean if a field has been set.

### GetPriceStdv20

`func (o *StockProfilePrice) GetPriceStdv20() float32`

GetPriceStdv20 returns the PriceStdv20 field if non-nil, zero value otherwise.

### GetPriceStdv20Ok

`func (o *StockProfilePrice) GetPriceStdv20Ok() (*float32, bool)`

GetPriceStdv20Ok returns a tuple with the PriceStdv20 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriceStdv20

`func (o *StockProfilePrice) SetPriceStdv20(v float32)`

SetPriceStdv20 sets PriceStdv20 field to given value.

### HasPriceStdv20

`func (o *StockProfilePrice) HasPriceStdv20() bool`

HasPriceStdv20 returns a boolean if a field has been set.

### GetPriceStdv200

`func (o *StockProfilePrice) GetPriceStdv200() float32`

GetPriceStdv200 returns the PriceStdv200 field if non-nil, zero value otherwise.

### GetPriceStdv200Ok

`func (o *StockProfilePrice) GetPriceStdv200Ok() (*float32, bool)`

GetPriceStdv200Ok returns a tuple with the PriceStdv200 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriceStdv200

`func (o *StockProfilePrice) SetPriceStdv200(v float32)`

SetPriceStdv200 sets PriceStdv200 field to given value.

### HasPriceStdv200

`func (o *StockProfilePrice) HasPriceStdv200() bool`

HasPriceStdv200 returns a boolean if a field has been set.

### GetPriceStdv50

`func (o *StockProfilePrice) GetPriceStdv50() float32`

GetPriceStdv50 returns the PriceStdv50 field if non-nil, zero value otherwise.

### GetPriceStdv50Ok

`func (o *StockProfilePrice) GetPriceStdv50Ok() (*float32, bool)`

GetPriceStdv50Ok returns a tuple with the PriceStdv50 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriceStdv50

`func (o *StockProfilePrice) SetPriceStdv50(v float32)`

SetPriceStdv50 sets PriceStdv50 field to given value.

### HasPriceStdv50

`func (o *StockProfilePrice) HasPriceStdv50() bool`

HasPriceStdv50 returns a boolean if a field has been set.

### GetPricehishigh

`func (o *StockProfilePrice) GetPricehishigh() float32`

GetPricehishigh returns the Pricehishigh field if non-nil, zero value otherwise.

### GetPricehishighOk

`func (o *StockProfilePrice) GetPricehishighOk() (*float32, bool)`

GetPricehishighOk returns a tuple with the Pricehishigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPricehishigh

`func (o *StockProfilePrice) SetPricehishigh(v float32)`

SetPricehishigh sets Pricehishigh field to given value.

### HasPricehishigh

`func (o *StockProfilePrice) HasPricehishigh() bool`

HasPricehishigh returns a boolean if a field has been set.

### GetPricehislow

`func (o *StockProfilePrice) GetPricehislow() float32`

GetPricehislow returns the Pricehislow field if non-nil, zero value otherwise.

### GetPricehislowOk

`func (o *StockProfilePrice) GetPricehislowOk() (*float32, bool)`

GetPricehislowOk returns a tuple with the Pricehislow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPricehislow

`func (o *StockProfilePrice) SetPricehislow(v float32)`

SetPricehislow sets Pricehislow field to given value.

### HasPricehislow

`func (o *StockProfilePrice) HasPricehislow() bool`

HasPricehislow returns a boolean if a field has been set.

### GetPriceindex6m

`func (o *StockProfilePrice) GetPriceindex6m() float32`

GetPriceindex6m returns the Priceindex6m field if non-nil, zero value otherwise.

### GetPriceindex6mOk

`func (o *StockProfilePrice) GetPriceindex6mOk() (*float32, bool)`

GetPriceindex6mOk returns a tuple with the Priceindex6m field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriceindex6m

`func (o *StockProfilePrice) SetPriceindex6m(v float32)`

SetPriceindex6m sets Priceindex6m field to given value.

### HasPriceindex6m

`func (o *StockProfilePrice) HasPriceindex6m() bool`

HasPriceindex6m returns a boolean if a field has been set.

### GetRsi14

`func (o *StockProfilePrice) GetRsi14() float32`

GetRsi14 returns the Rsi14 field if non-nil, zero value otherwise.

### GetRsi14Ok

`func (o *StockProfilePrice) GetRsi14Ok() (*float32, bool)`

GetRsi14Ok returns a tuple with the Rsi14 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRsi14

`func (o *StockProfilePrice) SetRsi14(v float32)`

SetRsi14 sets Rsi14 field to given value.

### HasRsi14

`func (o *StockProfilePrice) HasRsi14() bool`

HasRsi14 returns a boolean if a field has been set.

### GetRsi30

`func (o *StockProfilePrice) GetRsi30() float32`

GetRsi30 returns the Rsi30 field if non-nil, zero value otherwise.

### GetRsi30Ok

`func (o *StockProfilePrice) GetRsi30Ok() (*float32, bool)`

GetRsi30Ok returns a tuple with the Rsi30 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRsi30

`func (o *StockProfilePrice) SetRsi30(v float32)`

SetRsi30 sets Rsi30 field to given value.

### HasRsi30

`func (o *StockProfilePrice) HasRsi30() bool`

HasRsi30 returns a boolean if a field has been set.

### GetRsi5

`func (o *StockProfilePrice) GetRsi5() float32`

GetRsi5 returns the Rsi5 field if non-nil, zero value otherwise.

### GetRsi5Ok

`func (o *StockProfilePrice) GetRsi5Ok() (*float32, bool)`

GetRsi5Ok returns a tuple with the Rsi5 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRsi5

`func (o *StockProfilePrice) SetRsi5(v float32)`

SetRsi5 sets Rsi5 field to given value.

### HasRsi5

`func (o *StockProfilePrice) HasRsi5() bool`

HasRsi5 returns a boolean if a field has been set.

### GetRsi9

`func (o *StockProfilePrice) GetRsi9() float32`

GetRsi9 returns the Rsi9 field if non-nil, zero value otherwise.

### GetRsi9Ok

`func (o *StockProfilePrice) GetRsi9Ok() (*float32, bool)`

GetRsi9Ok returns a tuple with the Rsi9 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRsi9

`func (o *StockProfilePrice) SetRsi9(v float32)`

SetRsi9 sets Rsi9 field to given value.

### HasRsi9

`func (o *StockProfilePrice) HasRsi9() bool`

HasRsi9 returns a boolean if a field has been set.

### GetSharpeRatio

`func (o *StockProfilePrice) GetSharpeRatio() float32`

GetSharpeRatio returns the SharpeRatio field if non-nil, zero value otherwise.

### GetSharpeRatioOk

`func (o *StockProfilePrice) GetSharpeRatioOk() (*float32, bool)`

GetSharpeRatioOk returns a tuple with the SharpeRatio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSharpeRatio

`func (o *StockProfilePrice) SetSharpeRatio(v float32)`

SetSharpeRatio sets SharpeRatio field to given value.

### HasSharpeRatio

`func (o *StockProfilePrice) HasSharpeRatio() bool`

HasSharpeRatio returns a boolean if a field has been set.

### GetSharpeRatio10y

`func (o *StockProfilePrice) GetSharpeRatio10y() float32`

GetSharpeRatio10y returns the SharpeRatio10y field if non-nil, zero value otherwise.

### GetSharpeRatio10yOk

`func (o *StockProfilePrice) GetSharpeRatio10yOk() (*float32, bool)`

GetSharpeRatio10yOk returns a tuple with the SharpeRatio10y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSharpeRatio10y

`func (o *StockProfilePrice) SetSharpeRatio10y(v float32)`

SetSharpeRatio10y sets SharpeRatio10y field to given value.

### HasSharpeRatio10y

`func (o *StockProfilePrice) HasSharpeRatio10y() bool`

HasSharpeRatio10y returns a boolean if a field has been set.

### GetSharpeRatio3y

`func (o *StockProfilePrice) GetSharpeRatio3y() float32`

GetSharpeRatio3y returns the SharpeRatio3y field if non-nil, zero value otherwise.

### GetSharpeRatio3yOk

`func (o *StockProfilePrice) GetSharpeRatio3yOk() (*float32, bool)`

GetSharpeRatio3yOk returns a tuple with the SharpeRatio3y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSharpeRatio3y

`func (o *StockProfilePrice) SetSharpeRatio3y(v float32)`

SetSharpeRatio3y sets SharpeRatio3y field to given value.

### HasSharpeRatio3y

`func (o *StockProfilePrice) HasSharpeRatio3y() bool`

HasSharpeRatio3y returns a boolean if a field has been set.

### GetSharpeRatio5y

`func (o *StockProfilePrice) GetSharpeRatio5y() float32`

GetSharpeRatio5y returns the SharpeRatio5y field if non-nil, zero value otherwise.

### GetSharpeRatio5yOk

`func (o *StockProfilePrice) GetSharpeRatio5yOk() (*float32, bool)`

GetSharpeRatio5yOk returns a tuple with the SharpeRatio5y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSharpeRatio5y

`func (o *StockProfilePrice) SetSharpeRatio5y(v float32)`

SetSharpeRatio5y sets SharpeRatio5y field to given value.

### HasSharpeRatio5y

`func (o *StockProfilePrice) HasSharpeRatio5y() bool`

HasSharpeRatio5y returns a boolean if a field has been set.

### GetSma20

`func (o *StockProfilePrice) GetSma20() float32`

GetSma20 returns the Sma20 field if non-nil, zero value otherwise.

### GetSma20Ok

`func (o *StockProfilePrice) GetSma20Ok() (*float32, bool)`

GetSma20Ok returns a tuple with the Sma20 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSma20

`func (o *StockProfilePrice) SetSma20(v float32)`

SetSma20 sets Sma20 field to given value.

### HasSma20

`func (o *StockProfilePrice) HasSma20() bool`

HasSma20 returns a boolean if a field has been set.

### GetSma200

`func (o *StockProfilePrice) GetSma200() float32`

GetSma200 returns the Sma200 field if non-nil, zero value otherwise.

### GetSma200Ok

`func (o *StockProfilePrice) GetSma200Ok() (*float32, bool)`

GetSma200Ok returns a tuple with the Sma200 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSma200

`func (o *StockProfilePrice) SetSma200(v float32)`

SetSma200 sets Sma200 field to given value.

### HasSma200

`func (o *StockProfilePrice) HasSma200() bool`

HasSma200 returns a boolean if a field has been set.

### GetSma50

`func (o *StockProfilePrice) GetSma50() float32`

GetSma50 returns the Sma50 field if non-nil, zero value otherwise.

### GetSma50Ok

`func (o *StockProfilePrice) GetSma50Ok() (*float32, bool)`

GetSma50Ok returns a tuple with the Sma50 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSma50

`func (o *StockProfilePrice) SetSma50(v float32)`

SetSma50 sets Sma50 field to given value.

### HasSma50

`func (o *StockProfilePrice) HasSma50() bool`

HasSma50 returns a boolean if a field has been set.

### GetSortinoRatio10y

`func (o *StockProfilePrice) GetSortinoRatio10y() float32`

GetSortinoRatio10y returns the SortinoRatio10y field if non-nil, zero value otherwise.

### GetSortinoRatio10yOk

`func (o *StockProfilePrice) GetSortinoRatio10yOk() (*float32, bool)`

GetSortinoRatio10yOk returns a tuple with the SortinoRatio10y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortinoRatio10y

`func (o *StockProfilePrice) SetSortinoRatio10y(v float32)`

SetSortinoRatio10y sets SortinoRatio10y field to given value.

### HasSortinoRatio10y

`func (o *StockProfilePrice) HasSortinoRatio10y() bool`

HasSortinoRatio10y returns a boolean if a field has been set.

### GetSortinoRatio1y

`func (o *StockProfilePrice) GetSortinoRatio1y() float32`

GetSortinoRatio1y returns the SortinoRatio1y field if non-nil, zero value otherwise.

### GetSortinoRatio1yOk

`func (o *StockProfilePrice) GetSortinoRatio1yOk() (*float32, bool)`

GetSortinoRatio1yOk returns a tuple with the SortinoRatio1y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortinoRatio1y

`func (o *StockProfilePrice) SetSortinoRatio1y(v float32)`

SetSortinoRatio1y sets SortinoRatio1y field to given value.

### HasSortinoRatio1y

`func (o *StockProfilePrice) HasSortinoRatio1y() bool`

HasSortinoRatio1y returns a boolean if a field has been set.

### GetSortinoRatio3y

`func (o *StockProfilePrice) GetSortinoRatio3y() float32`

GetSortinoRatio3y returns the SortinoRatio3y field if non-nil, zero value otherwise.

### GetSortinoRatio3yOk

`func (o *StockProfilePrice) GetSortinoRatio3yOk() (*float32, bool)`

GetSortinoRatio3yOk returns a tuple with the SortinoRatio3y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortinoRatio3y

`func (o *StockProfilePrice) SetSortinoRatio3y(v float32)`

SetSortinoRatio3y sets SortinoRatio3y field to given value.

### HasSortinoRatio3y

`func (o *StockProfilePrice) HasSortinoRatio3y() bool`

HasSortinoRatio3y returns a boolean if a field has been set.

### GetSortinoRatio5y

`func (o *StockProfilePrice) GetSortinoRatio5y() float32`

GetSortinoRatio5y returns the SortinoRatio5y field if non-nil, zero value otherwise.

### GetSortinoRatio5yOk

`func (o *StockProfilePrice) GetSortinoRatio5yOk() (*float32, bool)`

GetSortinoRatio5yOk returns a tuple with the SortinoRatio5y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortinoRatio5y

`func (o *StockProfilePrice) SetSortinoRatio5y(v float32)`

SetSortinoRatio5y sets SortinoRatio5y field to given value.

### HasSortinoRatio5y

`func (o *StockProfilePrice) HasSortinoRatio5y() bool`

HasSortinoRatio5y returns a boolean if a field has been set.

### GetVolatility

`func (o *StockProfilePrice) GetVolatility() float32`

GetVolatility returns the Volatility field if non-nil, zero value otherwise.

### GetVolatilityOk

`func (o *StockProfilePrice) GetVolatilityOk() (*float32, bool)`

GetVolatilityOk returns a tuple with the Volatility field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVolatility

`func (o *StockProfilePrice) SetVolatility(v float32)`

SetVolatility sets Volatility field to given value.

### HasVolatility

`func (o *StockProfilePrice) HasVolatility() bool`

HasVolatility returns a boolean if a field has been set.

### GetVolatility10y

`func (o *StockProfilePrice) GetVolatility10y() float32`

GetVolatility10y returns the Volatility10y field if non-nil, zero value otherwise.

### GetVolatility10yOk

`func (o *StockProfilePrice) GetVolatility10yOk() (*float32, bool)`

GetVolatility10yOk returns a tuple with the Volatility10y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVolatility10y

`func (o *StockProfilePrice) SetVolatility10y(v float32)`

SetVolatility10y sets Volatility10y field to given value.

### HasVolatility10y

`func (o *StockProfilePrice) HasVolatility10y() bool`

HasVolatility10y returns a boolean if a field has been set.

### GetVolatility1m

`func (o *StockProfilePrice) GetVolatility1m() float32`

GetVolatility1m returns the Volatility1m field if non-nil, zero value otherwise.

### GetVolatility1mOk

`func (o *StockProfilePrice) GetVolatility1mOk() (*float32, bool)`

GetVolatility1mOk returns a tuple with the Volatility1m field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVolatility1m

`func (o *StockProfilePrice) SetVolatility1m(v float32)`

SetVolatility1m sets Volatility1m field to given value.

### HasVolatility1m

`func (o *StockProfilePrice) HasVolatility1m() bool`

HasVolatility1m returns a boolean if a field has been set.

### GetVolatility1w

`func (o *StockProfilePrice) GetVolatility1w() float32`

GetVolatility1w returns the Volatility1w field if non-nil, zero value otherwise.

### GetVolatility1wOk

`func (o *StockProfilePrice) GetVolatility1wOk() (*float32, bool)`

GetVolatility1wOk returns a tuple with the Volatility1w field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVolatility1w

`func (o *StockProfilePrice) SetVolatility1w(v float32)`

SetVolatility1w sets Volatility1w field to given value.

### HasVolatility1w

`func (o *StockProfilePrice) HasVolatility1w() bool`

HasVolatility1w returns a boolean if a field has been set.

### GetVolatility3y

`func (o *StockProfilePrice) GetVolatility3y() float32`

GetVolatility3y returns the Volatility3y field if non-nil, zero value otherwise.

### GetVolatility3yOk

`func (o *StockProfilePrice) GetVolatility3yOk() (*float32, bool)`

GetVolatility3yOk returns a tuple with the Volatility3y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVolatility3y

`func (o *StockProfilePrice) SetVolatility3y(v float32)`

SetVolatility3y sets Volatility3y field to given value.

### HasVolatility3y

`func (o *StockProfilePrice) HasVolatility3y() bool`

HasVolatility3y returns a boolean if a field has been set.

### GetVolatility5y

`func (o *StockProfilePrice) GetVolatility5y() float32`

GetVolatility5y returns the Volatility5y field if non-nil, zero value otherwise.

### GetVolatility5yOk

`func (o *StockProfilePrice) GetVolatility5yOk() (*float32, bool)`

GetVolatility5yOk returns a tuple with the Volatility5y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVolatility5y

`func (o *StockProfilePrice) SetVolatility5y(v float32)`

SetVolatility5y sets Volatility5y field to given value.

### HasVolatility5y

`func (o *StockProfilePrice) HasVolatility5y() bool`

HasVolatility5y returns a boolean if a field has been set.

### GetVolume

`func (o *StockProfilePrice) GetVolume() float32`

GetVolume returns the Volume field if non-nil, zero value otherwise.

### GetVolumeOk

`func (o *StockProfilePrice) GetVolumeOk() (*float32, bool)`

GetVolumeOk returns a tuple with the Volume field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVolume

`func (o *StockProfilePrice) SetVolume(v float32)`

SetVolume sets Volume field to given value.

### HasVolume

`func (o *StockProfilePrice) HasVolume() bool`

HasVolume returns a boolean if a field has been set.

### GetVolume3m

`func (o *StockProfilePrice) GetVolume3m() float32`

GetVolume3m returns the Volume3m field if non-nil, zero value otherwise.

### GetVolume3mOk

`func (o *StockProfilePrice) GetVolume3mOk() (*float32, bool)`

GetVolume3mOk returns a tuple with the Volume3m field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVolume3m

`func (o *StockProfilePrice) SetVolume3m(v float32)`

SetVolume3m sets Volume3m field to given value.

### HasVolume3m

`func (o *StockProfilePrice) HasVolume3m() bool`

HasVolume3m returns a boolean if a field has been set.

### GetVolumeTotal

`func (o *StockProfilePrice) GetVolumeTotal() float32`

GetVolumeTotal returns the VolumeTotal field if non-nil, zero value otherwise.

### GetVolumeTotalOk

`func (o *StockProfilePrice) GetVolumeTotalOk() (*float32, bool)`

GetVolumeTotalOk returns a tuple with the VolumeTotal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVolumeTotal

`func (o *StockProfilePrice) SetVolumeTotal(v float32)`

SetVolumeTotal sets VolumeTotal field to given value.

### HasVolumeTotal

`func (o *StockProfilePrice) HasVolumeTotal() bool`

HasVolumeTotal returns a boolean if a field has been set.

### GetVolumeTotal3m

`func (o *StockProfilePrice) GetVolumeTotal3m() float32`

GetVolumeTotal3m returns the VolumeTotal3m field if non-nil, zero value otherwise.

### GetVolumeTotal3mOk

`func (o *StockProfilePrice) GetVolumeTotal3mOk() (*float32, bool)`

GetVolumeTotal3mOk returns a tuple with the VolumeTotal3m field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVolumeTotal3m

`func (o *StockProfilePrice) SetVolumeTotal3m(v float32)`

SetVolumeTotal3m sets VolumeTotal3m field to given value.

### HasVolumeTotal3m

`func (o *StockProfilePrice) HasVolumeTotal3m() bool`

HasVolumeTotal3m returns a boolean if a field has been set.

### GetVolumnDay

`func (o *StockProfilePrice) GetVolumnDay() float32`

GetVolumnDay returns the VolumnDay field if non-nil, zero value otherwise.

### GetVolumnDayOk

`func (o *StockProfilePrice) GetVolumnDayOk() (*float32, bool)`

GetVolumnDayOk returns a tuple with the VolumnDay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVolumnDay

`func (o *StockProfilePrice) SetVolumnDay(v float32)`

SetVolumnDay sets VolumnDay field to given value.

### HasVolumnDay

`func (o *StockProfilePrice) HasVolumnDay() bool`

HasVolumnDay returns a boolean if a field has been set.

### GetVolumnDayTotal

`func (o *StockProfilePrice) GetVolumnDayTotal() float32`

GetVolumnDayTotal returns the VolumnDayTotal field if non-nil, zero value otherwise.

### GetVolumnDayTotalOk

`func (o *StockProfilePrice) GetVolumnDayTotalOk() (*float32, bool)`

GetVolumnDayTotalOk returns a tuple with the VolumnDayTotal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVolumnDayTotal

`func (o *StockProfilePrice) SetVolumnDayTotal(v float32)`

SetVolumnDayTotal sets VolumnDayTotal field to given value.

### HasVolumnDayTotal

`func (o *StockProfilePrice) HasVolumnDayTotal() bool`

HasVolumnDayTotal returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


