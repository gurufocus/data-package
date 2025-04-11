# FundamentalsNNOREITDIRECTCashflowStatement

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

### NewFundamentalsNNOREITDIRECTCashflowStatement

`func NewFundamentalsNNOREITDIRECTCashflowStatement() *FundamentalsNNOREITDIRECTCashflowStatement`

NewFundamentalsNNOREITDIRECTCashflowStatement instantiates a new FundamentalsNNOREITDIRECTCashflowStatement object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFundamentalsNNOREITDIRECTCashflowStatementWithDefaults

`func NewFundamentalsNNOREITDIRECTCashflowStatementWithDefaults() *FundamentalsNNOREITDIRECTCashflowStatement`

NewFundamentalsNNOREITDIRECTCashflowStatementWithDefaults instantiates a new FundamentalsNNOREITDIRECTCashflowStatement object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBeginningCashPosition

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetBeginningCashPosition() float32`

GetBeginningCashPosition returns the BeginningCashPosition field if non-nil, zero value otherwise.

### GetBeginningCashPositionOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetBeginningCashPositionOk() (*float32, bool)`

GetBeginningCashPositionOk returns a tuple with the BeginningCashPosition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBeginningCashPosition

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetBeginningCashPosition(v float32)`

SetBeginningCashPosition sets BeginningCashPosition field to given value.

### HasBeginningCashPosition

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasBeginningCashPosition() bool`

HasBeginningCashPosition returns a boolean if a field has been set.

### GetCashFlowCapitalExpenditure

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetCashFlowCapitalExpenditure() float32`

GetCashFlowCapitalExpenditure returns the CashFlowCapitalExpenditure field if non-nil, zero value otherwise.

### GetCashFlowCapitalExpenditureOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetCashFlowCapitalExpenditureOk() (*float32, bool)`

GetCashFlowCapitalExpenditureOk returns a tuple with the CashFlowCapitalExpenditure field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashFlowCapitalExpenditure

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetCashFlowCapitalExpenditure(v float32)`

SetCashFlowCapitalExpenditure sets CashFlowCapitalExpenditure field to given value.

### HasCashFlowCapitalExpenditure

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasCashFlowCapitalExpenditure() bool`

HasCashFlowCapitalExpenditure returns a boolean if a field has been set.

### GetCashFlowForLeaseFinancing

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetCashFlowForLeaseFinancing() float32`

GetCashFlowForLeaseFinancing returns the CashFlowForLeaseFinancing field if non-nil, zero value otherwise.

### GetCashFlowForLeaseFinancingOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetCashFlowForLeaseFinancingOk() (*float32, bool)`

GetCashFlowForLeaseFinancingOk returns a tuple with the CashFlowForLeaseFinancing field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashFlowForLeaseFinancing

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetCashFlowForLeaseFinancing(v float32)`

SetCashFlowForLeaseFinancing sets CashFlowForLeaseFinancing field to given value.

### HasCashFlowForLeaseFinancing

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasCashFlowForLeaseFinancing() bool`

HasCashFlowForLeaseFinancing returns a boolean if a field has been set.

### GetCashFlowFromInvesting

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetCashFlowFromInvesting() float32`

GetCashFlowFromInvesting returns the CashFlowFromInvesting field if non-nil, zero value otherwise.

### GetCashFlowFromInvestingOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetCashFlowFromInvestingOk() (*float32, bool)`

GetCashFlowFromInvestingOk returns a tuple with the CashFlowFromInvesting field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashFlowFromInvesting

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetCashFlowFromInvesting(v float32)`

SetCashFlowFromInvesting sets CashFlowFromInvesting field to given value.

### HasCashFlowFromInvesting

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasCashFlowFromInvesting() bool`

HasCashFlowFromInvesting returns a boolean if a field has been set.

### GetCashFlowFromOperations

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetCashFlowFromOperations() float32`

GetCashFlowFromOperations returns the CashFlowFromOperations field if non-nil, zero value otherwise.

### GetCashFlowFromOperationsOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetCashFlowFromOperationsOk() (*float32, bool)`

GetCashFlowFromOperationsOk returns a tuple with the CashFlowFromOperations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashFlowFromOperations

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetCashFlowFromOperations(v float32)`

SetCashFlowFromOperations sets CashFlowFromOperations field to given value.

### HasCashFlowFromOperations

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasCashFlowFromOperations() bool`

