# StockProfileProfitability

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FCFmargin** | Pointer to **float32** | FCF Margin is calculated as Free Cash Flow divided by total Revenue. | [optional] 
**FCFmarginHigh** | Pointer to **float32** | The FCF Margin % (10y High) refers to the highest value of the FCF Margin over a 10-year period, where FCF Margin is calculated as Free Cash Flow divided by total Revenue. | [optional] 
**FCFmarginLow** | Pointer to **float32** | The FCF Margin % (10y Low) refers to the lowest value of FCF Margin over a 10-year period, where FCF Margin is calculated as Free Cash Flow divided by total Revenue. | [optional] 
**FCFmarginMed** | Pointer to **float32** | The FCF Margin % (10y Median) refers to the median value of FCF Margin over a 10-year period, where FCF Margin is calculated as Free Cash Flow divided by total Revenue. | [optional] 
**FCFmarginMed5y** | Pointer to **float32** | The median free cash flow margin over the past five years | [optional] 
**NetInterestMargin** | Pointer to **float32** | Net interest margin is a performance metric that examines how successful a firm&#39;s investment decisions are compared to its debt situations. | [optional] 
**CashConversionRatio** | Pointer to **float32** | Cash Conversion Ratio is calculated as Free Cash Flow divided by Net Income. | [optional] 
**CashConversionRatioHigh** | Pointer to **float32** | The Cash Conversion Ratio (10y High) refers to the highest value of the Cash Conversion Ratio over a 10-year period, where Cash Conversion Ratio is calculated as Free Cash Flow divided by Net Income. | [optional] 
**CashConversionRatioLow** | Pointer to **float32** | The Cash Conversion Ratio (10y Low) refers to the lowest value of Cash Conversion Ratio over a 10-year period, where Cash Conversion Ratio is calculated as Free Cash Flow divided by Net Income. | [optional] 
**CashConversionRatioMed** | Pointer to **float32** | The Cash Conversion Ratio (10y Median) refers to the median value of Cash Conversion Ratio over a 10-year period, where Cash Conversion Ratio is calculated as Free Cash Flow divided by Net Income. | [optional] 
**CashConversionRatioMed5y** | Pointer to **float32** | The Cash Conversion Ratio (5y Median) refers to the median value of Cash Conversion Ratio over a 5-year period, where Cash Conversion Ratio is calculated as Free Cash Flow divided by Net Income. | [optional] 
**EbitMargin** | Pointer to **float32** |  | [optional] 
**EbitMarginHigh** | Pointer to **float32** |  | [optional] 
**EbitMarginLow** | Pointer to **float32** |  | [optional] 
**EbitMarginMed** | Pointer to **float32** |  | [optional] 
**EbitdaMargin** | Pointer to **float32** |  | [optional] 
**EbitdaMarginHigh** | Pointer to **float32** |  | [optional] 
**EbitdaMarginLow** | Pointer to **float32** |  | [optional] 
**EbitdaMarginMed** | Pointer to **float32** |  | [optional] 
**FcfYearNum** | Pointer to **float32** |  | [optional] 
**Grossmargin** | Pointer to **float32** | Gross Margin % is calculated as gross profit divided by its revenue. | [optional] 
**GrossmarginHigh** | Pointer to **float32** | Gross Margin % is calculated as gross profit divided by its revenue. | [optional] 
**GrossmarginLow** | Pointer to **float32** | Gross Margin % is calculated as gross profit divided by its revenue. | [optional] 
**GrossmarginMed** | Pointer to **float32** | Gross Margin % is calculated as gross profit divided by its revenue. | [optional] 
**GrossmarginMed5y** | Pointer to **float32** | The Gross Margin % (5y Median) refers to the median value of the gross margin over a period of five years, where gross margin is calculated as gross profit divided by its revenue. | [optional] 
**NetMargain** | Pointer to **float32** | Net margin is calculated as Net Income divided by its Revenue. | [optional] 
**NetMargainHigh** | Pointer to **float32** | Net margin is calculated as Net Income divided by its Revenue. | [optional] 
**NetMargainLow** | Pointer to **float32** | Net margin is calculated as Net Income divided by its Revenue. | [optional] 
**NetMargainMed** | Pointer to **float32** | Net margin is calculated as Net Income divided by its Revenue. | [optional] 
**NetMargainMed5y** | Pointer to **float32** | The Net Margin % (5y Median) refers to the median value of the net margin over a period of five years, where net margin is calculated as net Income divided by its revenue. | [optional] 
**OprtMargain** | Pointer to **float32** | Operating Margin % is calculated as Operating Income divided by its Revenue. | [optional] 
**OprtMargainHigh** | Pointer to **float32** | Operating Margin % is calculated as Operating Income divided by its Revenue. | [optional] 
**OprtMargainLow** | Pointer to **float32** | Operating Margin % is calculated as Operating Income divided by its Revenue. | [optional] 
**OprtMargainMed** | Pointer to **float32** | Operating Margin % is calculated as Operating Income divided by its Revenue. | [optional] 
**OprtMargainMed5y** | Pointer to **float32** | Operating Margin % is calculated as Operating Income divided by its Revenue. | [optional] 
**PretaxMargain** | Pointer to **float32** | The company&#39;s pretax earnings divided by total revenue | [optional] 
**PretaxMargainHigh** | Pointer to **float32** | The highest pretax margin over the past 10 years | [optional] 
**PretaxMargainLow** | Pointer to **float32** | The lowest pretax margin over the past 10 years | [optional] 
**PretaxMargainMed** | Pointer to **float32** | The median pretax margin over the past 10 years | [optional] 
**PretaxMargainMed5y** | Pointer to **float32** | The Pretax Margin % (5y Median) refers to the median value of the pretax margin over a period of five years, where pretax margin is calculated as pretax Income divided by its revenue. | [optional] 
**ProfitYearNum** | Pointer to **float32** | The number of years a company had positive earnings over the past 10 years | [optional] 

