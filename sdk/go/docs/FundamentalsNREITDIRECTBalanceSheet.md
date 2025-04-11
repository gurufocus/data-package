# FundamentalsNREITDIRECTBalanceSheet

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccountsPayable** | Pointer to **float32** | &lt;p&gt;{{Accts_Payable}} usually includes {{AccountsPayable}}, accrued compensation and related benefits, etc. {{AccountsPayable}} is money owed by a business to its suppliers shown as a liability on a company&#39;s balance sheet. It is distinct from notes payable liabilities, which are debts created by formal legal instrument documents. It is part of the current portion of the liabilities (due within one year or within the normal operating cycle if longer) reflected on the balace sheet of the company. A higher {{AccountsPayable}} means lower Working Capital needed to operate the business.&lt;/p&gt; | [optional] 
**AccountsPayableAccruedExpense** | Pointer to **float32** | &lt;p&gt;{{Accts_Payable}} usually includes {{AccountsPayable}}, accrued compensation and related benefits, etc. It is money owed by a business to its suppliers shown as a liability on a company&#39;s balance sheet. It is distinct from notes payable liabilities, which are debts created by formal legal instrument documents. It is part of the current portion of the liabilities (due within one year or within the normal operating cycle if longer) reflected on the balace sheet of the company. A higher {{AccountsPayable}} means lower Working Capital needed to operate the business.&lt;/p&gt; | [optional] 
**AccountsReceivable** | Pointer to **float32** | &lt;p&gt;{{Accts_Rec}} is money owed to a business by customers and shown on its Balance Sheet as an asset. {{Accts_Rec}} are created when a customer has received a product but has not yet paid for that product. It is related to {{DaysSalesOutstanding}}, which measures of the average number of days that a company takes to collect revenue after a sale has been made. It is a financial ratio that illustrates how well a company&#39;s accounts receivables are being managed. &lt;br&gt;{{DaysSalesOutstanding}} &#x3D; {{Accts_Rec}} / {{Revenue}} * Days in Period&lt;/p&gt; | [optional] 
**AccumulatedDepreciation** | Pointer to **float32** | &lt;p&gt;The {{AccumulatedDepreciation}} of an asset up to a single point in its life. Regardless of the method used to calculate it, the depreciation of an asset during a single period is added to the previous period&#39;s {{AccumulatedDepreciation}} to get the current {{AccumulatedDepreciation}}.&lt;/p&gt; | [optional] 
**AccumulatedOtherComprehensiveIncome** | Pointer to **float32** | &lt;p&gt;{{accumulated_other_comprehensive_income}} is the aggregate amount of gains or losses that are not part of retained earnings.&lt;/p&gt; | [optional] 
**AdditionalPaidInCapital** | Pointer to **float32** | &lt;p&gt;{{AdditionalPaidInCapital}} is the capital that a company raises in a financing round in excess of the capital&#39;s par value. The account represents the excess paid by an investor over the par-value price of a stock issue. {{AdditionalPaidInCapital}} can arise from issuing either preferred or common stock. &lt;br&gt;{{AdditionalPaidInCapital}} is calculated as: {{AdditionalPaidInCapital}} &#x3D; (Issue Price - Par Value) * {{Shares_Outstanding}}&lt;/p&gt; | [optional] 
**BsCurrentDeferredLiabilities** | Pointer to **float32** | &lt;p&gt;{{BS_CurrentDeferredLiabilities}} represents the current portion of obligations, which is a liability that usually would have been paid but is now pas due.&lt;/p&gt; | [optional] 
**BuildingsAndImprovements** | Pointer to **float32** | &lt;p&gt;{{BuildingsAndImprovements}} are capital events that materially extend the useful life of a building or increase the value of a building, or both. A building improvement should be capitalized as betterment and recorded as an addition of value to the existing building if the expenditure for the improvement meets or exceeds the capitalization threshold, or the expenditure increases the life or value of the building by 25 percent of the original life period or cost.&lt;/p&gt; | [optional] 
**CashAndCashEquivalents** | Pointer to **float32** | &lt;p&gt;{{CashAndCashEquivalents}} are the most liquid assets on the balance sheet. Cash equivalents are assets that are readily convertible into cash, such as money market holdings, short-term government bonds or Treasury bills, marketable securities and commercial paper. &lt;br&gt;A high number means either: 1) The company has competitive advantage generating lots of cash 2) Just sold a business or bonds (not necessarily good) &lt;br&gt;A low stockpile of cash usually means poor to mediocre economics.&lt;/p&gt; | [optional] 
**CashEquivalentsMarketableSecurities** | Pointer to **float32** | &lt;p&gt;{{Cash_and_Equiv}} are the most liquid assets on the balance sheet. Cash equivalents are assets that are readily convertible into cash, such as money market holdings, short-term government bonds or Treasury bills, marketable securities and commercial paper. Marketable Securities are very liquid securities that can be converted into cash quickly at a reasonable price.&lt;/p&gt; | [optional] 
**CommonStock** | Pointer to **float32** | &lt;p&gt;{{CommonStock}} is listed on  the Balance Sheet at the par value of the total shares outstanding of a company. The par value of {{CommonStock}} is meaningless. It is usually set at an absurdly low number.&lt;/p&gt; | [optional] 
**ConstructionInProgress** | Pointer to **float32** | &lt;p&gt;It records the cost of construction work, which is not yet completed (typically, applied to capital budget items). A {{ConstructionInProgress}} item is not depreciated until the asset is placed in service. Normally, upon completion, a construction in progress item is reclassified, and the reclassified asset is capitalized and depreciated.&lt;/p&gt; | [optional] 
**CurrentAccruedExpenses** | Pointer to **float32** | &lt;p&gt;{{CurrentAccruedExpenses}} is the expense incurred during the accounting period, but not required to be paid until a later date. It includes compensation, interest, pensions and all other miscellaneous accruals reported by the company.&lt;/p&gt; | [optional] 
**CurrentDeferredRevenue** | Pointer to **float32** | &lt;p&gt;{{CurrentDeferredRevenue}} represents collections of cash or other assets related to revenue producing activity for which revenue has not yet been recognized. Generally, an entity records deferred revenue when it receives consideration from a customer before achieving certain criteria that must be met for revenue to be recognized in conformity with GAAP. It can be either current or non-current item. Also called unearned revenue.&lt;/p&gt; | [optional] 
**CurrentDeferredTaxesLiabilities** | Pointer to **float32** | &lt;p&gt;{{CurrentDeferredTaxesLiabilities}} means a future tax liability, resulting from temporary differences between book (accounting) value of assets and liabilities and their tax value, or timing differences between the recognition of gains and losses in financial statements and their recognition in a tax computation. Deferred tax liabilities generally arise where tax relief is provided in advance of an accounting expense, or income is accrued but not taxed until received.&lt;/p&gt; | [optional] 
**DebtToEquity** | Pointer to **float32** | The Debt/Equity (D/E) Ratio is calculated by dividing a company’s total liabilities by its shareholder equity. The ratio is used to evaluate a company&#39;s financial leverage. | [optional] 
**EquityToAsset** | Pointer to **float32** | Equity to Asset ratio is calculated as shareholder&#39;s tangible equity divided by its total asset. | [optional] 
**FinishedGoods** | Pointer to **float32** | &lt;p&gt;{{FinishedGoods}} are the products in a manufacturer&#39;s inventory that are completed and are waiting to be sold.&lt;/p&gt; | [optional] 
**GoodWill** | Pointer to **float32** | &lt;p&gt;A {{Goodwill}} is an {{Intangibles}} that arises as a result of the acquisition of one company by another for a premium value. The value of a company&#39;s brand name, solid customer base, good customer relations, good employee relations and any patents or proprietary technology represent {{Goodwill}}. {{Goodwill}} is considered an {{Intangibles}} because it is not a physical asset like buildings or equipment. The {{Goodwill}} account can be found in the assets portion of a company&#39;s balance sheet.&lt;/p&gt; | [optional] 
**GrossPpe** | Pointer to **float32** | &lt;p&gt;Property, Plant and Equipment (PPE) are the fixed assets of the companyFixed assets are also known as non-current assets. Property, Plant and Equipment includes assets that will - in the normal course of business - neither be used up in the next year nor will become a part of any product sold to customers. Some of the most common parts of Property, Plant and Equipment are: Land, Buildings (and leasehold improvements), Transportation equipment, Manufacturing equipment, Office equipment, Office furniture. Companies with lots of Property, Plant and Equipment often have special categories. For example, railroad property includes: Track, Ties, Ballast, Bridges, Tunnels, Signals, Locomotives, Freight Cars. There is often a note in the financial statements - found in a company&#39;s 10-K - that will explain the different categories of property a company owns. &lt;br&gt;The market value of Property, Plant and Equipment can differ tremendously from the book value of Property, Plant and Equipment. For example, when Berkshire Hathaway liquidated its textile mills, it had to pay the buyers of the company&#39;s manufacturing equipment to haul the equipment  away. That property, plant, and equipment was literally worth less than zero. On the other hand, some companies own thousands of acres of land. All Property, Plant and Equipment other than land is depreciated. Land is never depreciated. However, land is not marked up to market value either. Under Generally Accepted Accounting Principles (GAAP), land is shown on the balance sheet at cost. &lt;br&gt;The Property, Plant and Equipment line shown on the balance sheet is {{GrossPPE}}. This means it is the cost of the property, plant, and equipment not less accumulated depreciation.&lt;/p&gt; | [optional] 
**Intangibles** | Pointer to **float32** | &lt;p&gt;{{Intangibles}} are defined as identifiable non-monetary assets that cannot be seen, touched or physically measured.  Examples of {{Intangibles}} include trade secrets, copyrights, patents, trademarks. If a company acquires assets at the prices above the book value, it may carry {{Goodwill}} on its balance sheet. {{Goodwill}} reflects the difference between the price the company paid and the book value of the assets. If a company (company A) received a patent through their own work, though it has value, it does not show up on its balance sheet as an intangible asset. However, if company A sells this patent to company B, it will show up on company B&#39;s balance sheet as an {{Intangibles}}. The same applies to brand names, trade secrets etc. For instance, Coca-Cola&#39;s brand is extremely valuable, but the brand does not appear on its balance sheet, because the brand was never acquired.&lt;/p&gt; | [optional] 
**InventoriesAdjustmentsAllowances** | Pointer to **float32** | &lt;p&gt;{{InventoriesAdjustmentsAllowances}} represents certain charges made in the current period in inventory resulting from breakage, spoilage, employee theft and shoplifting, etc.&lt;/p&gt; | [optional] 
**Inventory** | Pointer to **float32** | &lt;p&gt;{{Inventory}} includes the raw materials, work-in-process goods and completely finished goods of a company. It is a portion of a company™s current assets.&lt;/p&gt; | [optional] 
**InvestmentsAndAdvances** | Pointer to **float32** | &lt;p&gt;{{InvestmentsAndAdvances}} includes all the non-current investments in affiliates, real estate, securities, etc.&lt;/p&gt; | [optional] 
**LandAndImprovements** | Pointer to **float32** | &lt;p&gt;Land is the surface or crust of the earth, which can be used to support structures, and may be used to grow crops, grass, shrubs, and trees. Land is characterized as having an unlimited life (indefinite). {{LandAndImprovements}} is a long-term asset which indicates the cost of the constructed improvements to land, such as driveways, walkways, lighting, and parking lots.&lt;/p&gt; | [optional] 
**LoansReceivable** | Pointer to **float32** |  | [optional] 
**LongTermCapitalLeaseObligation** | Pointer to **float32** | &lt;p&gt;{{LongTermCapitalLeaseObligation}} are the amount due for long-term asset lease agreements that are nearly equivalent to asset purchases. Capital lease obligations are installment payments that constitute a payment of principal plus interest for the capital lease. The {{ShortTermCapitalLeaseObligation}} is the portion of a {{LongTermCapitalLeaseObligation}} that is due over the next year.&lt;/p&gt; | [optional] 
**LongTermDebt** | Pointer to **float32** | &lt;p&gt;{{LongTermDebt}} is the sum of the carrying values as of the balance sheet date of all long-term debt, which is debt initially having maturities due after one year or beyond the operating cycle, if longer, but excluding the portions thereof scheduled to be repaid within one year or the normal operating cycle, if longer.&lt;/p&gt; | [optional] 
**LongTermDebtAndCapitalLeaseObligation** | Pointer to **float32** | &lt;p&gt;{{LongTermDebt}} is the debt due more than 12 months in the future. The debt can be owed to banks or bondholders. Some companies issue bonds to investors and pay interest on the bonds. &lt;br&gt;{{LongTermCapitalLeaseObligation}} represents the total liability for long-term leases lasting over one year. It&#39;s amount equal to the present value (the principal) at the beginning of the lease term less lease payments during the lease term. &lt;br&gt;{{Long-Term_Debt}} can be used to calculate {{ltd2asset}}: {{ltd2asset}} &#x3D; {{Long-Term_Debt}} / {{Total_Assets}}&lt;/p&gt; | [optional] 
**MachineryFurnitureEquipment** | Pointer to **float32** | &lt;p&gt;{{MachineryFurnitureEquipment}} represents those fixed assets specifically dealing with tools, equipment and office furniture.&lt;/p&gt; | [optional] 
**MarkeTableSecurities** | Pointer to **float32** | &lt;p&gt;{{MarketableSecurities}} are very liquid securities that can be converted into cash quickly at a reasonable price.&lt;/p&gt; | [optional] 
**MinorityInterest** | Pointer to **float32** | &lt;p&gt;{{Minority_interest}} is the carrying amount of the equity interests owned by non-controlling shareholders, partners, or other equity holders in one or more of the entities included in the reporting entity&#39;s consolidated financial statements.&lt;/p&gt; | [optional] 
**NetPpe** | Pointer to **float32** | &lt;p&gt;{{Net_PPE}} (PPE) are the fixed assets of the companyFixed assets are also known as non-current assets. {{Net_PPE}} includes assets that will - in the normal course of business - neither be used up in the next year nor will become a part of any product sold to customers. Some of the most common parts of property, plant, and equipment are: Land, Buildings (and leasehold improvements), Transportation equipment, Manufacturing equipment, Office equipment, Office furniture. Companies with lots of property, plant, and equipment often have special categories. For example, railroad property includes: Track, Ties, Ballast, Bridges, Tunnels, Signals, Locomotives, Freight Cars. There is often a note in the financial statements - found in a company&#39;s 10-K - that will explain the different categories of property a company owns. &lt;br&gt;The market value of {{Net_PPE}} can differ tremendously from the book value of {{Net_PPE}}. For example, when Berkshire Hathaway liquidated its textile mills, it had to pay the buyers of the company&#39;s manufacturing equipment to haul the equipment  away. That {{Net_PPE}} was literally worth less than zero. On the other hand, some companies own thousands of acres of land. All {{Net_PPE}} other than land is depreciated. Land is never depreciated. However, land is not marked up to market value either. Under Generally Accepted Accounting Principles (GAAP), land is shown on the balance sheet at cost. &lt;br&gt;The {{Net_PPE}} line shown on the balance sheet is usually net {{Net_PPE}}. This means it is the cost of the {{Net_PPE}} less accumulated depreciation.&lt;/p&gt; | [optional] 
**NonCurrentDeferredIncomeTax** | Pointer to **float32** | The NonCurrent Deferred Income Tax represents the non-current portion of deferred income taxes, which is the difference in income recognition between tax laws and the accounting methods. | [optional] 
**NonCurrentDeferredLiabilities** | Pointer to **float32** | &lt;p&gt;{{NonCurrentDeferredLiabilities}} represents the non-current portion of obligations, which is a liability that usually would have been paid but is now pas due.&lt;/p&gt; | [optional] 
**NotesReceivable** | Pointer to **float32** | &lt;p&gt;{{NotesReceivable}} is an unconditional promise to receive a definite sum of money at a future date(s) within one year of the balance sheet date or the normal operating cycle, whichever is longer.&lt;/p&gt; | [optional] 
**OtherCurrentAssets** | Pointer to **float32** | &lt;p&gt;Technically, {{Other_Current_Assets}} line may include any asset that will be used up within the next 12 months. However, {{Other_Current_Assets}} never include assets that are listed elsewhere in the current assets section of the balance sheet. For this reason, {{Other_Current_Assets}} are almost never: Cash, Trade Receivables, {{Inventory}}. The assets grouped under {{Other_Current_Assets}} are most commonly: Prepaid Expenses, Tax Assets, Non-Trade Receivables, Other (too numerous to list). Some companies can and do choose to report each of these items separately. {{Other_Current_Assets}} may be made up largely of Prepaid Expenses - unless these are listed on a separate line of the balance sheet. &lt;br&gt;There are a variety of {{Other_Current_Assets}} like non-trade receivables which are simply too numerous to list. If a company is following correct reporting procedures, it should not lump items that are different from one another and yet individually important to the company together under the line {{Other_Current_Assets}}. &lt;br&gt;At most companies, {{Other_Current_Assets}} are a small and unimportant part of the total balance sheet.&lt;/p&gt; | [optional] 
**OtherCurrentLiabilities** | Pointer to **float32** | &lt;p&gt;The liability a company needs to pay in the next 12 months, but not assigned to {{AccountsPayable}} or Debt. For instance, Wal-Mart (WMT) has accrued wages, salaries, valuation, bonuses, insurance liabilities, accrued tax etc. These are all included in {{Other_Current_Liab}}.&lt;/p&gt; | [optional] 
**OtherCurrentPayables** | Pointer to **float32** | &lt;p&gt;{{OtherCurrentPayables}} is the payables owed and expected to be paid within one year or one operating cycle that not otherwise classified. It includes dividends payable and all other current payables.&lt;/p&gt; | [optional] 
**OtherCurrentReceivables** | Pointer to **float32** | &lt;p&gt;{{OtherCurrentReceivables}} is other current receivables of that not otherwise classified. GuruFocus uses a standardized financial statement format for all companies. GuruFocus lists {{Accts_Rec}}, {{NotesReceivable}}, {{LoansReceivable}} and {{OtherCurrentReceivables}} under the \&quot;{{TotalReceivables}}\&quot; section.&lt;/p&gt; | [optional] 
**OtherEquity** | Pointer to **float32** | &lt;p&gt;{{OtherEquity}} is instruments issued by the company that cannot be identified by other specific items in the Equity section. GuruFocus lists following items in \&quot;{{Total_Equity}}\&quot; section: {{CommonStock}}, {{Preferred_Stock}}, {{Retained_Earnings}}, {{accumulated_other_comprehensive_income}}, {{AdditionalPaidInCapital}}, {{Treasury_Stock}}, {{OtherEquity}}.&lt;/p&gt; | [optional] 
**OtherGrossPpe** | Pointer to **float32** | &lt;p&gt;{{OtherGrossPPE}} is property, plant and equipment recorded on a company&#39;s balance sheet that not otherwise classified. GuruFocus lists {{LandAndImprovements}}, {{BuildingsAndImprovements}}, {{MachineryFurnitureEquipment}}, {{ConstructionInProgress}} and {{OtherGrossPPE}} under the \&quot;{{GrossPPE}}\&quot; section.&lt;/p&gt; | [optional] 
**OtherInventories** | Pointer to **float32** | &lt;p&gt;Other inventories including goods for resale, stocks in transit, consignment stocks, etc.&lt;/p&gt; | [optional] 
**OtherLongTermAssets** | Pointer to **float32** | &lt;p&gt;GuruFocus lists {{InvestmentsAndAdvances}}, {{Intangibles}}, {{Net_PPE}} and {{Other_Long-Term_Assets}} under the \&quot;{{TotalNonCurrentAssets}}\&quot; section. &lt;br&gt;{{Other_Long-Term_Assets}} includes following items: Investment in Properties, Non-current Accounts Receivable, Non-current Note Receivables, Non-current Deferred Assets, Non-current Prepaid Assets, Defined Pension Benefit, Other (too numerous to list). Some companies can do choose to report each of these items separately. Yet, there are a variety of {{Other_Long-Term_Assets}} which are simply too numerous to list.&lt;/p&gt; | [optional] 
**OtherLongTermLiabilities** | Pointer to **float32** | &lt;p&gt;{{Other_Long-Term_Liab}} are the other liabilities on the balance sheet that do not need to be repaid within the next 12 months, but still need to be repaid over time.&lt;/p&gt; | [optional] 
**PensionAndRetirementBenefit** | Pointer to **float32** | The total about of pension and retirement benefits | [optional] 
**PreferredStock** | Pointer to **float32** | &lt;p&gt;{{Preferred_Stock}} is a special equity security that has properties of both equity and debt. It is generally considered a hybrid instrument. {{Preferred_Stock}} is senior to {{CommonStock}}, but is subordinate to bonds in terms of claim or rights to their share of the assets of the company. {{Preferred_Stock}} has priority over {{CommonStock}} in the payment of dividends and any payments received when a company liquidates. &lt;br&gt;{{Preferred_Stock}} comes in many forms. It can be: Convertible or Non-Convertible, Cumulative or Non-Cumulative, Voting or Non-Voting, Callable or Non-Callable, Maturity Date or No Maturity Date. &lt;br&gt;A {{Preferred_Stock}} without a maturity date is called a perpetual preferred stock. These are relatively rare. A good example of perpetual {{Preferred_Stock}} is the many series of Public Storage (PSA) preferred shares that trade on the New York Stock Exchange. &lt;br&gt;Before investing in preferred stock, it is important to know which of the above groups the stock belongs to. Is it convertible or non-convertible? Are dividends cumulative or non-cumulative? It is also critical that an investor knows what bonds the company has in front of the {{Preferred_Stock}}. Bondholders get paid first. So the decision to buy a {{Preferred_Stock}} can be similar to the decision to buy a bond. But, remember, the {{Preferred_Stock}} of a company with bonds is junior to those bonds.  &lt;br&gt;Unless a {{Preferred_Stock}} is convertible, the upside in a preferred stock investment is more limited than in a {{CommonStock}} investment. If a company doubles its earnings, it is usually under no more obligation to double the dividends paid to preferred shareholders than it is to double the interest paid to its bankers and bondholders.So {{Preferred_Stock}} is very different from {{CommonStock}}.&lt;/p&gt; | [optional] 
**RawMaterials** | Pointer to **float32** | &lt;p&gt;{{RawMaterials}} are materials and components scheduled for use in making a product.&lt;/p&gt; | [optional] 
**RetainedEarnings** | Pointer to **float32** | &lt;p&gt;{{Retained_Earnings}} is the accumulated portion of {{Net_Income}} that is not distributed to shareholders. Because the {{Net_Income}} was not distributed to shareholders, shareholders&#39; equity is increased by the same amount. Of course, if a company loses, it is called retained losses, or accumulated losses. Historically profitable companies sometimes have negative {{Retained_Earnings}}. This is because they have cumulatively paid out more to shareholders than they reported in profits. If a company has negative {{Retained_Earnings}}, investors should check the 10-year financial results. They should not assume that negative {{Retained_Earnings}} prove a company has generally lost money in the past. Of course, many companies with negative {{Retained_Earnings}} have indeed lost money in the past.&lt;/p&gt; | [optional] 
**ShortTermCapitalLeaseObligation** | Pointer to **float32** |  | [optional] 
**ShortTermDebt** | Pointer to **float32** |  | [optional] 
**ShortTermDebtAndCapitalLeaseObligation** | Pointer to **float32** | &lt;p&gt;{{Short-Term_Debt}} is the portion of a company&#39;s debt and capital lease obligation that need to be paid within the next 12 months. It equals {{ShortTermDebt_without_lease}} plus {{ShortTermCapitalLeaseObligation}}. This gives investors an idea of how much money the company needs to pay down for the principle of its debt.&lt;/p&gt; | [optional] 
**TotalAssets** | Pointer to **float32** | &lt;p&gt;{{Total_Assets}} are all the assets a company owns. From the capital sources of the assets, some of the assets are funded through shareholder&#39;s paid in capital and {{Retained_Earnings}} of the business. Others are funded through borrowed money. &lt;br&gt;Therefore, total assets can be calculated as: {{Total_Assets}} &#x3D; {{Total_Current_Assets}} + {{TotalNonCurrentAssets}} &#x3D; Total Shareholder&#39;s Equity + {{Total_Liabilities}} &lt;br&gt;Total Assets is connected with Return on Assets by {{ROA}} &#x3D; {{Net_Income}} / {{Total_Assets}} &lt;br&gt; Total Assets is linked to {{Revenue}} through {{turnover}}: {{turnover}}  &#x3D; {{Revenue}} / {{Total_Assets}} &lt;br&gt;Therefore, if a company grows its {{Total_Assets}} faster than its {{Revenue}}, the {{turnover}} will decline. This might be a warning sign for the business.&lt;/p&gt; | [optional] 
**TotalCurrentAssets** | Pointer to **float32** | &lt;p&gt;{{Total_Current_Assets}} are the asset that can be converted to cash or used to pay current liabilities within 12 months. &lt;br&gt;{{Total_Current_Assets}} &#x3D; {{CashAndCashEquivalents}} + {{Accts_Rec}} + {{Inventory}} + {{Other_Current_Assets}} &lt;br&gt;{{Total_Current_Assets}} is linked to the {{current_ratio}}, which is calculated as {{Total_Current_Assets}} &#x3D; {{Total_Current_Assets}} / {{Total_Current_Liabilities}} &lt;br&gt;It is frequently used as an indicator of a company\\&#39;s liquidity, its ability to meet short-term obligations. &lt;br&gt;{{Total_Current_Assets}} is also linked to {{NCAV}}, {{NCAV}} &#x3D; {{Total_Current_Assets}} - {{Total_Current_Liabilities}}.&lt;/p&gt; | [optional] 
**TotalCurrentLiabilities** | Pointer to **float32** | &lt;p&gt;{{Total_Current_Liabilities}} is the total amount of liabilities that the company needs to pay over the next 12 months. &lt;br&gt;{{Total_Current_Liabilities}} &#x3D; {{AccountsPayable}} + Current Portion of {{LongTermDebt}} + {{Other_Current_Liab}} &lt;br&gt;The increase of {{Total_Current_Liabilities}} of a company is not necessarily a bad thing. This may conserve the company&#39;s cash and contribute positively to cash flow. {{Total_Current_Liabilities}} is linked to {{Total_Current_Assets}} through {{NCAV}} and {{current_ratio}}. The {{current_ratio}} is equal to dividing {{Total_Current_Assets}} by {{Total_Current_Liabilities}}. It is frequently used as an indicator of a company&#39;s liquidity, its ability to meet short-term obligations. &lt;br&gt;{{Total_Current_Liabilities}} is also linked to {{NCAV}}, {{NCAV}} is calculated as {{Total_Current_Assets}} minus {{Total_Current_Liabilities}}.&lt;/p&gt; | [optional] 
**TotalEquity** | Pointer to **float32** | &lt;p&gt;{{TotalEquityGrossMinorityInterest}} is residual interest, including minority interest, that remains in the assets of the enterprise after deducting its liabilities. Equity is increased by owners’ investments and by comprehensive income, and it is reduced by distributions to the owners.&lt;/p&gt; | [optional] 
**TotalLiabilities** | Pointer to **float32** | &lt;p&gt;{{Total_Liabilities}} &#x3D; {{Total_Current_Liabilities}} + {{TotalNonCurrentLiabilitiesNetMinorityInterest}} &#x3D; {{Total_Current_Liabilities}} + {{Long-Term_Debt}} + {{ther_Long-Term_Liab}} &lt;br&gt;{{Total_Liabilities}} &#x3D; {{Total_Assets}} - {{TotalEquityGrossMinorityInterest}} &lt;br&gt;{{Total_Liabilities}} are the liabilities that the company has to pay others. It is a part of the balance sheet of a company that shareholders do not own, and would be obligated to pay back if the company liquidated.&lt;/p&gt; | [optional] 
**TotalNonCurrentAssets** | Pointer to **float32** |  | [optional] 
**TotalNonCurrentLiabilitiesNetMinorityInterest** | Pointer to **float32** |  | [optional] 
**TotalReceivables** | Pointer to **float32** | &lt;p&gt;{{TotalReceivables}} is the sum of all receivables owed by customers and affiliates within one year, including {{Accts_Rec}}, {{NotesReceivable}}, {{LoansReceivable}},{{OtherCurrentReceivables}}.&lt;/p&gt; | [optional] 
**TotalStockholdersEquity** | Pointer to **float32** | &lt;p&gt;{{Total_Equity}} refers to the net assets owned by shareholders. &lt;br&gt;{{Total_Equity}} &#x3D; {{Preferred_Stock}} + {{CommonStock}} + Capital Surplus + {{Retained_Earnings}} &lt;br&gt;{{Total_Equity}} and {{Total_Liabilities}} are the two components for {{Total_Assets}}: &lt;br&gt;Total Assets &#x3D; Total Shareholder&#39;s Equity + {{Total_Liabilities}}  &#x3D; {{Total_Current_Assets}} + {{TotalNonCurrentAssets}} &lt;br&gt;{{Total_Equity}} is used to calculate {{Book_Value_Per_Share}}: {{Book_Value_Per_Share}} &#x3D; ({{Total_Equity}} - {{Preferred_Stock}})/ {{BS_share}}. &lt;br&gt;The ratio of a company&#39;s debt over equity can be used to measure how leveraged this company is: {{deb2equity}} &#x3D; ({{Long-Term_Debt}} + {{Short-Term_Debt}})/{{Total_Equity}}.&lt;/p&gt; | [optional] 
**TotalTaxPayable** | Pointer to **float32** | &lt;p&gt;{{TotalTaxPayable}} is the taxes liability owed to federal, state, and local tax authorities. It is the carrying value as of the balance sheet date of obligations incurred and payable for statutory income, sales, use, payroll, excise, real, property and other taxes.&lt;/p&gt; | [optional] 
**TreasuryStock** | Pointer to **float32** | &lt;p&gt;{{Treasury_Stock}} is the portion of shares that a company keeps in their own treasury. {{Treasury_Stock}} may have come from a repurchase or buyback from shareholders; or it may have never been issued to the public in the first place. These shares don&#39;t pay dividends, have no voting rights, and should not be included in shares outstanding calculations.&lt;/p&gt; | [optional] 
**WorkInProcess** | Pointer to **float32** | &lt;p&gt;That part of a manufacturer&#39;s inventory that is in the production process and has not yet been completed and transferred to the finished goods inventory. This account contains the cost of the direct material, direct labor, and factory overhead placed into the products on the factory floor. A manufacturer must disclose in its financial statements the cost of its work-in-process as well as the cost of finished goods and materials on hand.&lt;/p&gt; | [optional] 

