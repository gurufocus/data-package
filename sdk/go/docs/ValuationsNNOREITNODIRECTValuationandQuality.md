# ValuationsNNOREITNODIRECTValuationandQuality

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Beta** | Pointer to **float32** | Beta measures the volatility or systematic risk of a security in comparison to the market. It is calculated using the latest three years of monthly returns of the stock and the benchmark.&lt;br&gt;- A beta of 1 indicates that the stock&#39;s price will move with the market. &lt;br&gt;- A beta of less than 1 indicates that the stock will be less volatile than the market. &lt;br&gt;- A beta greater than 1 indicates that the stock&#39;s price will be more volatile than the market. | [optional] 
**BsShare** | Pointer to **float32** |  | [optional] 
**BuybackYield** | Pointer to **float32** |  | [optional] 
**CashRatio** | Pointer to **float32** | The Cash Ratio measures a company’s ability to meet its short-term obligations with cash and near-cash resources.  | [optional] 
**CurrentRatio** | Pointer to **float32** | The current ratio is a liquidity ratio that measures a company&#39;s ability to pay short-term obligations. It is calculated as a company&#39;s Total Current Assets divides by its Total Current Liabilities. | [optional] 
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
**QuickRatio** | Pointer to **float32** | The quick ratio measures a company&#39;s ability to meet its short-term obligations with its most liquid assets. | [optional] 
**ShareBuybackRatio** | Pointer to **float32** | The rate a company repurchases its shares | [optional] 
**ShareholderYield** | Pointer to **float32** |  | [optional] 
**SharesBasic** | Pointer to **float32** | &lt;p&gt;Shares outstanding are shares that have been authorized, issued, and purchased by investors and are held by them. They have voting rights and represent ownership in the corporation by the person that holds the shares. They should be distinguished from treasury shares, which are shares held by the corporation itself, having no exercisable rights. Shares outstanding can be calculated as either basic or fully diluted. The {{Shares_Outstanding}} count includes diluting securities, such as options, warrants or convertibles.&lt;/p&gt; | [optional] 
**SloanRatio** | Pointer to **float32** | Richard Sloan from the University of Michigan was first to document what is referred to as the &#39;accrual anomaly&#39;. His 1996 paper found that shares of companies with small or negative accruals vastly outperform (+10%) those of companies with large ones. | [optional] 
**Snoa** | Pointer to **float32** | Scaled net operating assets (SNOA) is calculated as the difference between  operating assets and operating liabilities, scaled by lagged total assets. | [optional] 
**TotalEmployeeNumber** | Pointer to **float32** | The total number of employees for a company | [optional] 
**Zscore** | Pointer to **float32** | Z-Score model is an accurate forecaster of failure up to two years prior to distress. It can be considered the assessment of the distress of industrial corporations. | [optional] 

## Methods

### NewValuationsNNOREITNODIRECTValuationandQuality

`func NewValuationsNNOREITNODIRECTValuationandQuality() *ValuationsNNOREITNODIRECTValuationandQuality`

NewValuationsNNOREITNODIRECTValuationandQuality instantiates a new ValuationsNNOREITNODIRECTValuationandQuality object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewValuationsNNOREITNODIRECTValuationandQualityWithDefaults

`func NewValuationsNNOREITNODIRECTValuationandQualityWithDefaults() *ValuationsNNOREITNODIRECTValuationandQuality`

NewValuationsNNOREITNODIRECTValuationandQualityWithDefaults instantiates a new ValuationsNNOREITNODIRECTValuationandQuality object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBeta

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetBeta() float32`

GetBeta returns the Beta field if non-nil, zero value otherwise.

### GetBetaOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetBetaOk() (*float32, bool)`

GetBetaOk returns a tuple with the Beta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBeta

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetBeta(v float32)`

SetBeta sets Beta field to given value.

### HasBeta

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasBeta() bool`

HasBeta returns a boolean if a field has been set.

### GetBsShare

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetBsShare() float32`

GetBsShare returns the BsShare field if non-nil, zero value otherwise.

### GetBsShareOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetBsShareOk() (*float32, bool)`