## Methods

### NewStockProfileProfitability

`func NewStockProfileProfitability() *StockProfileProfitability`

NewStockProfileProfitability instantiates a new StockProfileProfitability object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStockProfileProfitabilityWithDefaults

`func NewStockProfileProfitabilityWithDefaults() *StockProfileProfitability`

NewStockProfileProfitabilityWithDefaults instantiates a new StockProfileProfitability object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFCFmargin

`func (o *StockProfileProfitability) GetFCFmargin() float32`

GetFCFmargin returns the FCFmargin field if non-nil, zero value otherwise.

### GetFCFmarginOk

`func (o *StockProfileProfitability) GetFCFmarginOk() (*float32, bool)`

GetFCFmarginOk returns a tuple with the FCFmargin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFCFmargin

`func (o *StockProfileProfitability) SetFCFmargin(v float32)`

SetFCFmargin sets FCFmargin field to given value.

### HasFCFmargin

`func (o *StockProfileProfitability) HasFCFmargin() bool`

HasFCFmargin returns a boolean if a field has been set.

### GetFCFmarginHigh

`func (o *StockProfileProfitability) GetFCFmarginHigh() float32`

GetFCFmarginHigh returns the FCFmarginHigh field if non-nil, zero value otherwise.

### GetFCFmarginHighOk

`func (o *StockProfileProfitability) GetFCFmarginHighOk() (*float32, bool)`

GetFCFmarginHighOk returns a tuple with the FCFmarginHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFCFmarginHigh

`func (o *StockProfileProfitability) SetFCFmarginHigh(v float32)`

SetFCFmarginHigh sets FCFmarginHigh field to given value.

### HasFCFmarginHigh

`func (o *StockProfileProfitability) HasFCFmarginHigh() bool`

HasFCFmarginHigh returns a boolean if a field has been set.

### GetFCFmarginLow

`func (o *StockProfileProfitability) GetFCFmarginLow() float32`

GetFCFmarginLow returns the FCFmarginLow field if non-nil, zero value otherwise.

### GetFCFmarginLowOk

`func (o *StockProfileProfitability) GetFCFmarginLowOk() (*float32, bool)`

GetFCFmarginLowOk returns a tuple with the FCFmarginLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFCFmarginLow

`func (o *StockProfileProfitability) SetFCFmarginLow(v float32)`

SetFCFmarginLow sets FCFmarginLow field to given value.

### HasFCFmarginLow

`func (o *StockProfileProfitability) HasFCFmarginLow() bool`

HasFCFmarginLow returns a boolean if a field has been set.

### GetFCFmarginMed

`func (o *StockProfileProfitability) GetFCFmarginMed() float32`

GetFCFmarginMed returns the FCFmarginMed field if non-nil, zero value otherwise.

### GetFCFmarginMedOk

`func (o *StockProfileProfitability) GetFCFmarginMedOk() (*float32, bool)`

GetFCFmarginMedOk returns a tuple with the FCFmarginMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFCFmarginMed

`func (o *StockProfileProfitability) SetFCFmarginMed(v float32)`

SetFCFmarginMed sets FCFmarginMed field to given value.

### HasFCFmarginMed

`func (o *StockProfileProfitability) HasFCFmarginMed() bool`

HasFCFmarginMed returns a boolean if a field has been set.

### GetFCFmarginMed5y