## Methods

### NewFundamentalsNREITDIRECTBalanceSheet

`func NewFundamentalsNREITDIRECTBalanceSheet() *FundamentalsNREITDIRECTBalanceSheet`

NewFundamentalsNREITDIRECTBalanceSheet instantiates a new FundamentalsNREITDIRECTBalanceSheet object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFundamentalsNREITDIRECTBalanceSheetWithDefaults

`func NewFundamentalsNREITDIRECTBalanceSheetWithDefaults() *FundamentalsNREITDIRECTBalanceSheet`

NewFundamentalsNREITDIRECTBalanceSheetWithDefaults instantiates a new FundamentalsNREITDIRECTBalanceSheet object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAccountsPayable

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetAccountsPayable() float32`

GetAccountsPayable returns the AccountsPayable field if non-nil, zero value otherwise.

### GetAccountsPayableOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetAccountsPayableOk() (*float32, bool)`

GetAccountsPayableOk returns a tuple with the AccountsPayable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountsPayable

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetAccountsPayable(v float32)`

SetAccountsPayable sets AccountsPayable field to given value.

### HasAccountsPayable

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasAccountsPayable() bool`

HasAccountsPayable returns a boolean if a field has been set.

### GetAccountsPayableAccruedExpense

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetAccountsPayableAccruedExpense() float32`

GetAccountsPayableAccruedExpense returns the AccountsPayableAccruedExpense field if non-nil, zero value otherwise.

### GetAccountsPayableAccruedExpenseOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetAccountsPayableAccruedExpenseOk() (*float32, bool)`

