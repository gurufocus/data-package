# ValuationsNNOREITNODIRECTPerShareData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BookValuePerShare** | Pointer to **float32** | Per share value of a company based on common shareholders&#39; equity in the company. | [optional] 
**CashFlowFromOperationsPerShare** | Pointer to **float32** | Operating Cash Flow per Share is the amount of Operating Cash Flow per outstanding share of the company | [optional] 
**CashPerShare** | Pointer to **float32** |  | [optional] 
**DividendsPerShare** | Pointer to **float32** | Dividends paid to per common share | [optional] 
**EarningPerShareDiluted** | Pointer to **float32** | The company&#39;s diluted earnings per share | [optional] 
**EbitPerShare** | Pointer to **float32** | The earnings before interest and taxes divided by shares outstanding | [optional] 
**EbitdaPerShare** | Pointer to **float32** | EBITDA per Share is the amount of Earnings Before Interest, Taxes, Depreciation, and  Amortization (EBITDA) per outstanding share of the company™s stock.     Earnings Before Interest, Taxes, Depreciation, and  Amortization (EBITDA) is what the company earns before  it expenses interest, taxes, depreciation and amortization.  EBITDA is calculated as   EBITDA   &#x3D; {Revenue} - {Cost of Goods Sold} - {Selling, General, &amp; Admin. Expense} - {Research &amp; Development}  &#x3D; {Gross Profit} - {Selling, General, &amp; Admin. Expense} - {Research &amp; Development} | [optional] 
**EpsWithoutNri** | Pointer to **float32** | Earnings Per Share (EPS) is the single most important variable used by Wall Street in determining the earnings power of a company. But investors need to be aware that Earnings per Share can be easily manipulated by adjusting depreciation and amortization rate or non-recurring items. That&#39;s why GuruFocus lists Earnings per share without Non-Recurring Items, which better reflects the company&#39;s underlying performance.    Earnings Per Share without Non-Recurring Items is the amount of earnings without non-recurring items per outstanding share of the company&amp;#146;s stock. In calculating earnings per share without non-recurring items, the dividends of preferred stocks and non-recurring items need to subtracted from the total net income first. | [optional] 
**FreeCashFlowPerShare** | Pointer to **float32** | The company&#39;s free cash flow divided by shares outstanding | [optional] 
**MonthEndStockPrice** | Pointer to **float32** | The company&#39;s share price at the final day of the month | [optional] 
**OwnerEarnings** | Pointer to **float32** | If we think through these questions, we can gain some insights about what may be called &#39;owner earnings.&#39; These represent (A) reported earnings plus (B) depreciation, depletion, amortization, and certain other non-cash charges such as Company N&#39;s items (1) and (4) less the average annual amount of capitalized expenditures for plant and equipment, etc. that the business requires to fully maintain its long-term competitive position and its unit volume. (If the business requires additional working capital to maintain its competitive position and unit volume, the increment also should be included in (c). However, businesses following the LIFO inventory method usually do not require additional working capital if unit volume does not change. | [optional] 
**RevenuePerShare** | Pointer to **float32** | The company&#39;s total revenue divided by shares outstanding. | [optional] 
**TangiblesBookPerShare** | Pointer to **float32** | The per share value of a company based on common shareholder&#39;s equity less intangible assets | [optional] 
**TotalDebtPerShare** | Pointer to **float32** | The amount of long-term debt divided by the shares outstanding | [optional] 

## Methods

### NewValuationsNNOREITNODIRECTPerShareData

`func NewValuationsNNOREITNODIRECTPerShareData() *ValuationsNNOREITNODIRECTPerShareData`

NewValuationsNNOREITNODIRECTPerShareData instantiates a new ValuationsNNOREITNODIRECTPerShareData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewValuationsNNOREITNODIRECTPerShareDataWithDefaults

`func NewValuationsNNOREITNODIRECTPerShareDataWithDefaults() *ValuationsNNOREITNODIRECTPerShareData`

NewValuationsNNOREITNODIRECTPerShareDataWithDefaults instantiates a new ValuationsNNOREITNODIRECTPerShareData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBookValuePerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetBookValuePerShare() float32`

GetBookValuePerShare returns the BookValuePerShare field if non-nil, zero value otherwise.

### GetBookValuePerShareOk

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetBookValuePerShareOk() (*float32, bool)`

GetBookValuePerShareOk returns a tuple with the BookValuePerShare field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBookValuePerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) SetBookValuePerShare(v float32)`

SetBookValuePerShare sets BookValuePerShare field to given value.

### HasBookValuePerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) HasBookValuePerShare() bool`

