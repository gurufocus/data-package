# FundamentalsNREITDIRECTCashflowStatement

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BeginningCashPosition** | Pointer to **float32** |  | [optional] 
**CashFlowCapitalExpenditure** | Pointer to **float32** | &lt;p&gt;{{Cash_Flow_CPEX}} refers to the funds spent for a company to acquire or upgrade physical assets such as property, industrial buildings or equipment.&lt;/p&gt; | [optional] 
**CashFlowForLeaseFinancing** | Pointer to **float32** | https://www.gurufocus.com/glossary/cash_flow_for_lease_financing | [optional] 
**CashFlowFromInvesting** | Pointer to **float32** | &lt;p&gt;{{Cash_Flow_from_Investing}} covers the cash a company gains or spends from investment activities in financial market and operating subsidiaries. It also includes the cash the company used for {{Net_PPE}}(PPE). If a company spends cash on {{Net_PPE}} (PPE), this will reduce their cash position. This is called {{Cash_Flow_CPEX}} (CPEX). Likewise, if a company buys another company for cash, this will reduce their cash position. &lt;br&gt;{{Cash_Flow_from_Investing}} is calculated as {{Cash_Flow_from_Investing}} &#x3D; {{PurchaseOfPPE}} + {{SaleOfPPE}} + {{PurchaseOfBusiness}} + {{SaleOfBusiness}} + {{PurchaseOfInvestment}} + {{SaleOfInvestment}} + {{NetIntangiblesPurchaseAndSale}} + {{CashFromDiscontinuedInvestingActivities}} + {{CashFromOtherInvestingActivities}}&lt;/p&gt; | [optional] 
**CashFlowFromOperations** | Pointer to **float32** | &lt;p&gt;{{Cash_Flow_from_Operations}} refers to the cash brought in through a company&#39;s sales. &lt;br&gt;Therefore, {{Cash_Flow_from_Operations}} &#x3D; {{NetIncomeFromContinuingOperations}} + {{CF_DDA}} + {ChangeInWorkingCapital}} + Deferred Tax + {{Cash_Flow_from_Disc_Op}} + {{AssetImpairmentCharge}} + {{StockBasedCompensation}} + {{Cash_Flow_from_Others}}&lt;/p&gt; | [optional] 
**CashFlowFromOthers** | Pointer to **float32** | &lt;p&gt;{{Cash_Flow_from_Others}} may include {{ChangeInWorkingCapital}}. These are cash differences caused by the {{ChangeInInventory}}, {{AccountsPayable}}, {{Accts_Rec}} etc. For instance, if a company pays its suppliers slower, its cash position will build up faster. If a company receives payments from its customers slower, its {{Accts_Rec}} will rise, and its cash position will grow more slowly (or even shrink).&lt;/p&gt; | [optional] 
**CashFromDiscontinuedInvestingActivities** | Pointer to **float32** | &lt;p&gt;{{CashFromDiscontinuedInvestingActivities}} means the cash received by a company that comes from the discontinued investing activities.&lt;/p&gt; | [optional] 
**CashFromFinancing** | Pointer to **float32** | &lt;p&gt;{{Cash_from_Financing}} is the cash generated/spent from financial activities such as share issuance (buy back), debt issuance (repayment), and dividends paid to preferred and common stockholders. In the calculation of {{total_freecashflow}}, {{Cash_from_Financing}} is not calculated because it is not related to operating activities. &lt;br&gt;{{Cash_from_Financing}} &#x3D; {{Issuance_of_Stock}} + {{Repurchase_of_Stock}} + {{Net_Issuance_of_Debt}} + {{Net_Issuance_of_preferred}} + {{Dividends}} + Other Financing&lt;/p&gt; | [optional] 
**CashFromOtherInvestingActivities** | Pointer to **float32** | &lt;p&gt;{{CashFromOtherInvestingActivities}} means the cash received by a company that comes from other investing activities.&lt;/p&gt; | [optional] 
**CashPayments** | Pointer to **float32** |  | [optional] 
**CashReceiptsFromOperatingActivities** | Pointer to **float32** | &lt;p&gt;Cash flow from operations refers to the cash brought in through a company&#39;s normal business operations. It is the cash flow before any investment or financing activities. It is the cash version of {{Net_Income}}. &lt;br&gt;{{Cash_Flow_from_Operations}} &#x3D; {{Net_Income}} + {{DDA}} + {{Cash_Flow_from_Disc_Op}} + {{Cash_Flow_from_Others}}&lt;/p&gt; | [optional] 
**DebtIssuance** | Pointer to **float32** |  | [optional] 
**DebtPayments** | Pointer to **float32** |  | [optional] 
**Dividends** | Pointer to **float32** | &lt;p&gt;{{Dividends}} refers to the payment of cash to shareholders as dividends when the company generates income.&lt;/p&gt; | [optional] 
**DividendsPaidDirect** | Pointer to **float32** |  | [optional] 
**DividendsReceivedDirect** | Pointer to **float32** |  | [optional] 
**EffectOfExchangeRateChanges** | Pointer to **float32** |  | [optional] 
**EndingCashPosition** | Pointer to **float32** |  | [optional] 
**Ffo** | Pointer to **float32** | &lt;p&gt;{{FFO}} (Funds from operations) refers to the figure used by real estate investment trusts (REITs) to define the cash flow from their operations. It is calculated by adding depreciation and amortization to earnings, subtracting any gains on sales.&lt;/p&gt; | [optional] 
**InterestPaidDirect** | Pointer to **float32** |  | [optional] 
**InterestReceivedDirect** | Pointer to **float32** |  | [optional] 
**IssuanceOfStock** | Pointer to **float32** | &lt;p&gt;A company may raise cash from issuing new shares. It can also use cash to buy back shares. If this number is positive, it means that the company has received more cash from issuing shares than it has paid to buy back shares. If this number is negative, it means that company has paid more cash to buy back shares than it has received for issuing shares.&lt;/p&gt; | [optional] 
**NetChangeInCash** | Pointer to **float32** | &lt;p&gt;{{Net_Change_in_Cash}} is calculated as {{Net_Change_in_Cash}} &#x3D; {{Cash_Flow_from_Operations}} + {{Cash_Flow_from_Investing}} + {{Cash_from_Financing}} + {{effect_of_exchange_rate_changes}}&lt;/p&gt; | [optional] 
**NetIntangiblesPurchaseAndSale** | Pointer to **float32** | &lt;p&gt;{{NetIntangiblesPurchaseAndSale}} means the net cash inflow received by a company that comes from the purchase and sale of intangibles. It equals the cash received from sale of intangibles minus the cash spent on purchasing intangibles.&lt;/p&gt; | [optional] 
**NetIssuanceOfDebt** | Pointer to **float32** | &lt;p&gt;{{Net_Issuance_of_Debt}} is the cash a company received or spent through debt related activities such as debt issuance or debt repayment. If a company pays down its debt during the period, this number will be negative. If a company issued more debt, it receives cash and this number is positive.&lt;/p&gt; | [optional] 
**NetIssuanceOfPreferred** | Pointer to **float32** | &lt;p&gt;A company may raise cash from issuing new preferred shares. It can also use cash to buy back preferred shares. If this number is positive, it means that the company has received more cash from issuing preferred shares than it has paid to buy back preferred shares. If this number is negative, it means that company has paid more cash to buy back preferred shares than it has received for issuing preferred shares.&lt;/p&gt; | [optional] 
**OtherCashPaymentsFromOperatingActivities** | Pointer to **float32** |  | [optional] 
**OtherCashReceiptsFromOperatingActivities** | Pointer to **float32** | &lt;p&gt;{{CashFromOtherInvestingActivities}} means the cash received by a company that comes from other investing activities.&lt;/p&gt; | [optional] 
**OtherFinancing** | Pointer to **float32** | &lt;p&gt;{{Other_Financing}} represents other {{Cash_from_Financing}} activity that not otherwise classified, which includes: Proceeds From Stock Option Exercised, Other Financing Charges.&lt;/p&gt; | [optional] 
**PaymentsOnBehalfOfEmployees** | Pointer to **float32** |  | [optional] 
**PaymentsToSuppliersForGoodsAndServices** | Pointer to **float32** | Cash flow statement direct method: the total cash payments to suppliers | [optional] 
**PurchaseOfBusiness** | Pointer to **float32** | &lt;p&gt;{{PurchaseOfBusiness}} is the amount used to purchase business.&lt;/p&gt; | [optional] 
**PurchaseOfInvestment** | Pointer to **float32** | &lt;p&gt;{{PurchaseOfInvestment}} represents cash outflow on the purchase of investments in securities.&lt;/p&gt; | [optional] 
**PurchaseOfPpe** | Pointer to **float32** | &lt;p&gt;{{PurchaseOfPPE}} is the amount used to purchase Property, Plant and Equipment.&lt;/p&gt; | [optional] 
**ReceiptsFromCustomers** | Pointer to **float32** | Cash flow statement direct method: cash collections from customers | [optional] 
**ReceiptsFromGovernmentGrants** | Pointer to **float32** |  | [optional] 
**RepurchaseOfStock** | Pointer to **float32** | &lt;p&gt;A company may raise cash from issuing new shares. It can also use cash to buy back shares. {{Repurchase_of_Stock}} represents the cash outflow to reacquire common stock during the period.&lt;/p&gt; | [optional] 
**SaleOfBusiness** | Pointer to **float32** | &lt;p&gt;{{SaleOfBusiness}} is the amount earned to sell business.&lt;/p&gt; | [optional] 
**SaleOfInvestment** | Pointer to **float32** | &lt;p&gt;{{SaleOfInvestment}} represents cash inflow on the sale of investments in securities.&lt;/p&gt; | [optional] 
**SaleOfPpe** | Pointer to **float32** | &lt;p&gt;{{SaleOfPPE}} is the amount earned to sell {{Net_PPE}}. &lt;/p&gt; | [optional] 
**TaxesRefundPaidDirect** | Pointer to **float32** |  | [optional] 
**TotalFreeCashFlow** | Pointer to **float32** | &lt;p&gt;{{total_freecashflow}} is considered one of the most important parameters to measure a company&#39;s earnings power by value investors because it is not subject to estimates of {{DDA}} (DDA). However, when we look at the {{total_freecashflow}}, we should look from a long term perspective, because any year&#39;s {{total_freecashflow}} can be drastically affected by the spending on {{Net_PPE}} (PPE) of the business in that year. Over the long term, {{total_freecashflow}} should give pretty good picture on the real earnings power of the company. &lt;br&gt;{{total_freecashflow}} is calculated as {{total_freecashflow}} &#x3D; {{cash_Flow_from_Operations}} + {{Cash_Flow_CPEX}}&lt;/p&gt; | [optional] 

