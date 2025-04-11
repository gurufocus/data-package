# ValuationsINOREITNODIRECTValuationandQuality

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Beta** | Pointer to **float32** | Beta measures the volatility or systematic risk of a security in comparison to the market. It is calculated using the latest three years of monthly returns of the stock and the benchmark.&lt;br&gt;- A beta of 1 indicates that the stock&#39;s price will move with the market. &lt;br&gt;- A beta of less than 1 indicates that the stock will be less volatile than the market. &lt;br&gt;- A beta greater than 1 indicates that the stock&#39;s price will be more volatile than the market. | [optional] 
**BsShare** | Pointer to **float32** |  | [optional] 
**BuybackYield** | Pointer to **float32** |  | [optional] 
**EarningsReleaseDate** | Pointer to **string** |  | [optional] 
**Ebitda5yGrowth** | Pointer to **float32** | EBITDA per Share is the amount of Earnings Before Interest, Taxes, Depreciation, and Amortization (EBITDA) per outstanding share of the company&#39;s stock. | [optional] 
**EnterpriseValue** | Pointer to **float32** | Enterprise Value is calculated as the market cap plus debt and minority interest and preferred shares, minus total cash, cash equivalents, and marketable securities. | [optional] 
**Epv** | Pointer to **float32** | Earnings power value (EPV) is a technique for valuing stocks by making assumptions about the sustainability of current earnings and the cost of capital but not future growth. | [optional] 
**FilingDate** | Pointer to **string** |  | [optional] 
**FilingDateAor** | Pointer to **string** |  | [optional] 
**ForexRate** | Pointer to **float32** | The month-end forex rates between the headquarter currency and the reporting currency | [optional] 
**Fscore** | Pointer to **float32** | Piotroski F-Score is a number between 0-9 which is used to assess strength of company&#39;s financial position. | [optional] 
**GrahamNumber** | Pointer to **float32** | Graham Number is a concept based on Ben Graham\\&#39;s conservative valuation of companies. Graham Number is calculated as follows:    Graham Number &#x3D; SquareRoot of (22.5 * {Tangible Book Value per Share} * {Earnings per Share})    &#x3D; SquareRoot of (22.5 * {Net Income} * {Total Equity}) / {Total Shares Outstanding} | [optional] 
**GrowthPerShareEbitda** | Pointer to **float32** | EBITDA per Share is the amount of Earnings Before Interest, Taxes, Depreciation, and Amortization (EBITDA) per outstanding share of the company&#39;s stock. | [optional] 
**GrowthPerShareEps** | Pointer to **float32** | The company&#39;s earnings per share growth year over year | [optional] 
**GrowthRevenuePerShare** | Pointer to **float32** | The company&#39;s revenue per share growth year over year | [optional] 
**InterestCoverage** | Pointer to **float32** | Interest Coverage is a ratio that determines how easily a company can pay interest expenses on outstanding debt. | [optional] 
**IntrinsicValueProjectedFcf** | Pointer to **float32** | The Discounted Free Cash Flow Screener focuses on Free Cash Flow (FCF) and Total Equity. These measures can be used to determine an intrinsic value estimate for a company. | [optional] 
**Medpsvalue** | Pointer to **float32** | This valuation method assumes that the stock valuation will revert to its historical mean in terms of Price/Sales Ratio. | [optional] 
**Mktcap** | Pointer to **float32** | Market cap is the short version of market capitalization. It is the total market value to buy the whole company. It is equal to the share price times the number of shares outstanding. | [optional] 
**MonthEndStockPrice** | Pointer to **float32** | The company&#39;s share price at the final day of the month | [optional] 
**Mscore** | Pointer to **float32** | Beneish&#39;s M-Score is a mathematical model that uses eight financial ratios weighted by coefficients to identify whether a company has manipulated its profits. | [optional] 
**NetCashPerShare** | Pointer to **float32** | Equals cash and cash equivalents less total liabilities less minority interest | [optional] 
**NetCurrentAssetValue** | Pointer to **float32** | In calculating the Net Current Asset Value (NCAV), Benjamin Graham means a company&#39;s current assets (such as cash, marketable securities, and inventories) minus its total liabilities (including preferred stock, minority interest, and long-term debt). | [optional] 
**NetNetWorkingCapital** | Pointer to **float32** | A net-net is a company with a market capitalization that is less than the company&#39;s current assets minus total liabilities, or equivalently, the company&#39;s working capital minus long-term liabilities. This value is called the net current asset value. | [optional] 
**NumberOfShareHolders** | Pointer to **float32** | The total number of shareholders for a company | [optional] 
**PeterLynchFairValue** | Pointer to **float32** | Peter Lynch Fair Value applies to growing companies. The ideal range for the growth rate is between 10 - 20% a year. | [optional] 
**PriceHigh** | Pointer to **float32** |  | [optional] 
**PriceLow** | Pointer to **float32** |  | [optional] 
**ShareBuybackRatio** | Pointer to **float32** | The rate a company repurchases its shares | [optional] 
**ShareholderYield** | Pointer to **float32** |  | [optional] 
**SharesBasic** | Pointer to **float32** | &lt;p&gt;Shares outstanding are shares that have been authorized, issued, and purchased by investors and are held by them. They have voting rights and represent ownership in the corporation by the person that holds the shares. They should be distinguished from treasury shares, which are shares held by the corporation itself, having no exercisable rights. Shares outstanding can be calculated as either basic or fully diluted. The {{Shares_Outstanding}} count includes diluting securities, such as options, warrants or convertibles.&lt;/p&gt; | [optional] 
**SloanRatio** | Pointer to **float32** | Richard Sloan from the University of Michigan was first to document what is referred to as the &#39;accrual anomaly&#39;. His 1996 paper found that shares of companies with small or negative accruals vastly outperform (+10%) those of companies with large ones. | [optional] 
**Snoa** | Pointer to **float32** | Scaled net operating assets (SNOA) is calculated as the difference between  operating assets and operating liabilities, scaled by lagged total assets. | [optional] 
**TotalEmployeeNumber** | Pointer to **float32** | The total number of employees for a company | [optional] 

