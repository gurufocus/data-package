# StockProfileDividends

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Dividend2FFO** | Pointer to **float32** | Cash dividends declared on the company&#39;s primary issue of common stock as a percent of funds from operations, on a per-share basis | [optional] 
**ForwardDividend** | Pointer to **float32** | The aggregate amount of expected dividends for the next 12 months | [optional] 
**ForwardDividendYield** | Pointer to **float32** | A forward dividend yield is an estimation of a year&#39;s dividend expressed as a percentage of the current stock price. | [optional] 
**DividendFreq** | Pointer to **float32** | The number of times a company pays a dividend per year. Example: 4 means quarterly. | [optional] 
**DividendMonths** | Pointer to **float32** | The months where the company pays its dividend. | [optional] 
**DividendStartyear** | Pointer to **string** | The starting year for dividends that either remain consistent or increase in the subsequent years. | [optional] 
**DividendStartyearReal** | Pointer to **string** | The starting year for the first dividend payments available on GuruFocus. | [optional] 
**IncreaseDividendStartyear** | Pointer to **string** | The starting year from which dividends have consistently increased in subsequent years. | [optional] 
**NextDividendAmount** | Pointer to **string** | The amount of the company&#39;s next dividend | [optional] 
**NextDividendDate** | Pointer to **string** | The next date the company goes ex-dividend. | [optional] 
**Payout** | Pointer to **float32** | The dividend payout ratio is the ratio of the total amount of dividends paid out to shareholders relative to the net income of the company. | [optional] 
**PayoutHigh** | Pointer to **float32** | The dividend payout ratio is the ratio of the total amount of dividends paid out to shareholders relative to the net income of the company. | [optional] 
**PayoutLow** | Pointer to **float32** | The dividend payout ratio is the ratio of the total amount of dividends paid out to shareholders relative to the net income of the company. | [optional] 
**PayoutMed** | Pointer to **float32** | The dividend payout ratio is the ratio of the total amount of dividends paid out to shareholders relative to the net income of the company. | [optional] 
**TtmDividend** | Pointer to **float32** | The aggregate amount of dividends over the trailing 12 months | [optional] 
**Yield** | Pointer to **float32** | The dividend yield is the ratio of a company&#39;s annual dividend compared to its share price. | [optional] 
**YieldHigh** | Pointer to **float32** | The dividend yield is the ratio of a company&#39;s annual dividend compared to its share price. | [optional] 
**YieldLow** | Pointer to **float32** | The dividend yield is the ratio of a company&#39;s annual dividend compared to its share price. | [optional] 
**YieldMed** | Pointer to **float32** | The dividend yield is the ratio of a company&#39;s annual dividend compared to its share price. | [optional] 
**YieldOnCost** | Pointer to **float32** | Yield on Cost (YOC) is the annual dividend rate of a security, divided by its average cost basis. | [optional] 
**YieldOnCostHigh** | Pointer to **float32** | The highest yield-on-cost over the past 10 years | [optional] 
**YieldOnCostLow** | Pointer to **float32** | The lowest yield-on-cost over the past 10 years | [optional] 
**YieldOnCostMed** | Pointer to **float32** | The median yield-on-cost over the past 10 years | [optional] 

## Methods

### NewStockProfileDividends

`func NewStockProfileDividends() *StockProfileDividends`

NewStockProfileDividends instantiates a new StockProfileDividends object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStockProfileDividendsWithDefaults

`func NewStockProfileDividendsWithDefaults() *StockProfileDividends`

NewStockProfileDividendsWithDefaults instantiates a new StockProfileDividends object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDividend2FFO

`func (o *StockProfileDividends) GetDividend2FFO() float32`

GetDividend2FFO returns the Dividend2FFO field if non-nil, zero value otherwise.

### GetDividend2FFOOk

`func (o *StockProfileDividends) GetDividend2FFOOk() (*float32, bool)`

GetDividend2FFOOk returns a tuple with the Dividend2FFO field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDividend2FFO

`func (o *StockProfileDividends) SetDividend2FFO(v float32)`

SetDividend2FFO sets Dividend2FFO field to given value.

### HasDividend2FFO

`func (o *StockProfileDividends) HasDividend2FFO() bool`

HasDividend2FFO returns a boolean if a field has been set.

### GetForwardDividend

`func (o *StockProfileDividends) GetForwardDividend() float32`

GetForwardDividend returns the ForwardDividend field if non-nil, zero value otherwise.

### GetForwardDividendOk

`func (o *StockProfileDividends) GetForwardDividendOk() (*float32, bool)`

GetForwardDividendOk returns a tuple with the ForwardDividend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForwardDividend

`func (o *StockProfileDividends) SetForwardDividend(v float32)`

SetForwardDividend sets ForwardDividend field to given value.

### HasForwardDividend