GetBsShareOk returns a tuple with the BsShare field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBsShare

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetBsShare(v float32)`

SetBsShare sets BsShare field to given value.

### HasBsShare

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasBsShare() bool`

HasBsShare returns a boolean if a field has been set.

### GetBuybackYield

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetBuybackYield() float32`

GetBuybackYield returns the BuybackYield field if non-nil, zero value otherwise.

### GetBuybackYieldOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetBuybackYieldOk() (*float32, bool)`

GetBuybackYieldOk returns a tuple with the BuybackYield field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBuybackYield

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetBuybackYield(v float32)`

SetBuybackYield sets BuybackYield field to given value.

### HasBuybackYield

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasBuybackYield() bool`

HasBuybackYield returns a boolean if a field has been set.

### GetCashRatio

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetCashRatio() float32`

GetCashRatio returns the CashRatio field if non-nil, zero value otherwise.

### GetCashRatioOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetCashRatioOk() (*float32, bool)`

GetCashRatioOk returns a tuple with the CashRatio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashRatio

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetCashRatio(v float32)`

SetCashRatio sets CashRatio field to given value.

### HasCashRatio

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasCashRatio() bool`

HasCashRatio returns a boolean if a field has been set.

### GetCurrentRatio

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetCurrentRatio() float32`

GetCurrentRatio returns the CurrentRatio field if non-nil, zero value otherwise.

### GetCurrentRatioOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetCurrentRatioOk() (*float32, bool)`

GetCurrentRatioOk returns a tuple with the CurrentRatio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrentRatio

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetCurrentRatio(v float32)`

SetCurrentRatio sets CurrentRatio field to given value.

### HasCurrentRatio

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasCurrentRatio() bool`

HasCurrentRatio returns a boolean if a field has been set.

### GetEarningsReleaseDate

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetEarningsReleaseDate() string`

GetEarningsReleaseDate returns the EarningsReleaseDate field if non-nil, zero value otherwise.

### GetEarningsReleaseDateOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetEarningsReleaseDateOk() (*string, bool)`

GetEarningsReleaseDateOk returns a tuple with the EarningsReleaseDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEarningsReleaseDate

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetEarningsReleaseDate(v string)`

SetEarningsReleaseDate sets EarningsReleaseDate field to given value.

### HasEarningsReleaseDate

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasEarningsReleaseDate() bool`

HasEarningsReleaseDate returns a boolean if a field has been set.

### GetEbitda5yGrowth

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetEbitda5yGrowth() float32`

GetEbitda5yGrowth returns the Ebitda5yGrowth field if non-nil, zero value otherwise.

### GetEbitda5yGrowthOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetEbitda5yGrowthOk() (*float32, bool)`

GetEbitda5yGrowthOk returns a tuple with the Ebitda5yGrowth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEbitda5yGrowth

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetEbitda5yGrowth(v float32)`

SetEbitda5yGrowth sets Ebitda5yGrowth field to given value.

### HasEbitda5yGrowth

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasEbitda5yGrowth() bool`

HasEbitda5yGrowth returns a boolean if a field has been set.

### GetEnterpriseValue

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetEnterpriseValue() float32`

GetEnterpriseValue returns the EnterpriseValue field if non-nil, zero value otherwise.

### GetEnterpriseValueOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetEnterpriseValueOk() (*float32, bool)`

GetEnterpriseValueOk returns a tuple with the EnterpriseValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnterpriseValue

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetEnterpriseValue(v float32)`

SetEnterpriseValue sets EnterpriseValue field to given value.

### HasEnterpriseValue

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasEnterpriseValue() bool`

HasEnterpriseValue returns a boolean if a field has been set.

### GetEpv

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetEpv() float32`

GetEpv returns the Epv field if non-nil, zero value otherwise.

### GetEpvOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetEpvOk() (*float32, bool)`

GetEpvOk returns a tuple with the Epv field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEpv

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetEpv(v float32)`

SetEpv sets Epv field to given value.

### HasEpv

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasEpv() bool`

HasEpv returns a boolean if a field has been set.