## Methods

### NewFundamentalsNREITDIRECTCashflowStatement

`func NewFundamentalsNREITDIRECTCashflowStatement() *FundamentalsNREITDIRECTCashflowStatement`

NewFundamentalsNREITDIRECTCashflowStatement instantiates a new FundamentalsNREITDIRECTCashflowStatement object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFundamentalsNREITDIRECTCashflowStatementWithDefaults

`func NewFundamentalsNREITDIRECTCashflowStatementWithDefaults() *FundamentalsNREITDIRECTCashflowStatement`

NewFundamentalsNREITDIRECTCashflowStatementWithDefaults instantiates a new FundamentalsNREITDIRECTCashflowStatement object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBeginningCashPosition

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetBeginningCashPosition() float32`

GetBeginningCashPosition returns the BeginningCashPosition field if non-nil, zero value otherwise.

### GetBeginningCashPositionOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetBeginningCashPositionOk() (*float32, bool)`

GetBeginningCashPositionOk returns a tuple with the BeginningCashPosition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBeginningCashPosition

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetBeginningCashPosition(v float32)`

SetBeginningCashPosition sets BeginningCashPosition field to given value.

### HasBeginningCashPosition

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasBeginningCashPosition() bool`

HasBeginningCashPosition returns a boolean if a field has been set.

