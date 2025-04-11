# GuruTransaction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Action** | Pointer to **string** | The transaction type: add, buy, reduce, sold out | [optional] 
**Change** | Pointer to **float32** |  | [optional] 
**Class** | Pointer to **string** | A unique identifier that describes the stock ticker&#39;s share class. Examples: Class A, Class C, ADR | [optional] 
**Comment** | Pointer to **string** |  | [optional] 
**CompanyName** | Pointer to **string** |  | [optional] 
**Exchange** | Pointer to **string** | The company&#39;s stock exchange. Example: NAS for Apple. | [optional] 
**Impact** | Pointer to **float32** | The ratio of the dollar value of the transaction relative to the total value of the portfolio. | [optional] 
**IndustryCode** | Pointer to **float32** |  | [optional] 
**Portdate** | Pointer to **string** | If the date is the end of quarters, the trades are made during the quarter ended on the dates. Otherwise, the dates are the estimated trade dates. | [optional] 
**Position** | Pointer to **float32** |  | [optional] 
**PriceAvg** | Pointer to **float32** |  | [optional] 
**PriceMax** | Pointer to **float32** | For a guru trade, the highest trading price over a specific quarter | [optional] 
**PriceMin** | Pointer to **float32** | For a guru trade, the minimum trading price over a specific quarter | [optional] 
**ShareChange** | Pointer to **float32** |  | [optional] 
**Shares** | Pointer to **float32** | Outstanding shares refer to a company&#39;s stock currently held by all its shareholders, including share blocks held by institutional investors and restricted shares owned by the company&#39;s officers and insiders. | [optional] 
**SharesOutstanding** | Pointer to **float32** | &lt;p&gt;{{Cash_Flow_from_Others}} may include {{ChangeInWorkingCapital}}. These are cash differences caused by the {{ChangeInInventory}}, {{AccountsPayable}}, {{Accts_Rec}} etc. For instance, if a company pays its suppliers slower, its cash position will build up faster. If a company receives payments from its customers slower, its {{Accts_Rec}} will rise, and its cash position will grow more slowly (or even shrink).&lt;/p&gt; | [optional] 
**SplitFactor** | Pointer to **float32** |  | [optional] 
**Stockid** | Pointer to **string** | A unique identifier for the stock | [optional] 
**Symbol** | Pointer to **string** | The company&#39;s stock ticker symbol | [optional] 
**Value** | Pointer to **float32** |  | [optional] 

## Methods

### NewGuruTransaction

`func NewGuruTransaction() *GuruTransaction`

NewGuruTransaction instantiates a new GuruTransaction object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGuruTransactionWithDefaults

`func NewGuruTransactionWithDefaults() *GuruTransaction`

NewGuruTransactionWithDefaults instantiates a new GuruTransaction object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAction

`func (o *GuruTransaction) GetAction() string`

GetAction returns the Action field if non-nil, zero value otherwise.

### GetActionOk

`func (o *GuruTransaction) GetActionOk() (*string, bool)`

GetActionOk returns a tuple with the Action field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAction

`func (o *GuruTransaction) SetAction(v string)`

SetAction sets Action field to given value.

### HasAction

`func (o *GuruTransaction) HasAction() bool`

HasAction returns a boolean if a field has been set.

### GetChange

`func (o *GuruTransaction) GetChange() float32`

GetChange returns the Change field if non-nil, zero value otherwise.

### GetChangeOk

`func (o *GuruTransaction) GetChangeOk() (*float32, bool)`

GetChangeOk returns a tuple with the Change field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChange

`func (o *GuruTransaction) SetChange(v float32)`

SetChange sets Change field to given value.

### HasChange

`func (o *GuruTransaction) HasChange() bool`

HasChange returns a boolean if a field has been set.

### GetClass

`func (o *GuruTransaction) GetClass() string`

GetClass returns the Class field if non-nil, zero value otherwise.

### GetClassOk

`func (o *GuruTransaction) GetClassOk() (*string, bool)`

GetClassOk returns a tuple with the Class field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClass

`func (o *GuruTransaction) SetClass(v string)`

SetClass sets Class field to given value.

### HasClass

`func (o *GuruTransaction) HasClass() bool`

HasClass returns a boolean if a field has been set.

### GetComment

`func (o *GuruTransaction) GetComment() string`

GetComment returns the Comment field if non-nil, zero value otherwise.

### GetCommentOk

`func (o *GuruTransaction) GetCommentOk() (*string, bool)`

GetCommentOk returns a tuple with the Comment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComment

`func (o *GuruTransaction) SetComment(v string)`

SetComment sets Comment field to given value.

