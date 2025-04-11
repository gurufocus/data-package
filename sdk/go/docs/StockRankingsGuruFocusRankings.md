# StockRankingsGuruFocusRankings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**GfScore** | Pointer to **float32** | GF Score is a stock performance ranking system developed by GuruFocus using five aspects of valuation. | [optional] 
**GfScoreHigh** | Pointer to **float32** |  | [optional] 
**GfScoreLow** | Pointer to **float32** |  | [optional] 
**GfScoreMed** | Pointer to **float32** |  | [optional] 
**GfScoreMed5y** | Pointer to **float32** |  | [optional] 
**GfValue** | Pointer to **float32** |  | [optional] 
**GfValueEst** | Pointer to **float32** | The estimated GF value at the end of the fiscal year immediately following the current fiscal year. FY1 represents the fiscal year immediately following the current fiscal year. | [optional] 
**GfValueEst2nd** | Pointer to **float32** | The estimated GF value at the end of the second fiscal year after the current fiscal year. FY2 represents the second fiscal year after the current fiscal year. | [optional] 
**GfValueEst3rd** | Pointer to **float32** | The estimated GF value at the end of the third fiscal year after the current fiscal year. FY3 represents the third fiscal year after the current fiscal year. | [optional] 
**GfValuePctChange** | Pointer to **float32** | The percentage change in a company&#39;s GF value from the previous month. | [optional] 
**MarginGfValue** | Pointer to **float32** | The difference between current price and intrinsic value based on GF Value model. | [optional] 
**P2gfValue** | Pointer to **float32** |  | [optional] 
**P2gfValueEst** | Pointer to **float32** |  | [optional] 
**P2gfValueHigh** | Pointer to **float32** |  | [optional] 
**P2gfValueLow** | Pointer to **float32** |  | [optional] 
**P2gfValueMed** | Pointer to **float32** |  | [optional] 
**Predictability** | Pointer to **string** | &lt;table class&#x3D;\&quot;normal-table\&quot;&gt;         &lt;thead&gt;           &lt;tr&gt;             &lt;th&gt;Rank&lt;/th&gt;             &lt;th&gt;Average Gain&lt;/th&gt;             &lt;th&gt;% of Stocks that are in still loss if held for 10yrs&lt;/th&gt;           &lt;/tr&gt;         &lt;/thead&gt;         &lt;tbody&gt;           &lt;tr&gt;             &lt;td&gt;               2 Star             &lt;/td&gt;             &lt;td&gt;6% per year&lt;/td&gt;             &lt;td&gt;16%&lt;/td&gt;           &lt;/tr&gt;            &lt;tr&gt;             &lt;td&gt;               2.5 Star             &lt;/td&gt;             &lt;td&gt;7.3% per year&lt;/td&gt;             &lt;td&gt;18%&lt;/td&gt;           &lt;/tr&gt;            &lt;tr&gt;             &lt;td&gt;               3 Star             &lt;/td&gt;             &lt;td&gt;8.2% per year&lt;/td&gt;             &lt;td&gt;11%&lt;/td&gt;           &lt;/tr&gt;            &lt;tr&gt;             &lt;td&gt;               3.5 Star             &lt;/td&gt;             &lt;td&gt;9.3% per year&lt;/td&gt;             &lt;td&gt;9%&lt;/td&gt;           &lt;/tr&gt;            &lt;tr&gt;             &lt;td&gt;               4 Star             &lt;/td&gt;             &lt;td&gt;9.8% per year&lt;/td&gt;             &lt;td&gt;8%&lt;/td&gt;           &lt;/tr&gt;            &lt;tr&gt;             &lt;td&gt;               4.5 Star             &lt;/td&gt;             &lt;td&gt;10.6% per year&lt;/td&gt;             &lt;td&gt;10%&lt;/td&gt;           &lt;/tr&gt;            &lt;tr&gt;             &lt;td&gt;               5 Star             &lt;/td&gt;             &lt;td&gt;12.1% per year&lt;/td&gt;             &lt;td&gt;3%&lt;/td&gt;           &lt;/tr&gt;         &lt;/tbody&gt;       &lt;/table&gt; | [optional] 
**RankBalancesheet** | Pointer to **float32** | Financial Strength is a measure of a company&#39;s overall financial health, rated on a scale of 1 to 10. It evaluates key factors such as interest coverage, debt-to-revenue ratio, and the Altman Z-Score, among others. &lt;br&gt;A higher score indicates a stronger financial position, with companies rated 7 or above considered financially stable and unlikely to face distress. Conversely, a score of 3 or below suggests potential financial difficulties, indicating a higher risk of distress. | [optional] 
**RankBalancesheetHigh** | Pointer to **float32** |  | [optional] 
**RankBalancesheetLow** | Pointer to **float32** |  | [optional] 
**RankBalancesheetMed** | Pointer to **float32** |  | [optional] 
**RankGfValue** | Pointer to **float32** | GF Value Rank evaluates the exclusive GuruFocus valuation and performance of a stock, rated on a scale from 1 to 10. It is primarily determined by the price-to-GF value ratio and backtesting results. Stocks in the third lowest percentile of valuation receive the highest rank of 10. &lt;br&gt; A higher score indicates a stock with a relatively low valuation and substantial potential for outperformance. Conversely, a lower score often reflects stocks that are either highly overvalued or deeply undervalued, both of which tend to underperform. | [optional] 
**RankGfValueHigh** | Pointer to **float32** |  | [optional] 
**RankGfValueLow** | Pointer to **float32** |  | [optional] 
**RankGrowth** | Pointer to **float32** | Growth Rank measures the growth of a company in terms of its revenue and profitability, rated on a scale from 1 to 10. It considers key factors such as revenue and EBITDA growth rates, as well as the consistency and predictability of revenue. &lt;br&gt; A higher score reflects a greater ability to drive business growth, with companies considered to have strong and sustainable expansion potential. Conversely, a lower score indicates challenges in achieving consistent growth and scalability. | [optional] 
**RankGrowthHigh** | Pointer to **float32** |  | [optional] 
**RankGrowthLow** | Pointer to **float32** |  | [optional] 
**RankGrowthMed** | Pointer to **float32** |  | [optional] 
**RankMomentum** | Pointer to **float32** | Momentum Rank measures the strength and persistence of a stock&#39;s price movement over time, rated on a scale of 1 to 10. It incorporates the standardized momentum ratio and several other performance metrics. Stocks in the 70th percentile of the momentum ratio receive the highest rank of 10, based on the backtesting result of the stock price performance and the momentum ratio. &lt;br&gt; A higher score reflects strong price momentum and indicates greater potential for superior performance. Conversely, a lower score indicates that momentum is either too high or too low, and stocks tend to underperform. | [optional] 
**RankMomentumHigh** | Pointer to **float32** |  | [optional] 
**RankMomentumLow** | Pointer to **float32** |  | [optional] 
**RankMomentumMed** | Pointer to **float32** |  | [optional] 
**RankProfitability** | Pointer to **float32** | Profitability Rank measures a company&#39;s profitability and financial stability, rated on a scale of 1 to 10. It takes into account critical factors such as operating margin and its growth, Piotroski F-Score, predictability, and revenue growth, among others. &lt;br&gt; A higher score indicates superior profitability, with companies rated 7 or above considered to have more robust and sustainable profit generation. Conversely, a score of 3 or lower suggests challenges in generating consistent profits. | [optional] 
**RankProfitabilityHigh** | Pointer to **float32** |  | [optional] 
**RankProfitabilityLow** | Pointer to **float32** |  | [optional] 
**RankProfitabilityMed** | Pointer to **float32** |  | [optional] 