HasCashFlowFromOperations returns a boolean if a field has been set.

### GetCashFlowFromOthers

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetCashFlowFromOthers() float32`

GetCashFlowFromOthers returns the CashFlowFromOthers field if non-nil, zero value otherwise.

### GetCashFlowFromOthersOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetCashFlowFromOthersOk() (*float32, bool)`

GetCashFlowFromOthersOk returns a tuple with the CashFlowFromOthers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashFlowFromOthers

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetCashFlowFromOthers(v float32)`

SetCashFlowFromOthers sets CashFlowFromOthers field to given value.

### HasCashFlowFromOthers

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasCashFlowFromOthers() bool`

HasCashFlowFromOthers returns a boolean if a field has been set.

### GetCashFromDiscontinuedInvestingActivities

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetCashFromDiscontinuedInvestingActivities() float32`

GetCashFromDiscontinuedInvestingActivities returns the CashFromDiscontinuedInvestingActivities field if non-nil, zero value otherwise.

### GetCashFromDiscontinuedInvestingActivitiesOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetCashFromDiscontinuedInvestingActivitiesOk() (*float32, bool)`

GetCashFromDiscontinuedInvestingActivitiesOk returns a tuple with the CashFromDiscontinuedInvestingActivities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashFromDiscontinuedInvestingActivities

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetCashFromDiscontinuedInvestingActivities(v float32)`

SetCashFromDiscontinuedInvestingActivities sets CashFromDiscontinuedInvestingActivities field to given value.

### HasCashFromDiscontinuedInvestingActivities

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasCashFromDiscontinuedInvestingActivities() bool`

HasCashFromDiscontinuedInvestingActivities returns a boolean if a field has been set.

### GetCashFromFinancing

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetCashFromFinancing() float32`

GetCashFromFinancing returns the CashFromFinancing field if non-nil, zero value otherwise.

### GetCashFromFinancingOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetCashFromFinancingOk() (*float32, bool)`

GetCashFromFinancingOk returns a tuple with the CashFromFinancing field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashFromFinancing

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetCashFromFinancing(v float32)`

SetCashFromFinancing sets CashFromFinancing field to given value.

### HasCashFromFinancing

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasCashFromFinancing() bool`

HasCashFromFinancing returns a boolean if a field has been set.

### GetCashFromOtherInvestingActivities

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetCashFromOtherInvestingActivities() float32`

GetCashFromOtherInvestingActivities returns the CashFromOtherInvestingActivities field if non-nil, zero value otherwise.

### GetCashFromOtherInvestingActivitiesOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetCashFromOtherInvestingActivitiesOk() (*float32, bool)`

GetCashFromOtherInvestingActivitiesOk returns a tuple with the CashFromOtherInvestingActivities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashFromOtherInvestingActivities

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetCashFromOtherInvestingActivities(v float32)`

SetCashFromOtherInvestingActivities sets CashFromOtherInvestingActivities field to given value.

### HasCashFromOtherInvestingActivities

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasCashFromOtherInvestingActivities() bool`

HasCashFromOtherInvestingActivities returns a boolean if a field has been set.

### GetCashPayments

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetCashPayments() float32`

GetCashPayments returns the CashPayments field if non-nil, zero value otherwise.

### GetCashPaymentsOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetCashPaymentsOk() (*float32, bool)`

GetCashPaymentsOk returns a tuple with the CashPayments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashPayments

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetCashPayments(v float32)`

SetCashPayments sets CashPayments field to given value.

### HasCashPayments

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasCashPayments() bool`

HasCashPayments returns a boolean if a field has been set.

### GetCashReceiptsFromOperatingActivities

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetCashReceiptsFromOperatingActivities() float32`

GetCashReceiptsFromOperatingActivities returns the CashReceiptsFromOperatingActivities field if non-nil, zero value otherwise.

### GetCashReceiptsFromOperatingActivitiesOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetCashReceiptsFromOperatingActivitiesOk() (*float32, bool)`

GetCashReceiptsFromOperatingActivitiesOk returns a tuple with the CashReceiptsFromOperatingActivities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashReceiptsFromOperatingActivities

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetCashReceiptsFromOperatingActivities(v float32)`

SetCashReceiptsFromOperatingActivities sets CashReceiptsFromOperatingActivities field to given value.

### HasCashReceiptsFromOperatingActivities

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasCashReceiptsFromOperatingActivities() bool`

