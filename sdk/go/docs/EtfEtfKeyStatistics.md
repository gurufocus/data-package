# EtfEtfKeyStatistics

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Beta** | Pointer to **float32** | Beta measures the volatility or systematic risk of a security in comparison to the market. It is calculated using the latest three years of monthly returns of the stock and the benchmark.&lt;br&gt;- A beta of 1 indicates that the stock&#39;s price will move with the market. &lt;br&gt;- A beta of less than 1 indicates that the stock will be less volatile than the market. &lt;br&gt;- A beta greater than 1 indicates that the stock&#39;s price will be more volatile than the market. | [optional] 
**DisplayTimestamp** | Pointer to **string** |  | [optional] 
**High** | Pointer to **float32** | The company&#39;s intraday high share price | [optional] 
**Low** | Pointer to **float32** | The company&#39;s intraday low share price | [optional] 
**Open** | Pointer to **float32** | The company&#39;s share price at market open | [optional] 
**PPctChange** | Pointer to **float32** | The percent change of a company&#39;s share price based on the previous close. | [optional] 
**Price** | Pointer to **float32** | The current share price of the stock | [optional] 
**Price52whigh** | Pointer to **float32** | The highest share price over the past 52 weeks | [optional] 
**Price52wlow** | Pointer to **float32** | The lowest share price over the past 52 weeks | [optional] 
**Rsi14** | Pointer to **float32** | The relative strength index, i.e., a value that closely captures the average gain on up days divided by the average loss non down days, over the past 14 days | [optional] 
**SharpeRatio3y** | Pointer to **float32** | The 3-Year Sharpe Ratio measures the risk-adjusted return of an investment over the past three years. It is calculated as the annualized result of the average monthly excess return divided by its standard deviation over the past three years. The monthly excess return is the monthly investment return minus the monthly risk-free rate (typically the 10-year Treasury Constant Maturity Rate). If the risk-free rate for a specific region is not available, U.S. data is used by default. | [optional] 
**Sma20** | Pointer to **float32** | The simple moving average, i.e., the arithmetic average share price, over the past 20 days. | [optional] 
**SortinoRatio3y** | Pointer to **float32** | The 3-Year Sortino Ratio measures the risk-adjusted return of an investment over the past three years, focusing specifically on downside risk rather than total risk. It is calculated as the annualized result of the average monthly excess return divided by its downside deviation (accounts for negative excess return) over the past three years. The monthly excess return is the monthly investment return minus the monthly risk-free rate (typically the 10-year Treasury Constant Maturity Rate). If the risk-free rate for a specific region is not available, U.S. data is used by default. | [optional] 
**Volatility** | Pointer to **float32** | The annualized volatility of the stock over the past year | [optional] 
**VolumnDay** | Pointer to **float32** | The daily trading volume of a security. | [optional] 

## Methods

### NewEtfEtfKeyStatistics

`func NewEtfEtfKeyStatistics() *EtfEtfKeyStatistics`

NewEtfEtfKeyStatistics instantiates a new EtfEtfKeyStatistics object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEtfEtfKeyStatisticsWithDefaults

`func NewEtfEtfKeyStatisticsWithDefaults() *EtfEtfKeyStatistics`

NewEtfEtfKeyStatisticsWithDefaults instantiates a new EtfEtfKeyStatistics object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBeta

`func (o *EtfEtfKeyStatistics) GetBeta() float32`

GetBeta returns the Beta field if non-nil, zero value otherwise.

### GetBetaOk

`func (o *EtfEtfKeyStatistics) GetBetaOk() (*float32, bool)`

GetBetaOk returns a tuple with the Beta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBeta

`func (o *EtfEtfKeyStatistics) SetBeta(v float32)`

SetBeta sets Beta field to given value.

### HasBeta

`func (o *EtfEtfKeyStatistics) HasBeta() bool`

HasBeta returns a boolean if a field has been set.

### GetDisplayTimestamp

`func (o *EtfEtfKeyStatistics) GetDisplayTimestamp() string`

GetDisplayTimestamp returns the DisplayTimestamp field if non-nil, zero value otherwise.

### GetDisplayTimestampOk

`func (o *EtfEtfKeyStatistics) GetDisplayTimestampOk() (*string, bool)`

GetDisplayTimestampOk returns a tuple with the DisplayTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayTimestamp

