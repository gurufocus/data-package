# FundamentalsIREITNODIRECTIncomeStatement

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DepreciationDepletionAmortization** | Pointer to **float32** | &lt;p&gt;{{DDA}} is a present expense that accounts for the past cost of an asset that is now providing benefits. Depletion and amortization are synonyms for depreciation. Generally: The term depreciation is used when discussing man made tangible assets. The term depletion is used when discussing natural tangible assets. The term amortization is used when discussing intangible assets&lt;/p&gt; | [optional] 
**Ebit** | Pointer to **float32** | In accounting and finance, earnings before interest and taxes (EBIT), is a measure of a firm&#39;s profit that includes all expenses except interest and income tax expenses. It is the difference between operating revenues and operating expenses. | [optional] 
**Ebitda** | Pointer to **float32** | &lt;p&gt;Earnings Before Interest, Taxes, Depreciation, and Amortization ({{EBITDA}}) is what the company earns before it expenses interest, taxes, depreciation and amortization. &lt;br&gt;{{EBITDA}} is calculated as {{EBITDA}} &#x3D; {{Revenue}} - {{COGS}} - {{SGA}} - {{RD}} &#x3D; {{Gross_Profit}} - {{SGA}} - {{RD}} &lt;br&gt; The use of {{EBITDA}} is an attempt to make the results of different companies more comparable and uniform.&lt;/p&gt; | [optional] 
**EbitdaMargin** | Pointer to **float32** |  | [optional] 
**EpsBasic** | Pointer to **float32** | &lt;p&gt;{{eps_basic}} is a rough measurement of the amount of a company&#39;s profit that can be allocated to one share of its stock. {{eps_basic}} do not factor in the dilutive effects on convertible securities. &lt;br&gt;{{eps_basic}} is calculated as: {{eps_basic}} &#x3D; ({{Net_Income}} - {{IS_preferred_dividends}}) / {{shares_basic}}&lt;/p&gt; | [optional] 
**EpsDiluated** | Pointer to **float32** | &lt;p&gt;{{eps_diluated}} is a rough measurement of the amount of a company&#39;s profit that can be allocated to one share of its stock. {{eps_diluated}} takes into account all of the outstanding dilutive securities that could potentially be exercised (such as stock options and convertible {{Preferred_Stock}}) and shows how such an action would impact {{per_share_eps}}. &lt;br&gt;{{eps_diluated}} is calculated as: {{eps_diluated}} &#x3D; ({{Net_Income}} - {{IS_preferred_dividends}}) / {{Shares_Outstanding}}&lt;/p&gt; | [optional] 
**InterestIncome** | Pointer to **float32** | &lt;p&gt;{{InterestIncome}} is the interest earned on cash temporarily held in savings accounts, certificates of deposits, or other investments.&lt;/p&gt; | [optional] 
**IsFeeRevenueAndOtherIncome** | Pointer to **float32** | &lt;p&gt;{{IS_FeeRevenueAndOtherIncome}} is the income earned by insurance companies other than providing insurances. It includes investing income, fees and interest income.&lt;/p&gt; | [optional] 
**IsInterestExpense** | Pointer to **float32** |  | [optional] 
**IsNetInvestmentIncome** | Pointer to **float32** | &lt;p&gt;{{IS_NetInvestmentIncome}} is the income earned by insurance companies through investments. Insurance companies usually invest the float they received in stocks or bonds to generate additional income before the premium is paid to cover insurance losses.&lt;/p&gt; | [optional] 
**IsNetPolicyholderBenefitsAndClaims** | Pointer to **float32** | &lt;p&gt;{{IS_NetPolicyholderBenefitsAndClaims}} is the fund paid out by insurances companies to cover the insurance losses, liabilities and expenses&lt;/p&gt; | [optional] 
**IsOtherExpenseInsurance** | Pointer to **float32** |  | [optional] 
**IsPolicyAcquisitionExpense** | Pointer to **float32** | &lt;p&gt;{{IS_PolicyAcquisitionExpense}} is the expenses incurred by insurance companies in activities such as marketing, advertising, commissions etc.&lt;/p&gt; | [optional] 
**IsPreferredDividends** | Pointer to **float32** | &lt;p&gt;{{IS_preferred_dividends}} is a dividend that is accrued and paid on a company&#39;s preferred shares. In the event that a company is unable to pay all dividends, claims to {{IS_preferred_dividends}} take precedence over claims to dividends that are paid on common shares.&lt;/p&gt; | [optional] 
**IsTotalPremiumsEarned** | Pointer to **float32** | &lt;p&gt;{{IS_TotalPremiumsEarned}} is the portion of the premium that insurance companies earned by providing insurances for the time period that has already passed.&lt;/p&gt; | [optional] 
**NetIncome** | Pointer to **float32** | &lt;p&gt;{{Net_Income}} is the net profit that a company earns after deducting all costs and losses including {{COGS}}, {{SGA}}, {{DDA}}, {{InterestExpense}}, non-recurring items and {{tax}}.  &lt;br&gt;{{Net_Income}}  &#x3D; {{Revenue}} - {{COGS}}, - {{SGA}} - {{RD}}  - {{DDA}} - {{InterestExpense}} + Non-Recurring Items  - {{tax}} &#x3D; Earnings Before Depreciation and Amortization - {{DDA}} - {{InterestExpense}} - Non-Recurring Items (NRI) - {{tax}} &#x3D; {{Operating_Income}} - {{InterestExpense}} - Non-Recurring Items (NRI) - {{tax}} &#x3D; {{Pretax_Income}} - {{tax}}&lt;/p&gt; | [optional] 
**NetIncomeContinuingOperations** | Pointer to **float32** | &lt;p&gt;{{Net_Income_(Continuing_Operations)}} indicates the net income that a firm brings in from ongoing business activities. These activities are expected to continue into the next reporting period.&lt;/p&gt; | [optional] 
**NetIncomeDiscontinuedOperations** | Pointer to **float32** | &lt;p&gt;{{Net_Income_(Discontinued_Operations)}} indicates the net income that a firm brought in from operations that will not be used in future reporting periods.&lt;/p&gt; | [optional] 
**NetIncomeIncludingNoncontrollingInterests** | Pointer to **float32** |  | [optional] 
**NetMargin** | Pointer to **float32** | Net margin is calculated as Net Income divided by its Revenue. | [optional] 
**OtherIncomeMinorityInterest** | Pointer to **float32** | &lt;p&gt;{{OtherIncomeExpense}} includes {{Minority_interest}}. {{Minority_interest}} is a significant but non-controlling ownership of less than 50% of a company&#39;s voting shares by either an investor or another company.&lt;/p&gt; | [optional] 
**OtherNetIncomeLoss** | Pointer to **float32** |  | [optional] 
**PretaxIncome** | Pointer to **float32** | &lt;p&gt;{{Pretax_Income}} is the income that a company earns before paying income taxes. &lt;br&gt;{{Pretax_Income}} is calculated as {{Operating_Income}} + {{Non_Operating_Income}} + {{InterestExpense}} + {{InterestIncome}} + other&lt;/p&gt; | [optional] 
**Revenue** | Pointer to **float32** |  | [optional] 
**SellingGeneralAdminExpense** | Pointer to **float32** | Selling, General, &amp; Admin. Expense (SGA) includes the direct and indirect costs and all general and administrative expenses of a company. For instance, personnel cost, advertising, rent, communication costs are all part of SGA. | [optional] 
**SharesOutstanding** | Pointer to **float32** | &lt;p&gt;{{Cash_Flow_from_Others}} may include {{ChangeInWorkingCapital}}. These are cash differences caused by the {{ChangeInInventory}}, {{AccountsPayable}}, {{Accts_Rec}} etc. For instance, if a company pays its suppliers slower, its cash position will build up faster. If a company receives payments from its customers slower, its {{Accts_Rec}} will rise, and its cash position will grow more slowly (or even shrink).&lt;/p&gt; | [optional] 
**TaxProvision** | Pointer to **float32** | &lt;p&gt;{{TaxProvision}} is the tax to be paid.&lt;/p&gt; | [optional] 
**TaxRate** | Pointer to **float32** | &lt;p&gt;{{TaxRate}} is the ratio of {{tax}} divided by {{Pretax_Income}}, usually presented in percent. &lt;br&gt; {{{TaxRate}} &#x3D; {{tax}} / {{Pretax_Income}}&lt;/p&gt; | [optional] 
**TotalExpensesInsurance** | Pointer to **float32** |  | [optional] 

## Methods

### NewFundamentalsIREITNODIRECTIncomeStatement

`func NewFundamentalsIREITNODIRECTIncomeStatement() *FundamentalsIREITNODIRECTIncomeStatement`

NewFundamentalsIREITNODIRECTIncomeStatement instantiates a new FundamentalsIREITNODIRECTIncomeStatement object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFundamentalsIREITNODIRECTIncomeStatementWithDefaults

`func NewFundamentalsIREITNODIRECTIncomeStatementWithDefaults() *FundamentalsIREITNODIRECTIncomeStatement`

NewFundamentalsIREITNODIRECTIncomeStatementWithDefaults instantiates a new FundamentalsIREITNODIRECTIncomeStatement object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDepreciationDepletionAmortization

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetDepreciationDepletionAmortization() float32`

GetDepreciationDepletionAmortization returns the DepreciationDepletionAmortization field if non-nil, zero value otherwise.

### GetDepreciationDepletionAmortizationOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetDepreciationDepletionAmortizationOk() (*float32, bool)`

GetDepreciationDepletionAmortizationOk returns a tuple with the DepreciationDepletionAmortization field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDepreciationDepletionAmortization

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetDepreciationDepletionAmortization(v float32)`

SetDepreciationDepletionAmortization sets DepreciationDepletionAmortization field to given value.

### HasDepreciationDepletionAmortization

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasDepreciationDepletionAmortization() bool`

HasDepreciationDepletionAmortization returns a boolean if a field has been set.

### GetEbit

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetEbit() float32`

GetEbit returns the Ebit field if non-nil, zero value otherwise.

### GetEbitOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetEbitOk() (*float32, bool)`

GetEbitOk returns a tuple with the Ebit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEbit

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetEbit(v float32)`

SetEbit sets Ebit field to given value.

### HasEbit

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasEbit() bool`

HasEbit returns a boolean if a field has been set.

### GetEbitda

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetEbitda() float32`

GetEbitda returns the Ebitda field if non-nil, zero value otherwise.

### GetEbitdaOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetEbitdaOk() (*float32, bool)`

GetEbitdaOk returns a tuple with the Ebitda field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEbitda

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetEbitda(v float32)`

SetEbitda sets Ebitda field to given value.

### HasEbitda

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasEbitda() bool`

HasEbitda returns a boolean if a field has been set.

### GetEbitdaMargin

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetEbitdaMargin() float32`

GetEbitdaMargin returns the EbitdaMargin field if non-nil, zero value otherwise.

### GetEbitdaMarginOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetEbitdaMarginOk() (*float32, bool)`

GetEbitdaMarginOk returns a tuple with the EbitdaMargin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEbitdaMargin

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetEbitdaMargin(v float32)`

SetEbitdaMargin sets EbitdaMargin field to given value.

### HasEbitdaMargin

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasEbitdaMargin() bool`

HasEbitdaMargin returns a boolean if a field has been set.

### GetEpsBasic

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetEpsBasic() float32`

GetEpsBasic returns the EpsBasic field if non-nil, zero value otherwise.

### GetEpsBasicOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetEpsBasicOk() (*float32, bool)`

GetEpsBasicOk returns a tuple with the EpsBasic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEpsBasic

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetEpsBasic(v float32)`

SetEpsBasic sets EpsBasic field to given value.

### HasEpsBasic

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasEpsBasic() bool`

HasEpsBasic returns a boolean if a field has been set.

### GetEpsDiluated

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetEpsDiluated() float32`

GetEpsDiluated returns the EpsDiluated field if non-nil, zero value otherwise.

### GetEpsDiluatedOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetEpsDiluatedOk() (*float32, bool)`

GetEpsDiluatedOk returns a tuple with the EpsDiluated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEpsDiluated

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetEpsDiluated(v float32)`

SetEpsDiluated sets EpsDiluated field to given value.

### HasEpsDiluated

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasEpsDiluated() bool`

HasEpsDiluated returns a boolean if a field has been set.

### GetInterestIncome

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetInterestIncome() float32`

GetInterestIncome returns the InterestIncome field if non-nil, zero value otherwise.

### GetInterestIncomeOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetInterestIncomeOk() (*float32, bool)`

GetInterestIncomeOk returns a tuple with the InterestIncome field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInterestIncome

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetInterestIncome(v float32)`

SetInterestIncome sets InterestIncome field to given value.

### HasInterestIncome

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasInterestIncome() bool`

HasInterestIncome returns a boolean if a field has been set.

### GetIsFeeRevenueAndOtherIncome

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetIsFeeRevenueAndOtherIncome() float32`

GetIsFeeRevenueAndOtherIncome returns the IsFeeRevenueAndOtherIncome field if non-nil, zero value otherwise.

### GetIsFeeRevenueAndOtherIncomeOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetIsFeeRevenueAndOtherIncomeOk() (*float32, bool)`

GetIsFeeRevenueAndOtherIncomeOk returns a tuple with the IsFeeRevenueAndOtherIncome field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFeeRevenueAndOtherIncome

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetIsFeeRevenueAndOtherIncome(v float32)`

SetIsFeeRevenueAndOtherIncome sets IsFeeRevenueAndOtherIncome field to given value.

### HasIsFeeRevenueAndOtherIncome

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasIsFeeRevenueAndOtherIncome() bool`

HasIsFeeRevenueAndOtherIncome returns a boolean if a field has been set.

### GetIsInterestExpense

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetIsInterestExpense() float32`

GetIsInterestExpense returns the IsInterestExpense field if non-nil, zero value otherwise.

### GetIsInterestExpenseOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetIsInterestExpenseOk() (*float32, bool)`

GetIsInterestExpenseOk returns a tuple with the IsInterestExpense field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsInterestExpense

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetIsInterestExpense(v float32)`

SetIsInterestExpense sets IsInterestExpense field to given value.

### HasIsInterestExpense

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasIsInterestExpense() bool`

HasIsInterestExpense returns a boolean if a field has been set.

### GetIsNetInvestmentIncome

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetIsNetInvestmentIncome() float32`

GetIsNetInvestmentIncome returns the IsNetInvestmentIncome field if non-nil, zero value otherwise.

### GetIsNetInvestmentIncomeOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetIsNetInvestmentIncomeOk() (*float32, bool)`

GetIsNetInvestmentIncomeOk returns a tuple with the IsNetInvestmentIncome field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsNetInvestmentIncome

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetIsNetInvestmentIncome(v float32)`

SetIsNetInvestmentIncome sets IsNetInvestmentIncome field to given value.

### HasIsNetInvestmentIncome

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasIsNetInvestmentIncome() bool`

HasIsNetInvestmentIncome returns a boolean if a field has been set.

### GetIsNetPolicyholderBenefitsAndClaims

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetIsNetPolicyholderBenefitsAndClaims() float32`

GetIsNetPolicyholderBenefitsAndClaims returns the IsNetPolicyholderBenefitsAndClaims field if non-nil, zero value otherwise.

### GetIsNetPolicyholderBenefitsAndClaimsOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetIsNetPolicyholderBenefitsAndClaimsOk() (*float32, bool)`

GetIsNetPolicyholderBenefitsAndClaimsOk returns a tuple with the IsNetPolicyholderBenefitsAndClaims field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsNetPolicyholderBenefitsAndClaims

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetIsNetPolicyholderBenefitsAndClaims(v float32)`

SetIsNetPolicyholderBenefitsAndClaims sets IsNetPolicyholderBenefitsAndClaims field to given value.

### HasIsNetPolicyholderBenefitsAndClaims

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasIsNetPolicyholderBenefitsAndClaims() bool`

HasIsNetPolicyholderBenefitsAndClaims returns a boolean if a field has been set.

### GetIsOtherExpenseInsurance

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetIsOtherExpenseInsurance() float32`

GetIsOtherExpenseInsurance returns the IsOtherExpenseInsurance field if non-nil, zero value otherwise.

### GetIsOtherExpenseInsuranceOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetIsOtherExpenseInsuranceOk() (*float32, bool)`

GetIsOtherExpenseInsuranceOk returns a tuple with the IsOtherExpenseInsurance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOtherExpenseInsurance

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetIsOtherExpenseInsurance(v float32)`

SetIsOtherExpenseInsurance sets IsOtherExpenseInsurance field to given value.

### HasIsOtherExpenseInsurance

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasIsOtherExpenseInsurance() bool`

HasIsOtherExpenseInsurance returns a boolean if a field has been set.

### GetIsPolicyAcquisitionExpense

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetIsPolicyAcquisitionExpense() float32`

GetIsPolicyAcquisitionExpense returns the IsPolicyAcquisitionExpense field if non-nil, zero value otherwise.

### GetIsPolicyAcquisitionExpenseOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetIsPolicyAcquisitionExpenseOk() (*float32, bool)`

GetIsPolicyAcquisitionExpenseOk returns a tuple with the IsPolicyAcquisitionExpense field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPolicyAcquisitionExpense

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetIsPolicyAcquisitionExpense(v float32)`

SetIsPolicyAcquisitionExpense sets IsPolicyAcquisitionExpense field to given value.

### HasIsPolicyAcquisitionExpense

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasIsPolicyAcquisitionExpense() bool`

HasIsPolicyAcquisitionExpense returns a boolean if a field has been set.

### GetIsPreferredDividends

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetIsPreferredDividends() float32`

GetIsPreferredDividends returns the IsPreferredDividends field if non-nil, zero value otherwise.

### GetIsPreferredDividendsOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetIsPreferredDividendsOk() (*float32, bool)`

GetIsPreferredDividendsOk returns a tuple with the IsPreferredDividends field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPreferredDividends

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetIsPreferredDividends(v float32)`

SetIsPreferredDividends sets IsPreferredDividends field to given value.

### HasIsPreferredDividends

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasIsPreferredDividends() bool`

HasIsPreferredDividends returns a boolean if a field has been set.

### GetIsTotalPremiumsEarned

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetIsTotalPremiumsEarned() float32`

GetIsTotalPremiumsEarned returns the IsTotalPremiumsEarned field if non-nil, zero value otherwise.

### GetIsTotalPremiumsEarnedOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetIsTotalPremiumsEarnedOk() (*float32, bool)`

GetIsTotalPremiumsEarnedOk returns a tuple with the IsTotalPremiumsEarned field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsTotalPremiumsEarned

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetIsTotalPremiumsEarned(v float32)`

SetIsTotalPremiumsEarned sets IsTotalPremiumsEarned field to given value.

### HasIsTotalPremiumsEarned

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasIsTotalPremiumsEarned() bool`

HasIsTotalPremiumsEarned returns a boolean if a field has been set.

### GetNetIncome

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetNetIncome() float32`

GetNetIncome returns the NetIncome field if non-nil, zero value otherwise.

### GetNetIncomeOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetNetIncomeOk() (*float32, bool)`

GetNetIncomeOk returns a tuple with the NetIncome field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetIncome

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetNetIncome(v float32)`

SetNetIncome sets NetIncome field to given value.

### HasNetIncome

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasNetIncome() bool`

HasNetIncome returns a boolean if a field has been set.

### GetNetIncomeContinuingOperations

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetNetIncomeContinuingOperations() float32`

GetNetIncomeContinuingOperations returns the NetIncomeContinuingOperations field if non-nil, zero value otherwise.

### GetNetIncomeContinuingOperationsOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetNetIncomeContinuingOperationsOk() (*float32, bool)`

GetNetIncomeContinuingOperationsOk returns a tuple with the NetIncomeContinuingOperations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetIncomeContinuingOperations

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetNetIncomeContinuingOperations(v float32)`

SetNetIncomeContinuingOperations sets NetIncomeContinuingOperations field to given value.

### HasNetIncomeContinuingOperations

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasNetIncomeContinuingOperations() bool`

HasNetIncomeContinuingOperations returns a boolean if a field has been set.

### GetNetIncomeDiscontinuedOperations

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetNetIncomeDiscontinuedOperations() float32`

GetNetIncomeDiscontinuedOperations returns the NetIncomeDiscontinuedOperations field if non-nil, zero value otherwise.

### GetNetIncomeDiscontinuedOperationsOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetNetIncomeDiscontinuedOperationsOk() (*float32, bool)`

GetNetIncomeDiscontinuedOperationsOk returns a tuple with the NetIncomeDiscontinuedOperations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetIncomeDiscontinuedOperations

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetNetIncomeDiscontinuedOperations(v float32)`

SetNetIncomeDiscontinuedOperations sets NetIncomeDiscontinuedOperations field to given value.

### HasNetIncomeDiscontinuedOperations

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasNetIncomeDiscontinuedOperations() bool`

HasNetIncomeDiscontinuedOperations returns a boolean if a field has been set.

### GetNetIncomeIncludingNoncontrollingInterests

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetNetIncomeIncludingNoncontrollingInterests() float32`

GetNetIncomeIncludingNoncontrollingInterests returns the NetIncomeIncludingNoncontrollingInterests field if non-nil, zero value otherwise.

### GetNetIncomeIncludingNoncontrollingInterestsOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetNetIncomeIncludingNoncontrollingInterestsOk() (*float32, bool)`

GetNetIncomeIncludingNoncontrollingInterestsOk returns a tuple with the NetIncomeIncludingNoncontrollingInterests field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetIncomeIncludingNoncontrollingInterests

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetNetIncomeIncludingNoncontrollingInterests(v float32)`

SetNetIncomeIncludingNoncontrollingInterests sets NetIncomeIncludingNoncontrollingInterests field to given value.

### HasNetIncomeIncludingNoncontrollingInterests

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasNetIncomeIncludingNoncontrollingInterests() bool`

HasNetIncomeIncludingNoncontrollingInterests returns a boolean if a field has been set.

### GetNetMargin

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetNetMargin() float32`

GetNetMargin returns the NetMargin field if non-nil, zero value otherwise.

### GetNetMarginOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetNetMarginOk() (*float32, bool)`

GetNetMarginOk returns a tuple with the NetMargin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetMargin

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetNetMargin(v float32)`

SetNetMargin sets NetMargin field to given value.

### HasNetMargin

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasNetMargin() bool`

HasNetMargin returns a boolean if a field has been set.

### GetOtherIncomeMinorityInterest

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetOtherIncomeMinorityInterest() float32`

GetOtherIncomeMinorityInterest returns the OtherIncomeMinorityInterest field if non-nil, zero value otherwise.

### GetOtherIncomeMinorityInterestOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetOtherIncomeMinorityInterestOk() (*float32, bool)`

GetOtherIncomeMinorityInterestOk returns a tuple with the OtherIncomeMinorityInterest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherIncomeMinorityInterest

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetOtherIncomeMinorityInterest(v float32)`

SetOtherIncomeMinorityInterest sets OtherIncomeMinorityInterest field to given value.

### HasOtherIncomeMinorityInterest

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasOtherIncomeMinorityInterest() bool`

HasOtherIncomeMinorityInterest returns a boolean if a field has been set.

### GetOtherNetIncomeLoss

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetOtherNetIncomeLoss() float32`

GetOtherNetIncomeLoss returns the OtherNetIncomeLoss field if non-nil, zero value otherwise.

### GetOtherNetIncomeLossOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetOtherNetIncomeLossOk() (*float32, bool)`

GetOtherNetIncomeLossOk returns a tuple with the OtherNetIncomeLoss field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherNetIncomeLoss

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetOtherNetIncomeLoss(v float32)`

SetOtherNetIncomeLoss sets OtherNetIncomeLoss field to given value.

### HasOtherNetIncomeLoss

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasOtherNetIncomeLoss() bool`

HasOtherNetIncomeLoss returns a boolean if a field has been set.

### GetPretaxIncome

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetPretaxIncome() float32`

GetPretaxIncome returns the PretaxIncome field if non-nil, zero value otherwise.

### GetPretaxIncomeOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetPretaxIncomeOk() (*float32, bool)`

GetPretaxIncomeOk returns a tuple with the PretaxIncome field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPretaxIncome

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetPretaxIncome(v float32)`

SetPretaxIncome sets PretaxIncome field to given value.

### HasPretaxIncome

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasPretaxIncome() bool`

HasPretaxIncome returns a boolean if a field has been set.

### GetRevenue

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetRevenue() float32`

GetRevenue returns the Revenue field if non-nil, zero value otherwise.

### GetRevenueOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetRevenueOk() (*float32, bool)`

GetRevenueOk returns a tuple with the Revenue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevenue

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetRevenue(v float32)`

SetRevenue sets Revenue field to given value.

### HasRevenue

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasRevenue() bool`

HasRevenue returns a boolean if a field has been set.

### GetSellingGeneralAdminExpense

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetSellingGeneralAdminExpense() float32`

GetSellingGeneralAdminExpense returns the SellingGeneralAdminExpense field if non-nil, zero value otherwise.

### GetSellingGeneralAdminExpenseOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetSellingGeneralAdminExpenseOk() (*float32, bool)`

GetSellingGeneralAdminExpenseOk returns a tuple with the SellingGeneralAdminExpense field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSellingGeneralAdminExpense

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetSellingGeneralAdminExpense(v float32)`

SetSellingGeneralAdminExpense sets SellingGeneralAdminExpense field to given value.

### HasSellingGeneralAdminExpense

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasSellingGeneralAdminExpense() bool`

HasSellingGeneralAdminExpense returns a boolean if a field has been set.

### GetSharesOutstanding

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetSharesOutstanding() float32`

GetSharesOutstanding returns the SharesOutstanding field if non-nil, zero value otherwise.

### GetSharesOutstandingOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetSharesOutstandingOk() (*float32, bool)`

GetSharesOutstandingOk returns a tuple with the SharesOutstanding field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSharesOutstanding

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetSharesOutstanding(v float32)`

SetSharesOutstanding sets SharesOutstanding field to given value.

### HasSharesOutstanding

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasSharesOutstanding() bool`

HasSharesOutstanding returns a boolean if a field has been set.

### GetTaxProvision

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetTaxProvision() float32`

GetTaxProvision returns the TaxProvision field if non-nil, zero value otherwise.

### GetTaxProvisionOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetTaxProvisionOk() (*float32, bool)`

GetTaxProvisionOk returns a tuple with the TaxProvision field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaxProvision

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetTaxProvision(v float32)`

SetTaxProvision sets TaxProvision field to given value.

### HasTaxProvision

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasTaxProvision() bool`

HasTaxProvision returns a boolean if a field has been set.

### GetTaxRate

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetTaxRate() float32`

GetTaxRate returns the TaxRate field if non-nil, zero value otherwise.

### GetTaxRateOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetTaxRateOk() (*float32, bool)`

GetTaxRateOk returns a tuple with the TaxRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaxRate

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetTaxRate(v float32)`

SetTaxRate sets TaxRate field to given value.

### HasTaxRate

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasTaxRate() bool`

HasTaxRate returns a boolean if a field has been set.

### GetTotalExpensesInsurance

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetTotalExpensesInsurance() float32`

GetTotalExpensesInsurance returns the TotalExpensesInsurance field if non-nil, zero value otherwise.

### GetTotalExpensesInsuranceOk

`func (o *FundamentalsIREITNODIRECTIncomeStatement) GetTotalExpensesInsuranceOk() (*float32, bool)`

GetTotalExpensesInsuranceOk returns a tuple with the TotalExpensesInsurance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalExpensesInsurance

`func (o *FundamentalsIREITNODIRECTIncomeStatement) SetTotalExpensesInsurance(v float32)`

SetTotalExpensesInsurance sets TotalExpensesInsurance field to given value.

### HasTotalExpensesInsurance

`func (o *FundamentalsIREITNODIRECTIncomeStatement) HasTotalExpensesInsurance() bool`

HasTotalExpensesInsurance returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