### HasComment

`func (o *GuruTransaction) HasComment() bool`

HasComment returns a boolean if a field has been set.

### GetCompanyName

`func (o *GuruTransaction) GetCompanyName() string`

GetCompanyName returns the CompanyName field if non-nil, zero value otherwise.

### GetCompanyNameOk

`func (o *GuruTransaction) GetCompanyNameOk() (*string, bool)`

GetCompanyNameOk returns a tuple with the CompanyName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompanyName

`func (o *GuruTransaction) SetCompanyName(v string)`

SetCompanyName sets CompanyName field to given value.

### HasCompanyName

`func (o *GuruTransaction) HasCompanyName() bool`

HasCompanyName returns a boolean if a field has been set.

### GetExchange

`func (o *GuruTransaction) GetExchange() string`

GetExchange returns the Exchange field if non-nil, zero value otherwise.

### GetExchangeOk

`func (o *GuruTransaction) GetExchangeOk() (*string, bool)`

GetExchangeOk returns a tuple with the Exchange field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExchange

`func (o *GuruTransaction) SetExchange(v string)`

SetExchange sets Exchange field to given value.

### HasExchange

`func (o *GuruTransaction) HasExchange() bool`

HasExchange returns a boolean if a field has been set.

### GetImpact

`func (o *GuruTransaction) GetImpact() float32`

GetImpact returns the Impact field if non-nil, zero value otherwise.

### GetImpactOk

`func (o *GuruTransaction) GetImpactOk() (*float32, bool)`

GetImpactOk returns a tuple with the Impact field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImpact

`func (o *GuruTransaction) SetImpact(v float32)`

SetImpact sets Impact field to given value.

### HasImpact

`func (o *GuruTransaction) HasImpact() bool`

HasImpact returns a boolean if a field has been set.

### GetIndustryCode

`func (o *GuruTransaction) GetIndustryCode() float32`

GetIndustryCode returns the IndustryCode field if non-nil, zero value otherwise.

### GetIndustryCodeOk

`func (o *GuruTransaction) GetIndustryCodeOk() (*float32, bool)`

GetIndustryCodeOk returns a tuple with the IndustryCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndustryCode

`func (o *GuruTransaction) SetIndustryCode(v float32)`

SetIndustryCode sets IndustryCode field to given value.

### HasIndustryCode

`func (o *GuruTransaction) HasIndustryCode() bool`

HasIndustryCode returns a boolean if a field has been set.

### GetPortdate

`func (o *GuruTransaction) GetPortdate() string`

GetPortdate returns the Portdate field if non-nil, zero value otherwise.

### GetPortdateOk

`func (o *GuruTransaction) GetPortdateOk() (*string, bool)`

GetPortdateOk returns a tuple with the Portdate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPortdate

`func (o *GuruTransaction) SetPortdate(v string)`

SetPortdate sets Portdate field to given value.

### HasPortdate

`func (o *GuruTransaction) HasPortdate() bool`

HasPortdate returns a boolean if a field has been set.

### GetPosition

`func (o *GuruTransaction) GetPosition() float32`

GetPosition returns the Position field if non-nil, zero value otherwise.

### GetPositionOk

`func (o *GuruTransaction) GetPositionOk() (*float32, bool)`

GetPositionOk returns a tuple with the Position field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPosition

`func (o *GuruTransaction) SetPosition(v float32)`

SetPosition sets Position field to given value.

### HasPosition

`func (o *GuruTransaction) HasPosition() bool`

HasPosition returns a boolean if a field has been set.

### GetPriceAvg

`func (o *GuruTransaction) GetPriceAvg() float32`

GetPriceAvg returns the PriceAvg field if non-nil, zero value otherwise.

### GetPriceAvgOk

`func (o *GuruTransaction) GetPriceAvgOk() (*float32, bool)`

GetPriceAvgOk returns a tuple with the PriceAvg field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriceAvg

`func (o *GuruTransaction) SetPriceAvg(v float32)`

SetPriceAvg sets PriceAvg field to given value.

### HasPriceAvg

`func (o *GuruTransaction) HasPriceAvg() bool`

HasPriceAvg returns a boolean if a field has been set.

### GetPriceMax

`func (o *GuruTransaction) GetPriceMax() float32`

GetPriceMax returns the PriceMax field if non-nil, zero value otherwise.

### GetPriceMaxOk

`func (o *GuruTransaction) GetPriceMaxOk() (*float32, bool)`

GetPriceMaxOk returns a tuple with the PriceMax field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriceMax

`func (o *GuruTransaction) SetPriceMax(v float32)`