## Methods

### NewValuationsINOREITNODIRECTValuationandQuality

`func NewValuationsINOREITNODIRECTValuationandQuality() *ValuationsINOREITNODIRECTValuationandQuality`

NewValuationsINOREITNODIRECTValuationandQuality instantiates a new ValuationsINOREITNODIRECTValuationandQuality object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewValuationsINOREITNODIRECTValuationandQualityWithDefaults

`func NewValuationsINOREITNODIRECTValuationandQualityWithDefaults() *ValuationsINOREITNODIRECTValuationandQuality`

NewValuationsINOREITNODIRECTValuationandQualityWithDefaults instantiates a new ValuationsINOREITNODIRECTValuationandQuality object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBeta

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetBeta() float32`

GetBeta returns the Beta field if non-nil, zero value otherwise.

### GetBetaOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetBetaOk() (*float32, bool)`

GetBetaOk returns a tuple with the Beta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBeta

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetBeta(v float32)`

SetBeta sets Beta field to given value.

### HasBeta

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasBeta() bool`

HasBeta returns a boolean if a field has been set.

### GetBsShare

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetBsShare() float32`

GetBsShare returns the BsShare field if non-nil, zero value otherwise.

### GetBsShareOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetBsShareOk() (*float32, bool)`

GetBsShareOk returns a tuple with the BsShare field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBsShare

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetBsShare(v float32)`

SetBsShare sets BsShare field to given value.

### HasBsShare

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasBsShare() bool`

HasBsShare returns a boolean if a field has been set.

### GetBuybackYield

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetBuybackYield() float32`

GetBuybackYield returns the BuybackYield field if non-nil, zero value otherwise.

### GetBuybackYieldOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetBuybackYieldOk() (*float32, bool)`

GetBuybackYieldOk returns a tuple with the BuybackYield field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBuybackYield

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetBuybackYield(v float32)`

SetBuybackYield sets BuybackYield field to given value.

### HasBuybackYield

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasBuybackYield() bool`

HasBuybackYield returns a boolean if a field has been set.

### GetEarningsReleaseDate

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetEarningsReleaseDate() string`

GetEarningsReleaseDate returns the EarningsReleaseDate field if non-nil, zero value otherwise.

### GetEarningsReleaseDateOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetEarningsReleaseDateOk() (*string, bool)`

GetEarningsReleaseDateOk returns a tuple with the EarningsReleaseDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEarningsReleaseDate

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetEarningsReleaseDate(v string)`

SetEarningsReleaseDate sets EarningsReleaseDate field to given value.

### HasEarningsReleaseDate

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasEarningsReleaseDate() bool`