### GetFilingDate

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetFilingDate() string`

GetFilingDate returns the FilingDate field if non-nil, zero value otherwise.

### GetFilingDateOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetFilingDateOk() (*string, bool)`

GetFilingDateOk returns a tuple with the FilingDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilingDate

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetFilingDate(v string)`

SetFilingDate sets FilingDate field to given value.

### HasFilingDate

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasFilingDate() bool`

HasFilingDate returns a boolean if a field has been set.

### GetFilingDateAor

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetFilingDateAor() string`

GetFilingDateAor returns the FilingDateAor field if non-nil, zero value otherwise.

### GetFilingDateAorOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetFilingDateAorOk() (*string, bool)`

GetFilingDateAorOk returns a tuple with the FilingDateAor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilingDateAor

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetFilingDateAor(v string)`

SetFilingDateAor sets FilingDateAor field to given value.

### HasFilingDateAor

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasFilingDateAor() bool`

HasFilingDateAor returns a boolean if a field has been set.

### GetForexRate

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetForexRate() float32`

GetForexRate returns the ForexRate field if non-nil, zero value otherwise.

### GetForexRateOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetForexRateOk() (*float32, bool)`

GetForexRateOk returns a tuple with the ForexRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForexRate

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetForexRate(v float32)`

SetForexRate sets ForexRate field to given value.

### HasForexRate

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasForexRate() bool`

HasForexRate returns a boolean if a field has been set.

### GetFscore

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetFscore() float32`

GetFscore returns the Fscore field if non-nil, zero value otherwise.

### GetFscoreOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetFscoreOk() (*float32, bool)`

GetFscoreOk returns a tuple with the Fscore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFscore

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetFscore(v float32)`

SetFscore sets Fscore field to given value.

### HasFscore

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasFscore() bool`

HasFscore returns a boolean if a field has been set.

### GetGrahamNumber

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetGrahamNumber() float32`

GetGrahamNumber returns the GrahamNumber field if non-nil, zero value otherwise.

### GetGrahamNumberOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetGrahamNumberOk() (*float32, bool)`

GetGrahamNumberOk returns a tuple with the GrahamNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrahamNumber

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetGrahamNumber(v float32)`

SetGrahamNumber sets GrahamNumber field to given value.

### HasGrahamNumber

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasGrahamNumber() bool`

HasGrahamNumber returns a boolean if a field has been set.

### GetGrowthPerShareEbitda

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetGrowthPerShareEbitda() float32`

GetGrowthPerShareEbitda returns the GrowthPerShareEbitda field if non-nil, zero value otherwise.

### GetGrowthPerShareEbitdaOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetGrowthPerShareEbitdaOk() (*float32, bool)`

GetGrowthPerShareEbitdaOk returns a tuple with the GrowthPerShareEbitda field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrowthPerShareEbitda

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetGrowthPerShareEbitda(v float32)`

SetGrowthPerShareEbitda sets GrowthPerShareEbitda field to given value.

### HasGrowthPerShareEbitda

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasGrowthPerShareEbitda() bool`

HasGrowthPerShareEbitda returns a boolean if a field has been set.

### GetGrowthPerShareEps

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetGrowthPerShareEps() float32`

GetGrowthPerShareEps returns the GrowthPerShareEps field if non-nil, zero value otherwise.

### GetGrowthPerShareEpsOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetGrowthPerShareEpsOk() (*float32, bool)`

GetGrowthPerShareEpsOk returns a tuple with the GrowthPerShareEps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrowthPerShareEps

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetGrowthPerShareEps(v float32)`

SetGrowthPerShareEps sets GrowthPerShareEps field to given value.

### HasGrowthPerShareEps

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasGrowthPerShareEps() bool`

HasGrowthPerShareEps returns a boolean if a field has been set.

### GetGrowthRevenuePerShare

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetGrowthRevenuePerShare() float32`

GetGrowthRevenuePerShare returns the GrowthRevenuePerShare field if non-nil, zero value otherwise.

### GetGrowthRevenuePerShareOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetGrowthRevenuePerShareOk() (*float32, bool)`

