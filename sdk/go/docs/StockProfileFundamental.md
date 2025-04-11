# StockProfileFundamental

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EffectiveInterestRate** | Pointer to **float32** | Effective interest rate on debt is the usage rate that a borrower actually pays on a debt. It is calculated as the positive value of interest expense divided by its average total debt. | [optional] 
**InsiderSharesOwned** | Pointer to **float32** | The number of shares owned by insiders, in millions | [optional] 
**InstitutionSharesHeld** | Pointer to **float32** | The number of shares owned by institutions, in millions | [optional] 
**PFD** | Pointer to **float32** | The probability of financial distress, as computed using the Campbell, Hilscher and Szilagyi model. | [optional] 
**ROC_JOEL** | Pointer to **float32** | Joel Greenblatt defined Return on Capital differently in his book The Little Book That Still Beats the Market (Little Books. Big Profits). He defines Return on Capital as EBIT divided by the total of Property, Plant and Equipment and net working capital. | [optional] 
**ROCJOELHigh** | Pointer to **float32** | Joel Greenblatt defined Return on Capital differently in his book The Little Book That Still Beats the Market (Little Books. Big Profits). He defines Return on Capital as EBIT divided by the total of Property, Plant and Equipment and net working capital. | [optional] 
**ROCJOELLow** | Pointer to **float32** | Joel Greenblatt defined Return on Capital differently in his book The Little Book That Still Beats the Market (Little Books. Big Profits). He defines Return on Capital as EBIT divided by the total of Property, Plant and Equipment and net working capital. | [optional] 
**ROCJOELMed** | Pointer to **float32** | Joel Greenblatt defined Return on Capital differently in his book The Little Book That Still Beats the Market (Little Books. Big Profits). He defines Return on Capital as EBIT divided by the total of Property, Plant and Equipment and net working capital. | [optional] 
**ROCJOELMed5y** | Pointer to **float32** | Joel Greenblatt defined Return on Capital differently in his book The Little Book That Still Beats the Market (Little Books. Big Profits). He defines Return on Capital as EBIT divided by the total of Property, Plant and Equipment and net working capital. | [optional] 
**ROTA** | Pointer to **float32** | Return on tangible assets is calculated as Net Income divided by its average total tangible assets. Total tangible assets equals to Total Assets minus Intangible Assets. | [optional] 
**ROTAHigh** | Pointer to **float32** | Return on tangible assets is calculated as Net Income divided by its average total tangible assets. Total tangible assets equals to Total Assets minus Intangible Assets. | [optional] 
**ROTALow** | Pointer to **float32** | Return on tangible assets is calculated as Net Income divided by its average total tangible assets. Total tangible assets equals to Total Assets minus Intangible Assets. | [optional] 
**ROTAMed** | Pointer to **float32** | Return on tangible assets is calculated as Net Income divided by its average total tangible assets. Total tangible assets equals to Total Assets minus Intangible Assets. | [optional] 
**ROTE** | Pointer to **float32** | Return on tangible equity is calculated as Net Income attributable to Common Stockholders divided by its average total shareholder tangible equity. | [optional] 
**ROTEHigh** | Pointer to **float32** | Return on tangible equity is calculated as Net Income attributable to Common Stockholders divided by its average total shareholder tangible equity. | [optional] 
**ROTELow** | Pointer to **float32** | Return on tangible equity is calculated as Net Income attributable to Common Stockholders divided by its average total shareholder tangible equity. | [optional] 
**ROTEMed** | Pointer to **float32** | Return on tangible equity is calculated as Net Income attributable to Common Stockholders divided by its average total shareholder tangible equity. | [optional] 
**ROTEMed5y** | Pointer to **float32** | Return on tangible equity is calculated as Net Income attributable to Common Stockholders divided by its average total shareholder tangible equity. | [optional] 
**SGA** | Pointer to **float32** | Selling, General, &amp; Admin. Expense (SGA) includes the direct and indirect costs and all general and administrative expenses of a company. For instance, personnel cost, advertising, rent, communication costs are all part of SGA. | [optional] 
**SNOA** | Pointer to **float32** | Scaled net operating assets (SNOA) is calculated as the difference between  operating assets and operating liabilities, scaled by lagged total assets. | [optional] 
**TotalPayoutRatio** | Pointer to **float32** | The total payout ratio is the ratio of the total amount of dividends and share repurchases to the company&#39;s net income. | [optional] 
**TotalPayoutYield** | Pointer to **float32** |  | [optional] 
**AfinancialsStartDate** | Pointer to **string** |  | [optional] 
**Asset** | Pointer to **float32** | The total amount of current assets | [optional] 
**Book** | Pointer to **float32** | Per share value of a company based on common shareholders&#39; equity in the company. | [optional] 
**BuybackYield** | Pointer to **float32** |  | [optional] 
**BuybackYieldHigh** | Pointer to **float32** |  | [optional] 
**BuybackYieldLow** | Pointer to **float32** |  | [optional] 
**BuybackYieldMed** | Pointer to **float32** |  | [optional] 
**Cash2debt** | Pointer to **float32** | Cash to Debt Ratio measures the financial strength of a company. It is calculated as a company&#39;s {{cash_equivalents_marketable_securities}} divided by its {{total_debt}}. | [optional] 
**Cash2debtHigh** | Pointer to **float32** | Cash to Debt Ratio measures the financial strength of a company. It is calculated as a company&#39;s cash, cash equivalents, and marketable securities divide by its debt. | [optional] 
**Cash2debtLow** | Pointer to **float32** | Cash to Debt Ratio measures the financial strength of a company. It is calculated as a company&#39;s cash, cash equivalents, and marketable securities divide by its debt. | [optional] 
**Cash2debtMed** | Pointer to **float32** | Cash to Debt Ratio measures the financial strength of a company. It is calculated as a company&#39;s cash, cash equivalents, and marketable securities divide by its debt. | [optional] 
**CashRatio** | Pointer to **float32** | The Cash Ratio measures a company’s ability to meet its short-term obligations with cash and near-cash resources.  | [optional] 
**CashRatioHigh** | Pointer to **float32** |  | [optional] 
**CashRatioLow** | Pointer to **float32** |  | [optional] 
**CashRatioMed** | Pointer to **float32** |  | [optional] 
**Ccc** | Pointer to **float32** | Cash Conversion Cycle is one of several measures of management effectiveness. It equals Days Sales Outstanding + Days Inventory - Days Payable. | [optional] 
**CorrelationBook** | Pointer to **float32** | The Price vs Book Correlation is the correlation coefficient between the stock price and the book value per share over the past five years. | [optional] 
**CorrelationEpsNri** | Pointer to **float32** | The Price vs EPS without NRI Correlation is the correlation coefficient between the stock price and the EPS without NRI over the past five years. | [optional] 
**CorrelationEvVsEbit** | Pointer to **float32** |  | [optional] 
**CorrelationEvVsEbitda** | Pointer to **float32** |  | [optional] 
**CorrelationEvVsFcf** | Pointer to **float32** |  | [optional] 
**CorrelationEvVsPretaxIncome** | Pointer to **float32** |  | [optional] 
**CorrelationEvVsRev** | Pointer to **float32** |  | [optional] 
**CorrelationOcf** | Pointer to **float32** | The Price vs Operating Cash Flow Correlation is the correlation coefficient between the stock price and the operating cash flow per share over the past five years. | [optional] 
**CorrelationRev** | Pointer to **float32** | The Price vs Revenue Correlation is the correlation coefficient between the stock price and the revenue per share over the past five years. | [optional] 
**CurrentRatio** | Pointer to **float32** | The current ratio is a liquidity ratio that measures a company&#39;s ability to pay short-term obligations. It is calculated as a company&#39;s Total Current Assets divides by its Total Current Liabilities. | [optional] 
**CurrentRatioHigh** | Pointer to **float32** | The current ratio is a liquidity ratio that measures a company&#39;s ability to pay short-term obligations. It is calculated as a company&#39;s Total Current Assets divides by its Total Current Liabilities. | [optional] 
**CurrentRatioLow** | Pointer to **float32** | The current ratio is a liquidity ratio that measures a company&#39;s ability to pay short-term obligations. It is calculated as a company&#39;s Total Current Assets divides by its Total Current Liabilities. | [optional] 
**CurrentRatioMed** | Pointer to **float32** | The current ratio is a liquidity ratio that measures a company&#39;s ability to pay short-term obligations. It is calculated as a company&#39;s Total Current Assets divides by its Total Current Liabilities. | [optional] 
**Daysinventory** | Pointer to **float32** | The Days Inventory is an efficiency ratio that measures the average number of days the company holds its inventory before selling it. The ratio measures the number of days funds are tied up in inventory. Inventory levels (measured at cost) are divided by sales per day (also measured at cost rather than selling price.) | [optional] 
**DaysinventoryHigh** | Pointer to **float32** | The Days Inventory is an efficiency ratio that measures the average number of days the company holds its inventory before selling it. The ratio measures the number of days funds are tied up in inventory. Inventory levels (measured at cost) are divided by sales per day (also measured at cost rather than selling price.) | [optional] 
**DaysinventoryLow** | Pointer to **float32** | The Days Inventory is an efficiency ratio that measures the average number of days the company holds its inventory before selling it. The ratio measures the number of days funds are tied up in inventory. Inventory levels (measured at cost) are divided by sales per day (also measured at cost rather than selling price.) | [optional] 
**DaysinventoryMed** | Pointer to **float32** | The Days Inventory is an efficiency ratio that measures the average number of days the company holds its inventory before selling it. The ratio measures the number of days funds are tied up in inventory. Inventory levels (measured at cost) are divided by sales per day (also measured at cost rather than selling price.) | [optional] 
**Dayspayable** | Pointer to **float32** | Days payable outstanding (DPO) is an efficiency ratio that measures the average number of days a company takes to pay its suppliers. | [optional] 
**DayspayableHigh** | Pointer to **float32** | Days payable outstanding (DPO) is an efficiency ratio that measures the average number of days a company takes to pay its suppliers. | [optional] 
**DayspayableLow** | Pointer to **float32** | Days payable outstanding (DPO) is an efficiency ratio that measures the average number of days a company takes to pay its suppliers. | [optional] 
**DayspayableMed** | Pointer to **float32** | Days payable outstanding (DPO) is an efficiency ratio that measures the average number of days a company takes to pay its suppliers. | [optional] 
**Dayssalesoutstand** | Pointer to **float32** | Days sales outstanding (DSO) is a measure of the average number of days that it takes a company to collect payment after a sale has been made. | [optional] 
**DayssalesoutstandHigh** | Pointer to **float32** | Days sales outstanding (DSO) is a measure of the average number of days that it takes a company to collect payment after a sale has been made. | [optional] 
**DayssalesoutstandLow** | Pointer to **float32** | Days sales outstanding (DSO) is a measure of the average number of days that it takes a company to collect payment after a sale has been made. | [optional] 
**DayssalesoutstandMed** | Pointer to **float32** | Days sales outstanding (DSO) is a measure of the average number of days that it takes a company to collect payment after a sale has been made. | [optional] 
**Debt2asset** | Pointer to **float32** | Debt to assets is a leverage ratio that defines the total amount of debt relative to assets | [optional] 
**Debt2ebitda** | Pointer to **float32** | Debt-to-EBITDA measures a company&#39;s ability to pay off its debt. | [optional] 
**Debt2ebitdaHigh** | Pointer to **float32** | Debt-to-EBITDA measures a company&#39;s ability to pay off its debt. | [optional] 
**Debt2ebitdaLow** | Pointer to **float32** | Debt-to-EBITDA measures a company&#39;s ability to pay off its debt. | [optional] 
**Debt2ebitdaMed** | Pointer to **float32** | Debt-to-EBITDA measures a company&#39;s ability to pay off its debt. | [optional] 
**Debt2equity** | Pointer to **float32** | The Debt/Equity (D/E) Ratio is calculated by dividing a company’s total liabilities by its shareholder equity. The ratio is used to evaluate a company&#39;s financial leverage. | [optional] 
**Debt2equityHigh** | Pointer to **float32** | The Debt/Equity (D/E) Ratio is calculated by dividing a company’s total liabilities by its shareholder equity. The ratio is used to evaluate a company&#39;s financial leverage. | [optional] 
**Debt2equityLow** | Pointer to **float32** | The Debt/Equity (D/E) Ratio is calculated by dividing a company’s total liabilities by its shareholder equity. The ratio is used to evaluate a company&#39;s financial leverage. | [optional] 
**Debt2equityMed** | Pointer to **float32** | The Debt/Equity (D/E) Ratio is calculated by dividing a company’s total liabilities by its shareholder equity. The ratio is used to evaluate a company&#39;s financial leverage. | [optional] 
**Debt2rev** | Pointer to **float32** | The ratio of long-term debt to revenue | [optional] 
**Eps** | Pointer to **float32** | Earnings per share (EPS) is the portion of a company&#39;s profit allocated to each share of common stock. | [optional] 
**EpsLatestQ** | Pointer to **float32** |  | [optional] 
**EpsNri** | Pointer to **float32** | Earnings Per Share (EPS) is the single most important variable used by Wall Street in determining the earnings power of a company. But investors need to be aware that Earnings per Share can be easily manipulated by adjusting depreciation and amortization rate or non-recurring items. That&#39;s why GuruFocus lists Earnings per share without Non-Recurring Items, which better reflects the company&#39;s underlying performance.    Earnings Per Share without Non-Recurring Items is the amount of earnings without non-recurring items per outstanding share of the company&amp;#146;s stock. In calculating earnings per share without non-recurring items, the dividends of preferred stocks and non-recurring items need to subtracted from the total net income first. | [optional] 
**Equity2asset** | Pointer to **float32** | Equity to Asset ratio is calculated as shareholder&#39;s tangible equity divided by its total asset. | [optional] 
**Equity2assetHigh** | Pointer to **float32** | Equity to Asset ratio is calculated as shareholder&#39;s tangible equity divided by its total asset. | [optional] 
**Equity2assetLow** | Pointer to **float32** | Equity to Asset ratio is calculated as shareholder&#39;s tangible equity divided by its total asset. | [optional] 
**Equity2assetMed** | Pointer to **float32** | Equity to Asset ratio is calculated as shareholder&#39;s tangible equity divided by its total asset. | [optional] 
**EvMorn** | Pointer to **float32** | Enterprise Value is calculated as the market cap plus debt and minority interest and preferred shares, minus total cash, cash equivalents, and marketable securities. | [optional] 
**EvMornNorm** | Pointer to **float32** | Enterprise Value is calculated as the market cap plus debt and minority interest and preferred shares, minus total cash, cash equivalents, and marketable securities. | [optional] 
**Fscore** | Pointer to **float32** | Piotroski F-Score is a number between 0-9 which is used to assess strength of company&#39;s financial position. | [optional] 
**FscoreHigh** | Pointer to **float32** | Piotroski F-Score is a number between 0-9 which is used to assess strength of company&#39;s financial position. | [optional] 
**FscoreLow** | Pointer to **float32** | Piotroski F-Score is a number between 0-9 which is used to assess strength of company&#39;s financial position. | [optional] 
**FscoreMed** | Pointer to **float32** | Piotroski F-Score is a number between 0-9 which is used to assess strength of company&#39;s financial position. | [optional] 
**Goodwill2asset** | Pointer to **float32** | It is a ratio that measures how much goodwill a company is recording compared to the total level of its assets. | [optional] 
**Grossprofit** | Pointer to **float32** | The gross profit over the trailing 12 months | [optional] 
**Grossprofit2asset** | Pointer to **float32** | The ratio of a company&#39;s gross profit to total assets | [optional] 
**Grossprofit2tangibleasset** | Pointer to **float32** | The ratio of a company&#39;s gross profit to tangible assets | [optional] 
**InsiderOwnership** | Pointer to **float32** | Insider ownership is the percentage of shares that are owned by company insiders relative to the total shares outstanding. | [optional] 
**InstOwnership** | Pointer to **float32** | Institutional ownership is the percentage of shares that are owned by institutions out of the total shares outstanding. | [optional] 
**InterestCoverage** | Pointer to **float32** | Interest Coverage is a ratio that determines how easily a company can pay interest expenses on outstanding debt. | [optional] 
**InterestCoverageHigh** | Pointer to **float32** | Interest Coverage is a ratio that determines how easily a company can pay interest expenses on outstanding debt. | [optional] 
**InterestCoverageLow** | Pointer to **float32** | Interest Coverage is a ratio that determines how easily a company can pay interest expenses on outstanding debt. | [optional] 
**InterestCoverageMed** | Pointer to **float32** | Interest Coverage is a ratio that determines how easily a company can pay interest expenses on outstanding debt. | [optional] 
**Inventory2sales** | Pointer to **float32** | The ratio of total inventory to total revenues | [optional] 
**InventoryTurnover** | Pointer to **float32** | The ratio of cost of goods sold to total inventories | [optional] 
**LatestEarningsReleaseDate** | Pointer to **string** |  | [optional] 
**LiabilitiesToAssets** | Pointer to **float32** |  | [optional] 
**Mktcap** | Pointer to **float32** | Market cap is the short version of market capitalization. It is the total market value to buy the whole company. It is equal to the share price times the number of shares outstanding. | [optional] 
**MktcapNorm** | Pointer to **float32** | Market cap is the total market value to buy the whole company. It is equal to the share price times the number of Shares Outstanding (EOP). | [optional] 
**Mscore** | Pointer to **float32** | Beneish&#39;s M-Score is a mathematical model that uses eight financial ratios weighted by coefficients to identify whether a company has manipulated its profits. | [optional] 
**MscoreHigh** | Pointer to **float32** | Beneish&#39;s M-Score is a mathematical model that uses eight financial ratios weighted by coefficients to identify whether a company has manipulated its profits. | [optional] 
**MscoreLow** | Pointer to **float32** | Beneish&#39;s M-Score is a mathematical model that uses eight financial ratios weighted by coefficients to identify whether a company has manipulated its profits. | [optional] 
**MscoreMed** | Pointer to **float32** | Beneish&#39;s M-Score is a mathematical model that uses eight financial ratios weighted by coefficients to identify whether a company has manipulated its profits. | [optional] 
**NetDebtPaydownYield** | Pointer to **float32** | Net Debt Paydown Yield is a metric that evaluates the total amount of debt a company has paid in relation to its market capitalization. This metric provides insight into a company&#39;s willingness and ability to reduce its debt. | [optional] 
**NetDebtPaydownYieldHigh** | Pointer to **float32** |  | [optional] 
**NetDebtPaydownYieldLow** | Pointer to **float32** |  | [optional] 
**NetDebtPaydownYieldMed** | Pointer to **float32** |  | [optional] 
**NextEarningsDate** | Pointer to **string** | The next day a company releases its earnings | [optional] 
**NumGoodSigns** | Pointer to **float32** | The number of positive investing signs | [optional] 
**NumWarningSignsMeidum** | Pointer to **float32** | The number of medium warning signs | [optional] 
**NumWarningSignsSevere** | Pointer to **float32** | The number of severe warning signs | [optional] 
**PastEarningsDate** | Pointer to **string** | The most-recent financial update of a company | [optional] 
**QuickRatio** | Pointer to **float32** | The quick ratio measures a company&#39;s ability to meet its short-term obligations with its most liquid assets. | [optional] 
**QuickRatioHigh** | Pointer to **float32** | The quick ratio measures a company&#39;s ability to meet its short-term obligations with its most liquid assets. | [optional] 
**QuickRatioLow** | Pointer to **float32** | The quick ratio measures a company&#39;s ability to meet its short-term obligations with its most liquid assets. | [optional] 
**QuickRatioMed** | Pointer to **float32** | The quick ratio measures a company&#39;s ability to meet its short-term obligations with its most liquid assets. | [optional] 
**ReceivablesTurnover** | Pointer to **float32** | The accounts receivables turnover ratio measures the number of times a company collects its average accounts receivable balance. It is calculated as Revenue divided by Average Accounts Receivable. | [optional] 
**RelatedComp** | Pointer to **string** | A list of the company&#39;s competitors. | [optional] 
**Roa** | Pointer to **float32** | Return on assets is calculated as Net Income divided by its Total Assets. | [optional] 
**RoaHigh** | Pointer to **float32** | Return on assets is calculated as Net Income divided by its Total Assets. | [optional] 
**RoaLow** | Pointer to **float32** | Return on assets is calculated as Net Income divided by its Total Assets. | [optional] 
**RoaMed** | Pointer to **float32** | Return on assets is calculated as Net Income divided by its Total Assets. | [optional] 
**RoaMed5y** | Pointer to **float32** | Return on assets is calculated as Net Income divided by its Total Assets. | [optional] 
**Roc** | Pointer to **float32** | Return on capital measures how well a company generates cash flow relative to the capital it has invested in its business. It is also called ROIC %. | [optional] 
**Roce** | Pointer to **float32** | ROCE % measures how well a company generates profits from its capital. | [optional] 
**RoceHigh** | Pointer to **float32** |  | [optional] 
**RoceLow** | Pointer to **float32** |  | [optional] 
**RoceMed** | Pointer to **float32** |  | [optional] 
**RoceMed5y** | Pointer to **float32** |  | [optional] 
**Roe** | Pointer to **float32** | Return on equity is calculated as Net Income attributable to Common Stockholders (Net Income minus the preferred dividends paid) divided by its Total Stockholders Equity | [optional] 
**RoeAdj** | Pointer to **float32** | The return on equity adjusted to book values | [optional] 
**RoeHigh** | Pointer to **float32** | Return on equity is calculated as Net Income attributable to Common Stockholders (Net Income minus the preferred dividends paid) divided by its Total Stockholders Equity | [optional] 
**RoeLow** | Pointer to **float32** | Return on equity is calculated as Net Income attributable to Common Stockholders (Net Income minus the preferred dividends paid) divided by its Total Stockholders Equity | [optional] 
**RoeMed** | Pointer to **float32** | Return on equity is calculated as Net Income attributable to Common Stockholders (Net Income minus the preferred dividends paid) divided by its Total Stockholders Equity | [optional] 
**RoeMed5y** | Pointer to **float32** | Return on equity is calculated as Net Income attributable to Common Stockholders (Net Income minus the preferred dividends paid) divided by its Total Stockholders Equity | [optional] 
**Roic** | Pointer to **float32** | Return on Invested Capital (ROIC) is calculated as follows:    Return on Invested Capital (ROIC) &#x3D; (EBIT - Adjusted Taxes) / (Book Value of Debt + Book Value of Equity - Cash) | [optional] 
**RoicHigh** | Pointer to **float32** | The highest return on invested capital over the past 10 years | [optional] 
**RoicLow** | Pointer to **float32** | The lowest return on invested capital over the past 10 years | [optional] 
**RoicMed** | Pointer to **float32** | The median return on capital over the past 10 years | [optional] 
**RoicMed5y** | Pointer to **float32** | The median return on capital over the past five years | [optional] 
**Roiic3y** | Pointer to **float32** | 3-Year Return on Invested Incremental Capital (3-Year ROIIC %) measures the change in earnings as a percentage of change in investment over 3-year. | [optional] 
**Roiic3yHigh** | Pointer to **float32** |  | [optional] 
**Roiic3yLow** | Pointer to **float32** |  | [optional] 
**Roiic3yMed** | Pointer to **float32** |  | [optional] 
**RvnPredc10y** | Pointer to **float32** | The predictability of a company&#39;s revenue | [optional] 
**Sales** | Pointer to **float32** | Also referred as sales, revenue is income that a company receives from its normal business activities, usually from the sale of goods and services to customers. | [optional] 
**SalesLatestQ** | Pointer to **float32** | Revenue is the income that a business has from its normal business activities, usually from the sale of goods and services to customers. | [optional] 
**SalesLatestQNorm** | Pointer to **float32** | Revenue is the income that a business has from its normal business activities, usually from the sale of goods and services to customers. | [optional] 
**ShareholderYield** | Pointer to **float32** |  | [optional] 
**ShareholderYieldHigh** | Pointer to **float32** |  | [optional] 
**ShareholderYieldLow** | Pointer to **float32** |  | [optional] 
**ShareholderYieldMed** | Pointer to **float32** |  | [optional] 
**Shares** | Pointer to **float32** | Outstanding shares refer to a company&#39;s stock currently held by all its shareholders, including share blocks held by institutional investors and restricted shares owned by the company&#39;s officers and insiders. | [optional] 
**Sloanratio** | Pointer to **float32** | Richard Sloan from the University of Michigan was first to document what is referred to as the &#39;accrual anomaly&#39;. His 1996 paper found that shares of companies with small or negative accruals vastly outperform (+10%) those of companies with large ones. | [optional] 
**TaxRateMed5y** | Pointer to **float32** | Tax paid by the company. It is computed in by multiplying the income before tax number, as reported to shareholders, by the appropriate tax rate. In reality, the computation is typically considerably more complex due to things such as expenses considered not deductible by taxing authorities (\\\&quot;add backs\\\&quot;), the range of tax rates applicable to various levels of income, different tax rates in different jurisdictions, multiple layers of tax on income, and other issues. | [optional] 
**TotalBuyback10y** | Pointer to **float32** | This is the average share buyback rate of the company over the past 10 years. A negative number means the company might be issuing new shares. A positive number indicates that the company is buying back shares. | [optional] 
**TotalBuyback1y** | Pointer to **float32** | This is the average share buyback rate of the company over the past 1 year. A negative number means the company might be issuing new shares. A positive number indicates that the company is buying back shares. | [optional] 
**TotalBuyback3y** | Pointer to **float32** | This is the average share buyback rate of the company over the past 1 year. A negative number means the company might be issuing new shares. A positive number indicates that the company is buying back shares. | [optional] 
**TotalBuyback3yHigh** | Pointer to **float32** | This is the average share buyback rate of the company over the past 1 year. A negative number means the company might be issuing new shares. A positive number indicates that the company is buying back shares. | [optional] 
**TotalBuyback3yLow** | Pointer to **float32** | This is the average share buyback rate of the company over the past 1 year. A negative number means the company might be issuing new shares. A positive number indicates that the company is buying back shares. | [optional] 
**TotalBuyback3yMed** | Pointer to **float32** | This is the average share buyback rate of the company over the past 1 year. A negative number means the company might be issuing new shares. A positive number indicates that the company is buying back shares. | [optional] 
**TotalBuyback5y** | Pointer to **float32** | This is the average share buyback rate of the company over the past 5 years. A negative number means the company might be issuing new shares. A positive number indicates that the company is buying back shares. | [optional] 
**TtmEBIT** | Pointer to **float32** | The total EBIT (or operating income) over the trailing 12 months | [optional] 
**TtmEBITDA** | Pointer to **float32** | The total EBITDA over the trailing 12 months | [optional] 
**TtmEps** | Pointer to **float32** | Earnings per share (EPS) is the portion of a company&#39;s profit allocated to each share of common stock. | [optional] 
**TtmEpsNri** | Pointer to **float32** | The earnings per share without nonrecurring items, for the trailing 12 months | [optional] 
**TtmFcfPerShare** | Pointer to **float32** |  | [optional] 
**TtmPretaxincome** | Pointer to **float32** | The total pretax income over the trailing 12 months | [optional] 
**TtmSales** | Pointer to **float32** | Also referred as sales, revenue is income that a company receives from its normal business activities, usually from the sale of goods and services to customers. | [optional] 
**Turnover** | Pointer to **float32** | Asset Turnover measures how quickly a company turns over its asset through sales. It is defined as     &lt;b&gt;Asset Turnover &#x3D; Sales / {Total Assets}&lt;/b&gt;    Companies with low profit margins tend to have high asset turnover, while those with high profit margins have low asset turnover. Companies in the retail industry tend to have a very high turnover ratio. | [optional] 
**Wacc** | Pointer to **float32** | The weighted average cost of capital (WACC) is the rate that a company is expected to pay on average to all its security holders to finance its assets. | [optional] 
**WaccHigh** | Pointer to **float32** |  | [optional] 
**WaccLow** | Pointer to **float32** |  | [optional] 
**WaccMed** | Pointer to **float32** |  | [optional] 
**WaccMed5y** | Pointer to **float32** |  | [optional] 
**YearsOfFinancialHistory** | Pointer to **float32** | Years of Financial History refers to the number of years that a company&#39;s financial records span. It is calculated as the difference in years between the current year and the earliest available financial statement year available on GuruFocus. | [optional] 
**Zscore** | Pointer to **float32** | Z-Score model is an accurate forecaster of failure up to two years prior to distress. It can be considered the assessment of the distress of industrial corporations. | [optional] 
**ZscoreHigh** | Pointer to **float32** | Z-Score model is an accurate forecaster of failure up to two years prior to distress. It can be considered the assessment of the distress of industrial corporations. | [optional] 
**ZscoreLow** | Pointer to **float32** | Z-Score model is an accurate forecaster of failure up to two years prior to distress. It can be considered the assessment of the distress of industrial corporations. | [optional] 
**ZscoreMed** | Pointer to **float32** | Z-Score model is an accurate forecaster of failure up to two years prior to distress. It can be considered the assessment of the distress of industrial corporations. | [optional] 