HasCashReceiptsFromOperatingActivities returns a boolean if a field has been set.

### GetDebtIssuance

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetDebtIssuance() float32`

GetDebtIssuance returns the DebtIssuance field if non-nil, zero value otherwise.

### GetDebtIssuanceOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetDebtIssuanceOk() (*float32, bool)`

GetDebtIssuanceOk returns a tuple with the DebtIssuance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDebtIssuance

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetDebtIssuance(v float32)`

SetDebtIssuance sets DebtIssuance field to given value.

### HasDebtIssuance

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasDebtIssuance() bool`

HasDebtIssuance returns a boolean if a field has been set.

### GetDebtPayments

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetDebtPayments() float32`

GetDebtPayments returns the DebtPayments field if non-nil, zero value otherwise.

### GetDebtPaymentsOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetDebtPaymentsOk() (*float32, bool)`

GetDebtPaymentsOk returns a tuple with the DebtPayments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDebtPayments

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetDebtPayments(v float32)`

SetDebtPayments sets DebtPayments field to given value.

### HasDebtPayments

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasDebtPayments() bool`

HasDebtPayments returns a boolean if a field has been set.

### GetDividends

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetDividends() float32`

GetDividends returns the Dividends field if non-nil, zero value otherwise.

### GetDividendsOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetDividendsOk() (*float32, bool)`

GetDividendsOk returns a tuple with the Dividends field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDividends

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetDividends(v float32)`

SetDividends sets Dividends field to given value.

### HasDividends

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasDividends() bool`

HasDividends returns a boolean if a field has been set.

### GetDividendsPaidDirect

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetDividendsPaidDirect() float32`

GetDividendsPaidDirect returns the DividendsPaidDirect field if non-nil, zero value otherwise.

### GetDividendsPaidDirectOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetDividendsPaidDirectOk() (*float32, bool)`

GetDividendsPaidDirectOk returns a tuple with the DividendsPaidDirect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDividendsPaidDirect

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetDividendsPaidDirect(v float32)`

SetDividendsPaidDirect sets DividendsPaidDirect field to given value.

### HasDividendsPaidDirect

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasDividendsPaidDirect() bool`

HasDividendsPaidDirect returns a boolean if a field has been set.

### GetDividendsReceivedDirect

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetDividendsReceivedDirect() float32`

GetDividendsReceivedDirect returns the DividendsReceivedDirect field if non-nil, zero value otherwise.

### GetDividendsReceivedDirectOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetDividendsReceivedDirectOk() (*float32, bool)`

GetDividendsReceivedDirectOk returns a tuple with the DividendsReceivedDirect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDividendsReceivedDirect

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetDividendsReceivedDirect(v float32)`

SetDividendsReceivedDirect sets DividendsReceivedDirect field to given value.

### HasDividendsReceivedDirect

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasDividendsReceivedDirect() bool`

HasDividendsReceivedDirect returns a boolean if a field has been set.

### GetEffectOfExchangeRateChanges

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetEffectOfExchangeRateChanges() float32`

GetEffectOfExchangeRateChanges returns the EffectOfExchangeRateChanges field if non-nil, zero value otherwise.

### GetEffectOfExchangeRateChangesOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetEffectOfExchangeRateChangesOk() (*float32, bool)`

GetEffectOfExchangeRateChangesOk returns a tuple with the EffectOfExchangeRateChanges field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectOfExchangeRateChanges

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetEffectOfExchangeRateChanges(v float32)`

SetEffectOfExchangeRateChanges sets EffectOfExchangeRateChanges field to given value.

### HasEffectOfExchangeRateChanges

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasEffectOfExchangeRateChanges() bool`

HasEffectOfExchangeRateChanges returns a boolean if a field has been set.

### GetEndingCashPosition

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetEndingCashPosition() float32`

GetEndingCashPosition returns the EndingCashPosition field if non-nil, zero value otherwise.

### GetEndingCashPositionOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetEndingCashPositionOk() (*float32, bool)`

GetEndingCashPositionOk returns a tuple with the EndingCashPosition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndingCashPosition

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetEndingCashPosition(v float32)`

SetEndingCashPosition sets EndingCashPosition field to given value.

### HasEndingCashPosition

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasEndingCashPosition() bool`