### GetCashFlowCapitalExpenditure

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetCashFlowCapitalExpenditure() float32`

GetCashFlowCapitalExpenditure returns the CashFlowCapitalExpenditure field if non-nil, zero value otherwise.

### GetCashFlowCapitalExpenditureOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetCashFlowCapitalExpenditureOk() (*float32, bool)`

GetCashFlowCapitalExpenditureOk returns a tuple with the CashFlowCapitalExpenditure field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashFlowCapitalExpenditure

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetCashFlowCapitalExpenditure(v float32)`

SetCashFlowCapitalExpenditure sets CashFlowCapitalExpenditure field to given value.

### HasCashFlowCapitalExpenditure

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasCashFlowCapitalExpenditure() bool`

HasCashFlowCapitalExpenditure returns a boolean if a field has been set.

### GetCashFlowForLeaseFinancing

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetCashFlowForLeaseFinancing() float32`

GetCashFlowForLeaseFinancing returns the CashFlowForLeaseFinancing field if non-nil, zero value otherwise.

### GetCashFlowForLeaseFinancingOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetCashFlowForLeaseFinancingOk() (*float32, bool)`

GetCashFlowForLeaseFinancingOk returns a tuple with the CashFlowForLeaseFinancing field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashFlowForLeaseFinancing

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetCashFlowForLeaseFinancing(v float32)`

SetCashFlowForLeaseFinancing sets CashFlowForLeaseFinancing field to given value.

### HasCashFlowForLeaseFinancing

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasCashFlowForLeaseFinancing() bool`

HasCashFlowForLeaseFinancing returns a boolean if a field has been set.

### GetCashFlowFromInvesting

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetCashFlowFromInvesting() float32`

GetCashFlowFromInvesting returns the CashFlowFromInvesting field if non-nil, zero value otherwise.

### GetCashFlowFromInvestingOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetCashFlowFromInvestingOk() (*float32, bool)`

GetCashFlowFromInvestingOk returns a tuple with the CashFlowFromInvesting field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashFlowFromInvesting

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetCashFlowFromInvesting(v float32)`

SetCashFlowFromInvesting sets CashFlowFromInvesting field to given value.

### HasCashFlowFromInvesting

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasCashFlowFromInvesting() bool`

HasCashFlowFromInvesting returns a boolean if a field has been set.

### GetCashFlowFromOperations

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetCashFlowFromOperations() float32`

GetCashFlowFromOperations returns the CashFlowFromOperations field if non-nil, zero value otherwise.

### GetCashFlowFromOperationsOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetCashFlowFromOperationsOk() (*float32, bool)`

GetCashFlowFromOperationsOk returns a tuple with the CashFlowFromOperations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashFlowFromOperations

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetCashFlowFromOperations(v float32)`

SetCashFlowFromOperations sets CashFlowFromOperations field to given value.

### HasCashFlowFromOperations

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasCashFlowFromOperations() bool`

HasCashFlowFromOperations returns a boolean if a field has been set.

### GetCashFlowFromOthers

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetCashFlowFromOthers() float32`

GetCashFlowFromOthers returns the CashFlowFromOthers field if non-nil, zero value otherwise.

### GetCashFlowFromOthersOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetCashFlowFromOthersOk() (*float32, bool)`