GetAccountsPayableAccruedExpenseOk returns a tuple with the AccountsPayableAccruedExpense field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountsPayableAccruedExpense

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetAccountsPayableAccruedExpense(v float32)`

SetAccountsPayableAccruedExpense sets AccountsPayableAccruedExpense field to given value.

### HasAccountsPayableAccruedExpense

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasAccountsPayableAccruedExpense() bool`

HasAccountsPayableAccruedExpense returns a boolean if a field has been set.

### GetAccountsReceivable

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetAccountsReceivable() float32`

GetAccountsReceivable returns the AccountsReceivable field if non-nil, zero value otherwise.

### GetAccountsReceivableOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetAccountsReceivableOk() (*float32, bool)`

GetAccountsReceivableOk returns a tuple with the AccountsReceivable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountsReceivable

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetAccountsReceivable(v float32)`

SetAccountsReceivable sets AccountsReceivable field to given value.

### HasAccountsReceivable

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasAccountsReceivable() bool`

HasAccountsReceivable returns a boolean if a field has been set.

### GetAccumulatedDepreciation

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetAccumulatedDepreciation() float32`

GetAccumulatedDepreciation returns the AccumulatedDepreciation field if non-nil, zero value otherwise.

### GetAccumulatedDepreciationOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetAccumulatedDepreciationOk() (*float32, bool)`

