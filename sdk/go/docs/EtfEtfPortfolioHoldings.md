# EtfEtfPortfolioHoldings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Holdings** | Pointer to [**[]GuruTransaction**](GuruTransaction.md) |  | [optional] 
**Portdate** | Pointer to **string** | Portfolio date | [optional] 

## Methods

### NewEtfEtfPortfolioHoldings

`func NewEtfEtfPortfolioHoldings() *EtfEtfPortfolioHoldings`

NewEtfEtfPortfolioHoldings instantiates a new EtfEtfPortfolioHoldings object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEtfEtfPortfolioHoldingsWithDefaults

`func NewEtfEtfPortfolioHoldingsWithDefaults() *EtfEtfPortfolioHoldings`

NewEtfEtfPortfolioHoldingsWithDefaults instantiates a new EtfEtfPortfolioHoldings object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHoldings

`func (o *EtfEtfPortfolioHoldings) GetHoldings() []GuruTransaction`

GetHoldings returns the Holdings field if non-nil, zero value otherwise.

### GetHoldingsOk

`func (o *EtfEtfPortfolioHoldings) GetHoldingsOk() (*[]GuruTransaction, bool)`

GetHoldingsOk returns a tuple with the Holdings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHoldings

`func (o *EtfEtfPortfolioHoldings) SetHoldings(v []GuruTransaction)`

SetHoldings sets Holdings field to given value.

### HasHoldings

`func (o *EtfEtfPortfolioHoldings) HasHoldings() bool`

HasHoldings returns a boolean if a field has been set.

### GetPortdate

`func (o *EtfEtfPortfolioHoldings) GetPortdate() string`

GetPortdate returns the Portdate field if non-nil, zero value otherwise.

### GetPortdateOk

`func (o *EtfEtfPortfolioHoldings) GetPortdateOk() (*string, bool)`

GetPortdateOk returns a tuple with the Portdate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPortdate

`func (o *EtfEtfPortfolioHoldings) SetPortdate(v string)`

SetPortdate sets Portdate field to given value.

### HasPortdate

`func (o *EtfEtfPortfolioHoldings) HasPortdate() bool`

HasPortdate returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