GetCashFlowFromOthersOk returns a tuple with the CashFlowFromOthers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashFlowFromOthers

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetCashFlowFromOthers(v float32)`

SetCashFlowFromOthers sets CashFlowFromOthers field to given value.

### HasCashFlowFromOthers

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasCashFlowFromOthers() bool`

HasCashFlowFromOthers returns a boolean if a field has been set.

### GetCashFromDiscontinuedInvestingActivities

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetCashFromDiscontinuedInvestingActivities() float32`

GetCashFromDiscontinuedInvestingActivities returns the CashFromDiscontinuedInvestingActivities field if non-nil, zero value otherwise.

### GetCashFromDiscontinuedInvestingActivitiesOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetCashFromDiscontinuedInvestingActivitiesOk() (*float32, bool)`

GetCashFromDiscontinuedInvestingActivitiesOk returns a tuple with the CashFromDiscontinuedInvestingActivities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashFromDiscontinuedInvestingActivities

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetCashFromDiscontinuedInvestingActivities(v float32)`

SetCashFromDiscontinuedInvestingActivities sets CashFromDiscontinuedInvestingActivities field to given value.

### HasCashFromDiscontinuedInvestingActivities

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasCashFromDiscontinuedInvestingActivities() bool`

HasCashFromDiscontinuedInvestingActivities returns a boolean if a field has been set.

### GetCashFromFinancing

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetCashFromFinancing() float32`

GetCashFromFinancing returns the CashFromFinancing field if non-nil, zero value otherwise.

### GetCashFromFinancingOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetCashFromFinancingOk() (*float32, bool)`

GetCashFromFinancingOk returns a tuple with the CashFromFinancing field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashFromFinancing

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetCashFromFinancing(v float32)`

SetCashFromFinancing sets CashFromFinancing field to given value.

### HasCashFromFinancing

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasCashFromFinancing() bool`

HasCashFromFinancing returns a boolean if a field has been set.

### GetCashFromOtherInvestingActivities

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetCashFromOtherInvestingActivities() float32`

GetCashFromOtherInvestingActivities returns the CashFromOtherInvestingActivities field if non-nil, zero value otherwise.

### GetCashFromOtherInvestingActivitiesOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetCashFromOtherInvestingActivitiesOk() (*float32, bool)`

GetCashFromOtherInvestingActivitiesOk returns a tuple with the CashFromOtherInvestingActivities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashFromOtherInvestingActivities

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetCashFromOtherInvestingActivities(v float32)`

SetCashFromOtherInvestingActivities sets CashFromOtherInvestingActivities field to given value.

### HasCashFromOtherInvestingActivities

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasCashFromOtherInvestingActivities() bool`

HasCashFromOtherInvestingActivities returns a boolean if a field has been set.

### GetCashPayments

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetCashPayments() float32`

GetCashPayments returns the CashPayments field if non-nil, zero value otherwise.

### GetCashPaymentsOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetCashPaymentsOk() (*float32, bool)`

GetCashPaymentsOk returns a tuple with the CashPayments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashPayments

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetCashPayments(v float32)`

SetCashPayments sets CashPayments field to given value.

### HasCashPayments

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasCashPayments() bool`

HasCashPayments returns a boolean if a field has been set.

### GetCashReceiptsFromOperatingActivities

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetCashReceiptsFromOperatingActivities() float32`

GetCashReceiptsFromOperatingActivities returns the CashReceiptsFromOperatingActivities field if non-nil, zero value otherwise.

### GetCashReceiptsFromOperatingActivitiesOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetCashReceiptsFromOperatingActivitiesOk() (*float32, bool)`

GetCashReceiptsFromOperatingActivitiesOk returns a tuple with the CashReceiptsFromOperatingActivities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashReceiptsFromOperatingActivities

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetCashReceiptsFromOperatingActivities(v float32)`

SetCashReceiptsFromOperatingActivities sets CashReceiptsFromOperatingActivities field to given value.

### HasCashReceiptsFromOperatingActivities

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasCashReceiptsFromOperatingActivities() bool`

HasCashReceiptsFromOperatingActivities returns a boolean if a field has been set.

### GetDebtIssuance

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetDebtIssuance() float32`

GetDebtIssuance returns the DebtIssuance field if non-nil, zero value otherwise.

### GetDebtIssuanceOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetDebtIssuanceOk() (*float32, bool)`

GetDebtIssuanceOk returns a tuple with the DebtIssuance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDebtIssuance

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetDebtIssuance(v float32)`

SetDebtIssuance sets DebtIssuance field to given value.

### HasDebtIssuance

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasDebtIssuance() bool`

HasDebtIssuance returns a boolean if a field has been set.

### GetDebtPayments

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetDebtPayments() float32`

GetDebtPayments returns the DebtPayments field if non-nil, zero value otherwise.

### GetDebtPaymentsOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetDebtPaymentsOk() (*float32, bool)`

GetDebtPaymentsOk returns a tuple with the DebtPayments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDebtPayments

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetDebtPayments(v float32)`

SetDebtPayments sets DebtPayments field to given value.

### HasDebtPayments

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasDebtPayments() bool`

HasDebtPayments returns a boolean if a field has been set.