HasEndingCashPosition returns a boolean if a field has been set.

### GetInterestPaidDirect

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetInterestPaidDirect() float32`

GetInterestPaidDirect returns the InterestPaidDirect field if non-nil, zero value otherwise.

### GetInterestPaidDirectOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetInterestPaidDirectOk() (*float32, bool)`

GetInterestPaidDirectOk returns a tuple with the InterestPaidDirect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInterestPaidDirect

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetInterestPaidDirect(v float32)`

SetInterestPaidDirect sets InterestPaidDirect field to given value.

### HasInterestPaidDirect

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasInterestPaidDirect() bool`

HasInterestPaidDirect returns a boolean if a field has been set.

### GetInterestReceivedDirect

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetInterestReceivedDirect() float32`

GetInterestReceivedDirect returns the InterestReceivedDirect field if non-nil, zero value otherwise.

### GetInterestReceivedDirectOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetInterestReceivedDirectOk() (*float32, bool)`

GetInterestReceivedDirectOk returns a tuple with the InterestReceivedDirect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInterestReceivedDirect

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetInterestReceivedDirect(v float32)`

SetInterestReceivedDirect sets InterestReceivedDirect field to given value.

### HasInterestReceivedDirect

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasInterestReceivedDirect() bool`

HasInterestReceivedDirect returns a boolean if a field has been set.

### GetIssuanceOfStock

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetIssuanceOfStock() float32`

GetIssuanceOfStock returns the IssuanceOfStock field if non-nil, zero value otherwise.

### GetIssuanceOfStockOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetIssuanceOfStockOk() (*float32, bool)`

GetIssuanceOfStockOk returns a tuple with the IssuanceOfStock field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssuanceOfStock

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetIssuanceOfStock(v float32)`

SetIssuanceOfStock sets IssuanceOfStock field to given value.

### HasIssuanceOfStock

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasIssuanceOfStock() bool`

HasIssuanceOfStock returns a boolean if a field has been set.

### GetNetChangeInCash

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetNetChangeInCash() float32`

GetNetChangeInCash returns the NetChangeInCash field if non-nil, zero value otherwise.

### GetNetChangeInCashOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetNetChangeInCashOk() (*float32, bool)`

GetNetChangeInCashOk returns a tuple with the NetChangeInCash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetChangeInCash

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetNetChangeInCash(v float32)`

SetNetChangeInCash sets NetChangeInCash field to given value.

### HasNetChangeInCash

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasNetChangeInCash() bool`

HasNetChangeInCash returns a boolean if a field has been set.

### GetNetIntangiblesPurchaseAndSale

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetNetIntangiblesPurchaseAndSale() float32`

GetNetIntangiblesPurchaseAndSale returns the NetIntangiblesPurchaseAndSale field if non-nil, zero value otherwise.

### GetNetIntangiblesPurchaseAndSaleOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetNetIntangiblesPurchaseAndSaleOk() (*float32, bool)`

GetNetIntangiblesPurchaseAndSaleOk returns a tuple with the NetIntangiblesPurchaseAndSale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetIntangiblesPurchaseAndSale

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetNetIntangiblesPurchaseAndSale(v float32)`

SetNetIntangiblesPurchaseAndSale sets NetIntangiblesPurchaseAndSale field to given value.

### HasNetIntangiblesPurchaseAndSale

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasNetIntangiblesPurchaseAndSale() bool`

HasNetIntangiblesPurchaseAndSale returns a boolean if a field has been set.

### GetNetIssuanceOfDebt

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetNetIssuanceOfDebt() float32`

GetNetIssuanceOfDebt returns the NetIssuanceOfDebt field if non-nil, zero value otherwise.

### GetNetIssuanceOfDebtOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetNetIssuanceOfDebtOk() (*float32, bool)`

GetNetIssuanceOfDebtOk returns a tuple with the NetIssuanceOfDebt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetIssuanceOfDebt

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetNetIssuanceOfDebt(v float32)`

SetNetIssuanceOfDebt sets NetIssuanceOfDebt field to given value.

### HasNetIssuanceOfDebt

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasNetIssuanceOfDebt() bool`

HasNetIssuanceOfDebt returns a boolean if a field has been set.