HasEarningsReleaseDate returns a boolean if a field has been set.

### GetEbitda5yGrowth

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetEbitda5yGrowth() float32`

GetEbitda5yGrowth returns the Ebitda5yGrowth field if non-nil, zero value otherwise.

### GetEbitda5yGrowthOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetEbitda5yGrowthOk() (*float32, bool)`

GetEbitda5yGrowthOk returns a tuple with the Ebitda5yGrowth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEbitda5yGrowth

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetEbitda5yGrowth(v float32)`

SetEbitda5yGrowth sets Ebitda5yGrowth field to given value.

### HasEbitda5yGrowth

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasEbitda5yGrowth() bool`

HasEbitda5yGrowth returns a boolean if a field has been set.

### GetEnterpriseValue

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetEnterpriseValue() float32`

GetEnterpriseValue returns the EnterpriseValue field if non-nil, zero value otherwise.

### GetEnterpriseValueOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetEnterpriseValueOk() (*float32, bool)`

GetEnterpriseValueOk returns a tuple with the EnterpriseValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnterpriseValue

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetEnterpriseValue(v float32)`

SetEnterpriseValue sets EnterpriseValue field to given value.

### HasEnterpriseValue

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasEnterpriseValue() bool`

HasEnterpriseValue returns a boolean if a field has been set.

### GetEpv

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetEpv() float32`

GetEpv returns the Epv field if non-nil, zero value otherwise.

### GetEpvOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetEpvOk() (*float32, bool)`

GetEpvOk returns a tuple with the Epv field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEpv

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetEpv(v float32)`

SetEpv sets Epv field to given value.

### HasEpv

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasEpv() bool`

HasEpv returns a boolean if a field has been set.

### GetFilingDate

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetFilingDate() string`

GetFilingDate returns the FilingDate field if non-nil, zero value otherwise.

### GetFilingDateOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetFilingDateOk() (*string, bool)`

GetFilingDateOk returns a tuple with the FilingDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilingDate

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetFilingDate(v string)`

SetFilingDate sets FilingDate field to given value.

### HasFilingDate

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasFilingDate() bool`

HasFilingDate returns a boolean if a field has been set.

### GetFilingDateAor

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetFilingDateAor() string`

GetFilingDateAor returns the FilingDateAor field if non-nil, zero value otherwise.

### GetFilingDateAorOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetFilingDateAorOk() (*string, bool)`

GetFilingDateAorOk returns a tuple with the FilingDateAor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilingDateAor

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetFilingDateAor(v string)`

SetFilingDateAor sets FilingDateAor field to given value.

### HasFilingDateAor

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasFilingDateAor() bool`

HasFilingDateAor returns a boolean if a field has been set.

### GetForexRate

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetForexRate() float32`

GetForexRate returns the ForexRate field if non-nil, zero value otherwise.

### GetForexRateOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetForexRateOk() (*float32, bool)`

GetForexRateOk returns a tuple with the ForexRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForexRate

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetForexRate(v float32)`

SetForexRate sets ForexRate field to given value.

### HasForexRate

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasForexRate() bool`

HasForexRate returns a boolean if a field has been set.

### GetFscore

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetFscore() float32`

GetFscore returns the Fscore field if non-nil, zero value otherwise.

### GetFscoreOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetFscoreOk() (*float32, bool)`

GetFscoreOk returns a tuple with the Fscore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFscore

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetFscore(v float32)`

SetFscore sets Fscore field to given value.

### HasFscore

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasFscore() bool`

HasFscore returns a boolean if a field has been set.

### GetGrahamNumber

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetGrahamNumber() float32`

GetGrahamNumber returns the GrahamNumber field if non-nil, zero value otherwise.

### GetGrahamNumberOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetGrahamNumberOk() (*float32, bool)`

GetGrahamNumberOk returns a tuple with the GrahamNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrahamNumber

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetGrahamNumber(v float32)`

SetGrahamNumber sets GrahamNumber field to given value.

### HasGrahamNumber

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasGrahamNumber() bool`

HasGrahamNumber returns a boolean if a field has been set.

### GetGrowthPerShareEbitda

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetGrowthPerShareEbitda() float32`

GetGrowthPerShareEbitda returns the GrowthPerShareEbitda field if non-nil, zero value otherwise.

### GetGrowthPerShareEbitdaOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetGrowthPerShareEbitdaOk() (*float32, bool)`