GetAccumulatedDepreciationOk returns a tuple with the AccumulatedDepreciation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccumulatedDepreciation

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetAccumulatedDepreciation(v float32)`

SetAccumulatedDepreciation sets AccumulatedDepreciation field to given value.

### HasAccumulatedDepreciation

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasAccumulatedDepreciation() bool`

HasAccumulatedDepreciation returns a boolean if a field has been set.

### GetAccumulatedOtherComprehensiveIncome

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetAccumulatedOtherComprehensiveIncome() float32`

GetAccumulatedOtherComprehensiveIncome returns the AccumulatedOtherComprehensiveIncome field if non-nil, zero value otherwise.

### GetAccumulatedOtherComprehensiveIncomeOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetAccumulatedOtherComprehensiveIncomeOk() (*float32, bool)`

GetAccumulatedOtherComprehensiveIncomeOk returns a tuple with the AccumulatedOtherComprehensiveIncome field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccumulatedOtherComprehensiveIncome

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetAccumulatedOtherComprehensiveIncome(v float32)`

SetAccumulatedOtherComprehensiveIncome sets AccumulatedOtherComprehensiveIncome field to given value.

### HasAccumulatedOtherComprehensiveIncome

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasAccumulatedOtherComprehensiveIncome() bool`

HasAccumulatedOtherComprehensiveIncome returns a boolean if a field has been set.

### GetAdditionalPaidInCapital

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetAdditionalPaidInCapital() float32`

GetAdditionalPaidInCapital returns the AdditionalPaidInCapital field if non-nil, zero value otherwise.

### GetAdditionalPaidInCapitalOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetAdditionalPaidInCapitalOk() (*float32, bool)`

GetAdditionalPaidInCapitalOk returns a tuple with the AdditionalPaidInCapital field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdditionalPaidInCapital

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetAdditionalPaidInCapital(v float32)`

SetAdditionalPaidInCapital sets AdditionalPaidInCapital field to given value.

### HasAdditionalPaidInCapital

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasAdditionalPaidInCapital() bool`

HasAdditionalPaidInCapital returns a boolean if a field has been set.

### GetBsCurrentDeferredLiabilities

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetBsCurrentDeferredLiabilities() float32`

GetBsCurrentDeferredLiabilities returns the BsCurrentDeferredLiabilities field if non-nil, zero value otherwise.

### GetBsCurrentDeferredLiabilitiesOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetBsCurrentDeferredLiabilitiesOk() (*float32, bool)`

GetBsCurrentDeferredLiabilitiesOk returns a tuple with the BsCurrentDeferredLiabilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBsCurrentDeferredLiabilities

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetBsCurrentDeferredLiabilities(v float32)`

SetBsCurrentDeferredLiabilities sets BsCurrentDeferredLiabilities field to given value.

### HasBsCurrentDeferredLiabilities

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasBsCurrentDeferredLiabilities() bool`

HasBsCurrentDeferredLiabilities returns a boolean if a field has been set.

### GetBuildingsAndImprovements

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetBuildingsAndImprovements() float32`

GetBuildingsAndImprovements returns the BuildingsAndImprovements field if non-nil, zero value otherwise.

### GetBuildingsAndImprovementsOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetBuildingsAndImprovementsOk() (*float32, bool)`