### GetNetIssuanceOfPreferred

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetNetIssuanceOfPreferred() float32`

GetNetIssuanceOfPreferred returns the NetIssuanceOfPreferred field if non-nil, zero value otherwise.

### GetNetIssuanceOfPreferredOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetNetIssuanceOfPreferredOk() (*float32, bool)`

GetNetIssuanceOfPreferredOk returns a tuple with the NetIssuanceOfPreferred field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetIssuanceOfPreferred

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetNetIssuanceOfPreferred(v float32)`

SetNetIssuanceOfPreferred sets NetIssuanceOfPreferred field to given value.

### HasNetIssuanceOfPreferred

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasNetIssuanceOfPreferred() bool`

HasNetIssuanceOfPreferred returns a boolean if a field has been set.

### GetOtherCashPaymentsFromOperatingActivities

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetOtherCashPaymentsFromOperatingActivities() float32`

GetOtherCashPaymentsFromOperatingActivities returns the OtherCashPaymentsFromOperatingActivities field if non-nil, zero value otherwise.

### GetOtherCashPaymentsFromOperatingActivitiesOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetOtherCashPaymentsFromOperatingActivitiesOk() (*float32, bool)`

GetOtherCashPaymentsFromOperatingActivitiesOk returns a tuple with the OtherCashPaymentsFromOperatingActivities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherCashPaymentsFromOperatingActivities

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetOtherCashPaymentsFromOperatingActivities(v float32)`

SetOtherCashPaymentsFromOperatingActivities sets OtherCashPaymentsFromOperatingActivities field to given value.

### HasOtherCashPaymentsFromOperatingActivities

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasOtherCashPaymentsFromOperatingActivities() bool`

HasOtherCashPaymentsFromOperatingActivities returns a boolean if a field has been set.

### GetOtherCashReceiptsFromOperatingActivities

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetOtherCashReceiptsFromOperatingActivities() float32`

GetOtherCashReceiptsFromOperatingActivities returns the OtherCashReceiptsFromOperatingActivities field if non-nil, zero value otherwise.

### GetOtherCashReceiptsFromOperatingActivitiesOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetOtherCashReceiptsFromOperatingActivitiesOk() (*float32, bool)`

GetOtherCashReceiptsFromOperatingActivitiesOk returns a tuple with the OtherCashReceiptsFromOperatingActivities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherCashReceiptsFromOperatingActivities

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetOtherCashReceiptsFromOperatingActivities(v float32)`

SetOtherCashReceiptsFromOperatingActivities sets OtherCashReceiptsFromOperatingActivities field to given value.

### HasOtherCashReceiptsFromOperatingActivities

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasOtherCashReceiptsFromOperatingActivities() bool`

HasOtherCashReceiptsFromOperatingActivities returns a boolean if a field has been set.

### GetOtherFinancing

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetOtherFinancing() float32`

GetOtherFinancing returns the OtherFinancing field if non-nil, zero value otherwise.

### GetOtherFinancingOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetOtherFinancingOk() (*float32, bool)`

GetOtherFinancingOk returns a tuple with the OtherFinancing field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherFinancing

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetOtherFinancing(v float32)`

SetOtherFinancing sets OtherFinancing field to given value.

### HasOtherFinancing

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasOtherFinancing() bool`

HasOtherFinancing returns a boolean if a field has been set.

### GetPaymentsOnBehalfOfEmployees

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetPaymentsOnBehalfOfEmployees() float32`

GetPaymentsOnBehalfOfEmployees returns the PaymentsOnBehalfOfEmployees field if non-nil, zero value otherwise.

### GetPaymentsOnBehalfOfEmployeesOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetPaymentsOnBehalfOfEmployeesOk() (*float32, bool)`

GetPaymentsOnBehalfOfEmployeesOk returns a tuple with the PaymentsOnBehalfOfEmployees field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentsOnBehalfOfEmployees

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetPaymentsOnBehalfOfEmployees(v float32)`

SetPaymentsOnBehalfOfEmployees sets PaymentsOnBehalfOfEmployees field to given value.

### HasPaymentsOnBehalfOfEmployees

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasPaymentsOnBehalfOfEmployees() bool`

HasPaymentsOnBehalfOfEmployees returns a boolean if a field has been set.