`func (o *StockProfileProfitability) GetFCFmarginMed5y() float32`

GetFCFmarginMed5y returns the FCFmarginMed5y field if non-nil, zero value otherwise.

### GetFCFmarginMed5yOk

`func (o *StockProfileProfitability) GetFCFmarginMed5yOk() (*float32, bool)`

GetFCFmarginMed5yOk returns a tuple with the FCFmarginMed5y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFCFmarginMed5y

`func (o *StockProfileProfitability) SetFCFmarginMed5y(v float32)`

SetFCFmarginMed5y sets FCFmarginMed5y field to given value.

### HasFCFmarginMed5y

`func (o *StockProfileProfitability) HasFCFmarginMed5y() bool`

HasFCFmarginMed5y returns a boolean if a field has been set.

### GetNetInterestMargin

`func (o *StockProfileProfitability) GetNetInterestMargin() float32`

GetNetInterestMargin returns the NetInterestMargin field if non-nil, zero value otherwise.

### GetNetInterestMarginOk

`func (o *StockProfileProfitability) GetNetInterestMarginOk() (*float32, bool)`

GetNetInterestMarginOk returns a tuple with the NetInterestMargin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetInterestMargin

`func (o *StockProfileProfitability) SetNetInterestMargin(v float32)`

SetNetInterestMargin sets NetInterestMargin field to given value.

### HasNetInterestMargin

`func (o *StockProfileProfitability) HasNetInterestMargin() bool`

HasNetInterestMargin returns a boolean if a field has been set.

### GetCashConversionRatio

`func (o *StockProfileProfitability) GetCashConversionRatio() float32`

GetCashConversionRatio returns the CashConversionRatio field if non-nil, zero value otherwise.

### GetCashConversionRatioOk

`func (o *StockProfileProfitability) GetCashConversionRatioOk() (*float32, bool)`

GetCashConversionRatioOk returns a tuple with the CashConversionRatio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashConversionRatio

`func (o *StockProfileProfitability) SetCashConversionRatio(v float32)`

SetCashConversionRatio sets CashConversionRatio field to given value.

### HasCashConversionRatio

`func (o *StockProfileProfitability) HasCashConversionRatio() bool`

HasCashConversionRatio returns a boolean if a field has been set.

### GetCashConversionRatioHigh

`func (o *StockProfileProfitability) GetCashConversionRatioHigh() float32`

GetCashConversionRatioHigh returns the CashConversionRatioHigh field if non-nil, zero value otherwise.

### GetCashConversionRatioHighOk

`func (o *StockProfileProfitability) GetCashConversionRatioHighOk() (*float32, bool)`

GetCashConversionRatioHighOk returns a tuple with the CashConversionRatioHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashConversionRatioHigh

`func (o *StockProfileProfitability) SetCashConversionRatioHigh(v float32)`

SetCashConversionRatioHigh sets CashConversionRatioHigh field to given value.

### HasCashConversionRatioHigh

`func (o *StockProfileProfitability) HasCashConversionRatioHigh() bool`

HasCashConversionRatioHigh returns a boolean if a field has been set.

### GetCashConversionRatioLow

`func (o *StockProfileProfitability) GetCashConversionRatioLow() float32`

GetCashConversionRatioLow returns the CashConversionRatioLow field if non-nil, zero value otherwise.

### GetCashConversionRatioLowOk

`func (o *StockProfileProfitability) GetCashConversionRatioLowOk() (*float32, bool)`

GetCashConversionRatioLowOk returns a tuple with the CashConversionRatioLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashConversionRatioLow

`func (o *StockProfileProfitability) SetCashConversionRatioLow(v float32)`

SetCashConversionRatioLow sets CashConversionRatioLow field to given value.

### HasCashConversionRatioLow

`func (o *StockProfileProfitability) HasCashConversionRatioLow() bool`

HasCashConversionRatioLow returns a boolean if a field has been set.

### GetCashConversionRatioMed

`func (o *StockProfileProfitability) GetCashConversionRatioMed() float32`

GetCashConversionRatioMed returns the CashConversionRatioMed field if non-nil, zero value otherwise.

### GetCashConversionRatioMedOk

`func (o *StockProfileProfitability) GetCashConversionRatioMedOk() (*float32, bool)`

GetCashConversionRatioMedOk returns a tuple with the CashConversionRatioMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashConversionRatioMed

`func (o *StockProfileProfitability) SetCashConversionRatioMed(v float32)`

SetCashConversionRatioMed sets CashConversionRatioMed field to given value.

### HasCashConversionRatioMed

`func (o *StockProfileProfitability) HasCashConversionRatioMed() bool`

