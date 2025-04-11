# FundamentalsIREITNODIRECTBalanceSheet

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccountsReceivable** | Pointer to **float32** | &lt;p&gt;{{Accts_Rec}} is money owed to a business by customers and shown on its Balance Sheet as an asset. {{Accts_Rec}} are created when a customer has received a product but has not yet paid for that product. It is related to {{DaysSalesOutstanding}}, which measures of the average number of days that a company takes to collect revenue after a sale has been made. It is a financial ratio that illustrates how well a company&#39;s accounts receivables are being managed. &lt;br&gt;{{DaysSalesOutstanding}} &#x3D; {{Accts_Rec}} / {{Revenue}} * Days in Period&lt;/p&gt; | [optional] 
**AccumulatedOtherComprehensiveIncome** | Pointer to **float32** | &lt;p&gt;{{accumulated_other_comprehensive_income}} is the aggregate amount of gains or losses that are not part of retained earnings.&lt;/p&gt; | [optional] 
**AdditionalPaidInCapital** | Pointer to **float32** | &lt;p&gt;{{AdditionalPaidInCapital}} is the capital that a company raises in a financing round in excess of the capital&#39;s par value. The account represents the excess paid by an investor over the par-value price of a stock issue. {{AdditionalPaidInCapital}} can arise from issuing either preferred or common stock. &lt;br&gt;{{AdditionalPaidInCapital}} is calculated as: {{AdditionalPaidInCapital}} &#x3D; (Issue Price - Par Value) * {{Shares_Outstanding}}&lt;/p&gt; | [optional] 
**BsCashAndCashEquivalents** | Pointer to **float32** | &lt;p&gt;{{CashAndCashEquivalents}} are the most liquid assets on the balance sheet. Cash equivalents are assets that are readily convertible into cash, such as money market holdings, short-term government bonds or Treasury bills, marketable securities and commercial paper.&lt;/p&gt; | [optional] 
**BsCurrentDeferredLiabilities** | Pointer to **float32** | &lt;p&gt;{{BS_CurrentDeferredLiabilities}} represents the current portion of obligations, which is a liability that usually would have been paid but is now pas due.&lt;/p&gt; | [optional] 
**BsDeferredPolicyAcquisitionCosts** | Pointer to **float32** | &lt;p&gt;{{BS_DeferredPolicyAcquisitionCosts}} represent the costs incurred by insurance companies for policy acquisitions that has not been paid.&lt;/p&gt; | [optional] 
**BsEquityInvestments** | Pointer to **float32** | &lt;p&gt;{{BS_EquityInvestments}} mean that through these investments, the holders of these investments take ownership in the entities that issued these investment vehicles. Stock is kind of equity investment.&lt;/p&gt; | [optional] 
**BsFixedMaturityInvestment** | Pointer to **float32** | &lt;p&gt;{{BS_FixedMaturityInvestment}} is financial assets that have fixed maturity dates, such as treasury bonds and corporate bonds. Before the maturity, these assets usually pay fixed interest rate. At maturity, the principle will be returned from the borrowed.&lt;/p&gt; | [optional] 
**BsFuturePolicyBenefits** | Pointer to **float32** | &lt;p&gt;{{BS_FuturePolicyBenefits}} represents an insurance entity&#39;s net liability for future benefits (for example, death, cash surrender value) to be paid to or on behalf of policyholders, where the accounting policy describes the bases, methodologies and components of the reserve, and assumptions regarding estimates of expected investment yields, mortality, morbidity, terminations and expenses.&lt;/p&gt; | [optional] 
**BsNetLoan** | Pointer to **float32** | &lt;p&gt;{{BS_NetLoan}} is total loans on banks&#39; book. These are the fund that banks have lent out. The loans contribute to banks&#39; income. Some borrower of the loans may stop paying their payment. In this case, the loan is called non-performing loans. Loans can be divided into residential loans, commercial loans or consumer loans.&lt;/p&gt; | [optional] 
**BsOtherAssetsInsurance** | Pointer to **float32** |  | [optional] 
**BsOtherLiabilitiesInsurance** | Pointer to **float32** |  | [optional] 
**BsPayablesAndAccruedExpenses** | Pointer to **float32** |  | [optional] 
**BsPolicyholderFunds** | Pointer to **float32** | &lt;p&gt;{{BS_PolicyholderFunds}}&lt;/p&gt; | [optional] 
**BsTradingAssets** | Pointer to **float32** | &lt;p&gt;Other assets that are traded in markets.&lt;/p&gt; | [optional] 
**BsUnearnedPremiums** | Pointer to **float32** | &lt;p&gt;{{BS_UnearnedPremiums}} is the portion of premium that has not been earned by insurance companies. Insurance companies have to pay them back to the insured if the policies are cancelled.&lt;/p&gt; | [optional] 
**BsUnpaidLossAndLossReserve** | Pointer to **float32** | &lt;p&gt;{{BS_UnpaidLossAndLossReserve}} is the fund insurance companies set aside for the loss that has not be paid or possible losses in the future.&lt;/p&gt; | [optional] 
**CommonStock** | Pointer to **float32** | &lt;p&gt;{{CommonStock}} is listed on  the Balance Sheet at the par value of the total shares outstanding of a company. The par value of {{CommonStock}} is meaningless. It is usually set at an absurdly low number.&lt;/p&gt; | [optional] 
**CurrentDeferredRevenue** | Pointer to **float32** | &lt;p&gt;{{CurrentDeferredRevenue}} represents collections of cash or other assets related to revenue producing activity for which revenue has not yet been recognized. Generally, an entity records deferred revenue when it receives consideration from a customer before achieving certain criteria that must be met for revenue to be recognized in conformity with GAAP. It can be either current or non-current item. Also called unearned revenue.&lt;/p&gt; | [optional] 
**CurrentDeferredTaxesLiabilities** | Pointer to **float32** | &lt;p&gt;{{CurrentDeferredTaxesLiabilities}} means a future tax liability, resulting from temporary differences between book (accounting) value of assets and liabilities and their tax value, or timing differences between the recognition of gains and losses in financial statements and their recognition in a tax computation. Deferred tax liabilities generally arise where tax relief is provided in advance of an accounting expense, or income is accrued but not taxed until received.&lt;/p&gt; | [optional] 
**DebtToEquity** | Pointer to **float32** | The Debt/Equity (D/E) Ratio is calculated by dividing a company’s total liabilities by its shareholder equity. The ratio is used to evaluate a company&#39;s financial leverage. | [optional] 
**EquityToAsset** | Pointer to **float32** | Equity to Asset ratio is calculated as shareholder&#39;s tangible equity divided by its total asset. | [optional] 
**GoodWill** | Pointer to **float32** | &lt;p&gt;A {{Goodwill}} is an {{Intangibles}} that arises as a result of the acquisition of one company by another for a premium value. The value of a company&#39;s brand name, solid customer base, good customer relations, good employee relations and any patents or proprietary technology represent {{Goodwill}}. {{Goodwill}} is considered an {{Intangibles}} because it is not a physical asset like buildings or equipment. The {{Goodwill}} account can be found in the assets portion of a company&#39;s balance sheet.&lt;/p&gt; | [optional] 
**Intangibles** | Pointer to **float32** | &lt;p&gt;{{Intangibles}} are defined as identifiable non-monetary assets that cannot be seen, touched or physically measured.  Examples of {{Intangibles}} include trade secrets, copyrights, patents, trademarks. If a company acquires assets at the prices above the book value, it may carry {{Goodwill}} on its balance sheet. {{Goodwill}} reflects the difference between the price the company paid and the book value of the assets. If a company (company A) received a patent through their own work, though it has value, it does not show up on its balance sheet as an intangible asset. However, if company A sells this patent to company B, it will show up on company B&#39;s balance sheet as an {{Intangibles}}. The same applies to brand names, trade secrets etc. For instance, Coca-Cola&#39;s brand is extremely valuable, but the brand does not appear on its balance sheet, because the brand was never acquired.&lt;/p&gt; | [optional] 
**LongTermDebtAndCapitalLeaseObligation** | Pointer to **float32** | &lt;p&gt;{{LongTermDebt}} is the debt due more than 12 months in the future. The debt can be owed to banks or bondholders. Some companies issue bonds to investors and pay interest on the bonds. &lt;br&gt;{{LongTermCapitalLeaseObligation}} represents the total liability for long-term leases lasting over one year. It&#39;s amount equal to the present value (the principal) at the beginning of the lease term less lease payments during the lease term. &lt;br&gt;{{Long-Term_Debt}} can be used to calculate {{ltd2asset}}: {{ltd2asset}} &#x3D; {{Long-Term_Debt}} / {{Total_Assets}}&lt;/p&gt; | [optional] 
**MinorityInterest** | Pointer to **float32** | &lt;p&gt;{{Minority_interest}} is the carrying amount of the equity interests owned by non-controlling shareholders, partners, or other equity holders in one or more of the entities included in the reporting entity&#39;s consolidated financial statements.&lt;/p&gt; | [optional] 
**NetPpe** | Pointer to **float32** | &lt;p&gt;{{Net_PPE}} (PPE) are the fixed assets of the companyFixed assets are also known as non-current assets. {{Net_PPE}} includes assets that will - in the normal course of business - neither be used up in the next year nor will become a part of any product sold to customers. Some of the most common parts of property, plant, and equipment are: Land, Buildings (and leasehold improvements), Transportation equipment, Manufacturing equipment, Office equipment, Office furniture. Companies with lots of property, plant, and equipment often have special categories. For example, railroad property includes: Track, Ties, Ballast, Bridges, Tunnels, Signals, Locomotives, Freight Cars. There is often a note in the financial statements - found in a company&#39;s 10-K - that will explain the different categories of property a company owns. &lt;br&gt;The market value of {{Net_PPE}} can differ tremendously from the book value of {{Net_PPE}}. For example, when Berkshire Hathaway liquidated its textile mills, it had to pay the buyers of the company&#39;s manufacturing equipment to haul the equipment  away. That {{Net_PPE}} was literally worth less than zero. On the other hand, some companies own thousands of acres of land. All {{Net_PPE}} other than land is depreciated. Land is never depreciated. However, land is not marked up to market value either. Under Generally Accepted Accounting Principles (GAAP), land is shown on the balance sheet at cost. &lt;br&gt;The {{Net_PPE}} line shown on the balance sheet is usually net {{Net_PPE}}. This means it is the cost of the {{Net_PPE}} less accumulated depreciation.&lt;/p&gt; | [optional] 
**NonCurrentDeferredIncomeTax** | Pointer to **float32** | The NonCurrent Deferred Income Tax represents the non-current portion of deferred income taxes, which is the difference in income recognition between tax laws and the accounting methods. | [optional] 
**NonCurrentDeferredLiabilities** | Pointer to **float32** | &lt;p&gt;{{NonCurrentDeferredLiabilities}} represents the non-current portion of obligations, which is a liability that usually would have been paid but is now pas due.&lt;/p&gt; | [optional] 
**NotesReceivable** | Pointer to **float32** | &lt;p&gt;{{NotesReceivable}} is an unconditional promise to receive a definite sum of money at a future date(s) within one year of the balance sheet date or the normal operating cycle, whichever is longer.&lt;/p&gt; | [optional] 
**OtherCurrentReceivables** | Pointer to **float32** | &lt;p&gt;{{OtherCurrentReceivables}} is other current receivables of that not otherwise classified. GuruFocus uses a standardized financial statement format for all companies. GuruFocus lists {{Accts_Rec}}, {{NotesReceivable}}, {{LoansReceivable}} and {{OtherCurrentReceivables}} under the \&quot;{{TotalReceivables}}\&quot; section.&lt;/p&gt; | [optional] 
**OtherEquity** | Pointer to **float32** | &lt;p&gt;{{OtherEquity}} is instruments issued by the company that cannot be identified by other specific items in the Equity section. GuruFocus lists following items in \&quot;{{Total_Equity}}\&quot; section: {{CommonStock}}, {{Preferred_Stock}}, {{Retained_Earnings}}, {{accumulated_other_comprehensive_income}}, {{AdditionalPaidInCapital}}, {{Treasury_Stock}}, {{OtherEquity}}.&lt;/p&gt; | [optional] 
**PreferredStock** | Pointer to **float32** | &lt;p&gt;{{Preferred_Stock}} is a special equity security that has properties of both equity and debt. It is generally considered a hybrid instrument. {{Preferred_Stock}} is senior to {{CommonStock}}, but is subordinate to bonds in terms of claim or rights to their share of the assets of the company. {{Preferred_Stock}} has priority over {{CommonStock}} in the payment of dividends and any payments received when a company liquidates. &lt;br&gt;{{Preferred_Stock}} comes in many forms. It can be: Convertible or Non-Convertible, Cumulative or Non-Cumulative, Voting or Non-Voting, Callable or Non-Callable, Maturity Date or No Maturity Date. &lt;br&gt;A {{Preferred_Stock}} without a maturity date is called a perpetual preferred stock. These are relatively rare. A good example of perpetual {{Preferred_Stock}} is the many series of Public Storage (PSA) preferred shares that trade on the New York Stock Exchange. &lt;br&gt;Before investing in preferred stock, it is important to know which of the above groups the stock belongs to. Is it convertible or non-convertible? Are dividends cumulative or non-cumulative? It is also critical that an investor knows what bonds the company has in front of the {{Preferred_Stock}}. Bondholders get paid first. So the decision to buy a {{Preferred_Stock}} can be similar to the decision to buy a bond. But, remember, the {{Preferred_Stock}} of a company with bonds is junior to those bonds.  &lt;br&gt;Unless a {{Preferred_Stock}} is convertible, the upside in a preferred stock investment is more limited than in a {{CommonStock}} investment. If a company doubles its earnings, it is usually under no more obligation to double the dividends paid to preferred shareholders than it is to double the interest paid to its bankers and bondholders.So {{Preferred_Stock}} is very different from {{CommonStock}}.&lt;/p&gt; | [optional] 
**RetainedEarnings** | Pointer to **float32** | &lt;p&gt;{{Retained_Earnings}} is the accumulated portion of {{Net_Income}} that is not distributed to shareholders. Because the {{Net_Income}} was not distributed to shareholders, shareholders&#39; equity is increased by the same amount. Of course, if a company loses, it is called retained losses, or accumulated losses. Historically profitable companies sometimes have negative {{Retained_Earnings}}. This is because they have cumulatively paid out more to shareholders than they reported in profits. If a company has negative {{Retained_Earnings}}, investors should check the 10-year financial results. They should not assume that negative {{Retained_Earnings}} prove a company has generally lost money in the past. Of course, many companies with negative {{Retained_Earnings}} have indeed lost money in the past.&lt;/p&gt; | [optional] 
**ShortTermDebtAndCapitalLeaseObligation** | Pointer to **float32** | &lt;p&gt;{{Short-Term_Debt}} is the portion of a company&#39;s debt and capital lease obligation that need to be paid within the next 12 months. It equals {{ShortTermDebt_without_lease}} plus {{ShortTermCapitalLeaseObligation}}. This gives investors an idea of how much money the company needs to pay down for the principle of its debt.&lt;/p&gt; | [optional] 
**TotalAssets** | Pointer to **float32** | &lt;p&gt;{{Total_Assets}} are all the assets a company owns. From the capital sources of the assets, some of the assets are funded through shareholder&#39;s paid in capital and {{Retained_Earnings}} of the business. Others are funded through borrowed money. &lt;br&gt;Therefore, total assets can be calculated as: {{Total_Assets}} &#x3D; {{Total_Current_Assets}} + {{TotalNonCurrentAssets}} &#x3D; Total Shareholder&#39;s Equity + {{Total_Liabilities}} &lt;br&gt;Total Assets is connected with Return on Assets by {{ROA}} &#x3D; {{Net_Income}} / {{Total_Assets}} &lt;br&gt; Total Assets is linked to {{Revenue}} through {{turnover}}: {{turnover}}  &#x3D; {{Revenue}} / {{Total_Assets}} &lt;br&gt;Therefore, if a company grows its {{Total_Assets}} faster than its {{Revenue}}, the {{turnover}} will decline. This might be a warning sign for the business.&lt;/p&gt; | [optional] 
**TotalEquity** | Pointer to **float32** | &lt;p&gt;{{TotalEquityGrossMinorityInterest}} is residual interest, including minority interest, that remains in the assets of the enterprise after deducting its liabilities. Equity is increased by owners’ investments and by comprehensive income, and it is reduced by distributions to the owners.&lt;/p&gt; | [optional] 
**TotalLiabilities** | Pointer to **float32** | &lt;p&gt;{{Total_Liabilities}} &#x3D; {{Total_Current_Liabilities}} + {{TotalNonCurrentLiabilitiesNetMinorityInterest}} &#x3D; {{Total_Current_Liabilities}} + {{Long-Term_Debt}} + {{ther_Long-Term_Liab}} &lt;br&gt;{{Total_Liabilities}} &#x3D; {{Total_Assets}} - {{TotalEquityGrossMinorityInterest}} &lt;br&gt;{{Total_Liabilities}} are the liabilities that the company has to pay others. It is a part of the balance sheet of a company that shareholders do not own, and would be obligated to pay back if the company liquidated.&lt;/p&gt; | [optional] 
**TotalReceivables** | Pointer to **float32** | &lt;p&gt;{{TotalReceivables}} is the sum of all receivables owed by customers and affiliates within one year, including {{Accts_Rec}}, {{NotesReceivable}}, {{LoansReceivable}},{{OtherCurrentReceivables}}.&lt;/p&gt; | [optional] 
**TotalStockholdersEquity** | Pointer to **float32** | &lt;p&gt;{{Total_Equity}} refers to the net assets owned by shareholders. &lt;br&gt;{{Total_Equity}} &#x3D; {{Preferred_Stock}} + {{CommonStock}} + Capital Surplus + {{Retained_Earnings}} &lt;br&gt;{{Total_Equity}} and {{Total_Liabilities}} are the two components for {{Total_Assets}}: &lt;br&gt;Total Assets &#x3D; Total Shareholder&#39;s Equity + {{Total_Liabilities}}  &#x3D; {{Total_Current_Assets}} + {{TotalNonCurrentAssets}} &lt;br&gt;{{Total_Equity}} is used to calculate {{Book_Value_Per_Share}}: {{Book_Value_Per_Share}} &#x3D; ({{Total_Equity}} - {{Preferred_Stock}})/ {{BS_share}}. &lt;br&gt;The ratio of a company&#39;s debt over equity can be used to measure how leveraged this company is: {{deb2equity}} &#x3D; ({{Long-Term_Debt}} + {{Short-Term_Debt}})/{{Total_Equity}}.&lt;/p&gt; | [optional] 
**TreasuryStock** | Pointer to **float32** | &lt;p&gt;{{Treasury_Stock}} is the portion of shares that a company keeps in their own treasury. {{Treasury_Stock}} may have come from a repurchase or buyback from shareholders; or it may have never been issued to the public in the first place. These shares don&#39;t pay dividends, have no voting rights, and should not be included in shares outstanding calculations.&lt;/p&gt; | [optional] 

