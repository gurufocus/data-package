# # FundamentalsNREITDIRECTCashflowStatement

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**beginning_cash_position** | **float** |  | [optional]
**cash_flow_capital_expenditure** | **float** | &lt;p&gt;{{Cash_Flow_CPEX}} refers to the funds spent for a company to acquire or upgrade physical assets such as property, industrial buildings or equipment.&lt;/p&gt; | [optional]
**cash_flow_for_lease_financing** | **float** | https://www.gurufocus.com/glossary/cash_flow_for_lease_financing | [optional]
**cash_flow_from_investing** | **float** | &lt;p&gt;{{Cash_Flow_from_Investing}} covers the cash a company gains or spends from investment activities in financial market and operating subsidiaries. It also includes the cash the company used for {{Net_PPE}}(PPE). If a company spends cash on {{Net_PPE}} (PPE), this will reduce their cash position. This is called {{Cash_Flow_CPEX}} (CPEX). Likewise, if a company buys another company for cash, this will reduce their cash position. &lt;br&gt;{{Cash_Flow_from_Investing}} is calculated as {{Cash_Flow_from_Investing}} &#x3D; {{PurchaseOfPPE}} + {{SaleOfPPE}} + {{PurchaseOfBusiness}} + {{SaleOfBusiness}} + {{PurchaseOfInvestment}} + {{SaleOfInvestment}} + {{NetIntangiblesPurchaseAndSale}} + {{CashFromDiscontinuedInvestingActivities}} + {{CashFromOtherInvestingActivities}}&lt;/p&gt; | [optional]
**cash_flow_from_operations** | **float** | &lt;p&gt;{{Cash_Flow_from_Operations}} refers to the cash brought in through a company&#39;s sales. &lt;br&gt;Therefore, {{Cash_Flow_from_Operations}} &#x3D; {{NetIncomeFromContinuingOperations}} + {{CF_DDA}} + {ChangeInWorkingCapital}} + Deferred Tax + {{Cash_Flow_from_Disc_Op}} + {{AssetImpairmentCharge}} + {{StockBasedCompensation}} + {{Cash_Flow_from_Others}}&lt;/p&gt; | [optional]
**cash_flow_from_others** | **float** | &lt;p&gt;{{Cash_Flow_from_Others}} may include {{ChangeInWorkingCapital}}. These are cash differences caused by the {{ChangeInInventory}}, {{AccountsPayable}}, {{Accts_Rec}} etc. For instance, if a company pays its suppliers slower, its cash position will build up faster. If a company receives payments from its customers slower, its {{Accts_Rec}} will rise, and its cash position will grow more slowly (or even shrink).&lt;/p&gt; | [optional]
**cash_from_discontinued_investing_activities** | **float** | &lt;p&gt;{{CashFromDiscontinuedInvestingActivities}} means the cash received by a company that comes from the discontinued investing activities.&lt;/p&gt; | [optional]
**cash_from_financing** | **float** | &lt;p&gt;{{Cash_from_Financing}} is the cash generated/spent from financial activities such as share issuance (buy back), debt issuance (repayment), and dividends paid to preferred and common stockholders. In the calculation of {{total_freecashflow}}, {{Cash_from_Financing}} is not calculated because it is not related to operating activities. &lt;br&gt;{{Cash_from_Financing}} &#x3D; {{Issuance_of_Stock}} + {{Repurchase_of_Stock}} + {{Net_Issuance_of_Debt}} + {{Net_Issuance_of_preferred}} + {{Dividends}} + Other Financing&lt;/p&gt; | [optional]
**cash_from_other_investing_activities** | **float** | &lt;p&gt;{{CashFromOtherInvestingActivities}} means the cash received by a company that comes from other investing activities.&lt;/p&gt; | [optional]
**cash_payments** | **float** |  | [optional]
**cash_receipts_from_operating_activities** | **float** | &lt;p&gt;Cash flow from operations refers to the cash brought in through a company&#39;s normal business operations. It is the cash flow before any investment or financing activities. It is the cash version of {{Net_Income}}. &lt;br&gt;{{Cash_Flow_from_Operations}} &#x3D; {{Net_Income}} + {{DDA}} + {{Cash_Flow_from_Disc_Op}} + {{Cash_Flow_from_Others}}&lt;/p&gt; | [optional]
**debt_issuance** | **float** |  | [optional]
**debt_payments** | **float** |  | [optional]
**dividends** | **float** | &lt;p&gt;{{Dividends}} refers to the payment of cash to shareholders as dividends when the company generates income.&lt;/p&gt; | [optional]
**dividends_paid_direct** | **float** |  | [optional]
**dividends_received_direct** | **float** |  | [optional]
**effect_of_exchange_rate_changes** | **float** |  | [optional]
**ending_cash_position** | **float** |  | [optional]
**ffo** | **float** | &lt;p&gt;{{FFO}} (Funds from operations) refers to the figure used by real estate investment trusts (REITs) to define the cash flow from their operations. It is calculated by adding depreciation and amortization to earnings, subtracting any gains on sales.&lt;/p&gt; | [optional]
**interest_paid_direct** | **float** |  | [optional]
**interest_received_direct** | **float** |  | [optional]
**issuance_of_stock** | **float** | &lt;p&gt;A company may raise cash from issuing new shares. It can also use cash to buy back shares. If this number is positive, it means that the company has received more cash from issuing shares than it has paid to buy back shares. If this number is negative, it means that company has paid more cash to buy back shares than it has received for issuing shares.&lt;/p&gt; | [optional]
**net_change_in_cash** | **float** | &lt;p&gt;{{Net_Change_in_Cash}} is calculated as {{Net_Change_in_Cash}} &#x3D; {{Cash_Flow_from_Operations}} + {{Cash_Flow_from_Investing}} + {{Cash_from_Financing}} + {{effect_of_exchange_rate_changes}}&lt;/p&gt; | [optional]
**net_intangibles_purchase_and_sale** | **float** | &lt;p&gt;{{NetIntangiblesPurchaseAndSale}} means the net cash inflow received by a company that comes from the purchase and sale of intangibles. It equals the cash received from sale of intangibles minus the cash spent on purchasing intangibles.&lt;/p&gt; | [optional]
**net_issuance_of_debt** | **float** | &lt;p&gt;{{Net_Issuance_of_Debt}} is the cash a company received or spent through debt related activities such as debt issuance or debt repayment. If a company pays down its debt during the period, this number will be negative. If a company issued more debt, it receives cash and this number is positive.&lt;/p&gt; | [optional]
**net_issuance_of_preferred** | **float** | &lt;p&gt;A company may raise cash from issuing new preferred shares. It can also use cash to buy back preferred shares. If this number is positive, it means that the company has received more cash from issuing preferred shares than it has paid to buy back preferred shares. If this number is negative, it means that company has paid more cash to buy back preferred shares than it has received for issuing preferred shares.&lt;/p&gt; | [optional]
**other_cash_payments_from_operating_activities** | **float** |  | [optional]
**other_cash_receipts_from_operating_activities** | **float** | &lt;p&gt;{{CashFromOtherInvestingActivities}} means the cash received by a company that comes from other investing activities.&lt;/p&gt; | [optional]
**other_financing** | **float** | &lt;p&gt;{{Other_Financing}} represents other {{Cash_from_Financing}} activity that not otherwise classified, which includes: Proceeds From Stock Option Exercised, Other Financing Charges.&lt;/p&gt; | [optional]
**payments_on_behalf_of_employees** | **float** |  | [optional]
**payments_to_suppliers_for_goods_and_services** | **float** | Cash flow statement direct method: the total cash payments to suppliers | [optional]
**purchase_of_business** | **float** | &lt;p&gt;{{PurchaseOfBusiness}} is the amount used to purchase business.&lt;/p&gt; | [optional]
**purchase_of_investment** | **float** | &lt;p&gt;{{PurchaseOfInvestment}} represents cash outflow on the purchase of investments in securities.&lt;/p&gt; | [optional]
**purchase_of_ppe** | **float** | &lt;p&gt;{{PurchaseOfPPE}} is the amount used to purchase Property, Plant and Equipment.&lt;/p&gt; | [optional]
**receipts_from_customers** | **float** | Cash flow statement direct method: cash collections from customers | [optional]
**receipts_from_government_grants** | **float** |  | [optional]
**repurchase_of_stock** | **float** | &lt;p&gt;A company may raise cash from issuing new shares. It can also use cash to buy back shares. {{Repurchase_of_Stock}} represents the cash outflow to reacquire common stock during the period.&lt;/p&gt; | [optional]
**sale_of_business** | **float** | &lt;p&gt;{{SaleOfBusiness}} is the amount earned to sell business.&lt;/p&gt; | [optional]
**sale_of_investment** | **float** | &lt;p&gt;{{SaleOfInvestment}} represents cash inflow on the sale of investments in securities.&lt;/p&gt; | [optional]
**sale_of_ppe** | **float** | &lt;p&gt;{{SaleOfPPE}} is the amount earned to sell {{Net_PPE}}. &lt;/p&gt; | [optional]
**taxes_refund_paid_direct** | **float** |  | [optional]
**total_free_cash_flow** | **float** | &lt;p&gt;{{total_freecashflow}} is considered one of the most important parameters to measure a company&#39;s earnings power by value investors because it is not subject to estimates of {{DDA}} (DDA). However, when we look at the {{total_freecashflow}}, we should look from a long term perspective, because any year&#39;s {{total_freecashflow}} can be drastically affected by the spending on {{Net_PPE}} (PPE) of the business in that year. Over the long term, {{total_freecashflow}} should give pretty good picture on the real earnings power of the company. &lt;br&gt;{{total_freecashflow}} is calculated as {{total_freecashflow}} &#x3D; {{cash_Flow_from_Operations}} + {{Cash_Flow_CPEX}}&lt;/p&gt; | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