GetBuildingsAndImprovementsOk returns a tuple with the BuildingsAndImprovements field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBuildingsAndImprovements

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetBuildingsAndImprovements(v float32)`

SetBuildingsAndImprovements sets BuildingsAndImprovements field to given value.

### HasBuildingsAndImprovements

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasBuildingsAndImprovements() bool`

HasBuildingsAndImprovements returns a boolean if a field has been set.

### GetCashAndCashEquivalents

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetCashAndCashEquivalents() float32`

GetCashAndCashEquivalents returns the CashAndCashEquivalents field if non-nil, zero value otherwise.

### GetCashAndCashEquivalentsOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetCashAndCashEquivalentsOk() (*float32, bool)`

GetCashAndCashEquivalentsOk returns a tuple with the CashAndCashEquivalents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashAndCashEquivalents

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetCashAndCashEquivalents(v float32)`

SetCashAndCashEquivalents sets CashAndCashEquivalents field to given value.

### HasCashAndCashEquivalents

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasCashAndCashEquivalents() bool`

HasCashAndCashEquivalents returns a boolean if a field has been set.

### GetCashEquivalentsMarketableSecurities

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetCashEquivalentsMarketableSecurities() float32`

GetCashEquivalentsMarketableSecurities returns the CashEquivalentsMarketableSecurities field if non-nil, zero value otherwise.

### GetCashEquivalentsMarketableSecuritiesOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetCashEquivalentsMarketableSecuritiesOk() (*float32, bool)`

GetCashEquivalentsMarketableSecuritiesOk returns a tuple with the CashEquivalentsMarketableSecurities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashEquivalentsMarketableSecurities

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetCashEquivalentsMarketableSecurities(v float32)`

SetCashEquivalentsMarketableSecurities sets CashEquivalentsMarketableSecurities field to given value.

### HasCashEquivalentsMarketableSecurities

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasCashEquivalentsMarketableSecurities() bool`

HasCashEquivalentsMarketableSecurities returns a boolean if a field has been set.

### GetCommonStock

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetCommonStock() float32`

GetCommonStock returns the CommonStock field if non-nil, zero value otherwise.

### GetCommonStockOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetCommonStockOk() (*float32, bool)`

GetCommonStockOk returns a tuple with the CommonStock field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCommonStock

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetCommonStock(v float32)`

SetCommonStock sets CommonStock field to given value.

### HasCommonStock

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasCommonStock() bool`

HasCommonStock returns a boolean if a field has been set.

### GetConstructionInProgress

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetConstructionInProgress() float32`

GetConstructionInProgress returns the ConstructionInProgress field if non-nil, zero value otherwise.

### GetConstructionInProgressOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetConstructionInProgressOk() (*float32, bool)`

GetConstructionInProgressOk returns a tuple with the ConstructionInProgress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConstructionInProgress

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetConstructionInProgress(v float32)`

SetConstructionInProgress sets ConstructionInProgress field to given value.

### HasConstructionInProgress

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasConstructionInProgress() bool`

HasConstructionInProgress returns a boolean if a field has been set.

### GetCurrentAccruedExpenses

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetCurrentAccruedExpenses() float32`

GetCurrentAccruedExpenses returns the CurrentAccruedExpenses field if non-nil, zero value otherwise.

### GetCurrentAccruedExpensesOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetCurrentAccruedExpensesOk() (*float32, bool)`

GetCurrentAccruedExpensesOk returns a tuple with the CurrentAccruedExpenses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrentAccruedExpenses

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetCurrentAccruedExpenses(v float32)`

SetCurrentAccruedExpenses sets CurrentAccruedExpenses field to given value.

### HasCurrentAccruedExpenses

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasCurrentAccruedExpenses() bool`

HasCurrentAccruedExpenses returns a boolean if a field has been set.

### GetCurrentDeferredRevenue

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetCurrentDeferredRevenue() float32`

GetCurrentDeferredRevenue returns the CurrentDeferredRevenue field if non-nil, zero value otherwise.

### GetCurrentDeferredRevenueOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetCurrentDeferredRevenueOk() (*float32, bool)`

GetCurrentDeferredRevenueOk returns a tuple with the CurrentDeferredRevenue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrentDeferredRevenue

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetCurrentDeferredRevenue(v float32)`

SetCurrentDeferredRevenue sets CurrentDeferredRevenue field to given value.

### HasCurrentDeferredRevenue

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasCurrentDeferredRevenue() bool`

HasCurrentDeferredRevenue returns a boolean if a field has been set.

### GetCurrentDeferredTaxesLiabilities

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetCurrentDeferredTaxesLiabilities() float32`

GetCurrentDeferredTaxesLiabilities returns the CurrentDeferredTaxesLiabilities field if non-nil, zero value otherwise.

### GetCurrentDeferredTaxesLiabilitiesOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetCurrentDeferredTaxesLiabilitiesOk() (*float32, bool)`

GetCurrentDeferredTaxesLiabilitiesOk returns a tuple with the CurrentDeferredTaxesLiabilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrentDeferredTaxesLiabilities

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetCurrentDeferredTaxesLiabilities(v float32)`

SetCurrentDeferredTaxesLiabilities sets CurrentDeferredTaxesLiabilities field to given value.

### HasCurrentDeferredTaxesLiabilities

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasCurrentDeferredTaxesLiabilities() bool`

HasCurrentDeferredTaxesLiabilities returns a boolean if a field has been set.

### GetDebtToEquity

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetDebtToEquity() float32`

GetDebtToEquity returns the DebtToEquity field if non-nil, zero value otherwise.

### GetDebtToEquityOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetDebtToEquityOk() (*float32, bool)`

GetDebtToEquityOk returns a tuple with the DebtToEquity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDebtToEquity

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetDebtToEquity(v float32)`

SetDebtToEquity sets DebtToEquity field to given value.

### HasDebtToEquity

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasDebtToEquity() bool`

HasDebtToEquity returns a boolean if a field has been set.

### GetEquityToAsset

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetEquityToAsset() float32`

GetEquityToAsset returns the EquityToAsset field if non-nil, zero value otherwise.

### GetEquityToAssetOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetEquityToAssetOk() (*float32, bool)`

GetEquityToAssetOk returns a tuple with the EquityToAsset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEquityToAsset

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetEquityToAsset(v float32)`

SetEquityToAsset sets EquityToAsset field to given value.

### HasEquityToAsset

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasEquityToAsset() bool`

HasEquityToAsset returns a boolean if a field has been set.

### GetFinishedGoods

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetFinishedGoods() float32`

GetFinishedGoods returns the FinishedGoods field if non-nil, zero value otherwise.

### GetFinishedGoodsOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetFinishedGoodsOk() (*float32, bool)`

GetFinishedGoodsOk returns a tuple with the FinishedGoods field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFinishedGoods

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetFinishedGoods(v float32)`

SetFinishedGoods sets FinishedGoods field to given value.

### HasFinishedGoods

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasFinishedGoods() bool`

HasFinishedGoods returns a boolean if a field has been set.

### GetGoodWill

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetGoodWill() float32`

GetGoodWill returns the GoodWill field if non-nil, zero value otherwise.

### GetGoodWillOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetGoodWillOk() (*float32, bool)`

GetGoodWillOk returns a tuple with the GoodWill field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGoodWill

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetGoodWill(v float32)`

SetGoodWill sets GoodWill field to given value.

### HasGoodWill

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasGoodWill() bool`

HasGoodWill returns a boolean if a field has been set.

### GetGrossPpe

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetGrossPpe() float32`

GetGrossPpe returns the GrossPpe field if non-nil, zero value otherwise.

### GetGrossPpeOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetGrossPpeOk() (*float32, bool)`

GetGrossPpeOk returns a tuple with the GrossPpe field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrossPpe

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetGrossPpe(v float32)`

SetGrossPpe sets GrossPpe field to given value.

### HasGrossPpe

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasGrossPpe() bool`

HasGrossPpe returns a boolean if a field has been set.

### GetIntangibles

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetIntangibles() float32`

GetIntangibles returns the Intangibles field if non-nil, zero value otherwise.

### GetIntangiblesOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetIntangiblesOk() (*float32, bool)`

GetIntangiblesOk returns a tuple with the Intangibles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntangibles

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetIntangibles(v float32)`

SetIntangibles sets Intangibles field to given value.

### HasIntangibles

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasIntangibles() bool`

HasIntangibles returns a boolean if a field has been set.

### GetInventoriesAdjustmentsAllowances

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetInventoriesAdjustmentsAllowances() float32`

GetInventoriesAdjustmentsAllowances returns the InventoriesAdjustmentsAllowances field if non-nil, zero value otherwise.

### GetInventoriesAdjustmentsAllowancesOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetInventoriesAdjustmentsAllowancesOk() (*float32, bool)`

GetInventoriesAdjustmentsAllowancesOk returns a tuple with the InventoriesAdjustmentsAllowances field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInventoriesAdjustmentsAllowances

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetInventoriesAdjustmentsAllowances(v float32)`

SetInventoriesAdjustmentsAllowances sets InventoriesAdjustmentsAllowances field to given value.

### HasInventoriesAdjustmentsAllowances

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasInventoriesAdjustmentsAllowances() bool`