### GetDividends

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetDividends() float32`

GetDividends returns the Dividends field if non-nil, zero value otherwise.

### GetDividendsOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetDividendsOk() (*float32, bool)`

GetDividendsOk returns a tuple with the Dividends field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDividends

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetDividends(v float32)`

SetDividends sets Dividends field to given value.

### HasDividends

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasDividends() bool`

HasDividends returns a boolean if a field has been set.

### GetDividendsPaidDirect

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetDividendsPaidDirect() float32`

GetDividendsPaidDirect returns the DividendsPaidDirect field if non-nil, zero value otherwise.

### GetDividendsPaidDirectOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetDividendsPaidDirectOk() (*float32, bool)`

GetDividendsPaidDirectOk returns a tuple with the DividendsPaidDirect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDividendsPaidDirect

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetDividendsPaidDirect(v float32)`

SetDividendsPaidDirect sets DividendsPaidDirect field to given value.

### HasDividendsPaidDirect

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasDividendsPaidDirect() bool`

HasDividendsPaidDirect returns a boolean if a field has been set.

### GetDividendsReceivedDirect

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetDividendsReceivedDirect() float32`

GetDividendsReceivedDirect returns the DividendsReceivedDirect field if non-nil, zero value otherwise.

### GetDividendsReceivedDirectOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetDividendsReceivedDirectOk() (*float32, bool)`

GetDividendsReceivedDirectOk returns a tuple with the DividendsReceivedDirect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDividendsReceivedDirect

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetDividendsReceivedDirect(v float32)`

SetDividendsReceivedDirect sets DividendsReceivedDirect field to given value.

### HasDividendsReceivedDirect

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasDividendsReceivedDirect() bool`

HasDividendsReceivedDirect returns a boolean if a field has been set.

### GetEffectOfExchangeRateChanges

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetEffectOfExchangeRateChanges() float32`

GetEffectOfExchangeRateChanges returns the EffectOfExchangeRateChanges field if non-nil, zero value otherwise.

### GetEffectOfExchangeRateChangesOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetEffectOfExchangeRateChangesOk() (*float32, bool)`

GetEffectOfExchangeRateChangesOk returns a tuple with the EffectOfExchangeRateChanges field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectOfExchangeRateChanges

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetEffectOfExchangeRateChanges(v float32)`

SetEffectOfExchangeRateChanges sets EffectOfExchangeRateChanges field to given value.

### HasEffectOfExchangeRateChanges

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasEffectOfExchangeRateChanges() bool`

HasEffectOfExchangeRateChanges returns a boolean if a field has been set.

### GetEndingCashPosition

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetEndingCashPosition() float32`

GetEndingCashPosition returns the EndingCashPosition field if non-nil, zero value otherwise.

### GetEndingCashPositionOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetEndingCashPositionOk() (*float32, bool)`

GetEndingCashPositionOk returns a tuple with the EndingCashPosition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndingCashPosition

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetEndingCashPosition(v float32)`

SetEndingCashPosition sets EndingCashPosition field to given value.

### HasEndingCashPosition

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasEndingCashPosition() bool`

HasEndingCashPosition returns a boolean if a field has been set.

### GetFfo

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetFfo() float32`

GetFfo returns the Ffo field if non-nil, zero value otherwise.

### GetFfoOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetFfoOk() (*float32, bool)`

GetFfoOk returns a tuple with the Ffo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFfo

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetFfo(v float32)`

SetFfo sets Ffo field to given value.

### HasFfo

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasFfo() bool`

HasFfo returns a boolean if a field has been set.

### GetInterestPaidDirect

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetInterestPaidDirect() float32`

GetInterestPaidDirect returns the InterestPaidDirect field if non-nil, zero value otherwise.

### GetInterestPaidDirectOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetInterestPaidDirectOk() (*float32, bool)`

GetInterestPaidDirectOk returns a tuple with the InterestPaidDirect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInterestPaidDirect

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetInterestPaidDirect(v float32)`

SetInterestPaidDirect sets InterestPaidDirect field to given value.

### HasInterestPaidDirect

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasInterestPaidDirect() bool`

HasInterestPaidDirect returns a boolean if a field has been set.

### GetInterestReceivedDirect

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetInterestReceivedDirect() float32`

GetInterestReceivedDirect returns the InterestReceivedDirect field if non-nil, zero value otherwise.

### GetInterestReceivedDirectOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetInterestReceivedDirectOk() (*float32, bool)`

GetInterestReceivedDirectOk returns a tuple with the InterestReceivedDirect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInterestReceivedDirect

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetInterestReceivedDirect(v float32)`

SetInterestReceivedDirect sets InterestReceivedDirect field to given value.

### HasInterestReceivedDirect

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasInterestReceivedDirect() bool`

HasInterestReceivedDirect returns a boolean if a field has been set.

### GetIssuanceOfStock

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetIssuanceOfStock() float32`

GetIssuanceOfStock returns the IssuanceOfStock field if non-nil, zero value otherwise.

### GetIssuanceOfStockOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetIssuanceOfStockOk() (*float32, bool)`