## Methods

### NewStockRankingsGuruFocusRankings

`func NewStockRankingsGuruFocusRankings() *StockRankingsGuruFocusRankings`

NewStockRankingsGuruFocusRankings instantiates a new StockRankingsGuruFocusRankings object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStockRankingsGuruFocusRankingsWithDefaults

`func NewStockRankingsGuruFocusRankingsWithDefaults() *StockRankingsGuruFocusRankings`

NewStockRankingsGuruFocusRankingsWithDefaults instantiates a new StockRankingsGuruFocusRankings object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGfScore

`func (o *StockRankingsGuruFocusRankings) GetGfScore() float32`

GetGfScore returns the GfScore field if non-nil, zero value otherwise.

### GetGfScoreOk

`func (o *StockRankingsGuruFocusRankings) GetGfScoreOk() (*float32, bool)`

GetGfScoreOk returns a tuple with the GfScore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGfScore

`func (o *StockRankingsGuruFocusRankings) SetGfScore(v float32)`

SetGfScore sets GfScore field to given value.

### HasGfScore

`func (o *StockRankingsGuruFocusRankings) HasGfScore() bool`

HasGfScore returns a boolean if a field has been set.

### GetGfScoreHigh

`func (o *StockRankingsGuruFocusRankings) GetGfScoreHigh() float32`

GetGfScoreHigh returns the GfScoreHigh field if non-nil, zero value otherwise.

### GetGfScoreHighOk

