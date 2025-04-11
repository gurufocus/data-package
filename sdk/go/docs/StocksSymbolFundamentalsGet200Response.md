# StocksSymbolFundamentalsGet200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Annually** | Pointer to [**[]StockFundamentalsAnnuallyInner**](StockFundamentalsAnnuallyInner.md) |  | [optional] 
**BasicInformation** | Pointer to [**StockFundamentalsBasicInformation**](StockFundamentalsBasicInformation.md) |  | [optional] 
**Quarterly** | Pointer to [**[]StockFundamentalsAnnuallyInner**](StockFundamentalsAnnuallyInner.md) |  | [optional] 
**Ttm** | Pointer to [**StockFundamentalsTtm**](StockFundamentalsTtm.md) |  | [optional] 

## Methods

### NewStocksSymbolFundamentalsGet200Response

`func NewStocksSymbolFundamentalsGet200Response() *StocksSymbolFundamentalsGet200Response`

NewStocksSymbolFundamentalsGet200Response instantiates a new StocksSymbolFundamentalsGet200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStocksSymbolFundamentalsGet200ResponseWithDefaults

`func NewStocksSymbolFundamentalsGet200ResponseWithDefaults() *StocksSymbolFundamentalsGet200Response`

NewStocksSymbolFundamentalsGet200ResponseWithDefaults instantiates a new StocksSymbolFundamentalsGet200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAnnually

`func (o *StocksSymbolFundamentalsGet200Response) GetAnnually() []StockFundamentalsAnnuallyInner`

GetAnnually returns the Annually field if non-nil, zero value otherwise.

### GetAnnuallyOk

`func (o *StocksSymbolFundamentalsGet200Response) GetAnnuallyOk() (*[]StockFundamentalsAnnuallyInner, bool)`

GetAnnuallyOk returns a tuple with the Annually field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAnnually

`func (o *StocksSymbolFundamentalsGet200Response) SetAnnually(v []StockFundamentalsAnnuallyInner)`

SetAnnually sets Annually field to given value.

### HasAnnually

`func (o *StocksSymbolFundamentalsGet200Response) HasAnnually() bool`

HasAnnually returns a boolean if a field has been set.

### GetBasicInformation

`func (o *StocksSymbolFundamentalsGet200Response) GetBasicInformation() StockFundamentalsBasicInformation`

GetBasicInformation returns the BasicInformation field if non-nil, zero value otherwise.

### GetBasicInformationOk

`func (o *StocksSymbolFundamentalsGet200Response) GetBasicInformationOk() (*StockFundamentalsBasicInformation, bool)`

GetBasicInformationOk returns a tuple with the BasicInformation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBasicInformation

`func (o *StocksSymbolFundamentalsGet200Response) SetBasicInformation(v StockFundamentalsBasicInformation)`

SetBasicInformation sets BasicInformation field to given value.

### HasBasicInformation

`func (o *StocksSymbolFundamentalsGet200Response) HasBasicInformation() bool`

HasBasicInformation returns a boolean if a field has been set.

### GetQuarterly

`func (o *StocksSymbolFundamentalsGet200Response) GetQuarterly() []StockFundamentalsAnnuallyInner`

GetQuarterly returns the Quarterly field if non-nil, zero value otherwise.

### GetQuarterlyOk

`func (o *StocksSymbolFundamentalsGet200Response) GetQuarterlyOk() (*[]StockFundamentalsAnnuallyInner, bool)`

GetQuarterlyOk returns a tuple with the Quarterly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuarterly

`func (o *StocksSymbolFundamentalsGet200Response) SetQuarterly(v []StockFundamentalsAnnuallyInner)`

SetQuarterly sets Quarterly field to given value.

### HasQuarterly

`func (o *StocksSymbolFundamentalsGet200Response) HasQuarterly() bool`

HasQuarterly returns a boolean if a field has been set.

### GetTtm

`func (o *StocksSymbolFundamentalsGet200Response) GetTtm() StockFundamentalsTtm`

GetTtm returns the Ttm field if non-nil, zero value otherwise.

### GetTtmOk

`func (o *StocksSymbolFundamentalsGet200Response) GetTtmOk() (*StockFundamentalsTtm, bool)`

GetTtmOk returns a tuple with the Ttm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTtm

`func (o *StocksSymbolFundamentalsGet200Response) SetTtm(v StockFundamentalsTtm)`

SetTtm sets Ttm field to given value.

### HasTtm

`func (o *StocksSymbolFundamentalsGet200Response) HasTtm() bool`

HasTtm returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