GetGrowthRevenuePerShareOk returns a tuple with the GrowthRevenuePerShare field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrowthRevenuePerShare

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetGrowthRevenuePerShare(v float32)`

SetGrowthRevenuePerShare sets GrowthRevenuePerShare field to given value.

### HasGrowthRevenuePerShare

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasGrowthRevenuePerShare() bool`

HasGrowthRevenuePerShare returns a boolean if a field has been set.

### GetInterestCoverage

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetInterestCoverage() float32`

GetInterestCoverage returns the InterestCoverage field if non-nil, zero value otherwise.

### GetInterestCoverageOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetInterestCoverageOk() (*float32, bool)`

GetInterestCoverageOk returns a tuple with the InterestCoverage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInterestCoverage

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetInterestCoverage(v float32)`

SetInterestCoverage sets InterestCoverage field to given value.

### HasInterestCoverage

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasInterestCoverage() bool`

HasInterestCoverage returns a boolean if a field has been set.

### GetIntrinsicValueProjectedFcf

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetIntrinsicValueProjectedFcf() float32`

GetIntrinsicValueProjectedFcf returns the IntrinsicValueProjectedFcf field if non-nil, zero value otherwise.

### GetIntrinsicValueProjectedFcfOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetIntrinsicValueProjectedFcfOk() (*float32, bool)`

GetIntrinsicValueProjectedFcfOk returns a tuple with the IntrinsicValueProjectedFcf field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrinsicValueProjectedFcf

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetIntrinsicValueProjectedFcf(v float32)`

SetIntrinsicValueProjectedFcf sets IntrinsicValueProjectedFcf field to given value.

### HasIntrinsicValueProjectedFcf

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasIntrinsicValueProjectedFcf() bool`

HasIntrinsicValueProjectedFcf returns a boolean if a field has been set.

### GetMedpsvalue

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetMedpsvalue() float32`

GetMedpsvalue returns the Medpsvalue field if non-nil, zero value otherwise.

### GetMedpsvalueOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetMedpsvalueOk() (*float32, bool)`

GetMedpsvalueOk returns a tuple with the Medpsvalue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMedpsvalue

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetMedpsvalue(v float32)`

SetMedpsvalue sets Medpsvalue field to given value.

### HasMedpsvalue

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasMedpsvalue() bool`

HasMedpsvalue returns a boolean if a field has been set.

### GetMktcap

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetMktcap() float32`

GetMktcap returns the Mktcap field if non-nil, zero value otherwise.

### GetMktcapOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetMktcapOk() (*float32, bool)`

GetMktcapOk returns a tuple with the Mktcap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMktcap

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetMktcap(v float32)`

SetMktcap sets Mktcap field to given value.

### HasMktcap

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasMktcap() bool`

HasMktcap returns a boolean if a field has been set.

### GetMonthEndStockPrice

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetMonthEndStockPrice() float32`

GetMonthEndStockPrice returns the MonthEndStockPrice field if non-nil, zero value otherwise.

### GetMonthEndStockPriceOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetMonthEndStockPriceOk() (*float32, bool)`

GetMonthEndStockPriceOk returns a tuple with the MonthEndStockPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMonthEndStockPrice

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetMonthEndStockPrice(v float32)`

SetMonthEndStockPrice sets MonthEndStockPrice field to given value.

### HasMonthEndStockPrice

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasMonthEndStockPrice() bool`

HasMonthEndStockPrice returns a boolean if a field has been set.

### GetMscore

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetMscore() float32`

GetMscore returns the Mscore field if non-nil, zero value otherwise.

### GetMscoreOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetMscoreOk() (*float32, bool)`

GetMscoreOk returns a tuple with the Mscore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMscore

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetMscore(v float32)`

SetMscore sets Mscore field to given value.

### HasMscore

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasMscore() bool`

HasMscore returns a boolean if a field has been set.

### GetNetCashPerShare

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetNetCashPerShare() float32`

GetNetCashPerShare returns the NetCashPerShare field if non-nil, zero value otherwise.

### GetNetCashPerShareOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetNetCashPerShareOk() (*float32, bool)`