`func (o *StockProfileDividends) HasForwardDividend() bool`

HasForwardDividend returns a boolean if a field has been set.

### GetForwardDividendYield

`func (o *StockProfileDividends) GetForwardDividendYield() float32`

GetForwardDividendYield returns the ForwardDividendYield field if non-nil, zero value otherwise.

### GetForwardDividendYieldOk

`func (o *StockProfileDividends) GetForwardDividendYieldOk() (*float32, bool)`

GetForwardDividendYieldOk returns a tuple with the ForwardDividendYield field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForwardDividendYield

`func (o *StockProfileDividends) SetForwardDividendYield(v float32)`

SetForwardDividendYield sets ForwardDividendYield field to given value.

### HasForwardDividendYield

`func (o *StockProfileDividends) HasForwardDividendYield() bool`

HasForwardDividendYield returns a boolean if a field has been set.

### GetDividendFreq

`func (o *StockProfileDividends) GetDividendFreq() float32`

GetDividendFreq returns the DividendFreq field if non-nil, zero value otherwise.

### GetDividendFreqOk

`func (o *StockProfileDividends) GetDividendFreqOk() (*float32, bool)`

GetDividendFreqOk returns a tuple with the DividendFreq field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDividendFreq

`func (o *StockProfileDividends) SetDividendFreq(v float32)`

SetDividendFreq sets DividendFreq field to given value.

### HasDividendFreq

`func (o *StockProfileDividends) HasDividendFreq() bool`

HasDividendFreq returns a boolean if a field has been set.

### GetDividendMonths

`func (o *StockProfileDividends) GetDividendMonths() float32`

GetDividendMonths returns the DividendMonths field if non-nil, zero value otherwise.

### GetDividendMonthsOk

`func (o *StockProfileDividends) GetDividendMonthsOk() (*float32, bool)`

GetDividendMonthsOk returns a tuple with the DividendMonths field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDividendMonths

`func (o *StockProfileDividends) SetDividendMonths(v float32)`

SetDividendMonths sets DividendMonths field to given value.

### HasDividendMonths

`func (o *StockProfileDividends) HasDividendMonths() bool`

HasDividendMonths returns a boolean if a field has been set.

### GetDividendStartyear

`func (o *StockProfileDividends) GetDividendStartyear() string`

GetDividendStartyear returns the DividendStartyear field if non-nil, zero value otherwise.

### GetDividendStartyearOk

`func (o *StockProfileDividends) GetDividendStartyearOk() (*string, bool)`

GetDividendStartyearOk returns a tuple with the DividendStartyear field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDividendStartyear

`func (o *StockProfileDividends) SetDividendStartyear(v string)`

SetDividendStartyear sets DividendStartyear field to given value.

### HasDividendStartyear

`func (o *StockProfileDividends) HasDividendStartyear() bool`

HasDividendStartyear returns a boolean if a field has been set.

### GetDividendStartyearReal

`func (o *StockProfileDividends) GetDividendStartyearReal() string`

GetDividendStartyearReal returns the DividendStartyearReal field if non-nil, zero value otherwise.

### GetDividendStartyearRealOk

`func (o *StockProfileDividends) GetDividendStartyearRealOk() (*string, bool)`

GetDividendStartyearRealOk returns a tuple with the DividendStartyearReal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDividendStartyearReal

`func (o *StockProfileDividends) SetDividendStartyearReal(v string)`

SetDividendStartyearReal sets DividendStartyearReal field to given value.

### HasDividendStartyearReal

`func (o *StockProfileDividends) HasDividendStartyearReal() bool`

HasDividendStartyearReal returns a boolean if a field has been set.

### GetIncreaseDividendStartyear

`func (o *StockProfileDividends) GetIncreaseDividendStartyear() string`

GetIncreaseDividendStartyear returns the IncreaseDividendStartyear field if non-nil, zero value otherwise.

### GetIncreaseDividendStartyearOk

`func (o *StockProfileDividends) GetIncreaseDividendStartyearOk() (*string, bool)`

GetIncreaseDividendStartyearOk returns a tuple with the IncreaseDividendStartyear field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncreaseDividendStartyear

`func (o *StockProfileDividends) SetIncreaseDividendStartyear(v string)`

SetIncreaseDividendStartyear sets IncreaseDividendStartyear field to given value.

### HasIncreaseDividendStartyear

`func (o *StockProfileDividends) HasIncreaseDividendStartyear() bool`

HasIncreaseDividendStartyear returns a boolean if a field has been set.

### GetNextDividendAmount

`func (o *StockProfileDividends) GetNextDividendAmount() string`

GetNextDividendAmount returns the NextDividendAmount field if non-nil, zero value otherwise.

### GetNextDividendAmountOk

`func (o *StockProfileDividends) GetNextDividendAmountOk() (*string, bool)`