GetGrowthPerShareEbitdaOk returns a tuple with the GrowthPerShareEbitda field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrowthPerShareEbitda

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetGrowthPerShareEbitda(v float32)`

SetGrowthPerShareEbitda sets GrowthPerShareEbitda field to given value.

### HasGrowthPerShareEbitda

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasGrowthPerShareEbitda() bool`

HasGrowthPerShareEbitda returns a boolean if a field has been set.

### GetGrowthPerShareEps

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetGrowthPerShareEps() float32`

GetGrowthPerShareEps returns the GrowthPerShareEps field if non-nil, zero value otherwise.

### GetGrowthPerShareEpsOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetGrowthPerShareEpsOk() (*float32, bool)`

GetGrowthPerShareEpsOk returns a tuple with the GrowthPerShareEps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrowthPerShareEps

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetGrowthPerShareEps(v float32)`

SetGrowthPerShareEps sets GrowthPerShareEps field to given value.

### HasGrowthPerShareEps

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasGrowthPerShareEps() bool`

HasGrowthPerShareEps returns a boolean if a field has been set.

### GetGrowthRevenuePerShare

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetGrowthRevenuePerShare() float32`

GetGrowthRevenuePerShare returns the GrowthRevenuePerShare field if non-nil, zero value otherwise.

### GetGrowthRevenuePerShareOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetGrowthRevenuePerShareOk() (*float32, bool)`

GetGrowthRevenuePerShareOk returns a tuple with the GrowthRevenuePerShare field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrowthRevenuePerShare

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetGrowthRevenuePerShare(v float32)`

SetGrowthRevenuePerShare sets GrowthRevenuePerShare field to given value.

### HasGrowthRevenuePerShare

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasGrowthRevenuePerShare() bool`

HasGrowthRevenuePerShare returns a boolean if a field has been set.

### GetInterestCoverage

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetInterestCoverage() float32`

GetInterestCoverage returns the InterestCoverage field if non-nil, zero value otherwise.

### GetInterestCoverageOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetInterestCoverageOk() (*float32, bool)`

GetInterestCoverageOk returns a tuple with the InterestCoverage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInterestCoverage

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetInterestCoverage(v float32)`

SetInterestCoverage sets InterestCoverage field to given value.

### HasInterestCoverage

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasInterestCoverage() bool`

HasInterestCoverage returns a boolean if a field has been set.

### GetIntrinsicValueProjectedFcf

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetIntrinsicValueProjectedFcf() float32`

GetIntrinsicValueProjectedFcf returns the IntrinsicValueProjectedFcf field if non-nil, zero value otherwise.

### GetIntrinsicValueProjectedFcfOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetIntrinsicValueProjectedFcfOk() (*float32, bool)`

GetIntrinsicValueProjectedFcfOk returns a tuple with the IntrinsicValueProjectedFcf field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrinsicValueProjectedFcf

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetIntrinsicValueProjectedFcf(v float32)`

SetIntrinsicValueProjectedFcf sets IntrinsicValueProjectedFcf field to given value.

### HasIntrinsicValueProjectedFcf

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasIntrinsicValueProjectedFcf() bool`

HasIntrinsicValueProjectedFcf returns a boolean if a field has been set.

### GetMedpsvalue

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetMedpsvalue() float32`

GetMedpsvalue returns the Medpsvalue field if non-nil, zero value otherwise.

### GetMedpsvalueOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetMedpsvalueOk() (*float32, bool)`

GetMedpsvalueOk returns a tuple with the Medpsvalue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMedpsvalue

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetMedpsvalue(v float32)`

SetMedpsvalue sets Medpsvalue field to given value.

### HasMedpsvalue

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasMedpsvalue() bool`

HasMedpsvalue returns a boolean if a field has been set.

### GetMktcap

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetMktcap() float32`

GetMktcap returns the Mktcap field if non-nil, zero value otherwise.

### GetMktcapOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetMktcapOk() (*float32, bool)`

GetMktcapOk returns a tuple with the Mktcap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMktcap

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetMktcap(v float32)`

SetMktcap sets Mktcap field to given value.

### HasMktcap

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasMktcap() bool`

HasMktcap returns a boolean if a field has been set.