## Methods

### NewStockProfileFundamental

`func NewStockProfileFundamental() *StockProfileFundamental`

NewStockProfileFundamental instantiates a new StockProfileFundamental object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStockProfileFundamentalWithDefaults

`func NewStockProfileFundamentalWithDefaults() *StockProfileFundamental`

NewStockProfileFundamentalWithDefaults instantiates a new StockProfileFundamental object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEffectiveInterestRate

`func (o *StockProfileFundamental) GetEffectiveInterestRate() float32`

GetEffectiveInterestRate returns the EffectiveInterestRate field if non-nil, zero value otherwise.

### GetEffectiveInterestRateOk

`func (o *StockProfileFundamental) GetEffectiveInterestRateOk() (*float32, bool)`

GetEffectiveInterestRateOk returns a tuple with the EffectiveInterestRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectiveInterestRate

`func (o *StockProfileFundamental) SetEffectiveInterestRate(v float32)`

SetEffectiveInterestRate sets EffectiveInterestRate field to given value.

### HasEffectiveInterestRate

`func (o *StockProfileFundamental) HasEffectiveInterestRate() bool`

HasEffectiveInterestRate returns a boolean if a field has been set.

### GetInsiderSharesOwned

`func (o *StockProfileFundamental) GetInsiderSharesOwned() float32`

GetInsiderSharesOwned returns the InsiderSharesOwned field if non-nil, zero value otherwise.

### GetInsiderSharesOwnedOk

`func (o *StockProfileFundamental) GetInsiderSharesOwnedOk() (*float32, bool)`

GetInsiderSharesOwnedOk returns a tuple with the InsiderSharesOwned field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInsiderSharesOwned

`func (o *StockProfileFundamental) SetInsiderSharesOwned(v float32)`

SetInsiderSharesOwned sets InsiderSharesOwned field to given value.

### HasInsiderSharesOwned

`func (o *StockProfileFundamental) HasInsiderSharesOwned() bool`

HasInsiderSharesOwned returns a boolean if a field has been set.

### GetInstitutionSharesHeld

`func (o *StockProfileFundamental) GetInstitutionSharesHeld() float32`

GetInstitutionSharesHeld returns the InstitutionSharesHeld field if non-nil, zero value otherwise.

### GetInstitutionSharesHeldOk

`func (o *StockProfileFundamental) GetInstitutionSharesHeldOk() (*float32, bool)`

GetInstitutionSharesHeldOk returns a tuple with the InstitutionSharesHeld field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstitutionSharesHeld

`func (o *StockProfileFundamental) SetInstitutionSharesHeld(v float32)`

SetInstitutionSharesHeld sets InstitutionSharesHeld field to given value.

### HasInstitutionSharesHeld

`func (o *StockProfileFundamental) HasInstitutionSharesHeld() bool`

HasInstitutionSharesHeld returns a boolean if a field has been set.

### GetPFD

`func (o *StockProfileFundamental) GetPFD() float32`

GetPFD returns the PFD field if non-nil, zero value otherwise.

### GetPFDOk

`func (o *StockProfileFundamental) GetPFDOk() (*float32, bool)`

GetPFDOk returns a tuple with the PFD field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPFD

`func (o *StockProfileFundamental) SetPFD(v float32)`

SetPFD sets PFD field to given value.

### HasPFD

`func (o *StockProfileFundamental) HasPFD() bool`

HasPFD returns a boolean if a field has been set.

### GetROC_JOEL

`func (o *StockProfileFundamental) GetROC_JOEL() float32`

GetROC_JOEL returns the ROC_JOEL field if non-nil, zero value otherwise.

### GetROC_JOELOk

`func (o *StockProfileFundamental) GetROC_JOELOk() (*float32, bool)`

GetROC_JOELOk returns a tuple with the ROC_JOEL field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetROC_JOEL

`func (o *StockProfileFundamental) SetROC_JOEL(v float32)`

SetROC_JOEL sets ROC_JOEL field to given value.

### HasROC_JOEL

`func (o *StockProfileFundamental) HasROC_JOEL() bool`

HasROC_JOEL returns a boolean if a field has been set.

### GetROCJOELHigh

`func (o *StockProfileFundamental) GetROCJOELHigh() float32`

GetROCJOELHigh returns the ROCJOELHigh field if non-nil, zero value otherwise.

### GetROCJOELHighOk

`func (o *StockProfileFundamental) GetROCJOELHighOk() (*float32, bool)`

GetROCJOELHighOk returns a tuple with the ROCJOELHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetROCJOELHigh

`func (o *StockProfileFundamental) SetROCJOELHigh(v float32)`

SetROCJOELHigh sets ROCJOELHigh field to given value.

### HasROCJOELHigh

`func (o *StockProfileFundamental) HasROCJOELHigh() bool`

HasROCJOELHigh returns a boolean if a field has been set.

### GetROCJOELLow

`func (o *StockProfileFundamental) GetROCJOELLow() float32`

GetROCJOELLow returns the ROCJOELLow field if non-nil, zero value otherwise.

### GetROCJOELLowOk

`func (o *StockProfileFundamental) GetROCJOELLowOk() (*float32, bool)`

GetROCJOELLowOk returns a tuple with the ROCJOELLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetROCJOELLow

`func (o *StockProfileFundamental) SetROCJOELLow(v float32)`

SetROCJOELLow sets ROCJOELLow field to given value.

### HasROCJOELLow

`func (o *StockProfileFundamental) HasROCJOELLow() bool`

HasROCJOELLow returns a boolean if a field has been set.

### GetROCJOELMed

`func (o *StockProfileFundamental) GetROCJOELMed() float32`

GetROCJOELMed returns the ROCJOELMed field if non-nil, zero value otherwise.

### GetROCJOELMedOk

`func (o *StockProfileFundamental) GetROCJOELMedOk() (*float32, bool)`

GetROCJOELMedOk returns a tuple with the ROCJOELMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetROCJOELMed

`func (o *StockProfileFundamental) SetROCJOELMed(v float32)`

SetROCJOELMed sets ROCJOELMed field to given value.

### HasROCJOELMed

`func (o *StockProfileFundamental) HasROCJOELMed() bool`

HasROCJOELMed returns a boolean if a field has been set.

### GetROCJOELMed5y

`func (o *StockProfileFundamental) GetROCJOELMed5y() float32`

GetROCJOELMed5y returns the ROCJOELMed5y field if non-nil, zero value otherwise.

### GetROCJOELMed5yOk

`func (o *StockProfileFundamental) GetROCJOELMed5yOk() (*float32, bool)`

GetROCJOELMed5yOk returns a tuple with the ROCJOELMed5y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetROCJOELMed5y

`func (o *StockProfileFundamental) SetROCJOELMed5y(v float32)`

SetROCJOELMed5y sets ROCJOELMed5y field to given value.

### HasROCJOELMed5y

`func (o *StockProfileFundamental) HasROCJOELMed5y() bool`

HasROCJOELMed5y returns a boolean if a field has been set.

### GetROTA

`func (o *StockProfileFundamental) GetROTA() float32`

GetROTA returns the ROTA field if non-nil, zero value otherwise.

### GetROTAOk

`func (o *StockProfileFundamental) GetROTAOk() (*float32, bool)`

GetROTAOk returns a tuple with the ROTA field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetROTA

`func (o *StockProfileFundamental) SetROTA(v float32)`

SetROTA sets ROTA field to given value.

### HasROTA

`func (o *StockProfileFundamental) HasROTA() bool`

HasROTA returns a boolean if a field has been set.

### GetROTAHigh

`func (o *StockProfileFundamental) GetROTAHigh() float32`

GetROTAHigh returns the ROTAHigh field if non-nil, zero value otherwise.

### GetROTAHighOk

`func (o *StockProfileFundamental) GetROTAHighOk() (*float32, bool)`

GetROTAHighOk returns a tuple with the ROTAHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetROTAHigh

`func (o *StockProfileFundamental) SetROTAHigh(v float32)`

SetROTAHigh sets ROTAHigh field to given value.

### HasROTAHigh

`func (o *StockProfileFundamental) HasROTAHigh() bool`

HasROTAHigh returns a boolean if a field has been set.

### GetROTALow

`func (o *StockProfileFundamental) GetROTALow() float32`

GetROTALow returns the ROTALow field if non-nil, zero value otherwise.

### GetROTALowOk

`func (o *StockProfileFundamental) GetROTALowOk() (*float32, bool)`

GetROTALowOk returns a tuple with the ROTALow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetROTALow

`func (o *StockProfileFundamental) SetROTALow(v float32)`

SetROTALow sets ROTALow field to given value.

### HasROTALow

`func (o *StockProfileFundamental) HasROTALow() bool`

HasROTALow returns a boolean if a field has been set.

### GetROTAMed

`func (o *StockProfileFundamental) GetROTAMed() float32`

GetROTAMed returns the ROTAMed field if non-nil, zero value otherwise.

### GetROTAMedOk

`func (o *StockProfileFundamental) GetROTAMedOk() (*float32, bool)`

GetROTAMedOk returns a tuple with the ROTAMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetROTAMed

`func (o *StockProfileFundamental) SetROTAMed(v float32)`

SetROTAMed sets ROTAMed field to given value.

### HasROTAMed

`func (o *StockProfileFundamental) HasROTAMed() bool`

HasROTAMed returns a boolean if a field has been set.

### GetROTE

`func (o *StockProfileFundamental) GetROTE() float32`

GetROTE returns the ROTE field if non-nil, zero value otherwise.

### GetROTEOk

`func (o *StockProfileFundamental) GetROTEOk() (*float32, bool)`

GetROTEOk returns a tuple with the ROTE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetROTE

`func (o *StockProfileFundamental) SetROTE(v float32)`

SetROTE sets ROTE field to given value.

### HasROTE

`func (o *StockProfileFundamental) HasROTE() bool`

HasROTE returns a boolean if a field has been set.

### GetROTEHigh

`func (o *StockProfileFundamental) GetROTEHigh() float32`

GetROTEHigh returns the ROTEHigh field if non-nil, zero value otherwise.

### GetROTEHighOk