`func (o *StockRankingsGuruFocusRankings) GetGfScoreHighOk() (*float32, bool)`

GetGfScoreHighOk returns a tuple with the GfScoreHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGfScoreHigh

`func (o *StockRankingsGuruFocusRankings) SetGfScoreHigh(v float32)`

SetGfScoreHigh sets GfScoreHigh field to given value.

### HasGfScoreHigh

`func (o *StockRankingsGuruFocusRankings) HasGfScoreHigh() bool`

HasGfScoreHigh returns a boolean if a field has been set.

### GetGfScoreLow

`func (o *StockRankingsGuruFocusRankings) GetGfScoreLow() float32`

GetGfScoreLow returns the GfScoreLow field if non-nil, zero value otherwise.

### GetGfScoreLowOk

`func (o *StockRankingsGuruFocusRankings) GetGfScoreLowOk() (*float32, bool)`

GetGfScoreLowOk returns a tuple with the GfScoreLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGfScoreLow

`func (o *StockRankingsGuruFocusRankings) SetGfScoreLow(v float32)`

SetGfScoreLow sets GfScoreLow field to given value.

### HasGfScoreLow

`func (o *StockRankingsGuruFocusRankings) HasGfScoreLow() bool`

HasGfScoreLow returns a boolean if a field has been set.

### GetGfScoreMed

`func (o *StockRankingsGuruFocusRankings) GetGfScoreMed() float32`

GetGfScoreMed returns the GfScoreMed field if non-nil, zero value otherwise.

### GetGfScoreMedOk

`func (o *StockRankingsGuruFocusRankings) GetGfScoreMedOk() (*float32, bool)`

GetGfScoreMedOk returns a tuple with the GfScoreMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGfScoreMed

`func (o *StockRankingsGuruFocusRankings) SetGfScoreMed(v float32)`

SetGfScoreMed sets GfScoreMed field to given value.

### HasGfScoreMed

`func (o *StockRankingsGuruFocusRankings) HasGfScoreMed() bool`

HasGfScoreMed returns a boolean if a field has been set.

### GetGfScoreMed5y

`func (o *StockRankingsGuruFocusRankings) GetGfScoreMed5y() float32`

GetGfScoreMed5y returns the GfScoreMed5y field if non-nil, zero value otherwise.

### GetGfScoreMed5yOk

`func (o *StockRankingsGuruFocusRankings) GetGfScoreMed5yOk() (*float32, bool)`

GetGfScoreMed5yOk returns a tuple with the GfScoreMed5y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGfScoreMed5y

`func (o *StockRankingsGuruFocusRankings) SetGfScoreMed5y(v float32)`

SetGfScoreMed5y sets GfScoreMed5y field to given value.

### HasGfScoreMed5y

`func (o *StockRankingsGuruFocusRankings) HasGfScoreMed5y() bool`

HasGfScoreMed5y returns a boolean if a field has been set.

### GetGfValue

`func (o *StockRankingsGuruFocusRankings) GetGfValue() float32`

GetGfValue returns the GfValue field if non-nil, zero value otherwise.

### GetGfValueOk

`func (o *StockRankingsGuruFocusRankings) GetGfValueOk() (*float32, bool)`

GetGfValueOk returns a tuple with the GfValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGfValue

`func (o *StockRankingsGuruFocusRankings) SetGfValue(v float32)`

SetGfValue sets GfValue field to given value.

### HasGfValue

`func (o *StockRankingsGuruFocusRankings) HasGfValue() bool`

HasGfValue returns a boolean if a field has been set.

### GetGfValueEst

`func (o *StockRankingsGuruFocusRankings) GetGfValueEst() float32`

GetGfValueEst returns the GfValueEst field if non-nil, zero value otherwise.

### GetGfValueEstOk

`func (o *StockRankingsGuruFocusRankings) GetGfValueEstOk() (*float32, bool)`

GetGfValueEstOk returns a tuple with the GfValueEst field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGfValueEst

`func (o *StockRankingsGuruFocusRankings) SetGfValueEst(v float32)`

SetGfValueEst sets GfValueEst field to given value.

### HasGfValueEst

`func (o *StockRankingsGuruFocusRankings) HasGfValueEst() bool`

HasGfValueEst returns a boolean if a field has been set.

### GetGfValueEst2nd

`func (o *StockRankingsGuruFocusRankings) GetGfValueEst2nd() float32`

GetGfValueEst2nd returns the GfValueEst2nd field if non-nil, zero value otherwise.

### GetGfValueEst2ndOk

`func (o *StockRankingsGuruFocusRankings) GetGfValueEst2ndOk() (*float32, bool)`

