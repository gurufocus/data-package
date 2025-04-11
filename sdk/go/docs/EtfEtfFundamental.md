# EtfEtfFundamental

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Mktcap** | Pointer to **float32** | Market cap is the short version of market capitalization. It is the total market value to buy the whole company. It is equal to the share price times the number of shares outstanding. | [optional] 
**Pb** | Pointer to **float32** | Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio. | [optional] 
**Pbhigh** | Pointer to **float32** | Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio. | [optional] 
**Pblow** | Pointer to **float32** | Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio. | [optional] 
**Pbmed** | Pointer to **float32** | Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio. | [optional] 
**Pe** | Pointer to **float32** | &lt;p&gt;The PE ratio, or Price-to-Earnings ratio, is the most widely used metric in the valuation of stocks. It is calculated as:  &lt;b&gt;PE Ratio &#x3D; Share Price / {{eps_diluated}}&lt;/b&gt;.   It can also be calculated from the numbers for the whole company:  &lt;b&gt;PE Ratio &#x3D; {{mktcap}} / {{net_income}}&lt;/b&gt;.&lt;/p&gt;  &lt;p&gt;There are at least three kinds of PE ratios used among different investors. They are Trailing Twelve Month PE Ratio({{pettm}}), {{forwardPE}}, and {{penri}}. A new PE ratio based on inflation-adjusted normalized PE ratio is called {{ShillerPE}}, after Yale professor Robert Shiller.&lt;/p&gt;  &lt;p&gt;In the calculation of {{pettm}}, the earnings per share used are the earnings per share over the past 12 months({{ttm_eps}}). For {{forwardPE}}, the earnings are the expected earnings for the next twelve months({{forward_eps}}). In the case of {{penri}}, the reported earnings less the non-recurring items are used({{eps_nri}}).For the {{ShillerPE}}, the earnings of the past 10 years are inflation-adjusted and averaged. Since {{ShillerPE}} looks at the average over the last 10 years, it is also called PE10.&lt;/p&gt; | [optional] 
**Pettmhigh** | Pointer to **float32** | The highest price-earnings ratio over the past 10 years | [optional] 
**Pettmlow** | Pointer to **float32** | The lowest price-earnings ratio over the past 10 years | [optional] 
**Pettmmed** | Pointer to **float32** | The median price-earnings ratio over the past 10 years | [optional] 
**Shares** | Pointer to **float32** | Outstanding shares refer to a company&#39;s stock currently held by all its shareholders, including share blocks held by institutional investors and restricted shares owned by the company&#39;s officers and insiders. | [optional] 

## Methods

### NewEtfEtfFundamental

`func NewEtfEtfFundamental() *EtfEtfFundamental`

NewEtfEtfFundamental instantiates a new EtfEtfFundamental object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEtfEtfFundamentalWithDefaults

`func NewEtfEtfFundamentalWithDefaults() *EtfEtfFundamental`

NewEtfEtfFundamentalWithDefaults instantiates a new EtfEtfFundamental object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMktcap

`func (o *EtfEtfFundamental) GetMktcap() float32`

GetMktcap returns the Mktcap field if non-nil, zero value otherwise.

### GetMktcapOk

`func (o *EtfEtfFundamental) GetMktcapOk() (*float32, bool)`

GetMktcapOk returns a tuple with the Mktcap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMktcap

`func (o *EtfEtfFundamental) SetMktcap(v float32)`

SetMktcap sets Mktcap field to given value.

### HasMktcap

`func (o *EtfEtfFundamental) HasMktcap() bool`

HasMktcap returns a boolean if a field has been set.

### GetPb

`func (o *EtfEtfFundamental) GetPb() float32`

GetPb returns the Pb field if non-nil, zero value otherwise.

### GetPbOk

`func (o *EtfEtfFundamental) GetPbOk() (*float32, bool)`

GetPbOk returns a tuple with the Pb field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPb

`func (o *EtfEtfFundamental) SetPb(v float32)`

SetPb sets Pb field to given value.

### HasPb

`func (o *EtfEtfFundamental) HasPb() bool`

HasPb returns a boolean if a field has been set.

### GetPbhigh

`func (o *EtfEtfFundamental) GetPbhigh() float32`

GetPbhigh returns the Pbhigh field if non-nil, zero value otherwise.

### GetPbhighOk

`func (o *EtfEtfFundamental) GetPbhighOk() (*float32, bool)`

GetPbhighOk returns a tuple with the Pbhigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPbhigh

`func (o *EtfEtfFundamental) SetPbhigh(v float32)`

SetPbhigh sets Pbhigh field to given value.

### HasPbhigh

`func (o *EtfEtfFundamental) HasPbhigh() bool`

HasPbhigh returns a boolean if a field has been set.

### GetPblow

`func (o *EtfEtfFundamental) GetPblow() float32`

GetPblow returns the Pblow field if non-nil, zero value otherwise.

### GetPblowOk

`func (o *EtfEtfFundamental) GetPblowOk() (*float32, bool)`

GetPblowOk returns a tuple with the Pblow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPblow

`func (o *EtfEtfFundamental) SetPblow(v float32)`

SetPblow sets Pblow field to given value.

### HasPblow

`func (o *EtfEtfFundamental) HasPblow() bool`

HasPblow returns a boolean if a field has been set.

### GetPbmed

`func (o *EtfEtfFundamental) GetPbmed() float32`

GetPbmed returns the Pbmed field if non-nil, zero value otherwise.

### GetPbmedOk

`func (o *EtfEtfFundamental) GetPbmedOk() (*float32, bool)`

GetPbmedOk returns a tuple with the Pbmed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPbmed

`func (o *EtfEtfFundamental) SetPbmed(v float32)`

SetPbmed sets Pbmed field to given value.

### HasPbmed

`func (o *EtfEtfFundamental) HasPbmed() bool`

HasPbmed returns a boolean if a field has been set.

### GetPe

`func (o *EtfEtfFundamental) GetPe() float32`

GetPe returns the Pe field if non-nil, zero value otherwise.

### GetPeOk

`func (o *EtfEtfFundamental) GetPeOk() (*float32, bool)`

GetPeOk returns a tuple with the Pe field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPe

`func (o *EtfEtfFundamental) SetPe(v float32)`

SetPe sets Pe field to given value.

### HasPe

`func (o *EtfEtfFundamental) HasPe() bool`

HasPe returns a boolean if a field has been set.

### GetPettmhigh

`func (o *EtfEtfFundamental) GetPettmhigh() float32`

GetPettmhigh returns the Pettmhigh field if non-nil, zero value otherwise.

### GetPettmhighOk

`func (o *EtfEtfFundamental) GetPettmhighOk() (*float32, bool)`

GetPettmhighOk returns a tuple with the Pettmhigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPettmhigh

`func (o *EtfEtfFundamental) SetPettmhigh(v float32)`

SetPettmhigh sets Pettmhigh field to given value.

### HasPettmhigh

`func (o *EtfEtfFundamental) HasPettmhigh() bool`

HasPettmhigh returns a boolean if a field has been set.

### GetPettmlow

`func (o *EtfEtfFundamental) GetPettmlow() float32`

GetPettmlow returns the Pettmlow field if non-nil, zero value otherwise.

### GetPettmlowOk

`func (o *EtfEtfFundamental) GetPettmlowOk() (*float32, bool)`

GetPettmlowOk returns a tuple with the Pettmlow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPettmlow

`func (o *EtfEtfFundamental) SetPettmlow(v float32)`

SetPettmlow sets Pettmlow field to given value.

### HasPettmlow

`func (o *EtfEtfFundamental) HasPettmlow() bool`

HasPettmlow returns a boolean if a field has been set.

### GetPettmmed

`func (o *EtfEtfFundamental) GetPettmmed() float32`

GetPettmmed returns the Pettmmed field if non-nil, zero value otherwise.

### GetPettmmedOk

`func (o *EtfEtfFundamental) GetPettmmedOk() (*float32, bool)`

GetPettmmedOk returns a tuple with the Pettmmed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPettmmed

`func (o *EtfEtfFundamental) SetPettmmed(v float32)`

SetPettmmed sets Pettmmed field to given value.

### HasPettmmed

`func (o *EtfEtfFundamental) HasPettmmed() bool`

HasPettmmed returns a boolean if a field has been set.

### GetShares

`func (o *EtfEtfFundamental) GetShares() float32`

GetShares returns the Shares field if non-nil, zero value otherwise.

### GetSharesOk

`func (o *EtfEtfFundamental) GetSharesOk() (*float32, bool)`

GetSharesOk returns a tuple with the Shares field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShares

`func (o *EtfEtfFundamental) SetShares(v float32)`

SetShares sets Shares field to given value.

### HasShares

`func (o *EtfEtfFundamental) HasShares() bool`

HasShares returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