`func (o *StockProfileFundamental) GetROTEHighOk() (*float32, bool)`

GetROTEHighOk returns a tuple with the ROTEHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetROTEHigh

`func (o *StockProfileFundamental) SetROTEHigh(v float32)`

SetROTEHigh sets ROTEHigh field to given value.

### HasROTEHigh

`func (o *StockProfileFundamental) HasROTEHigh() bool`

HasROTEHigh returns a boolean if a field has been set.

### GetROTELow

`func (o *StockProfileFundamental) GetROTELow() float32`

GetROTELow returns the ROTELow field if non-nil, zero value otherwise.

### GetROTELowOk

`func (o *StockProfileFundamental) GetROTELowOk() (*float32, bool)`

GetROTELowOk returns a tuple with the ROTELow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetROTELow

`func (o *StockProfileFundamental) SetROTELow(v float32)`

SetROTELow sets ROTELow field to given value.

### HasROTELow

`func (o *StockProfileFundamental) HasROTELow() bool`

HasROTELow returns a boolean if a field has been set.

### GetROTEMed

`func (o *StockProfileFundamental) GetROTEMed() float32`

GetROTEMed returns the ROTEMed field if non-nil, zero value otherwise.

### GetROTEMedOk

`func (o *StockProfileFundamental) GetROTEMedOk() (*float32, bool)`

GetROTEMedOk returns a tuple with the ROTEMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetROTEMed

`func (o *StockProfileFundamental) SetROTEMed(v float32)`

SetROTEMed sets ROTEMed field to given value.

### HasROTEMed

`func (o *StockProfileFundamental) HasROTEMed() bool`

HasROTEMed returns a boolean if a field has been set.

### GetROTEMed5y

`func (o *StockProfileFundamental) GetROTEMed5y() float32`

GetROTEMed5y returns the ROTEMed5y field if non-nil, zero value otherwise.

### GetROTEMed5yOk

`func (o *StockProfileFundamental) GetROTEMed5yOk() (*float32, bool)`

GetROTEMed5yOk returns a tuple with the ROTEMed5y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetROTEMed5y

`func (o *StockProfileFundamental) SetROTEMed5y(v float32)`

SetROTEMed5y sets ROTEMed5y field to given value.

### HasROTEMed5y

`func (o *StockProfileFundamental) HasROTEMed5y() bool`

HasROTEMed5y returns a boolean if a field has been set.

### GetSGA

`func (o *StockProfileFundamental) GetSGA() float32`

GetSGA returns the SGA field if non-nil, zero value otherwise.

### GetSGAOk

`func (o *StockProfileFundamental) GetSGAOk() (*float32, bool)`

GetSGAOk returns a tuple with the SGA field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSGA

`func (o *StockProfileFundamental) SetSGA(v float32)`

SetSGA sets SGA field to given value.

### HasSGA

`func (o *StockProfileFundamental) HasSGA() bool`

HasSGA returns a boolean if a field has been set.

### GetSNOA

`func (o *StockProfileFundamental) GetSNOA() float32`

GetSNOA returns the SNOA field if non-nil, zero value otherwise.

### GetSNOAOk

`func (o *StockProfileFundamental) GetSNOAOk() (*float32, bool)`

GetSNOAOk returns a tuple with the SNOA field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSNOA

`func (o *StockProfileFundamental) SetSNOA(v float32)`

SetSNOA sets SNOA field to given value.

### HasSNOA

`func (o *StockProfileFundamental) HasSNOA() bool`

HasSNOA returns a boolean if a field has been set.

### GetTotalPayoutRatio

`func (o *StockProfileFundamental) GetTotalPayoutRatio() float32`

GetTotalPayoutRatio returns the TotalPayoutRatio field if non-nil, zero value otherwise.

### GetTotalPayoutRatioOk

`func (o *StockProfileFundamental) GetTotalPayoutRatioOk() (*float32, bool)`

GetTotalPayoutRatioOk returns a tuple with the TotalPayoutRatio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalPayoutRatio

`func (o *StockProfileFundamental) SetTotalPayoutRatio(v float32)`

SetTotalPayoutRatio sets TotalPayoutRatio field to given value.

### HasTotalPayoutRatio

`func (o *StockProfileFundamental) HasTotalPayoutRatio() bool`

HasTotalPayoutRatio returns a boolean if a field has been set.

### GetTotalPayoutYield

`func (o *StockProfileFundamental) GetTotalPayoutYield() float32`

GetTotalPayoutYield returns the TotalPayoutYield field if non-nil, zero value otherwise.

### GetTotalPayoutYieldOk

`func (o *StockProfileFundamental) GetTotalPayoutYieldOk() (*float32, bool)`

GetTotalPayoutYieldOk returns a tuple with the TotalPayoutYield field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalPayoutYield

`func (o *StockProfileFundamental) SetTotalPayoutYield(v float32)`

SetTotalPayoutYield sets TotalPayoutYield field to given value.

### HasTotalPayoutYield

`func (o *StockProfileFundamental) HasTotalPayoutYield() bool`

HasTotalPayoutYield returns a boolean if a field has been set.

### GetAfinancialsStartDate

`func (o *StockProfileFundamental) GetAfinancialsStartDate() string`

GetAfinancialsStartDate returns the AfinancialsStartDate field if non-nil, zero value otherwise.

### GetAfinancialsStartDateOk

`func (o *StockProfileFundamental) GetAfinancialsStartDateOk() (*string, bool)`

GetAfinancialsStartDateOk returns a tuple with the AfinancialsStartDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAfinancialsStartDate

`func (o *StockProfileFundamental) SetAfinancialsStartDate(v string)`

SetAfinancialsStartDate sets AfinancialsStartDate field to given value.

### HasAfinancialsStartDate

`func (o *StockProfileFundamental) HasAfinancialsStartDate() bool`

HasAfinancialsStartDate returns a boolean if a field has been set.

### GetAsset

`func (o *StockProfileFundamental) GetAsset() float32`

GetAsset returns the Asset field if non-nil, zero value otherwise.

### GetAssetOk

`func (o *StockProfileFundamental) GetAssetOk() (*float32, bool)`

GetAssetOk returns a tuple with the Asset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAsset

`func (o *StockProfileFundamental) SetAsset(v float32)`

SetAsset sets Asset field to given value.

### HasAsset

`func (o *StockProfileFundamental) HasAsset() bool`

HasAsset returns a boolean if a field has been set.

### GetBook

`func (o *StockProfileFundamental) GetBook() float32`

GetBook returns the Book field if non-nil, zero value otherwise.

### GetBookOk

`func (o *StockProfileFundamental) GetBookOk() (*float32, bool)`

GetBookOk returns a tuple with the Book field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBook

`func (o *StockProfileFundamental) SetBook(v float32)`

SetBook sets Book field to given value.

### HasBook

`func (o *StockProfileFundamental) HasBook() bool`

HasBook returns a boolean if a field has been set.

### GetBuybackYield

`func (o *StockProfileFundamental) GetBuybackYield() float32`

GetBuybackYield returns the BuybackYield field if non-nil, zero value otherwise.

### GetBuybackYieldOk

`func (o *StockProfileFundamental) GetBuybackYieldOk() (*float32, bool)`

GetBuybackYieldOk returns a tuple with the BuybackYield field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBuybackYield

`func (o *StockProfileFundamental) SetBuybackYield(v float32)`

SetBuybackYield sets BuybackYield field to given value.

### HasBuybackYield

`func (o *StockProfileFundamental) HasBuybackYield() bool`

HasBuybackYield returns a boolean if a field has been set.

### GetBuybackYieldHigh

`func (o *StockProfileFundamental) GetBuybackYieldHigh() float32`

GetBuybackYieldHigh returns the BuybackYieldHigh field if non-nil, zero value otherwise.

### GetBuybackYieldHighOk

`func (o *StockProfileFundamental) GetBuybackYieldHighOk() (*float32, bool)`

GetBuybackYieldHighOk returns a tuple with the BuybackYieldHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBuybackYieldHigh

`func (o *StockProfileFundamental) SetBuybackYieldHigh(v float32)`

SetBuybackYieldHigh sets BuybackYieldHigh field to given value.

### HasBuybackYieldHigh

`func (o *StockProfileFundamental) HasBuybackYieldHigh() bool`

HasBuybackYieldHigh returns a boolean if a field has been set.

### GetBuybackYieldLow

`func (o *StockProfileFundamental) GetBuybackYieldLow() float32`

GetBuybackYieldLow returns the BuybackYieldLow field if non-nil, zero value otherwise.

### GetBuybackYieldLowOk

`func (o *StockProfileFundamental) GetBuybackYieldLowOk() (*float32, bool)`

GetBuybackYieldLowOk returns a tuple with the BuybackYieldLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBuybackYieldLow

`func (o *StockProfileFundamental) SetBuybackYieldLow(v float32)`

SetBuybackYieldLow sets BuybackYieldLow field to given value.

### HasBuybackYieldLow

`func (o *StockProfileFundamental) HasBuybackYieldLow() bool`

HasBuybackYieldLow returns a boolean if a field has been set.

### GetBuybackYieldMed

`func (o *StockProfileFundamental) GetBuybackYieldMed() float32`

GetBuybackYieldMed returns the BuybackYieldMed field if non-nil, zero value otherwise.

### GetBuybackYieldMedOk

`func (o *StockProfileFundamental) GetBuybackYieldMedOk() (*float32, bool)`

GetBuybackYieldMedOk returns a tuple with the BuybackYieldMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBuybackYieldMed

`func (o *StockProfileFundamental) SetBuybackYieldMed(v float32)`

SetBuybackYieldMed sets BuybackYieldMed field to given value.

### HasBuybackYieldMed

`func (o *StockProfileFundamental) HasBuybackYieldMed() bool`

HasBuybackYieldMed returns a boolean if a field has been set.

### GetCash2debt

`func (o *StockProfileFundamental) GetCash2debt() float32`

GetCash2debt returns the Cash2debt field if non-nil, zero value otherwise.

### GetCash2debtOk

`func (o *StockProfileFundamental) GetCash2debtOk() (*float32, bool)`

GetCash2debtOk returns a tuple with the Cash2debt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCash2debt

`func (o *StockProfileFundamental) SetCash2debt(v float32)`

SetCash2debt sets Cash2debt field to given value.

### HasCash2debt

`func (o *StockProfileFundamental) HasCash2debt() bool`

HasCash2debt returns a boolean if a field has been set.

### GetCash2debtHigh

`func (o *StockProfileFundamental) GetCash2debtHigh() float32`

GetCash2debtHigh returns the Cash2debtHigh field if non-nil, zero value otherwise.

### GetCash2debtHighOk

`func (o *StockProfileFundamental) GetCash2debtHighOk() (*float32, bool)`

GetCash2debtHighOk returns a tuple with the Cash2debtHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCash2debtHigh

`func (o *StockProfileFundamental) SetCash2debtHigh(v float32)`

SetCash2debtHigh sets Cash2debtHigh field to given value.

### HasCash2debtHigh

`func (o *StockProfileFundamental) HasCash2debtHigh() bool`

HasCash2debtHigh returns a boolean if a field has been set.

### GetCash2debtLow

`func (o *StockProfileFundamental) GetCash2debtLow() float32`

GetCash2debtLow returns the Cash2debtLow field if non-nil, zero value otherwise.

### GetCash2debtLowOk

`func (o *StockProfileFundamental) GetCash2debtLowOk() (*float32, bool)`

GetCash2debtLowOk returns a tuple with the Cash2debtLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCash2debtLow

`func (o *StockProfileFundamental) SetCash2debtLow(v float32)`

SetCash2debtLow sets Cash2debtLow field to given value.

### HasCash2debtLow

`func (o *StockProfileFundamental) HasCash2debtLow() bool`

HasCash2debtLow returns a boolean if a field has been set.

### GetCash2debtMed

`func (o *StockProfileFundamental) GetCash2debtMed() float32`

GetCash2debtMed returns the Cash2debtMed field if non-nil, zero value otherwise.

### GetCash2debtMedOk

`func (o *StockProfileFundamental) GetCash2debtMedOk() (*float32, bool)`

GetCash2debtMedOk returns a tuple with the Cash2debtMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCash2debtMed

`func (o *StockProfileFundamental) SetCash2debtMed(v float32)`

SetCash2debtMed sets Cash2debtMed field to given value.

### HasCash2debtMed

`func (o *StockProfileFundamental) HasCash2debtMed() bool`

HasCash2debtMed returns a boolean if a field has been set.

### GetCashRatio

`func (o *StockProfileFundamental) GetCashRatio() float32`

GetCashRatio returns the CashRatio field if non-nil, zero value otherwise.

### GetCashRatioOk

`func (o *StockProfileFundamental) GetCashRatioOk() (*float32, bool)`

GetCashRatioOk returns a tuple with the CashRatio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashRatio

`func (o *StockProfileFundamental) SetCashRatio(v float32)`

SetCashRatio sets CashRatio field to given value.

### HasCashRatio

`func (o *StockProfileFundamental) HasCashRatio() bool`

HasCashRatio returns a boolean if a field has been set.

### GetCashRatioHigh

`func (o *StockProfileFundamental) GetCashRatioHigh() float32`

GetCashRatioHigh returns the CashRatioHigh field if non-nil, zero value otherwise.

### GetCashRatioHighOk

`func (o *StockProfileFundamental) GetCashRatioHighOk() (*float32, bool)`

GetCashRatioHighOk returns a tuple with the CashRatioHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashRatioHigh

`func (o *StockProfileFundamental) SetCashRatioHigh(v float32)`

SetCashRatioHigh sets CashRatioHigh field to given value.

### HasCashRatioHigh

`func (o *StockProfileFundamental) HasCashRatioHigh() bool`

HasCashRatioHigh returns a boolean if a field has been set.

### GetCashRatioLow

`func (o *StockProfileFundamental) GetCashRatioLow() float32`

GetCashRatioLow returns the CashRatioLow field if non-nil, zero value otherwise.

### GetCashRatioLowOk

`func (o *StockProfileFundamental) GetCashRatioLowOk() (*float32, bool)`

GetCashRatioLowOk returns a tuple with the CashRatioLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashRatioLow

`func (o *StockProfileFundamental) SetCashRatioLow(v float32)`

SetCashRatioLow sets CashRatioLow field to given value.

### HasCashRatioLow

`func (o *StockProfileFundamental) HasCashRatioLow() bool`

HasCashRatioLow returns a boolean if a field has been set.

### GetCashRatioMed

`func (o *StockProfileFundamental) GetCashRatioMed() float32`

GetCashRatioMed returns the CashRatioMed field if non-nil, zero value otherwise.

### GetCashRatioMedOk

`func (o *StockProfileFundamental) GetCashRatioMedOk() (*float32, bool)`

GetCashRatioMedOk returns a tuple with the CashRatioMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCashRatioMed

`func (o *StockProfileFundamental) SetCashRatioMed(v float32)`

SetCashRatioMed sets CashRatioMed field to given value.

### HasCashRatioMed

`func (o *StockProfileFundamental) HasCashRatioMed() bool`

HasCashRatioMed returns a boolean if a field has been set.

### GetCcc

`func (o *StockProfileFundamental) GetCcc() float32`

GetCcc returns the Ccc field if non-nil, zero value otherwise.

### GetCccOk

`func (o *StockProfileFundamental) GetCccOk() (*float32, bool)`

GetCccOk returns a tuple with the Ccc field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCcc

`func (o *StockProfileFundamental) SetCcc(v float32)`

SetCcc sets Ccc field to given value.

### HasCcc

`func (o *StockProfileFundamental) HasCcc() bool`

HasCcc returns a boolean if a field has been set.

### GetCorrelationBook

`func (o *StockProfileFundamental) GetCorrelationBook() float32`

GetCorrelationBook returns the CorrelationBook field if non-nil, zero value otherwise.

### GetCorrelationBookOk

`func (o *StockProfileFundamental) GetCorrelationBookOk() (*float32, bool)`

GetCorrelationBookOk returns a tuple with the CorrelationBook field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCorrelationBook

`func (o *StockProfileFundamental) SetCorrelationBook(v float32)`

SetCorrelationBook sets CorrelationBook field to given value.

### HasCorrelationBook

`func (o *StockProfileFundamental) HasCorrelationBook() bool`

HasCorrelationBook returns a boolean if a field has been set.

### GetCorrelationEpsNri

`func (o *StockProfileFundamental) GetCorrelationEpsNri() float32`

GetCorrelationEpsNri returns the CorrelationEpsNri field if non-nil, zero value otherwise.

### GetCorrelationEpsNriOk

`func (o *StockProfileFundamental) GetCorrelationEpsNriOk() (*float32, bool)`

GetCorrelationEpsNriOk returns a tuple with the CorrelationEpsNri field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCorrelationEpsNri

`func (o *StockProfileFundamental) SetCorrelationEpsNri(v float32)`

SetCorrelationEpsNri sets CorrelationEpsNri field to given value.

### HasCorrelationEpsNri

`func (o *StockProfileFundamental) HasCorrelationEpsNri() bool`

HasCorrelationEpsNri returns a boolean if a field has been set.

### GetCorrelationEvVsEbit

`func (o *StockProfileFundamental) GetCorrelationEvVsEbit() float32`

GetCorrelationEvVsEbit returns the CorrelationEvVsEbit field if non-nil, zero value otherwise.

### GetCorrelationEvVsEbitOk

`func (o *StockProfileFundamental) GetCorrelationEvVsEbitOk() (*float32, bool)`

GetCorrelationEvVsEbitOk returns a tuple with the CorrelationEvVsEbit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCorrelationEvVsEbit

`func (o *StockProfileFundamental) SetCorrelationEvVsEbit(v float32)`

SetCorrelationEvVsEbit sets CorrelationEvVsEbit field to given value.

### HasCorrelationEvVsEbit

`func (o *StockProfileFundamental) HasCorrelationEvVsEbit() bool`

HasCorrelationEvVsEbit returns a boolean if a field has been set.

### GetCorrelationEvVsEbitda

`func (o *StockProfileFundamental) GetCorrelationEvVsEbitda() float32`

GetCorrelationEvVsEbitda returns the CorrelationEvVsEbitda field if non-nil, zero value otherwise.

### GetCorrelationEvVsEbitdaOk

`func (o *StockProfileFundamental) GetCorrelationEvVsEbitdaOk() (*float32, bool)`

GetCorrelationEvVsEbitdaOk returns a tuple with the CorrelationEvVsEbitda field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCorrelationEvVsEbitda

`func (o *StockProfileFundamental) SetCorrelationEvVsEbitda(v float32)`

SetCorrelationEvVsEbitda sets CorrelationEvVsEbitda field to given value.

### HasCorrelationEvVsEbitda

`func (o *StockProfileFundamental) HasCorrelationEvVsEbitda() bool`

HasCorrelationEvVsEbitda returns a boolean if a field has been set.

### GetCorrelationEvVsFcf

`func (o *StockProfileFundamental) GetCorrelationEvVsFcf() float32`

GetCorrelationEvVsFcf returns the CorrelationEvVsFcf field if non-nil, zero value otherwise.

### GetCorrelationEvVsFcfOk

`func (o *StockProfileFundamental) GetCorrelationEvVsFcfOk() (*float32, bool)`

GetCorrelationEvVsFcfOk returns a tuple with the CorrelationEvVsFcf field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCorrelationEvVsFcf

`func (o *StockProfileFundamental) SetCorrelationEvVsFcf(v float32)`

SetCorrelationEvVsFcf sets CorrelationEvVsFcf field to given value.

### HasCorrelationEvVsFcf