GetGfValueEst2ndOk returns a tuple with the GfValueEst2nd field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGfValueEst2nd

`func (o *StockRankingsGuruFocusRankings) SetGfValueEst2nd(v float32)`

SetGfValueEst2nd sets GfValueEst2nd field to given value.

### HasGfValueEst2nd

`func (o *StockRankingsGuruFocusRankings) HasGfValueEst2nd() bool`

HasGfValueEst2nd returns a boolean if a field has been set.

### GetGfValueEst3rd

`func (o *StockRankingsGuruFocusRankings) GetGfValueEst3rd() float32`

GetGfValueEst3rd returns the GfValueEst3rd field if non-nil, zero value otherwise.

### GetGfValueEst3rdOk

`func (o *StockRankingsGuruFocusRankings) GetGfValueEst3rdOk() (*float32, bool)`

GetGfValueEst3rdOk returns a tuple with the GfValueEst3rd field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGfValueEst3rd

`func (o *StockRankingsGuruFocusRankings) SetGfValueEst3rd(v float32)`

SetGfValueEst3rd sets GfValueEst3rd field to given value.

### HasGfValueEst3rd

`func (o *StockRankingsGuruFocusRankings) HasGfValueEst3rd() bool`

HasGfValueEst3rd returns a boolean if a field has been set.

### GetGfValuePctChange

`func (o *StockRankingsGuruFocusRankings) GetGfValuePctChange() float32`

GetGfValuePctChange returns the GfValuePctChange field if non-nil, zero value otherwise.

### GetGfValuePctChangeOk

`func (o *StockRankingsGuruFocusRankings) GetGfValuePctChangeOk() (*float32, bool)`

GetGfValuePctChangeOk returns a tuple with the GfValuePctChange field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGfValuePctChange

`func (o *StockRankingsGuruFocusRankings) SetGfValuePctChange(v float32)`

SetGfValuePctChange sets GfValuePctChange field to given value.

### HasGfValuePctChange

`func (o *StockRankingsGuruFocusRankings) HasGfValuePctChange() bool`

HasGfValuePctChange returns a boolean if a field has been set.

### GetMarginGfValue

`func (o *StockRankingsGuruFocusRankings) GetMarginGfValue() float32`

GetMarginGfValue returns the MarginGfValue field if non-nil, zero value otherwise.

### GetMarginGfValueOk

`func (o *StockRankingsGuruFocusRankings) GetMarginGfValueOk() (*float32, bool)`

GetMarginGfValueOk returns a tuple with the MarginGfValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarginGfValue

`func (o *StockRankingsGuruFocusRankings) SetMarginGfValue(v float32)`

SetMarginGfValue sets MarginGfValue field to given value.

### HasMarginGfValue

`func (o *StockRankingsGuruFocusRankings) HasMarginGfValue() bool`

HasMarginGfValue returns a boolean if a field has been set.

### GetP2gfValue

`func (o *StockRankingsGuruFocusRankings) GetP2gfValue() float32`

GetP2gfValue returns the P2gfValue field if non-nil, zero value otherwise.

### GetP2gfValueOk

`func (o *StockRankingsGuruFocusRankings) GetP2gfValueOk() (*float32, bool)`

GetP2gfValueOk returns a tuple with the P2gfValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2gfValue

`func (o *StockRankingsGuruFocusRankings) SetP2gfValue(v float32)`

SetP2gfValue sets P2gfValue field to given value.

### HasP2gfValue

`func (o *StockRankingsGuruFocusRankings) HasP2gfValue() bool`

HasP2gfValue returns a boolean if a field has been set.

### GetP2gfValueEst

`func (o *StockRankingsGuruFocusRankings) GetP2gfValueEst() float32`

GetP2gfValueEst returns the P2gfValueEst field if non-nil, zero value otherwise.

### GetP2gfValueEstOk

`func (o *StockRankingsGuruFocusRankings) GetP2gfValueEstOk() (*float32, bool)`

GetP2gfValueEstOk returns a tuple with the P2gfValueEst field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2gfValueEst

`func (o *StockRankingsGuruFocusRankings) SetP2gfValueEst(v float32)`

SetP2gfValueEst sets P2gfValueEst field to given value.

### HasP2gfValueEst

`func (o *StockRankingsGuruFocusRankings) HasP2gfValueEst() bool`

HasP2gfValueEst returns a boolean if a field has been set.

### GetP2gfValueHigh

`func (o *StockRankingsGuruFocusRankings) GetP2gfValueHigh() float32`