## Methods

### NewFundamentalsIREITNODIRECTBalanceSheet

`func NewFundamentalsIREITNODIRECTBalanceSheet() *FundamentalsIREITNODIRECTBalanceSheet`

NewFundamentalsIREITNODIRECTBalanceSheet instantiates a new FundamentalsIREITNODIRECTBalanceSheet object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFundamentalsIREITNODIRECTBalanceSheetWithDefaults

`func NewFundamentalsIREITNODIRECTBalanceSheetWithDefaults() *FundamentalsIREITNODIRECTBalanceSheet`

NewFundamentalsIREITNODIRECTBalanceSheetWithDefaults instantiates a new FundamentalsIREITNODIRECTBalanceSheet object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAccountsReceivable

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetAccountsReceivable() float32`

GetAccountsReceivable returns the AccountsReceivable field if non-nil, zero value otherwise.

### GetAccountsReceivableOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetAccountsReceivableOk() (*float32, bool)`

GetAccountsReceivableOk returns a tuple with the AccountsReceivable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountsReceivable

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetAccountsReceivable(v float32)`

SetAccountsReceivable sets AccountsReceivable field to given value.

### HasAccountsReceivable

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasAccountsReceivable() bool`

HasAccountsReceivable returns a boolean if a field has been set.

### GetAccumulatedOtherComprehensiveIncome

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetAccumulatedOtherComprehensiveIncome() float32`

GetAccumulatedOtherComprehensiveIncome returns the AccumulatedOtherComprehensiveIncome field if non-nil, zero value otherwise.

### GetAccumulatedOtherComprehensiveIncomeOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetAccumulatedOtherComprehensiveIncomeOk() (*float32, bool)`