`func (o *StockProfileFundamental) HasCorrelationEvVsFcf() bool`

HasCorrelationEvVsFcf returns a boolean if a field has been set.

### GetCorrelationEvVsPretaxIncome

`func (o *StockProfileFundamental) GetCorrelationEvVsPretaxIncome() float32`

GetCorrelationEvVsPretaxIncome returns the CorrelationEvVsPretaxIncome field if non-nil, zero value otherwise.

### GetCorrelationEvVsPretaxIncomeOk

`func (o *StockProfileFundamental) GetCorrelationEvVsPretaxIncomeOk() (*float32, bool)`

GetCorrelationEvVsPretaxIncomeOk returns a tuple with the CorrelationEvVsPretaxIncome field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCorrelationEvVsPretaxIncome

`func (o *StockProfileFundamental) SetCorrelationEvVsPretaxIncome(v float32)`

SetCorrelationEvVsPretaxIncome sets CorrelationEvVsPretaxIncome field to given value.

### HasCorrelationEvVsPretaxIncome

`func (o *StockProfileFundamental) HasCorrelationEvVsPretaxIncome() bool`

HasCorrelationEvVsPretaxIncome returns a boolean if a field has been set.

### GetCorrelationEvVsRev

`func (o *StockProfileFundamental) GetCorrelationEvVsRev() float32`

GetCorrelationEvVsRev returns the CorrelationEvVsRev field if non-nil, zero value otherwise.

### GetCorrelationEvVsRevOk

`func (o *StockProfileFundamental) GetCorrelationEvVsRevOk() (*float32, bool)`

GetCorrelationEvVsRevOk returns a tuple with the CorrelationEvVsRev field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCorrelationEvVsRev

`func (o *StockProfileFundamental) SetCorrelationEvVsRev(v float32)`

SetCorrelationEvVsRev sets CorrelationEvVsRev field to given value.

### HasCorrelationEvVsRev

`func (o *StockProfileFundamental) HasCorrelationEvVsRev() bool`

HasCorrelationEvVsRev returns a boolean if a field has been set.

### GetCorrelationOcf

`func (o *StockProfileFundamental) GetCorrelationOcf() float32`

GetCorrelationOcf returns the CorrelationOcf field if non-nil, zero value otherwise.

### GetCorrelationOcfOk

`func (o *StockProfileFundamental) GetCorrelationOcfOk() (*float32, bool)`

GetCorrelationOcfOk returns a tuple with the CorrelationOcf field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCorrelationOcf

`func (o *StockProfileFundamental) SetCorrelationOcf(v float32)`

SetCorrelationOcf sets CorrelationOcf field to given value.

### HasCorrelationOcf

`func (o *StockProfileFundamental) HasCorrelationOcf() bool`

HasCorrelationOcf returns a boolean if a field has been set.

### GetCorrelationRev

`func (o *StockProfileFundamental) GetCorrelationRev() float32`

GetCorrelationRev returns the CorrelationRev field if non-nil, zero value otherwise.

### GetCorrelationRevOk

`func (o *StockProfileFundamental) GetCorrelationRevOk() (*float32, bool)`

GetCorrelationRevOk returns a tuple with the CorrelationRev field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCorrelationRev

`func (o *StockProfileFundamental) SetCorrelationRev(v float32)`

SetCorrelationRev sets CorrelationRev field to given value.

### HasCorrelationRev

`func (o *StockProfileFundamental) HasCorrelationRev() bool`

HasCorrelationRev returns a boolean if a field has been set.

### GetCurrentRatio

`func (o *StockProfileFundamental) GetCurrentRatio() float32`

GetCurrentRatio returns the CurrentRatio field if non-nil, zero value otherwise.

### GetCurrentRatioOk

`func (o *StockProfileFundamental) GetCurrentRatioOk() (*float32, bool)`

GetCurrentRatioOk returns a tuple with the CurrentRatio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrentRatio

`func (o *StockProfileFundamental) SetCurrentRatio(v float32)`

SetCurrentRatio sets CurrentRatio field to given value.

### HasCurrentRatio

`func (o *StockProfileFundamental) HasCurrentRatio() bool`

HasCurrentRatio returns a boolean if a field has been set.

### GetCurrentRatioHigh

`func (o *StockProfileFundamental) GetCurrentRatioHigh() float32`

GetCurrentRatioHigh returns the CurrentRatioHigh field if non-nil, zero value otherwise.

### GetCurrentRatioHighOk

`func (o *StockProfileFundamental) GetCurrentRatioHighOk() (*float32, bool)`

GetCurrentRatioHighOk returns a tuple with the CurrentRatioHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrentRatioHigh

`func (o *StockProfileFundamental) SetCurrentRatioHigh(v float32)`

SetCurrentRatioHigh sets CurrentRatioHigh field to given value.

### HasCurrentRatioHigh

`func (o *StockProfileFundamental) HasCurrentRatioHigh() bool`

HasCurrentRatioHigh returns a boolean if a field has been set.

### GetCurrentRatioLow

`func (o *StockProfileFundamental) GetCurrentRatioLow() float32`

GetCurrentRatioLow returns the CurrentRatioLow field if non-nil, zero value otherwise.

### GetCurrentRatioLowOk

`func (o *StockProfileFundamental) GetCurrentRatioLowOk() (*float32, bool)`

GetCurrentRatioLowOk returns a tuple with the CurrentRatioLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrentRatioLow

`func (o *StockProfileFundamental) SetCurrentRatioLow(v float32)`

SetCurrentRatioLow sets CurrentRatioLow field to given value.

### HasCurrentRatioLow

`func (o *StockProfileFundamental) HasCurrentRatioLow() bool`

HasCurrentRatioLow returns a boolean if a field has been set.

### GetCurrentRatioMed

`func (o *StockProfileFundamental) GetCurrentRatioMed() float32`

GetCurrentRatioMed returns the CurrentRatioMed field if non-nil, zero value otherwise.

### GetCurrentRatioMedOk

`func (o *StockProfileFundamental) GetCurrentRatioMedOk() (*float32, bool)`

GetCurrentRatioMedOk returns a tuple with the CurrentRatioMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrentRatioMed

`func (o *StockProfileFundamental) SetCurrentRatioMed(v float32)`

SetCurrentRatioMed sets CurrentRatioMed field to given value.

### HasCurrentRatioMed

`func (o *StockProfileFundamental) HasCurrentRatioMed() bool`

HasCurrentRatioMed returns a boolean if a field has been set.

### GetDaysinventory

`func (o *StockProfileFundamental) GetDaysinventory() float32`

GetDaysinventory returns the Daysinventory field if non-nil, zero value otherwise.

### GetDaysinventoryOk

`func (o *StockProfileFundamental) GetDaysinventoryOk() (*float32, bool)`

GetDaysinventoryOk returns a tuple with the Daysinventory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDaysinventory

`func (o *StockProfileFundamental) SetDaysinventory(v float32)`

SetDaysinventory sets Daysinventory field to given value.

### HasDaysinventory

`func (o *StockProfileFundamental) HasDaysinventory() bool`

HasDaysinventory returns a boolean if a field has been set.

### GetDaysinventoryHigh

`func (o *StockProfileFundamental) GetDaysinventoryHigh() float32`

GetDaysinventoryHigh returns the DaysinventoryHigh field if non-nil, zero value otherwise.

### GetDaysinventoryHighOk

`func (o *StockProfileFundamental) GetDaysinventoryHighOk() (*float32, bool)`

GetDaysinventoryHighOk returns a tuple with the DaysinventoryHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDaysinventoryHigh

`func (o *StockProfileFundamental) SetDaysinventoryHigh(v float32)`

SetDaysinventoryHigh sets DaysinventoryHigh field to given value.

### HasDaysinventoryHigh

`func (o *StockProfileFundamental) HasDaysinventoryHigh() bool`

HasDaysinventoryHigh returns a boolean if a field has been set.

### GetDaysinventoryLow

`func (o *StockProfileFundamental) GetDaysinventoryLow() float32`

GetDaysinventoryLow returns the DaysinventoryLow field if non-nil, zero value otherwise.

### GetDaysinventoryLowOk

`func (o *StockProfileFundamental) GetDaysinventoryLowOk() (*float32, bool)`

GetDaysinventoryLowOk returns a tuple with the DaysinventoryLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDaysinventoryLow

`func (o *StockProfileFundamental) SetDaysinventoryLow(v float32)`

SetDaysinventoryLow sets DaysinventoryLow field to given value.

### HasDaysinventoryLow

`func (o *StockProfileFundamental) HasDaysinventoryLow() bool`

HasDaysinventoryLow returns a boolean if a field has been set.

### GetDaysinventoryMed

`func (o *StockProfileFundamental) GetDaysinventoryMed() float32`

GetDaysinventoryMed returns the DaysinventoryMed field if non-nil, zero value otherwise.

### GetDaysinventoryMedOk

`func (o *StockProfileFundamental) GetDaysinventoryMedOk() (*float32, bool)`

GetDaysinventoryMedOk returns a tuple with the DaysinventoryMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDaysinventoryMed

`func (o *StockProfileFundamental) SetDaysinventoryMed(v float32)`

SetDaysinventoryMed sets DaysinventoryMed field to given value.

### HasDaysinventoryMed

`func (o *StockProfileFundamental) HasDaysinventoryMed() bool`

HasDaysinventoryMed returns a boolean if a field has been set.

### GetDayspayable

`func (o *StockProfileFundamental) GetDayspayable() float32`

GetDayspayable returns the Dayspayable field if non-nil, zero value otherwise.

### GetDayspayableOk

`func (o *StockProfileFundamental) GetDayspayableOk() (*float32, bool)`

GetDayspayableOk returns a tuple with the Dayspayable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDayspayable

`func (o *StockProfileFundamental) SetDayspayable(v float32)`

SetDayspayable sets Dayspayable field to given value.

### HasDayspayable

`func (o *StockProfileFundamental) HasDayspayable() bool`

HasDayspayable returns a boolean if a field has been set.

### GetDayspayableHigh

`func (o *StockProfileFundamental) GetDayspayableHigh() float32`

GetDayspayableHigh returns the DayspayableHigh field if non-nil, zero value otherwise.

### GetDayspayableHighOk

`func (o *StockProfileFundamental) GetDayspayableHighOk() (*float32, bool)`

GetDayspayableHighOk returns a tuple with the DayspayableHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDayspayableHigh

`func (o *StockProfileFundamental) SetDayspayableHigh(v float32)`

SetDayspayableHigh sets DayspayableHigh field to given value.

### HasDayspayableHigh

`func (o *StockProfileFundamental) HasDayspayableHigh() bool`

HasDayspayableHigh returns a boolean if a field has been set.

### GetDayspayableLow

`func (o *StockProfileFundamental) GetDayspayableLow() float32`

GetDayspayableLow returns the DayspayableLow field if non-nil, zero value otherwise.

### GetDayspayableLowOk

`func (o *StockProfileFundamental) GetDayspayableLowOk() (*float32, bool)`

GetDayspayableLowOk returns a tuple with the DayspayableLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDayspayableLow

`func (o *StockProfileFundamental) SetDayspayableLow(v float32)`

SetDayspayableLow sets DayspayableLow field to given value.

### HasDayspayableLow

`func (o *StockProfileFundamental) HasDayspayableLow() bool`

HasDayspayableLow returns a boolean if a field has been set.

### GetDayspayableMed

`func (o *StockProfileFundamental) GetDayspayableMed() float32`

GetDayspayableMed returns the DayspayableMed field if non-nil, zero value otherwise.

### GetDayspayableMedOk

`func (o *StockProfileFundamental) GetDayspayableMedOk() (*float32, bool)`

GetDayspayableMedOk returns a tuple with the DayspayableMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDayspayableMed

`func (o *StockProfileFundamental) SetDayspayableMed(v float32)`

SetDayspayableMed sets DayspayableMed field to given value.

### HasDayspayableMed

`func (o *StockProfileFundamental) HasDayspayableMed() bool`

HasDayspayableMed returns a boolean if a field has been set.

### GetDayssalesoutstand

`func (o *StockProfileFundamental) GetDayssalesoutstand() float32`

GetDayssalesoutstand returns the Dayssalesoutstand field if non-nil, zero value otherwise.

### GetDayssalesoutstandOk

`func (o *StockProfileFundamental) GetDayssalesoutstandOk() (*float32, bool)`

GetDayssalesoutstandOk returns a tuple with the Dayssalesoutstand field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDayssalesoutstand

`func (o *StockProfileFundamental) SetDayssalesoutstand(v float32)`

SetDayssalesoutstand sets Dayssalesoutstand field to given value.

### HasDayssalesoutstand

`func (o *StockProfileFundamental) HasDayssalesoutstand() bool`

HasDayssalesoutstand returns a boolean if a field has been set.

### GetDayssalesoutstandHigh

`func (o *StockProfileFundamental) GetDayssalesoutstandHigh() float32`

GetDayssalesoutstandHigh returns the DayssalesoutstandHigh field if non-nil, zero value otherwise.

### GetDayssalesoutstandHighOk

`func (o *StockProfileFundamental) GetDayssalesoutstandHighOk() (*float32, bool)`

GetDayssalesoutstandHighOk returns a tuple with the DayssalesoutstandHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDayssalesoutstandHigh

`func (o *StockProfileFundamental) SetDayssalesoutstandHigh(v float32)`

SetDayssalesoutstandHigh sets DayssalesoutstandHigh field to given value.

### HasDayssalesoutstandHigh

`func (o *StockProfileFundamental) HasDayssalesoutstandHigh() bool`

HasDayssalesoutstandHigh returns a boolean if a field has been set.

### GetDayssalesoutstandLow

`func (o *StockProfileFundamental) GetDayssalesoutstandLow() float32`

GetDayssalesoutstandLow returns the DayssalesoutstandLow field if non-nil, zero value otherwise.

### GetDayssalesoutstandLowOk

`func (o *StockProfileFundamental) GetDayssalesoutstandLowOk() (*float32, bool)`

GetDayssalesoutstandLowOk returns a tuple with the DayssalesoutstandLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDayssalesoutstandLow

`func (o *StockProfileFundamental) SetDayssalesoutstandLow(v float32)`

SetDayssalesoutstandLow sets DayssalesoutstandLow field to given value.

### HasDayssalesoutstandLow

`func (o *StockProfileFundamental) HasDayssalesoutstandLow() bool`

HasDayssalesoutstandLow returns a boolean if a field has been set.

### GetDayssalesoutstandMed

`func (o *StockProfileFundamental) GetDayssalesoutstandMed() float32`

GetDayssalesoutstandMed returns the DayssalesoutstandMed field if non-nil, zero value otherwise.

### GetDayssalesoutstandMedOk

`func (o *StockProfileFundamental) GetDayssalesoutstandMedOk() (*float32, bool)`

GetDayssalesoutstandMedOk returns a tuple with the DayssalesoutstandMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDayssalesoutstandMed

`func (o *StockProfileFundamental) SetDayssalesoutstandMed(v float32)`

SetDayssalesoutstandMed sets DayssalesoutstandMed field to given value.

### HasDayssalesoutstandMed

`func (o *StockProfileFundamental) HasDayssalesoutstandMed() bool`

HasDayssalesoutstandMed returns a boolean if a field has been set.

### GetDebt2asset

`func (o *StockProfileFundamental) GetDebt2asset() float32`

GetDebt2asset returns the Debt2asset field if non-nil, zero value otherwise.

### GetDebt2assetOk

`func (o *StockProfileFundamental) GetDebt2assetOk() (*float32, bool)`

GetDebt2assetOk returns a tuple with the Debt2asset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDebt2asset

`func (o *StockProfileFundamental) SetDebt2asset(v float32)`

SetDebt2asset sets Debt2asset field to given value.

### HasDebt2asset

`func (o *StockProfileFundamental) HasDebt2asset() bool`

HasDebt2asset returns a boolean if a field has been set.

### GetDebt2ebitda

`func (o *StockProfileFundamental) GetDebt2ebitda() float32`

GetDebt2ebitda returns the Debt2ebitda field if non-nil, zero value otherwise.

### GetDebt2ebitdaOk

`func (o *StockProfileFundamental) GetDebt2ebitdaOk() (*float32, bool)`

GetDebt2ebitdaOk returns a tuple with the Debt2ebitda field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDebt2ebitda

`func (o *StockProfileFundamental) SetDebt2ebitda(v float32)`

SetDebt2ebitda sets Debt2ebitda field to given value.

### HasDebt2ebitda

`func (o *StockProfileFundamental) HasDebt2ebitda() bool`

HasDebt2ebitda returns a boolean if a field has been set.

### GetDebt2ebitdaHigh

`func (o *StockProfileFundamental) GetDebt2ebitdaHigh() float32`

GetDebt2ebitdaHigh returns the Debt2ebitdaHigh field if non-nil, zero value otherwise.

### GetDebt2ebitdaHighOk

`func (o *StockProfileFundamental) GetDebt2ebitdaHighOk() (*float32, bool)`

GetDebt2ebitdaHighOk returns a tuple with the Debt2ebitdaHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDebt2ebitdaHigh

`func (o *StockProfileFundamental) SetDebt2ebitdaHigh(v float32)`

SetDebt2ebitdaHigh sets Debt2ebitdaHigh field to given value.

### HasDebt2ebitdaHigh

`func (o *StockProfileFundamental) HasDebt2ebitdaHigh() bool`

HasDebt2ebitdaHigh returns a boolean if a field has been set.

### GetDebt2ebitdaLow

`func (o *StockProfileFundamental) GetDebt2ebitdaLow() float32`

GetDebt2ebitdaLow returns the Debt2ebitdaLow field if non-nil, zero value otherwise.

### GetDebt2ebitdaLowOk

`func (o *StockProfileFundamental) GetDebt2ebitdaLowOk() (*float32, bool)`

GetDebt2ebitdaLowOk returns a tuple with the Debt2ebitdaLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDebt2ebitdaLow

`func (o *StockProfileFundamental) SetDebt2ebitdaLow(v float32)`

SetDebt2ebitdaLow sets Debt2ebitdaLow field to given value.

### HasDebt2ebitdaLow

`func (o *StockProfileFundamental) HasDebt2ebitdaLow() bool`

HasDebt2ebitdaLow returns a boolean if a field has been set.

### GetDebt2ebitdaMed

`func (o *StockProfileFundamental) GetDebt2ebitdaMed() float32`

GetDebt2ebitdaMed returns the Debt2ebitdaMed field if non-nil, zero value otherwise.

### GetDebt2ebitdaMedOk

`func (o *StockProfileFundamental) GetDebt2ebitdaMedOk() (*float32, bool)`

GetDebt2ebitdaMedOk returns a tuple with the Debt2ebitdaMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDebt2ebitdaMed

`func (o *StockProfileFundamental) SetDebt2ebitdaMed(v float32)`

SetDebt2ebitdaMed sets Debt2ebitdaMed field to given value.

### HasDebt2ebitdaMed

`func (o *StockProfileFundamental) HasDebt2ebitdaMed() bool`

HasDebt2ebitdaMed returns a boolean if a field has been set.

### GetDebt2equity

`func (o *StockProfileFundamental) GetDebt2equity() float32`

GetDebt2equity returns the Debt2equity field if non-nil, zero value otherwise.

### GetDebt2equityOk

`func (o *StockProfileFundamental) GetDebt2equityOk() (*float32, bool)`

GetDebt2equityOk returns a tuple with the Debt2equity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDebt2equity

`func (o *StockProfileFundamental) SetDebt2equity(v float32)`

SetDebt2equity sets Debt2equity field to given value.