`func (o *EtfEtfKeyStatistics) SetDisplayTimestamp(v string)`

SetDisplayTimestamp sets DisplayTimestamp field to given value.

### HasDisplayTimestamp

`func (o *EtfEtfKeyStatistics) HasDisplayTimestamp() bool`

HasDisplayTimestamp returns a boolean if a field has been set.

### GetHigh

`func (o *EtfEtfKeyStatistics) GetHigh() float32`

GetHigh returns the High field if non-nil, zero value otherwise.

### GetHighOk

`func (o *EtfEtfKeyStatistics) GetHighOk() (*float32, bool)`

GetHighOk returns a tuple with the High field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHigh

`func (o *EtfEtfKeyStatistics) SetHigh(v float32)`

SetHigh sets High field to given value.

### HasHigh

`func (o *EtfEtfKeyStatistics) HasHigh() bool`

HasHigh returns a boolean if a field has been set.

### GetLow

`func (o *EtfEtfKeyStatistics) GetLow() float32`

GetLow returns the Low field if non-nil, zero value otherwise.

### GetLowOk

`func (o *EtfEtfKeyStatistics) GetLowOk() (*float32, bool)`

GetLowOk returns a tuple with the Low field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLow

`func (o *EtfEtfKeyStatistics) SetLow(v float32)`

SetLow sets Low field to given value.

### HasLow

`func (o *EtfEtfKeyStatistics) HasLow() bool`

HasLow returns a boolean if a field has been set.

### GetOpen

`func (o *EtfEtfKeyStatistics) GetOpen() float32`

GetOpen returns the Open field if non-nil, zero value otherwise.

### GetOpenOk

`func (o *EtfEtfKeyStatistics) GetOpenOk() (*float32, bool)`

GetOpenOk returns a tuple with the Open field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOpen

`func (o *EtfEtfKeyStatistics) SetOpen(v float32)`

SetOpen sets Open field to given value.

### HasOpen

`func (o *EtfEtfKeyStatistics) HasOpen() bool`

HasOpen returns a boolean if a field has been set.

### GetPPctChange

`func (o *EtfEtfKeyStatistics) GetPPctChange() float32`

GetPPctChange returns the PPctChange field if non-nil, zero value otherwise.

### GetPPctChangeOk

`func (o *EtfEtfKeyStatistics) GetPPctChangeOk() (*float32, bool)`

GetPPctChangeOk returns a tuple with the PPctChange field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPPctChange

`func (o *EtfEtfKeyStatistics) SetPPctChange(v float32)`

SetPPctChange sets PPctChange field to given value.

### HasPPctChange

`func (o *EtfEtfKeyStatistics) HasPPctChange() bool`

HasPPctChange returns a boolean if a field has been set.

### GetPrice

`func (o *EtfEtfKeyStatistics) GetPrice() float32`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *EtfEtfKeyStatistics) GetPriceOk() (*float32, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *EtfEtfKeyStatistics) SetPrice(v float32)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *EtfEtfKeyStatistics) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetPrice52whigh

`func (o *EtfEtfKeyStatistics) GetPrice52whigh() float32`

GetPrice52whigh returns the Price52whigh field if non-nil, zero value otherwise.

### GetPrice52whighOk

`func (o *EtfEtfKeyStatistics) GetPrice52whighOk() (*float32, bool)`

GetPrice52whighOk returns a tuple with the Price52whigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice52whigh

`func (o *EtfEtfKeyStatistics) SetPrice52whigh(v float32)`

SetPrice52whigh sets Price52whigh field to given value.

### HasPrice52whigh

`func (o *EtfEtfKeyStatistics) HasPrice52whigh() bool`

HasPrice52whigh returns a boolean if a field has been set.

### GetPrice52wlow

`func (o *EtfEtfKeyStatistics) GetPrice52wlow() float32`

GetPrice52wlow returns the Price52wlow field if non-nil, zero value otherwise.

### GetPrice52wlowOk

`func (o *EtfEtfKeyStatistics) GetPrice52wlowOk() (*float32, bool)`

GetPrice52wlowOk returns a tuple with the Price52wlow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice52wlow

`func (o *EtfEtfKeyStatistics) SetPrice52wlow(v float32)`

SetPrice52wlow sets Price52wlow field to given value.

### HasPrice52wlow