GetNetCashPerShareOk returns a tuple with the NetCashPerShare field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetCashPerShare

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetNetCashPerShare(v float32)`

SetNetCashPerShare sets NetCashPerShare field to given value.

### HasNetCashPerShare

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasNetCashPerShare() bool`

HasNetCashPerShare returns a boolean if a field has been set.

### GetNetCurrentAssetValue

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetNetCurrentAssetValue() float32`

GetNetCurrentAssetValue returns the NetCurrentAssetValue field if non-nil, zero value otherwise.

### GetNetCurrentAssetValueOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetNetCurrentAssetValueOk() (*float32, bool)`

GetNetCurrentAssetValueOk returns a tuple with the NetCurrentAssetValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetCurrentAssetValue

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetNetCurrentAssetValue(v float32)`

SetNetCurrentAssetValue sets NetCurrentAssetValue field to given value.

### HasNetCurrentAssetValue

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasNetCurrentAssetValue() bool`

HasNetCurrentAssetValue returns a boolean if a field has been set.

### GetNetNetWorkingCapital

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetNetNetWorkingCapital() float32`

GetNetNetWorkingCapital returns the NetNetWorkingCapital field if non-nil, zero value otherwise.

### GetNetNetWorkingCapitalOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetNetNetWorkingCapitalOk() (*float32, bool)`

GetNetNetWorkingCapitalOk returns a tuple with the NetNetWorkingCapital field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetNetWorkingCapital

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetNetNetWorkingCapital(v float32)`

SetNetNetWorkingCapital sets NetNetWorkingCapital field to given value.

### HasNetNetWorkingCapital

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasNetNetWorkingCapital() bool`

HasNetNetWorkingCapital returns a boolean if a field has been set.

### GetNumberOfShareHolders

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetNumberOfShareHolders() float32`

GetNumberOfShareHolders returns the NumberOfShareHolders field if non-nil, zero value otherwise.

### GetNumberOfShareHoldersOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetNumberOfShareHoldersOk() (*float32, bool)`

GetNumberOfShareHoldersOk returns a tuple with the NumberOfShareHolders field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumberOfShareHolders

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetNumberOfShareHolders(v float32)`

SetNumberOfShareHolders sets NumberOfShareHolders field to given value.

### HasNumberOfShareHolders

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasNumberOfShareHolders() bool`

HasNumberOfShareHolders returns a boolean if a field has been set.

### GetPeterLynchFairValue

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetPeterLynchFairValue() float32`

GetPeterLynchFairValue returns the PeterLynchFairValue field if non-nil, zero value otherwise.

### GetPeterLynchFairValueOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetPeterLynchFairValueOk() (*float32, bool)`

GetPeterLynchFairValueOk returns a tuple with the PeterLynchFairValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPeterLynchFairValue

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetPeterLynchFairValue(v float32)`

SetPeterLynchFairValue sets PeterLynchFairValue field to given value.

### HasPeterLynchFairValue

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasPeterLynchFairValue() bool`

HasPeterLynchFairValue returns a boolean if a field has been set.

### GetPriceHigh

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetPriceHigh() float32`

GetPriceHigh returns the PriceHigh field if non-nil, zero value otherwise.

### GetPriceHighOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetPriceHighOk() (*float32, bool)`

GetPriceHighOk returns a tuple with the PriceHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriceHigh

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetPriceHigh(v float32)`

SetPriceHigh sets PriceHigh field to given value.

### HasPriceHigh

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasPriceHigh() bool`

HasPriceHigh returns a boolean if a field has been set.

### GetPriceLow

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetPriceLow() float32`

GetPriceLow returns the PriceLow field if non-nil, zero value otherwise.

### GetPriceLowOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetPriceLowOk() (*float32, bool)`

GetPriceLowOk returns a tuple with the PriceLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriceLow

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetPriceLow(v float32)`

SetPriceLow sets PriceLow field to given value.

### HasPriceLow

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasPriceLow() bool`

HasPriceLow returns a boolean if a field has been set.

### GetQuickRatio

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetQuickRatio() float32`

GetQuickRatio returns the QuickRatio field if non-nil, zero value otherwise.

### GetQuickRatioOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetQuickRatioOk() (*float32, bool)`