GetAccumulatedOtherComprehensiveIncomeOk returns a tuple with the AccumulatedOtherComprehensiveIncome field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccumulatedOtherComprehensiveIncome

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetAccumulatedOtherComprehensiveIncome(v float32)`

SetAccumulatedOtherComprehensiveIncome sets AccumulatedOtherComprehensiveIncome field to given value.

### HasAccumulatedOtherComprehensiveIncome

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasAccumulatedOtherComprehensiveIncome() bool`

HasAccumulatedOtherComprehensiveIncome returns a boolean if a field has been set.

### GetAdditionalPaidInCapital

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetAdditionalPaidInCapital() float32`

GetAdditionalPaidInCapital returns the AdditionalPaidInCapital field if non-nil, zero value otherwise.

### GetAdditionalPaidInCapitalOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetAdditionalPaidInCapitalOk() (*float32, bool)`

GetAdditionalPaidInCapitalOk returns a tuple with the AdditionalPaidInCapital field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdditionalPaidInCapital

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetAdditionalPaidInCapital(v float32)`

SetAdditionalPaidInCapital sets AdditionalPaidInCapital field to given value.

### HasAdditionalPaidInCapital

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasAdditionalPaidInCapital() bool`

HasAdditionalPaidInCapital returns a boolean if a field has been set.