GetP2gfValueHigh returns the P2gfValueHigh field if non-nil, zero value otherwise.

### GetP2gfValueHighOk

`func (o *StockRankingsGuruFocusRankings) GetP2gfValueHighOk() (*float32, bool)`

GetP2gfValueHighOk returns a tuple with the P2gfValueHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2gfValueHigh

`func (o *StockRankingsGuruFocusRankings) SetP2gfValueHigh(v float32)`

SetP2gfValueHigh sets P2gfValueHigh field to given value.

### HasP2gfValueHigh

`func (o *StockRankingsGuruFocusRankings) HasP2gfValueHigh() bool`

HasP2gfValueHigh returns a boolean if a field has been set.

### GetP2gfValueLow

`func (o *StockRankingsGuruFocusRankings) GetP2gfValueLow() float32`

GetP2gfValueLow returns the P2gfValueLow field if non-nil, zero value otherwise.

### GetP2gfValueLowOk

`func (o *StockRankingsGuruFocusRankings) GetP2gfValueLowOk() (*float32, bool)`

GetP2gfValueLowOk returns a tuple with the P2gfValueLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2gfValueLow

`func (o *StockRankingsGuruFocusRankings) SetP2gfValueLow(v float32)`

SetP2gfValueLow sets P2gfValueLow field to given value.

### HasP2gfValueLow

`func (o *StockRankingsGuruFocusRankings) HasP2gfValueLow() bool`

HasP2gfValueLow returns a boolean if a field has been set.

### GetP2gfValueMed

`func (o *StockRankingsGuruFocusRankings) GetP2gfValueMed() float32`

GetP2gfValueMed returns the P2gfValueMed field if non-nil, zero value otherwise.

### GetP2gfValueMedOk

`func (o *StockRankingsGuruFocusRankings) GetP2gfValueMedOk() (*float32, bool)`

GetP2gfValueMedOk returns a tuple with the P2gfValueMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2gfValueMed

`func (o *StockRankingsGuruFocusRankings) SetP2gfValueMed(v float32)`

SetP2gfValueMed sets P2gfValueMed field to given value.

### HasP2gfValueMed

`func (o *StockRankingsGuruFocusRankings) HasP2gfValueMed() bool`

HasP2gfValueMed returns a boolean if a field has been set.

### GetPredictability

`func (o *StockRankingsGuruFocusRankings) GetPredictability() string`

GetPredictability returns the Predictability field if non-nil, zero value otherwise.

### GetPredictabilityOk

`func (o *StockRankingsGuruFocusRankings) GetPredictabilityOk() (*string, bool)`

GetPredictabilityOk returns a tuple with the Predictability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPredictability

`func (o *StockRankingsGuruFocusRankings) SetPredictability(v string)`

SetPredictability sets Predictability field to given value.

### HasPredictability

`func (o *StockRankingsGuruFocusRankings) HasPredictability() bool`

HasPredictability returns a boolean if a field has been set.

### GetRankBalancesheet

`func (o *StockRankingsGuruFocusRankings) GetRankBalancesheet() float32`

GetRankBalancesheet returns the RankBalancesheet field if non-nil, zero value otherwise.

### GetRankBalancesheetOk

`func (o *StockRankingsGuruFocusRankings) GetRankBalancesheetOk() (*float32, bool)`

GetRankBalancesheetOk returns a tuple with the RankBalancesheet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRankBalancesheet

`func (o *StockRankingsGuruFocusRankings) SetRankBalancesheet(v float32)`

SetRankBalancesheet sets RankBalancesheet field to given value.

### HasRankBalancesheet

`func (o *StockRankingsGuruFocusRankings) HasRankBalancesheet() bool`

HasRankBalancesheet returns a boolean if a field has been set.

### GetRankBalancesheetHigh

`func (o *StockRankingsGuruFocusRankings) GetRankBalancesheetHigh() float32`

GetRankBalancesheetHigh returns the RankBalancesheetHigh field if non-nil, zero value otherwise.

### GetRankBalancesheetHighOk

`func (o *StockRankingsGuruFocusRankings) GetRankBalancesheetHighOk() (*float32, bool)`

GetRankBalancesheetHighOk returns a tuple with the RankBalancesheetHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRankBalancesheetHigh

`func (o *StockRankingsGuruFocusRankings) SetRankBalancesheetHigh(v float32)`

SetRankBalancesheetHigh sets RankBalancesheetHigh field to given value.

### HasRankBalancesheetHigh

`func (o *StockRankingsGuruFocusRankings) HasRankBalancesheetHigh() bool`