HasCashConversionRatioMed returns a boolean if a field has been set.

### GetCashConversionRatioMed5y

`func (o *StockProfileProfitability) GetCashConversionRatioMed5y() float32`

GetCashConversionRatioMed5y returns the CashConversionRatioMed5y field if non-nil, zero value otherwise.

### GetCashConversionRatioMed5yOk

`func (o *StockProfileProfitability) GetCashConversionRatioMed5yOk() (*float32, bool)`

GetCashConversionRatioMed5yOk returns a tuple with the CashConversionRatioMed5y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashConversionRatioMed5y

`func (o *StockProfileProfitability) SetCashConversionRatioMed5y(v float32)`

SetCashConversionRatioMed5y sets CashConversionRatioMed5y field to given value.

### HasCashConversionRatioMed5y

`func (o *StockProfileProfitability) HasCashConversionRatioMed5y() bool`

HasCashConversionRatioMed5y returns a boolean if a field has been set.

### GetEbitMargin

`func (o *StockProfileProfitability) GetEbitMargin() float32`

GetEbitMargin returns the EbitMargin field if non-nil, zero value otherwise.

### GetEbitMarginOk

`func (o *StockProfileProfitability) GetEbitMarginOk() (*float32, bool)`

GetEbitMarginOk returns a tuple with the EbitMargin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEbitMargin

`func (o *StockProfileProfitability) SetEbitMargin(v float32)`

SetEbitMargin sets EbitMargin field to given value.

### HasEbitMargin

`func (o *StockProfileProfitability) HasEbitMargin() bool`

HasEbitMargin returns a boolean if a field has been set.

### GetEbitMarginHigh

`func (o *StockProfileProfitability) GetEbitMarginHigh() float32`

GetEbitMarginHigh returns the EbitMarginHigh field if non-nil, zero value otherwise.

### GetEbitMarginHighOk

`func (o *StockProfileProfitability) GetEbitMarginHighOk() (*float32, bool)`

GetEbitMarginHighOk returns a tuple with the EbitMarginHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEbitMarginHigh

`func (o *StockProfileProfitability) SetEbitMarginHigh(v float32)`

SetEbitMarginHigh sets EbitMarginHigh field to given value.

### HasEbitMarginHigh

`func (o *StockProfileProfitability) HasEbitMarginHigh() bool`

HasEbitMarginHigh returns a boolean if a field has been set.

### GetEbitMarginLow

`func (o *StockProfileProfitability) GetEbitMarginLow() float32`

GetEbitMarginLow returns the EbitMarginLow field if non-nil, zero value otherwise.

### GetEbitMarginLowOk

`func (o *StockProfileProfitability) GetEbitMarginLowOk() (*float32, bool)`

GetEbitMarginLowOk returns a tuple with the EbitMarginLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEbitMarginLow

`func (o *StockProfileProfitability) SetEbitMarginLow(v float32)`

SetEbitMarginLow sets EbitMarginLow field to given value.

### HasEbitMarginLow

`func (o *StockProfileProfitability) HasEbitMarginLow() bool`

HasEbitMarginLow returns a boolean if a field has been set.

### GetEbitMarginMed

`func (o *StockProfileProfitability) GetEbitMarginMed() float32`

GetEbitMarginMed returns the EbitMarginMed field if non-nil, zero value otherwise.

### GetEbitMarginMedOk

`func (o *StockProfileProfitability) GetEbitMarginMedOk() (*float32, bool)`

GetEbitMarginMedOk returns a tuple with the EbitMarginMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEbitMarginMed

`func (o *StockProfileProfitability) SetEbitMarginMed(v float32)`

SetEbitMarginMed sets EbitMarginMed field to given value.

### HasEbitMarginMed

`func (o *StockProfileProfitability) HasEbitMarginMed() bool`

HasEbitMarginMed returns a boolean if a field has been set.

### GetEbitdaMargin

`func (o *StockProfileProfitability) GetEbitdaMargin() float32`

GetEbitdaMargin returns the EbitdaMargin field if non-nil, zero value otherwise.

### GetEbitdaMarginOk

`func (o *StockProfileProfitability) GetEbitdaMarginOk() (*float32, bool)`

GetEbitdaMarginOk returns a tuple with the EbitdaMargin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEbitdaMargin

`func (o *StockProfileProfitability) SetEbitdaMargin(v float32)`

SetEbitdaMargin sets EbitdaMargin field to given value.

### HasEbitdaMargin

`func (o *StockProfileProfitability) HasEbitdaMargin() bool`

HasEbitdaMargin returns a boolean if a field has been set.

### GetEbitdaMarginHigh