### GetBsCashAndCashEquivalents

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsCashAndCashEquivalents() float32`

GetBsCashAndCashEquivalents returns the BsCashAndCashEquivalents field if non-nil, zero value otherwise.

### GetBsCashAndCashEquivalentsOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsCashAndCashEquivalentsOk() (*float32, bool)`

GetBsCashAndCashEquivalentsOk returns a tuple with the BsCashAndCashEquivalents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBsCashAndCashEquivalents

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetBsCashAndCashEquivalents(v float32)`

SetBsCashAndCashEquivalents sets BsCashAndCashEquivalents field to given value.

### HasBsCashAndCashEquivalents

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasBsCashAndCashEquivalents() bool`

HasBsCashAndCashEquivalents returns a boolean if a field has been set.

### GetBsCurrentDeferredLiabilities

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsCurrentDeferredLiabilities() float32`

GetBsCurrentDeferredLiabilities returns the BsCurrentDeferredLiabilities field if non-nil, zero value otherwise.

### GetBsCurrentDeferredLiabilitiesOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsCurrentDeferredLiabilitiesOk() (*float32, bool)`

GetBsCurrentDeferredLiabilitiesOk returns a tuple with the BsCurrentDeferredLiabilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBsCurrentDeferredLiabilities

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetBsCurrentDeferredLiabilities(v float32)`

SetBsCurrentDeferredLiabilities sets BsCurrentDeferredLiabilities field to given value.

### HasBsCurrentDeferredLiabilities

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasBsCurrentDeferredLiabilities() bool`

HasBsCurrentDeferredLiabilities returns a boolean if a field has been set.