GetIssuanceOfStockOk returns a tuple with the IssuanceOfStock field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssuanceOfStock

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetIssuanceOfStock(v float32)`

SetIssuanceOfStock sets IssuanceOfStock field to given value.

### HasIssuanceOfStock

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasIssuanceOfStock() bool`

HasIssuanceOfStock returns a boolean if a field has been set.

### GetNetChangeInCash

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetNetChangeInCash() float32`

GetNetChangeInCash returns the NetChangeInCash field if non-nil, zero value otherwise.

### GetNetChangeInCashOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetNetChangeInCashOk() (*float32, bool)`

GetNetChangeInCashOk returns a tuple with the NetChangeInCash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetChangeInCash

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetNetChangeInCash(v float32)`

SetNetChangeInCash sets NetChangeInCash field to given value.

### HasNetChangeInCash

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasNetChangeInCash() bool`

HasNetChangeInCash returns a boolean if a field has been set.

### GetNetIntangiblesPurchaseAndSale

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetNetIntangiblesPurchaseAndSale() float32`

GetNetIntangiblesPurchaseAndSale returns the NetIntangiblesPurchaseAndSale field if non-nil, zero value otherwise.

### GetNetIntangiblesPurchaseAndSaleOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetNetIntangiblesPurchaseAndSaleOk() (*float32, bool)`

GetNetIntangiblesPurchaseAndSaleOk returns a tuple with the NetIntangiblesPurchaseAndSale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetIntangiblesPurchaseAndSale

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetNetIntangiblesPurchaseAndSale(v float32)`

SetNetIntangiblesPurchaseAndSale sets NetIntangiblesPurchaseAndSale field to given value.

### HasNetIntangiblesPurchaseAndSale

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasNetIntangiblesPurchaseAndSale() bool`

HasNetIntangiblesPurchaseAndSale returns a boolean if a field has been set.

### GetNetIssuanceOfDebt

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetNetIssuanceOfDebt() float32`

GetNetIssuanceOfDebt returns the NetIssuanceOfDebt field if non-nil, zero value otherwise.

### GetNetIssuanceOfDebtOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetNetIssuanceOfDebtOk() (*float32, bool)`

GetNetIssuanceOfDebtOk returns a tuple with the NetIssuanceOfDebt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetIssuanceOfDebt

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetNetIssuanceOfDebt(v float32)`

SetNetIssuanceOfDebt sets NetIssuanceOfDebt field to given value.

### HasNetIssuanceOfDebt

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasNetIssuanceOfDebt() bool`

HasNetIssuanceOfDebt returns a boolean if a field has been set.

### GetNetIssuanceOfPreferred

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetNetIssuanceOfPreferred() float32`

GetNetIssuanceOfPreferred returns the NetIssuanceOfPreferred field if non-nil, zero value otherwise.

### GetNetIssuanceOfPreferredOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetNetIssuanceOfPreferredOk() (*float32, bool)`

GetNetIssuanceOfPreferredOk returns a tuple with the NetIssuanceOfPreferred field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetIssuanceOfPreferred

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetNetIssuanceOfPreferred(v float32)`

SetNetIssuanceOfPreferred sets NetIssuanceOfPreferred field to given value.

### HasNetIssuanceOfPreferred

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasNetIssuanceOfPreferred() bool`

HasNetIssuanceOfPreferred returns a boolean if a field has been set.

### GetOtherCashPaymentsFromOperatingActivities

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetOtherCashPaymentsFromOperatingActivities() float32`

GetOtherCashPaymentsFromOperatingActivities returns the OtherCashPaymentsFromOperatingActivities field if non-nil, zero value otherwise.

### GetOtherCashPaymentsFromOperatingActivitiesOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetOtherCashPaymentsFromOperatingActivitiesOk() (*float32, bool)`

GetOtherCashPaymentsFromOperatingActivitiesOk returns a tuple with the OtherCashPaymentsFromOperatingActivities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherCashPaymentsFromOperatingActivities

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetOtherCashPaymentsFromOperatingActivities(v float32)`

SetOtherCashPaymentsFromOperatingActivities sets OtherCashPaymentsFromOperatingActivities field to given value.

### HasOtherCashPaymentsFromOperatingActivities

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasOtherCashPaymentsFromOperatingActivities() bool`

HasOtherCashPaymentsFromOperatingActivities returns a boolean if a field has been set.

### GetOtherCashReceiptsFromOperatingActivities

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetOtherCashReceiptsFromOperatingActivities() float32`

GetOtherCashReceiptsFromOperatingActivities returns the OtherCashReceiptsFromOperatingActivities field if non-nil, zero value otherwise.

### GetOtherCashReceiptsFromOperatingActivitiesOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetOtherCashReceiptsFromOperatingActivitiesOk() (*float32, bool)`

GetOtherCashReceiptsFromOperatingActivitiesOk returns a tuple with the OtherCashReceiptsFromOperatingActivities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherCashReceiptsFromOperatingActivities

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetOtherCashReceiptsFromOperatingActivities(v float32)`

SetOtherCashReceiptsFromOperatingActivities sets OtherCashReceiptsFromOperatingActivities field to given value.

### HasOtherCashReceiptsFromOperatingActivities

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasOtherCashReceiptsFromOperatingActivities() bool`