`func (o *StockProfileProfitability) GetEbitdaMarginHigh() float32`

GetEbitdaMarginHigh returns the EbitdaMarginHigh field if non-nil, zero value otherwise.

### GetEbitdaMarginHighOk

`func (o *StockProfileProfitability) GetEbitdaMarginHighOk() (*float32, bool)`

GetEbitdaMarginHighOk returns a tuple with the EbitdaMarginHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEbitdaMarginHigh

`func (o *StockProfileProfitability) SetEbitdaMarginHigh(v float32)`

SetEbitdaMarginHigh sets EbitdaMarginHigh field to given value.

### HasEbitdaMarginHigh

`func (o *StockProfileProfitability) HasEbitdaMarginHigh() bool`

HasEbitdaMarginHigh returns a boolean if a field has been set.

### GetEbitdaMarginLow

`func (o *StockProfileProfitability) GetEbitdaMarginLow() float32`

GetEbitdaMarginLow returns the EbitdaMarginLow field if non-nil, zero value otherwise.

### GetEbitdaMarginLowOk

`func (o *StockProfileProfitability) GetEbitdaMarginLowOk() (*float32, bool)`

GetEbitdaMarginLowOk returns a tuple with the EbitdaMarginLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEbitdaMarginLow

`func (o *StockProfileProfitability) SetEbitdaMarginLow(v float32)`

SetEbitdaMarginLow sets EbitdaMarginLow field to given value.

### HasEbitdaMarginLow

`func (o *StockProfileProfitability) HasEbitdaMarginLow() bool`

HasEbitdaMarginLow returns a boolean if a field has been set.

### GetEbitdaMarginMed

`func (o *StockProfileProfitability) GetEbitdaMarginMed() float32`

GetEbitdaMarginMed returns the EbitdaMarginMed field if non-nil, zero value otherwise.

### GetEbitdaMarginMedOk

`func (o *StockProfileProfitability) GetEbitdaMarginMedOk() (*float32, bool)`

GetEbitdaMarginMedOk returns a tuple with the EbitdaMarginMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEbitdaMarginMed

`func (o *StockProfileProfitability) SetEbitdaMarginMed(v float32)`

SetEbitdaMarginMed sets EbitdaMarginMed field to given value.

### HasEbitdaMarginMed

`func (o *StockProfileProfitability) HasEbitdaMarginMed() bool`

HasEbitdaMarginMed returns a boolean if a field has been set.

### GetFcfYearNum

`func (o *StockProfileProfitability) GetFcfYearNum() float32`

GetFcfYearNum returns the FcfYearNum field if non-nil, zero value otherwise.

### GetFcfYearNumOk

`func (o *StockProfileProfitability) GetFcfYearNumOk() (*float32, bool)`

GetFcfYearNumOk returns a tuple with the FcfYearNum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFcfYearNum

`func (o *StockProfileProfitability) SetFcfYearNum(v float32)`

SetFcfYearNum sets FcfYearNum field to given value.

### HasFcfYearNum

`func (o *StockProfileProfitability) HasFcfYearNum() bool`

HasFcfYearNum returns a boolean if a field has been set.

### GetGrossmargin

`func (o *StockProfileProfitability) GetGrossmargin() float32`

GetGrossmargin returns the Grossmargin field if non-nil, zero value otherwise.

### GetGrossmarginOk

`func (o *StockProfileProfitability) GetGrossmarginOk() (*float32, bool)`

GetGrossmarginOk returns a tuple with the Grossmargin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrossmargin

`func (o *StockProfileProfitability) SetGrossmargin(v float32)`

SetGrossmargin sets Grossmargin field to given value.

### HasGrossmargin

`func (o *StockProfileProfitability) HasGrossmargin() bool`

HasGrossmargin returns a boolean if a field has been set.

### GetGrossmarginHigh

`func (o *StockProfileProfitability) GetGrossmarginHigh() float32`

GetGrossmarginHigh returns the GrossmarginHigh field if non-nil, zero value otherwise.

### GetGrossmarginHighOk

`func (o *StockProfileProfitability) GetGrossmarginHighOk() (*float32, bool)`

GetGrossmarginHighOk returns a tuple with the GrossmarginHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrossmarginHigh

`func (o *StockProfileProfitability) SetGrossmarginHigh(v float32)`

SetGrossmarginHigh sets GrossmarginHigh field to given value.

### HasGrossmarginHigh

`func (o *StockProfileProfitability) HasGrossmarginHigh() bool`

HasGrossmarginHigh returns a boolean if a field has been set.

### GetGrossmarginLow

`func (o *StockProfileProfitability) GetGrossmarginLow() float32`