GetNextDividendAmountOk returns a tuple with the NextDividendAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextDividendAmount

`func (o *StockProfileDividends) SetNextDividendAmount(v string)`

SetNextDividendAmount sets NextDividendAmount field to given value.

### HasNextDividendAmount

`func (o *StockProfileDividends) HasNextDividendAmount() bool`

HasNextDividendAmount returns a boolean if a field has been set.

### GetNextDividendDate

`func (o *StockProfileDividends) GetNextDividendDate() string`

GetNextDividendDate returns the NextDividendDate field if non-nil, zero value otherwise.

### GetNextDividendDateOk

`func (o *StockProfileDividends) GetNextDividendDateOk() (*string, bool)`

GetNextDividendDateOk returns a tuple with the NextDividendDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextDividendDate

`func (o *StockProfileDividends) SetNextDividendDate(v string)`

SetNextDividendDate sets NextDividendDate field to given value.

### HasNextDividendDate

`func (o *StockProfileDividends) HasNextDividendDate() bool`

HasNextDividendDate returns a boolean if a field has been set.

### GetPayout

`func (o *StockProfileDividends) GetPayout() float32`

GetPayout returns the Payout field if non-nil, zero value otherwise.

### GetPayoutOk

`func (o *StockProfileDividends) GetPayoutOk() (*float32, bool)`

GetPayoutOk returns a tuple with the Payout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayout

`func (o *StockProfileDividends) SetPayout(v float32)`

SetPayout sets Payout field to given value.

### HasPayout

`func (o *StockProfileDividends) HasPayout() bool`

HasPayout returns a boolean if a field has been set.

### GetPayoutHigh

`func (o *StockProfileDividends) GetPayoutHigh() float32`

GetPayoutHigh returns the PayoutHigh field if non-nil, zero value otherwise.

### GetPayoutHighOk

`func (o *StockProfileDividends) GetPayoutHighOk() (*float32, bool)`

GetPayoutHighOk returns a tuple with the PayoutHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayoutHigh

`func (o *StockProfileDividends) SetPayoutHigh(v float32)`

SetPayoutHigh sets PayoutHigh field to given value.

### HasPayoutHigh

`func (o *StockProfileDividends) HasPayoutHigh() bool`

HasPayoutHigh returns a boolean if a field has been set.

### GetPayoutLow

`func (o *StockProfileDividends) GetPayoutLow() float32`

GetPayoutLow returns the PayoutLow field if non-nil, zero value otherwise.

### GetPayoutLowOk

`func (o *StockProfileDividends) GetPayoutLowOk() (*float32, bool)`

GetPayoutLowOk returns a tuple with the PayoutLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayoutLow

`func (o *StockProfileDividends) SetPayoutLow(v float32)`

SetPayoutLow sets PayoutLow field to given value.

### HasPayoutLow

`func (o *StockProfileDividends) HasPayoutLow() bool`

HasPayoutLow returns a boolean if a field has been set.

### GetPayoutMed

`func (o *StockProfileDividends) GetPayoutMed() float32`

GetPayoutMed returns the PayoutMed field if non-nil, zero value otherwise.

### GetPayoutMedOk

`func (o *StockProfileDividends) GetPayoutMedOk() (*float32, bool)`

GetPayoutMedOk returns a tuple with the PayoutMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayoutMed

`func (o *StockProfileDividends) SetPayoutMed(v float32)`

SetPayoutMed sets PayoutMed field to given value.

### HasPayoutMed

`func (o *StockProfileDividends) HasPayoutMed() bool`

HasPayoutMed returns a boolean if a field has been set.

### GetTtmDividend

`func (o *StockProfileDividends) GetTtmDividend() float32`

GetTtmDividend returns the TtmDividend field if non-nil, zero value otherwise.

### GetTtmDividendOk

`func (o *StockProfileDividends) GetTtmDividendOk() (*float32, bool)`

GetTtmDividendOk returns a tuple with the TtmDividend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTtmDividend

`func (o *StockProfileDividends) SetTtmDividend(v float32)`

SetTtmDividend sets TtmDividend field to given value.

### HasTtmDividend

`func (o *StockProfileDividends) HasTtmDividend() bool`

HasTtmDividend returns a boolean if a field has been set.

### GetYield

`func (o *StockProfileDividends) GetYield() float32`

GetYield returns the Yield field if non-nil, zero value otherwise.

### GetYieldOk

`func (o *StockProfileDividends) GetYieldOk() (*float32, bool)`

GetYieldOk returns a tuple with the Yield field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetYield

`func (o *StockProfileDividends) SetYield(v float32)`

SetYield sets Yield field to given value.

### HasYield

`func (o *StockProfileDividends) HasYield() bool`

HasYield returns a boolean if a field has been set.

### GetYieldHigh