### HasDebt2equity

`func (o *StockProfileFundamental) HasDebt2equity() bool`

HasDebt2equity returns a boolean if a field has been set.

### GetDebt2equityHigh

`func (o *StockProfileFundamental) GetDebt2equityHigh() float32`

GetDebt2equityHigh returns the Debt2equityHigh field if non-nil, zero value otherwise.

### GetDebt2equityHighOk

`func (o *StockProfileFundamental) GetDebt2equityHighOk() (*float32, bool)`

GetDebt2equityHighOk returns a tuple with the Debt2equityHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDebt2equityHigh

`func (o *StockProfileFundamental) SetDebt2equityHigh(v float32)`

SetDebt2equityHigh sets Debt2equityHigh field to given value.

### HasDebt2equityHigh

`func (o *StockProfileFundamental) HasDebt2equityHigh() bool`

HasDebt2equityHigh returns a boolean if a field has been set.

### GetDebt2equityLow

`func (o *StockProfileFundamental) GetDebt2equityLow() float32`

GetDebt2equityLow returns the Debt2equityLow field if non-nil, zero value otherwise.

### GetDebt2equityLowOk

`func (o *StockProfileFundamental) GetDebt2equityLowOk() (*float32, bool)`

GetDebt2equityLowOk returns a tuple with the Debt2equityLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDebt2equityLow

`func (o *StockProfileFundamental) SetDebt2equityLow(v float32)`

SetDebt2equityLow sets Debt2equityLow field to given value.

### HasDebt2equityLow

`func (o *StockProfileFundamental) HasDebt2equityLow() bool`

HasDebt2equityLow returns a boolean if a field has been set.

### GetDebt2equityMed

`func (o *StockProfileFundamental) GetDebt2equityMed() float32`

GetDebt2equityMed returns the Debt2equityMed field if non-nil, zero value otherwise.

### GetDebt2equityMedOk

`func (o *StockProfileFundamental) GetDebt2equityMedOk() (*float32, bool)`

GetDebt2equityMedOk returns a tuple with the Debt2equityMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDebt2equityMed

`func (o *StockProfileFundamental) SetDebt2equityMed(v float32)`

SetDebt2equityMed sets Debt2equityMed field to given value.

### HasDebt2equityMed

`func (o *StockProfileFundamental) HasDebt2equityMed() bool`

HasDebt2equityMed returns a boolean if a field has been set.

### GetDebt2rev

`func (o *StockProfileFundamental) GetDebt2rev() float32`

GetDebt2rev returns the Debt2rev field if non-nil, zero value otherwise.

### GetDebt2revOk

`func (o *StockProfileFundamental) GetDebt2revOk() (*float32, bool)`

GetDebt2revOk returns a tuple with the Debt2rev field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDebt2rev

`func (o *StockProfileFundamental) SetDebt2rev(v float32)`

SetDebt2rev sets Debt2rev field to given value.

### HasDebt2rev

`func (o *StockProfileFundamental) HasDebt2rev() bool`

HasDebt2rev returns a boolean if a field has been set.

### GetEps

`func (o *StockProfileFundamental) GetEps() float32`

GetEps returns the Eps field if non-nil, zero value otherwise.

### GetEpsOk

`func (o *StockProfileFundamental) GetEpsOk() (*float32, bool)`

GetEpsOk returns a tuple with the Eps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEps

`func (o *StockProfileFundamental) SetEps(v float32)`

SetEps sets Eps field to given value.

### HasEps

`func (o *StockProfileFundamental) HasEps() bool`

HasEps returns a boolean if a field has been set.

### GetEpsLatestQ

`func (o *StockProfileFundamental) GetEpsLatestQ() float32`

GetEpsLatestQ returns the EpsLatestQ field if non-nil, zero value otherwise.

### GetEpsLatestQOk

`func (o *StockProfileFundamental) GetEpsLatestQOk() (*float32, bool)`

GetEpsLatestQOk returns a tuple with the EpsLatestQ field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEpsLatestQ

`func (o *StockProfileFundamental) SetEpsLatestQ(v float32)`

SetEpsLatestQ sets EpsLatestQ field to given value.

### HasEpsLatestQ

`func (o *StockProfileFundamental) HasEpsLatestQ() bool`

HasEpsLatestQ returns a boolean if a field has been set.

### GetEpsNri

`func (o *StockProfileFundamental) GetEpsNri() float32`

GetEpsNri returns the EpsNri field if non-nil, zero value otherwise.

### GetEpsNriOk

`func (o *StockProfileFundamental) GetEpsNriOk() (*float32, bool)`

GetEpsNriOk returns a tuple with the EpsNri field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEpsNri

`func (o *StockProfileFundamental) SetEpsNri(v float32)`

SetEpsNri sets EpsNri field to given value.

### HasEpsNri

`func (o *StockProfileFundamental) HasEpsNri() bool`

HasEpsNri returns a boolean if a field has been set.

### GetEquity2asset

`func (o *StockProfileFundamental) GetEquity2asset() float32`

GetEquity2asset returns the Equity2asset field if non-nil, zero value otherwise.

### GetEquity2assetOk

`func (o *StockProfileFundamental) GetEquity2assetOk() (*float32, bool)`

GetEquity2assetOk returns a tuple with the Equity2asset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEquity2asset

`func (o *StockProfileFundamental) SetEquity2asset(v float32)`

SetEquity2asset sets Equity2asset field to given value.

### HasEquity2asset

`func (o *StockProfileFundamental) HasEquity2asset() bool`

HasEquity2asset returns a boolean if a field has been set.

### GetEquity2assetHigh

`func (o *StockProfileFundamental) GetEquity2assetHigh() float32`

GetEquity2assetHigh returns the Equity2assetHigh field if non-nil, zero value otherwise.

### GetEquity2assetHighOk

`func (o *StockProfileFundamental) GetEquity2assetHighOk() (*float32, bool)`

GetEquity2assetHighOk returns a tuple with the Equity2assetHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEquity2assetHigh

`func (o *StockProfileFundamental) SetEquity2assetHigh(v float32)`

SetEquity2assetHigh sets Equity2assetHigh field to given value.

### HasEquity2assetHigh

`func (o *StockProfileFundamental) HasEquity2assetHigh() bool`

HasEquity2assetHigh returns a boolean if a field has been set.

### GetEquity2assetLow

`func (o *StockProfileFundamental) GetEquity2assetLow() float32`

GetEquity2assetLow returns the Equity2assetLow field if non-nil, zero value otherwise.

### GetEquity2assetLowOk

`func (o *StockProfileFundamental) GetEquity2assetLowOk() (*float32, bool)`

GetEquity2assetLowOk returns a tuple with the Equity2assetLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEquity2assetLow

`func (o *StockProfileFundamental) SetEquity2assetLow(v float32)`

SetEquity2assetLow sets Equity2assetLow field to given value.

### HasEquity2assetLow

`func (o *StockProfileFundamental) HasEquity2assetLow() bool`

HasEquity2assetLow returns a boolean if a field has been set.

### GetEquity2assetMed

`func (o *StockProfileFundamental) GetEquity2assetMed() float32`

GetEquity2assetMed returns the Equity2assetMed field if non-nil, zero value otherwise.

### GetEquity2assetMedOk

`func (o *StockProfileFundamental) GetEquity2assetMedOk() (*float32, bool)`

GetEquity2assetMedOk returns a tuple with the Equity2assetMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEquity2assetMed

`func (o *StockProfileFundamental) SetEquity2assetMed(v float32)`

SetEquity2assetMed sets Equity2assetMed field to given value.

### HasEquity2assetMed

`func (o *StockProfileFundamental) HasEquity2assetMed() bool`

HasEquity2assetMed returns a boolean if a field has been set.

### GetEvMorn

`func (o *StockProfileFundamental) GetEvMorn() float32`

GetEvMorn returns the EvMorn field if non-nil, zero value otherwise.

### GetEvMornOk

`func (o *StockProfileFundamental) GetEvMornOk() (*float32, bool)`

GetEvMornOk returns a tuple with the EvMorn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvMorn

`func (o *StockProfileFundamental) SetEvMorn(v float32)`

SetEvMorn sets EvMorn field to given value.

### HasEvMorn

`func (o *StockProfileFundamental) HasEvMorn() bool`

HasEvMorn returns a boolean if a field has been set.

### GetEvMornNorm

`func (o *StockProfileFundamental) GetEvMornNorm() float32`

GetEvMornNorm returns the EvMornNorm field if non-nil, zero value otherwise.

### GetEvMornNormOk

`func (o *StockProfileFundamental) GetEvMornNormOk() (*float32, bool)`

GetEvMornNormOk returns a tuple with the EvMornNorm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvMornNorm

`func (o *StockProfileFundamental) SetEvMornNorm(v float32)`

SetEvMornNorm sets EvMornNorm field to given value.

### HasEvMornNorm

`func (o *StockProfileFundamental) HasEvMornNorm() bool`

HasEvMornNorm returns a boolean if a field has been set.

### GetFscore

`func (o *StockProfileFundamental) GetFscore() float32`

GetFscore returns the Fscore field if non-nil, zero value otherwise.

### GetFscoreOk

`func (o *StockProfileFundamental) GetFscoreOk() (*float32, bool)`

GetFscoreOk returns a tuple with the Fscore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFscore

`func (o *StockProfileFundamental) SetFscore(v float32)`

SetFscore sets Fscore field to given value.

### HasFscore

`func (o *StockProfileFundamental) HasFscore() bool`

HasFscore returns a boolean if a field has been set.

### GetFscoreHigh

`func (o *StockProfileFundamental) GetFscoreHigh() float32`

GetFscoreHigh returns the FscoreHigh field if non-nil, zero value otherwise.

### GetFscoreHighOk

`func (o *StockProfileFundamental) GetFscoreHighOk() (*float32, bool)`

GetFscoreHighOk returns a tuple with the FscoreHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFscoreHigh

`func (o *StockProfileFundamental) SetFscoreHigh(v float32)`

SetFscoreHigh sets FscoreHigh field to given value.

### HasFscoreHigh

`func (o *StockProfileFundamental) HasFscoreHigh() bool`

HasFscoreHigh returns a boolean if a field has been set.

### GetFscoreLow

`func (o *StockProfileFundamental) GetFscoreLow() float32`

GetFscoreLow returns the FscoreLow field if non-nil, zero value otherwise.

### GetFscoreLowOk

`func (o *StockProfileFundamental) GetFscoreLowOk() (*float32, bool)`

GetFscoreLowOk returns a tuple with the FscoreLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFscoreLow

`func (o *StockProfileFundamental) SetFscoreLow(v float32)`

SetFscoreLow sets FscoreLow field to given value.

### HasFscoreLow

`func (o *StockProfileFundamental) HasFscoreLow() bool`

HasFscoreLow returns a boolean if a field has been set.

### GetFscoreMed

`func (o *StockProfileFundamental) GetFscoreMed() float32`

GetFscoreMed returns the FscoreMed field if non-nil, zero value otherwise.

### GetFscoreMedOk

`func (o *StockProfileFundamental) GetFscoreMedOk() (*float32, bool)`

GetFscoreMedOk returns a tuple with the FscoreMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFscoreMed

`func (o *StockProfileFundamental) SetFscoreMed(v float32)`

SetFscoreMed sets FscoreMed field to given value.

### HasFscoreMed

`func (o *StockProfileFundamental) HasFscoreMed() bool`

HasFscoreMed returns a boolean if a field has been set.

### GetGoodwill2asset

`func (o *StockProfileFundamental) GetGoodwill2asset() float32`

GetGoodwill2asset returns the Goodwill2asset field if non-nil, zero value otherwise.

### GetGoodwill2assetOk

`func (o *StockProfileFundamental) GetGoodwill2assetOk() (*float32, bool)`

GetGoodwill2assetOk returns a tuple with the Goodwill2asset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGoodwill2asset

`func (o *StockProfileFundamental) SetGoodwill2asset(v float32)`

SetGoodwill2asset sets Goodwill2asset field to given value.

### HasGoodwill2asset

`func (o *StockProfileFundamental) HasGoodwill2asset() bool`

HasGoodwill2asset returns a boolean if a field has been set.

### GetGrossprofit

`func (o *StockProfileFundamental) GetGrossprofit() float32`

GetGrossprofit returns the Grossprofit field if non-nil, zero value otherwise.

### GetGrossprofitOk

`func (o *StockProfileFundamental) GetGrossprofitOk() (*float32, bool)`

GetGrossprofitOk returns a tuple with the Grossprofit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrossprofit

`func (o *StockProfileFundamental) SetGrossprofit(v float32)`

SetGrossprofit sets Grossprofit field to given value.

### HasGrossprofit

`func (o *StockProfileFundamental) HasGrossprofit() bool`

HasGrossprofit returns a boolean if a field has been set.

### GetGrossprofit2asset

`func (o *StockProfileFundamental) GetGrossprofit2asset() float32`

GetGrossprofit2asset returns the Grossprofit2asset field if non-nil, zero value otherwise.

### GetGrossprofit2assetOk

`func (o *StockProfileFundamental) GetGrossprofit2assetOk() (*float32, bool)`

GetGrossprofit2assetOk returns a tuple with the Grossprofit2asset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrossprofit2asset

`func (o *StockProfileFundamental) SetGrossprofit2asset(v float32)`

SetGrossprofit2asset sets Grossprofit2asset field to given value.

### HasGrossprofit2asset

`func (o *StockProfileFundamental) HasGrossprofit2asset() bool`

HasGrossprofit2asset returns a boolean if a field has been set.

### GetGrossprofit2tangibleasset

`func (o *StockProfileFundamental) GetGrossprofit2tangibleasset() float32`

GetGrossprofit2tangibleasset returns the Grossprofit2tangibleasset field if non-nil, zero value otherwise.

### GetGrossprofit2tangibleassetOk

`func (o *StockProfileFundamental) GetGrossprofit2tangibleassetOk() (*float32, bool)`

GetGrossprofit2tangibleassetOk returns a tuple with the Grossprofit2tangibleasset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrossprofit2tangibleasset

`func (o *StockProfileFundamental) SetGrossprofit2tangibleasset(v float32)`

SetGrossprofit2tangibleasset sets Grossprofit2tangibleasset field to given value.

### HasGrossprofit2tangibleasset

`func (o *StockProfileFundamental) HasGrossprofit2tangibleasset() bool`

HasGrossprofit2tangibleasset returns a boolean if a field has been set.

### GetInsiderOwnership

`func (o *StockProfileFundamental) GetInsiderOwnership() float32`

GetInsiderOwnership returns the InsiderOwnership field if non-nil, zero value otherwise.

### GetInsiderOwnershipOk

`func (o *StockProfileFundamental) GetInsiderOwnershipOk() (*float32, bool)`

GetInsiderOwnershipOk returns a tuple with the InsiderOwnership field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInsiderOwnership

`func (o *StockProfileFundamental) SetInsiderOwnership(v float32)`

SetInsiderOwnership sets InsiderOwnership field to given value.

### HasInsiderOwnership

`func (o *StockProfileFundamental) HasInsiderOwnership() bool`

HasInsiderOwnership returns a boolean if a field has been set.

### GetInstOwnership

`func (o *StockProfileFundamental) GetInstOwnership() float32`

GetInstOwnership returns the InstOwnership field if non-nil, zero value otherwise.

### GetInstOwnershipOk

`func (o *StockProfileFundamental) GetInstOwnershipOk() (*float32, bool)`

GetInstOwnershipOk returns a tuple with the InstOwnership field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstOwnership

`func (o *StockProfileFundamental) SetInstOwnership(v float32)`

SetInstOwnership sets InstOwnership field to given value.

### HasInstOwnership

`func (o *StockProfileFundamental) HasInstOwnership() bool`

HasInstOwnership returns a boolean if a field has been set.

### GetInterestCoverage

`func (o *StockProfileFundamental) GetInterestCoverage() float32`

GetInterestCoverage returns the InterestCoverage field if non-nil, zero value otherwise.

### GetInterestCoverageOk

`func (o *StockProfileFundamental) GetInterestCoverageOk() (*float32, bool)`

GetInterestCoverageOk returns a tuple with the InterestCoverage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInterestCoverage

`func (o *StockProfileFundamental) SetInterestCoverage(v float32)`

SetInterestCoverage sets InterestCoverage field to given value.

### HasInterestCoverage

`func (o *StockProfileFundamental) HasInterestCoverage() bool`

HasInterestCoverage returns a boolean if a field has been set.

### GetInterestCoverageHigh

`func (o *StockProfileFundamental) GetInterestCoverageHigh() float32`

GetInterestCoverageHigh returns the InterestCoverageHigh field if non-nil, zero value otherwise.

### GetInterestCoverageHighOk

`func (o *StockProfileFundamental) GetInterestCoverageHighOk() (*float32, bool)`

GetInterestCoverageHighOk returns a tuple with the InterestCoverageHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInterestCoverageHigh

`func (o *StockProfileFundamental) SetInterestCoverageHigh(v float32)`

SetInterestCoverageHigh sets InterestCoverageHigh field to given value.

### HasInterestCoverageHigh

`func (o *StockProfileFundamental) HasInterestCoverageHigh() bool`

HasInterestCoverageHigh returns a boolean if a field has been set.

### GetInterestCoverageLow

`func (o *StockProfileFundamental) GetInterestCoverageLow() float32`

GetInterestCoverageLow returns the InterestCoverageLow field if non-nil, zero value otherwise.

### GetInterestCoverageLowOk

`func (o *StockProfileFundamental) GetInterestCoverageLowOk() (*float32, bool)`

GetInterestCoverageLowOk returns a tuple with the InterestCoverageLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInterestCoverageLow

`func (o *StockProfileFundamental) SetInterestCoverageLow(v float32)`

SetInterestCoverageLow sets InterestCoverageLow field to given value.

### HasInterestCoverageLow

`func (o *StockProfileFundamental) HasInterestCoverageLow() bool`

HasInterestCoverageLow returns a boolean if a field has been set.

### GetInterestCoverageMed

`func (o *StockProfileFundamental) GetInterestCoverageMed() float32`

GetInterestCoverageMed returns the InterestCoverageMed field if non-nil, zero value otherwise.

### GetInterestCoverageMedOk

`func (o *StockProfileFundamental) GetInterestCoverageMedOk() (*float32, bool)`

GetInterestCoverageMedOk returns a tuple with the InterestCoverageMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInterestCoverageMed

`func (o *StockProfileFundamental) SetInterestCoverageMed(v float32)`

SetInterestCoverageMed sets InterestCoverageMed field to given value.

### HasInterestCoverageMed

`func (o *StockProfileFundamental) HasInterestCoverageMed() bool`

HasInterestCoverageMed returns a boolean if a field has been set.

### GetInventory2sales

`func (o *StockProfileFundamental) GetInventory2sales() float32`

GetInventory2sales returns the Inventory2sales field if non-nil, zero value otherwise.

### GetInventory2salesOk

`func (o *StockProfileFundamental) GetInventory2salesOk() (*float32, bool)`

GetInventory2salesOk returns a tuple with the Inventory2sales field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInventory2sales

`func (o *StockProfileFundamental) SetInventory2sales(v float32)`

SetInventory2sales sets Inventory2sales field to given value.

### HasInventory2sales

`func (o *StockProfileFundamental) HasInventory2sales() bool`

HasInventory2sales returns a boolean if a field has been set.

### GetInventoryTurnover

`func (o *StockProfileFundamental) GetInventoryTurnover() float32`

GetInventoryTurnover returns the InventoryTurnover field if non-nil, zero value otherwise.

### GetInventoryTurnoverOk