GetGrossmarginLow returns the GrossmarginLow field if non-nil, zero value otherwise.

### GetGrossmarginLowOk

`func (o *StockProfileProfitability) GetGrossmarginLowOk() (*float32, bool)`

GetGrossmarginLowOk returns a tuple with the GrossmarginLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrossmarginLow

`func (o *StockProfileProfitability) SetGrossmarginLow(v float32)`

SetGrossmarginLow sets GrossmarginLow field to given value.

### HasGrossmarginLow

`func (o *StockProfileProfitability) HasGrossmarginLow() bool`

HasGrossmarginLow returns a boolean if a field has been set.

### GetGrossmarginMed

`func (o *StockProfileProfitability) GetGrossmarginMed() float32`

GetGrossmarginMed returns the GrossmarginMed field if non-nil, zero value otherwise.

### GetGrossmarginMedOk

`func (o *StockProfileProfitability) GetGrossmarginMedOk() (*float32, bool)`

GetGrossmarginMedOk returns a tuple with the GrossmarginMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrossmarginMed

`func (o *StockProfileProfitability) SetGrossmarginMed(v float32)`

SetGrossmarginMed sets GrossmarginMed field to given value.

### HasGrossmarginMed

`func (o *StockProfileProfitability) HasGrossmarginMed() bool`

HasGrossmarginMed returns a boolean if a field has been set.

### GetGrossmarginMed5y

`func (o *StockProfileProfitability) GetGrossmarginMed5y() float32`

GetGrossmarginMed5y returns the GrossmarginMed5y field if non-nil, zero value otherwise.

### GetGrossmarginMed5yOk

`func (o *StockProfileProfitability) GetGrossmarginMed5yOk() (*float32, bool)`

GetGrossmarginMed5yOk returns a tuple with the GrossmarginMed5y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrossmarginMed5y

`func (o *StockProfileProfitability) SetGrossmarginMed5y(v float32)`

SetGrossmarginMed5y sets GrossmarginMed5y field to given value.

### HasGrossmarginMed5y

`func (o *StockProfileProfitability) HasGrossmarginMed5y() bool`

HasGrossmarginMed5y returns a boolean if a field has been set.

### GetNetMargain

`func (o *StockProfileProfitability) GetNetMargain() float32`

GetNetMargain returns the NetMargain field if non-nil, zero value otherwise.

### GetNetMargainOk

`func (o *StockProfileProfitability) GetNetMargainOk() (*float32, bool)`

GetNetMargainOk returns a tuple with the NetMargain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetMargain

`func (o *StockProfileProfitability) SetNetMargain(v float32)`

SetNetMargain sets NetMargain field to given value.

### HasNetMargain

`func (o *StockProfileProfitability) HasNetMargain() bool`

HasNetMargain returns a boolean if a field has been set.

### GetNetMargainHigh

`func (o *StockProfileProfitability) GetNetMargainHigh() float32`

GetNetMargainHigh returns the NetMargainHigh field if non-nil, zero value otherwise.

### GetNetMargainHighOk

`func (o *StockProfileProfitability) GetNetMargainHighOk() (*float32, bool)`

GetNetMargainHighOk returns a tuple with the NetMargainHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetMargainHigh

`func (o *StockProfileProfitability) SetNetMargainHigh(v float32)`

SetNetMargainHigh sets NetMargainHigh field to given value.

### HasNetMargainHigh

`func (o *StockProfileProfitability) HasNetMargainHigh() bool`

HasNetMargainHigh returns a boolean if a field has been set.

### GetNetMargainLow

`func (o *StockProfileProfitability) GetNetMargainLow() float32`

GetNetMargainLow returns the NetMargainLow field if non-nil, zero value otherwise.

### GetNetMargainLowOk

`func (o *StockProfileProfitability) GetNetMargainLowOk() (*float32, bool)`

GetNetMargainLowOk returns a tuple with the NetMargainLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetMargainLow

`func (o *StockProfileProfitability) SetNetMargainLow(v float32)`

SetNetMargainLow sets NetMargainLow field to given value.

### HasNetMargainLow

`func (o *StockProfileProfitability) HasNetMargainLow() bool`

HasNetMargainLow returns a boolean if a field has been set.

### GetNetMargainMed

`func (o *StockProfileProfitability) GetNetMargainMed() float32`

GetNetMargainMed returns the NetMargainMed field if non-nil, zero value otherwise.

### GetNetMargainMedOk

`func (o *StockProfileProfitability) GetNetMargainMedOk() (*float32, bool)`

GetNetMargainMedOk returns a tuple with the NetMargainMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetMargainMed

`func (o *StockProfileProfitability) SetNetMargainMed(v float32)`