HasBookValuePerShare returns a boolean if a field has been set.

### GetCashFlowFromOperationsPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetCashFlowFromOperationsPerShare() float32`

GetCashFlowFromOperationsPerShare returns the CashFlowFromOperationsPerShare field if non-nil, zero value otherwise.

### GetCashFlowFromOperationsPerShareOk

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetCashFlowFromOperationsPerShareOk() (*float32, bool)`

GetCashFlowFromOperationsPerShareOk returns a tuple with the CashFlowFromOperationsPerShare field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashFlowFromOperationsPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) SetCashFlowFromOperationsPerShare(v float32)`

SetCashFlowFromOperationsPerShare sets CashFlowFromOperationsPerShare field to given value.

### HasCashFlowFromOperationsPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) HasCashFlowFromOperationsPerShare() bool`

HasCashFlowFromOperationsPerShare returns a boolean if a field has been set.

### GetCashPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetCashPerShare() float32`

GetCashPerShare returns the CashPerShare field if non-nil, zero value otherwise.

### GetCashPerShareOk

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetCashPerShareOk() (*float32, bool)`

GetCashPerShareOk returns a tuple with the CashPerShare field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) SetCashPerShare(v float32)`

SetCashPerShare sets CashPerShare field to given value.

### HasCashPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) HasCashPerShare() bool`

HasCashPerShare returns a boolean if a field has been set.

### GetDividendsPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetDividendsPerShare() float32`

GetDividendsPerShare returns the DividendsPerShare field if non-nil, zero value otherwise.

### GetDividendsPerShareOk

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetDividendsPerShareOk() (*float32, bool)`

GetDividendsPerShareOk returns a tuple with the DividendsPerShare field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDividendsPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) SetDividendsPerShare(v float32)`

SetDividendsPerShare sets DividendsPerShare field to given value.

### HasDividendsPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) HasDividendsPerShare() bool`

HasDividendsPerShare returns a boolean if a field has been set.

### GetEarningPerShareDiluted

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetEarningPerShareDiluted() float32`

GetEarningPerShareDiluted returns the EarningPerShareDiluted field if non-nil, zero value otherwise.

### GetEarningPerShareDilutedOk

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetEarningPerShareDilutedOk() (*float32, bool)`

GetEarningPerShareDilutedOk returns a tuple with the EarningPerShareDiluted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEarningPerShareDiluted

`func (o *ValuationsNNOREITNODIRECTPerShareData) SetEarningPerShareDiluted(v float32)`

SetEarningPerShareDiluted sets EarningPerShareDiluted field to given value.

### HasEarningPerShareDiluted

`func (o *ValuationsNNOREITNODIRECTPerShareData) HasEarningPerShareDiluted() bool`

HasEarningPerShareDiluted returns a boolean if a field has been set.

### GetEbitPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetEbitPerShare() float32`

GetEbitPerShare returns the EbitPerShare field if non-nil, zero value otherwise.

### GetEbitPerShareOk

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetEbitPerShareOk() (*float32, bool)`

GetEbitPerShareOk returns a tuple with the EbitPerShare field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEbitPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) SetEbitPerShare(v float32)`

SetEbitPerShare sets EbitPerShare field to given value.

### HasEbitPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) HasEbitPerShare() bool`

HasEbitPerShare returns a boolean if a field has been set.

### GetEbitdaPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetEbitdaPerShare() float32`

GetEbitdaPerShare returns the EbitdaPerShare field if non-nil, zero value otherwise.

### GetEbitdaPerShareOk

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetEbitdaPerShareOk() (*float32, bool)`

GetEbitdaPerShareOk returns a tuple with the EbitdaPerShare field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEbitdaPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) SetEbitdaPerShare(v float32)`

SetEbitdaPerShare sets EbitdaPerShare field to given value.

### HasEbitdaPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) HasEbitdaPerShare() bool`

HasEbitdaPerShare returns a boolean if a field has been set.

### GetEpsWithoutNri

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetEpsWithoutNri() float32`

GetEpsWithoutNri returns the EpsWithoutNri field if non-nil, zero value otherwise.

### GetEpsWithoutNriOk

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetEpsWithoutNriOk() (*float32, bool)`

GetEpsWithoutNriOk returns a tuple with the EpsWithoutNri field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEpsWithoutNri

`func (o *ValuationsNNOREITNODIRECTPerShareData) SetEpsWithoutNri(v float32)`

