# FundamentalsNNOREITDIRECTIncomeStatement

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CostOfGoodsSold** | Pointer to **float32** | &lt;p&gt;{{cogs}} is the aggregate cost of goods produced and sold, and services rendered during the reporting period. It excludes {{TotalOperatingExpense}}, such as {{DDA}} and {{SGA}}. &lt;br&gt;{{cogs}} is directly linked to profitability of the company through {{grossmargin}}. {{grossmargin}} is calculated as ({{revenue}} - {{cogs}}) / {{revenue}}. &lt;br&gt;{{cogs}} is also directly linked to another concept called {{InventoryTurnover}}, which is calculated as {{COGS}} / Average {{Inventory}}.&lt;/p&gt; | [optional] 
**DepreciationDepletionAmortization** | Pointer to **float32** | &lt;p&gt;{{DDA}} is a present expense that accounts for the past cost of an asset that is now providing benefits. Depletion and amortization are synonyms for depreciation. Generally: The term depreciation is used when discussing man made tangible assets. The term depletion is used when discussing natural tangible assets. The term amortization is used when discussing intangible assets&lt;/p&gt; | [optional] 
**Ebit** | Pointer to **float32** | In accounting and finance, earnings before interest and taxes (EBIT), is a measure of a firm&#39;s profit that includes all expenses except interest and income tax expenses. It is the difference between operating revenues and operating expenses. | [optional] 
**Ebitda** | Pointer to **float32** | &lt;p&gt;Earnings Before Interest, Taxes, Depreciation, and Amortization ({{EBITDA}}) is what the company earns before it expenses interest, taxes, depreciation and amortization. &lt;br&gt;{{EBITDA}} is calculated as {{EBITDA}} &#x3D; {{Revenue}} - {{COGS}} - {{SGA}} - {{RD}} &#x3D; {{Gross_Profit}} - {{SGA}} - {{RD}} &lt;br&gt; The use of {{EBITDA}} is an attempt to make the results of different companies more comparable and uniform.&lt;/p&gt; | [optional] 
**EbitdaMargin** | Pointer to **float32** |  | [optional] 
**EpsBasic** | Pointer to **float32** | &lt;p&gt;{{eps_basic}} is a rough measurement of the amount of a company&#39;s profit that can be allocated to one share of its stock. {{eps_basic}} do not factor in the dilutive effects on convertible securities. &lt;br&gt;{{eps_basic}} is calculated as: {{eps_basic}} &#x3D; ({{Net_Income}} - {{IS_preferred_dividends}}) / {{shares_basic}}&lt;/p&gt; | [optional] 
**EpsDiluated** | Pointer to **float32** | &lt;p&gt;{{eps_diluated}} is a rough measurement of the amount of a company&#39;s profit that can be allocated to one share of its stock. {{eps_diluated}} takes into account all of the outstanding dilutive securities that could potentially be exercised (such as stock options and convertible {{Preferred_Stock}}) and shows how such an action would impact {{per_share_eps}}. &lt;br&gt;{{eps_diluated}} is calculated as: {{eps_diluated}} &#x3D; ({{Net_Income}} - {{IS_preferred_dividends}}) / {{Shares_Outstanding}}&lt;/p&gt; | [optional] 
**GrossMargin** | Pointer to **float32** | Gross Margin % is calculated as gross profit divided by its revenue. | [optional] 
**GrossProfit** | Pointer to **float32** | &lt;p&gt;{{Gross_Profit}} is the different between the sale prices and the cost of buying or producing the goods. It is calculated as {{Gross_Profit}} &#x3D; {{Revenue}} - {{COGS}} &lt;br&gt;{{Gross_Profit}} is the numerator in the calculation of {{grossmargin}}: {{grossmargin}} &#x3D; {{Gross_Profit}} / {{Revenue}} &#x3D; ({{Revenue}} - {{COGS}}) / {{Revenue}} &lt;br&gt;A positive {{Gross_Profit}} is only the first step for a company to make a net profit. The {{Gross_Profit}} needs to be big enough to also cover related labor, equipment, rental, marketing/advertising, research and development and a lot of other costs in selling the products.&lt;/p&gt; | [optional] 
**InterestExpense** | Pointer to **float32** | &lt;p&gt;{{InterestExpense}} is the amount reported by a company or individual as an expense for borrowed money. It is related to {{interest_coverage}}, which is a ratio that determines how easily a company can pay interest expenses on outstanding debt. &lt;br&gt;{{interest_coverage}} is calculated as -1 * {{Operating_Income}} / {{InterestExpense}} &lt;br&gt;If both {{InterestExpense}} and {{InterestIncome}} are empty, while {{NetInterestIncome}} is negative, then use {{NetInterestIncome}} as {{InterestExpense}}.&lt;/p&gt; | [optional] 
**InterestIncome** | Pointer to **float32** | &lt;p&gt;{{InterestIncome}} is the interest earned on cash temporarily held in savings accounts, certificates of deposits, or other investments.&lt;/p&gt; | [optional] 
**IsPreferredDividends** | Pointer to **float32** | &lt;p&gt;{{IS_preferred_dividends}} is a dividend that is accrued and paid on a company&#39;s preferred shares. In the event that a company is unable to pay all dividends, claims to {{IS_preferred_dividends}} take precedence over claims to dividends that are paid on common shares.&lt;/p&gt; | [optional] 
**NetIncome** | Pointer to **float32** | &lt;p&gt;{{Net_Income}} is the net profit that a company earns after deducting all costs and losses including {{COGS}}, {{SGA}}, {{DDA}}, {{InterestExpense}}, non-recurring items and {{tax}}.  &lt;br&gt;{{Net_Income}}  &#x3D; {{Revenue}} - {{COGS}}, - {{SGA}} - {{RD}}  - {{DDA}} - {{InterestExpense}} + Non-Recurring Items  - {{tax}} &#x3D; Earnings Before Depreciation and Amortization - {{DDA}} - {{InterestExpense}} - Non-Recurring Items (NRI) - {{tax}} &#x3D; {{Operating_Income}} - {{InterestExpense}} - Non-Recurring Items (NRI) - {{tax}} &#x3D; {{Pretax_Income}} - {{tax}}&lt;/p&gt; | [optional] 
**NetIncomeContinuingOperations** | Pointer to **float32** | &lt;p&gt;{{Net_Income_(Continuing_Operations)}} indicates the net income that a firm brings in from ongoing business activities. These activities are expected to continue into the next reporting period.&lt;/p&gt; | [optional] 
**NetIncomeDiscontinuedOperations** | Pointer to **float32** | &lt;p&gt;{{Net_Income_(Discontinued_Operations)}} indicates the net income that a firm brought in from operations that will not be used in future reporting periods.&lt;/p&gt; | [optional] 
**NetIncomeIncludingNoncontrollingInterests** | Pointer to **float32** |  | [optional] 
**NetInterestIncome** | Pointer to **float32** | &lt;p&gt;{{IS_NetInterestIncome}} is the income earned by banks from the fund they have on their balance sheet.&lt;/p&gt; | [optional] 
**NetMargin** | Pointer to **float32** | Net margin is calculated as Net Income divided by its Revenue. | [optional] 
**OperatingIncome** | Pointer to **float32** | &lt;p&gt;{{Operating_Income}}, sometimes also called Earnings Before Interest and Taxes (EBIT), is the profit a company earned through operations. All expenses, including cash expenses such as {{COGS}}, {{RD}}, wages, and non-cash expenses, such as {{DDA}}, have been deducted from the sales. &lt;br&gt;{{Operating_Income}} (EBIT) &#x3D; {{Revenue}} - {{COGS}} - {{SGA}} - {{RD}} - {{DDA}} &#x3D; {{Gross_Profit}} - {{SGA}} - {{RD}} - {{DDA}} &#x3D; {{EBITDA}} - {{DDA}}&lt;/p&gt; | [optional] 
**OperatingMargin** | Pointer to **float32** | Operating Margin % is calculated as Operating Income divided by its Revenue. | [optional] 
**OtherIncomeExpense** | Pointer to **float32** | &lt;p&gt;{{OtherIncomeExpense}} includes {{Minority_interest}}. {{Minority_interest}} is a significant but non-controlling ownership of less than 50% of a company&#39;s voting shares by either an investor or another company.&lt;/p&gt; | [optional] 
**OtherIncomeMinorityInterest** | Pointer to **float32** | &lt;p&gt;{{OtherIncomeExpense}} includes {{Minority_interest}}. {{Minority_interest}} is a significant but non-controlling ownership of less than 50% of a company&#39;s voting shares by either an investor or another company.&lt;/p&gt; | [optional] 
**OtherNetIncomeLoss** | Pointer to **float32** |  | [optional] 
**OtherOperatingCharges** | Pointer to **float32** | &lt;p&gt;GuruFocus uses a standardized financial statement format for all companies. For non-financial companies, GuruFocus lists {{SGA}}, Advertising, {{RD}}, and {{other_operating_charges}} under the \&quot;{{TotalOperatingExpense}}\&quot; section. {{other_operating_charges}} sometimes includes: Restructuring, and merger, Acquisition related and other, Litigation settlement charge, Other (too numerous to list). Some companies can and do choose to report each of these items separately. Yet, there are a variety of {{other_operating_charges}} which are simply too numerous to list.&lt;/p&gt; | [optional] 
**PretaxIncome** | Pointer to **float32** | &lt;p&gt;{{Pretax_Income}} is the income that a company earns before paying income taxes. &lt;br&gt;{{Pretax_Income}} is calculated as {{Operating_Income}} + {{Non_Operating_Income}} + {{InterestExpense}} + {{InterestIncome}} + other&lt;/p&gt; | [optional] 
**ResearchDevelopment** | Pointer to **float32** | &lt;p&gt;This is the expense the company spent on research and development.&lt;br&gt;If competitive advantage is created by a patent or tech advantage, at some point it will disappear. High {{RD}} usually dictates high {{SGA}} which threatens the competitive advantage.&lt;/p&gt; | [optional] 
**Revenue** | Pointer to **float32** |  | [optional] 
**SellingGeneralAdminExpense** | Pointer to **float32** | Selling, General, &amp; Admin. Expense (SGA) includes the direct and indirect costs and all general and administrative expenses of a company. For instance, personnel cost, advertising, rent, communication costs are all part of SGA. | [optional] 
**SharesOutstanding** | Pointer to **float32** | &lt;p&gt;{{Cash_Flow_from_Others}} may include {{ChangeInWorkingCapital}}. These are cash differences caused by the {{ChangeInInventory}}, {{AccountsPayable}}, {{Accts_Rec}} etc. For instance, if a company pays its suppliers slower, its cash position will build up faster. If a company receives payments from its customers slower, its {{Accts_Rec}} will rise, and its cash position will grow more slowly (or even shrink).&lt;/p&gt; | [optional] 
**TaxProvision** | Pointer to **float32** | &lt;p&gt;{{TaxProvision}} is the tax to be paid.&lt;/p&gt; | [optional] 
**TaxRate** | Pointer to **float32** | &lt;p&gt;{{TaxRate}} is the ratio of {{tax}} divided by {{Pretax_Income}}, usually presented in percent. &lt;br&gt; {{{TaxRate}} &#x3D; {{tax}} / {{Pretax_Income}}&lt;/p&gt; | [optional] 
**TotalOperatingExpense** | Pointer to **float32** |  | [optional] 

## Methods

### NewFundamentalsNNOREITDIRECTIncomeStatement

`func NewFundamentalsNNOREITDIRECTIncomeStatement() *FundamentalsNNOREITDIRECTIncomeStatement`

NewFundamentalsNNOREITDIRECTIncomeStatement instantiates a new FundamentalsNNOREITDIRECTIncomeStatement object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFundamentalsNNOREITDIRECTIncomeStatementWithDefaults

`func NewFundamentalsNNOREITDIRECTIncomeStatementWithDefaults() *FundamentalsNNOREITDIRECTIncomeStatement`

NewFundamentalsNNOREITDIRECTIncomeStatementWithDefaults instantiates a new FundamentalsNNOREITDIRECTIncomeStatement object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCostOfGoodsSold

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetCostOfGoodsSold() float32`

GetCostOfGoodsSold returns the CostOfGoodsSold field if non-nil, zero value otherwise.

### GetCostOfGoodsSoldOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetCostOfGoodsSoldOk() (*float32, bool)`

GetCostOfGoodsSoldOk returns a tuple with the CostOfGoodsSold field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCostOfGoodsSold

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetCostOfGoodsSold(v float32)`

SetCostOfGoodsSold sets CostOfGoodsSold field to given value.

### HasCostOfGoodsSold

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasCostOfGoodsSold() bool`

HasCostOfGoodsSold returns a boolean if a field has been set.

### GetDepreciationDepletionAmortization

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetDepreciationDepletionAmortization() float32`

GetDepreciationDepletionAmortization returns the DepreciationDepletionAmortization field if non-nil, zero value otherwise.

### GetDepreciationDepletionAmortizationOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetDepreciationDepletionAmortizationOk() (*float32, bool)`

GetDepreciationDepletionAmortizationOk returns a tuple with the DepreciationDepletionAmortization field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDepreciationDepletionAmortization

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetDepreciationDepletionAmortization(v float32)`

SetDepreciationDepletionAmortization sets DepreciationDepletionAmortization field to given value.

### HasDepreciationDepletionAmortization

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasDepreciationDepletionAmortization() bool`

HasDepreciationDepletionAmortization returns a boolean if a field has been set.

### GetEbit

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetEbit() float32`

GetEbit returns the Ebit field if non-nil, zero value otherwise.

### GetEbitOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetEbitOk() (*float32, bool)`

GetEbitOk returns a tuple with the Ebit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEbit

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetEbit(v float32)`

SetEbit sets Ebit field to given value.

### HasEbit

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasEbit() bool`

HasEbit returns a boolean if a field has been set.

### GetEbitda

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetEbitda() float32`

GetEbitda returns the Ebitda field if non-nil, zero value otherwise.

### GetEbitdaOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetEbitdaOk() (*float32, bool)`

GetEbitdaOk returns a tuple with the Ebitda field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEbitda

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetEbitda(v float32)`

SetEbitda sets Ebitda field to given value.

### HasEbitda

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasEbitda() bool`

HasEbitda returns a boolean if a field has been set.

### GetEbitdaMargin

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetEbitdaMargin() float32`

GetEbitdaMargin returns the EbitdaMargin field if non-nil, zero value otherwise.

### GetEbitdaMarginOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetEbitdaMarginOk() (*float32, bool)`

GetEbitdaMarginOk returns a tuple with the EbitdaMargin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEbitdaMargin

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetEbitdaMargin(v float32)`

SetEbitdaMargin sets EbitdaMargin field to given value.

### HasEbitdaMargin

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasEbitdaMargin() bool`

HasEbitdaMargin returns a boolean if a field has been set.

### GetEpsBasic

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetEpsBasic() float32`

GetEpsBasic returns the EpsBasic field if non-nil, zero value otherwise.

### GetEpsBasicOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetEpsBasicOk() (*float32, bool)`

GetEpsBasicOk returns a tuple with the EpsBasic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEpsBasic

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetEpsBasic(v float32)`

SetEpsBasic sets EpsBasic field to given value.

### HasEpsBasic

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasEpsBasic() bool`

HasEpsBasic returns a boolean if a field has been set.

### GetEpsDiluated

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetEpsDiluated() float32`

GetEpsDiluated returns the EpsDiluated field if non-nil, zero value otherwise.

### GetEpsDiluatedOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetEpsDiluatedOk() (*float32, bool)`

GetEpsDiluatedOk returns a tuple with the EpsDiluated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEpsDiluated

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetEpsDiluated(v float32)`

SetEpsDiluated sets EpsDiluated field to given value.

### HasEpsDiluated

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasEpsDiluated() bool`

HasEpsDiluated returns a boolean if a field has been set.

### GetGrossMargin

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetGrossMargin() float32`

GetGrossMargin returns the GrossMargin field if non-nil, zero value otherwise.

### GetGrossMarginOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetGrossMarginOk() (*float32, bool)`

GetGrossMarginOk returns a tuple with the GrossMargin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrossMargin

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetGrossMargin(v float32)`

SetGrossMargin sets GrossMargin field to given value.

### HasGrossMargin

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasGrossMargin() bool`

HasGrossMargin returns a boolean if a field has been set.

### GetGrossProfit

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetGrossProfit() float32`

GetGrossProfit returns the GrossProfit field if non-nil, zero value otherwise.

### GetGrossProfitOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetGrossProfitOk() (*float32, bool)`

GetGrossProfitOk returns a tuple with the GrossProfit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrossProfit

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetGrossProfit(v float32)`

SetGrossProfit sets GrossProfit field to given value.

### HasGrossProfit

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasGrossProfit() bool`

HasGrossProfit returns a boolean if a field has been set.

### GetInterestExpense

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetInterestExpense() float32`

GetInterestExpense returns the InterestExpense field if non-nil, zero value otherwise.

### GetInterestExpenseOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetInterestExpenseOk() (*float32, bool)`

GetInterestExpenseOk returns a tuple with the InterestExpense field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInterestExpense

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetInterestExpense(v float32)`

SetInterestExpense sets InterestExpense field to given value.

### HasInterestExpense

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasInterestExpense() bool`

HasInterestExpense returns a boolean if a field has been set.

### GetInterestIncome

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetInterestIncome() float32`

GetInterestIncome returns the InterestIncome field if non-nil, zero value otherwise.

### GetInterestIncomeOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetInterestIncomeOk() (*float32, bool)`

GetInterestIncomeOk returns a tuple with the InterestIncome field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInterestIncome

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetInterestIncome(v float32)`

SetInterestIncome sets InterestIncome field to given value.

### HasInterestIncome

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasInterestIncome() bool`

HasInterestIncome returns a boolean if a field has been set.

### GetIsPreferredDividends

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetIsPreferredDividends() float32`

GetIsPreferredDividends returns the IsPreferredDividends field if non-nil, zero value otherwise.

### GetIsPreferredDividendsOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetIsPreferredDividendsOk() (*float32, bool)`

GetIsPreferredDividendsOk returns a tuple with the IsPreferredDividends field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPreferredDividends

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetIsPreferredDividends(v float32)`

SetIsPreferredDividends sets IsPreferredDividends field to given value.

### HasIsPreferredDividends

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasIsPreferredDividends() bool`

HasIsPreferredDividends returns a boolean if a field has been set.

### GetNetIncome

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetNetIncome() float32`

GetNetIncome returns the NetIncome field if non-nil, zero value otherwise.

### GetNetIncomeOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetNetIncomeOk() (*float32, bool)`

GetNetIncomeOk returns a tuple with the NetIncome field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetIncome

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetNetIncome(v float32)`

SetNetIncome sets NetIncome field to given value.

### HasNetIncome

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasNetIncome() bool`

HasNetIncome returns a boolean if a field has been set.

### GetNetIncomeContinuingOperations

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetNetIncomeContinuingOperations() float32`

GetNetIncomeContinuingOperations returns the NetIncomeContinuingOperations field if non-nil, zero value otherwise.

### GetNetIncomeContinuingOperationsOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetNetIncomeContinuingOperationsOk() (*float32, bool)`

GetNetIncomeContinuingOperationsOk returns a tuple with the NetIncomeContinuingOperations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetIncomeContinuingOperations

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetNetIncomeContinuingOperations(v float32)`

SetNetIncomeContinuingOperations sets NetIncomeContinuingOperations field to given value.

### HasNetIncomeContinuingOperations

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasNetIncomeContinuingOperations() bool`

HasNetIncomeContinuingOperations returns a boolean if a field has been set.

### GetNetIncomeDiscontinuedOperations

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetNetIncomeDiscontinuedOperations() float32`

GetNetIncomeDiscontinuedOperations returns the NetIncomeDiscontinuedOperations field if non-nil, zero value otherwise.

### GetNetIncomeDiscontinuedOperationsOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetNetIncomeDiscontinuedOperationsOk() (*float32, bool)`

GetNetIncomeDiscontinuedOperationsOk returns a tuple with the NetIncomeDiscontinuedOperations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetIncomeDiscontinuedOperations

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetNetIncomeDiscontinuedOperations(v float32)`

SetNetIncomeDiscontinuedOperations sets NetIncomeDiscontinuedOperations field to given value.

### HasNetIncomeDiscontinuedOperations

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasNetIncomeDiscontinuedOperations() bool`

HasNetIncomeDiscontinuedOperations returns a boolean if a field has been set.

### GetNetIncomeIncludingNoncontrollingInterests

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetNetIncomeIncludingNoncontrollingInterests() float32`

GetNetIncomeIncludingNoncontrollingInterests returns the NetIncomeIncludingNoncontrollingInterests field if non-nil, zero value otherwise.

### GetNetIncomeIncludingNoncontrollingInterestsOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetNetIncomeIncludingNoncontrollingInterestsOk() (*float32, bool)`

GetNetIncomeIncludingNoncontrollingInterestsOk returns a tuple with the NetIncomeIncludingNoncontrollingInterests field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetIncomeIncludingNoncontrollingInterests

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetNetIncomeIncludingNoncontrollingInterests(v float32)`

SetNetIncomeIncludingNoncontrollingInterests sets NetIncomeIncludingNoncontrollingInterests field to given value.

### HasNetIncomeIncludingNoncontrollingInterests

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasNetIncomeIncludingNoncontrollingInterests() bool`

HasNetIncomeIncludingNoncontrollingInterests returns a boolean if a field has been set.

### GetNetInterestIncome

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetNetInterestIncome() float32`

GetNetInterestIncome returns the NetInterestIncome field if non-nil, zero value otherwise.

### GetNetInterestIncomeOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetNetInterestIncomeOk() (*float32, bool)`

GetNetInterestIncomeOk returns a tuple with the NetInterestIncome field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetInterestIncome

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetNetInterestIncome(v float32)`

SetNetInterestIncome sets NetInterestIncome field to given value.

### HasNetInterestIncome

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasNetInterestIncome() bool`

HasNetInterestIncome returns a boolean if a field has been set.

### GetNetMargin

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetNetMargin() float32`

GetNetMargin returns the NetMargin field if non-nil, zero value otherwise.

### GetNetMarginOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetNetMarginOk() (*float32, bool)`

GetNetMarginOk returns a tuple with the NetMargin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetMargin

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetNetMargin(v float32)`

SetNetMargin sets NetMargin field to given value.

### HasNetMargin

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasNetMargin() bool`

HasNetMargin returns a boolean if a field has been set.

### GetOperatingIncome

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetOperatingIncome() float32`

GetOperatingIncome returns the OperatingIncome field if non-nil, zero value otherwise.

### GetOperatingIncomeOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetOperatingIncomeOk() (*float32, bool)`

GetOperatingIncomeOk returns a tuple with the OperatingIncome field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperatingIncome

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetOperatingIncome(v float32)`

SetOperatingIncome sets OperatingIncome field to given value.

### HasOperatingIncome

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasOperatingIncome() bool`

HasOperatingIncome returns a boolean if a field has been set.

### GetOperatingMargin

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetOperatingMargin() float32`

GetOperatingMargin returns the OperatingMargin field if non-nil, zero value otherwise.

### GetOperatingMarginOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetOperatingMarginOk() (*float32, bool)`

GetOperatingMarginOk returns a tuple with the OperatingMargin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperatingMargin

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetOperatingMargin(v float32)`

SetOperatingMargin sets OperatingMargin field to given value.

### HasOperatingMargin

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasOperatingMargin() bool`

HasOperatingMargin returns a boolean if a field has been set.

### GetOtherIncomeExpense

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetOtherIncomeExpense() float32`

GetOtherIncomeExpense returns the OtherIncomeExpense field if non-nil, zero value otherwise.

### GetOtherIncomeExpenseOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetOtherIncomeExpenseOk() (*float32, bool)`

GetOtherIncomeExpenseOk returns a tuple with the OtherIncomeExpense field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherIncomeExpense

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetOtherIncomeExpense(v float32)`

SetOtherIncomeExpense sets OtherIncomeExpense field to given value.

### HasOtherIncomeExpense

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasOtherIncomeExpense() bool`

HasOtherIncomeExpense returns a boolean if a field has been set.

### GetOtherIncomeMinorityInterest

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetOtherIncomeMinorityInterest() float32`

GetOtherIncomeMinorityInterest returns the OtherIncomeMinorityInterest field if non-nil, zero value otherwise.

### GetOtherIncomeMinorityInterestOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetOtherIncomeMinorityInterestOk() (*float32, bool)`

GetOtherIncomeMinorityInterestOk returns a tuple with the OtherIncomeMinorityInterest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherIncomeMinorityInterest

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetOtherIncomeMinorityInterest(v float32)`

SetOtherIncomeMinorityInterest sets OtherIncomeMinorityInterest field to given value.

### HasOtherIncomeMinorityInterest

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasOtherIncomeMinorityInterest() bool`

HasOtherIncomeMinorityInterest returns a boolean if a field has been set.

### GetOtherNetIncomeLoss

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetOtherNetIncomeLoss() float32`

GetOtherNetIncomeLoss returns the OtherNetIncomeLoss field if non-nil, zero value otherwise.

### GetOtherNetIncomeLossOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetOtherNetIncomeLossOk() (*float32, bool)`

GetOtherNetIncomeLossOk returns a tuple with the OtherNetIncomeLoss field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherNetIncomeLoss

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetOtherNetIncomeLoss(v float32)`

SetOtherNetIncomeLoss sets OtherNetIncomeLoss field to given value.

### HasOtherNetIncomeLoss

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasOtherNetIncomeLoss() bool`

HasOtherNetIncomeLoss returns a boolean if a field has been set.

### GetOtherOperatingCharges

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetOtherOperatingCharges() float32`

GetOtherOperatingCharges returns the OtherOperatingCharges field if non-nil, zero value otherwise.

### GetOtherOperatingChargesOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetOtherOperatingChargesOk() (*float32, bool)`

GetOtherOperatingChargesOk returns a tuple with the OtherOperatingCharges field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherOperatingCharges

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetOtherOperatingCharges(v float32)`

SetOtherOperatingCharges sets OtherOperatingCharges field to given value.

### HasOtherOperatingCharges

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasOtherOperatingCharges() bool`

HasOtherOperatingCharges returns a boolean if a field has been set.

### GetPretaxIncome

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetPretaxIncome() float32`

GetPretaxIncome returns the PretaxIncome field if non-nil, zero value otherwise.

### GetPretaxIncomeOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetPretaxIncomeOk() (*float32, bool)`

GetPretaxIncomeOk returns a tuple with the PretaxIncome field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPretaxIncome

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetPretaxIncome(v float32)`

SetPretaxIncome sets PretaxIncome field to given value.

### HasPretaxIncome

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasPretaxIncome() bool`

HasPretaxIncome returns a boolean if a field has been set.

### GetResearchDevelopment

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetResearchDevelopment() float32`

GetResearchDevelopment returns the ResearchDevelopment field if non-nil, zero value otherwise.

### GetResearchDevelopmentOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetResearchDevelopmentOk() (*float32, bool)`

GetResearchDevelopmentOk returns a tuple with the ResearchDevelopment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResearchDevelopment

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetResearchDevelopment(v float32)`

SetResearchDevelopment sets ResearchDevelopment field to given value.

### HasResearchDevelopment

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasResearchDevelopment() bool`

HasResearchDevelopment returns a boolean if a field has been set.

### GetRevenue

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetRevenue() float32`

GetRevenue returns the Revenue field if non-nil, zero value otherwise.

### GetRevenueOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetRevenueOk() (*float32, bool)`

GetRevenueOk returns a tuple with the Revenue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevenue

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetRevenue(v float32)`

SetRevenue sets Revenue field to given value.

### HasRevenue

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasRevenue() bool`

HasRevenue returns a boolean if a field has been set.

### GetSellingGeneralAdminExpense

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetSellingGeneralAdminExpense() float32`

GetSellingGeneralAdminExpense returns the SellingGeneralAdminExpense field if non-nil, zero value otherwise.

### GetSellingGeneralAdminExpenseOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetSellingGeneralAdminExpenseOk() (*float32, bool)`

GetSellingGeneralAdminExpenseOk returns a tuple with the SellingGeneralAdminExpense field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSellingGeneralAdminExpense

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetSellingGeneralAdminExpense(v float32)`

SetSellingGeneralAdminExpense sets SellingGeneralAdminExpense field to given value.

### HasSellingGeneralAdminExpense

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasSellingGeneralAdminExpense() bool`

HasSellingGeneralAdminExpense returns a boolean if a field has been set.

### GetSharesOutstanding

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetSharesOutstanding() float32`

GetSharesOutstanding returns the SharesOutstanding field if non-nil, zero value otherwise.

### GetSharesOutstandingOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetSharesOutstandingOk() (*float32, bool)`

GetSharesOutstandingOk returns a tuple with the SharesOutstanding field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSharesOutstanding

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetSharesOutstanding(v float32)`

SetSharesOutstanding sets SharesOutstanding field to given value.

### HasSharesOutstanding

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasSharesOutstanding() bool`

HasSharesOutstanding returns a boolean if a field has been set.

### GetTaxProvision

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetTaxProvision() float32`

GetTaxProvision returns the TaxProvision field if non-nil, zero value otherwise.

### GetTaxProvisionOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetTaxProvisionOk() (*float32, bool)`

GetTaxProvisionOk returns a tuple with the TaxProvision field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaxProvision

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetTaxProvision(v float32)`

SetTaxProvision sets TaxProvision field to given value.

### HasTaxProvision

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasTaxProvision() bool`

HasTaxProvision returns a boolean if a field has been set.

### GetTaxRate

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetTaxRate() float32`

GetTaxRate returns the TaxRate field if non-nil, zero value otherwise.

### GetTaxRateOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetTaxRateOk() (*float32, bool)`

GetTaxRateOk returns a tuple with the TaxRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaxRate

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetTaxRate(v float32)`

SetTaxRate sets TaxRate field to given value.

### HasTaxRate

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasTaxRate() bool`

HasTaxRate returns a boolean if a field has been set.

### GetTotalOperatingExpense

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetTotalOperatingExpense() float32`

GetTotalOperatingExpense returns the TotalOperatingExpense field if non-nil, zero value otherwise.

### GetTotalOperatingExpenseOk

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) GetTotalOperatingExpenseOk() (*float32, bool)`

GetTotalOperatingExpenseOk returns a tuple with the TotalOperatingExpense field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalOperatingExpense

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) SetTotalOperatingExpense(v float32)`

SetTotalOperatingExpense sets TotalOperatingExpense field to given value.

### HasTotalOperatingExpense

`func (o *FundamentalsNNOREITDIRECTIncomeStatement) HasTotalOperatingExpense() bool`

HasTotalOperatingExpense returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


