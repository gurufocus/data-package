# StocksSymbolValuationsGet200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Annually** | Pointer to [**[]StockValuationsAnnuallyInner**](StockValuationsAnnuallyInner.md) |  | [optional] 
**BasicInformation** | Pointer to [**StockValuationsBasicInformation**](StockValuationsBasicInformation.md) |  | [optional] 
**Quarterly** | Pointer to [**[]StockValuationsAnnuallyInner**](StockValuationsAnnuallyInner.md) |  | [optional] 
**Ttm** | Pointer to [**StockValuationsTtm**](StockValuationsTtm.md) |  | [optional] 

## Methods

### NewStocksSymbolValuationsGet200Response

`func NewStocksSymbolValuationsGet200Response() *StocksSymbolValuationsGet200Response`

NewStocksSymbolValuationsGet200Response instantiates a new StocksSymbolValuationsGet200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStocksSymbolValuationsGet200ResponseWithDefaults

`func NewStocksSymbolValuationsGet200ResponseWithDefaults() *StocksSymbolValuationsGet200Response`

NewStocksSymbolValuationsGet200ResponseWithDefaults instantiates a new StocksSymbolValuationsGet200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAnnually

`func (o *StocksSymbolValuationsGet200Response) GetAnnually() []StockValuationsAnnuallyInner`

GetAnnually returns the Annually field if non-nil, zero value otherwise.

### GetAnnuallyOk

`func (o *StocksSymbolValuationsGet200Response) GetAnnuallyOk() (*[]StockValuationsAnnuallyInner, bool)`

GetAnnuallyOk returns a tuple with the Annually field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAnnually

`func (o *StocksSymbolValuationsGet200Response) SetAnnually(v []StockValuationsAnnuallyInner)`

SetAnnually sets Annually field to given value.

### HasAnnually

`func (o *StocksSymbolValuationsGet200Response) HasAnnually() bool`

HasAnnually returns a boolean if a field has been set.

### GetBasicInformation

`func (o *StocksSymbolValuationsGet200Response) GetBasicInformation() StockValuationsBasicInformation`

GetBasicInformation returns the BasicInformation field if non-nil, zero value otherwise.

### GetBasicInformationOk

`func (o *StocksSymbolValuationsGet200Response) GetBasicInformationOk() (*StockValuationsBasicInformation, bool)`

GetBasicInformationOk returns a tuple with the BasicInformation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBasicInformation

`func (o *StocksSymbolValuationsGet200Response) SetBasicInformation(v StockValuationsBasicInformation)`

SetBasicInformation sets BasicInformation field to given value.

### HasBasicInformation

`func (o *StocksSymbolValuationsGet200Response) HasBasicInformation() bool`

HasBasicInformation returns a boolean if a field has been set.

### GetQuarterly

`func (o *StocksSymbolValuationsGet200Response) GetQuarterly() []StockValuationsAnnuallyInner`

GetQuarterly returns the Quarterly field if non-nil, zero value otherwise.

### GetQuarterlyOk

`func (o *StocksSymbolValuationsGet200Response) GetQuarterlyOk() (*[]StockValuationsAnnuallyInner, bool)`

GetQuarterlyOk returns a tuple with the Quarterly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuarterly

`func (o *StocksSymbolValuationsGet200Response) SetQuarterly(v []StockValuationsAnnuallyInner)`

SetQuarterly sets Quarterly field to given value.

### HasQuarterly

`func (o *StocksSymbolValuationsGet200Response) HasQuarterly() bool`

HasQuarterly returns a boolean if a field has been set.

### GetTtm

`func (o *StocksSymbolValuationsGet200Response) GetTtm() StockValuationsTtm`

GetTtm returns the Ttm field if non-nil, zero value otherwise.

### GetTtmOk

`func (o *StocksSymbolValuationsGet200Response) GetTtmOk() (*StockValuationsTtm, bool)`

GetTtmOk returns a tuple with the Ttm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTtm

`func (o *StocksSymbolValuationsGet200Response) SetTtm(v StockValuationsTtm)`

SetTtm sets Ttm field to given value.

### HasTtm

`func (o *StocksSymbolValuationsGet200Response) HasTtm() bool`

HasTtm returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


