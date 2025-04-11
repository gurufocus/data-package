

# StockProfileValuationRatio


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**EPV** | **BigDecimal** | Earnings power value (EPV) is a technique for valuing stocks by making assumptions about the sustainability of current earnings and the cost of capital but not future growth. |  [optional] |
|**fcFyield** | **BigDecimal** | Free cash flow yield: the free cash flow divided by share price |  [optional] |
|**fcFyieldHigh** | **BigDecimal** |  |  [optional] |
|**fcFyieldLow** | **BigDecimal** |  |  [optional] |
|**fcFyieldMed** | **BigDecimal** |  |  [optional] |
|**fcFyieldMed5y** | **BigDecimal** | The median free cash flow yield over the past five years. |  [optional] |
|**ownerEarnings** | **BigDecimal** | If we think through these questions, we can gain some insights about what may be called &#39;owner earnings.&#39; These represent (A) reported earnings plus (B) depreciation, depletion, amortization, and certain other non-cash charges such as Company N&#39;s items (1) and (4) less the average annual amount of capitalized expenditures for plant and equipment, etc. that the business requires to fully maintain its long-term competitive position and its unit volume. (If the business requires additional working capital to maintain its competitive position and unit volume, the increment also should be included in (c). However, businesses following the LIFO inventory method usually do not require additional working capital if unit volume does not change. |  [optional] |
|**rateOfReturn** | **BigDecimal** | Yacktman defines forward rate of return as the normalized free cash flow yield plus real growth plus inflation. |  [optional] |
|**rateOfReturnHigh** | **BigDecimal** | Yacktman defines forward rate of return as the normalized free cash flow yield plus real growth plus inflation. |  [optional] |
|**rateOfReturnLow** | **BigDecimal** | Yacktman defines forward rate of return as the normalized free cash flow yield plus real growth plus inflation. |  [optional] |
|**rateOfReturnMed** | **BigDecimal** | Yacktman defines forward rate of return as the normalized free cash flow yield plus real growth plus inflation. |  [optional] |
|**shillerPE** | **BigDecimal** | Price earnings ratio is based on average inflation-adjusted earnings from the previous 10 years, known as the Cyclically Adjusted PE Ratio (CAPE Ratio), Shiller PE Ratio, or PE 10 |  [optional] |
|**shillerPEHigh** | **BigDecimal** | Price earnings ratio is based on average inflation-adjusted earnings from the previous 10 years, known as the Cyclically Adjusted PE Ratio (CAPE Ratio), Shiller PE Ratio, or PE 10 |  [optional] |
|**shillerPELow** | **BigDecimal** | Price earnings ratio is based on average inflation-adjusted earnings from the previous 10 years, known as the Cyclically Adjusted PE Ratio (CAPE Ratio), Shiller PE Ratio, or PE 10 |  [optional] |
|**shillerPEMed** | **BigDecimal** | Price earnings ratio is based on average inflation-adjusted earnings from the previous 10 years, known as the Cyclically Adjusted PE Ratio (CAPE Ratio), Shiller PE Ratio, or PE 10 |  [optional] |
|**cyclicallyAdjustedBook** | **BigDecimal** |  |  [optional] |
|**cyclicallyAdjustedFcf** | **BigDecimal** |  |  [optional] |
|**cyclicallyAdjustedPb** | **BigDecimal** | The Cyclically Adjusted PB Ratio, also known as the CAPB Ratio, is the stock price divided by the average of the inflation adjusted book value per share of a company over the past 10 years. |  [optional] |
|**cyclicallyAdjustedPbHigh** | **BigDecimal** |  |  [optional] |
|**cyclicallyAdjustedPbLow** | **BigDecimal** |  |  [optional] |
|**cyclicallyAdjustedPbMed** | **BigDecimal** |  |  [optional] |
|**cyclicallyAdjustedPfcf** | **BigDecimal** |  |  [optional] |
|**cyclicallyAdjustedPfcfHigh** | **BigDecimal** |  |  [optional] |
|**cyclicallyAdjustedPfcfLow** | **BigDecimal** |  |  [optional] |
|**cyclicallyAdjustedPfcfMed** | **BigDecimal** |  |  [optional] |
|**cyclicallyAdjustedPs** | **BigDecimal** | The Cyclically Adjusted PS Ratio, also referred to as the CAPS Ratio, is the stock price divided by the average of the inflation adjusted revenue per share of a company over the past 10 years. |  [optional] |
|**cyclicallyAdjustedPsHigh** | **BigDecimal** |  |  [optional] |
|**cyclicallyAdjustedPsLow** | **BigDecimal** |  |  [optional] |
|**cyclicallyAdjustedPsMed** | **BigDecimal** |  |  [optional] |
|**cyclicallyAdjustedRvn** | **BigDecimal** |  |  [optional] |
|**e10** | **BigDecimal** | E10 is a concept invented by Prof. Robert Shiller, who uses E10 for his Shiller P/E calculation. When we calculate the today™s Shiller P/E ratio of a stock, we use today™s price divided by E10.     What is E10? How do we calculate E10?    E10 is the average of the inflation adjusted earnings of a company over the past 10 years. Let™s use an example to explain.     If we want to calculate the E10 of Wal-Mart (WMT) for Dec. 31, 2010, we need to have the inflation data and the earnings from 2001 through 2010.     We adjusted the earnings of 2001 earnings data with the total inflation from 2001 through 2010 to the equivalent earnings in 2010. If the total inflation from 2001 to 2010 is 40%, and Wal-Mart earned $1 a share in 2001, then the 2001™s equivalent earnings in 2010 is $1.4 a share. If Wal-Mart earns $1 again in 2002, and the total inflation from 2002 through 2010 is 35%, then the equivalent 2002 earnings in 2010 is $1.35. So on and so forth, you get the equivalent earnings of past 10 years. Then you add them together and divided the sum by 10 to get E10. |  [optional] |
|**earningYield** | **BigDecimal** | Earnings-to-price ratio, i.e., the inverse of PE |  [optional] |
|**earningYieldGreenblatt** | **BigDecimal** | The standard definition of earnings yield is the earnings per share divided by the price of a share. It&#39;s the inverse of P/E and shows the amount of money earned compared to the price you pay for a share. |  [optional] |
|**earningYieldGreenblattHigh** | **BigDecimal** | The standard definition of earnings yield is the earnings per share divided by the price of a share. It&#39;s the inverse of P/E and shows the amount of money earned compared to the price you pay for a share. |  [optional] |
|**earningYieldGreenblattLow** | **BigDecimal** | The standard definition of earnings yield is the earnings per share divided by the price of a share. It&#39;s the inverse of P/E and shows the amount of money earned compared to the price you pay for a share. |  [optional] |
|**earningYieldGreenblattMed** | **BigDecimal** | The standard definition of earnings yield is the earnings per share divided by the price of a share. It&#39;s the inverse of P/E and shows the amount of money earned compared to the price you pay for a share. |  [optional] |
|**earningYieldHigh** | **BigDecimal** |  |  [optional] |
|**earningYieldLow** | **BigDecimal** |  |  [optional] |
|**earningYieldMed** | **BigDecimal** |  |  [optional] |
|**ev2ebit** | **BigDecimal** | EV-to-EBIT is calculated as Enterprise Value divided by its EBIT. |  [optional] |
|**ev2ebitda** | **BigDecimal** | EV-to-EBITDA is calculated as enterprise value divided by its EBITDA. |  [optional] |
|**ev2ebitdahigh** | **BigDecimal** | EV-to-EBITDA is calculated as enterprise value divided by its EBITDA. |  [optional] |
|**ev2ebitdalow** | **BigDecimal** | EV-to-EBITDA is calculated as enterprise value divided by its EBITDA. |  [optional] |
|**ev2ebitdamed** | **BigDecimal** | EV-to-EBITDA is calculated as enterprise value divided by its EBITDA. |  [optional] |
|**ev2ebithigh** | **BigDecimal** | EV-to-EBIT is calculated as Enterprise Value divided by its EBIT. |  [optional] |
|**ev2ebitlow** | **BigDecimal** | EV-to-EBIT is calculated as Enterprise Value divided by its EBIT. |  [optional] |
|**ev2ebitmed** | **BigDecimal** | EV-to-EBIT is calculated as Enterprise Value divided by its EBIT. |  [optional] |
|**ev2fcf** | **BigDecimal** |  |  [optional] |
|**ev2fcfhigh** | **BigDecimal** |  |  [optional] |
|**ev2fcflow** | **BigDecimal** |  |  [optional] |
|**ev2fcfmed** | **BigDecimal** |  |  [optional] |
|**ev2pretaxincome** | **BigDecimal** | The ratio of enterprise value to pretax income |  [optional] |
|**ev2rev** | **BigDecimal** | EV-to-Revenue is calculated as enterprise value divided by its revenue. |  [optional] |
|**ev2revhigh** | **BigDecimal** | EV-to-Revenue is calculated as enterprise value divided by its revenue. |  [optional] |
|**ev2revlow** | **BigDecimal** | EV-to-Revenue is calculated as enterprise value divided by its revenue. |  [optional] |
|**ev2revmed** | **BigDecimal** | EV-to-Revenue is calculated as enterprise value divided by its revenue. |  [optional] |
|**evToForwardEbit** | **BigDecimal** |  |  [optional] |
|**evToForwardEbitda** | **BigDecimal** |  |  [optional] |
|**evToForwardRevenue** | **BigDecimal** |  |  [optional] |
|**forwardPE** | **BigDecimal** | Forward PE is calculated by as current stock price over the predicted next annual earnings period. |  [optional] |
|**forwardFcfYield** | **BigDecimal** | Forward FCF Yield % is calculated as estimated free cash flow divided by current market capitalization. |  [optional] |
|**forwardPegRatio** | **BigDecimal** | Forward PEG Ratio is calculated as current PE Ratio without NRI divided by the Future 3-5Y EPS without NRI Growth Rate. |  [optional] |
|**grahamnumber** | **BigDecimal** | Graham Number is a concept based on Ben Graham\\&#39;s conservative valuation of companies. Graham Number is calculated as follows:    Graham Number &#x3D; SquareRoot of (22.5 * {Tangible Book Value per Share} * {Earnings per Share})    &#x3D; SquareRoot of (22.5 * {Net Income} * {Total Equity}) / {Total Shares Outstanding} |  [optional] |
|**ivDcEarning** | **BigDecimal** | The intrinsic value of a company based on the discounted earnings model. |  [optional] |
|**ivDcf** | **BigDecimal** | The intrinsic value of a company based on the discounted free cash flow model |  [optional] |
|**ivDcfDividend** | **BigDecimal** |  |  [optional] |
|**ivDcfShare** | **BigDecimal** | The Discounted Free Cash Flow Screener focuses on Free Cash Flow (FCF) and Total Equity. These measures can be used to determine an intrinsic value estimate for a company. |  [optional] |
|**lynchvalue** | **BigDecimal** | Peter Lynch Fair Value applies to growing companies. The ideal range for the growth rate is between 10 - 20% a year. |  [optional] |
|**marginDcEarning** | **BigDecimal** | The difference between current price and intrinsic value based on discounted cash flow model using the company&#39;s TTM earnings. |  [optional] |
|**marginDcf** | **BigDecimal** | The difference between current price and intrinsic value based on discounted cash flow model using the company&#39;s TTM Free Cash Flow. |  [optional] |
|**marginDcfDividend** | **BigDecimal** | The difference between current price and intrinsic value based on discounted dividend model using the company&#39;s TTM dividends. |  [optional] |
|**medpbvalue** | **BigDecimal** | Median price-book value: the book value per share multiplied by 10-year median price-book ratio |  [optional] |
|**medpsvalue** | **BigDecimal** | This valuation method assumes that the stock valuation will revert to its historical mean in terms of Price/Sales Ratio. |  [optional] |
|**ncav** | **BigDecimal** | A net-net is a company with a market capitalization that is less than the company&#39;s current assets minus total liabilities, or equivalently, the company&#39;s working capital minus long-term liabilities. This value is called the net current asset value. |  [optional] |
|**ncavReal** | **BigDecimal** | In calculating the Net Current Asset Value (NCAV), Benjamin Graham means a company&#39;s current assets (such as cash, marketable securities, and inventories) minus its total liabilities (including preferred stock, minority interest, and long-term debt). |  [optional] |
|**netCash** | **BigDecimal** | Equals cash and cash equivalents less total liabilities less minority interest |  [optional] |
|**p2EPV** | **BigDecimal** | The ratio of a company&#39;s stock price to its earnings power value |  [optional] |
|**p2OwnerEarnings** | **BigDecimal** | In 1986 Berkshire Hathaway Shareholder Letter, Warren Buffett defined owner earnings as follows:  \&quot;These represent (a) reported earnings plus (b) depreciation, depletion, amortization, and certain other non-cash charges...less (c) the average annual amount of capitalized expenditures for plant and equipment, etc. that the business requires to fully maintain its long-term competitive position and its unit volume. (If the business requires additional working capital to maintain its competitive position and unit volume, the increment also should be included in (c))...Our owner-earnings equation does not yield the deceptively precise figures provided by GAAP, since (c) must be a guess - and one sometimes very difficult to make. Despite this problem, we consider the owner earnings figure, not the GAAP figure, to be the relevant item for valuation purposes - both for investors in buying stocks and for managers in buying entire businesses...All of this points up the absurdity of the &#39;cash flow&#39; numbers that are often set forth in Wall Street reports. These numbers routinely include (a) plus (b) - but do not subtract (c).\&quot; |  [optional] |
|**p2OwnerEarningsHigh** | **BigDecimal** | The highest price-to-owner-earnings ratio over the past 10 years |  [optional] |
|**p2OwnerEarningsLow** | **BigDecimal** | The lowest price-to-owner-earnings ratio over the past 10 years |  [optional] |
|**p2OwnerEarningsMed** | **BigDecimal** | The median price-to-owner-earnings ratio over the past 10 years |  [optional] |
|**p2ffo** | **BigDecimal** | Price to Funds From Operations is an equity valuation metric used to compare a company&#39;s per-share market price to its per-share amount of Funds From Operations (FFO). |  [optional] |
|**p2grahamnumber** | **BigDecimal** | The Graham number is the upper bound of the price range that a defensive investor should pay for the stock. |  [optional] |
|**p2grahamnumberHigh** | **BigDecimal** | The Graham number is the upper bound of the price range that a defensive investor should pay for the stock. |  [optional] |
|**p2grahamnumberLow** | **BigDecimal** | The Graham number is the upper bound of the price range that a defensive investor should pay for the stock. |  [optional] |
|**p2grahamnumberMed** | **BigDecimal** | The Graham number is the upper bound of the price range that a defensive investor should pay for the stock. |  [optional] |
|**p2ivDcEarning** | **BigDecimal** | Discounted cash flow (DCF) is a valuation method used to estimate the value of an investment based on its future cash flows. |  [optional] |
|**p2ivDcEarningHigh** | **BigDecimal** | Discounted cash flow (DCF) is a valuation method used to estimate the value of an investment based on its future cash flows. |  [optional] |
|**p2ivDcEarningLow** | **BigDecimal** | Discounted cash flow (DCF) is a valuation method used to estimate the value of an investment based on its future cash flows. |  [optional] |
|**p2ivDcEarningMed** | **BigDecimal** | Discounted cash flow (DCF) is a valuation method used to estimate the value of an investment based on its future cash flows. |  [optional] |
|**p2ivDcf** | **BigDecimal** | Discounted cash flow (DCF) is a valuation method used to estimate the value of an investment based on its future cash flows. |  [optional] |
|**p2ivDcfDividend** | **BigDecimal** |  |  [optional] |
|**p2ivDcfDividendHigh** | **BigDecimal** |  |  [optional] |
|**p2ivDcfDividendLow** | **BigDecimal** |  |  [optional] |
|**p2ivDcfDividendMed** | **BigDecimal** |  |  [optional] |
|**p2ivDcfHigh** | **BigDecimal** | The highest price-to-discounted-free-cash-flow ratio over the past 10 years |  [optional] |
|**p2ivDcfLow** | **BigDecimal** | The lowest price-to-discounted-free-cash-flow ratio over the past 10 years |  [optional] |
|**p2ivDcfMed** | **BigDecimal** | The median price-to-discounted-free-cash-flow ratio over the past 10 years |  [optional] |
|**p2ivDcfShare** | **BigDecimal** |  |  [optional] |
|**p2ivDcfShareHigh** | **BigDecimal** | The highest price to intrinsic value based on projected free cash flow over the past 10 years |  [optional] |
|**p2ivDcfShareLow** | **BigDecimal** | The lowest price to intrinsic value based on projected free cash flow over the past 10 years |  [optional] |
|**p2ivDcfShareMed** | **BigDecimal** | The median price to intrinsic value based on projected free cash flow over the past 10 years |  [optional] |
|**p2lynchvalue** | **BigDecimal** |  |  [optional] |
|**p2lynchvalueHigh** | **BigDecimal** | The highest price to Peter Lynch fair value over the past 10 years |  [optional] |
|**p2lynchvalueLow** | **BigDecimal** | The lowest price to Peter Lynch fair value over the past 10 years |  [optional] |
|**p2lynchvalueMed** | **BigDecimal** | The median price to Peter Lynch fair value over the past 10 years |  [optional] |
|**p2medpbvalue** | **BigDecimal** | The ratio of share price to the median price-book value |  [optional] |
|**p2medpbvalueHigh** | **BigDecimal** | The highest price-to-median-PB-Value over the past 10 years |  [optional] |
|**p2medpbvalueLow** | **BigDecimal** | The lowest price-to-median-PB-Value over the past 10 years |  [optional] |
|**p2medpbvalueMed** | **BigDecimal** | The median price-to-median-PB-Value over the past 10 years |  [optional] |
|**p2medpsvalue** | **BigDecimal** | Median P/S Value is calculated as trailing twelve months (TTM) Revenue per Share times 10-Year median P/S ratio. |  [optional] |
|**p2medpsvalueHigh** | **BigDecimal** | Median P/S Value is calculated as trailing twelve months (TTM) Revenue per Share times 10-Year median P/S ratio. |  [optional] |
|**p2medpsvalueLow** | **BigDecimal** | Median P/S Value is calculated as trailing twelve months (TTM) Revenue per Share times 10-Year median P/S ratio. |  [optional] |
|**p2medpsvalueMed** | **BigDecimal** | Median P/S Value is calculated as trailing twelve months (TTM) Revenue per Share times 10-Year median P/S ratio. |  [optional] |
|**p2ncav** | **BigDecimal** | In calculating the Net Current Asset Value (NCAV), Benjamin Graham means a company&#39;s current assets (such as cash, marketable securities, and inventories) minus its total liabilities (including preferred stock, minority interest, and long-term debt). |  [optional] |
|**p2ncavHigh** | **BigDecimal** | In calculating the Net Current Asset Value (NCAV), Benjamin Graham means a company&#39;s current assets (such as cash, marketable securities, and inventories) minus its total liabilities (including preferred stock, minority interest, and long-term debt). |  [optional] |
|**p2ncavLow** | **BigDecimal** | In calculating the Net Current Asset Value (NCAV), Benjamin Graham means a company&#39;s current assets (such as cash, marketable securities, and inventories) minus its total liabilities (including preferred stock, minority interest, and long-term debt). |  [optional] |
|**p2ncavMed** | **BigDecimal** | In calculating the Net Current Asset Value (NCAV), Benjamin Graham means a company&#39;s current assets (such as cash, marketable securities, and inventories) minus its total liabilities (including preferred stock, minority interest, and long-term debt). |  [optional] |
|**p2netCash** | **BigDecimal** | Net cash per share is calculated as Cash And Cash Equivalents minus Total Liabilities minus Minority Interest and then divided by Shares Outstanding (EOP). |  [optional] |
|**p2netCashHigh** | **BigDecimal** | Net cash per share is calculated as Cash And Cash Equivalents minus Total Liabilities minus Minority Interest and then divided by Shares Outstanding (EOP). |  [optional] |
|**p2netCashLow** | **BigDecimal** | Net cash per share is calculated as Cash And Cash Equivalents minus Total Liabilities minus Minority Interest and then divided by Shares Outstanding (EOP). |  [optional] |
|**p2netCashMed** | **BigDecimal** | Net cash per share is calculated as Cash And Cash Equivalents minus Total Liabilities minus Minority Interest and then divided by Shares Outstanding (EOP). |  [optional] |
|**p2nnwc** | **BigDecimal** | In calculating the Net-Net Working Capital (NNWC), Benjamin Graham assumed that a company&#39;s accounts receivable is only worth 75% its value, its inventory is only worth 50% of its value, but its liabilities have to be paid in full. |  [optional] |
|**p2tangibleBook** | **BigDecimal** | The Price to Tangible Book Value ratio (PTBV) expresses share price as a proportion of the company&#39;s tangible book value reported on the company&#39;s balance sheet. |  [optional] |
|**p2tangibleBookHigh** | **BigDecimal** | The Price to Tangible Book Value ratio (PTBV) expresses share price as a proportion of the company&#39;s tangible book value reported on the company&#39;s balance sheet. |  [optional] |
|**p2tangibleBookLow** | **BigDecimal** | The Price to Tangible Book Value ratio (PTBV) expresses share price as a proportion of the company&#39;s tangible book value reported on the company&#39;s balance sheet. |  [optional] |
|**p2tangibleBookMed** | **BigDecimal** | The Price to Tangible Book Value ratio (PTBV) expresses share price as a proportion of the company&#39;s tangible book value reported on the company&#39;s balance sheet. |  [optional] |
|**pb** | **BigDecimal** | Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio. |  [optional] |
|**pbhigh** | **BigDecimal** | Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio. |  [optional] |
|**pblow** | **BigDecimal** | Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio. |  [optional] |
|**pbmed** | **BigDecimal** | Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio. |  [optional] |
|**pe** | **BigDecimal** | &lt;p&gt;The PE ratio, or Price-to-Earnings ratio, is the most widely used metric in the valuation of stocks. It is calculated as:  &lt;b&gt;PE Ratio &#x3D; Share Price / {{eps_diluated}}&lt;/b&gt;.   It can also be calculated from the numbers for the whole company:  &lt;b&gt;PE Ratio &#x3D; {{mktcap}} / {{net_income}}&lt;/b&gt;.&lt;/p&gt;  &lt;p&gt;There are at least three kinds of PE ratios used among different investors. They are Trailing Twelve Month PE Ratio({{pettm}}), {{forwardPE}}, and {{penri}}. A new PE ratio based on inflation-adjusted normalized PE ratio is called {{ShillerPE}}, after Yale professor Robert Shiller.&lt;/p&gt;  &lt;p&gt;In the calculation of {{pettm}}, the earnings per share used are the earnings per share over the past 12 months({{ttm_eps}}). For {{forwardPE}}, the earnings are the expected earnings for the next twelve months({{forward_eps}}). In the case of {{penri}}, the reported earnings less the non-recurring items are used({{eps_nri}}).For the {{ShillerPE}}, the earnings of the past 10 years are inflation-adjusted and averaged. Since {{ShillerPE}} looks at the average over the last 10 years, it is also called PE10.&lt;/p&gt; |  [optional] |
|**pebitMed** | **BigDecimal** | The median price-to-EBIT ratio over the past 10 years |  [optional] |
|**pebitdaMed** | **BigDecimal** | The median price-to-EBITDA ratio over the past 10 years |  [optional] |
|**peg** | **BigDecimal** | PEG is defined as the PE Ratio without NRI divided by the growth ratio. The growth rate we use is the 5-year average EBITDA growth rate. |  [optional] |
|**peghigh** | **BigDecimal** | PEG is defined as the PE Ratio without NRI divided by the growth ratio. The growth rate we use is the 5-year average EBITDA growth rate. |  [optional] |
|**peglow** | **BigDecimal** | PEG is defined as the PE Ratio without NRI divided by the growth ratio. The growth rate we use is the 5-year average EBITDA growth rate. |  [optional] |
|**pegmed** | **BigDecimal** | PEG is defined as the PE Ratio without NRI divided by the growth ratio. The growth rate we use is the 5-year average EBITDA growth rate. |  [optional] |
|**penri** | **BigDecimal** |  |  [optional] |
|**penrihigh** | **BigDecimal** |  |  [optional] |
|**penrilow** | **BigDecimal** |  |  [optional] |
|**penrimed** | **BigDecimal** |  |  [optional] |
|**pettmhigh** | **BigDecimal** | The highest price-earnings ratio over the past 10 years |  [optional] |
|**pettmlow** | **BigDecimal** | The lowest price-earnings ratio over the past 10 years |  [optional] |
|**pettmmed** | **BigDecimal** | The median price-earnings ratio over the past 10 years |  [optional] |
|**pfcf** | **BigDecimal** | Price to free cash flow is an equity valuation metric used to compare a company&#39;s per-share market price to its per-share amount of free cash flow (FCF). |  [optional] |
|**pfcfhigh** | **BigDecimal** | Price to free cash flow is an equity valuation metric used to compare a company&#39;s per-share market price to its per-share amount of free cash flow (FCF). |  [optional] |
|**pfcflow** | **BigDecimal** | Price to free cash flow is an equity valuation metric used to compare a company&#39;s per-share market price to its per-share amount of free cash flow (FCF). |  [optional] |
|**pfcfmed** | **BigDecimal** | Price to free cash flow is an equity valuation metric used to compare a company&#39;s per-share market price to its per-share amount of free cash flow (FCF). |  [optional] |
|**pocf** | **BigDecimal** | The price/cash flow ratio (also called price-to-cash flow ratio or P/CF), is a ratio used to compare a company&#39;s market value to its cash flow. |  [optional] |
|**pocfhigh** | **BigDecimal** | The price/cash flow ratio (also called price-to-cash flow ratio or P/CF), is a ratio used to compare a company&#39;s market value to its cash flow. |  [optional] |
|**pocflow** | **BigDecimal** | The price/cash flow ratio (also called price-to-cash flow ratio or P/CF), is a ratio used to compare a company&#39;s market value to its cash flow. |  [optional] |
|**pocfmed** | **BigDecimal** | The price/cash flow ratio (also called price-to-cash flow ratio or P/CF), is a ratio used to compare a company&#39;s market value to its cash flow. |  [optional] |
|**ps** | **BigDecimal** | Price–sales ratio, P/S ratio, or PSR, is a valuation metric for stocks. |  [optional] |
|**pshigh** | **BigDecimal** | Price–sales ratio, P/S ratio, or PSR, is a valuation metric for stocks. |  [optional] |
|**pslow** | **BigDecimal** | Price–sales ratio, P/S ratio, or PSR, is a valuation metric for stocks. |  [optional] |
|**psmed** | **BigDecimal** | Price–sales ratio, P/S ratio, or PSR, is a valuation metric for stocks. |  [optional] |
|**tangibleBook** | **BigDecimal** | The per share value of a company based on common shareholder&#39;s equity less intangible assets |  [optional] |