HasRankBalancesheetHigh returns a boolean if a field has been set.

### GetRankBalancesheetLow

`func (o *StockRankingsGuruFocusRankings) GetRankBalancesheetLow() float32`

GetRankBalancesheetLow returns the RankBalancesheetLow field if non-nil, zero value otherwise.

### GetRankBalancesheetLowOk

`func (o *StockRankingsGuruFocusRankings) GetRankBalancesheetLowOk() (*float32, bool)`

GetRankBalancesheetLowOk returns a tuple with the RankBalancesheetLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRankBalancesheetLow

`func (o *StockRankingsGuruFocusRankings) SetRankBalancesheetLow(v float32)`

SetRankBalancesheetLow sets RankBalancesheetLow field to given value.

### HasRankBalancesheetLow

`func (o *StockRankingsGuruFocusRankings) HasRankBalancesheetLow() bool`

HasRankBalancesheetLow returns a boolean if a field has been set.

### GetRankBalancesheetMed

`func (o *StockRankingsGuruFocusRankings) GetRankBalancesheetMed() float32`

GetRankBalancesheetMed returns the RankBalancesheetMed field if non-nil, zero value otherwise.

### GetRankBalancesheetMedOk

`func (o *StockRankingsGuruFocusRankings) GetRankBalancesheetMedOk() (*float32, bool)`

GetRankBalancesheetMedOk returns a tuple with the RankBalancesheetMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRankBalancesheetMed

`func (o *StockRankingsGuruFocusRankings) SetRankBalancesheetMed(v float32)`

SetRankBalancesheetMed sets RankBalancesheetMed field to given value.

### HasRankBalancesheetMed

`func (o *StockRankingsGuruFocusRankings) HasRankBalancesheetMed() bool`

HasRankBalancesheetMed returns a boolean if a field has been set.

### GetRankGfValue

`func (o *StockRankingsGuruFocusRankings) GetRankGfValue() float32`

GetRankGfValue returns the RankGfValue field if non-nil, zero value otherwise.

### GetRankGfValueOk

`func (o *StockRankingsGuruFocusRankings) GetRankGfValueOk() (*float32, bool)`

GetRankGfValueOk returns a tuple with the RankGfValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRankGfValue

`func (o *StockRankingsGuruFocusRankings) SetRankGfValue(v float32)`

SetRankGfValue sets RankGfValue field to given value.

### HasRankGfValue

`func (o *StockRankingsGuruFocusRankings) HasRankGfValue() bool`

HasRankGfValue returns a boolean if a field has been set.

### GetRankGfValueHigh

`func (o *StockRankingsGuruFocusRankings) GetRankGfValueHigh() float32`

GetRankGfValueHigh returns the RankGfValueHigh field if non-nil, zero value otherwise.

### GetRankGfValueHighOk

`func (o *StockRankingsGuruFocusRankings) GetRankGfValueHighOk() (*float32, bool)`

GetRankGfValueHighOk returns a tuple with the RankGfValueHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRankGfValueHigh

`func (o *StockRankingsGuruFocusRankings) SetRankGfValueHigh(v float32)`

SetRankGfValueHigh sets RankGfValueHigh field to given value.

### HasRankGfValueHigh

`func (o *StockRankingsGuruFocusRankings) HasRankGfValueHigh() bool`

HasRankGfValueHigh returns a boolean if a field has been set.

### GetRankGfValueLow

`func (o *StockRankingsGuruFocusRankings) GetRankGfValueLow() float32`

GetRankGfValueLow returns the RankGfValueLow field if non-nil, zero value otherwise.

### GetRankGfValueLowOk

`func (o *StockRankingsGuruFocusRankings) GetRankGfValueLowOk() (*float32, bool)`

GetRankGfValueLowOk returns a tuple with the RankGfValueLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRankGfValueLow

`func (o *StockRankingsGuruFocusRankings) SetRankGfValueLow(v float32)`

SetRankGfValueLow sets RankGfValueLow field to given value.

### HasRankGfValueLow

`func (o *StockRankingsGuruFocusRankings) HasRankGfValueLow() bool`

HasRankGfValueLow returns a boolean if a field has been set.

### GetRankGrowth

`func (o *StockRankingsGuruFocusRankings) GetRankGrowth() float32`

GetRankGrowth returns the RankGrowth field if non-nil, zero value otherwise.

### GetRankGrowthOk

`func (o *StockRankingsGuruFocusRankings) GetRankGrowthOk() (*float32, bool)`

GetRankGrowthOk returns a tuple with the RankGrowth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRankGrowth

`func (o *StockRankingsGuruFocusRankings) SetRankGrowth(v float32)`