SetNetMargainMed sets NetMargainMed field to given value.

### HasNetMargainMed

`func (o *StockProfileProfitability) HasNetMargainMed() bool`

HasNetMargainMed returns a boolean if a field has been set.

### GetNetMargainMed5y

`func (o *StockProfileProfitability) GetNetMargainMed5y() float32`

GetNetMargainMed5y returns the NetMargainMed5y field if non-nil, zero value otherwise.

### GetNetMargainMed5yOk

`func (o *StockProfileProfitability) GetNetMargainMed5yOk() (*float32, bool)`

GetNetMargainMed5yOk returns a tuple with the NetMargainMed5y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetMargainMed5y

`func (o *StockProfileProfitability) SetNetMargainMed5y(v float32)`

SetNetMargainMed5y sets NetMargainMed5y field to given value.

### HasNetMargainMed5y

`func (o *StockProfileProfitability) HasNetMargainMed5y() bool`

HasNetMargainMed5y returns a boolean if a field has been set.

### GetOprtMargain

`func (o *StockProfileProfitability) GetOprtMargain() float32`

GetOprtMargain returns the OprtMargain field if non-nil, zero value otherwise.

### GetOprtMargainOk

`func (o *StockProfileProfitability) GetOprtMargainOk() (*float32, bool)`

GetOprtMargainOk returns a tuple with the OprtMargain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOprtMargain

`func (o *StockProfileProfitability) SetOprtMargain(v float32)`

SetOprtMargain sets OprtMargain field to given value.

### HasOprtMargain

`func (o *StockProfileProfitability) HasOprtMargain() bool`

HasOprtMargain returns a boolean if a field has been set.

### GetOprtMargainHigh

`func (o *StockProfileProfitability) GetOprtMargainHigh() float32`

GetOprtMargainHigh returns the OprtMargainHigh field if non-nil, zero value otherwise.

### GetOprtMargainHighOk

`func (o *StockProfileProfitability) GetOprtMargainHighOk() (*float32, bool)`

GetOprtMargainHighOk returns a tuple with the OprtMargainHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOprtMargainHigh

`func (o *StockProfileProfitability) SetOprtMargainHigh(v float32)`

SetOprtMargainHigh sets OprtMargainHigh field to given value.

### HasOprtMargainHigh

`func (o *StockProfileProfitability) HasOprtMargainHigh() bool`

HasOprtMargainHigh returns a boolean if a field has been set.

### GetOprtMargainLow

`func (o *StockProfileProfitability) GetOprtMargainLow() float32`

GetOprtMargainLow returns the OprtMargainLow field if non-nil, zero value otherwise.

### GetOprtMargainLowOk

`func (o *StockProfileProfitability) GetOprtMargainLowOk() (*float32, bool)`

GetOprtMargainLowOk returns a tuple with the OprtMargainLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOprtMargainLow

`func (o *StockProfileProfitability) SetOprtMargainLow(v float32)`

SetOprtMargainLow sets OprtMargainLow field to given value.

### HasOprtMargainLow

`func (o *StockProfileProfitability) HasOprtMargainLow() bool`

HasOprtMargainLow returns a boolean if a field has been set.

### GetOprtMargainMed

`func (o *StockProfileProfitability) GetOprtMargainMed() float32`

GetOprtMargainMed returns the OprtMargainMed field if non-nil, zero value otherwise.

### GetOprtMargainMedOk

`func (o *StockProfileProfitability) GetOprtMargainMedOk() (*float32, bool)`

GetOprtMargainMedOk returns a tuple with the OprtMargainMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOprtMargainMed

`func (o *StockProfileProfitability) SetOprtMargainMed(v float32)`

SetOprtMargainMed sets OprtMargainMed field to given value.

### HasOprtMargainMed

`func (o *StockProfileProfitability) HasOprtMargainMed() bool`

HasOprtMargainMed returns a boolean if a field has been set.

### GetOprtMargainMed5y

`func (o *StockProfileProfitability) GetOprtMargainMed5y() float32`

GetOprtMargainMed5y returns the OprtMargainMed5y field if non-nil, zero value otherwise.

### GetOprtMargainMed5yOk

`func (o *StockProfileProfitability) GetOprtMargainMed5yOk() (*float32, bool)`

GetOprtMargainMed5yOk returns a tuple with the OprtMargainMed5y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOprtMargainMed5y

`func (o *StockProfileProfitability) SetOprtMargainMed5y(v float32)`

SetOprtMargainMed5y sets OprtMargainMed5y field to given value.

### HasOprtMargainMed5y

`func (o *StockProfileProfitability) HasOprtMargainMed5y() bool`