### GetBsDeferredPolicyAcquisitionCosts

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsDeferredPolicyAcquisitionCosts() float32`

GetBsDeferredPolicyAcquisitionCosts returns the BsDeferredPolicyAcquisitionCosts field if non-nil, zero value otherwise.

### GetBsDeferredPolicyAcquisitionCostsOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsDeferredPolicyAcquisitionCostsOk() (*float32, bool)`

GetBsDeferredPolicyAcquisitionCostsOk returns a tuple with the BsDeferredPolicyAcquisitionCosts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBsDeferredPolicyAcquisitionCosts

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetBsDeferredPolicyAcquisitionCosts(v float32)`

SetBsDeferredPolicyAcquisitionCosts sets BsDeferredPolicyAcquisitionCosts field to given value.

### HasBsDeferredPolicyAcquisitionCosts

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasBsDeferredPolicyAcquisitionCosts() bool`

HasBsDeferredPolicyAcquisitionCosts returns a boolean if a field has been set.

### GetBsEquityInvestments

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsEquityInvestments() float32`

GetBsEquityInvestments returns the BsEquityInvestments field if non-nil, zero value otherwise.

### GetBsEquityInvestmentsOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsEquityInvestmentsOk() (*float32, bool)`

GetBsEquityInvestmentsOk returns a tuple with the BsEquityInvestments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBsEquityInvestments

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetBsEquityInvestments(v float32)`

SetBsEquityInvestments sets BsEquityInvestments field to given value.

### HasBsEquityInvestments

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasBsEquityInvestments() bool`

HasBsEquityInvestments returns a boolean if a field has been set.

### GetBsFixedMaturityInvestment

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsFixedMaturityInvestment() float32`

GetBsFixedMaturityInvestment returns the BsFixedMaturityInvestment field if non-nil, zero value otherwise.

### GetBsFixedMaturityInvestmentOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsFixedMaturityInvestmentOk() (*float32, bool)`

GetBsFixedMaturityInvestmentOk returns a tuple with the BsFixedMaturityInvestment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBsFixedMaturityInvestment

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetBsFixedMaturityInvestment(v float32)`

SetBsFixedMaturityInvestment sets BsFixedMaturityInvestment field to given value.

### HasBsFixedMaturityInvestment

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasBsFixedMaturityInvestment() bool`

HasBsFixedMaturityInvestment returns a boolean if a field has been set.

### GetBsFuturePolicyBenefits

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsFuturePolicyBenefits() float32`

GetBsFuturePolicyBenefits returns the BsFuturePolicyBenefits field if non-nil, zero value otherwise.

### GetBsFuturePolicyBenefitsOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsFuturePolicyBenefitsOk() (*float32, bool)`

GetBsFuturePolicyBenefitsOk returns a tuple with the BsFuturePolicyBenefits field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBsFuturePolicyBenefits

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetBsFuturePolicyBenefits(v float32)`

SetBsFuturePolicyBenefits sets BsFuturePolicyBenefits field to given value.

### HasBsFuturePolicyBenefits

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasBsFuturePolicyBenefits() bool`

HasBsFuturePolicyBenefits returns a boolean if a field has been set.

### GetBsNetLoan

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsNetLoan() float32`

GetBsNetLoan returns the BsNetLoan field if non-nil, zero value otherwise.

### GetBsNetLoanOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsNetLoanOk() (*float32, bool)`

GetBsNetLoanOk returns a tuple with the BsNetLoan field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBsNetLoan

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetBsNetLoan(v float32)`

SetBsNetLoan sets BsNetLoan field to given value.

### HasBsNetLoan

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasBsNetLoan() bool`

HasBsNetLoan returns a boolean if a field has been set.

### GetBsOtherAssetsInsurance

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsOtherAssetsInsurance() float32`

GetBsOtherAssetsInsurance returns the BsOtherAssetsInsurance field if non-nil, zero value otherwise.

### GetBsOtherAssetsInsuranceOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsOtherAssetsInsuranceOk() (*float32, bool)`

GetBsOtherAssetsInsuranceOk returns a tuple with the BsOtherAssetsInsurance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBsOtherAssetsInsurance

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetBsOtherAssetsInsurance(v float32)`

SetBsOtherAssetsInsurance sets BsOtherAssetsInsurance field to given value.

### HasBsOtherAssetsInsurance

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasBsOtherAssetsInsurance() bool`

HasBsOtherAssetsInsurance returns a boolean if a field has been set.

### GetBsOtherLiabilitiesInsurance

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsOtherLiabilitiesInsurance() float32`

GetBsOtherLiabilitiesInsurance returns the BsOtherLiabilitiesInsurance field if non-nil, zero value otherwise.

### GetBsOtherLiabilitiesInsuranceOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsOtherLiabilitiesInsuranceOk() (*float32, bool)`

GetBsOtherLiabilitiesInsuranceOk returns a tuple with the BsOtherLiabilitiesInsurance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBsOtherLiabilitiesInsurance

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetBsOtherLiabilitiesInsurance(v float32)`

SetBsOtherLiabilitiesInsurance sets BsOtherLiabilitiesInsurance field to given value.

### HasBsOtherLiabilitiesInsurance

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasBsOtherLiabilitiesInsurance() bool`

HasBsOtherLiabilitiesInsurance returns a boolean if a field has been set.

### GetBsPayablesAndAccruedExpenses

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsPayablesAndAccruedExpenses() float32`

GetBsPayablesAndAccruedExpenses returns the BsPayablesAndAccruedExpenses field if non-nil, zero value otherwise.

### GetBsPayablesAndAccruedExpensesOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsPayablesAndAccruedExpensesOk() (*float32, bool)`

GetBsPayablesAndAccruedExpensesOk returns a tuple with the BsPayablesAndAccruedExpenses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBsPayablesAndAccruedExpenses

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetBsPayablesAndAccruedExpenses(v float32)`

SetBsPayablesAndAccruedExpenses sets BsPayablesAndAccruedExpenses field to given value.

### HasBsPayablesAndAccruedExpenses

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasBsPayablesAndAccruedExpenses() bool`

HasBsPayablesAndAccruedExpenses returns a boolean if a field has been set.

