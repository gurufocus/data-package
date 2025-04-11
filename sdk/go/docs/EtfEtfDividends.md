# EtfEtfDividends

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DividendFreq** | Pointer to **float32** | The number of times a company pays a dividend per year. Example: 4 means quarterly. | [optional] 
**NextDividendPaymentDate** | Pointer to **string** |  | [optional] 
**TtmDividend** | Pointer to **float32** | The aggregate amount of dividends over the trailing 12 months | [optional] 
**Yield** | Pointer to **float32** | The dividend yield is the ratio of a company&#39;s annual dividend compared to its share price. | [optional] 
**YieldHigh** | Pointer to **float32** | The dividend yield is the ratio of a company&#39;s annual dividend compared to its share price. | [optional] 
**YieldLow** | Pointer to **float32** | The dividend yield is the ratio of a company&#39;s annual dividend compared to its share price. | [optional] 
**YieldMed** | Pointer to **float32** | The dividend yield is the ratio of a company&#39;s annual dividend compared to its share price. | [optional] 

## Methods

### NewEtfEtfDividends

`func NewEtfEtfDividends() *EtfEtfDividends`

NewEtfEtfDividends instantiates a new EtfEtfDividends object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEtfEtfDividendsWithDefaults

`func NewEtfEtfDividendsWithDefaults() *EtfEtfDividends`

NewEtfEtfDividendsWithDefaults instantiates a new EtfEtfDividends object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDividendFreq

`func (o *EtfEtfDividends) GetDividendFreq() float32`

GetDividendFreq returns the DividendFreq field if non-nil, zero value otherwise.

### GetDividendFreqOk

`func (o *EtfEtfDividends) GetDividendFreqOk() (*float32, bool)`

GetDividendFreqOk returns a tuple with the DividendFreq field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDividendFreq

`func (o *EtfEtfDividends) SetDividendFreq(v float32)`

SetDividendFreq sets DividendFreq field to given value.

### HasDividendFreq

`func (o *EtfEtfDividends) HasDividendFreq() bool`

HasDividendFreq returns a boolean if a field has been set.

### GetNextDividendPaymentDate

`func (o *EtfEtfDividends) GetNextDividendPaymentDate() string`

GetNextDividendPaymentDate returns the NextDividendPaymentDate field if non-nil, zero value otherwise.

### GetNextDividendPaymentDateOk

`func (o *EtfEtfDividends) GetNextDividendPaymentDateOk() (*string, bool)`

GetNextDividendPaymentDateOk returns a tuple with the NextDividendPaymentDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextDividendPaymentDate

`func (o *EtfEtfDividends) SetNextDividendPaymentDate(v string)`

SetNextDividendPaymentDate sets NextDividendPaymentDate field to given value.

### HasNextDividendPaymentDate

`func (o *EtfEtfDividends) HasNextDividendPaymentDate() bool`

HasNextDividendPaymentDate returns a boolean if a field has been set.

### GetTtmDividend

`func (o *EtfEtfDividends) GetTtmDividend() float32`

GetTtmDividend returns the TtmDividend field if non-nil, zero value otherwise.

### GetTtmDividendOk

`func (o *EtfEtfDividends) GetTtmDividendOk() (*float32, bool)`

GetTtmDividendOk returns a tuple with the TtmDividend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTtmDividend

`func (o *EtfEtfDividends) SetTtmDividend(v float32)`

SetTtmDividend sets TtmDividend field to given value.

### HasTtmDividend

`func (o *EtfEtfDividends) HasTtmDividend() bool`

HasTtmDividend returns a boolean if a field has been set.

### GetYield

`func (o *EtfEtfDividends) GetYield() float32`

GetYield returns the Yield field if non-nil, zero value otherwise.

### GetYieldOk

`func (o *EtfEtfDividends) GetYieldOk() (*float32, bool)`

GetYieldOk returns a tuple with the Yield field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetYield

`func (o *EtfEtfDividends) SetYield(v float32)`

SetYield sets Yield field to given value.

### HasYield

`func (o *EtfEtfDividends) HasYield() bool`

HasYield returns a boolean if a field has been set.

### GetYieldHigh

`func (o *EtfEtfDividends) GetYieldHigh() float32`

GetYieldHigh returns the YieldHigh field if non-nil, zero value otherwise.

### GetYieldHighOk

`func (o *EtfEtfDividends) GetYieldHighOk() (*float32, bool)`

GetYieldHighOk returns a tuple with the YieldHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetYieldHigh

`func (o *EtfEtfDividends) SetYieldHigh(v float32)`

SetYieldHigh sets YieldHigh field to given value.

### HasYieldHigh

`func (o *EtfEtfDividends) HasYieldHigh() bool`

HasYieldHigh returns a boolean if a field has been set.

### GetYieldLow

`func (o *EtfEtfDividends) GetYieldLow() float32`

GetYieldLow returns the YieldLow field if non-nil, zero value otherwise.

### GetYieldLowOk

`func (o *EtfEtfDividends) GetYieldLowOk() (*float32, bool)`

GetYieldLowOk returns a tuple with the YieldLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetYieldLow

`func (o *EtfEtfDividends) SetYieldLow(v float32)`

SetYieldLow sets YieldLow field to given value.

### HasYieldLow

`func (o *EtfEtfDividends) HasYieldLow() bool`

HasYieldLow returns a boolean if a field has been set.

### GetYieldMed

`func (o *EtfEtfDividends) GetYieldMed() float32`

GetYieldMed returns the YieldMed field if non-nil, zero value otherwise.

### GetYieldMedOk

`func (o *EtfEtfDividends) GetYieldMedOk() (*float32, bool)`

GetYieldMedOk returns a tuple with the YieldMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetYieldMed

`func (o *EtfEtfDividends) SetYieldMed(v float32)`

SetYieldMed sets YieldMed field to given value.

### HasYieldMed

`func (o *EtfEtfDividends) HasYieldMed() bool`

HasYieldMed returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