`func (o *EtfEtfKeyStatistics) HasPrice52wlow() bool`

HasPrice52wlow returns a boolean if a field has been set.

### GetRsi14

`func (o *EtfEtfKeyStatistics) GetRsi14() float32`

GetRsi14 returns the Rsi14 field if non-nil, zero value otherwise.

### GetRsi14Ok

`func (o *EtfEtfKeyStatistics) GetRsi14Ok() (*float32, bool)`

GetRsi14Ok returns a tuple with the Rsi14 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRsi14

`func (o *EtfEtfKeyStatistics) SetRsi14(v float32)`

SetRsi14 sets Rsi14 field to given value.

### HasRsi14

`func (o *EtfEtfKeyStatistics) HasRsi14() bool`

HasRsi14 returns a boolean if a field has been set.

### GetSharpeRatio3y

`func (o *EtfEtfKeyStatistics) GetSharpeRatio3y() float32`

GetSharpeRatio3y returns the SharpeRatio3y field if non-nil, zero value otherwise.

### GetSharpeRatio3yOk

`func (o *EtfEtfKeyStatistics) GetSharpeRatio3yOk() (*float32, bool)`

GetSharpeRatio3yOk returns a tuple with the SharpeRatio3y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSharpeRatio3y

`func (o *EtfEtfKeyStatistics) SetSharpeRatio3y(v float32)`

SetSharpeRatio3y sets SharpeRatio3y field to given value.

### HasSharpeRatio3y

`func (o *EtfEtfKeyStatistics) HasSharpeRatio3y() bool`

HasSharpeRatio3y returns a boolean if a field has been set.

### GetSma20

`func (o *EtfEtfKeyStatistics) GetSma20() float32`

GetSma20 returns the Sma20 field if non-nil, zero value otherwise.

### GetSma20Ok

`func (o *EtfEtfKeyStatistics) GetSma20Ok() (*float32, bool)`

GetSma20Ok returns a tuple with the Sma20 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSma20

`func (o *EtfEtfKeyStatistics) SetSma20(v float32)`

SetSma20 sets Sma20 field to given value.

### HasSma20

`func (o *EtfEtfKeyStatistics) HasSma20() bool`

HasSma20 returns a boolean if a field has been set.

### GetSortinoRatio3y

`func (o *EtfEtfKeyStatistics) GetSortinoRatio3y() float32`

GetSortinoRatio3y returns the SortinoRatio3y field if non-nil, zero value otherwise.

### GetSortinoRatio3yOk

`func (o *EtfEtfKeyStatistics) GetSortinoRatio3yOk() (*float32, bool)`

GetSortinoRatio3yOk returns a tuple with the SortinoRatio3y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortinoRatio3y

`func (o *EtfEtfKeyStatistics) SetSortinoRatio3y(v float32)`

SetSortinoRatio3y sets SortinoRatio3y field to given value.

### HasSortinoRatio3y

`func (o *EtfEtfKeyStatistics) HasSortinoRatio3y() bool`

HasSortinoRatio3y returns a boolean if a field has been set.

### GetVolatility

`func (o *EtfEtfKeyStatistics) GetVolatility() float32`

GetVolatility returns the Volatility field if non-nil, zero value otherwise.

### GetVolatilityOk

`func (o *EtfEtfKeyStatistics) GetVolatilityOk() (*float32, bool)`

GetVolatilityOk returns a tuple with the Volatility field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVolatility

`func (o *EtfEtfKeyStatistics) SetVolatility(v float32)`

SetVolatility sets Volatility field to given value.

### HasVolatility

`func (o *EtfEtfKeyStatistics) HasVolatility() bool`

HasVolatility returns a boolean if a field has been set.

### GetVolumnDay

`func (o *EtfEtfKeyStatistics) GetVolumnDay() float32`

GetVolumnDay returns the VolumnDay field if non-nil, zero value otherwise.

### GetVolumnDayOk

`func (o *EtfEtfKeyStatistics) GetVolumnDayOk() (*float32, bool)`

GetVolumnDayOk returns a tuple with the VolumnDay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVolumnDay

`func (o *EtfEtfKeyStatistics) SetVolumnDay(v float32)`

SetVolumnDay sets VolumnDay field to given value.

### HasVolumnDay

`func (o *EtfEtfKeyStatistics) HasVolumnDay() bool`

HasVolumnDay returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