SetPriceMax sets PriceMax field to given value.

### HasPriceMax

`func (o *GuruTransaction) HasPriceMax() bool`

HasPriceMax returns a boolean if a field has been set.

### GetPriceMin

`func (o *GuruTransaction) GetPriceMin() float32`

GetPriceMin returns the PriceMin field if non-nil, zero value otherwise.

### GetPriceMinOk

`func (o *GuruTransaction) GetPriceMinOk() (*float32, bool)`

GetPriceMinOk returns a tuple with the PriceMin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriceMin

`func (o *GuruTransaction) SetPriceMin(v float32)`

SetPriceMin sets PriceMin field to given value.

### HasPriceMin

`func (o *GuruTransaction) HasPriceMin() bool`

HasPriceMin returns a boolean if a field has been set.

### GetShareChange

`func (o *GuruTransaction) GetShareChange() float32`

GetShareChange returns the ShareChange field if non-nil, zero value otherwise.

### GetShareChangeOk

`func (o *GuruTransaction) GetShareChangeOk() (*float32, bool)`

GetShareChangeOk returns a tuple with the ShareChange field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShareChange

`func (o *GuruTransaction) SetShareChange(v float32)`

SetShareChange sets ShareChange field to given value.

### HasShareChange

`func (o *GuruTransaction) HasShareChange() bool`

HasShareChange returns a boolean if a field has been set.

### GetShares

`func (o *GuruTransaction) GetShares() float32`

GetShares returns the Shares field if non-nil, zero value otherwise.

### GetSharesOk

`func (o *GuruTransaction) GetSharesOk() (*float32, bool)`

GetSharesOk returns a tuple with the Shares field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShares

`func (o *GuruTransaction) SetShares(v float32)`

SetShares sets Shares field to given value.

### HasShares

`func (o *GuruTransaction) HasShares() bool`

HasShares returns a boolean if a field has been set.

### GetSharesOutstanding

`func (o *GuruTransaction) GetSharesOutstanding() float32`

GetSharesOutstanding returns the SharesOutstanding field if non-nil, zero value otherwise.

### GetSharesOutstandingOk

`func (o *GuruTransaction) GetSharesOutstandingOk() (*float32, bool)`

GetSharesOutstandingOk returns a tuple with the SharesOutstanding field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSharesOutstanding

`func (o *GuruTransaction) SetSharesOutstanding(v float32)`

SetSharesOutstanding sets SharesOutstanding field to given value.

### HasSharesOutstanding

`func (o *GuruTransaction) HasSharesOutstanding() bool`

HasSharesOutstanding returns a boolean if a field has been set.

### GetSplitFactor

`func (o *GuruTransaction) GetSplitFactor() float32`

GetSplitFactor returns the SplitFactor field if non-nil, zero value otherwise.

### GetSplitFactorOk

`func (o *GuruTransaction) GetSplitFactorOk() (*float32, bool)`

GetSplitFactorOk returns a tuple with the SplitFactor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSplitFactor

`func (o *GuruTransaction) SetSplitFactor(v float32)`

SetSplitFactor sets SplitFactor field to given value.

### HasSplitFactor

`func (o *GuruTransaction) HasSplitFactor() bool`

HasSplitFactor returns a boolean if a field has been set.

### GetStockid

`func (o *GuruTransaction) GetStockid() string`

GetStockid returns the Stockid field if non-nil, zero value otherwise.

### GetStockidOk

`func (o *GuruTransaction) GetStockidOk() (*string, bool)`

GetStockidOk returns a tuple with the Stockid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStockid

`func (o *GuruTransaction) SetStockid(v string)`

SetStockid sets Stockid field to given value.

### HasStockid

`func (o *GuruTransaction) HasStockid() bool`

HasStockid returns a boolean if a field has been set.

### GetSymbol

`func (o *GuruTransaction) GetSymbol() string`

GetSymbol returns the Symbol field if non-nil, zero value otherwise.

### GetSymbolOk

`func (o *GuruTransaction) GetSymbolOk() (*string, bool)`

GetSymbolOk returns a tuple with the Symbol field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSymbol

`func (o *GuruTransaction) SetSymbol(v string)`

SetSymbol sets Symbol field to given value.

### HasSymbol

`func (o *GuruTransaction) HasSymbol() bool`

HasSymbol returns a boolean if a field has been set.

### GetValue

`func (o *GuruTransaction) GetValue() float32`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *GuruTransaction) GetValueOk() (*float32, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *GuruTransaction) SetValue(v float32)`

SetValue sets Value field to given value.

### HasValue

`func (o *GuruTransaction) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