### GetBsPolicyholderFunds

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsPolicyholderFunds() float32`

GetBsPolicyholderFunds returns the BsPolicyholderFunds field if non-nil, zero value otherwise.

### GetBsPolicyholderFundsOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsPolicyholderFundsOk() (*float32, bool)`

GetBsPolicyholderFundsOk returns a tuple with the BsPolicyholderFunds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBsPolicyholderFunds

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetBsPolicyholderFunds(v float32)`

SetBsPolicyholderFunds sets BsPolicyholderFunds field to given value.

### HasBsPolicyholderFunds

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasBsPolicyholderFunds() bool`

HasBsPolicyholderFunds returns a boolean if a field has been set.

### GetBsTradingAssets

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsTradingAssets() float32`

GetBsTradingAssets returns the BsTradingAssets field if non-nil, zero value otherwise.

### GetBsTradingAssetsOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsTradingAssetsOk() (*float32, bool)`

GetBsTradingAssetsOk returns a tuple with the BsTradingAssets field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBsTradingAssets

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetBsTradingAssets(v float32)`

SetBsTradingAssets sets BsTradingAssets field to given value.

### HasBsTradingAssets

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasBsTradingAssets() bool`

HasBsTradingAssets returns a boolean if a field has been set.

### GetBsUnearnedPremiums

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsUnearnedPremiums() float32`

GetBsUnearnedPremiums returns the BsUnearnedPremiums field if non-nil, zero value otherwise.

### GetBsUnearnedPremiumsOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsUnearnedPremiumsOk() (*float32, bool)`

GetBsUnearnedPremiumsOk returns a tuple with the BsUnearnedPremiums field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBsUnearnedPremiums

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetBsUnearnedPremiums(v float32)`

SetBsUnearnedPremiums sets BsUnearnedPremiums field to given value.

### HasBsUnearnedPremiums

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasBsUnearnedPremiums() bool`

HasBsUnearnedPremiums returns a boolean if a field has been set.

### GetBsUnpaidLossAndLossReserve

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsUnpaidLossAndLossReserve() float32`

GetBsUnpaidLossAndLossReserve returns the BsUnpaidLossAndLossReserve field if non-nil, zero value otherwise.

### GetBsUnpaidLossAndLossReserveOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetBsUnpaidLossAndLossReserveOk() (*float32, bool)`

GetBsUnpaidLossAndLossReserveOk returns a tuple with the BsUnpaidLossAndLossReserve field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBsUnpaidLossAndLossReserve

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetBsUnpaidLossAndLossReserve(v float32)`

SetBsUnpaidLossAndLossReserve sets BsUnpaidLossAndLossReserve field to given value.

### HasBsUnpaidLossAndLossReserve

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasBsUnpaidLossAndLossReserve() bool`

HasBsUnpaidLossAndLossReserve returns a boolean if a field has been set.

### GetCommonStock

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetCommonStock() float32`

GetCommonStock returns the CommonStock field if non-nil, zero value otherwise.

### GetCommonStockOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetCommonStockOk() (*float32, bool)`

GetCommonStockOk returns a tuple with the CommonStock field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCommonStock

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetCommonStock(v float32)`

SetCommonStock sets CommonStock field to given value.

### HasCommonStock

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasCommonStock() bool`

HasCommonStock returns a boolean if a field has been set.

### GetCurrentDeferredRevenue

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetCurrentDeferredRevenue() float32`

GetCurrentDeferredRevenue returns the CurrentDeferredRevenue field if non-nil, zero value otherwise.

### GetCurrentDeferredRevenueOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetCurrentDeferredRevenueOk() (*float32, bool)`

GetCurrentDeferredRevenueOk returns a tuple with the CurrentDeferredRevenue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrentDeferredRevenue

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetCurrentDeferredRevenue(v float32)`

SetCurrentDeferredRevenue sets CurrentDeferredRevenue field to given value.

### HasCurrentDeferredRevenue

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasCurrentDeferredRevenue() bool`

HasCurrentDeferredRevenue returns a boolean if a field has been set.

### GetCurrentDeferredTaxesLiabilities

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetCurrentDeferredTaxesLiabilities() float32`

GetCurrentDeferredTaxesLiabilities returns the CurrentDeferredTaxesLiabilities field if non-nil, zero value otherwise.

### GetCurrentDeferredTaxesLiabilitiesOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetCurrentDeferredTaxesLiabilitiesOk() (*float32, bool)`

GetCurrentDeferredTaxesLiabilitiesOk returns a tuple with the CurrentDeferredTaxesLiabilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrentDeferredTaxesLiabilities

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetCurrentDeferredTaxesLiabilities(v float32)`

SetCurrentDeferredTaxesLiabilities sets CurrentDeferredTaxesLiabilities field to given value.

### HasCurrentDeferredTaxesLiabilities

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasCurrentDeferredTaxesLiabilities() bool`

HasCurrentDeferredTaxesLiabilities returns a boolean if a field has been set.

### GetDebtToEquity

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetDebtToEquity() float32`

GetDebtToEquity returns the DebtToEquity field if non-nil, zero value otherwise.

### GetDebtToEquityOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetDebtToEquityOk() (*float32, bool)`

GetDebtToEquityOk returns a tuple with the DebtToEquity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDebtToEquity

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetDebtToEquity(v float32)`

SetDebtToEquity sets DebtToEquity field to given value.

### HasDebtToEquity

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasDebtToEquity() bool`

HasDebtToEquity returns a boolean if a field has been set.

### GetEquityToAsset

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetEquityToAsset() float32`

GetEquityToAsset returns the EquityToAsset field if non-nil, zero value otherwise.

### GetEquityToAssetOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetEquityToAssetOk() (*float32, bool)`

GetEquityToAssetOk returns a tuple with the EquityToAsset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEquityToAsset

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetEquityToAsset(v float32)`

SetEquityToAsset sets EquityToAsset field to given value.

### HasEquityToAsset

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasEquityToAsset() bool`

HasEquityToAsset returns a boolean if a field has been set.

