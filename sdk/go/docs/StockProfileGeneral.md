# StockProfileGeneral

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IPODate** | Pointer to **string** | The date of the company&#39;s initial public offering. | [optional] 
**IsDirect** | Pointer to **string** | Does the company report its cash flow statement using the direct method (cash collections, cash payments) or the indirect method (net income -&gt; free cash flow)? | [optional] 
**NAICS** | Pointer to **float32** | A six-digit code that identifies the company&#39;s main business operation | [optional] 
**Cik** | Pointer to **string** | A unique 10-digit number the SEC assigns to companies, mutual funds and hedge funds | [optional] 
**ClassDescpt** | Pointer to **string** | A unique identifier that describes the stock ticker&#39;s share class. Examples: Class A, Class C, ADR | [optional] 
**Company** | Pointer to **string** | The name of the company as identified on its SEC filings. | [optional] 
**CompanyId** | Pointer to **string** |  | [optional] 
**CountryIso** | Pointer to **string** | The country containing the company&#39;s headquarters. | [optional] 
**Currency** | Pointer to **string** | The currency symbol used to report a company&#39;s financial data. For example, NYSE stocks have currency USD | [optional] 
**CurrencyComp** | Pointer to **string** | The currency symbol used to report a company&#39;s financial data. For example, NYSE stocks have currency USD | [optional] 
**DepositaryReceiptRatio** | Pointer to **float32** |  | [optional] 
**Exchange** | Pointer to **string** | The company&#39;s stock exchange. Example: NAS for Apple. | [optional] 
**FiscalYearEnd** | Pointer to **float32** | The month representing the company&#39;s fiscal year end. | [optional] 
**Group** | Pointer to **string** |  | [optional] 
**IndTemplate** | Pointer to **string** | The company&#39;s financial statement type: either bank, insurance or nonfinancial | [optional] 
**Industry** | Pointer to **string** | The company&#39;s industry. Example: Discount Stores for WMT. | [optional] 
**LatestQuarter** | Pointer to **string** | The company&#39;s latest quarter-end date | [optional] 
**OptionableStock** | Pointer to **bool** | Does the stock offer options? If yes, the stock is \&quot;optionable.\&quot; | [optional] 
**PrimaryExch** | Pointer to **string** | The stock ticker&#39;s primary exchange, which most likely connects to the company&#39;s headquarter country | [optional] 
**PrimaryStockid** | Pointer to **string** |  | [optional] 
**PrimarySymbol** | Pointer to **string** | The ticker symbol the company trades under its primary exchange | [optional] 
**ReportFrequency** | Pointer to **string** | How frequently does a company report its earnings? | [optional] 
**Sector** | Pointer to **string** | A three-digit code indicating a company&#39;s market sector | [optional] 
**Sic** | Pointer to **float32** | A four-digit code that classifies a company by its business type | [optional] 
**Stockid** | Pointer to **string** | A unique identifier for the stock | [optional] 
**Symbol** | Pointer to **string** | The company&#39;s stock ticker symbol | [optional] 
**Type** | Pointer to **string** | A code that determines if a security represents common stock or preferred stock | [optional] 

## Methods

### NewStockProfileGeneral

`func NewStockProfileGeneral() *StockProfileGeneral`

NewStockProfileGeneral instantiates a new StockProfileGeneral object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStockProfileGeneralWithDefaults

`func NewStockProfileGeneralWithDefaults() *StockProfileGeneral`

NewStockProfileGeneralWithDefaults instantiates a new StockProfileGeneral object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIPODate

`func (o *StockProfileGeneral) GetIPODate() string`

GetIPODate returns the IPODate field if non-nil, zero value otherwise.

### GetIPODateOk

`func (o *StockProfileGeneral) GetIPODateOk() (*string, bool)`

GetIPODateOk returns a tuple with the IPODate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIPODate

`func (o *StockProfileGeneral) SetIPODate(v string)`