SetRankGrowth sets RankGrowth field to given value.

### HasRankGrowth

`func (o *StockRankingsGuruFocusRankings) HasRankGrowth() bool`

HasRankGrowth returns a boolean if a field has been set.

### GetRankGrowthHigh

`func (o *StockRankingsGuruFocusRankings) GetRankGrowthHigh() float32`

GetRankGrowthHigh returns the RankGrowthHigh field if non-nil, zero value otherwise.

### GetRankGrowthHighOk

`func (o *StockRankingsGuruFocusRankings) GetRankGrowthHighOk() (*float32, bool)`

GetRankGrowthHighOk returns a tuple with the RankGrowthHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRankGrowthHigh

`func (o *StockRankingsGuruFocusRankings) SetRankGrowthHigh(v float32)`

SetRankGrowthHigh sets RankGrowthHigh field to given value.

### HasRankGrowthHigh

`func (o *StockRankingsGuruFocusRankings) HasRankGrowthHigh() bool`

HasRankGrowthHigh returns a boolean if a field has been set.

### GetRankGrowthLow

`func (o *StockRankingsGuruFocusRankings) GetRankGrowthLow() float32`

GetRankGrowthLow returns the RankGrowthLow field if non-nil, zero value otherwise.

### GetRankGrowthLowOk

`func (o *StockRankingsGuruFocusRankings) GetRankGrowthLowOk() (*float32, bool)`

GetRankGrowthLowOk returns a tuple with the RankGrowthLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRankGrowthLow

`func (o *StockRankingsGuruFocusRankings) SetRankGrowthLow(v float32)`

SetRankGrowthLow sets RankGrowthLow field to given value.

### HasRankGrowthLow

`func (o *StockRankingsGuruFocusRankings) HasRankGrowthLow() bool`

HasRankGrowthLow returns a boolean if a field has been set.

### GetRankGrowthMed

`func (o *StockRankingsGuruFocusRankings) GetRankGrowthMed() float32`

GetRankGrowthMed returns the RankGrowthMed field if non-nil, zero value otherwise.

### GetRankGrowthMedOk

`func (o *StockRankingsGuruFocusRankings) GetRankGrowthMedOk() (*float32, bool)`

GetRankGrowthMedOk returns a tuple with the RankGrowthMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRankGrowthMed

`func (o *StockRankingsGuruFocusRankings) SetRankGrowthMed(v float32)`

SetRankGrowthMed sets RankGrowthMed field to given value.

### HasRankGrowthMed

`func (o *StockRankingsGuruFocusRankings) HasRankGrowthMed() bool`

HasRankGrowthMed returns a boolean if a field has been set.

### GetRankMomentum

`func (o *StockRankingsGuruFocusRankings) GetRankMomentum() float32`

GetRankMomentum returns the RankMomentum field if non-nil, zero value otherwise.

### GetRankMomentumOk

`func (o *StockRankingsGuruFocusRankings) GetRankMomentumOk() (*float32, bool)`

GetRankMomentumOk returns a tuple with the RankMomentum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRankMomentum

`func (o *StockRankingsGuruFocusRankings) SetRankMomentum(v float32)`

SetRankMomentum sets RankMomentum field to given value.

### HasRankMomentum

`func (o *StockRankingsGuruFocusRankings) HasRankMomentum() bool`

HasRankMomentum returns a boolean if a field has been set.

### GetRankMomentumHigh

`func (o *StockRankingsGuruFocusRankings) GetRankMomentumHigh() float32`

GetRankMomentumHigh returns the RankMomentumHigh field if non-nil, zero value otherwise.

### GetRankMomentumHighOk

`func (o *StockRankingsGuruFocusRankings) GetRankMomentumHighOk() (*float32, bool)`

GetRankMomentumHighOk returns a tuple with the RankMomentumHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRankMomentumHigh

`func (o *StockRankingsGuruFocusRankings) SetRankMomentumHigh(v float32)`

SetRankMomentumHigh sets RankMomentumHigh field to given value.

### HasRankMomentumHigh

`func (o *StockRankingsGuruFocusRankings) HasRankMomentumHigh() bool`

HasRankMomentumHigh returns a boolean if a field has been set.

### GetRankMomentumLow

`func (o *StockRankingsGuruFocusRankings) GetRankMomentumLow() float32`

GetRankMomentumLow returns the RankMomentumLow field if non-nil, zero value otherwise.

### GetRankMomentumLowOk

`func (o *StockRankingsGuruFocusRankings) GetRankMomentumLowOk() (*float32, bool)`