### GetGoodWill

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetGoodWill() float32`

GetGoodWill returns the GoodWill field if non-nil, zero value otherwise.

### GetGoodWillOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetGoodWillOk() (*float32, bool)`

GetGoodWillOk returns a tuple with the GoodWill field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGoodWill

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetGoodWill(v float32)`

SetGoodWill sets GoodWill field to given value.

### HasGoodWill

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasGoodWill() bool`

HasGoodWill returns a boolean if a field has been set.

### GetIntangibles

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetIntangibles() float32`

GetIntangibles returns the Intangibles field if non-nil, zero value otherwise.

### GetIntangiblesOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetIntangiblesOk() (*float32, bool)`

GetIntangiblesOk returns a tuple with the Intangibles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntangibles

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetIntangibles(v float32)`

SetIntangibles sets Intangibles field to given value.

### HasIntangibles

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasIntangibles() bool`

HasIntangibles returns a boolean if a field has been set.

### GetLongTermDebtAndCapitalLeaseObligation

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetLongTermDebtAndCapitalLeaseObligation() float32`

GetLongTermDebtAndCapitalLeaseObligation returns the LongTermDebtAndCapitalLeaseObligation field if non-nil, zero value otherwise.

### GetLongTermDebtAndCapitalLeaseObligationOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetLongTermDebtAndCapitalLeaseObligationOk() (*float32, bool)`

GetLongTermDebtAndCapitalLeaseObligationOk returns a tuple with the LongTermDebtAndCapitalLeaseObligation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLongTermDebtAndCapitalLeaseObligation

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetLongTermDebtAndCapitalLeaseObligation(v float32)`

SetLongTermDebtAndCapitalLeaseObligation sets LongTermDebtAndCapitalLeaseObligation field to given value.

### HasLongTermDebtAndCapitalLeaseObligation

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasLongTermDebtAndCapitalLeaseObligation() bool`

HasLongTermDebtAndCapitalLeaseObligation returns a boolean if a field has been set.

### GetMinorityInterest

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetMinorityInterest() float32`

GetMinorityInterest returns the MinorityInterest field if non-nil, zero value otherwise.

### GetMinorityInterestOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetMinorityInterestOk() (*float32, bool)`

GetMinorityInterestOk returns a tuple with the MinorityInterest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinorityInterest

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetMinorityInterest(v float32)`

SetMinorityInterest sets MinorityInterest field to given value.

### HasMinorityInterest

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasMinorityInterest() bool`

HasMinorityInterest returns a boolean if a field has been set.

### GetNetPpe

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetNetPpe() float32`

GetNetPpe returns the NetPpe field if non-nil, zero value otherwise.

### GetNetPpeOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetNetPpeOk() (*float32, bool)`

GetNetPpeOk returns a tuple with the NetPpe field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetPpe

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetNetPpe(v float32)`

SetNetPpe sets NetPpe field to given value.

### HasNetPpe

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasNetPpe() bool`

HasNetPpe returns a boolean if a field has been set.

### GetNonCurrentDeferredIncomeTax

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetNonCurrentDeferredIncomeTax() float32`

GetNonCurrentDeferredIncomeTax returns the NonCurrentDeferredIncomeTax field if non-nil, zero value otherwise.

### GetNonCurrentDeferredIncomeTaxOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetNonCurrentDeferredIncomeTaxOk() (*float32, bool)`

GetNonCurrentDeferredIncomeTaxOk returns a tuple with the NonCurrentDeferredIncomeTax field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNonCurrentDeferredIncomeTax

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetNonCurrentDeferredIncomeTax(v float32)`

SetNonCurrentDeferredIncomeTax sets NonCurrentDeferredIncomeTax field to given value.

### HasNonCurrentDeferredIncomeTax

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasNonCurrentDeferredIncomeTax() bool`

HasNonCurrentDeferredIncomeTax returns a boolean if a field has been set.

### GetNonCurrentDeferredLiabilities

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetNonCurrentDeferredLiabilities() float32`

GetNonCurrentDeferredLiabilities returns the NonCurrentDeferredLiabilities field if non-nil, zero value otherwise.

### GetNonCurrentDeferredLiabilitiesOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetNonCurrentDeferredLiabilitiesOk() (*float32, bool)`

GetNonCurrentDeferredLiabilitiesOk returns a tuple with the NonCurrentDeferredLiabilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNonCurrentDeferredLiabilities

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetNonCurrentDeferredLiabilities(v float32)`

SetNonCurrentDeferredLiabilities sets NonCurrentDeferredLiabilities field to given value.

### HasNonCurrentDeferredLiabilities

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasNonCurrentDeferredLiabilities() bool`

HasNonCurrentDeferredLiabilities returns a boolean if a field has been set.

### GetNotesReceivable

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetNotesReceivable() float32`

GetNotesReceivable returns the NotesReceivable field if non-nil, zero value otherwise.

### GetNotesReceivableOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetNotesReceivableOk() (*float32, bool)`

GetNotesReceivableOk returns a tuple with the NotesReceivable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotesReceivable

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetNotesReceivable(v float32)`

SetNotesReceivable sets NotesReceivable field to given value.

### HasNotesReceivable

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasNotesReceivable() bool`

HasNotesReceivable returns a boolean if a field has been set.

### GetOtherCurrentReceivables

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetOtherCurrentReceivables() float32`

GetOtherCurrentReceivables returns the OtherCurrentReceivables field if non-nil, zero value otherwise.

### GetOtherCurrentReceivablesOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetOtherCurrentReceivablesOk() (*float32, bool)`

GetOtherCurrentReceivablesOk returns a tuple with the OtherCurrentReceivables field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherCurrentReceivables

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetOtherCurrentReceivables(v float32)`

SetOtherCurrentReceivables sets OtherCurrentReceivables field to given value.

### HasOtherCurrentReceivables

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasOtherCurrentReceivables() bool`

HasOtherCurrentReceivables returns a boolean if a field has been set.

### GetOtherEquity

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetOtherEquity() float32`

GetOtherEquity returns the OtherEquity field if non-nil, zero value otherwise.

### GetOtherEquityOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetOtherEquityOk() (*float32, bool)`