### GetPaymentsToSuppliersForGoodsAndServices

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetPaymentsToSuppliersForGoodsAndServices() float32`

GetPaymentsToSuppliersForGoodsAndServices returns the PaymentsToSuppliersForGoodsAndServices field if non-nil, zero value otherwise.

### GetPaymentsToSuppliersForGoodsAndServicesOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetPaymentsToSuppliersForGoodsAndServicesOk() (*float32, bool)`

GetPaymentsToSuppliersForGoodsAndServicesOk returns a tuple with the PaymentsToSuppliersForGoodsAndServices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentsToSuppliersForGoodsAndServices

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetPaymentsToSuppliersForGoodsAndServices(v float32)`

SetPaymentsToSuppliersForGoodsAndServices sets PaymentsToSuppliersForGoodsAndServices field to given value.

### HasPaymentsToSuppliersForGoodsAndServices

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasPaymentsToSuppliersForGoodsAndServices() bool`

HasPaymentsToSuppliersForGoodsAndServices returns a boolean if a field has been set.

### GetPurchaseOfBusiness

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetPurchaseOfBusiness() float32`

GetPurchaseOfBusiness returns the PurchaseOfBusiness field if non-nil, zero value otherwise.

### GetPurchaseOfBusinessOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetPurchaseOfBusinessOk() (*float32, bool)`

GetPurchaseOfBusinessOk returns a tuple with the PurchaseOfBusiness field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurchaseOfBusiness

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetPurchaseOfBusiness(v float32)`

SetPurchaseOfBusiness sets PurchaseOfBusiness field to given value.

### HasPurchaseOfBusiness

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasPurchaseOfBusiness() bool`

HasPurchaseOfBusiness returns a boolean if a field has been set.

### GetPurchaseOfInvestment

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetPurchaseOfInvestment() float32`

GetPurchaseOfInvestment returns the PurchaseOfInvestment field if non-nil, zero value otherwise.

### GetPurchaseOfInvestmentOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetPurchaseOfInvestmentOk() (*float32, bool)`

GetPurchaseOfInvestmentOk returns a tuple with the PurchaseOfInvestment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurchaseOfInvestment

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetPurchaseOfInvestment(v float32)`

SetPurchaseOfInvestment sets PurchaseOfInvestment field to given value.

### HasPurchaseOfInvestment

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasPurchaseOfInvestment() bool`

HasPurchaseOfInvestment returns a boolean if a field has been set.

### GetPurchaseOfPpe

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetPurchaseOfPpe() float32`

GetPurchaseOfPpe returns the PurchaseOfPpe field if non-nil, zero value otherwise.

### GetPurchaseOfPpeOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetPurchaseOfPpeOk() (*float32, bool)`

GetPurchaseOfPpeOk returns a tuple with the PurchaseOfPpe field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurchaseOfPpe

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetPurchaseOfPpe(v float32)`

SetPurchaseOfPpe sets PurchaseOfPpe field to given value.

### HasPurchaseOfPpe

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasPurchaseOfPpe() bool`

HasPurchaseOfPpe returns a boolean if a field has been set.

### GetReceiptsFromCustomers

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetReceiptsFromCustomers() float32`

GetReceiptsFromCustomers returns the ReceiptsFromCustomers field if non-nil, zero value otherwise.

### GetReceiptsFromCustomersOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetReceiptsFromCustomersOk() (*float32, bool)`

GetReceiptsFromCustomersOk returns a tuple with the ReceiptsFromCustomers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReceiptsFromCustomers

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetReceiptsFromCustomers(v float32)`

SetReceiptsFromCustomers sets ReceiptsFromCustomers field to given value.

### HasReceiptsFromCustomers

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasReceiptsFromCustomers() bool`

HasReceiptsFromCustomers returns a boolean if a field has been set.

### GetReceiptsFromGovernmentGrants

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetReceiptsFromGovernmentGrants() float32`

GetReceiptsFromGovernmentGrants returns the ReceiptsFromGovernmentGrants field if non-nil, zero value otherwise.

### GetReceiptsFromGovernmentGrantsOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetReceiptsFromGovernmentGrantsOk() (*float32, bool)`