GetRankMomentumLowOk returns a tuple with the RankMomentumLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRankMomentumLow

`func (o *StockRankingsGuruFocusRankings) SetRankMomentumLow(v float32)`

SetRankMomentumLow sets RankMomentumLow field to given value.

### HasRankMomentumLow

`func (o *StockRankingsGuruFocusRankings) HasRankMomentumLow() bool`

HasRankMomentumLow returns a boolean if a field has been set.

### GetRankMomentumMed

`func (o *StockRankingsGuruFocusRankings) GetRankMomentumMed() float32`

GetRankMomentumMed returns the RankMomentumMed field if non-nil, zero value otherwise.

### GetRankMomentumMedOk

`func (o *StockRankingsGuruFocusRankings) GetRankMomentumMedOk() (*float32, bool)`

GetRankMomentumMedOk returns a tuple with the RankMomentumMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRankMomentumMed

`func (o *StockRankingsGuruFocusRankings) SetRankMomentumMed(v float32)`

SetRankMomentumMed sets RankMomentumMed field to given value.

### HasRankMomentumMed

`func (o *StockRankingsGuruFocusRankings) HasRankMomentumMed() bool`

HasRankMomentumMed returns a boolean if a field has been set.

### GetRankProfitability

`func (o *StockRankingsGuruFocusRankings) GetRankProfitability() float32`

GetRankProfitability returns the RankProfitability field if non-nil, zero value otherwise.

### GetRankProfitabilityOk

`func (o *StockRankingsGuruFocusRankings) GetRankProfitabilityOk() (*float32, bool)`

GetRankProfitabilityOk returns a tuple with the RankProfitability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRankProfitability

`func (o *StockRankingsGuruFocusRankings) SetRankProfitability(v float32)`

SetRankProfitability sets RankProfitability field to given value.

### HasRankProfitability

`func (o *StockRankingsGuruFocusRankings) HasRankProfitability() bool`

HasRankProfitability returns a boolean if a field has been set.

### GetRankProfitabilityHigh

`func (o *StockRankingsGuruFocusRankings) GetRankProfitabilityHigh() float32`

GetRankProfitabilityHigh returns the RankProfitabilityHigh field if non-nil, zero value otherwise.

### GetRankProfitabilityHighOk

`func (o *StockRankingsGuruFocusRankings) GetRankProfitabilityHighOk() (*float32, bool)`

GetRankProfitabilityHighOk returns a tuple with the RankProfitabilityHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRankProfitabilityHigh

`func (o *StockRankingsGuruFocusRankings) SetRankProfitabilityHigh(v float32)`

SetRankProfitabilityHigh sets RankProfitabilityHigh field to given value.

### HasRankProfitabilityHigh

`func (o *StockRankingsGuruFocusRankings) HasRankProfitabilityHigh() bool`

HasRankProfitabilityHigh returns a boolean if a field has been set.

### GetRankProfitabilityLow

`func (o *StockRankingsGuruFocusRankings) GetRankProfitabilityLow() float32`

GetRankProfitabilityLow returns the RankProfitabilityLow field if non-nil, zero value otherwise.

### GetRankProfitabilityLowOk

`func (o *StockRankingsGuruFocusRankings) GetRankProfitabilityLowOk() (*float32, bool)`

GetRankProfitabilityLowOk returns a tuple with the RankProfitabilityLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRankProfitabilityLow

`func (o *StockRankingsGuruFocusRankings) SetRankProfitabilityLow(v float32)`

SetRankProfitabilityLow sets RankProfitabilityLow field to given value.

### HasRankProfitabilityLow

`func (o *StockRankingsGuruFocusRankings) HasRankProfitabilityLow() bool`

HasRankProfitabilityLow returns a boolean if a field has been set.

### GetRankProfitabilityMed

`func (o *StockRankingsGuruFocusRankings) GetRankProfitabilityMed() float32`

GetRankProfitabilityMed returns the RankProfitabilityMed field if non-nil, zero value otherwise.

### GetRankProfitabilityMedOk

`func (o *StockRankingsGuruFocusRankings) GetRankProfitabilityMedOk() (*float32, bool)`

GetRankProfitabilityMedOk returns a tuple with the RankProfitabilityMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRankProfitabilityMed

`func (o *StockRankingsGuruFocusRankings) SetRankProfitabilityMed(v float32)`

SetRankProfitabilityMed sets RankProfitabilityMed field to given value.

### HasRankProfitabilityMed

`func (o *StockRankingsGuruFocusRankings) HasRankProfitabilityMed() bool`

HasRankProfitabilityMed returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