### GetMonthEndStockPrice

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetMonthEndStockPrice() float32`

GetMonthEndStockPrice returns the MonthEndStockPrice field if non-nil, zero value otherwise.

### GetMonthEndStockPriceOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetMonthEndStockPriceOk() (*float32, bool)`

GetMonthEndStockPriceOk returns a tuple with the MonthEndStockPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMonthEndStockPrice

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetMonthEndStockPrice(v float32)`

SetMonthEndStockPrice sets MonthEndStockPrice field to given value.

### HasMonthEndStockPrice

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasMonthEndStockPrice() bool`

HasMonthEndStockPrice returns a boolean if a field has been set.

### GetMscore

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetMscore() float32`

GetMscore returns the Mscore field if non-nil, zero value otherwise.

### GetMscoreOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetMscoreOk() (*float32, bool)`

GetMscoreOk returns a tuple with the Mscore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMscore

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetMscore(v float32)`

SetMscore sets Mscore field to given value.

### HasMscore

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasMscore() bool`

HasMscore returns a boolean if a field has been set.

### GetNetCashPerShare

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetNetCashPerShare() float32`

GetNetCashPerShare returns the NetCashPerShare field if non-nil, zero value otherwise.

### GetNetCashPerShareOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetNetCashPerShareOk() (*float32, bool)`

GetNetCashPerShareOk returns a tuple with the NetCashPerShare field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetCashPerShare

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetNetCashPerShare(v float32)`

SetNetCashPerShare sets NetCashPerShare field to given value.

### HasNetCashPerShare

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasNetCashPerShare() bool`

HasNetCashPerShare returns a boolean if a field has been set.

### GetNetCurrentAssetValue

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetNetCurrentAssetValue() float32`

GetNetCurrentAssetValue returns the NetCurrentAssetValue field if non-nil, zero value otherwise.

### GetNetCurrentAssetValueOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetNetCurrentAssetValueOk() (*float32, bool)`

GetNetCurrentAssetValueOk returns a tuple with the NetCurrentAssetValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetCurrentAssetValue

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetNetCurrentAssetValue(v float32)`

SetNetCurrentAssetValue sets NetCurrentAssetValue field to given value.

### HasNetCurrentAssetValue

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasNetCurrentAssetValue() bool`

HasNetCurrentAssetValue returns a boolean if a field has been set.

### GetNetNetWorkingCapital

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetNetNetWorkingCapital() float32`

GetNetNetWorkingCapital returns the NetNetWorkingCapital field if non-nil, zero value otherwise.

### GetNetNetWorkingCapitalOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetNetNetWorkingCapitalOk() (*float32, bool)`

GetNetNetWorkingCapitalOk returns a tuple with the NetNetWorkingCapital field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetNetWorkingCapital

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetNetNetWorkingCapital(v float32)`

SetNetNetWorkingCapital sets NetNetWorkingCapital field to given value.

### HasNetNetWorkingCapital

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasNetNetWorkingCapital() bool`

HasNetNetWorkingCapital returns a boolean if a field has been set.

### GetNumberOfShareHolders

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetNumberOfShareHolders() float32`

GetNumberOfShareHolders returns the NumberOfShareHolders field if non-nil, zero value otherwise.

### GetNumberOfShareHoldersOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetNumberOfShareHoldersOk() (*float32, bool)`

GetNumberOfShareHoldersOk returns a tuple with the NumberOfShareHolders field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumberOfShareHolders

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetNumberOfShareHolders(v float32)`

SetNumberOfShareHolders sets NumberOfShareHolders field to given value.

### HasNumberOfShareHolders

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasNumberOfShareHolders() bool`

HasNumberOfShareHolders returns a boolean if a field has been set.

### GetPeterLynchFairValue

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetPeterLynchFairValue() float32`

GetPeterLynchFairValue returns the PeterLynchFairValue field if non-nil, zero value otherwise.

### GetPeterLynchFairValueOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetPeterLynchFairValueOk() (*float32, bool)`

GetPeterLynchFairValueOk returns a tuple with the PeterLynchFairValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPeterLynchFairValue

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetPeterLynchFairValue(v float32)`

SetPeterLynchFairValue sets PeterLynchFairValue field to given value.

### HasPeterLynchFairValue

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasPeterLynchFairValue() bool`

HasPeterLynchFairValue returns a boolean if a field has been set.