HasInventoriesAdjustmentsAllowances returns a boolean if a field has been set.

### GetInventory

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetInventory() float32`

GetInventory returns the Inventory field if non-nil, zero value otherwise.

### GetInventoryOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetInventoryOk() (*float32, bool)`

GetInventoryOk returns a tuple with the Inventory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInventory

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetInventory(v float32)`

SetInventory sets Inventory field to given value.

### HasInventory

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasInventory() bool`

HasInventory returns a boolean if a field has been set.

### GetInvestmentsAndAdvances

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetInvestmentsAndAdvances() float32`

GetInvestmentsAndAdvances returns the InvestmentsAndAdvances field if non-nil, zero value otherwise.

### GetInvestmentsAndAdvancesOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetInvestmentsAndAdvancesOk() (*float32, bool)`

GetInvestmentsAndAdvancesOk returns a tuple with the InvestmentsAndAdvances field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInvestmentsAndAdvances

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetInvestmentsAndAdvances(v float32)`

SetInvestmentsAndAdvances sets InvestmentsAndAdvances field to given value.

### HasInvestmentsAndAdvances

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasInvestmentsAndAdvances() bool`

HasInvestmentsAndAdvances returns a boolean if a field has been set.

### GetLandAndImprovements

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetLandAndImprovements() float32`

GetLandAndImprovements returns the LandAndImprovements field if non-nil, zero value otherwise.

### GetLandAndImprovementsOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetLandAndImprovementsOk() (*float32, bool)`

GetLandAndImprovementsOk returns a tuple with the LandAndImprovements field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLandAndImprovements

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetLandAndImprovements(v float32)`

SetLandAndImprovements sets LandAndImprovements field to given value.

### HasLandAndImprovements

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasLandAndImprovements() bool`

HasLandAndImprovements returns a boolean if a field has been set.

### GetLoansReceivable

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetLoansReceivable() float32`

GetLoansReceivable returns the LoansReceivable field if non-nil, zero value otherwise.

### GetLoansReceivableOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetLoansReceivableOk() (*float32, bool)`

GetLoansReceivableOk returns a tuple with the LoansReceivable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLoansReceivable

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetLoansReceivable(v float32)`

SetLoansReceivable sets LoansReceivable field to given value.

### HasLoansReceivable

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasLoansReceivable() bool`

HasLoansReceivable returns a boolean if a field has been set.

### GetLongTermCapitalLeaseObligation

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetLongTermCapitalLeaseObligation() float32`

GetLongTermCapitalLeaseObligation returns the LongTermCapitalLeaseObligation field if non-nil, zero value otherwise.

### GetLongTermCapitalLeaseObligationOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetLongTermCapitalLeaseObligationOk() (*float32, bool)`

GetLongTermCapitalLeaseObligationOk returns a tuple with the LongTermCapitalLeaseObligation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLongTermCapitalLeaseObligation

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetLongTermCapitalLeaseObligation(v float32)`

SetLongTermCapitalLeaseObligation sets LongTermCapitalLeaseObligation field to given value.

### HasLongTermCapitalLeaseObligation

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasLongTermCapitalLeaseObligation() bool`

HasLongTermCapitalLeaseObligation returns a boolean if a field has been set.

### GetLongTermDebt

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetLongTermDebt() float32`

GetLongTermDebt returns the LongTermDebt field if non-nil, zero value otherwise.

### GetLongTermDebtOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetLongTermDebtOk() (*float32, bool)`

GetLongTermDebtOk returns a tuple with the LongTermDebt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLongTermDebt

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetLongTermDebt(v float32)`

SetLongTermDebt sets LongTermDebt field to given value.

### HasLongTermDebt

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasLongTermDebt() bool`

HasLongTermDebt returns a boolean if a field has been set.

### GetLongTermDebtAndCapitalLeaseObligation

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetLongTermDebtAndCapitalLeaseObligation() float32`

GetLongTermDebtAndCapitalLeaseObligation returns the LongTermDebtAndCapitalLeaseObligation field if non-nil, zero value otherwise.

### GetLongTermDebtAndCapitalLeaseObligationOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetLongTermDebtAndCapitalLeaseObligationOk() (*float32, bool)`

GetLongTermDebtAndCapitalLeaseObligationOk returns a tuple with the LongTermDebtAndCapitalLeaseObligation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLongTermDebtAndCapitalLeaseObligation

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetLongTermDebtAndCapitalLeaseObligation(v float32)`

SetLongTermDebtAndCapitalLeaseObligation sets LongTermDebtAndCapitalLeaseObligation field to given value.

### HasLongTermDebtAndCapitalLeaseObligation

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasLongTermDebtAndCapitalLeaseObligation() bool`

HasLongTermDebtAndCapitalLeaseObligation returns a boolean if a field has been set.

### GetMachineryFurnitureEquipment

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetMachineryFurnitureEquipment() float32`

GetMachineryFurnitureEquipment returns the MachineryFurnitureEquipment field if non-nil, zero value otherwise.

### GetMachineryFurnitureEquipmentOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetMachineryFurnitureEquipmentOk() (*float32, bool)`

GetMachineryFurnitureEquipmentOk returns a tuple with the MachineryFurnitureEquipment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMachineryFurnitureEquipment

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetMachineryFurnitureEquipment(v float32)`

SetMachineryFurnitureEquipment sets MachineryFurnitureEquipment field to given value.

### HasMachineryFurnitureEquipment

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasMachineryFurnitureEquipment() bool`

HasMachineryFurnitureEquipment returns a boolean if a field has been set.

### GetMarkeTableSecurities

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetMarkeTableSecurities() float32`

GetMarkeTableSecurities returns the MarkeTableSecurities field if non-nil, zero value otherwise.

### GetMarkeTableSecuritiesOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetMarkeTableSecuritiesOk() (*float32, bool)`

GetMarkeTableSecuritiesOk returns a tuple with the MarkeTableSecurities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarkeTableSecurities

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetMarkeTableSecurities(v float32)`

SetMarkeTableSecurities sets MarkeTableSecurities field to given value.

### HasMarkeTableSecurities

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasMarkeTableSecurities() bool`

HasMarkeTableSecurities returns a boolean if a field has been set.

### GetMinorityInterest

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetMinorityInterest() float32`

GetMinorityInterest returns the MinorityInterest field if non-nil, zero value otherwise.

### GetMinorityInterestOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetMinorityInterestOk() (*float32, bool)`

GetMinorityInterestOk returns a tuple with the MinorityInterest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinorityInterest

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetMinorityInterest(v float32)`

SetMinorityInterest sets MinorityInterest field to given value.

### HasMinorityInterest

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasMinorityInterest() bool`

HasMinorityInterest returns a boolean if a field has been set.

### GetNetPpe

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetNetPpe() float32`

GetNetPpe returns the NetPpe field if non-nil, zero value otherwise.

### GetNetPpeOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetNetPpeOk() (*float32, bool)`

GetNetPpeOk returns a tuple with the NetPpe field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetPpe

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetNetPpe(v float32)`

SetNetPpe sets NetPpe field to given value.

### HasNetPpe

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasNetPpe() bool`

HasNetPpe returns a boolean if a field has been set.

### GetNonCurrentDeferredIncomeTax

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetNonCurrentDeferredIncomeTax() float32`

GetNonCurrentDeferredIncomeTax returns the NonCurrentDeferredIncomeTax field if non-nil, zero value otherwise.

### GetNonCurrentDeferredIncomeTaxOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetNonCurrentDeferredIncomeTaxOk() (*float32, bool)`

GetNonCurrentDeferredIncomeTaxOk returns a tuple with the NonCurrentDeferredIncomeTax field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNonCurrentDeferredIncomeTax

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetNonCurrentDeferredIncomeTax(v float32)`

SetNonCurrentDeferredIncomeTax sets NonCurrentDeferredIncomeTax field to given value.

### HasNonCurrentDeferredIncomeTax

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasNonCurrentDeferredIncomeTax() bool`

HasNonCurrentDeferredIncomeTax returns a boolean if a field has been set.

### GetNonCurrentDeferredLiabilities

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetNonCurrentDeferredLiabilities() float32`

GetNonCurrentDeferredLiabilities returns the NonCurrentDeferredLiabilities field if non-nil, zero value otherwise.

### GetNonCurrentDeferredLiabilitiesOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetNonCurrentDeferredLiabilitiesOk() (*float32, bool)`

GetNonCurrentDeferredLiabilitiesOk returns a tuple with the NonCurrentDeferredLiabilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNonCurrentDeferredLiabilities

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetNonCurrentDeferredLiabilities(v float32)`

SetNonCurrentDeferredLiabilities sets NonCurrentDeferredLiabilities field to given value.

### HasNonCurrentDeferredLiabilities

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasNonCurrentDeferredLiabilities() bool`

HasNonCurrentDeferredLiabilities returns a boolean if a field has been set.

### GetNotesReceivable

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetNotesReceivable() float32`

GetNotesReceivable returns the NotesReceivable field if non-nil, zero value otherwise.

### GetNotesReceivableOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetNotesReceivableOk() (*float32, bool)`

GetNotesReceivableOk returns a tuple with the NotesReceivable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotesReceivable

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetNotesReceivable(v float32)`

SetNotesReceivable sets NotesReceivable field to given value.

### HasNotesReceivable

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasNotesReceivable() bool`

