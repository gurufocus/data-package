# EtfSymbolGet200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BasicInformation** | Pointer to [**EtfEtfBasicInformation**](EtfEtfBasicInformation.md) |  | [optional] 
**Dividends** | Pointer to [**EtfEtfDividends**](EtfEtfDividends.md) |  | [optional] 
**Fundamental** | Pointer to [**EtfEtfFundamental**](EtfEtfFundamental.md) |  | [optional] 
**KeyStatistics** | Pointer to [**EtfEtfKeyStatistics**](EtfEtfKeyStatistics.md) |  | [optional] 
**PortfolioHoldings** | Pointer to [**EtfEtfPortfolioHoldings**](EtfEtfPortfolioHoldings.md) |  | [optional] 
**SectorBreakdowns** | Pointer to [**EtfEtfSectorBreakdowns**](EtfEtfSectorBreakdowns.md) |  | [optional] 

## Methods

### NewEtfSymbolGet200Response

`func NewEtfSymbolGet200Response() *EtfSymbolGet200Response`

NewEtfSymbolGet200Response instantiates a new EtfSymbolGet200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEtfSymbolGet200ResponseWithDefaults

`func NewEtfSymbolGet200ResponseWithDefaults() *EtfSymbolGet200Response`

NewEtfSymbolGet200ResponseWithDefaults instantiates a new EtfSymbolGet200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBasicInformation

`func (o *EtfSymbolGet200Response) GetBasicInformation() EtfEtfBasicInformation`

GetBasicInformation returns the BasicInformation field if non-nil, zero value otherwise.

### GetBasicInformationOk

`func (o *EtfSymbolGet200Response) GetBasicInformationOk() (*EtfEtfBasicInformation, bool)`

GetBasicInformationOk returns a tuple with the BasicInformation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBasicInformation

`func (o *EtfSymbolGet200Response) SetBasicInformation(v EtfEtfBasicInformation)`

SetBasicInformation sets BasicInformation field to given value.

### HasBasicInformation

`func (o *EtfSymbolGet200Response) HasBasicInformation() bool`

HasBasicInformation returns a boolean if a field has been set.

### GetDividends

`func (o *EtfSymbolGet200Response) GetDividends() EtfEtfDividends`

GetDividends returns the Dividends field if non-nil, zero value otherwise.

### GetDividendsOk

`func (o *EtfSymbolGet200Response) GetDividendsOk() (*EtfEtfDividends, bool)`

GetDividendsOk returns a tuple with the Dividends field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDividends

`func (o *EtfSymbolGet200Response) SetDividends(v EtfEtfDividends)`

SetDividends sets Dividends field to given value.

### HasDividends

`func (o *EtfSymbolGet200Response) HasDividends() bool`

HasDividends returns a boolean if a field has been set.

### GetFundamental

`func (o *EtfSymbolGet200Response) GetFundamental() EtfEtfFundamental`

GetFundamental returns the Fundamental field if non-nil, zero value otherwise.

### GetFundamentalOk

`func (o *EtfSymbolGet200Response) GetFundamentalOk() (*EtfEtfFundamental, bool)`

GetFundamentalOk returns a tuple with the Fundamental field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFundamental

`func (o *EtfSymbolGet200Response) SetFundamental(v EtfEtfFundamental)`

SetFundamental sets Fundamental field to given value.

### HasFundamental

`func (o *EtfSymbolGet200Response) HasFundamental() bool`

HasFundamental returns a boolean if a field has been set.

### GetKeyStatistics

`func (o *EtfSymbolGet200Response) GetKeyStatistics() EtfEtfKeyStatistics`

GetKeyStatistics returns the KeyStatistics field if non-nil, zero value otherwise.

### GetKeyStatisticsOk

`func (o *EtfSymbolGet200Response) GetKeyStatisticsOk() (*EtfEtfKeyStatistics, bool)`

GetKeyStatisticsOk returns a tuple with the KeyStatistics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeyStatistics

`func (o *EtfSymbolGet200Response) SetKeyStatistics(v EtfEtfKeyStatistics)`

SetKeyStatistics sets KeyStatistics field to given value.

### HasKeyStatistics

`func (o *EtfSymbolGet200Response) HasKeyStatistics() bool`

HasKeyStatistics returns a boolean if a field has been set.

### GetPortfolioHoldings

`func (o *EtfSymbolGet200Response) GetPortfolioHoldings() EtfEtfPortfolioHoldings`

GetPortfolioHoldings returns the PortfolioHoldings field if non-nil, zero value otherwise.

### GetPortfolioHoldingsOk

`func (o *EtfSymbolGet200Response) GetPortfolioHoldingsOk() (*EtfEtfPortfolioHoldings, bool)`

GetPortfolioHoldingsOk returns a tuple with the PortfolioHoldings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPortfolioHoldings

`func (o *EtfSymbolGet200Response) SetPortfolioHoldings(v EtfEtfPortfolioHoldings)`

SetPortfolioHoldings sets PortfolioHoldings field to given value.

### HasPortfolioHoldings

`func (o *EtfSymbolGet200Response) HasPortfolioHoldings() bool`

HasPortfolioHoldings returns a boolean if a field has been set.

### GetSectorBreakdowns

`func (o *EtfSymbolGet200Response) GetSectorBreakdowns() EtfEtfSectorBreakdowns`

GetSectorBreakdowns returns the SectorBreakdowns field if non-nil, zero value otherwise.

### GetSectorBreakdownsOk

`func (o *EtfSymbolGet200Response) GetSectorBreakdownsOk() (*EtfEtfSectorBreakdowns, bool)`

GetSectorBreakdownsOk returns a tuple with the SectorBreakdowns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSectorBreakdowns

`func (o *EtfSymbolGet200Response) SetSectorBreakdowns(v EtfEtfSectorBreakdowns)`

SetSectorBreakdowns sets SectorBreakdowns field to given value.

### HasSectorBreakdowns

`func (o *EtfSymbolGet200Response) HasSectorBreakdowns() bool`

HasSectorBreakdowns returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