### GetPriceHigh

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetPriceHigh() float32`

GetPriceHigh returns the PriceHigh field if non-nil, zero value otherwise.

### GetPriceHighOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetPriceHighOk() (*float32, bool)`

GetPriceHighOk returns a tuple with the PriceHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriceHigh

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetPriceHigh(v float32)`

SetPriceHigh sets PriceHigh field to given value.

### HasPriceHigh

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasPriceHigh() bool`

HasPriceHigh returns a boolean if a field has been set.

### GetPriceLow

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetPriceLow() float32`

GetPriceLow returns the PriceLow field if non-nil, zero value otherwise.

### GetPriceLowOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetPriceLowOk() (*float32, bool)`

GetPriceLowOk returns a tuple with the PriceLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriceLow

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetPriceLow(v float32)`

SetPriceLow sets PriceLow field to given value.

### HasPriceLow

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasPriceLow() bool`

HasPriceLow returns a boolean if a field has been set.

### GetShareBuybackRatio

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetShareBuybackRatio() float32`

GetShareBuybackRatio returns the ShareBuybackRatio field if non-nil, zero value otherwise.

### GetShareBuybackRatioOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetShareBuybackRatioOk() (*float32, bool)`

GetShareBuybackRatioOk returns a tuple with the ShareBuybackRatio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShareBuybackRatio

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetShareBuybackRatio(v float32)`

SetShareBuybackRatio sets ShareBuybackRatio field to given value.

### HasShareBuybackRatio

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasShareBuybackRatio() bool`

HasShareBuybackRatio returns a boolean if a field has been set.

### GetShareholderYield

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetShareholderYield() float32`

GetShareholderYield returns the ShareholderYield field if non-nil, zero value otherwise.

### GetShareholderYieldOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetShareholderYieldOk() (*float32, bool)`

GetShareholderYieldOk returns a tuple with the ShareholderYield field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShareholderYield

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetShareholderYield(v float32)`

SetShareholderYield sets ShareholderYield field to given value.

### HasShareholderYield

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasShareholderYield() bool`

HasShareholderYield returns a boolean if a field has been set.

### GetSharesBasic

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetSharesBasic() float32`

GetSharesBasic returns the SharesBasic field if non-nil, zero value otherwise.

### GetSharesBasicOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetSharesBasicOk() (*float32, bool)`

GetSharesBasicOk returns a tuple with the SharesBasic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSharesBasic

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetSharesBasic(v float32)`

SetSharesBasic sets SharesBasic field to given value.

### HasSharesBasic

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasSharesBasic() bool`

HasSharesBasic returns a boolean if a field has been set.

### GetSloanRatio

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetSloanRatio() float32`

GetSloanRatio returns the SloanRatio field if non-nil, zero value otherwise.

### GetSloanRatioOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetSloanRatioOk() (*float32, bool)`

GetSloanRatioOk returns a tuple with the SloanRatio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSloanRatio

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetSloanRatio(v float32)`

SetSloanRatio sets SloanRatio field to given value.

### HasSloanRatio

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasSloanRatio() bool`

HasSloanRatio returns a boolean if a field has been set.

### GetSnoa

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetSnoa() float32`

GetSnoa returns the Snoa field if non-nil, zero value otherwise.

### GetSnoaOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetSnoaOk() (*float32, bool)`

GetSnoaOk returns a tuple with the Snoa field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSnoa

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetSnoa(v float32)`

SetSnoa sets Snoa field to given value.

### HasSnoa

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasSnoa() bool`

HasSnoa returns a boolean if a field has been set.

### GetTotalEmployeeNumber

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetTotalEmployeeNumber() float32`

GetTotalEmployeeNumber returns the TotalEmployeeNumber field if non-nil, zero value otherwise.

### GetTotalEmployeeNumberOk

`func (o *ValuationsINOREITNODIRECTValuationandQuality) GetTotalEmployeeNumberOk() (*float32, bool)`

GetTotalEmployeeNumberOk returns a tuple with the TotalEmployeeNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalEmployeeNumber

`func (o *ValuationsINOREITNODIRECTValuationandQuality) SetTotalEmployeeNumber(v float32)`

SetTotalEmployeeNumber sets TotalEmployeeNumber field to given value.

### HasTotalEmployeeNumber

`func (o *ValuationsINOREITNODIRECTValuationandQuality) HasTotalEmployeeNumber() bool`

HasTotalEmployeeNumber returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