SetEpsWithoutNri sets EpsWithoutNri field to given value.

### HasEpsWithoutNri

`func (o *ValuationsNNOREITNODIRECTPerShareData) HasEpsWithoutNri() bool`

HasEpsWithoutNri returns a boolean if a field has been set.

### GetFreeCashFlowPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetFreeCashFlowPerShare() float32`

GetFreeCashFlowPerShare returns the FreeCashFlowPerShare field if non-nil, zero value otherwise.

### GetFreeCashFlowPerShareOk

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetFreeCashFlowPerShareOk() (*float32, bool)`

GetFreeCashFlowPerShareOk returns a tuple with the FreeCashFlowPerShare field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFreeCashFlowPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) SetFreeCashFlowPerShare(v float32)`

SetFreeCashFlowPerShare sets FreeCashFlowPerShare field to given value.

### HasFreeCashFlowPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) HasFreeCashFlowPerShare() bool`

HasFreeCashFlowPerShare returns a boolean if a field has been set.

### GetMonthEndStockPrice

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetMonthEndStockPrice() float32`

GetMonthEndStockPrice returns the MonthEndStockPrice field if non-nil, zero value otherwise.

### GetMonthEndStockPriceOk

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetMonthEndStockPriceOk() (*float32, bool)`

GetMonthEndStockPriceOk returns a tuple with the MonthEndStockPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMonthEndStockPrice

`func (o *ValuationsNNOREITNODIRECTPerShareData) SetMonthEndStockPrice(v float32)`

SetMonthEndStockPrice sets MonthEndStockPrice field to given value.

### HasMonthEndStockPrice

`func (o *ValuationsNNOREITNODIRECTPerShareData) HasMonthEndStockPrice() bool`

HasMonthEndStockPrice returns a boolean if a field has been set.

### GetOwnerEarnings

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetOwnerEarnings() float32`

GetOwnerEarnings returns the OwnerEarnings field if non-nil, zero value otherwise.

### GetOwnerEarningsOk

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetOwnerEarningsOk() (*float32, bool)`

GetOwnerEarningsOk returns a tuple with the OwnerEarnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOwnerEarnings

`func (o *ValuationsNNOREITNODIRECTPerShareData) SetOwnerEarnings(v float32)`

SetOwnerEarnings sets OwnerEarnings field to given value.

### HasOwnerEarnings

`func (o *ValuationsNNOREITNODIRECTPerShareData) HasOwnerEarnings() bool`

HasOwnerEarnings returns a boolean if a field has been set.

### GetRevenuePerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetRevenuePerShare() float32`

GetRevenuePerShare returns the RevenuePerShare field if non-nil, zero value otherwise.

### GetRevenuePerShareOk

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetRevenuePerShareOk() (*float32, bool)`

GetRevenuePerShareOk returns a tuple with the RevenuePerShare field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevenuePerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) SetRevenuePerShare(v float32)`

SetRevenuePerShare sets RevenuePerShare field to given value.

### HasRevenuePerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) HasRevenuePerShare() bool`

HasRevenuePerShare returns a boolean if a field has been set.

### GetTangiblesBookPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetTangiblesBookPerShare() float32`

GetTangiblesBookPerShare returns the TangiblesBookPerShare field if non-nil, zero value otherwise.

### GetTangiblesBookPerShareOk

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetTangiblesBookPerShareOk() (*float32, bool)`

GetTangiblesBookPerShareOk returns a tuple with the TangiblesBookPerShare field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTangiblesBookPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) SetTangiblesBookPerShare(v float32)`

SetTangiblesBookPerShare sets TangiblesBookPerShare field to given value.

### HasTangiblesBookPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) HasTangiblesBookPerShare() bool`

HasTangiblesBookPerShare returns a boolean if a field has been set.

### GetTotalDebtPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetTotalDebtPerShare() float32`

GetTotalDebtPerShare returns the TotalDebtPerShare field if non-nil, zero value otherwise.

### GetTotalDebtPerShareOk

`func (o *ValuationsNNOREITNODIRECTPerShareData) GetTotalDebtPerShareOk() (*float32, bool)`

GetTotalDebtPerShareOk returns a tuple with the TotalDebtPerShare field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalDebtPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) SetTotalDebtPerShare(v float32)`

SetTotalDebtPerShare sets TotalDebtPerShare field to given value.

### HasTotalDebtPerShare

`func (o *ValuationsNNOREITNODIRECTPerShareData) HasTotalDebtPerShare() bool`

HasTotalDebtPerShare returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


