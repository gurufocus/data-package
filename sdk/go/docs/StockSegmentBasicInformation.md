# StockSegmentBasicInformation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Company** | Pointer to **string** | The name of the company as identified on its SEC filings. | [optional] 
**CompanyId** | Pointer to **string** |  | [optional] 
**Exchange** | Pointer to **string** | The company&#39;s stock exchange. Example: NAS for Apple. | [optional] 
**Stockid** | Pointer to **string** | A unique identifier for the stock | [optional] 
**Symbol** | Pointer to **string** | The company&#39;s stock ticker symbol | [optional] 

## Methods

### NewStockSegmentBasicInformation

`func NewStockSegmentBasicInformation() *StockSegmentBasicInformation`

NewStockSegmentBasicInformation instantiates a new StockSegmentBasicInformation object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStockSegmentBasicInformationWithDefaults

`func NewStockSegmentBasicInformationWithDefaults() *StockSegmentBasicInformation`

NewStockSegmentBasicInformationWithDefaults instantiates a new StockSegmentBasicInformation object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompany

`func (o *StockSegmentBasicInformation) GetCompany() string`

GetCompany returns the Company field if non-nil, zero value otherwise.

### GetCompanyOk

`func (o *StockSegmentBasicInformation) GetCompanyOk() (*string, bool)`

GetCompanyOk returns a tuple with the Company field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompany

`func (o *StockSegmentBasicInformation) SetCompany(v string)`

SetCompany sets Company field to given value.

### HasCompany

`func (o *StockSegmentBasicInformation) HasCompany() bool`

HasCompany returns a boolean if a field has been set.

### GetCompanyId

`func (o *StockSegmentBasicInformation) GetCompanyId() string`

GetCompanyId returns the CompanyId field if non-nil, zero value otherwise.

### GetCompanyIdOk

`func (o *StockSegmentBasicInformation) GetCompanyIdOk() (*string, bool)`

GetCompanyIdOk returns a tuple with the CompanyId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompanyId

`func (o *StockSegmentBasicInformation) SetCompanyId(v string)`

SetCompanyId sets CompanyId field to given value.

### HasCompanyId

`func (o *StockSegmentBasicInformation) HasCompanyId() bool`

HasCompanyId returns a boolean if a field has been set.

### GetExchange

`func (o *StockSegmentBasicInformation) GetExchange() string`

GetExchange returns the Exchange field if non-nil, zero value otherwise.

### GetExchangeOk

`func (o *StockSegmentBasicInformation) GetExchangeOk() (*string, bool)`

GetExchangeOk returns a tuple with the Exchange field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExchange

`func (o *StockSegmentBasicInformation) SetExchange(v string)`

SetExchange sets Exchange field to given value.

### HasExchange

`func (o *StockSegmentBasicInformation) HasExchange() bool`

HasExchange returns a boolean if a field has been set.

### GetStockid

`func (o *StockSegmentBasicInformation) GetStockid() string`

GetStockid returns the Stockid field if non-nil, zero value otherwise.

### GetStockidOk

`func (o *StockSegmentBasicInformation) GetStockidOk() (*string, bool)`

GetStockidOk returns a tuple with the Stockid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStockid

`func (o *StockSegmentBasicInformation) SetStockid(v string)`

SetStockid sets Stockid field to given value.

### HasStockid

`func (o *StockSegmentBasicInformation) HasStockid() bool`

HasStockid returns a boolean if a field has been set.

### GetSymbol

`func (o *StockSegmentBasicInformation) GetSymbol() string`

GetSymbol returns the Symbol field if non-nil, zero value otherwise.

### GetSymbolOk

`func (o *StockSegmentBasicInformation) GetSymbolOk() (*string, bool)`

GetSymbolOk returns a tuple with the Symbol field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSymbol

`func (o *StockSegmentBasicInformation) SetSymbol(v string)`

SetSymbol sets Symbol field to given value.

### HasSymbol

`func (o *StockSegmentBasicInformation) HasSymbol() bool`

HasSymbol returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