HasOtherCashReceiptsFromOperatingActivities returns a boolean if a field has been set.

### GetOtherFinancing

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetOtherFinancing() float32`

GetOtherFinancing returns the OtherFinancing field if non-nil, zero value otherwise.

### GetOtherFinancingOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetOtherFinancingOk() (*float32, bool)`

GetOtherFinancingOk returns a tuple with the OtherFinancing field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherFinancing

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetOtherFinancing(v float32)`

SetOtherFinancing sets OtherFinancing field to given value.

### HasOtherFinancing

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasOtherFinancing() bool`

HasOtherFinancing returns a boolean if a field has been set.

### GetPaymentsOnBehalfOfEmployees

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetPaymentsOnBehalfOfEmployees() float32`

GetPaymentsOnBehalfOfEmployees returns the PaymentsOnBehalfOfEmployees field if non-nil, zero value otherwise.

### GetPaymentsOnBehalfOfEmployeesOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetPaymentsOnBehalfOfEmployeesOk() (*float32, bool)`

GetPaymentsOnBehalfOfEmployeesOk returns a tuple with the PaymentsOnBehalfOfEmployees field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentsOnBehalfOfEmployees

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetPaymentsOnBehalfOfEmployees(v float32)`

SetPaymentsOnBehalfOfEmployees sets PaymentsOnBehalfOfEmployees field to given value.

### HasPaymentsOnBehalfOfEmployees

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasPaymentsOnBehalfOfEmployees() bool`

HasPaymentsOnBehalfOfEmployees returns a boolean if a field has been set.

### GetPaymentsToSuppliersForGoodsAndServices

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetPaymentsToSuppliersForGoodsAndServices() float32`

GetPaymentsToSuppliersForGoodsAndServices returns the PaymentsToSuppliersForGoodsAndServices field if non-nil, zero value otherwise.

### GetPaymentsToSuppliersForGoodsAndServicesOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetPaymentsToSuppliersForGoodsAndServicesOk() (*float32, bool)`

GetPaymentsToSuppliersForGoodsAndServicesOk returns a tuple with the PaymentsToSuppliersForGoodsAndServices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentsToSuppliersForGoodsAndServices

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetPaymentsToSuppliersForGoodsAndServices(v float32)`

SetPaymentsToSuppliersForGoodsAndServices sets PaymentsToSuppliersForGoodsAndServices field to given value.

### HasPaymentsToSuppliersForGoodsAndServices

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasPaymentsToSuppliersForGoodsAndServices() bool`

HasPaymentsToSuppliersForGoodsAndServices returns a boolean if a field has been set.

### GetPurchaseOfBusiness

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetPurchaseOfBusiness() float32`

GetPurchaseOfBusiness returns the PurchaseOfBusiness field if non-nil, zero value otherwise.

### GetPurchaseOfBusinessOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetPurchaseOfBusinessOk() (*float32, bool)`

GetPurchaseOfBusinessOk returns a tuple with the PurchaseOfBusiness field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurchaseOfBusiness

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetPurchaseOfBusiness(v float32)`

SetPurchaseOfBusiness sets PurchaseOfBusiness field to given value.

### HasPurchaseOfBusiness

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasPurchaseOfBusiness() bool`

HasPurchaseOfBusiness returns a boolean if a field has been set.

### GetPurchaseOfInvestment

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetPurchaseOfInvestment() float32`

GetPurchaseOfInvestment returns the PurchaseOfInvestment field if non-nil, zero value otherwise.

### GetPurchaseOfInvestmentOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetPurchaseOfInvestmentOk() (*float32, bool)`

GetPurchaseOfInvestmentOk returns a tuple with the PurchaseOfInvestment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurchaseOfInvestment

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetPurchaseOfInvestment(v float32)`

SetPurchaseOfInvestment sets PurchaseOfInvestment field to given value.

### HasPurchaseOfInvestment

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasPurchaseOfInvestment() bool`

HasPurchaseOfInvestment returns a boolean if a field has been set.

### GetPurchaseOfPpe

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetPurchaseOfPpe() float32`

GetPurchaseOfPpe returns the PurchaseOfPpe field if non-nil, zero value otherwise.

### GetPurchaseOfPpeOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetPurchaseOfPpeOk() (*float32, bool)`

GetPurchaseOfPpeOk returns a tuple with the PurchaseOfPpe field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurchaseOfPpe

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetPurchaseOfPpe(v float32)`

SetPurchaseOfPpe sets PurchaseOfPpe field to given value.

### HasPurchaseOfPpe

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasPurchaseOfPpe() bool`

HasPurchaseOfPpe returns a boolean if a field has been set.

### GetReceiptsFromCustomers

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetReceiptsFromCustomers() float32`

GetReceiptsFromCustomers returns the ReceiptsFromCustomers field if non-nil, zero value otherwise.

### GetReceiptsFromCustomersOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetReceiptsFromCustomersOk() (*float32, bool)`

GetReceiptsFromCustomersOk returns a tuple with the ReceiptsFromCustomers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReceiptsFromCustomers

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetReceiptsFromCustomers(v float32)`

SetReceiptsFromCustomers sets ReceiptsFromCustomers field to given value.

### HasReceiptsFromCustomers

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasReceiptsFromCustomers() bool`