SetIPODate sets IPODate field to given value.

### HasIPODate

`func (o *StockProfileGeneral) HasIPODate() bool`

HasIPODate returns a boolean if a field has been set.

### GetIsDirect

`func (o *StockProfileGeneral) GetIsDirect() string`

GetIsDirect returns the IsDirect field if non-nil, zero value otherwise.

### GetIsDirectOk

`func (o *StockProfileGeneral) GetIsDirectOk() (*string, bool)`

GetIsDirectOk returns a tuple with the IsDirect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsDirect

`func (o *StockProfileGeneral) SetIsDirect(v string)`

SetIsDirect sets IsDirect field to given value.

### HasIsDirect

`func (o *StockProfileGeneral) HasIsDirect() bool`

HasIsDirect returns a boolean if a field has been set.

### GetNAICS

`func (o *StockProfileGeneral) GetNAICS() float32`

GetNAICS returns the NAICS field if non-nil, zero value otherwise.

### GetNAICSOk

`func (o *StockProfileGeneral) GetNAICSOk() (*float32, bool)`

GetNAICSOk returns a tuple with the NAICS field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNAICS

`func (o *StockProfileGeneral) SetNAICS(v float32)`

SetNAICS sets NAICS field to given value.

### HasNAICS

`func (o *StockProfileGeneral) HasNAICS() bool`

HasNAICS returns a boolean if a field has been set.

### GetCik

`func (o *StockProfileGeneral) GetCik() string`

GetCik returns the Cik field if non-nil, zero value otherwise.

### GetCikOk

`func (o *StockProfileGeneral) GetCikOk() (*string, bool)`

GetCikOk returns a tuple with the Cik field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCik

`func (o *StockProfileGeneral) SetCik(v string)`

SetCik sets Cik field to given value.

### HasCik

`func (o *StockProfileGeneral) HasCik() bool`

HasCik returns a boolean if a field has been set.

### GetClassDescpt

`func (o *StockProfileGeneral) GetClassDescpt() string`

GetClassDescpt returns the ClassDescpt field if non-nil, zero value otherwise.

### GetClassDescptOk

`func (o *StockProfileGeneral) GetClassDescptOk() (*string, bool)`

GetClassDescptOk returns a tuple with the ClassDescpt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClassDescpt

`func (o *StockProfileGeneral) SetClassDescpt(v string)`

SetClassDescpt sets ClassDescpt field to given value.

### HasClassDescpt

`func (o *StockProfileGeneral) HasClassDescpt() bool`

HasClassDescpt returns a boolean if a field has been set.

### GetCompany

`func (o *StockProfileGeneral) GetCompany() string`

GetCompany returns the Company field if non-nil, zero value otherwise.

### GetCompanyOk

`func (o *StockProfileGeneral) GetCompanyOk() (*string, bool)`

GetCompanyOk returns a tuple with the Company field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompany

`func (o *StockProfileGeneral) SetCompany(v string)`

SetCompany sets Company field to given value.

### HasCompany

`func (o *StockProfileGeneral) HasCompany() bool`

HasCompany returns a boolean if a field has been set.

### GetCompanyId

`func (o *StockProfileGeneral) GetCompanyId() string`

GetCompanyId returns the CompanyId field if non-nil, zero value otherwise.

### GetCompanyIdOk

`func (o *StockProfileGeneral) GetCompanyIdOk() (*string, bool)`

GetCompanyIdOk returns a tuple with the CompanyId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompanyId

`func (o *StockProfileGeneral) SetCompanyId(v string)`

SetCompanyId sets CompanyId field to given value.

### HasCompanyId

`func (o *StockProfileGeneral) HasCompanyId() bool`

HasCompanyId returns a boolean if a field has been set.

### GetCountryIso

`func (o *StockProfileGeneral) GetCountryIso() string`

GetCountryIso returns the CountryIso field if non-nil, zero value otherwise.

### GetCountryIsoOk