HasNotesReceivable returns a boolean if a field has been set.

### GetOtherCurrentAssets

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetOtherCurrentAssets() float32`

GetOtherCurrentAssets returns the OtherCurrentAssets field if non-nil, zero value otherwise.

### GetOtherCurrentAssetsOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetOtherCurrentAssetsOk() (*float32, bool)`

GetOtherCurrentAssetsOk returns a tuple with the OtherCurrentAssets field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherCurrentAssets

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetOtherCurrentAssets(v float32)`

SetOtherCurrentAssets sets OtherCurrentAssets field to given value.

### HasOtherCurrentAssets

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasOtherCurrentAssets() bool`

HasOtherCurrentAssets returns a boolean if a field has been set.

### GetOtherCurrentLiabilities

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetOtherCurrentLiabilities() float32`

GetOtherCurrentLiabilities returns the OtherCurrentLiabilities field if non-nil, zero value otherwise.

### GetOtherCurrentLiabilitiesOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetOtherCurrentLiabilitiesOk() (*float32, bool)`

GetOtherCurrentLiabilitiesOk returns a tuple with the OtherCurrentLiabilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherCurrentLiabilities

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetOtherCurrentLiabilities(v float32)`

SetOtherCurrentLiabilities sets OtherCurrentLiabilities field to given value.

### HasOtherCurrentLiabilities

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasOtherCurrentLiabilities() bool`

HasOtherCurrentLiabilities returns a boolean if a field has been set.

### GetOtherCurrentPayables

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetOtherCurrentPayables() float32`

GetOtherCurrentPayables returns the OtherCurrentPayables field if non-nil, zero value otherwise.

### GetOtherCurrentPayablesOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetOtherCurrentPayablesOk() (*float32, bool)`

GetOtherCurrentPayablesOk returns a tuple with the OtherCurrentPayables field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherCurrentPayables

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetOtherCurrentPayables(v float32)`

SetOtherCurrentPayables sets OtherCurrentPayables field to given value.

### HasOtherCurrentPayables

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasOtherCurrentPayables() bool`

HasOtherCurrentPayables returns a boolean if a field has been set.

### GetOtherCurrentReceivables

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetOtherCurrentReceivables() float32`

GetOtherCurrentReceivables returns the OtherCurrentReceivables field if non-nil, zero value otherwise.

### GetOtherCurrentReceivablesOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetOtherCurrentReceivablesOk() (*float32, bool)`

GetOtherCurrentReceivablesOk returns a tuple with the OtherCurrentReceivables field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherCurrentReceivables

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetOtherCurrentReceivables(v float32)`

SetOtherCurrentReceivables sets OtherCurrentReceivables field to given value.

### HasOtherCurrentReceivables

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasOtherCurrentReceivables() bool`

HasOtherCurrentReceivables returns a boolean if a field has been set.

### GetOtherEquity

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetOtherEquity() float32`

GetOtherEquity returns the OtherEquity field if non-nil, zero value otherwise.

### GetOtherEquityOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetOtherEquityOk() (*float32, bool)`

GetOtherEquityOk returns a tuple with the OtherEquity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherEquity

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetOtherEquity(v float32)`

SetOtherEquity sets OtherEquity field to given value.

### HasOtherEquity

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasOtherEquity() bool`

HasOtherEquity returns a boolean if a field has been set.

### GetOtherGrossPpe

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetOtherGrossPpe() float32`

GetOtherGrossPpe returns the OtherGrossPpe field if non-nil, zero value otherwise.

### GetOtherGrossPpeOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetOtherGrossPpeOk() (*float32, bool)`

GetOtherGrossPpeOk returns a tuple with the OtherGrossPpe field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherGrossPpe

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetOtherGrossPpe(v float32)`

SetOtherGrossPpe sets OtherGrossPpe field to given value.

### HasOtherGrossPpe

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasOtherGrossPpe() bool`

HasOtherGrossPpe returns a boolean if a field has been set.

### GetOtherInventories

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetOtherInventories() float32`

GetOtherInventories returns the OtherInventories field if non-nil, zero value otherwise.

### GetOtherInventoriesOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetOtherInventoriesOk() (*float32, bool)`

GetOtherInventoriesOk returns a tuple with the OtherInventories field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherInventories

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetOtherInventories(v float32)`

SetOtherInventories sets OtherInventories field to given value.

### HasOtherInventories

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasOtherInventories() bool`

HasOtherInventories returns a boolean if a field has been set.

### GetOtherLongTermAssets

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetOtherLongTermAssets() float32`

GetOtherLongTermAssets returns the OtherLongTermAssets field if non-nil, zero value otherwise.

### GetOtherLongTermAssetsOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetOtherLongTermAssetsOk() (*float32, bool)`

GetOtherLongTermAssetsOk returns a tuple with the OtherLongTermAssets field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherLongTermAssets

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetOtherLongTermAssets(v float32)`

SetOtherLongTermAssets sets OtherLongTermAssets field to given value.

### HasOtherLongTermAssets

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasOtherLongTermAssets() bool`

HasOtherLongTermAssets returns a boolean if a field has been set.

### GetOtherLongTermLiabilities

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetOtherLongTermLiabilities() float32`

GetOtherLongTermLiabilities returns the OtherLongTermLiabilities field if non-nil, zero value otherwise.

### GetOtherLongTermLiabilitiesOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetOtherLongTermLiabilitiesOk() (*float32, bool)`

GetOtherLongTermLiabilitiesOk returns a tuple with the OtherLongTermLiabilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherLongTermLiabilities

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetOtherLongTermLiabilities(v float32)`

SetOtherLongTermLiabilities sets OtherLongTermLiabilities field to given value.

### HasOtherLongTermLiabilities

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasOtherLongTermLiabilities() bool`

HasOtherLongTermLiabilities returns a boolean if a field has been set.

### GetPensionAndRetirementBenefit

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetPensionAndRetirementBenefit() float32`

GetPensionAndRetirementBenefit returns the PensionAndRetirementBenefit field if non-nil, zero value otherwise.

### GetPensionAndRetirementBenefitOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetPensionAndRetirementBenefitOk() (*float32, bool)`

GetPensionAndRetirementBenefitOk returns a tuple with the PensionAndRetirementBenefit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPensionAndRetirementBenefit

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetPensionAndRetirementBenefit(v float32)`

SetPensionAndRetirementBenefit sets PensionAndRetirementBenefit field to given value.

### HasPensionAndRetirementBenefit

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasPensionAndRetirementBenefit() bool`

HasPensionAndRetirementBenefit returns a boolean if a field has been set.

### GetPreferredStock

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetPreferredStock() float32`

GetPreferredStock returns the PreferredStock field if non-nil, zero value otherwise.

### GetPreferredStockOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetPreferredStockOk() (*float32, bool)`

GetPreferredStockOk returns a tuple with the PreferredStock field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferredStock

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetPreferredStock(v float32)`

SetPreferredStock sets PreferredStock field to given value.

### HasPreferredStock

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasPreferredStock() bool`

HasPreferredStock returns a boolean if a field has been set.

### GetRawMaterials

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetRawMaterials() float32`

GetRawMaterials returns the RawMaterials field if non-nil, zero value otherwise.

### GetRawMaterialsOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetRawMaterialsOk() (*float32, bool)`

GetRawMaterialsOk returns a tuple with the RawMaterials field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRawMaterials

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetRawMaterials(v float32)`

SetRawMaterials sets RawMaterials field to given value.

### HasRawMaterials

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasRawMaterials() bool`

HasRawMaterials returns a boolean if a field has been set.

### GetRetainedEarnings

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetRetainedEarnings() float32`

GetRetainedEarnings returns the RetainedEarnings field if non-nil, zero value otherwise.

### GetRetainedEarningsOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetRetainedEarningsOk() (*float32, bool)`

GetRetainedEarningsOk returns a tuple with the RetainedEarnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRetainedEarnings

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetRetainedEarnings(v float32)`

SetRetainedEarnings sets RetainedEarnings field to given value.

### HasRetainedEarnings

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasRetainedEarnings() bool`

HasRetainedEarnings returns a boolean if a field has been set.

### GetShortTermCapitalLeaseObligation

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetShortTermCapitalLeaseObligation() float32`

GetShortTermCapitalLeaseObligation returns the ShortTermCapitalLeaseObligation field if non-nil, zero value otherwise.

### GetShortTermCapitalLeaseObligationOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetShortTermCapitalLeaseObligationOk() (*float32, bool)`

GetShortTermCapitalLeaseObligationOk returns a tuple with the ShortTermCapitalLeaseObligation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortTermCapitalLeaseObligation

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetShortTermCapitalLeaseObligation(v float32)`

SetShortTermCapitalLeaseObligation sets ShortTermCapitalLeaseObligation field to given value.

### HasShortTermCapitalLeaseObligation

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasShortTermCapitalLeaseObligation() bool`

HasShortTermCapitalLeaseObligation returns a boolean if a field has been set.

### GetShortTermDebt

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetShortTermDebt() float32`

GetShortTermDebt returns the ShortTermDebt field if non-nil, zero value otherwise.

### GetShortTermDebtOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetShortTermDebtOk() (*float32, bool)`