HasOprtMargainMed5y returns a boolean if a field has been set.

### GetPretaxMargain

`func (o *StockProfileProfitability) GetPretaxMargain() float32`

GetPretaxMargain returns the PretaxMargain field if non-nil, zero value otherwise.

### GetPretaxMargainOk

`func (o *StockProfileProfitability) GetPretaxMargainOk() (*float32, bool)`

GetPretaxMargainOk returns a tuple with the PretaxMargain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPretaxMargain

`func (o *StockProfileProfitability) SetPretaxMargain(v float32)`

SetPretaxMargain sets PretaxMargain field to given value.

### HasPretaxMargain

`func (o *StockProfileProfitability) HasPretaxMargain() bool`

HasPretaxMargain returns a boolean if a field has been set.

### GetPretaxMargainHigh

`func (o *StockProfileProfitability) GetPretaxMargainHigh() float32`

GetPretaxMargainHigh returns the PretaxMargainHigh field if non-nil, zero value otherwise.

### GetPretaxMargainHighOk

`func (o *StockProfileProfitability) GetPretaxMargainHighOk() (*float32, bool)`

GetPretaxMargainHighOk returns a tuple with the PretaxMargainHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPretaxMargainHigh

`func (o *StockProfileProfitability) SetPretaxMargainHigh(v float32)`

SetPretaxMargainHigh sets PretaxMargainHigh field to given value.

### HasPretaxMargainHigh

`func (o *StockProfileProfitability) HasPretaxMargainHigh() bool`

HasPretaxMargainHigh returns a boolean if a field has been set.

### GetPretaxMargainLow

`func (o *StockProfileProfitability) GetPretaxMargainLow() float32`

GetPretaxMargainLow returns the PretaxMargainLow field if non-nil, zero value otherwise.

### GetPretaxMargainLowOk

`func (o *StockProfileProfitability) GetPretaxMargainLowOk() (*float32, bool)`

GetPretaxMargainLowOk returns a tuple with the PretaxMargainLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPretaxMargainLow

`func (o *StockProfileProfitability) SetPretaxMargainLow(v float32)`

SetPretaxMargainLow sets PretaxMargainLow field to given value.

### HasPretaxMargainLow

`func (o *StockProfileProfitability) HasPretaxMargainLow() bool`

HasPretaxMargainLow returns a boolean if a field has been set.

### GetPretaxMargainMed

`func (o *StockProfileProfitability) GetPretaxMargainMed() float32`

GetPretaxMargainMed returns the PretaxMargainMed field if non-nil, zero value otherwise.

### GetPretaxMargainMedOk

`func (o *StockProfileProfitability) GetPretaxMargainMedOk() (*float32, bool)`

GetPretaxMargainMedOk returns a tuple with the PretaxMargainMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPretaxMargainMed

`func (o *StockProfileProfitability) SetPretaxMargainMed(v float32)`

SetPretaxMargainMed sets PretaxMargainMed field to given value.

### HasPretaxMargainMed

`func (o *StockProfileProfitability) HasPretaxMargainMed() bool`

HasPretaxMargainMed returns a boolean if a field has been set.

### GetPretaxMargainMed5y

`func (o *StockProfileProfitability) GetPretaxMargainMed5y() float32`

GetPretaxMargainMed5y returns the PretaxMargainMed5y field if non-nil, zero value otherwise.

### GetPretaxMargainMed5yOk

`func (o *StockProfileProfitability) GetPretaxMargainMed5yOk() (*float32, bool)`

GetPretaxMargainMed5yOk returns a tuple with the PretaxMargainMed5y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPretaxMargainMed5y

`func (o *StockProfileProfitability) SetPretaxMargainMed5y(v float32)`

SetPretaxMargainMed5y sets PretaxMargainMed5y field to given value.

### HasPretaxMargainMed5y

`func (o *StockProfileProfitability) HasPretaxMargainMed5y() bool`

HasPretaxMargainMed5y returns a boolean if a field has been set.

### GetProfitYearNum

`func (o *StockProfileProfitability) GetProfitYearNum() float32`

GetProfitYearNum returns the ProfitYearNum field if non-nil, zero value otherwise.

### GetProfitYearNumOk

`func (o *StockProfileProfitability) GetProfitYearNumOk() (*float32, bool)`

GetProfitYearNumOk returns a tuple with the ProfitYearNum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfitYearNum

`func (o *StockProfileProfitability) SetProfitYearNum(v float32)`

SetProfitYearNum sets ProfitYearNum field to given value.

### HasProfitYearNum

`func (o *StockProfileProfitability) HasProfitYearNum() bool`

HasProfitYearNum returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