`func (o *StockProfileFundamental) GetInventoryTurnoverOk() (*float32, bool)`

GetInventoryTurnoverOk returns a tuple with the InventoryTurnover field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInventoryTurnover

`func (o *StockProfileFundamental) SetInventoryTurnover(v float32)`

SetInventoryTurnover sets InventoryTurnover field to given value.

### HasInventoryTurnover

`func (o *StockProfileFundamental) HasInventoryTurnover() bool`

HasInventoryTurnover returns a boolean if a field has been set.

### GetLatestEarningsReleaseDate

`func (o *StockProfileFundamental) GetLatestEarningsReleaseDate() string`

GetLatestEarningsReleaseDate returns the LatestEarningsReleaseDate field if non-nil, zero value otherwise.

### GetLatestEarningsReleaseDateOk

`func (o *StockProfileFundamental) GetLatestEarningsReleaseDateOk() (*string, bool)`

GetLatestEarningsReleaseDateOk returns a tuple with the LatestEarningsReleaseDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatestEarningsReleaseDate

`func (o *StockProfileFundamental) SetLatestEarningsReleaseDate(v string)`

SetLatestEarningsReleaseDate sets LatestEarningsReleaseDate field to given value.

### HasLatestEarningsReleaseDate

`func (o *StockProfileFundamental) HasLatestEarningsReleaseDate() bool`

HasLatestEarningsReleaseDate returns a boolean if a field has been set.

### GetLiabilitiesToAssets

`func (o *StockProfileFundamental) GetLiabilitiesToAssets() float32`

GetLiabilitiesToAssets returns the LiabilitiesToAssets field if non-nil, zero value otherwise.

### GetLiabilitiesToAssetsOk

`func (o *StockProfileFundamental) GetLiabilitiesToAssetsOk() (*float32, bool)`

GetLiabilitiesToAssetsOk returns a tuple with the LiabilitiesToAssets field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLiabilitiesToAssets

`func (o *StockProfileFundamental) SetLiabilitiesToAssets(v float32)`

SetLiabilitiesToAssets sets LiabilitiesToAssets field to given value.

### HasLiabilitiesToAssets

`func (o *StockProfileFundamental) HasLiabilitiesToAssets() bool`

HasLiabilitiesToAssets returns a boolean if a field has been set.

### GetMktcap

`func (o *StockProfileFundamental) GetMktcap() float32`

GetMktcap returns the Mktcap field if non-nil, zero value otherwise.

### GetMktcapOk

`func (o *StockProfileFundamental) GetMktcapOk() (*float32, bool)`

GetMktcapOk returns a tuple with the Mktcap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMktcap

`func (o *StockProfileFundamental) SetMktcap(v float32)`

SetMktcap sets Mktcap field to given value.

### HasMktcap

`func (o *StockProfileFundamental) HasMktcap() bool`

HasMktcap returns a boolean if a field has been set.

### GetMktcapNorm

`func (o *StockProfileFundamental) GetMktcapNorm() float32`

GetMktcapNorm returns the MktcapNorm field if non-nil, zero value otherwise.

### GetMktcapNormOk

`func (o *StockProfileFundamental) GetMktcapNormOk() (*float32, bool)`

GetMktcapNormOk returns a tuple with the MktcapNorm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMktcapNorm

`func (o *StockProfileFundamental) SetMktcapNorm(v float32)`

SetMktcapNorm sets MktcapNorm field to given value.

### HasMktcapNorm

`func (o *StockProfileFundamental) HasMktcapNorm() bool`

HasMktcapNorm returns a boolean if a field has been set.

### GetMscore

`func (o *StockProfileFundamental) GetMscore() float32`

GetMscore returns the Mscore field if non-nil, zero value otherwise.

### GetMscoreOk

`func (o *StockProfileFundamental) GetMscoreOk() (*float32, bool)`

GetMscoreOk returns a tuple with the Mscore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMscore

`func (o *StockProfileFundamental) SetMscore(v float32)`

SetMscore sets Mscore field to given value.

### HasMscore

`func (o *StockProfileFundamental) HasMscore() bool`

HasMscore returns a boolean if a field has been set.

### GetMscoreHigh

`func (o *StockProfileFundamental) GetMscoreHigh() float32`

GetMscoreHigh returns the MscoreHigh field if non-nil, zero value otherwise.

### GetMscoreHighOk

`func (o *StockProfileFundamental) GetMscoreHighOk() (*float32, bool)`

GetMscoreHighOk returns a tuple with the MscoreHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMscoreHigh

`func (o *StockProfileFundamental) SetMscoreHigh(v float32)`

SetMscoreHigh sets MscoreHigh field to given value.

### HasMscoreHigh

`func (o *StockProfileFundamental) HasMscoreHigh() bool`

HasMscoreHigh returns a boolean if a field has been set.

### GetMscoreLow

`func (o *StockProfileFundamental) GetMscoreLow() float32`

GetMscoreLow returns the MscoreLow field if non-nil, zero value otherwise.

### GetMscoreLowOk

`func (o *StockProfileFundamental) GetMscoreLowOk() (*float32, bool)`

GetMscoreLowOk returns a tuple with the MscoreLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMscoreLow

`func (o *StockProfileFundamental) SetMscoreLow(v float32)`

SetMscoreLow sets MscoreLow field to given value.

### HasMscoreLow

`func (o *StockProfileFundamental) HasMscoreLow() bool`

HasMscoreLow returns a boolean if a field has been set.

### GetMscoreMed

`func (o *StockProfileFundamental) GetMscoreMed() float32`

GetMscoreMed returns the MscoreMed field if non-nil, zero value otherwise.

### GetMscoreMedOk

`func (o *StockProfileFundamental) GetMscoreMedOk() (*float32, bool)`

GetMscoreMedOk returns a tuple with the MscoreMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMscoreMed

`func (o *StockProfileFundamental) SetMscoreMed(v float32)`

SetMscoreMed sets MscoreMed field to given value.

### HasMscoreMed

`func (o *StockProfileFundamental) HasMscoreMed() bool`

HasMscoreMed returns a boolean if a field has been set.

### GetNetDebtPaydownYield

`func (o *StockProfileFundamental) GetNetDebtPaydownYield() float32`

GetNetDebtPaydownYield returns the NetDebtPaydownYield field if non-nil, zero value otherwise.

### GetNetDebtPaydownYieldOk

`func (o *StockProfileFundamental) GetNetDebtPaydownYieldOk() (*float32, bool)`

GetNetDebtPaydownYieldOk returns a tuple with the NetDebtPaydownYield field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetDebtPaydownYield

`func (o *StockProfileFundamental) SetNetDebtPaydownYield(v float32)`

SetNetDebtPaydownYield sets NetDebtPaydownYield field to given value.

### HasNetDebtPaydownYield

`func (o *StockProfileFundamental) HasNetDebtPaydownYield() bool`

HasNetDebtPaydownYield returns a boolean if a field has been set.

### GetNetDebtPaydownYieldHigh

`func (o *StockProfileFundamental) GetNetDebtPaydownYieldHigh() float32`

GetNetDebtPaydownYieldHigh returns the NetDebtPaydownYieldHigh field if non-nil, zero value otherwise.

### GetNetDebtPaydownYieldHighOk

`func (o *StockProfileFundamental) GetNetDebtPaydownYieldHighOk() (*float32, bool)`

GetNetDebtPaydownYieldHighOk returns a tuple with the NetDebtPaydownYieldHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetDebtPaydownYieldHigh

`func (o *StockProfileFundamental) SetNetDebtPaydownYieldHigh(v float32)`

SetNetDebtPaydownYieldHigh sets NetDebtPaydownYieldHigh field to given value.

### HasNetDebtPaydownYieldHigh

`func (o *StockProfileFundamental) HasNetDebtPaydownYieldHigh() bool`

HasNetDebtPaydownYieldHigh returns a boolean if a field has been set.

### GetNetDebtPaydownYieldLow

`func (o *StockProfileFundamental) GetNetDebtPaydownYieldLow() float32`

GetNetDebtPaydownYieldLow returns the NetDebtPaydownYieldLow field if non-nil, zero value otherwise.

### GetNetDebtPaydownYieldLowOk

`func (o *StockProfileFundamental) GetNetDebtPaydownYieldLowOk() (*float32, bool)`

GetNetDebtPaydownYieldLowOk returns a tuple with the NetDebtPaydownYieldLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetDebtPaydownYieldLow

`func (o *StockProfileFundamental) SetNetDebtPaydownYieldLow(v float32)`

SetNetDebtPaydownYieldLow sets NetDebtPaydownYieldLow field to given value.

### HasNetDebtPaydownYieldLow

`func (o *StockProfileFundamental) HasNetDebtPaydownYieldLow() bool`

HasNetDebtPaydownYieldLow returns a boolean if a field has been set.

### GetNetDebtPaydownYieldMed

`func (o *StockProfileFundamental) GetNetDebtPaydownYieldMed() float32`

GetNetDebtPaydownYieldMed returns the NetDebtPaydownYieldMed field if non-nil, zero value otherwise.

### GetNetDebtPaydownYieldMedOk

`func (o *StockProfileFundamental) GetNetDebtPaydownYieldMedOk() (*float32, bool)`

GetNetDebtPaydownYieldMedOk returns a tuple with the NetDebtPaydownYieldMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetDebtPaydownYieldMed

`func (o *StockProfileFundamental) SetNetDebtPaydownYieldMed(v float32)`

SetNetDebtPaydownYieldMed sets NetDebtPaydownYieldMed field to given value.

### HasNetDebtPaydownYieldMed

`func (o *StockProfileFundamental) HasNetDebtPaydownYieldMed() bool`

HasNetDebtPaydownYieldMed returns a boolean if a field has been set.

### GetNextEarningsDate

`func (o *StockProfileFundamental) GetNextEarningsDate() string`

GetNextEarningsDate returns the NextEarningsDate field if non-nil, zero value otherwise.

### GetNextEarningsDateOk

`func (o *StockProfileFundamental) GetNextEarningsDateOk() (*string, bool)`

GetNextEarningsDateOk returns a tuple with the NextEarningsDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextEarningsDate

`func (o *StockProfileFundamental) SetNextEarningsDate(v string)`

SetNextEarningsDate sets NextEarningsDate field to given value.

### HasNextEarningsDate

`func (o *StockProfileFundamental) HasNextEarningsDate() bool`

HasNextEarningsDate returns a boolean if a field has been set.

### GetNumGoodSigns

`func (o *StockProfileFundamental) GetNumGoodSigns() float32`

GetNumGoodSigns returns the NumGoodSigns field if non-nil, zero value otherwise.

### GetNumGoodSignsOk

`func (o *StockProfileFundamental) GetNumGoodSignsOk() (*float32, bool)`

GetNumGoodSignsOk returns a tuple with the NumGoodSigns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumGoodSigns

`func (o *StockProfileFundamental) SetNumGoodSigns(v float32)`

SetNumGoodSigns sets NumGoodSigns field to given value.

### HasNumGoodSigns

`func (o *StockProfileFundamental) HasNumGoodSigns() bool`

HasNumGoodSigns returns a boolean if a field has been set.

### GetNumWarningSignsMeidum

`func (o *StockProfileFundamental) GetNumWarningSignsMeidum() float32`

GetNumWarningSignsMeidum returns the NumWarningSignsMeidum field if non-nil, zero value otherwise.

### GetNumWarningSignsMeidumOk

`func (o *StockProfileFundamental) GetNumWarningSignsMeidumOk() (*float32, bool)`

GetNumWarningSignsMeidumOk returns a tuple with the NumWarningSignsMeidum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumWarningSignsMeidum

`func (o *StockProfileFundamental) SetNumWarningSignsMeidum(v float32)`

SetNumWarningSignsMeidum sets NumWarningSignsMeidum field to given value.

### HasNumWarningSignsMeidum

`func (o *StockProfileFundamental) HasNumWarningSignsMeidum() bool`

HasNumWarningSignsMeidum returns a boolean if a field has been set.

### GetNumWarningSignsSevere

`func (o *StockProfileFundamental) GetNumWarningSignsSevere() float32`

GetNumWarningSignsSevere returns the NumWarningSignsSevere field if non-nil, zero value otherwise.

### GetNumWarningSignsSevereOk

`func (o *StockProfileFundamental) GetNumWarningSignsSevereOk() (*float32, bool)`

GetNumWarningSignsSevereOk returns a tuple with the NumWarningSignsSevere field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumWarningSignsSevere

`func (o *StockProfileFundamental) SetNumWarningSignsSevere(v float32)`

SetNumWarningSignsSevere sets NumWarningSignsSevere field to given value.

### HasNumWarningSignsSevere

`func (o *StockProfileFundamental) HasNumWarningSignsSevere() bool`

HasNumWarningSignsSevere returns a boolean if a field has been set.

### GetPastEarningsDate

`func (o *StockProfileFundamental) GetPastEarningsDate() string`

GetPastEarningsDate returns the PastEarningsDate field if non-nil, zero value otherwise.

### GetPastEarningsDateOk

`func (o *StockProfileFundamental) GetPastEarningsDateOk() (*string, bool)`

GetPastEarningsDateOk returns a tuple with the PastEarningsDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPastEarningsDate

`func (o *StockProfileFundamental) SetPastEarningsDate(v string)`

SetPastEarningsDate sets PastEarningsDate field to given value.

### HasPastEarningsDate

`func (o *StockProfileFundamental) HasPastEarningsDate() bool`

HasPastEarningsDate returns a boolean if a field has been set.

### GetQuickRatio

`func (o *StockProfileFundamental) GetQuickRatio() float32`

GetQuickRatio returns the QuickRatio field if non-nil, zero value otherwise.

### GetQuickRatioOk

`func (o *StockProfileFundamental) GetQuickRatioOk() (*float32, bool)`

GetQuickRatioOk returns a tuple with the QuickRatio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuickRatio

`func (o *StockProfileFundamental) SetQuickRatio(v float32)`

SetQuickRatio sets QuickRatio field to given value.

### HasQuickRatio

`func (o *StockProfileFundamental) HasQuickRatio() bool`

HasQuickRatio returns a boolean if a field has been set.

### GetQuickRatioHigh

`func (o *StockProfileFundamental) GetQuickRatioHigh() float32`

GetQuickRatioHigh returns the QuickRatioHigh field if non-nil, zero value otherwise.

### GetQuickRatioHighOk

`func (o *StockProfileFundamental) GetQuickRatioHighOk() (*float32, bool)`

GetQuickRatioHighOk returns a tuple with the QuickRatioHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuickRatioHigh

`func (o *StockProfileFundamental) SetQuickRatioHigh(v float32)`

SetQuickRatioHigh sets QuickRatioHigh field to given value.

### HasQuickRatioHigh

`func (o *StockProfileFundamental) HasQuickRatioHigh() bool`

HasQuickRatioHigh returns a boolean if a field has been set.

### GetQuickRatioLow

`func (o *StockProfileFundamental) GetQuickRatioLow() float32`

GetQuickRatioLow returns the QuickRatioLow field if non-nil, zero value otherwise.

### GetQuickRatioLowOk

`func (o *StockProfileFundamental) GetQuickRatioLowOk() (*float32, bool)`

GetQuickRatioLowOk returns a tuple with the QuickRatioLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuickRatioLow

`func (o *StockProfileFundamental) SetQuickRatioLow(v float32)`

SetQuickRatioLow sets QuickRatioLow field to given value.

### HasQuickRatioLow

`func (o *StockProfileFundamental) HasQuickRatioLow() bool`

HasQuickRatioLow returns a boolean if a field has been set.

### GetQuickRatioMed

`func (o *StockProfileFundamental) GetQuickRatioMed() float32`

GetQuickRatioMed returns the QuickRatioMed field if non-nil, zero value otherwise.

### GetQuickRatioMedOk

`func (o *StockProfileFundamental) GetQuickRatioMedOk() (*float32, bool)`

GetQuickRatioMedOk returns a tuple with the QuickRatioMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuickRatioMed

`func (o *StockProfileFundamental) SetQuickRatioMed(v float32)`

SetQuickRatioMed sets QuickRatioMed field to given value.

### HasQuickRatioMed

`func (o *StockProfileFundamental) HasQuickRatioMed() bool`

HasQuickRatioMed returns a boolean if a field has been set.

### GetReceivablesTurnover

`func (o *StockProfileFundamental) GetReceivablesTurnover() float32`

GetReceivablesTurnover returns the ReceivablesTurnover field if non-nil, zero value otherwise.

### GetReceivablesTurnoverOk

`func (o *StockProfileFundamental) GetReceivablesTurnoverOk() (*float32, bool)`

GetReceivablesTurnoverOk returns a tuple with the ReceivablesTurnover field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReceivablesTurnover

`func (o *StockProfileFundamental) SetReceivablesTurnover(v float32)`

SetReceivablesTurnover sets ReceivablesTurnover field to given value.

### HasReceivablesTurnover

`func (o *StockProfileFundamental) HasReceivablesTurnover() bool`

HasReceivablesTurnover returns a boolean if a field has been set.

### GetRelatedComp

`func (o *StockProfileFundamental) GetRelatedComp() string`

GetRelatedComp returns the RelatedComp field if non-nil, zero value otherwise.

### GetRelatedCompOk

`func (o *StockProfileFundamental) GetRelatedCompOk() (*string, bool)`

GetRelatedCompOk returns a tuple with the RelatedComp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRelatedComp

`func (o *StockProfileFundamental) SetRelatedComp(v string)`

SetRelatedComp sets RelatedComp field to given value.

### HasRelatedComp

`func (o *StockProfileFundamental) HasRelatedComp() bool`

HasRelatedComp returns a boolean if a field has been set.

### GetRoa

`func (o *StockProfileFundamental) GetRoa() float32`

GetRoa returns the Roa field if non-nil, zero value otherwise.

### GetRoaOk

`func (o *StockProfileFundamental) GetRoaOk() (*float32, bool)`

GetRoaOk returns a tuple with the Roa field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoa

`func (o *StockProfileFundamental) SetRoa(v float32)`

SetRoa sets Roa field to given value.

### HasRoa

`func (o *StockProfileFundamental) HasRoa() bool`

HasRoa returns a boolean if a field has been set.

### GetRoaHigh

`func (o *StockProfileFundamental) GetRoaHigh() float32`

GetRoaHigh returns the RoaHigh field if non-nil, zero value otherwise.

### GetRoaHighOk

`func (o *StockProfileFundamental) GetRoaHighOk() (*float32, bool)`

GetRoaHighOk returns a tuple with the RoaHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoaHigh

`func (o *StockProfileFundamental) SetRoaHigh(v float32)`

SetRoaHigh sets RoaHigh field to given value.

### HasRoaHigh

`func (o *StockProfileFundamental) HasRoaHigh() bool`

HasRoaHigh returns a boolean if a field has been set.

### GetRoaLow

`func (o *StockProfileFundamental) GetRoaLow() float32`

GetRoaLow returns the RoaLow field if non-nil, zero value otherwise.

### GetRoaLowOk

`func (o *StockProfileFundamental) GetRoaLowOk() (*float32, bool)`

GetRoaLowOk returns a tuple with the RoaLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoaLow

`func (o *StockProfileFundamental) SetRoaLow(v float32)`

SetRoaLow sets RoaLow field to given value.

### HasRoaLow

`func (o *StockProfileFundamental) HasRoaLow() bool`

HasRoaLow returns a boolean if a field has been set.

### GetRoaMed

`func (o *StockProfileFundamental) GetRoaMed() float32`

GetRoaMed returns the RoaMed field if non-nil, zero value otherwise.