GetOtherEquityOk returns a tuple with the OtherEquity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherEquity

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetOtherEquity(v float32)`

SetOtherEquity sets OtherEquity field to given value.

### HasOtherEquity

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasOtherEquity() bool`

HasOtherEquity returns a boolean if a field has been set.

### GetPreferredStock

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetPreferredStock() float32`

GetPreferredStock returns the PreferredStock field if non-nil, zero value otherwise.

### GetPreferredStockOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetPreferredStockOk() (*float32, bool)`

GetPreferredStockOk returns a tuple with the PreferredStock field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferredStock

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetPreferredStock(v float32)`

SetPreferredStock sets PreferredStock field to given value.

### HasPreferredStock

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasPreferredStock() bool`

HasPreferredStock returns a boolean if a field has been set.

### GetRetainedEarnings

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetRetainedEarnings() float32`

GetRetainedEarnings returns the RetainedEarnings field if non-nil, zero value otherwise.

### GetRetainedEarningsOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetRetainedEarningsOk() (*float32, bool)`

GetRetainedEarningsOk returns a tuple with the RetainedEarnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRetainedEarnings

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetRetainedEarnings(v float32)`

SetRetainedEarnings sets RetainedEarnings field to given value.

### HasRetainedEarnings

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasRetainedEarnings() bool`

HasRetainedEarnings returns a boolean if a field has been set.

### GetShortTermDebtAndCapitalLeaseObligation

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetShortTermDebtAndCapitalLeaseObligation() float32`

GetShortTermDebtAndCapitalLeaseObligation returns the ShortTermDebtAndCapitalLeaseObligation field if non-nil, zero value otherwise.

### GetShortTermDebtAndCapitalLeaseObligationOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetShortTermDebtAndCapitalLeaseObligationOk() (*float32, bool)`

GetShortTermDebtAndCapitalLeaseObligationOk returns a tuple with the ShortTermDebtAndCapitalLeaseObligation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortTermDebtAndCapitalLeaseObligation

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetShortTermDebtAndCapitalLeaseObligation(v float32)`

SetShortTermDebtAndCapitalLeaseObligation sets ShortTermDebtAndCapitalLeaseObligation field to given value.

### HasShortTermDebtAndCapitalLeaseObligation

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasShortTermDebtAndCapitalLeaseObligation() bool`

HasShortTermDebtAndCapitalLeaseObligation returns a boolean if a field has been set.

### GetTotalAssets

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetTotalAssets() float32`

GetTotalAssets returns the TotalAssets field if non-nil, zero value otherwise.

### GetTotalAssetsOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetTotalAssetsOk() (*float32, bool)`

GetTotalAssetsOk returns a tuple with the TotalAssets field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalAssets

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetTotalAssets(v float32)`

SetTotalAssets sets TotalAssets field to given value.

### HasTotalAssets

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasTotalAssets() bool`

HasTotalAssets returns a boolean if a field has been set.

### GetTotalEquity

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetTotalEquity() float32`

GetTotalEquity returns the TotalEquity field if non-nil, zero value otherwise.

### GetTotalEquityOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetTotalEquityOk() (*float32, bool)`

GetTotalEquityOk returns a tuple with the TotalEquity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalEquity

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetTotalEquity(v float32)`

SetTotalEquity sets TotalEquity field to given value.

### HasTotalEquity

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasTotalEquity() bool`

HasTotalEquity returns a boolean if a field has been set.

### GetTotalLiabilities

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetTotalLiabilities() float32`

GetTotalLiabilities returns the TotalLiabilities field if non-nil, zero value otherwise.

### GetTotalLiabilitiesOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetTotalLiabilitiesOk() (*float32, bool)`

GetTotalLiabilitiesOk returns a tuple with the TotalLiabilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalLiabilities

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetTotalLiabilities(v float32)`

SetTotalLiabilities sets TotalLiabilities field to given value.

### HasTotalLiabilities

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasTotalLiabilities() bool`

HasTotalLiabilities returns a boolean if a field has been set.

### GetTotalReceivables

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetTotalReceivables() float32`

GetTotalReceivables returns the TotalReceivables field if non-nil, zero value otherwise.

### GetTotalReceivablesOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetTotalReceivablesOk() (*float32, bool)`

GetTotalReceivablesOk returns a tuple with the TotalReceivables field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalReceivables

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetTotalReceivables(v float32)`

SetTotalReceivables sets TotalReceivables field to given value.

### HasTotalReceivables

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasTotalReceivables() bool`

HasTotalReceivables returns a boolean if a field has been set.

### GetTotalStockholdersEquity

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetTotalStockholdersEquity() float32`

GetTotalStockholdersEquity returns the TotalStockholdersEquity field if non-nil, zero value otherwise.

### GetTotalStockholdersEquityOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetTotalStockholdersEquityOk() (*float32, bool)`

GetTotalStockholdersEquityOk returns a tuple with the TotalStockholdersEquity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalStockholdersEquity

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetTotalStockholdersEquity(v float32)`

SetTotalStockholdersEquity sets TotalStockholdersEquity field to given value.

### HasTotalStockholdersEquity

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasTotalStockholdersEquity() bool`

HasTotalStockholdersEquity returns a boolean if a field has been set.

### GetTreasuryStock

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetTreasuryStock() float32`

GetTreasuryStock returns the TreasuryStock field if non-nil, zero value otherwise.

### GetTreasuryStockOk

`func (o *FundamentalsIREITNODIRECTBalanceSheet) GetTreasuryStockOk() (*float32, bool)`

GetTreasuryStockOk returns a tuple with the TreasuryStock field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTreasuryStock

`func (o *FundamentalsIREITNODIRECTBalanceSheet) SetTreasuryStock(v float32)`

SetTreasuryStock sets TreasuryStock field to given value.

### HasTreasuryStock

`func (o *FundamentalsIREITNODIRECTBalanceSheet) HasTreasuryStock() bool`

HasTreasuryStock returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