GetReceiptsFromGovernmentGrantsOk returns a tuple with the ReceiptsFromGovernmentGrants field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReceiptsFromGovernmentGrants

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetReceiptsFromGovernmentGrants(v float32)`

SetReceiptsFromGovernmentGrants sets ReceiptsFromGovernmentGrants field to given value.

### HasReceiptsFromGovernmentGrants

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasReceiptsFromGovernmentGrants() bool`

HasReceiptsFromGovernmentGrants returns a boolean if a field has been set.

### GetRepurchaseOfStock

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetRepurchaseOfStock() float32`

GetRepurchaseOfStock returns the RepurchaseOfStock field if non-nil, zero value otherwise.

### GetRepurchaseOfStockOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetRepurchaseOfStockOk() (*float32, bool)`

GetRepurchaseOfStockOk returns a tuple with the RepurchaseOfStock field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRepurchaseOfStock

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetRepurchaseOfStock(v float32)`

SetRepurchaseOfStock sets RepurchaseOfStock field to given value.

### HasRepurchaseOfStock

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasRepurchaseOfStock() bool`

HasRepurchaseOfStock returns a boolean if a field has been set.

### GetSaleOfBusiness

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetSaleOfBusiness() float32`

GetSaleOfBusiness returns the SaleOfBusiness field if non-nil, zero value otherwise.

### GetSaleOfBusinessOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetSaleOfBusinessOk() (*float32, bool)`

GetSaleOfBusinessOk returns a tuple with the SaleOfBusiness field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSaleOfBusiness

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetSaleOfBusiness(v float32)`

SetSaleOfBusiness sets SaleOfBusiness field to given value.

### HasSaleOfBusiness

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasSaleOfBusiness() bool`

HasSaleOfBusiness returns a boolean if a field has been set.

### GetSaleOfInvestment

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetSaleOfInvestment() float32`

GetSaleOfInvestment returns the SaleOfInvestment field if non-nil, zero value otherwise.

### GetSaleOfInvestmentOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetSaleOfInvestmentOk() (*float32, bool)`

GetSaleOfInvestmentOk returns a tuple with the SaleOfInvestment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSaleOfInvestment

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetSaleOfInvestment(v float32)`

SetSaleOfInvestment sets SaleOfInvestment field to given value.

### HasSaleOfInvestment

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasSaleOfInvestment() bool`

HasSaleOfInvestment returns a boolean if a field has been set.

### GetSaleOfPpe

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetSaleOfPpe() float32`

GetSaleOfPpe returns the SaleOfPpe field if non-nil, zero value otherwise.

### GetSaleOfPpeOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetSaleOfPpeOk() (*float32, bool)`

GetSaleOfPpeOk returns a tuple with the SaleOfPpe field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSaleOfPpe

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetSaleOfPpe(v float32)`

SetSaleOfPpe sets SaleOfPpe field to given value.

### HasSaleOfPpe

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasSaleOfPpe() bool`

HasSaleOfPpe returns a boolean if a field has been set.

### GetTaxesRefundPaidDirect

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetTaxesRefundPaidDirect() float32`

GetTaxesRefundPaidDirect returns the TaxesRefundPaidDirect field if non-nil, zero value otherwise.

### GetTaxesRefundPaidDirectOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetTaxesRefundPaidDirectOk() (*float32, bool)`

GetTaxesRefundPaidDirectOk returns a tuple with the TaxesRefundPaidDirect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaxesRefundPaidDirect

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetTaxesRefundPaidDirect(v float32)`

SetTaxesRefundPaidDirect sets TaxesRefundPaidDirect field to given value.

### HasTaxesRefundPaidDirect

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasTaxesRefundPaidDirect() bool`

HasTaxesRefundPaidDirect returns a boolean if a field has been set.

### GetTotalFreeCashFlow

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetTotalFreeCashFlow() float32`

GetTotalFreeCashFlow returns the TotalFreeCashFlow field if non-nil, zero value otherwise.

### GetTotalFreeCashFlowOk

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) GetTotalFreeCashFlowOk() (*float32, bool)`

GetTotalFreeCashFlowOk returns a tuple with the TotalFreeCashFlow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalFreeCashFlow

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) SetTotalFreeCashFlow(v float32)`

SetTotalFreeCashFlow sets TotalFreeCashFlow field to given value.

### HasTotalFreeCashFlow

`func (o *FundamentalsNNOREITDIRECTCashflowStatement) HasTotalFreeCashFlow() bool`

HasTotalFreeCashFlow returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