### GetRoaMedOk

`func (o *StockProfileFundamental) GetRoaMedOk() (*float32, bool)`

GetRoaMedOk returns a tuple with the RoaMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoaMed

`func (o *StockProfileFundamental) SetRoaMed(v float32)`

SetRoaMed sets RoaMed field to given value.

### HasRoaMed

`func (o *StockProfileFundamental) HasRoaMed() bool`

HasRoaMed returns a boolean if a field has been set.

### GetRoaMed5y

`func (o *StockProfileFundamental) GetRoaMed5y() float32`

GetRoaMed5y returns the RoaMed5y field if non-nil, zero value otherwise.

### GetRoaMed5yOk

`func (o *StockProfileFundamental) GetRoaMed5yOk() (*float32, bool)`

GetRoaMed5yOk returns a tuple with the RoaMed5y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoaMed5y

`func (o *StockProfileFundamental) SetRoaMed5y(v float32)`

SetRoaMed5y sets RoaMed5y field to given value.

### HasRoaMed5y

`func (o *StockProfileFundamental) HasRoaMed5y() bool`

HasRoaMed5y returns a boolean if a field has been set.

### GetRoc

`func (o *StockProfileFundamental) GetRoc() float32`

GetRoc returns the Roc field if non-nil, zero value otherwise.

### GetRocOk

`func (o *StockProfileFundamental) GetRocOk() (*float32, bool)`

GetRocOk returns a tuple with the Roc field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoc

`func (o *StockProfileFundamental) SetRoc(v float32)`

SetRoc sets Roc field to given value.

### HasRoc

`func (o *StockProfileFundamental) HasRoc() bool`

HasRoc returns a boolean if a field has been set.

### GetRoce

`func (o *StockProfileFundamental) GetRoce() float32`

GetRoce returns the Roce field if non-nil, zero value otherwise.

### GetRoceOk

`func (o *StockProfileFundamental) GetRoceOk() (*float32, bool)`

GetRoceOk returns a tuple with the Roce field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoce

`func (o *StockProfileFundamental) SetRoce(v float32)`

SetRoce sets Roce field to given value.

### HasRoce

`func (o *StockProfileFundamental) HasRoce() bool`

HasRoce returns a boolean if a field has been set.

### GetRoceHigh

`func (o *StockProfileFundamental) GetRoceHigh() float32`

GetRoceHigh returns the RoceHigh field if non-nil, zero value otherwise.

### GetRoceHighOk

`func (o *StockProfileFundamental) GetRoceHighOk() (*float32, bool)`

GetRoceHighOk returns a tuple with the RoceHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoceHigh

`func (o *StockProfileFundamental) SetRoceHigh(v float32)`

SetRoceHigh sets RoceHigh field to given value.

### HasRoceHigh

`func (o *StockProfileFundamental) HasRoceHigh() bool`

HasRoceHigh returns a boolean if a field has been set.

### GetRoceLow

`func (o *StockProfileFundamental) GetRoceLow() float32`

GetRoceLow returns the RoceLow field if non-nil, zero value otherwise.

### GetRoceLowOk

`func (o *StockProfileFundamental) GetRoceLowOk() (*float32, bool)`

GetRoceLowOk returns a tuple with the RoceLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoceLow

`func (o *StockProfileFundamental) SetRoceLow(v float32)`

SetRoceLow sets RoceLow field to given value.

### HasRoceLow

`func (o *StockProfileFundamental) HasRoceLow() bool`

HasRoceLow returns a boolean if a field has been set.

### GetRoceMed

`func (o *StockProfileFundamental) GetRoceMed() float32`

GetRoceMed returns the RoceMed field if non-nil, zero value otherwise.

### GetRoceMedOk

`func (o *StockProfileFundamental) GetRoceMedOk() (*float32, bool)`

GetRoceMedOk returns a tuple with the RoceMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoceMed

`func (o *StockProfileFundamental) SetRoceMed(v float32)`

SetRoceMed sets RoceMed field to given value.

### HasRoceMed

`func (o *StockProfileFundamental) HasRoceMed() bool`

HasRoceMed returns a boolean if a field has been set.

### GetRoceMed5y

`func (o *StockProfileFundamental) GetRoceMed5y() float32`

GetRoceMed5y returns the RoceMed5y field if non-nil, zero value otherwise.

### GetRoceMed5yOk

`func (o *StockProfileFundamental) GetRoceMed5yOk() (*float32, bool)`

GetRoceMed5yOk returns a tuple with the RoceMed5y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoceMed5y

`func (o *StockProfileFundamental) SetRoceMed5y(v float32)`

SetRoceMed5y sets RoceMed5y field to given value.

### HasRoceMed5y

`func (o *StockProfileFundamental) HasRoceMed5y() bool`

HasRoceMed5y returns a boolean if a field has been set.

### GetRoe

`func (o *StockProfileFundamental) GetRoe() float32`

GetRoe returns the Roe field if non-nil, zero value otherwise.

### GetRoeOk

`func (o *StockProfileFundamental) GetRoeOk() (*float32, bool)`

GetRoeOk returns a tuple with the Roe field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoe

`func (o *StockProfileFundamental) SetRoe(v float32)`

SetRoe sets Roe field to given value.

### HasRoe

`func (o *StockProfileFundamental) HasRoe() bool`

HasRoe returns a boolean if a field has been set.

### GetRoeAdj

`func (o *StockProfileFundamental) GetRoeAdj() float32`

GetRoeAdj returns the RoeAdj field if non-nil, zero value otherwise.

### GetRoeAdjOk

`func (o *StockProfileFundamental) GetRoeAdjOk() (*float32, bool)`

GetRoeAdjOk returns a tuple with the RoeAdj field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoeAdj

`func (o *StockProfileFundamental) SetRoeAdj(v float32)`

SetRoeAdj sets RoeAdj field to given value.

### HasRoeAdj

`func (o *StockProfileFundamental) HasRoeAdj() bool`

HasRoeAdj returns a boolean if a field has been set.

### GetRoeHigh

`func (o *StockProfileFundamental) GetRoeHigh() float32`

GetRoeHigh returns the RoeHigh field if non-nil, zero value otherwise.

### GetRoeHighOk

`func (o *StockProfileFundamental) GetRoeHighOk() (*float32, bool)`

GetRoeHighOk returns a tuple with the RoeHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoeHigh

`func (o *StockProfileFundamental) SetRoeHigh(v float32)`

SetRoeHigh sets RoeHigh field to given value.

### HasRoeHigh

`func (o *StockProfileFundamental) HasRoeHigh() bool`

HasRoeHigh returns a boolean if a field has been set.

### GetRoeLow

`func (o *StockProfileFundamental) GetRoeLow() float32`

GetRoeLow returns the RoeLow field if non-nil, zero value otherwise.

### GetRoeLowOk

`func (o *StockProfileFundamental) GetRoeLowOk() (*float32, bool)`

GetRoeLowOk returns a tuple with the RoeLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoeLow

`func (o *StockProfileFundamental) SetRoeLow(v float32)`

SetRoeLow sets RoeLow field to given value.

### HasRoeLow

`func (o *StockProfileFundamental) HasRoeLow() bool`

HasRoeLow returns a boolean if a field has been set.

### GetRoeMed

`func (o *StockProfileFundamental) GetRoeMed() float32`

GetRoeMed returns the RoeMed field if non-nil, zero value otherwise.

### GetRoeMedOk

`func (o *StockProfileFundamental) GetRoeMedOk() (*float32, bool)`

GetRoeMedOk returns a tuple with the RoeMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoeMed

`func (o *StockProfileFundamental) SetRoeMed(v float32)`

SetRoeMed sets RoeMed field to given value.

### HasRoeMed

`func (o *StockProfileFundamental) HasRoeMed() bool`

HasRoeMed returns a boolean if a field has been set.

### GetRoeMed5y

`func (o *StockProfileFundamental) GetRoeMed5y() float32`

GetRoeMed5y returns the RoeMed5y field if non-nil, zero value otherwise.

### GetRoeMed5yOk

`func (o *StockProfileFundamental) GetRoeMed5yOk() (*float32, bool)`

GetRoeMed5yOk returns a tuple with the RoeMed5y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoeMed5y

`func (o *StockProfileFundamental) SetRoeMed5y(v float32)`

SetRoeMed5y sets RoeMed5y field to given value.

### HasRoeMed5y

`func (o *StockProfileFundamental) HasRoeMed5y() bool`

HasRoeMed5y returns a boolean if a field has been set.

### GetRoic

`func (o *StockProfileFundamental) GetRoic() float32`

GetRoic returns the Roic field if non-nil, zero value otherwise.

### GetRoicOk

`func (o *StockProfileFundamental) GetRoicOk() (*float32, bool)`

GetRoicOk returns a tuple with the Roic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoic

`func (o *StockProfileFundamental) SetRoic(v float32)`

SetRoic sets Roic field to given value.

### HasRoic

`func (o *StockProfileFundamental) HasRoic() bool`

HasRoic returns a boolean if a field has been set.

### GetRoicHigh

`func (o *StockProfileFundamental) GetRoicHigh() float32`

GetRoicHigh returns the RoicHigh field if non-nil, zero value otherwise.

### GetRoicHighOk

`func (o *StockProfileFundamental) GetRoicHighOk() (*float32, bool)`

GetRoicHighOk returns a tuple with the RoicHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoicHigh

`func (o *StockProfileFundamental) SetRoicHigh(v float32)`

SetRoicHigh sets RoicHigh field to given value.

### HasRoicHigh

`func (o *StockProfileFundamental) HasRoicHigh() bool`

HasRoicHigh returns a boolean if a field has been set.

### GetRoicLow

`func (o *StockProfileFundamental) GetRoicLow() float32`

GetRoicLow returns the RoicLow field if non-nil, zero value otherwise.

### GetRoicLowOk

`func (o *StockProfileFundamental) GetRoicLowOk() (*float32, bool)`

GetRoicLowOk returns a tuple with the RoicLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoicLow

`func (o *StockProfileFundamental) SetRoicLow(v float32)`

SetRoicLow sets RoicLow field to given value.

### HasRoicLow

`func (o *StockProfileFundamental) HasRoicLow() bool`

HasRoicLow returns a boolean if a field has been set.

### GetRoicMed

`func (o *StockProfileFundamental) GetRoicMed() float32`

GetRoicMed returns the RoicMed field if non-nil, zero value otherwise.

### GetRoicMedOk

`func (o *StockProfileFundamental) GetRoicMedOk() (*float32, bool)`

GetRoicMedOk returns a tuple with the RoicMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoicMed

`func (o *StockProfileFundamental) SetRoicMed(v float32)`

SetRoicMed sets RoicMed field to given value.

### HasRoicMed

`func (o *StockProfileFundamental) HasRoicMed() bool`

HasRoicMed returns a boolean if a field has been set.

### GetRoicMed5y

`func (o *StockProfileFundamental) GetRoicMed5y() float32`

GetRoicMed5y returns the RoicMed5y field if non-nil, zero value otherwise.

### GetRoicMed5yOk

`func (o *StockProfileFundamental) GetRoicMed5yOk() (*float32, bool)`

GetRoicMed5yOk returns a tuple with the RoicMed5y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoicMed5y

`func (o *StockProfileFundamental) SetRoicMed5y(v float32)`

SetRoicMed5y sets RoicMed5y field to given value.

### HasRoicMed5y

`func (o *StockProfileFundamental) HasRoicMed5y() bool`

HasRoicMed5y returns a boolean if a field has been set.

### GetRoiic3y

`func (o *StockProfileFundamental) GetRoiic3y() float32`

GetRoiic3y returns the Roiic3y field if non-nil, zero value otherwise.

### GetRoiic3yOk

`func (o *StockProfileFundamental) GetRoiic3yOk() (*float32, bool)`

GetRoiic3yOk returns a tuple with the Roiic3y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoiic3y

`func (o *StockProfileFundamental) SetRoiic3y(v float32)`

SetRoiic3y sets Roiic3y field to given value.

### HasRoiic3y

`func (o *StockProfileFundamental) HasRoiic3y() bool`

HasRoiic3y returns a boolean if a field has been set.

### GetRoiic3yHigh

`func (o *StockProfileFundamental) GetRoiic3yHigh() float32`

GetRoiic3yHigh returns the Roiic3yHigh field if non-nil, zero value otherwise.

### GetRoiic3yHighOk

`func (o *StockProfileFundamental) GetRoiic3yHighOk() (*float32, bool)`

GetRoiic3yHighOk returns a tuple with the Roiic3yHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoiic3yHigh

`func (o *StockProfileFundamental) SetRoiic3yHigh(v float32)`

SetRoiic3yHigh sets Roiic3yHigh field to given value.

### HasRoiic3yHigh

`func (o *StockProfileFundamental) HasRoiic3yHigh() bool`

HasRoiic3yHigh returns a boolean if a field has been set.

### GetRoiic3yLow

`func (o *StockProfileFundamental) GetRoiic3yLow() float32`

GetRoiic3yLow returns the Roiic3yLow field if non-nil, zero value otherwise.

### GetRoiic3yLowOk

`func (o *StockProfileFundamental) GetRoiic3yLowOk() (*float32, bool)`

GetRoiic3yLowOk returns a tuple with the Roiic3yLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoiic3yLow

`func (o *StockProfileFundamental) SetRoiic3yLow(v float32)`

SetRoiic3yLow sets Roiic3yLow field to given value.

### HasRoiic3yLow

`func (o *StockProfileFundamental) HasRoiic3yLow() bool`

HasRoiic3yLow returns a boolean if a field has been set.

### GetRoiic3yMed

`func (o *StockProfileFundamental) GetRoiic3yMed() float32`

GetRoiic3yMed returns the Roiic3yMed field if non-nil, zero value otherwise.

### GetRoiic3yMedOk

`func (o *StockProfileFundamental) GetRoiic3yMedOk() (*float32, bool)`

GetRoiic3yMedOk returns a tuple with the Roiic3yMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoiic3yMed

`func (o *StockProfileFundamental) SetRoiic3yMed(v float32)`

SetRoiic3yMed sets Roiic3yMed field to given value.

### HasRoiic3yMed

`func (o *StockProfileFundamental) HasRoiic3yMed() bool`

HasRoiic3yMed returns a boolean if a field has been set.

### GetRvnPredc10y

`func (o *StockProfileFundamental) GetRvnPredc10y() float32`

GetRvnPredc10y returns the RvnPredc10y field if non-nil, zero value otherwise.

### GetRvnPredc10yOk

`func (o *StockProfileFundamental) GetRvnPredc10yOk() (*float32, bool)`

GetRvnPredc10yOk returns a tuple with the RvnPredc10y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRvnPredc10y

`func (o *StockProfileFundamental) SetRvnPredc10y(v float32)`

SetRvnPredc10y sets RvnPredc10y field to given value.

### HasRvnPredc10y

`func (o *StockProfileFundamental) HasRvnPredc10y() bool`

HasRvnPredc10y returns a boolean if a field has been set.

### GetSales

`func (o *StockProfileFundamental) GetSales() float32`

GetSales returns the Sales field if non-nil, zero value otherwise.

### GetSalesOk

`func (o *StockProfileFundamental) GetSalesOk() (*float32, bool)`

GetSalesOk returns a tuple with the Sales field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSales

`func (o *StockProfileFundamental) SetSales(v float32)`

SetSales sets Sales field to given value.

### HasSales

`func (o *StockProfileFundamental) HasSales() bool`

HasSales returns a boolean if a field has been set.

### GetSalesLatestQ

`func (o *StockProfileFundamental) GetSalesLatestQ() float32`

GetSalesLatestQ returns the SalesLatestQ field if non-nil, zero value otherwise.

### GetSalesLatestQOk

`func (o *StockProfileFundamental) GetSalesLatestQOk() (*float32, bool)`

GetSalesLatestQOk returns a tuple with the SalesLatestQ field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSalesLatestQ

`func (o *StockProfileFundamental) SetSalesLatestQ(v float32)`

SetSalesLatestQ sets SalesLatestQ field to given value.

### HasSalesLatestQ

`func (o *StockProfileFundamental) HasSalesLatestQ() bool`

HasSalesLatestQ returns a boolean if a field has been set.

### GetSalesLatestQNorm

`func (o *StockProfileFundamental) GetSalesLatestQNorm() float32`

GetSalesLatestQNorm returns the SalesLatestQNorm field if non-nil, zero value otherwise.

### GetSalesLatestQNormOk

`func (o *StockProfileFundamental) GetSalesLatestQNormOk() (*float32, bool)`

GetSalesLatestQNormOk returns a tuple with the SalesLatestQNorm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSalesLatestQNorm

`func (o *StockProfileFundamental) SetSalesLatestQNorm(v float32)`

SetSalesLatestQNorm sets SalesLatestQNorm field to given value.

### HasSalesLatestQNorm

`func (o *StockProfileFundamental) HasSalesLatestQNorm() bool`

HasSalesLatestQNorm returns a boolean if a field has been set.

### GetShareholderYield

`func (o *StockProfileFundamental) GetShareholderYield() float32`

GetShareholderYield returns the ShareholderYield field if non-nil, zero value otherwise.

### GetShareholderYieldOk

`func (o *StockProfileFundamental) GetShareholderYieldOk() (*float32, bool)`

GetShareholderYieldOk returns a tuple with the ShareholderYield field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShareholderYield

`func (o *StockProfileFundamental) SetShareholderYield(v float32)`

SetShareholderYield sets ShareholderYield field to given value.

### HasShareholderYield

`func (o *StockProfileFundamental) HasShareholderYield() bool`

HasShareholderYield returns a boolean if a field has been set.

### GetShareholderYieldHigh

`func (o *StockProfileFundamental) GetShareholderYieldHigh() float32`

GetShareholderYieldHigh returns the ShareholderYieldHigh field if non-nil, zero value otherwise.

### GetShareholderYieldHighOk

`func (o *StockProfileFundamental) GetShareholderYieldHighOk() (*float32, bool)`

GetShareholderYieldHighOk returns a tuple with the ShareholderYieldHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShareholderYieldHigh

`func (o *StockProfileFundamental) SetShareholderYieldHigh(v float32)`

SetShareholderYieldHigh sets ShareholderYieldHigh field to given value.

### HasShareholderYieldHigh

`func (o *StockProfileFundamental) HasShareholderYieldHigh() bool`

HasShareholderYieldHigh returns a boolean if a field has been set.

### GetShareholderYieldLow

`func (o *StockProfileFundamental) GetShareholderYieldLow() float32`

GetShareholderYieldLow returns the ShareholderYieldLow field if non-nil, zero value otherwise.

### GetShareholderYieldLowOk

`func (o *StockProfileFundamental) GetShareholderYieldLowOk() (*float32, bool)`

GetShareholderYieldLowOk returns a tuple with the ShareholderYieldLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShareholderYieldLow

`func (o *StockProfileFundamental) SetShareholderYieldLow(v float32)`

SetShareholderYieldLow sets ShareholderYieldLow field to given value.

### HasShareholderYieldLow

`func (o *StockProfileFundamental) HasShareholderYieldLow() bool`

HasShareholderYieldLow returns a boolean if a field has been set.

### GetShareholderYieldMed

`func (o *StockProfileFundamental) GetShareholderYieldMed() float32`

GetShareholderYieldMed returns the ShareholderYieldMed field if non-nil, zero value otherwise.

### GetShareholderYieldMedOk

`func (o *StockProfileFundamental) GetShareholderYieldMedOk() (*float32, bool)`

GetShareholderYieldMedOk returns a tuple with the ShareholderYieldMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShareholderYieldMed

`func (o *StockProfileFundamental) SetShareholderYieldMed(v float32)`

SetShareholderYieldMed sets ShareholderYieldMed field to given value.

### HasShareholderYieldMed

`func (o *StockProfileFundamental) HasShareholderYieldMed() bool`

HasShareholderYieldMed returns a boolean if a field has been set.

### GetShares

`func (o *StockProfileFundamental) GetShares() float32`

GetShares returns the Shares field if non-nil, zero value otherwise.

### GetSharesOk

`func (o *StockProfileFundamental) GetSharesOk() (*float32, bool)`

GetSharesOk returns a tuple with the Shares field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShares

`func (o *StockProfileFundamental) SetShares(v float32)`

SetShares sets Shares field to given value.

### HasShares

`func (o *StockProfileFundamental) HasShares() bool`

HasShares returns a boolean if a field has been set.

### GetSloanratio

`func (o *StockProfileFundamental) GetSloanratio() float32`

GetSloanratio returns the Sloanratio field if non-nil, zero value otherwise.

### GetSloanratioOk

`func (o *StockProfileFundamental) GetSloanratioOk() (*float32, bool)`

GetSloanratioOk returns a tuple with the Sloanratio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSloanratio

`func (o *StockProfileFundamental) SetSloanratio(v float32)`

SetSloanratio sets Sloanratio field to given value.

### HasSloanratio

`func (o *StockProfileFundamental) HasSloanratio() bool`

HasSloanratio returns a boolean if a field has been set.

### GetTaxRateMed5y

`func (o *StockProfileFundamental) GetTaxRateMed5y() float32`

GetTaxRateMed5y returns the TaxRateMed5y field if non-nil, zero value otherwise.

### GetTaxRateMed5yOk

`func (o *StockProfileFundamental) GetTaxRateMed5yOk() (*float32, bool)`

GetTaxRateMed5yOk returns a tuple with the TaxRateMed5y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaxRateMed5y

`func (o *StockProfileFundamental) SetTaxRateMed5y(v float32)`

SetTaxRateMed5y sets TaxRateMed5y field to given value.

### HasTaxRateMed5y

`func (o *StockProfileFundamental) HasTaxRateMed5y() bool`

HasTaxRateMed5y returns a boolean if a field has been set.

### GetTotalBuyback10y

`func (o *StockProfileFundamental) GetTotalBuyback10y() float32`

GetTotalBuyback10y returns the TotalBuyback10y field if non-nil, zero value otherwise.

### GetTotalBuyback10yOk

`func (o *StockProfileFundamental) GetTotalBuyback10yOk() (*float32, bool)`

GetTotalBuyback10yOk returns a tuple with the TotalBuyback10y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalBuyback10y

`func (o *StockProfileFundamental) SetTotalBuyback10y(v float32)`

SetTotalBuyback10y sets TotalBuyback10y field to given value.

### HasTotalBuyback10y

`func (o *StockProfileFundamental) HasTotalBuyback10y() bool`

HasTotalBuyback10y returns a boolean if a field has been set.

### GetTotalBuyback1y

`func (o *StockProfileFundamental) GetTotalBuyback1y() float32`

GetTotalBuyback1y returns the TotalBuyback1y field if non-nil, zero value otherwise.

### GetTotalBuyback1yOk

`func (o *StockProfileFundamental) GetTotalBuyback1yOk() (*float32, bool)`

GetTotalBuyback1yOk returns a tuple with the TotalBuyback1y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalBuyback1y

`func (o *StockProfileFundamental) SetTotalBuyback1y(v float32)`

SetTotalBuyback1y sets TotalBuyback1y field to given value.

### HasTotalBuyback1y

`func (o *StockProfileFundamental) HasTotalBuyback1y() bool`

HasTotalBuyback1y returns a boolean if a field has been set.

### GetTotalBuyback3y

`func (o *StockProfileFundamental) GetTotalBuyback3y() float32`

GetTotalBuyback3y returns the TotalBuyback3y field if non-nil, zero value otherwise.

### GetTotalBuyback3yOk

`func (o *StockProfileFundamental) GetTotalBuyback3yOk() (*float32, bool)`

GetTotalBuyback3yOk returns a tuple with the TotalBuyback3y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalBuyback3y

`func (o *StockProfileFundamental) SetTotalBuyback3y(v float32)`

SetTotalBuyback3y sets TotalBuyback3y field to given value.

### HasTotalBuyback3y

`func (o *StockProfileFundamental) HasTotalBuyback3y() bool`

HasTotalBuyback3y returns a boolean if a field has been set.

### GetTotalBuyback3yHigh

`func (o *StockProfileFundamental) GetTotalBuyback3yHigh() float32`

GetTotalBuyback3yHigh returns the TotalBuyback3yHigh field if non-nil, zero value otherwise.

### GetTotalBuyback3yHighOk

`func (o *StockProfileFundamental) GetTotalBuyback3yHighOk() (*float32, bool)`

GetTotalBuyback3yHighOk returns a tuple with the TotalBuyback3yHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalBuyback3yHigh

`func (o *StockProfileFundamental) SetTotalBuyback3yHigh(v float32)`

SetTotalBuyback3yHigh sets TotalBuyback3yHigh field to given value.

### HasTotalBuyback3yHigh

`func (o *StockProfileFundamental) HasTotalBuyback3yHigh() bool`

HasTotalBuyback3yHigh returns a boolean if a field has been set.

### GetTotalBuyback3yLow

`func (o *StockProfileFundamental) GetTotalBuyback3yLow() float32`

GetTotalBuyback3yLow returns the TotalBuyback3yLow field if non-nil, zero value otherwise.

### GetTotalBuyback3yLowOk

`func (o *StockProfileFundamental) GetTotalBuyback3yLowOk() (*float32, bool)`

GetTotalBuyback3yLowOk returns a tuple with the TotalBuyback3yLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalBuyback3yLow

`func (o *StockProfileFundamental) SetTotalBuyback3yLow(v float32)`

SetTotalBuyback3yLow sets TotalBuyback3yLow field to given value.

### HasTotalBuyback3yLow

`func (o *StockProfileFundamental) HasTotalBuyback3yLow() bool`

HasTotalBuyback3yLow returns a boolean if a field has been set.

### GetTotalBuyback3yMed

`func (o *StockProfileFundamental) GetTotalBuyback3yMed() float32`

GetTotalBuyback3yMed returns the TotalBuyback3yMed field if non-nil, zero value otherwise.

### GetTotalBuyback3yMedOk

`func (o *StockProfileFundamental) GetTotalBuyback3yMedOk() (*float32, bool)`

GetTotalBuyback3yMedOk returns a tuple with the TotalBuyback3yMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalBuyback3yMed

`func (o *StockProfileFundamental) SetTotalBuyback3yMed(v float32)`

SetTotalBuyback3yMed sets TotalBuyback3yMed field to given value.

### HasTotalBuyback3yMed

`func (o *StockProfileFundamental) HasTotalBuyback3yMed() bool`

HasTotalBuyback3yMed returns a boolean if a field has been set.

### GetTotalBuyback5y

`func (o *StockProfileFundamental) GetTotalBuyback5y() float32`

GetTotalBuyback5y returns the TotalBuyback5y field if non-nil, zero value otherwise.

### GetTotalBuyback5yOk

`func (o *StockProfileFundamental) GetTotalBuyback5yOk() (*float32, bool)`

GetTotalBuyback5yOk returns a tuple with the TotalBuyback5y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalBuyback5y

`func (o *StockProfileFundamental) SetTotalBuyback5y(v float32)`

SetTotalBuyback5y sets TotalBuyback5y field to given value.

### HasTotalBuyback5y

`func (o *StockProfileFundamental) HasTotalBuyback5y() bool`

HasTotalBuyback5y returns a boolean if a field has been set.

### GetTtmEBIT

`func (o *StockProfileFundamental) GetTtmEBIT() float32`

GetTtmEBIT returns the TtmEBIT field if non-nil, zero value otherwise.

### GetTtmEBITOk

`func (o *StockProfileFundamental) GetTtmEBITOk() (*float32, bool)`

GetTtmEBITOk returns a tuple with the TtmEBIT field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTtmEBIT

`func (o *StockProfileFundamental) SetTtmEBIT(v float32)`

SetTtmEBIT sets TtmEBIT field to given value.

### HasTtmEBIT

`func (o *StockProfileFundamental) HasTtmEBIT() bool`

HasTtmEBIT returns a boolean if a field has been set.

### GetTtmEBITDA

`func (o *StockProfileFundamental) GetTtmEBITDA() float32`

GetTtmEBITDA returns the TtmEBITDA field if non-nil, zero value otherwise.

### GetTtmEBITDAOk

`func (o *StockProfileFundamental) GetTtmEBITDAOk() (*float32, bool)`

GetTtmEBITDAOk returns a tuple with the TtmEBITDA field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTtmEBITDA

`func (o *StockProfileFundamental) SetTtmEBITDA(v float32)`

SetTtmEBITDA sets TtmEBITDA field to given value.

### HasTtmEBITDA

`func (o *StockProfileFundamental) HasTtmEBITDA() bool`

HasTtmEBITDA returns a boolean if a field has been set.

### GetTtmEps

`func (o *StockProfileFundamental) GetTtmEps() float32`

GetTtmEps returns the TtmEps field if non-nil, zero value otherwise.

### GetTtmEpsOk

`func (o *StockProfileFundamental) GetTtmEpsOk() (*float32, bool)`

GetTtmEpsOk returns a tuple with the TtmEps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTtmEps

`func (o *StockProfileFundamental) SetTtmEps(v float32)`

SetTtmEps sets TtmEps field to given value.

### HasTtmEps

`func (o *StockProfileFundamental) HasTtmEps() bool`

HasTtmEps returns a boolean if a field has been set.

### GetTtmEpsNri

`func (o *StockProfileFundamental) GetTtmEpsNri() float32`

GetTtmEpsNri returns the TtmEpsNri field if non-nil, zero value otherwise.

### GetTtmEpsNriOk

`func (o *StockProfileFundamental) GetTtmEpsNriOk() (*float32, bool)`

GetTtmEpsNriOk returns a tuple with the TtmEpsNri field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTtmEpsNri

`func (o *StockProfileFundamental) SetTtmEpsNri(v float32)`

SetTtmEpsNri sets TtmEpsNri field to given value.

### HasTtmEpsNri

`func (o *StockProfileFundamental) HasTtmEpsNri() bool`

HasTtmEpsNri returns a boolean if a field has been set.

### GetTtmFcfPerShare

`func (o *StockProfileFundamental) GetTtmFcfPerShare() float32`

GetTtmFcfPerShare returns the TtmFcfPerShare field if non-nil, zero value otherwise.

### GetTtmFcfPerShareOk

`func (o *StockProfileFundamental) GetTtmFcfPerShareOk() (*float32, bool)`

GetTtmFcfPerShareOk returns a tuple with the TtmFcfPerShare field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTtmFcfPerShare

`func (o *StockProfileFundamental) SetTtmFcfPerShare(v float32)`

SetTtmFcfPerShare sets TtmFcfPerShare field to given value.

### HasTtmFcfPerShare

`func (o *StockProfileFundamental) HasTtmFcfPerShare() bool`

HasTtmFcfPerShare returns a boolean if a field has been set.

### GetTtmPretaxincome

`func (o *StockProfileFundamental) GetTtmPretaxincome() float32`

GetTtmPretaxincome returns the TtmPretaxincome field if non-nil, zero value otherwise.

### GetTtmPretaxincomeOk

`func (o *StockProfileFundamental) GetTtmPretaxincomeOk() (*float32, bool)`

GetTtmPretaxincomeOk returns a tuple with the TtmPretaxincome field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTtmPretaxincome

`func (o *StockProfileFundamental) SetTtmPretaxincome(v float32)`

SetTtmPretaxincome sets TtmPretaxincome field to given value.

### HasTtmPretaxincome

`func (o *StockProfileFundamental) HasTtmPretaxincome() bool`

HasTtmPretaxincome returns a boolean if a field has been set.

### GetTtmSales

`func (o *StockProfileFundamental) GetTtmSales() float32`

GetTtmSales returns the TtmSales field if non-nil, zero value otherwise.

### GetTtmSalesOk

`func (o *StockProfileFundamental) GetTtmSalesOk() (*float32, bool)`

GetTtmSalesOk returns a tuple with the TtmSales field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTtmSales

`func (o *StockProfileFundamental) SetTtmSales(v float32)`

SetTtmSales sets TtmSales field to given value.

### HasTtmSales

`func (o *StockProfileFundamental) HasTtmSales() bool`

HasTtmSales returns a boolean if a field has been set.

### GetTurnover

`func (o *StockProfileFundamental) GetTurnover() float32`

GetTurnover returns the Turnover field if non-nil, zero value otherwise.

### GetTurnoverOk

`func (o *StockProfileFundamental) GetTurnoverOk() (*float32, bool)`

GetTurnoverOk returns a tuple with the Turnover field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTurnover

`func (o *StockProfileFundamental) SetTurnover(v float32)`

SetTurnover sets Turnover field to given value.

### HasTurnover

`func (o *StockProfileFundamental) HasTurnover() bool`

HasTurnover returns a boolean if a field has been set.

### GetWacc

`func (o *StockProfileFundamental) GetWacc() float32`

GetWacc returns the Wacc field if non-nil, zero value otherwise.

### GetWaccOk

`func (o *StockProfileFundamental) GetWaccOk() (*float32, bool)`

GetWaccOk returns a tuple with the Wacc field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWacc

`func (o *StockProfileFundamental) SetWacc(v float32)`

SetWacc sets Wacc field to given value.

### HasWacc

`func (o *StockProfileFundamental) HasWacc() bool`

HasWacc returns a boolean if a field has been set.

### GetWaccHigh

`func (o *StockProfileFundamental) GetWaccHigh() float32`

GetWaccHigh returns the WaccHigh field if non-nil, zero value otherwise.

### GetWaccHighOk

`func (o *StockProfileFundamental) GetWaccHighOk() (*float32, bool)`

GetWaccHighOk returns a tuple with the WaccHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWaccHigh

`func (o *StockProfileFundamental) SetWaccHigh(v float32)`

SetWaccHigh sets WaccHigh field to given value.

### HasWaccHigh

`func (o *StockProfileFundamental) HasWaccHigh() bool`

HasWaccHigh returns a boolean if a field has been set.

### GetWaccLow

`func (o *StockProfileFundamental) GetWaccLow() float32`

GetWaccLow returns the WaccLow field if non-nil, zero value otherwise.

### GetWaccLowOk

`func (o *StockProfileFundamental) GetWaccLowOk() (*float32, bool)`

GetWaccLowOk returns a tuple with the WaccLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWaccLow

`func (o *StockProfileFundamental) SetWaccLow(v float32)`

SetWaccLow sets WaccLow field to given value.

### HasWaccLow

`func (o *StockProfileFundamental) HasWaccLow() bool`

HasWaccLow returns a boolean if a field has been set.

### GetWaccMed

`func (o *StockProfileFundamental) GetWaccMed() float32`

GetWaccMed returns the WaccMed field if non-nil, zero value otherwise.

### GetWaccMedOk

`func (o *StockProfileFundamental) GetWaccMedOk() (*float32, bool)`

GetWaccMedOk returns a tuple with the WaccMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWaccMed

`func (o *StockProfileFundamental) SetWaccMed(v float32)`

SetWaccMed sets WaccMed field to given value.

### HasWaccMed

`func (o *StockProfileFundamental) HasWaccMed() bool`

HasWaccMed returns a boolean if a field has been set.

### GetWaccMed5y

`func (o *StockProfileFundamental) GetWaccMed5y() float32`

GetWaccMed5y returns the WaccMed5y field if non-nil, zero value otherwise.

### GetWaccMed5yOk

`func (o *StockProfileFundamental) GetWaccMed5yOk() (*float32, bool)`

GetWaccMed5yOk returns a tuple with the WaccMed5y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWaccMed5y

`func (o *StockProfileFundamental) SetWaccMed5y(v float32)`

SetWaccMed5y sets WaccMed5y field to given value.

### HasWaccMed5y

`func (o *StockProfileFundamental) HasWaccMed5y() bool`

HasWaccMed5y returns a boolean if a field has been set.

### GetYearsOfFinancialHistory

`func (o *StockProfileFundamental) GetYearsOfFinancialHistory() float32`

GetYearsOfFinancialHistory returns the YearsOfFinancialHistory field if non-nil, zero value otherwise.

### GetYearsOfFinancialHistoryOk

`func (o *StockProfileFundamental) GetYearsOfFinancialHistoryOk() (*float32, bool)`

GetYearsOfFinancialHistoryOk returns a tuple with the YearsOfFinancialHistory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetYearsOfFinancialHistory

`func (o *StockProfileFundamental) SetYearsOfFinancialHistory(v float32)`

SetYearsOfFinancialHistory sets YearsOfFinancialHistory field to given value.

### HasYearsOfFinancialHistory

`func (o *StockProfileFundamental) HasYearsOfFinancialHistory() bool`

HasYearsOfFinancialHistory returns a boolean if a field has been set.

### GetZscore

`func (o *StockProfileFundamental) GetZscore() float32`

GetZscore returns the Zscore field if non-nil, zero value otherwise.

### GetZscoreOk

`func (o *StockProfileFundamental) GetZscoreOk() (*float32, bool)`

GetZscoreOk returns a tuple with the Zscore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetZscore

`func (o *StockProfileFundamental) SetZscore(v float32)`

SetZscore sets Zscore field to given value.

### HasZscore

`func (o *StockProfileFundamental) HasZscore() bool`

HasZscore returns a boolean if a field has been set.

### GetZscoreHigh

`func (o *StockProfileFundamental) GetZscoreHigh() float32`

GetZscoreHigh returns the ZscoreHigh field if non-nil, zero value otherwise.

### GetZscoreHighOk

`func (o *StockProfileFundamental) GetZscoreHighOk() (*float32, bool)`

GetZscoreHighOk returns a tuple with the ZscoreHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetZscoreHigh

`func (o *StockProfileFundamental) SetZscoreHigh(v float32)`

SetZscoreHigh sets ZscoreHigh field to given value.

### HasZscoreHigh

`func (o *StockProfileFundamental) HasZscoreHigh() bool`

HasZscoreHigh returns a boolean if a field has been set.

### GetZscoreLow

`func (o *StockProfileFundamental) GetZscoreLow() float32`

GetZscoreLow returns the ZscoreLow field if non-nil, zero value otherwise.

### GetZscoreLowOk

`func (o *StockProfileFundamental) GetZscoreLowOk() (*float32, bool)`

GetZscoreLowOk returns a tuple with the ZscoreLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetZscoreLow

`func (o *StockProfileFundamental) SetZscoreLow(v float32)`

SetZscoreLow sets ZscoreLow field to given value.

### HasZscoreLow

`func (o *StockProfileFundamental) HasZscoreLow() bool`

HasZscoreLow returns a boolean if a field has been set.

### GetZscoreMed

`func (o *StockProfileFundamental) GetZscoreMed() float32`

GetZscoreMed returns the ZscoreMed field if non-nil, zero value otherwise.

### GetZscoreMedOk

`func (o *StockProfileFundamental) GetZscoreMedOk() (*float32, bool)`

GetZscoreMedOk returns a tuple with the ZscoreMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetZscoreMed

`func (o *StockProfileFundamental) SetZscoreMed(v float32)`

SetZscoreMed sets ZscoreMed field to given value.

### HasZscoreMed

`func (o *StockProfileFundamental) HasZscoreMed() bool`

HasZscoreMed returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