`func (o *StockProfileGeneral) GetCountryIsoOk() (*string, bool)`

GetCountryIsoOk returns a tuple with the CountryIso field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountryIso

`func (o *StockProfileGeneral) SetCountryIso(v string)`

SetCountryIso sets CountryIso field to given value.

### HasCountryIso

`func (o *StockProfileGeneral) HasCountryIso() bool`

HasCountryIso returns a boolean if a field has been set.

### GetCurrency

`func (o *StockProfileGeneral) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *StockProfileGeneral) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *StockProfileGeneral) SetCurrency(v string)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *StockProfileGeneral) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetCurrencyComp

`func (o *StockProfileGeneral) GetCurrencyComp() string`

GetCurrencyComp returns the CurrencyComp field if non-nil, zero value otherwise.

### GetCurrencyCompOk

`func (o *StockProfileGeneral) GetCurrencyCompOk() (*string, bool)`

GetCurrencyCompOk returns a tuple with the CurrencyComp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrencyComp

`func (o *StockProfileGeneral) SetCurrencyComp(v string)`

SetCurrencyComp sets CurrencyComp field to given value.

### HasCurrencyComp

`func (o *StockProfileGeneral) HasCurrencyComp() bool`

HasCurrencyComp returns a boolean if a field has been set.

### GetDepositaryReceiptRatio

`func (o *StockProfileGeneral) GetDepositaryReceiptRatio() float32`

GetDepositaryReceiptRatio returns the DepositaryReceiptRatio field if non-nil, zero value otherwise.

### GetDepositaryReceiptRatioOk

`func (o *StockProfileGeneral) GetDepositaryReceiptRatioOk() (*float32, bool)`

GetDepositaryReceiptRatioOk returns a tuple with the DepositaryReceiptRatio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDepositaryReceiptRatio

`func (o *StockProfileGeneral) SetDepositaryReceiptRatio(v float32)`

SetDepositaryReceiptRatio sets DepositaryReceiptRatio field to given value.

### HasDepositaryReceiptRatio

`func (o *StockProfileGeneral) HasDepositaryReceiptRatio() bool`

HasDepositaryReceiptRatio returns a boolean if a field has been set.

### GetExchange

`func (o *StockProfileGeneral) GetExchange() string`

GetExchange returns the Exchange field if non-nil, zero value otherwise.

### GetExchangeOk

`func (o *StockProfileGeneral) GetExchangeOk() (*string, bool)`

GetExchangeOk returns a tuple with the Exchange field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExchange

`func (o *StockProfileGeneral) SetExchange(v string)`

SetExchange sets Exchange field to given value.

### HasExchange

`func (o *StockProfileGeneral) HasExchange() bool`

HasExchange returns a boolean if a field has been set.

### GetFiscalYearEnd

`func (o *StockProfileGeneral) GetFiscalYearEnd() float32`

GetFiscalYearEnd returns the FiscalYearEnd field if non-nil, zero value otherwise.

### GetFiscalYearEndOk

`func (o *StockProfileGeneral) GetFiscalYearEndOk() (*float32, bool)`

GetFiscalYearEndOk returns a tuple with the FiscalYearEnd field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiscalYearEnd

`func (o *StockProfileGeneral) SetFiscalYearEnd(v float32)`

SetFiscalYearEnd sets FiscalYearEnd field to given value.

### HasFiscalYearEnd

`func (o *StockProfileGeneral) HasFiscalYearEnd() bool`

HasFiscalYearEnd returns a boolean if a field has been set.

### GetGroup

`func (o *StockProfileGeneral) GetGroup() string`

GetGroup returns the Group field if non-nil, zero value otherwise.

### GetGroupOk

`func (o *StockProfileGeneral) GetGroupOk() (*string, bool)`

GetGroupOk returns a tuple with the Group field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroup

`func (o *StockProfileGeneral) SetGroup(v string)`

SetGroup sets Group field to given value.

### HasGroup

`func (o *StockProfileGeneral) HasGroup() bool`

HasGroup returns a boolean if a field has been set.

### GetIndTemplate

`func (o *StockProfileGeneral) GetIndTemplate() string`

GetIndTemplate returns the IndTemplate field if non-nil, zero value otherwise.

### GetIndTemplateOk

`func (o *StockProfileGeneral) GetIndTemplateOk() (*string, bool)`

GetIndTemplateOk returns a tuple with the IndTemplate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndTemplate

`func (o *StockProfileGeneral) SetIndTemplate(v string)`

SetIndTemplate sets IndTemplate field to given value.

### HasIndTemplate

`func (o *StockProfileGeneral) HasIndTemplate() bool`

HasIndTemplate returns a boolean if a field has been set.

### GetIndustry

`func (o *StockProfileGeneral) GetIndustry() string`

GetIndustry returns the Industry field if non-nil, zero value otherwise.

### GetIndustryOk

`func (o *StockProfileGeneral) GetIndustryOk() (*string, bool)`

GetIndustryOk returns a tuple with the Industry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndustry

`func (o *StockProfileGeneral) SetIndustry(v string)`

SetIndustry sets Industry field to given value.

### HasIndustry

`func (o *StockProfileGeneral) HasIndustry() bool`

HasIndustry returns a boolean if a field has been set.

### GetLatestQuarter

`func (o *StockProfileGeneral) GetLatestQuarter() string`

GetLatestQuarter returns the LatestQuarter field if non-nil, zero value otherwise.

### GetLatestQuarterOk

`func (o *StockProfileGeneral) GetLatestQuarterOk() (*string, bool)`

GetLatestQuarterOk returns a tuple with the LatestQuarter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatestQuarter

`func (o *StockProfileGeneral) SetLatestQuarter(v string)`

SetLatestQuarter sets LatestQuarter field to given value.

### HasLatestQuarter

`func (o *StockProfileGeneral) HasLatestQuarter() bool`

HasLatestQuarter returns a boolean if a field has been set.

### GetOptionableStock

`func (o *StockProfileGeneral) GetOptionableStock() bool`

GetOptionableStock returns the OptionableStock field if non-nil, zero value otherwise.

### GetOptionableStockOk

`func (o *StockProfileGeneral) GetOptionableStockOk() (*bool, bool)`

GetOptionableStockOk returns a tuple with the OptionableStock field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptionableStock

`func (o *StockProfileGeneral) SetOptionableStock(v bool)`

SetOptionableStock sets OptionableStock field to given value.

### HasOptionableStock

`func (o *StockProfileGeneral) HasOptionableStock() bool`

HasOptionableStock returns a boolean if a field has been set.

### GetPrimaryExch

`func (o *StockProfileGeneral) GetPrimaryExch() string`

GetPrimaryExch returns the PrimaryExch field if non-nil, zero value otherwise.

### GetPrimaryExchOk

`func (o *StockProfileGeneral) GetPrimaryExchOk() (*string, bool)`

GetPrimaryExchOk returns a tuple with the PrimaryExch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrimaryExch

`func (o *StockProfileGeneral) SetPrimaryExch(v string)`

SetPrimaryExch sets PrimaryExch field to given value.

### HasPrimaryExch

`func (o *StockProfileGeneral) HasPrimaryExch() bool`

HasPrimaryExch returns a boolean if a field has been set.

### GetPrimaryStockid

`func (o *StockProfileGeneral) GetPrimaryStockid() string`

GetPrimaryStockid returns the PrimaryStockid field if non-nil, zero value otherwise.

### GetPrimaryStockidOk

`func (o *StockProfileGeneral) GetPrimaryStockidOk() (*string, bool)`

GetPrimaryStockidOk returns a tuple with the PrimaryStockid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrimaryStockid

`func (o *StockProfileGeneral) SetPrimaryStockid(v string)`

SetPrimaryStockid sets PrimaryStockid field to given value.

### HasPrimaryStockid

`func (o *StockProfileGeneral) HasPrimaryStockid() bool`

HasPrimaryStockid returns a boolean if a field has been set.

### GetPrimarySymbol

`func (o *StockProfileGeneral) GetPrimarySymbol() string`

GetPrimarySymbol returns the PrimarySymbol field if non-nil, zero value otherwise.

### GetPrimarySymbolOk

`func (o *StockProfileGeneral) GetPrimarySymbolOk() (*string, bool)`

GetPrimarySymbolOk returns a tuple with the PrimarySymbol field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrimarySymbol

`func (o *StockProfileGeneral) SetPrimarySymbol(v string)`

SetPrimarySymbol sets PrimarySymbol field to given value.

### HasPrimarySymbol

`func (o *StockProfileGeneral) HasPrimarySymbol() bool`

HasPrimarySymbol returns a boolean if a field has been set.

### GetReportFrequency

`func (o *StockProfileGeneral) GetReportFrequency() string`

GetReportFrequency returns the ReportFrequency field if non-nil, zero value otherwise.

### GetReportFrequencyOk

`func (o *StockProfileGeneral) GetReportFrequencyOk() (*string, bool)`

GetReportFrequencyOk returns a tuple with the ReportFrequency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportFrequency

`func (o *StockProfileGeneral) SetReportFrequency(v string)`

SetReportFrequency sets ReportFrequency field to given value.

### HasReportFrequency

`func (o *StockProfileGeneral) HasReportFrequency() bool`

HasReportFrequency returns a boolean if a field has been set.

### GetSector

`func (o *StockProfileGeneral) GetSector() string`

GetSector returns the Sector field if non-nil, zero value otherwise.

### GetSectorOk

`func (o *StockProfileGeneral) GetSectorOk() (*string, bool)`

GetSectorOk returns a tuple with the Sector field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSector

`func (o *StockProfileGeneral) SetSector(v string)`

SetSector sets Sector field to given value.

### HasSector

`func (o *StockProfileGeneral) HasSector() bool`

HasSector returns a boolean if a field has been set.

### GetSic

`func (o *StockProfileGeneral) GetSic() float32`

GetSic returns the Sic field if non-nil, zero value otherwise.

### GetSicOk

`func (o *StockProfileGeneral) GetSicOk() (*float32, bool)`

GetSicOk returns a tuple with the Sic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSic

`func (o *StockProfileGeneral) SetSic(v float32)`

SetSic sets Sic field to given value.

### HasSic

`func (o *StockProfileGeneral) HasSic() bool`

HasSic returns a boolean if a field has been set.

### GetStockid

`func (o *StockProfileGeneral) GetStockid() string`

GetStockid returns the Stockid field if non-nil, zero value otherwise.

### GetStockidOk

`func (o *StockProfileGeneral) GetStockidOk() (*string, bool)`

GetStockidOk returns a tuple with the Stockid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStockid

`func (o *StockProfileGeneral) SetStockid(v string)`

SetStockid sets Stockid field to given value.

### HasStockid

`func (o *StockProfileGeneral) HasStockid() bool`

HasStockid returns a boolean if a field has been set.

### GetSymbol

`func (o *StockProfileGeneral) GetSymbol() string`

GetSymbol returns the Symbol field if non-nil, zero value otherwise.

### GetSymbolOk

`func (o *StockProfileGeneral) GetSymbolOk() (*string, bool)`

GetSymbolOk returns a tuple with the Symbol field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSymbol

`func (o *StockProfileGeneral) SetSymbol(v string)`

SetSymbol sets Symbol field to given value.

### HasSymbol

`func (o *StockProfileGeneral) HasSymbol() bool`

HasSymbol returns a boolean if a field has been set.

### GetType

`func (o *StockProfileGeneral) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *StockProfileGeneral) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *StockProfileGeneral) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *StockProfileGeneral) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