GetQuickRatioOk returns a tuple with the QuickRatio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuickRatio

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetQuickRatio(v float32)`

SetQuickRatio sets QuickRatio field to given value.

### HasQuickRatio

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasQuickRatio() bool`

HasQuickRatio returns a boolean if a field has been set.

### GetShareBuybackRatio

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetShareBuybackRatio() float32`

GetShareBuybackRatio returns the ShareBuybackRatio field if non-nil, zero value otherwise.

### GetShareBuybackRatioOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetShareBuybackRatioOk() (*float32, bool)`

GetShareBuybackRatioOk returns a tuple with the ShareBuybackRatio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShareBuybackRatio

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetShareBuybackRatio(v float32)`

SetShareBuybackRatio sets ShareBuybackRatio field to given value.

### HasShareBuybackRatio

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasShareBuybackRatio() bool`

HasShareBuybackRatio returns a boolean if a field has been set.

### GetShareholderYield

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetShareholderYield() float32`

GetShareholderYield returns the ShareholderYield field if non-nil, zero value otherwise.

### GetShareholderYieldOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetShareholderYieldOk() (*float32, bool)`

GetShareholderYieldOk returns a tuple with the ShareholderYield field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShareholderYield

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetShareholderYield(v float32)`

SetShareholderYield sets ShareholderYield field to given value.

### HasShareholderYield

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasShareholderYield() bool`

HasShareholderYield returns a boolean if a field has been set.

### GetSharesBasic

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetSharesBasic() float32`

GetSharesBasic returns the SharesBasic field if non-nil, zero value otherwise.

### GetSharesBasicOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetSharesBasicOk() (*float32, bool)`

GetSharesBasicOk returns a tuple with the SharesBasic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSharesBasic

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetSharesBasic(v float32)`

SetSharesBasic sets SharesBasic field to given value.

### HasSharesBasic

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasSharesBasic() bool`

HasSharesBasic returns a boolean if a field has been set.

### GetSloanRatio

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetSloanRatio() float32`

GetSloanRatio returns the SloanRatio field if non-nil, zero value otherwise.

### GetSloanRatioOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetSloanRatioOk() (*float32, bool)`

GetSloanRatioOk returns a tuple with the SloanRatio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSloanRatio

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetSloanRatio(v float32)`

SetSloanRatio sets SloanRatio field to given value.

### HasSloanRatio

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasSloanRatio() bool`

HasSloanRatio returns a boolean if a field has been set.

### GetSnoa

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetSnoa() float32`

GetSnoa returns the Snoa field if non-nil, zero value otherwise.

### GetSnoaOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetSnoaOk() (*float32, bool)`

GetSnoaOk returns a tuple with the Snoa field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSnoa

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetSnoa(v float32)`

SetSnoa sets Snoa field to given value.

### HasSnoa

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasSnoa() bool`

HasSnoa returns a boolean if a field has been set.

### GetTotalEmployeeNumber

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetTotalEmployeeNumber() float32`

GetTotalEmployeeNumber returns the TotalEmployeeNumber field if non-nil, zero value otherwise.

### GetTotalEmployeeNumberOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetTotalEmployeeNumberOk() (*float32, bool)`

GetTotalEmployeeNumberOk returns a tuple with the TotalEmployeeNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalEmployeeNumber

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetTotalEmployeeNumber(v float32)`

SetTotalEmployeeNumber sets TotalEmployeeNumber field to given value.

### HasTotalEmployeeNumber

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasTotalEmployeeNumber() bool`

HasTotalEmployeeNumber returns a boolean if a field has been set.

### GetZscore

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetZscore() float32`

GetZscore returns the Zscore field if non-nil, zero value otherwise.

### GetZscoreOk

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) GetZscoreOk() (*float32, bool)`

GetZscoreOk returns a tuple with the Zscore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetZscore

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) SetZscore(v float32)`

SetZscore sets Zscore field to given value.

### HasZscore

`func (o *ValuationsNNOREITNODIRECTValuationandQuality) HasZscore() bool`

HasZscore returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