HasReceiptsFromCustomers returns a boolean if a field has been set.

### GetReceiptsFromGovernmentGrants

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetReceiptsFromGovernmentGrants() float32`

GetReceiptsFromGovernmentGrants returns the ReceiptsFromGovernmentGrants field if non-nil, zero value otherwise.

### GetReceiptsFromGovernmentGrantsOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetReceiptsFromGovernmentGrantsOk() (*float32, bool)`

GetReceiptsFromGovernmentGrantsOk returns a tuple with the ReceiptsFromGovernmentGrants field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReceiptsFromGovernmentGrants

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetReceiptsFromGovernmentGrants(v float32)`

SetReceiptsFromGovernmentGrants sets ReceiptsFromGovernmentGrants field to given value.

### HasReceiptsFromGovernmentGrants

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasReceiptsFromGovernmentGrants() bool`

HasReceiptsFromGovernmentGrants returns a boolean if a field has been set.

### GetRepurchaseOfStock

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetRepurchaseOfStock() float32`

GetRepurchaseOfStock returns the RepurchaseOfStock field if non-nil, zero value otherwise.

### GetRepurchaseOfStockOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetRepurchaseOfStockOk() (*float32, bool)`

GetRepurchaseOfStockOk returns a tuple with the RepurchaseOfStock field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRepurchaseOfStock

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetRepurchaseOfStock(v float32)`

SetRepurchaseOfStock sets RepurchaseOfStock field to given value.

### HasRepurchaseOfStock

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasRepurchaseOfStock() bool`

HasRepurchaseOfStock returns a boolean if a field has been set.

### GetSaleOfBusiness

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetSaleOfBusiness() float32`

GetSaleOfBusiness returns the SaleOfBusiness field if non-nil, zero value otherwise.

### GetSaleOfBusinessOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetSaleOfBusinessOk() (*float32, bool)`

GetSaleOfBusinessOk returns a tuple with the SaleOfBusiness field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSaleOfBusiness

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetSaleOfBusiness(v float32)`

SetSaleOfBusiness sets SaleOfBusiness field to given value.

### HasSaleOfBusiness

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasSaleOfBusiness() bool`

HasSaleOfBusiness returns a boolean if a field has been set.

### GetSaleOfInvestment

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetSaleOfInvestment() float32`

GetSaleOfInvestment returns the SaleOfInvestment field if non-nil, zero value otherwise.

### GetSaleOfInvestmentOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetSaleOfInvestmentOk() (*float32, bool)`

GetSaleOfInvestmentOk returns a tuple with the SaleOfInvestment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSaleOfInvestment

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetSaleOfInvestment(v float32)`

SetSaleOfInvestment sets SaleOfInvestment field to given value.

### HasSaleOfInvestment

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasSaleOfInvestment() bool`

HasSaleOfInvestment returns a boolean if a field has been set.

### GetSaleOfPpe

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetSaleOfPpe() float32`

GetSaleOfPpe returns the SaleOfPpe field if non-nil, zero value otherwise.

### GetSaleOfPpeOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetSaleOfPpeOk() (*float32, bool)`

GetSaleOfPpeOk returns a tuple with the SaleOfPpe field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSaleOfPpe

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetSaleOfPpe(v float32)`

SetSaleOfPpe sets SaleOfPpe field to given value.

### HasSaleOfPpe

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasSaleOfPpe() bool`

HasSaleOfPpe returns a boolean if a field has been set.

### GetTaxesRefundPaidDirect

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetTaxesRefundPaidDirect() float32`

GetTaxesRefundPaidDirect returns the TaxesRefundPaidDirect field if non-nil, zero value otherwise.

### GetTaxesRefundPaidDirectOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetTaxesRefundPaidDirectOk() (*float32, bool)`

GetTaxesRefundPaidDirectOk returns a tuple with the TaxesRefundPaidDirect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaxesRefundPaidDirect

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetTaxesRefundPaidDirect(v float32)`

SetTaxesRefundPaidDirect sets TaxesRefundPaidDirect field to given value.

### HasTaxesRefundPaidDirect

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasTaxesRefundPaidDirect() bool`

HasTaxesRefundPaidDirect returns a boolean if a field has been set.

### GetTotalFreeCashFlow

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetTotalFreeCashFlow() float32`

GetTotalFreeCashFlow returns the TotalFreeCashFlow field if non-nil, zero value otherwise.

### GetTotalFreeCashFlowOk

`func (o *FundamentalsNREITDIRECTCashflowStatement) GetTotalFreeCashFlowOk() (*float32, bool)`

GetTotalFreeCashFlowOk returns a tuple with the TotalFreeCashFlow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalFreeCashFlow

`func (o *FundamentalsNREITDIRECTCashflowStatement) SetTotalFreeCashFlow(v float32)`

SetTotalFreeCashFlow sets TotalFreeCashFlow field to given value.

### HasTotalFreeCashFlow

`func (o *FundamentalsNREITDIRECTCashflowStatement) HasTotalFreeCashFlow() bool`

HasTotalFreeCashFlow returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