GetShortTermDebtOk returns a tuple with the ShortTermDebt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortTermDebt

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetShortTermDebt(v float32)`

SetShortTermDebt sets ShortTermDebt field to given value.

### HasShortTermDebt

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasShortTermDebt() bool`

HasShortTermDebt returns a boolean if a field has been set.

### GetShortTermDebtAndCapitalLeaseObligation

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetShortTermDebtAndCapitalLeaseObligation() float32`

GetShortTermDebtAndCapitalLeaseObligation returns the ShortTermDebtAndCapitalLeaseObligation field if non-nil, zero value otherwise.

### GetShortTermDebtAndCapitalLeaseObligationOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetShortTermDebtAndCapitalLeaseObligationOk() (*float32, bool)`

GetShortTermDebtAndCapitalLeaseObligationOk returns a tuple with the ShortTermDebtAndCapitalLeaseObligation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortTermDebtAndCapitalLeaseObligation

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetShortTermDebtAndCapitalLeaseObligation(v float32)`

SetShortTermDebtAndCapitalLeaseObligation sets ShortTermDebtAndCapitalLeaseObligation field to given value.

### HasShortTermDebtAndCapitalLeaseObligation

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasShortTermDebtAndCapitalLeaseObligation() bool`

HasShortTermDebtAndCapitalLeaseObligation returns a boolean if a field has been set.

### GetTotalAssets

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetTotalAssets() float32`

GetTotalAssets returns the TotalAssets field if non-nil, zero value otherwise.

### GetTotalAssetsOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetTotalAssetsOk() (*float32, bool)`

GetTotalAssetsOk returns a tuple with the TotalAssets field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalAssets

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetTotalAssets(v float32)`

SetTotalAssets sets TotalAssets field to given value.

### HasTotalAssets

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasTotalAssets() bool`

HasTotalAssets returns a boolean if a field has been set.

### GetTotalCurrentAssets

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetTotalCurrentAssets() float32`

GetTotalCurrentAssets returns the TotalCurrentAssets field if non-nil, zero value otherwise.

### GetTotalCurrentAssetsOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetTotalCurrentAssetsOk() (*float32, bool)`

GetTotalCurrentAssetsOk returns a tuple with the TotalCurrentAssets field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalCurrentAssets

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetTotalCurrentAssets(v float32)`

SetTotalCurrentAssets sets TotalCurrentAssets field to given value.

### HasTotalCurrentAssets

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasTotalCurrentAssets() bool`

HasTotalCurrentAssets returns a boolean if a field has been set.

### GetTotalCurrentLiabilities

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetTotalCurrentLiabilities() float32`

GetTotalCurrentLiabilities returns the TotalCurrentLiabilities field if non-nil, zero value otherwise.

### GetTotalCurrentLiabilitiesOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetTotalCurrentLiabilitiesOk() (*float32, bool)`

GetTotalCurrentLiabilitiesOk returns a tuple with the TotalCurrentLiabilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalCurrentLiabilities

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetTotalCurrentLiabilities(v float32)`

SetTotalCurrentLiabilities sets TotalCurrentLiabilities field to given value.

### HasTotalCurrentLiabilities

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasTotalCurrentLiabilities() bool`

HasTotalCurrentLiabilities returns a boolean if a field has been set.

### GetTotalEquity

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetTotalEquity() float32`

GetTotalEquity returns the TotalEquity field if non-nil, zero value otherwise.

### GetTotalEquityOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetTotalEquityOk() (*float32, bool)`

GetTotalEquityOk returns a tuple with the TotalEquity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalEquity

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetTotalEquity(v float32)`

SetTotalEquity sets TotalEquity field to given value.

### HasTotalEquity

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasTotalEquity() bool`

HasTotalEquity returns a boolean if a field has been set.

### GetTotalLiabilities

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetTotalLiabilities() float32`

GetTotalLiabilities returns the TotalLiabilities field if non-nil, zero value otherwise.

### GetTotalLiabilitiesOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetTotalLiabilitiesOk() (*float32, bool)`

GetTotalLiabilitiesOk returns a tuple with the TotalLiabilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalLiabilities

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetTotalLiabilities(v float32)`

SetTotalLiabilities sets TotalLiabilities field to given value.

### HasTotalLiabilities

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasTotalLiabilities() bool`

HasTotalLiabilities returns a boolean if a field has been set.

### GetTotalNonCurrentAssets

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetTotalNonCurrentAssets() float32`

GetTotalNonCurrentAssets returns the TotalNonCurrentAssets field if non-nil, zero value otherwise.

### GetTotalNonCurrentAssetsOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetTotalNonCurrentAssetsOk() (*float32, bool)`

GetTotalNonCurrentAssetsOk returns a tuple with the TotalNonCurrentAssets field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalNonCurrentAssets

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetTotalNonCurrentAssets(v float32)`

SetTotalNonCurrentAssets sets TotalNonCurrentAssets field to given value.

### HasTotalNonCurrentAssets

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasTotalNonCurrentAssets() bool`

HasTotalNonCurrentAssets returns a boolean if a field has been set.

### GetTotalNonCurrentLiabilitiesNetMinorityInterest

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetTotalNonCurrentLiabilitiesNetMinorityInterest() float32`

GetTotalNonCurrentLiabilitiesNetMinorityInterest returns the TotalNonCurrentLiabilitiesNetMinorityInterest field if non-nil, zero value otherwise.

### GetTotalNonCurrentLiabilitiesNetMinorityInterestOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetTotalNonCurrentLiabilitiesNetMinorityInterestOk() (*float32, bool)`

GetTotalNonCurrentLiabilitiesNetMinorityInterestOk returns a tuple with the TotalNonCurrentLiabilitiesNetMinorityInterest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalNonCurrentLiabilitiesNetMinorityInterest

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetTotalNonCurrentLiabilitiesNetMinorityInterest(v float32)`

SetTotalNonCurrentLiabilitiesNetMinorityInterest sets TotalNonCurrentLiabilitiesNetMinorityInterest field to given value.

### HasTotalNonCurrentLiabilitiesNetMinorityInterest

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasTotalNonCurrentLiabilitiesNetMinorityInterest() bool`

HasTotalNonCurrentLiabilitiesNetMinorityInterest returns a boolean if a field has been set.

### GetTotalReceivables

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetTotalReceivables() float32`

GetTotalReceivables returns the TotalReceivables field if non-nil, zero value otherwise.

### GetTotalReceivablesOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetTotalReceivablesOk() (*float32, bool)`

GetTotalReceivablesOk returns a tuple with the TotalReceivables field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalReceivables

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetTotalReceivables(v float32)`

SetTotalReceivables sets TotalReceivables field to given value.

### HasTotalReceivables

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasTotalReceivables() bool`

HasTotalReceivables returns a boolean if a field has been set.

### GetTotalStockholdersEquity

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetTotalStockholdersEquity() float32`

GetTotalStockholdersEquity returns the TotalStockholdersEquity field if non-nil, zero value otherwise.

### GetTotalStockholdersEquityOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetTotalStockholdersEquityOk() (*float32, bool)`

GetTotalStockholdersEquityOk returns a tuple with the TotalStockholdersEquity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalStockholdersEquity

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetTotalStockholdersEquity(v float32)`

SetTotalStockholdersEquity sets TotalStockholdersEquity field to given value.

### HasTotalStockholdersEquity

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasTotalStockholdersEquity() bool`

HasTotalStockholdersEquity returns a boolean if a field has been set.

### GetTotalTaxPayable

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetTotalTaxPayable() float32`

GetTotalTaxPayable returns the TotalTaxPayable field if non-nil, zero value otherwise.

### GetTotalTaxPayableOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetTotalTaxPayableOk() (*float32, bool)`

GetTotalTaxPayableOk returns a tuple with the TotalTaxPayable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalTaxPayable

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetTotalTaxPayable(v float32)`

SetTotalTaxPayable sets TotalTaxPayable field to given value.

### HasTotalTaxPayable

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasTotalTaxPayable() bool`

HasTotalTaxPayable returns a boolean if a field has been set.

### GetTreasuryStock

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetTreasuryStock() float32`

GetTreasuryStock returns the TreasuryStock field if non-nil, zero value otherwise.

### GetTreasuryStockOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetTreasuryStockOk() (*float32, bool)`

GetTreasuryStockOk returns a tuple with the TreasuryStock field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTreasuryStock

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetTreasuryStock(v float32)`

SetTreasuryStock sets TreasuryStock field to given value.

### HasTreasuryStock

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasTreasuryStock() bool`

HasTreasuryStock returns a boolean if a field has been set.

### GetWorkInProcess

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetWorkInProcess() float32`

GetWorkInProcess returns the WorkInProcess field if non-nil, zero value otherwise.

### GetWorkInProcessOk

`func (o *FundamentalsNREITDIRECTBalanceSheet) GetWorkInProcessOk() (*float32, bool)`

GetWorkInProcessOk returns a tuple with the WorkInProcess field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWorkInProcess

`func (o *FundamentalsNREITDIRECTBalanceSheet) SetWorkInProcess(v float32)`

SetWorkInProcess sets WorkInProcess field to given value.

### HasWorkInProcess

`func (o *FundamentalsNREITDIRECTBalanceSheet) HasWorkInProcess() bool`

HasWorkInProcess returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