`func (o *StockProfileDividends) GetYieldHigh() float32`

GetYieldHigh returns the YieldHigh field if non-nil, zero value otherwise.

### GetYieldHighOk

`func (o *StockProfileDividends) GetYieldHighOk() (*float32, bool)`

GetYieldHighOk returns a tuple with the YieldHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetYieldHigh

`func (o *StockProfileDividends) SetYieldHigh(v float32)`

SetYieldHigh sets YieldHigh field to given value.

### HasYieldHigh

`func (o *StockProfileDividends) HasYieldHigh() bool`

HasYieldHigh returns a boolean if a field has been set.

### GetYieldLow

`func (o *StockProfileDividends) GetYieldLow() float32`

GetYieldLow returns the YieldLow field if non-nil, zero value otherwise.

### GetYieldLowOk

`func (o *StockProfileDividends) GetYieldLowOk() (*float32, bool)`

GetYieldLowOk returns a tuple with the YieldLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetYieldLow

`func (o *StockProfileDividends) SetYieldLow(v float32)`

SetYieldLow sets YieldLow field to given value.

### HasYieldLow

`func (o *StockProfileDividends) HasYieldLow() bool`

HasYieldLow returns a boolean if a field has been set.

### GetYieldMed

`func (o *StockProfileDividends) GetYieldMed() float32`

GetYieldMed returns the YieldMed field if non-nil, zero value otherwise.

### GetYieldMedOk

`func (o *StockProfileDividends) GetYieldMedOk() (*float32, bool)`

GetYieldMedOk returns a tuple with the YieldMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetYieldMed

`func (o *StockProfileDividends) SetYieldMed(v float32)`

SetYieldMed sets YieldMed field to given value.

### HasYieldMed

`func (o *StockProfileDividends) HasYieldMed() bool`

HasYieldMed returns a boolean if a field has been set.

### GetYieldOnCost

`func (o *StockProfileDividends) GetYieldOnCost() float32`

GetYieldOnCost returns the YieldOnCost field if non-nil, zero value otherwise.

### GetYieldOnCostOk

`func (o *StockProfileDividends) GetYieldOnCostOk() (*float32, bool)`

GetYieldOnCostOk returns a tuple with the YieldOnCost field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetYieldOnCost

`func (o *StockProfileDividends) SetYieldOnCost(v float32)`

SetYieldOnCost sets YieldOnCost field to given value.

### HasYieldOnCost

`func (o *StockProfileDividends) HasYieldOnCost() bool`

HasYieldOnCost returns a boolean if a field has been set.

### GetYieldOnCostHigh

`func (o *StockProfileDividends) GetYieldOnCostHigh() float32`

GetYieldOnCostHigh returns the YieldOnCostHigh field if non-nil, zero value otherwise.

### GetYieldOnCostHighOk

`func (o *StockProfileDividends) GetYieldOnCostHighOk() (*float32, bool)`

GetYieldOnCostHighOk returns a tuple with the YieldOnCostHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetYieldOnCostHigh

`func (o *StockProfileDividends) SetYieldOnCostHigh(v float32)`

SetYieldOnCostHigh sets YieldOnCostHigh field to given value.

### HasYieldOnCostHigh

`func (o *StockProfileDividends) HasYieldOnCostHigh() bool`

HasYieldOnCostHigh returns a boolean if a field has been set.

### GetYieldOnCostLow

`func (o *StockProfileDividends) GetYieldOnCostLow() float32`

GetYieldOnCostLow returns the YieldOnCostLow field if non-nil, zero value otherwise.

### GetYieldOnCostLowOk

`func (o *StockProfileDividends) GetYieldOnCostLowOk() (*float32, bool)`

GetYieldOnCostLowOk returns a tuple with the YieldOnCostLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetYieldOnCostLow

`func (o *StockProfileDividends) SetYieldOnCostLow(v float32)`

SetYieldOnCostLow sets YieldOnCostLow field to given value.

### HasYieldOnCostLow

`func (o *StockProfileDividends) HasYieldOnCostLow() bool`

HasYieldOnCostLow returns a boolean if a field has been set.

### GetYieldOnCostMed

`func (o *StockProfileDividends) GetYieldOnCostMed() float32`

GetYieldOnCostMed returns the YieldOnCostMed field if non-nil, zero value otherwise.

### GetYieldOnCostMedOk

`func (o *StockProfileDividends) GetYieldOnCostMedOk() (*float32, bool)`

GetYieldOnCostMedOk returns a tuple with the YieldOnCostMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetYieldOnCostMed

`func (o *StockProfileDividends) SetYieldOnCostMed(v float32)`

SetYieldOnCostMed sets YieldOnCostMed field to given value.

### HasYieldOnCostMed

`func (o *StockProfileDividends) HasYieldOnCostMed() bool`

HasYieldOnCostMed returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


