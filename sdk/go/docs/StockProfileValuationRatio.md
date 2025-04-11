# StockProfileValuationRatio

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EPV** | Pointer to **float32** | Earnings power value (EPV) is a technique for valuing stocks by making assumptions about the sustainability of current earnings and the cost of capital but not future growth. | [optional] 
**FCFyield** | Pointer to **float32** | Free cash flow yield: the free cash flow divided by share price | [optional] 
**FCFyieldHigh** | Pointer to **float32** |  | [optional] 
**FCFyieldLow** | Pointer to **float32** |  | [optional] 
**FCFyieldMed** | Pointer to **float32** |  | [optional] 
**FCFyieldMed5y** | Pointer to **float32** | The median free cash flow yield over the past five years. | [optional] 
**OwnerEarnings** | Pointer to **float32** | If we think through these questions, we can gain some insights about what may be called &#39;owner earnings.&#39; These represent (A) reported earnings plus (B) depreciation, depletion, amortization, and certain other non-cash charges such as Company N&#39;s items (1) and (4) less the average annual amount of capitalized expenditures for plant and equipment, etc. that the business requires to fully maintain its long-term competitive position and its unit volume. (If the business requires additional working capital to maintain its competitive position and unit volume, the increment also should be included in (c). However, businesses following the LIFO inventory method usually do not require additional working capital if unit volume does not change. | [optional] 
**RateOfReturn** | Pointer to **float32** | Yacktman defines forward rate of return as the normalized free cash flow yield plus real growth plus inflation. | [optional] 
**RateOfReturnHigh** | Pointer to **float32** | Yacktman defines forward rate of return as the normalized free cash flow yield plus real growth plus inflation. | [optional] 
**RateOfReturnLow** | Pointer to **float32** | Yacktman defines forward rate of return as the normalized free cash flow yield plus real growth plus inflation. | [optional] 
**RateOfReturnMed** | Pointer to **float32** | Yacktman defines forward rate of return as the normalized free cash flow yield plus real growth plus inflation. | [optional] 
**ShillerPE** | Pointer to **float32** | Price earnings ratio is based on average inflation-adjusted earnings from the previous 10 years, known as the Cyclically Adjusted PE Ratio (CAPE Ratio), Shiller PE Ratio, or PE 10 | [optional] 
**ShillerPEHigh** | Pointer to **float32** | Price earnings ratio is based on average inflation-adjusted earnings from the previous 10 years, known as the Cyclically Adjusted PE Ratio (CAPE Ratio), Shiller PE Ratio, or PE 10 | [optional] 
**ShillerPELow** | Pointer to **float32** | Price earnings ratio is based on average inflation-adjusted earnings from the previous 10 years, known as the Cyclically Adjusted PE Ratio (CAPE Ratio), Shiller PE Ratio, or PE 10 | [optional] 
**ShillerPEMed** | Pointer to **float32** | Price earnings ratio is based on average inflation-adjusted earnings from the previous 10 years, known as the Cyclically Adjusted PE Ratio (CAPE Ratio), Shiller PE Ratio, or PE 10 | [optional] 
**CyclicallyAdjustedBook** | Pointer to **float32** |  | [optional] 
**CyclicallyAdjustedFcf** | Pointer to **float32** |  | [optional] 
**CyclicallyAdjustedPb** | Pointer to **float32** | The Cyclically Adjusted PB Ratio, also known as the CAPB Ratio, is the stock price divided by the average of the inflation adjusted book value per share of a company over the past 10 years. | [optional] 
**CyclicallyAdjustedPbHigh** | Pointer to **float32** |  | [optional] 
**CyclicallyAdjustedPbLow** | Pointer to **float32** |  | [optional] 
**CyclicallyAdjustedPbMed** | Pointer to **float32** |  | [optional] 
**CyclicallyAdjustedPfcf** | Pointer to **float32** |  | [optional] 
**CyclicallyAdjustedPfcfHigh** | Pointer to **float32** |  | [optional] 
**CyclicallyAdjustedPfcfLow** | Pointer to **float32** |  | [optional] 
**CyclicallyAdjustedPfcfMed** | Pointer to **float32** |  | [optional] 
**CyclicallyAdjustedPs** | Pointer to **float32** | The Cyclically Adjusted PS Ratio, also referred to as the CAPS Ratio, is the stock price divided by the average of the inflation adjusted revenue per share of a company over the past 10 years. | [optional] 
**CyclicallyAdjustedPsHigh** | Pointer to **float32** |  | [optional] 
**CyclicallyAdjustedPsLow** | Pointer to **float32** |  | [optional] 
**CyclicallyAdjustedPsMed** | Pointer to **float32** |  | [optional] 
**CyclicallyAdjustedRvn** | Pointer to **float32** |  | [optional] 
**E10** | Pointer to **float32** | E10 is a concept invented by Prof. Robert Shiller, who uses E10 for his Shiller P/E calculation. When we calculate the today™s Shiller P/E ratio of a stock, we use today™s price divided by E10.     What is E10? How do we calculate E10?    E10 is the average of the inflation adjusted earnings of a company over the past 10 years. Let™s use an example to explain.     If we want to calculate the E10 of Wal-Mart (WMT) for Dec. 31, 2010, we need to have the inflation data and the earnings from 2001 through 2010.     We adjusted the earnings of 2001 earnings data with the total inflation from 2001 through 2010 to the equivalent earnings in 2010. If the total inflation from 2001 to 2010 is 40%, and Wal-Mart earned $1 a share in 2001, then the 2001™s equivalent earnings in 2010 is $1.4 a share. If Wal-Mart earns $1 again in 2002, and the total inflation from 2002 through 2010 is 35%, then the equivalent 2002 earnings in 2010 is $1.35. So on and so forth, you get the equivalent earnings of past 10 years. Then you add them together and divided the sum by 10 to get E10. | [optional] 
**EarningYield** | Pointer to **float32** | Earnings-to-price ratio, i.e., the inverse of PE | [optional] 
**EarningYieldGreenblatt** | Pointer to **float32** | The standard definition of earnings yield is the earnings per share divided by the price of a share. It&#39;s the inverse of P/E and shows the amount of money earned compared to the price you pay for a share. | [optional] 
**EarningYieldGreenblattHigh** | Pointer to **float32** | The standard definition of earnings yield is the earnings per share divided by the price of a share. It&#39;s the inverse of P/E and shows the amount of money earned compared to the price you pay for a share. | [optional] 
**EarningYieldGreenblattLow** | Pointer to **float32** | The standard definition of earnings yield is the earnings per share divided by the price of a share. It&#39;s the inverse of P/E and shows the amount of money earned compared to the price you pay for a share. | [optional] 
**EarningYieldGreenblattMed** | Pointer to **float32** | The standard definition of earnings yield is the earnings per share divided by the price of a share. It&#39;s the inverse of P/E and shows the amount of money earned compared to the price you pay for a share. | [optional] 
**EarningYieldHigh** | Pointer to **float32** |  | [optional] 
**EarningYieldLow** | Pointer to **float32** |  | [optional] 
**EarningYieldMed** | Pointer to **float32** |  | [optional] 
**Ev2ebit** | Pointer to **float32** | EV-to-EBIT is calculated as Enterprise Value divided by its EBIT. | [optional] 
**Ev2ebitda** | Pointer to **float32** | EV-to-EBITDA is calculated as enterprise value divided by its EBITDA. | [optional] 
**Ev2ebitdahigh** | Pointer to **float32** | EV-to-EBITDA is calculated as enterprise value divided by its EBITDA. | [optional] 
**Ev2ebitdalow** | Pointer to **float32** | EV-to-EBITDA is calculated as enterprise value divided by its EBITDA. | [optional] 
**Ev2ebitdamed** | Pointer to **float32** | EV-to-EBITDA is calculated as enterprise value divided by its EBITDA. | [optional] 
**Ev2ebithigh** | Pointer to **float32** | EV-to-EBIT is calculated as Enterprise Value divided by its EBIT. | [optional] 
**Ev2ebitlow** | Pointer to **float32** | EV-to-EBIT is calculated as Enterprise Value divided by its EBIT. | [optional] 
**Ev2ebitmed** | Pointer to **float32** | EV-to-EBIT is calculated as Enterprise Value divided by its EBIT. | [optional] 
**Ev2fcf** | Pointer to **float32** |  | [optional] 
**Ev2fcfhigh** | Pointer to **float32** |  | [optional] 
**Ev2fcflow** | Pointer to **float32** |  | [optional] 
**Ev2fcfmed** | Pointer to **float32** |  | [optional] 
**Ev2pretaxincome** | Pointer to **float32** | The ratio of enterprise value to pretax income | [optional] 
**Ev2rev** | Pointer to **float32** | EV-to-Revenue is calculated as enterprise value divided by its revenue. | [optional] 
**Ev2revhigh** | Pointer to **float32** | EV-to-Revenue is calculated as enterprise value divided by its revenue. | [optional] 
**Ev2revlow** | Pointer to **float32** | EV-to-Revenue is calculated as enterprise value divided by its revenue. | [optional] 
**Ev2revmed** | Pointer to **float32** | EV-to-Revenue is calculated as enterprise value divided by its revenue. | [optional] 
**EvToForwardEbit** | Pointer to **float32** |  | [optional] 
**EvToForwardEbitda** | Pointer to **float32** |  | [optional] 
**EvToForwardRevenue** | Pointer to **float32** |  | [optional] 
**ForwardPE** | Pointer to **float32** | Forward PE is calculated by as current stock price over the predicted next annual earnings period. | [optional] 
**ForwardFcfYield** | Pointer to **float32** | Forward FCF Yield % is calculated as estimated free cash flow divided by current market capitalization. | [optional] 
**ForwardPegRatio** | Pointer to **float32** | Forward PEG Ratio is calculated as current PE Ratio without NRI divided by the Future 3-5Y EPS without NRI Growth Rate. | [optional] 
**Grahamnumber** | Pointer to **float32** | Graham Number is a concept based on Ben Graham\\&#39;s conservative valuation of companies. Graham Number is calculated as follows:    Graham Number &#x3D; SquareRoot of (22.5 * {Tangible Book Value per Share} * {Earnings per Share})    &#x3D; SquareRoot of (22.5 * {Net Income} * {Total Equity}) / {Total Shares Outstanding} | [optional] 
**IvDcEarning** | Pointer to **float32** | The intrinsic value of a company based on the discounted earnings model. | [optional] 
**IvDcf** | Pointer to **float32** | The intrinsic value of a company based on the discounted free cash flow model | [optional] 
**IvDcfDividend** | Pointer to **float32** |  | [optional] 
**IvDcfShare** | Pointer to **float32** | The Discounted Free Cash Flow Screener focuses on Free Cash Flow (FCF) and Total Equity. These measures can be used to determine an intrinsic value estimate for a company. | [optional] 
**Lynchvalue** | Pointer to **float32** | Peter Lynch Fair Value applies to growing companies. The ideal range for the growth rate is between 10 - 20% a year. | [optional] 
**MarginDcEarning** | Pointer to **float32** | The difference between current price and intrinsic value based on discounted cash flow model using the company&#39;s TTM earnings. | [optional] 
**MarginDcf** | Pointer to **float32** | The difference between current price and intrinsic value based on discounted cash flow model using the company&#39;s TTM Free Cash Flow. | [optional] 
**MarginDcfDividend** | Pointer to **float32** | The difference between current price and intrinsic value based on discounted dividend model using the company&#39;s TTM dividends. | [optional] 
**Medpbvalue** | Pointer to **float32** | Median price-book value: the book value per share multiplied by 10-year median price-book ratio | [optional] 
**Medpsvalue** | Pointer to **float32** | This valuation method assumes that the stock valuation will revert to its historical mean in terms of Price/Sales Ratio. | [optional] 
**Ncav** | Pointer to **float32** | A net-net is a company with a market capitalization that is less than the company&#39;s current assets minus total liabilities, or equivalently, the company&#39;s working capital minus long-term liabilities. This value is called the net current asset value. | [optional] 
**NcavReal** | Pointer to **float32** | In calculating the Net Current Asset Value (NCAV), Benjamin Graham means a company&#39;s current assets (such as cash, marketable securities, and inventories) minus its total liabilities (including preferred stock, minority interest, and long-term debt). | [optional] 
**NetCash** | Pointer to **float32** | Equals cash and cash equivalents less total liabilities less minority interest | [optional] 
**P2EPV** | Pointer to **float32** | The ratio of a company&#39;s stock price to its earnings power value | [optional] 
**P2OwnerEarnings** | Pointer to **float32** | In 1986 Berkshire Hathaway Shareholder Letter, Warren Buffett defined owner earnings as follows:  \&quot;These represent (a) reported earnings plus (b) depreciation, depletion, amortization, and certain other non-cash charges...less (c) the average annual amount of capitalized expenditures for plant and equipment, etc. that the business requires to fully maintain its long-term competitive position and its unit volume. (If the business requires additional working capital to maintain its competitive position and unit volume, the increment also should be included in (c))...Our owner-earnings equation does not yield the deceptively precise figures provided by GAAP, since (c) must be a guess - and one sometimes very difficult to make. Despite this problem, we consider the owner earnings figure, not the GAAP figure, to be the relevant item for valuation purposes - both for investors in buying stocks and for managers in buying entire businesses...All of this points up the absurdity of the &#39;cash flow&#39; numbers that are often set forth in Wall Street reports. These numbers routinely include (a) plus (b) - but do not subtract (c).\&quot; | [optional] 
**P2OwnerEarningsHigh** | Pointer to **float32** | The highest price-to-owner-earnings ratio over the past 10 years | [optional] 
**P2OwnerEarningsLow** | Pointer to **float32** | The lowest price-to-owner-earnings ratio over the past 10 years | [optional] 
**P2OwnerEarningsMed** | Pointer to **float32** | The median price-to-owner-earnings ratio over the past 10 years | [optional] 
**P2ffo** | Pointer to **float32** | Price to Funds From Operations is an equity valuation metric used to compare a company&#39;s per-share market price to its per-share amount of Funds From Operations (FFO). | [optional] 
**P2grahamnumber** | Pointer to **float32** | The Graham number is the upper bound of the price range that a defensive investor should pay for the stock. | [optional] 
**P2grahamnumberHigh** | Pointer to **float32** | The Graham number is the upper bound of the price range that a defensive investor should pay for the stock. | [optional] 
**P2grahamnumberLow** | Pointer to **float32** | The Graham number is the upper bound of the price range that a defensive investor should pay for the stock. | [optional] 
**P2grahamnumberMed** | Pointer to **float32** | The Graham number is the upper bound of the price range that a defensive investor should pay for the stock. | [optional] 
**P2ivDcEarning** | Pointer to **float32** | Discounted cash flow (DCF) is a valuation method used to estimate the value of an investment based on its future cash flows. | [optional] 
**P2ivDcEarningHigh** | Pointer to **float32** | Discounted cash flow (DCF) is a valuation method used to estimate the value of an investment based on its future cash flows. | [optional] 
**P2ivDcEarningLow** | Pointer to **float32** | Discounted cash flow (DCF) is a valuation method used to estimate the value of an investment based on its future cash flows. | [optional] 
**P2ivDcEarningMed** | Pointer to **float32** | Discounted cash flow (DCF) is a valuation method used to estimate the value of an investment based on its future cash flows. | [optional] 
**P2ivDcf** | Pointer to **float32** | Discounted cash flow (DCF) is a valuation method used to estimate the value of an investment based on its future cash flows. | [optional] 
**P2ivDcfDividend** | Pointer to **float32** |  | [optional] 
**P2ivDcfDividendHigh** | Pointer to **float32** |  | [optional] 
**P2ivDcfDividendLow** | Pointer to **float32** |  | [optional] 
**P2ivDcfDividendMed** | Pointer to **float32** |  | [optional] 
**P2ivDcfHigh** | Pointer to **float32** | The highest price-to-discounted-free-cash-flow ratio over the past 10 years | [optional] 
**P2ivDcfLow** | Pointer to **float32** | The lowest price-to-discounted-free-cash-flow ratio over the past 10 years | [optional] 
**P2ivDcfMed** | Pointer to **float32** | The median price-to-discounted-free-cash-flow ratio over the past 10 years | [optional] 
**P2ivDcfShare** | Pointer to **float32** |  | [optional] 
**P2ivDcfShareHigh** | Pointer to **float32** | The highest price to intrinsic value based on projected free cash flow over the past 10 years | [optional] 
**P2ivDcfShareLow** | Pointer to **float32** | The lowest price to intrinsic value based on projected free cash flow over the past 10 years | [optional] 
**P2ivDcfShareMed** | Pointer to **float32** | The median price to intrinsic value based on projected free cash flow over the past 10 years | [optional] 
**P2lynchvalue** | Pointer to **float32** |  | [optional] 
**P2lynchvalueHigh** | Pointer to **float32** | The highest price to Peter Lynch fair value over the past 10 years | [optional] 
**P2lynchvalueLow** | Pointer to **float32** | The lowest price to Peter Lynch fair value over the past 10 years | [optional] 
**P2lynchvalueMed** | Pointer to **float32** | The median price to Peter Lynch fair value over the past 10 years | [optional] 
**P2medpbvalue** | Pointer to **float32** | The ratio of share price to the median price-book value | [optional] 
**P2medpbvalueHigh** | Pointer to **float32** | The highest price-to-median-PB-Value over the past 10 years | [optional] 
**P2medpbvalueLow** | Pointer to **float32** | The lowest price-to-median-PB-Value over the past 10 years | [optional] 
**P2medpbvalueMed** | Pointer to **float32** | The median price-to-median-PB-Value over the past 10 years | [optional] 
**P2medpsvalue** | Pointer to **float32** | Median P/S Value is calculated as trailing twelve months (TTM) Revenue per Share times 10-Year median P/S ratio. | [optional] 
**P2medpsvalueHigh** | Pointer to **float32** | Median P/S Value is calculated as trailing twelve months (TTM) Revenue per Share times 10-Year median P/S ratio. | [optional] 
**P2medpsvalueLow** | Pointer to **float32** | Median P/S Value is calculated as trailing twelve months (TTM) Revenue per Share times 10-Year median P/S ratio. | [optional] 
**P2medpsvalueMed** | Pointer to **float32** | Median P/S Value is calculated as trailing twelve months (TTM) Revenue per Share times 10-Year median P/S ratio. | [optional] 
**P2ncav** | Pointer to **float32** | In calculating the Net Current Asset Value (NCAV), Benjamin Graham means a company&#39;s current assets (such as cash, marketable securities, and inventories) minus its total liabilities (including preferred stock, minority interest, and long-term debt). | [optional] 
**P2ncavHigh** | Pointer to **float32** | In calculating the Net Current Asset Value (NCAV), Benjamin Graham means a company&#39;s current assets (such as cash, marketable securities, and inventories) minus its total liabilities (including preferred stock, minority interest, and long-term debt). | [optional] 
**P2ncavLow** | Pointer to **float32** | In calculating the Net Current Asset Value (NCAV), Benjamin Graham means a company&#39;s current assets (such as cash, marketable securities, and inventories) minus its total liabilities (including preferred stock, minority interest, and long-term debt). | [optional] 
**P2ncavMed** | Pointer to **float32** | In calculating the Net Current Asset Value (NCAV), Benjamin Graham means a company&#39;s current assets (such as cash, marketable securities, and inventories) minus its total liabilities (including preferred stock, minority interest, and long-term debt). | [optional] 
**P2netCash** | Pointer to **float32** | Net cash per share is calculated as Cash And Cash Equivalents minus Total Liabilities minus Minority Interest and then divided by Shares Outstanding (EOP). | [optional] 
**P2netCashHigh** | Pointer to **float32** | Net cash per share is calculated as Cash And Cash Equivalents minus Total Liabilities minus Minority Interest and then divided by Shares Outstanding (EOP). | [optional] 
**P2netCashLow** | Pointer to **float32** | Net cash per share is calculated as Cash And Cash Equivalents minus Total Liabilities minus Minority Interest and then divided by Shares Outstanding (EOP). | [optional] 
**P2netCashMed** | Pointer to **float32** | Net cash per share is calculated as Cash And Cash Equivalents minus Total Liabilities minus Minority Interest and then divided by Shares Outstanding (EOP). | [optional] 
**P2nnwc** | Pointer to **float32** | In calculating the Net-Net Working Capital (NNWC), Benjamin Graham assumed that a company&#39;s accounts receivable is only worth 75% its value, its inventory is only worth 50% of its value, but its liabilities have to be paid in full. | [optional] 
**P2tangibleBook** | Pointer to **float32** | The Price to Tangible Book Value ratio (PTBV) expresses share price as a proportion of the company&#39;s tangible book value reported on the company&#39;s balance sheet. | [optional] 
**P2tangibleBookHigh** | Pointer to **float32** | The Price to Tangible Book Value ratio (PTBV) expresses share price as a proportion of the company&#39;s tangible book value reported on the company&#39;s balance sheet. | [optional] 
**P2tangibleBookLow** | Pointer to **float32** | The Price to Tangible Book Value ratio (PTBV) expresses share price as a proportion of the company&#39;s tangible book value reported on the company&#39;s balance sheet. | [optional] 
**P2tangibleBookMed** | Pointer to **float32** | The Price to Tangible Book Value ratio (PTBV) expresses share price as a proportion of the company&#39;s tangible book value reported on the company&#39;s balance sheet. | [optional] 
**Pb** | Pointer to **float32** | Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio. | [optional] 
**Pbhigh** | Pointer to **float32** | Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio. | [optional] 
**Pblow** | Pointer to **float32** | Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio. | [optional] 
**Pbmed** | Pointer to **float32** | Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio. | [optional] 
**Pe** | Pointer to **float32** | &lt;p&gt;The PE ratio, or Price-to-Earnings ratio, is the most widely used metric in the valuation of stocks. It is calculated as:  &lt;b&gt;PE Ratio &#x3D; Share Price / {{eps_diluated}}&lt;/b&gt;.   It can also be calculated from the numbers for the whole company:  &lt;b&gt;PE Ratio &#x3D; {{mktcap}} / {{net_income}}&lt;/b&gt;.&lt;/p&gt;  &lt;p&gt;There are at least three kinds of PE ratios used among different investors. They are Trailing Twelve Month PE Ratio({{pettm}}), {{forwardPE}}, and {{penri}}. A new PE ratio based on inflation-adjusted normalized PE ratio is called {{ShillerPE}}, after Yale professor Robert Shiller.&lt;/p&gt;  &lt;p&gt;In the calculation of {{pettm}}, the earnings per share used are the earnings per share over the past 12 months({{ttm_eps}}). For {{forwardPE}}, the earnings are the expected earnings for the next twelve months({{forward_eps}}). In the case of {{penri}}, the reported earnings less the non-recurring items are used({{eps_nri}}).For the {{ShillerPE}}, the earnings of the past 10 years are inflation-adjusted and averaged. Since {{ShillerPE}} looks at the average over the last 10 years, it is also called PE10.&lt;/p&gt; | [optional] 
**PebitMed** | Pointer to **float32** | The median price-to-EBIT ratio over the past 10 years | [optional] 
**PebitdaMed** | Pointer to **float32** | The median price-to-EBITDA ratio over the past 10 years | [optional] 
**Peg** | Pointer to **float32** | PEG is defined as the PE Ratio without NRI divided by the growth ratio. The growth rate we use is the 5-year average EBITDA growth rate. | [optional] 
**Peghigh** | Pointer to **float32** | PEG is defined as the PE Ratio without NRI divided by the growth ratio. The growth rate we use is the 5-year average EBITDA growth rate. | [optional] 
**Peglow** | Pointer to **float32** | PEG is defined as the PE Ratio without NRI divided by the growth ratio. The growth rate we use is the 5-year average EBITDA growth rate. | [optional] 
**Pegmed** | Pointer to **float32** | PEG is defined as the PE Ratio without NRI divided by the growth ratio. The growth rate we use is the 5-year average EBITDA growth rate. | [optional] 
**Penri** | Pointer to **float32** |  | [optional] 
**Penrihigh** | Pointer to **float32** |  | [optional] 
**Penrilow** | Pointer to **float32** |  | [optional] 
**Penrimed** | Pointer to **float32** |  | [optional] 
**Pettmhigh** | Pointer to **float32** | The highest price-earnings ratio over the past 10 years | [optional] 
**Pettmlow** | Pointer to **float32** | The lowest price-earnings ratio over the past 10 years | [optional] 
**Pettmmed** | Pointer to **float32** | The median price-earnings ratio over the past 10 years | [optional] 
**Pfcf** | Pointer to **float32** | Price to free cash flow is an equity valuation metric used to compare a company&#39;s per-share market price to its per-share amount of free cash flow (FCF). | [optional] 
**Pfcfhigh** | Pointer to **float32** | Price to free cash flow is an equity valuation metric used to compare a company&#39;s per-share market price to its per-share amount of free cash flow (FCF). | [optional] 
**Pfcflow** | Pointer to **float32** | Price to free cash flow is an equity valuation metric used to compare a company&#39;s per-share market price to its per-share amount of free cash flow (FCF). | [optional] 
**Pfcfmed** | Pointer to **float32** | Price to free cash flow is an equity valuation metric used to compare a company&#39;s per-share market price to its per-share amount of free cash flow (FCF). | [optional] 
**Pocf** | Pointer to **float32** | The price/cash flow ratio (also called price-to-cash flow ratio or P/CF), is a ratio used to compare a company&#39;s market value to its cash flow. | [optional] 
**Pocfhigh** | Pointer to **float32** | The price/cash flow ratio (also called price-to-cash flow ratio or P/CF), is a ratio used to compare a company&#39;s market value to its cash flow. | [optional] 
**Pocflow** | Pointer to **float32** | The price/cash flow ratio (also called price-to-cash flow ratio or P/CF), is a ratio used to compare a company&#39;s market value to its cash flow. | [optional] 
**Pocfmed** | Pointer to **float32** | The price/cash flow ratio (also called price-to-cash flow ratio or P/CF), is a ratio used to compare a company&#39;s market value to its cash flow. | [optional] 
**Ps** | Pointer to **float32** | Price–sales ratio, P/S ratio, or PSR, is a valuation metric for stocks. | [optional] 
**Pshigh** | Pointer to **float32** | Price–sales ratio, P/S ratio, or PSR, is a valuation metric for stocks. | [optional] 
**Pslow** | Pointer to **float32** | Price–sales ratio, P/S ratio, or PSR, is a valuation metric for stocks. | [optional] 
**Psmed** | Pointer to **float32** | Price–sales ratio, P/S ratio, or PSR, is a valuation metric for stocks. | [optional] 
**TangibleBook** | Pointer to **float32** | The per share value of a company based on common shareholder&#39;s equity less intangible assets | [optional] 

## Methods

### NewStockProfileValuationRatio

`func NewStockProfileValuationRatio() *StockProfileValuationRatio`

NewStockProfileValuationRatio instantiates a new StockProfileValuationRatio object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStockProfileValuationRatioWithDefaults

`func NewStockProfileValuationRatioWithDefaults() *StockProfileValuationRatio`

NewStockProfileValuationRatioWithDefaults instantiates a new StockProfileValuationRatio object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEPV

`func (o *StockProfileValuationRatio) GetEPV() float32`

GetEPV returns the EPV field if non-nil, zero value otherwise.

### GetEPVOk

`func (o *StockProfileValuationRatio) GetEPVOk() (*float32, bool)`

GetEPVOk returns a tuple with the EPV field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEPV

`func (o *StockProfileValuationRatio) SetEPV(v float32)`

SetEPV sets EPV field to given value.

### HasEPV

`func (o *StockProfileValuationRatio) HasEPV() bool`

HasEPV returns a boolean if a field has been set.

### GetFCFyield

`func (o *StockProfileValuationRatio) GetFCFyield() float32`

GetFCFyield returns the FCFyield field if non-nil, zero value otherwise.

### GetFCFyieldOk

`func (o *StockProfileValuationRatio) GetFCFyieldOk() (*float32, bool)`

GetFCFyieldOk returns a tuple with the FCFyield field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFCFyield

`func (o *StockProfileValuationRatio) SetFCFyield(v float32)`

SetFCFyield sets FCFyield field to given value.

### HasFCFyield

`func (o *StockProfileValuationRatio) HasFCFyield() bool`

HasFCFyield returns a boolean if a field has been set.

### GetFCFyieldHigh

`func (o *StockProfileValuationRatio) GetFCFyieldHigh() float32`

GetFCFyieldHigh returns the FCFyieldHigh field if non-nil, zero value otherwise.

### GetFCFyieldHighOk

`func (o *StockProfileValuationRatio) GetFCFyieldHighOk() (*float32, bool)`

GetFCFyieldHighOk returns a tuple with the FCFyieldHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFCFyieldHigh

`func (o *StockProfileValuationRatio) SetFCFyieldHigh(v float32)`

SetFCFyieldHigh sets FCFyieldHigh field to given value.

### HasFCFyieldHigh

`func (o *StockProfileValuationRatio) HasFCFyieldHigh() bool`

HasFCFyieldHigh returns a boolean if a field has been set.

### GetFCFyieldLow

`func (o *StockProfileValuationRatio) GetFCFyieldLow() float32`

GetFCFyieldLow returns the FCFyieldLow field if non-nil, zero value otherwise.

### GetFCFyieldLowOk

`func (o *StockProfileValuationRatio) GetFCFyieldLowOk() (*float32, bool)`

GetFCFyieldLowOk returns a tuple with the FCFyieldLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFCFyieldLow

`func (o *StockProfileValuationRatio) SetFCFyieldLow(v float32)`

SetFCFyieldLow sets FCFyieldLow field to given value.

### HasFCFyieldLow

`func (o *StockProfileValuationRatio) HasFCFyieldLow() bool`

HasFCFyieldLow returns a boolean if a field has been set.

### GetFCFyieldMed

`func (o *StockProfileValuationRatio) GetFCFyieldMed() float32`

GetFCFyieldMed returns the FCFyieldMed field if non-nil, zero value otherwise.

### GetFCFyieldMedOk

`func (o *StockProfileValuationRatio) GetFCFyieldMedOk() (*float32, bool)`

GetFCFyieldMedOk returns a tuple with the FCFyieldMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFCFyieldMed

`func (o *StockProfileValuationRatio) SetFCFyieldMed(v float32)`

SetFCFyieldMed sets FCFyieldMed field to given value.

### HasFCFyieldMed

`func (o *StockProfileValuationRatio) HasFCFyieldMed() bool`

HasFCFyieldMed returns a boolean if a field has been set.

### GetFCFyieldMed5y

`func (o *StockProfileValuationRatio) GetFCFyieldMed5y() float32`

GetFCFyieldMed5y returns the FCFyieldMed5y field if non-nil, zero value otherwise.

### GetFCFyieldMed5yOk

`func (o *StockProfileValuationRatio) GetFCFyieldMed5yOk() (*float32, bool)`

GetFCFyieldMed5yOk returns a tuple with the FCFyieldMed5y field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFCFyieldMed5y

`func (o *StockProfileValuationRatio) SetFCFyieldMed5y(v float32)`

SetFCFyieldMed5y sets FCFyieldMed5y field to given value.

### HasFCFyieldMed5y

`func (o *StockProfileValuationRatio) HasFCFyieldMed5y() bool`

HasFCFyieldMed5y returns a boolean if a field has been set.

### GetOwnerEarnings

`func (o *StockProfileValuationRatio) GetOwnerEarnings() float32`

GetOwnerEarnings returns the OwnerEarnings field if non-nil, zero value otherwise.

### GetOwnerEarningsOk

`func (o *StockProfileValuationRatio) GetOwnerEarningsOk() (*float32, bool)`

GetOwnerEarningsOk returns a tuple with the OwnerEarnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOwnerEarnings

`func (o *StockProfileValuationRatio) SetOwnerEarnings(v float32)`

SetOwnerEarnings sets OwnerEarnings field to given value.

### HasOwnerEarnings

`func (o *StockProfileValuationRatio) HasOwnerEarnings() bool`

HasOwnerEarnings returns a boolean if a field has been set.

### GetRateOfReturn

`func (o *StockProfileValuationRatio) GetRateOfReturn() float32`

GetRateOfReturn returns the RateOfReturn field if non-nil, zero value otherwise.

### GetRateOfReturnOk

`func (o *StockProfileValuationRatio) GetRateOfReturnOk() (*float32, bool)`

GetRateOfReturnOk returns a tuple with the RateOfReturn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRateOfReturn

`func (o *StockProfileValuationRatio) SetRateOfReturn(v float32)`

SetRateOfReturn sets RateOfReturn field to given value.

### HasRateOfReturn

`func (o *StockProfileValuationRatio) HasRateOfReturn() bool`

HasRateOfReturn returns a boolean if a field has been set.

### GetRateOfReturnHigh

`func (o *StockProfileValuationRatio) GetRateOfReturnHigh() float32`

GetRateOfReturnHigh returns the RateOfReturnHigh field if non-nil, zero value otherwise.

### GetRateOfReturnHighOk

`func (o *StockProfileValuationRatio) GetRateOfReturnHighOk() (*float32, bool)`

GetRateOfReturnHighOk returns a tuple with the RateOfReturnHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRateOfReturnHigh

`func (o *StockProfileValuationRatio) SetRateOfReturnHigh(v float32)`

SetRateOfReturnHigh sets RateOfReturnHigh field to given value.

### HasRateOfReturnHigh

`func (o *StockProfileValuationRatio) HasRateOfReturnHigh() bool`

HasRateOfReturnHigh returns a boolean if a field has been set.

### GetRateOfReturnLow

`func (o *StockProfileValuationRatio) GetRateOfReturnLow() float32`

GetRateOfReturnLow returns the RateOfReturnLow field if non-nil, zero value otherwise.

### GetRateOfReturnLowOk

`func (o *StockProfileValuationRatio) GetRateOfReturnLowOk() (*float32, bool)`

GetRateOfReturnLowOk returns a tuple with the RateOfReturnLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRateOfReturnLow

`func (o *StockProfileValuationRatio) SetRateOfReturnLow(v float32)`

SetRateOfReturnLow sets RateOfReturnLow field to given value.

### HasRateOfReturnLow

`func (o *StockProfileValuationRatio) HasRateOfReturnLow() bool`

HasRateOfReturnLow returns a boolean if a field has been set.

### GetRateOfReturnMed

`func (o *StockProfileValuationRatio) GetRateOfReturnMed() float32`

GetRateOfReturnMed returns the RateOfReturnMed field if non-nil, zero value otherwise.

### GetRateOfReturnMedOk

`func (o *StockProfileValuationRatio) GetRateOfReturnMedOk() (*float32, bool)`

GetRateOfReturnMedOk returns a tuple with the RateOfReturnMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRateOfReturnMed

`func (o *StockProfileValuationRatio) SetRateOfReturnMed(v float32)`

SetRateOfReturnMed sets RateOfReturnMed field to given value.

### HasRateOfReturnMed

`func (o *StockProfileValuationRatio) HasRateOfReturnMed() bool`

HasRateOfReturnMed returns a boolean if a field has been set.

### GetShillerPE

`func (o *StockProfileValuationRatio) GetShillerPE() float32`

GetShillerPE returns the ShillerPE field if non-nil, zero value otherwise.

### GetShillerPEOk

`func (o *StockProfileValuationRatio) GetShillerPEOk() (*float32, bool)`

GetShillerPEOk returns a tuple with the ShillerPE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShillerPE

`func (o *StockProfileValuationRatio) SetShillerPE(v float32)`

SetShillerPE sets ShillerPE field to given value.

### HasShillerPE

`func (o *StockProfileValuationRatio) HasShillerPE() bool`

HasShillerPE returns a boolean if a field has been set.

### GetShillerPEHigh

`func (o *StockProfileValuationRatio) GetShillerPEHigh() float32`

GetShillerPEHigh returns the ShillerPEHigh field if non-nil, zero value otherwise.

### GetShillerPEHighOk

`func (o *StockProfileValuationRatio) GetShillerPEHighOk() (*float32, bool)`

GetShillerPEHighOk returns a tuple with the ShillerPEHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShillerPEHigh

`func (o *StockProfileValuationRatio) SetShillerPEHigh(v float32)`

SetShillerPEHigh sets ShillerPEHigh field to given value.

### HasShillerPEHigh

`func (o *StockProfileValuationRatio) HasShillerPEHigh() bool`

HasShillerPEHigh returns a boolean if a field has been set.

### GetShillerPELow

`func (o *StockProfileValuationRatio) GetShillerPELow() float32`

GetShillerPELow returns the ShillerPELow field if non-nil, zero value otherwise.

### GetShillerPELowOk

`func (o *StockProfileValuationRatio) GetShillerPELowOk() (*float32, bool)`

GetShillerPELowOk returns a tuple with the ShillerPELow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShillerPELow

`func (o *StockProfileValuationRatio) SetShillerPELow(v float32)`

SetShillerPELow sets ShillerPELow field to given value.

### HasShillerPELow

`func (o *StockProfileValuationRatio) HasShillerPELow() bool`

HasShillerPELow returns a boolean if a field has been set.

### GetShillerPEMed

`func (o *StockProfileValuationRatio) GetShillerPEMed() float32`

GetShillerPEMed returns the ShillerPEMed field if non-nil, zero value otherwise.

### GetShillerPEMedOk

`func (o *StockProfileValuationRatio) GetShillerPEMedOk() (*float32, bool)`

GetShillerPEMedOk returns a tuple with the ShillerPEMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShillerPEMed

`func (o *StockProfileValuationRatio) SetShillerPEMed(v float32)`

SetShillerPEMed sets ShillerPEMed field to given value.

### HasShillerPEMed

`func (o *StockProfileValuationRatio) HasShillerPEMed() bool`

HasShillerPEMed returns a boolean if a field has been set.

### GetCyclicallyAdjustedBook

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedBook() float32`

GetCyclicallyAdjustedBook returns the CyclicallyAdjustedBook field if non-nil, zero value otherwise.

### GetCyclicallyAdjustedBookOk

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedBookOk() (*float32, bool)`

GetCyclicallyAdjustedBookOk returns a tuple with the CyclicallyAdjustedBook field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCyclicallyAdjustedBook

`func (o *StockProfileValuationRatio) SetCyclicallyAdjustedBook(v float32)`

SetCyclicallyAdjustedBook sets CyclicallyAdjustedBook field to given value.

### HasCyclicallyAdjustedBook

`func (o *StockProfileValuationRatio) HasCyclicallyAdjustedBook() bool`

HasCyclicallyAdjustedBook returns a boolean if a field has been set.

### GetCyclicallyAdjustedFcf

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedFcf() float32`

GetCyclicallyAdjustedFcf returns the CyclicallyAdjustedFcf field if non-nil, zero value otherwise.

### GetCyclicallyAdjustedFcfOk

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedFcfOk() (*float32, bool)`

GetCyclicallyAdjustedFcfOk returns a tuple with the CyclicallyAdjustedFcf field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCyclicallyAdjustedFcf

`func (o *StockProfileValuationRatio) SetCyclicallyAdjustedFcf(v float32)`

SetCyclicallyAdjustedFcf sets CyclicallyAdjustedFcf field to given value.

### HasCyclicallyAdjustedFcf

`func (o *StockProfileValuationRatio) HasCyclicallyAdjustedFcf() bool`

HasCyclicallyAdjustedFcf returns a boolean if a field has been set.

### GetCyclicallyAdjustedPb

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPb() float32`

GetCyclicallyAdjustedPb returns the CyclicallyAdjustedPb field if non-nil, zero value otherwise.

### GetCyclicallyAdjustedPbOk

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPbOk() (*float32, bool)`

GetCyclicallyAdjustedPbOk returns a tuple with the CyclicallyAdjustedPb field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCyclicallyAdjustedPb

`func (o *StockProfileValuationRatio) SetCyclicallyAdjustedPb(v float32)`

SetCyclicallyAdjustedPb sets CyclicallyAdjustedPb field to given value.

### HasCyclicallyAdjustedPb

`func (o *StockProfileValuationRatio) HasCyclicallyAdjustedPb() bool`

HasCyclicallyAdjustedPb returns a boolean if a field has been set.

### GetCyclicallyAdjustedPbHigh

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPbHigh() float32`

GetCyclicallyAdjustedPbHigh returns the CyclicallyAdjustedPbHigh field if non-nil, zero value otherwise.

### GetCyclicallyAdjustedPbHighOk

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPbHighOk() (*float32, bool)`

GetCyclicallyAdjustedPbHighOk returns a tuple with the CyclicallyAdjustedPbHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCyclicallyAdjustedPbHigh

`func (o *StockProfileValuationRatio) SetCyclicallyAdjustedPbHigh(v float32)`

SetCyclicallyAdjustedPbHigh sets CyclicallyAdjustedPbHigh field to given value.

### HasCyclicallyAdjustedPbHigh

`func (o *StockProfileValuationRatio) HasCyclicallyAdjustedPbHigh() bool`

HasCyclicallyAdjustedPbHigh returns a boolean if a field has been set.

### GetCyclicallyAdjustedPbLow

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPbLow() float32`

GetCyclicallyAdjustedPbLow returns the CyclicallyAdjustedPbLow field if non-nil, zero value otherwise.

### GetCyclicallyAdjustedPbLowOk

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPbLowOk() (*float32, bool)`

GetCyclicallyAdjustedPbLowOk returns a tuple with the CyclicallyAdjustedPbLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCyclicallyAdjustedPbLow

`func (o *StockProfileValuationRatio) SetCyclicallyAdjustedPbLow(v float32)`

SetCyclicallyAdjustedPbLow sets CyclicallyAdjustedPbLow field to given value.

### HasCyclicallyAdjustedPbLow

`func (o *StockProfileValuationRatio) HasCyclicallyAdjustedPbLow() bool`

HasCyclicallyAdjustedPbLow returns a boolean if a field has been set.

### GetCyclicallyAdjustedPbMed

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPbMed() float32`

GetCyclicallyAdjustedPbMed returns the CyclicallyAdjustedPbMed field if non-nil, zero value otherwise.

### GetCyclicallyAdjustedPbMedOk

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPbMedOk() (*float32, bool)`

GetCyclicallyAdjustedPbMedOk returns a tuple with the CyclicallyAdjustedPbMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCyclicallyAdjustedPbMed

`func (o *StockProfileValuationRatio) SetCyclicallyAdjustedPbMed(v float32)`

SetCyclicallyAdjustedPbMed sets CyclicallyAdjustedPbMed field to given value.

### HasCyclicallyAdjustedPbMed

`func (o *StockProfileValuationRatio) HasCyclicallyAdjustedPbMed() bool`

HasCyclicallyAdjustedPbMed returns a boolean if a field has been set.

### GetCyclicallyAdjustedPfcf

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPfcf() float32`

GetCyclicallyAdjustedPfcf returns the CyclicallyAdjustedPfcf field if non-nil, zero value otherwise.

### GetCyclicallyAdjustedPfcfOk

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPfcfOk() (*float32, bool)`

GetCyclicallyAdjustedPfcfOk returns a tuple with the CyclicallyAdjustedPfcf field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCyclicallyAdjustedPfcf

`func (o *StockProfileValuationRatio) SetCyclicallyAdjustedPfcf(v float32)`

SetCyclicallyAdjustedPfcf sets CyclicallyAdjustedPfcf field to given value.

### HasCyclicallyAdjustedPfcf

`func (o *StockProfileValuationRatio) HasCyclicallyAdjustedPfcf() bool`

HasCyclicallyAdjustedPfcf returns a boolean if a field has been set.

### GetCyclicallyAdjustedPfcfHigh

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPfcfHigh() float32`

GetCyclicallyAdjustedPfcfHigh returns the CyclicallyAdjustedPfcfHigh field if non-nil, zero value otherwise.

### GetCyclicallyAdjustedPfcfHighOk

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPfcfHighOk() (*float32, bool)`

GetCyclicallyAdjustedPfcfHighOk returns a tuple with the CyclicallyAdjustedPfcfHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCyclicallyAdjustedPfcfHigh

`func (o *StockProfileValuationRatio) SetCyclicallyAdjustedPfcfHigh(v float32)`

SetCyclicallyAdjustedPfcfHigh sets CyclicallyAdjustedPfcfHigh field to given value.

### HasCyclicallyAdjustedPfcfHigh

`func (o *StockProfileValuationRatio) HasCyclicallyAdjustedPfcfHigh() bool`

HasCyclicallyAdjustedPfcfHigh returns a boolean if a field has been set.

### GetCyclicallyAdjustedPfcfLow

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPfcfLow() float32`

GetCyclicallyAdjustedPfcfLow returns the CyclicallyAdjustedPfcfLow field if non-nil, zero value otherwise.

### GetCyclicallyAdjustedPfcfLowOk

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPfcfLowOk() (*float32, bool)`

GetCyclicallyAdjustedPfcfLowOk returns a tuple with the CyclicallyAdjustedPfcfLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCyclicallyAdjustedPfcfLow

`func (o *StockProfileValuationRatio) SetCyclicallyAdjustedPfcfLow(v float32)`

SetCyclicallyAdjustedPfcfLow sets CyclicallyAdjustedPfcfLow field to given value.

### HasCyclicallyAdjustedPfcfLow

`func (o *StockProfileValuationRatio) HasCyclicallyAdjustedPfcfLow() bool`

HasCyclicallyAdjustedPfcfLow returns a boolean if a field has been set.

### GetCyclicallyAdjustedPfcfMed

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPfcfMed() float32`

GetCyclicallyAdjustedPfcfMed returns the CyclicallyAdjustedPfcfMed field if non-nil, zero value otherwise.

### GetCyclicallyAdjustedPfcfMedOk

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPfcfMedOk() (*float32, bool)`

GetCyclicallyAdjustedPfcfMedOk returns a tuple with the CyclicallyAdjustedPfcfMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCyclicallyAdjustedPfcfMed

`func (o *StockProfileValuationRatio) SetCyclicallyAdjustedPfcfMed(v float32)`

SetCyclicallyAdjustedPfcfMed sets CyclicallyAdjustedPfcfMed field to given value.

### HasCyclicallyAdjustedPfcfMed

`func (o *StockProfileValuationRatio) HasCyclicallyAdjustedPfcfMed() bool`

HasCyclicallyAdjustedPfcfMed returns a boolean if a field has been set.

### GetCyclicallyAdjustedPs

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPs() float32`

GetCyclicallyAdjustedPs returns the CyclicallyAdjustedPs field if non-nil, zero value otherwise.

### GetCyclicallyAdjustedPsOk

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPsOk() (*float32, bool)`

GetCyclicallyAdjustedPsOk returns a tuple with the CyclicallyAdjustedPs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCyclicallyAdjustedPs

`func (o *StockProfileValuationRatio) SetCyclicallyAdjustedPs(v float32)`

SetCyclicallyAdjustedPs sets CyclicallyAdjustedPs field to given value.

### HasCyclicallyAdjustedPs

`func (o *StockProfileValuationRatio) HasCyclicallyAdjustedPs() bool`

HasCyclicallyAdjustedPs returns a boolean if a field has been set.

### GetCyclicallyAdjustedPsHigh

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPsHigh() float32`

GetCyclicallyAdjustedPsHigh returns the CyclicallyAdjustedPsHigh field if non-nil, zero value otherwise.

### GetCyclicallyAdjustedPsHighOk

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPsHighOk() (*float32, bool)`

GetCyclicallyAdjustedPsHighOk returns a tuple with the CyclicallyAdjustedPsHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCyclicallyAdjustedPsHigh

`func (o *StockProfileValuationRatio) SetCyclicallyAdjustedPsHigh(v float32)`

SetCyclicallyAdjustedPsHigh sets CyclicallyAdjustedPsHigh field to given value.

### HasCyclicallyAdjustedPsHigh

`func (o *StockProfileValuationRatio) HasCyclicallyAdjustedPsHigh() bool`

HasCyclicallyAdjustedPsHigh returns a boolean if a field has been set.

### GetCyclicallyAdjustedPsLow

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPsLow() float32`

GetCyclicallyAdjustedPsLow returns the CyclicallyAdjustedPsLow field if non-nil, zero value otherwise.

### GetCyclicallyAdjustedPsLowOk

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPsLowOk() (*float32, bool)`

GetCyclicallyAdjustedPsLowOk returns a tuple with the CyclicallyAdjustedPsLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCyclicallyAdjustedPsLow

`func (o *StockProfileValuationRatio) SetCyclicallyAdjustedPsLow(v float32)`

SetCyclicallyAdjustedPsLow sets CyclicallyAdjustedPsLow field to given value.

### HasCyclicallyAdjustedPsLow

`func (o *StockProfileValuationRatio) HasCyclicallyAdjustedPsLow() bool`

HasCyclicallyAdjustedPsLow returns a boolean if a field has been set.

### GetCyclicallyAdjustedPsMed

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPsMed() float32`

GetCyclicallyAdjustedPsMed returns the CyclicallyAdjustedPsMed field if non-nil, zero value otherwise.

### GetCyclicallyAdjustedPsMedOk

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedPsMedOk() (*float32, bool)`

GetCyclicallyAdjustedPsMedOk returns a tuple with the CyclicallyAdjustedPsMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCyclicallyAdjustedPsMed

`func (o *StockProfileValuationRatio) SetCyclicallyAdjustedPsMed(v float32)`

SetCyclicallyAdjustedPsMed sets CyclicallyAdjustedPsMed field to given value.

### HasCyclicallyAdjustedPsMed

`func (o *StockProfileValuationRatio) HasCyclicallyAdjustedPsMed() bool`

HasCyclicallyAdjustedPsMed returns a boolean if a field has been set.

### GetCyclicallyAdjustedRvn

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedRvn() float32`

GetCyclicallyAdjustedRvn returns the CyclicallyAdjustedRvn field if non-nil, zero value otherwise.

### GetCyclicallyAdjustedRvnOk

`func (o *StockProfileValuationRatio) GetCyclicallyAdjustedRvnOk() (*float32, bool)`

GetCyclicallyAdjustedRvnOk returns a tuple with the CyclicallyAdjustedRvn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCyclicallyAdjustedRvn

`func (o *StockProfileValuationRatio) SetCyclicallyAdjustedRvn(v float32)`

SetCyclicallyAdjustedRvn sets CyclicallyAdjustedRvn field to given value.

### HasCyclicallyAdjustedRvn

`func (o *StockProfileValuationRatio) HasCyclicallyAdjustedRvn() bool`

HasCyclicallyAdjustedRvn returns a boolean if a field has been set.

### GetE10

`func (o *StockProfileValuationRatio) GetE10() float32`

GetE10 returns the E10 field if non-nil, zero value otherwise.

### GetE10Ok

`func (o *StockProfileValuationRatio) GetE10Ok() (*float32, bool)`

GetE10Ok returns a tuple with the E10 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetE10

`func (o *StockProfileValuationRatio) SetE10(v float32)`

SetE10 sets E10 field to given value.

### HasE10

`func (o *StockProfileValuationRatio) HasE10() bool`

HasE10 returns a boolean if a field has been set.

### GetEarningYield

`func (o *StockProfileValuationRatio) GetEarningYield() float32`

GetEarningYield returns the EarningYield field if non-nil, zero value otherwise.

### GetEarningYieldOk

`func (o *StockProfileValuationRatio) GetEarningYieldOk() (*float32, bool)`

GetEarningYieldOk returns a tuple with the EarningYield field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEarningYield

`func (o *StockProfileValuationRatio) SetEarningYield(v float32)`

SetEarningYield sets EarningYield field to given value.

### HasEarningYield

`func (o *StockProfileValuationRatio) HasEarningYield() bool`

HasEarningYield returns a boolean if a field has been set.

### GetEarningYieldGreenblatt

`func (o *StockProfileValuationRatio) GetEarningYieldGreenblatt() float32`

GetEarningYieldGreenblatt returns the EarningYieldGreenblatt field if non-nil, zero value otherwise.

### GetEarningYieldGreenblattOk

`func (o *StockProfileValuationRatio) GetEarningYieldGreenblattOk() (*float32, bool)`

GetEarningYieldGreenblattOk returns a tuple with the EarningYieldGreenblatt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEarningYieldGreenblatt

`func (o *StockProfileValuationRatio) SetEarningYieldGreenblatt(v float32)`

SetEarningYieldGreenblatt sets EarningYieldGreenblatt field to given value.

### HasEarningYieldGreenblatt

`func (o *StockProfileValuationRatio) HasEarningYieldGreenblatt() bool`

HasEarningYieldGreenblatt returns a boolean if a field has been set.

### GetEarningYieldGreenblattHigh

`func (o *StockProfileValuationRatio) GetEarningYieldGreenblattHigh() float32`

GetEarningYieldGreenblattHigh returns the EarningYieldGreenblattHigh field if non-nil, zero value otherwise.

### GetEarningYieldGreenblattHighOk

`func (o *StockProfileValuationRatio) GetEarningYieldGreenblattHighOk() (*float32, bool)`

GetEarningYieldGreenblattHighOk returns a tuple with the EarningYieldGreenblattHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEarningYieldGreenblattHigh

`func (o *StockProfileValuationRatio) SetEarningYieldGreenblattHigh(v float32)`

SetEarningYieldGreenblattHigh sets EarningYieldGreenblattHigh field to given value.

### HasEarningYieldGreenblattHigh

`func (o *StockProfileValuationRatio) HasEarningYieldGreenblattHigh() bool`

HasEarningYieldGreenblattHigh returns a boolean if a field has been set.

### GetEarningYieldGreenblattLow

`func (o *StockProfileValuationRatio) GetEarningYieldGreenblattLow() float32`

GetEarningYieldGreenblattLow returns the EarningYieldGreenblattLow field if non-nil, zero value otherwise.

### GetEarningYieldGreenblattLowOk

`func (o *StockProfileValuationRatio) GetEarningYieldGreenblattLowOk() (*float32, bool)`

GetEarningYieldGreenblattLowOk returns a tuple with the EarningYieldGreenblattLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEarningYieldGreenblattLow

`func (o *StockProfileValuationRatio) SetEarningYieldGreenblattLow(v float32)`

SetEarningYieldGreenblattLow sets EarningYieldGreenblattLow field to given value.

### HasEarningYieldGreenblattLow

`func (o *StockProfileValuationRatio) HasEarningYieldGreenblattLow() bool`

HasEarningYieldGreenblattLow returns a boolean if a field has been set.

### GetEarningYieldGreenblattMed

`func (o *StockProfileValuationRatio) GetEarningYieldGreenblattMed() float32`

GetEarningYieldGreenblattMed returns the EarningYieldGreenblattMed field if non-nil, zero value otherwise.

### GetEarningYieldGreenblattMedOk

`func (o *StockProfileValuationRatio) GetEarningYieldGreenblattMedOk() (*float32, bool)`

GetEarningYieldGreenblattMedOk returns a tuple with the EarningYieldGreenblattMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEarningYieldGreenblattMed

`func (o *StockProfileValuationRatio) SetEarningYieldGreenblattMed(v float32)`

SetEarningYieldGreenblattMed sets EarningYieldGreenblattMed field to given value.

### HasEarningYieldGreenblattMed

`func (o *StockProfileValuationRatio) HasEarningYieldGreenblattMed() bool`

HasEarningYieldGreenblattMed returns a boolean if a field has been set.

### GetEarningYieldHigh

`func (o *StockProfileValuationRatio) GetEarningYieldHigh() float32`

GetEarningYieldHigh returns the EarningYieldHigh field if non-nil, zero value otherwise.

### GetEarningYieldHighOk

`func (o *StockProfileValuationRatio) GetEarningYieldHighOk() (*float32, bool)`

GetEarningYieldHighOk returns a tuple with the EarningYieldHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEarningYieldHigh

`func (o *StockProfileValuationRatio) SetEarningYieldHigh(v float32)`

SetEarningYieldHigh sets EarningYieldHigh field to given value.

### HasEarningYieldHigh

`func (o *StockProfileValuationRatio) HasEarningYieldHigh() bool`

HasEarningYieldHigh returns a boolean if a field has been set.

### GetEarningYieldLow

`func (o *StockProfileValuationRatio) GetEarningYieldLow() float32`

GetEarningYieldLow returns the EarningYieldLow field if non-nil, zero value otherwise.

### GetEarningYieldLowOk

`func (o *StockProfileValuationRatio) GetEarningYieldLowOk() (*float32, bool)`

GetEarningYieldLowOk returns a tuple with the EarningYieldLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEarningYieldLow

`func (o *StockProfileValuationRatio) SetEarningYieldLow(v float32)`

SetEarningYieldLow sets EarningYieldLow field to given value.

### HasEarningYieldLow

`func (o *StockProfileValuationRatio) HasEarningYieldLow() bool`

HasEarningYieldLow returns a boolean if a field has been set.

### GetEarningYieldMed

`func (o *StockProfileValuationRatio) GetEarningYieldMed() float32`

GetEarningYieldMed returns the EarningYieldMed field if non-nil, zero value otherwise.

### GetEarningYieldMedOk

`func (o *StockProfileValuationRatio) GetEarningYieldMedOk() (*float32, bool)`

GetEarningYieldMedOk returns a tuple with the EarningYieldMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEarningYieldMed

`func (o *StockProfileValuationRatio) SetEarningYieldMed(v float32)`

SetEarningYieldMed sets EarningYieldMed field to given value.

### HasEarningYieldMed

`func (o *StockProfileValuationRatio) HasEarningYieldMed() bool`

HasEarningYieldMed returns a boolean if a field has been set.

### GetEv2ebit

`func (o *StockProfileValuationRatio) GetEv2ebit() float32`

GetEv2ebit returns the Ev2ebit field if non-nil, zero value otherwise.

### GetEv2ebitOk

`func (o *StockProfileValuationRatio) GetEv2ebitOk() (*float32, bool)`

GetEv2ebitOk returns a tuple with the Ev2ebit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEv2ebit

`func (o *StockProfileValuationRatio) SetEv2ebit(v float32)`

SetEv2ebit sets Ev2ebit field to given value.

### HasEv2ebit

`func (o *StockProfileValuationRatio) HasEv2ebit() bool`

HasEv2ebit returns a boolean if a field has been set.

### GetEv2ebitda

`func (o *StockProfileValuationRatio) GetEv2ebitda() float32`

GetEv2ebitda returns the Ev2ebitda field if non-nil, zero value otherwise.

### GetEv2ebitdaOk

`func (o *StockProfileValuationRatio) GetEv2ebitdaOk() (*float32, bool)`

GetEv2ebitdaOk returns a tuple with the Ev2ebitda field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEv2ebitda

`func (o *StockProfileValuationRatio) SetEv2ebitda(v float32)`

SetEv2ebitda sets Ev2ebitda field to given value.

### HasEv2ebitda

`func (o *StockProfileValuationRatio) HasEv2ebitda() bool`

HasEv2ebitda returns a boolean if a field has been set.

### GetEv2ebitdahigh

`func (o *StockProfileValuationRatio) GetEv2ebitdahigh() float32`

GetEv2ebitdahigh returns the Ev2ebitdahigh field if non-nil, zero value otherwise.

### GetEv2ebitdahighOk

`func (o *StockProfileValuationRatio) GetEv2ebitdahighOk() (*float32, bool)`

GetEv2ebitdahighOk returns a tuple with the Ev2ebitdahigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEv2ebitdahigh

`func (o *StockProfileValuationRatio) SetEv2ebitdahigh(v float32)`

SetEv2ebitdahigh sets Ev2ebitdahigh field to given value.

### HasEv2ebitdahigh

`func (o *StockProfileValuationRatio) HasEv2ebitdahigh() bool`

HasEv2ebitdahigh returns a boolean if a field has been set.

### GetEv2ebitdalow

`func (o *StockProfileValuationRatio) GetEv2ebitdalow() float32`

GetEv2ebitdalow returns the Ev2ebitdalow field if non-nil, zero value otherwise.

### GetEv2ebitdalowOk

`func (o *StockProfileValuationRatio) GetEv2ebitdalowOk() (*float32, bool)`

GetEv2ebitdalowOk returns a tuple with the Ev2ebitdalow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEv2ebitdalow

`func (o *StockProfileValuationRatio) SetEv2ebitdalow(v float32)`

SetEv2ebitdalow sets Ev2ebitdalow field to given value.

### HasEv2ebitdalow

`func (o *StockProfileValuationRatio) HasEv2ebitdalow() bool`

HasEv2ebitdalow returns a boolean if a field has been set.

### GetEv2ebitdamed

`func (o *StockProfileValuationRatio) GetEv2ebitdamed() float32`

GetEv2ebitdamed returns the Ev2ebitdamed field if non-nil, zero value otherwise.

### GetEv2ebitdamedOk

`func (o *StockProfileValuationRatio) GetEv2ebitdamedOk() (*float32, bool)`

GetEv2ebitdamedOk returns a tuple with the Ev2ebitdamed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEv2ebitdamed

`func (o *StockProfileValuationRatio) SetEv2ebitdamed(v float32)`

SetEv2ebitdamed sets Ev2ebitdamed field to given value.

### HasEv2ebitdamed

`func (o *StockProfileValuationRatio) HasEv2ebitdamed() bool`

HasEv2ebitdamed returns a boolean if a field has been set.

### GetEv2ebithigh

`func (o *StockProfileValuationRatio) GetEv2ebithigh() float32`

GetEv2ebithigh returns the Ev2ebithigh field if non-nil, zero value otherwise.

### GetEv2ebithighOk

`func (o *StockProfileValuationRatio) GetEv2ebithighOk() (*float32, bool)`

GetEv2ebithighOk returns a tuple with the Ev2ebithigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEv2ebithigh

`func (o *StockProfileValuationRatio) SetEv2ebithigh(v float32)`

SetEv2ebithigh sets Ev2ebithigh field to given value.

### HasEv2ebithigh

`func (o *StockProfileValuationRatio) HasEv2ebithigh() bool`

HasEv2ebithigh returns a boolean if a field has been set.

### GetEv2ebitlow

`func (o *StockProfileValuationRatio) GetEv2ebitlow() float32`

GetEv2ebitlow returns the Ev2ebitlow field if non-nil, zero value otherwise.

### GetEv2ebitlowOk

`func (o *StockProfileValuationRatio) GetEv2ebitlowOk() (*float32, bool)`

GetEv2ebitlowOk returns a tuple with the Ev2ebitlow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEv2ebitlow

`func (o *StockProfileValuationRatio) SetEv2ebitlow(v float32)`

SetEv2ebitlow sets Ev2ebitlow field to given value.

### HasEv2ebitlow

`func (o *StockProfileValuationRatio) HasEv2ebitlow() bool`

HasEv2ebitlow returns a boolean if a field has been set.

### GetEv2ebitmed

`func (o *StockProfileValuationRatio) GetEv2ebitmed() float32`

GetEv2ebitmed returns the Ev2ebitmed field if non-nil, zero value otherwise.

### GetEv2ebitmedOk

`func (o *StockProfileValuationRatio) GetEv2ebitmedOk() (*float32, bool)`

GetEv2ebitmedOk returns a tuple with the Ev2ebitmed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEv2ebitmed

`func (o *StockProfileValuationRatio) SetEv2ebitmed(v float32)`

SetEv2ebitmed sets Ev2ebitmed field to given value.

### HasEv2ebitmed

`func (o *StockProfileValuationRatio) HasEv2ebitmed() bool`

HasEv2ebitmed returns a boolean if a field has been set.

### GetEv2fcf

`func (o *StockProfileValuationRatio) GetEv2fcf() float32`

GetEv2fcf returns the Ev2fcf field if non-nil, zero value otherwise.

### GetEv2fcfOk

`func (o *StockProfileValuationRatio) GetEv2fcfOk() (*float32, bool)`

GetEv2fcfOk returns a tuple with the Ev2fcf field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEv2fcf

`func (o *StockProfileValuationRatio) SetEv2fcf(v float32)`

SetEv2fcf sets Ev2fcf field to given value.

### HasEv2fcf

`func (o *StockProfileValuationRatio) HasEv2fcf() bool`

HasEv2fcf returns a boolean if a field has been set.

### GetEv2fcfhigh

`func (o *StockProfileValuationRatio) GetEv2fcfhigh() float32`

GetEv2fcfhigh returns the Ev2fcfhigh field if non-nil, zero value otherwise.

### GetEv2fcfhighOk

`func (o *StockProfileValuationRatio) GetEv2fcfhighOk() (*float32, bool)`

GetEv2fcfhighOk returns a tuple with the Ev2fcfhigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEv2fcfhigh

`func (o *StockProfileValuationRatio) SetEv2fcfhigh(v float32)`

SetEv2fcfhigh sets Ev2fcfhigh field to given value.

### HasEv2fcfhigh

`func (o *StockProfileValuationRatio) HasEv2fcfhigh() bool`

HasEv2fcfhigh returns a boolean if a field has been set.

### GetEv2fcflow

`func (o *StockProfileValuationRatio) GetEv2fcflow() float32`

GetEv2fcflow returns the Ev2fcflow field if non-nil, zero value otherwise.

### GetEv2fcflowOk

`func (o *StockProfileValuationRatio) GetEv2fcflowOk() (*float32, bool)`

GetEv2fcflowOk returns a tuple with the Ev2fcflow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEv2fcflow

`func (o *StockProfileValuationRatio) SetEv2fcflow(v float32)`

SetEv2fcflow sets Ev2fcflow field to given value.

### HasEv2fcflow

`func (o *StockProfileValuationRatio) HasEv2fcflow() bool`

HasEv2fcflow returns a boolean if a field has been set.

### GetEv2fcfmed

`func (o *StockProfileValuationRatio) GetEv2fcfmed() float32`

GetEv2fcfmed returns the Ev2fcfmed field if non-nil, zero value otherwise.

### GetEv2fcfmedOk

`func (o *StockProfileValuationRatio) GetEv2fcfmedOk() (*float32, bool)`

GetEv2fcfmedOk returns a tuple with the Ev2fcfmed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEv2fcfmed

`func (o *StockProfileValuationRatio) SetEv2fcfmed(v float32)`

SetEv2fcfmed sets Ev2fcfmed field to given value.

### HasEv2fcfmed

`func (o *StockProfileValuationRatio) HasEv2fcfmed() bool`

HasEv2fcfmed returns a boolean if a field has been set.

### GetEv2pretaxincome

`func (o *StockProfileValuationRatio) GetEv2pretaxincome() float32`

GetEv2pretaxincome returns the Ev2pretaxincome field if non-nil, zero value otherwise.

### GetEv2pretaxincomeOk

`func (o *StockProfileValuationRatio) GetEv2pretaxincomeOk() (*float32, bool)`

GetEv2pretaxincomeOk returns a tuple with the Ev2pretaxincome field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEv2pretaxincome

`func (o *StockProfileValuationRatio) SetEv2pretaxincome(v float32)`

SetEv2pretaxincome sets Ev2pretaxincome field to given value.

### HasEv2pretaxincome

`func (o *StockProfileValuationRatio) HasEv2pretaxincome() bool`

HasEv2pretaxincome returns a boolean if a field has been set.

### GetEv2rev

`func (o *StockProfileValuationRatio) GetEv2rev() float32`

GetEv2rev returns the Ev2rev field if non-nil, zero value otherwise.

### GetEv2revOk

`func (o *StockProfileValuationRatio) GetEv2revOk() (*float32, bool)`

GetEv2revOk returns a tuple with the Ev2rev field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEv2rev

`func (o *StockProfileValuationRatio) SetEv2rev(v float32)`

SetEv2rev sets Ev2rev field to given value.

### HasEv2rev

`func (o *StockProfileValuationRatio) HasEv2rev() bool`

HasEv2rev returns a boolean if a field has been set.

### GetEv2revhigh

`func (o *StockProfileValuationRatio) GetEv2revhigh() float32`

GetEv2revhigh returns the Ev2revhigh field if non-nil, zero value otherwise.

### GetEv2revhighOk

`func (o *StockProfileValuationRatio) GetEv2revhighOk() (*float32, bool)`

GetEv2revhighOk returns a tuple with the Ev2revhigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEv2revhigh

`func (o *StockProfileValuationRatio) SetEv2revhigh(v float32)`

SetEv2revhigh sets Ev2revhigh field to given value.

### HasEv2revhigh

`func (o *StockProfileValuationRatio) HasEv2revhigh() bool`

HasEv2revhigh returns a boolean if a field has been set.

### GetEv2revlow

`func (o *StockProfileValuationRatio) GetEv2revlow() float32`

GetEv2revlow returns the Ev2revlow field if non-nil, zero value otherwise.

### GetEv2revlowOk

`func (o *StockProfileValuationRatio) GetEv2revlowOk() (*float32, bool)`

GetEv2revlowOk returns a tuple with the Ev2revlow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEv2revlow

`func (o *StockProfileValuationRatio) SetEv2revlow(v float32)`

SetEv2revlow sets Ev2revlow field to given value.

### HasEv2revlow

`func (o *StockProfileValuationRatio) HasEv2revlow() bool`

HasEv2revlow returns a boolean if a field has been set.

### GetEv2revmed

`func (o *StockProfileValuationRatio) GetEv2revmed() float32`

GetEv2revmed returns the Ev2revmed field if non-nil, zero value otherwise.

### GetEv2revmedOk

`func (o *StockProfileValuationRatio) GetEv2revmedOk() (*float32, bool)`

GetEv2revmedOk returns a tuple with the Ev2revmed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEv2revmed

`func (o *StockProfileValuationRatio) SetEv2revmed(v float32)`

SetEv2revmed sets Ev2revmed field to given value.

### HasEv2revmed

`func (o *StockProfileValuationRatio) HasEv2revmed() bool`

HasEv2revmed returns a boolean if a field has been set.

### GetEvToForwardEbit

`func (o *StockProfileValuationRatio) GetEvToForwardEbit() float32`

GetEvToForwardEbit returns the EvToForwardEbit field if non-nil, zero value otherwise.

### GetEvToForwardEbitOk

`func (o *StockProfileValuationRatio) GetEvToForwardEbitOk() (*float32, bool)`

GetEvToForwardEbitOk returns a tuple with the EvToForwardEbit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvToForwardEbit

`func (o *StockProfileValuationRatio) SetEvToForwardEbit(v float32)`

SetEvToForwardEbit sets EvToForwardEbit field to given value.

### HasEvToForwardEbit

`func (o *StockProfileValuationRatio) HasEvToForwardEbit() bool`

HasEvToForwardEbit returns a boolean if a field has been set.

### GetEvToForwardEbitda

`func (o *StockProfileValuationRatio) GetEvToForwardEbitda() float32`

GetEvToForwardEbitda returns the EvToForwardEbitda field if non-nil, zero value otherwise.

### GetEvToForwardEbitdaOk

`func (o *StockProfileValuationRatio) GetEvToForwardEbitdaOk() (*float32, bool)`

GetEvToForwardEbitdaOk returns a tuple with the EvToForwardEbitda field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvToForwardEbitda

`func (o *StockProfileValuationRatio) SetEvToForwardEbitda(v float32)`

SetEvToForwardEbitda sets EvToForwardEbitda field to given value.

### HasEvToForwardEbitda

`func (o *StockProfileValuationRatio) HasEvToForwardEbitda() bool`

HasEvToForwardEbitda returns a boolean if a field has been set.

### GetEvToForwardRevenue

`func (o *StockProfileValuationRatio) GetEvToForwardRevenue() float32`

GetEvToForwardRevenue returns the EvToForwardRevenue field if non-nil, zero value otherwise.

### GetEvToForwardRevenueOk

`func (o *StockProfileValuationRatio) GetEvToForwardRevenueOk() (*float32, bool)`

GetEvToForwardRevenueOk returns a tuple with the EvToForwardRevenue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvToForwardRevenue

`func (o *StockProfileValuationRatio) SetEvToForwardRevenue(v float32)`

SetEvToForwardRevenue sets EvToForwardRevenue field to given value.

### HasEvToForwardRevenue

`func (o *StockProfileValuationRatio) HasEvToForwardRevenue() bool`

HasEvToForwardRevenue returns a boolean if a field has been set.

### GetForwardPE

`func (o *StockProfileValuationRatio) GetForwardPE() float32`

GetForwardPE returns the ForwardPE field if non-nil, zero value otherwise.

### GetForwardPEOk

`func (o *StockProfileValuationRatio) GetForwardPEOk() (*float32, bool)`

GetForwardPEOk returns a tuple with the ForwardPE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForwardPE

`func (o *StockProfileValuationRatio) SetForwardPE(v float32)`

SetForwardPE sets ForwardPE field to given value.

### HasForwardPE

`func (o *StockProfileValuationRatio) HasForwardPE() bool`

HasForwardPE returns a boolean if a field has been set.

### GetForwardFcfYield

`func (o *StockProfileValuationRatio) GetForwardFcfYield() float32`

GetForwardFcfYield returns the ForwardFcfYield field if non-nil, zero value otherwise.

### GetForwardFcfYieldOk

`func (o *StockProfileValuationRatio) GetForwardFcfYieldOk() (*float32, bool)`

GetForwardFcfYieldOk returns a tuple with the ForwardFcfYield field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForwardFcfYield

`func (o *StockProfileValuationRatio) SetForwardFcfYield(v float32)`

SetForwardFcfYield sets ForwardFcfYield field to given value.

### HasForwardFcfYield

`func (o *StockProfileValuationRatio) HasForwardFcfYield() bool`

HasForwardFcfYield returns a boolean if a field has been set.

### GetForwardPegRatio

`func (o *StockProfileValuationRatio) GetForwardPegRatio() float32`

GetForwardPegRatio returns the ForwardPegRatio field if non-nil, zero value otherwise.

### GetForwardPegRatioOk

`func (o *StockProfileValuationRatio) GetForwardPegRatioOk() (*float32, bool)`

GetForwardPegRatioOk returns a tuple with the ForwardPegRatio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForwardPegRatio

`func (o *StockProfileValuationRatio) SetForwardPegRatio(v float32)`

SetForwardPegRatio sets ForwardPegRatio field to given value.

### HasForwardPegRatio

`func (o *StockProfileValuationRatio) HasForwardPegRatio() bool`

HasForwardPegRatio returns a boolean if a field has been set.

### GetGrahamnumber

`func (o *StockProfileValuationRatio) GetGrahamnumber() float32`

GetGrahamnumber returns the Grahamnumber field if non-nil, zero value otherwise.

### GetGrahamnumberOk

`func (o *StockProfileValuationRatio) GetGrahamnumberOk() (*float32, bool)`

GetGrahamnumberOk returns a tuple with the Grahamnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrahamnumber

`func (o *StockProfileValuationRatio) SetGrahamnumber(v float32)`

SetGrahamnumber sets Grahamnumber field to given value.

### HasGrahamnumber

`func (o *StockProfileValuationRatio) HasGrahamnumber() bool`

HasGrahamnumber returns a boolean if a field has been set.

### GetIvDcEarning

`func (o *StockProfileValuationRatio) GetIvDcEarning() float32`

GetIvDcEarning returns the IvDcEarning field if non-nil, zero value otherwise.

### GetIvDcEarningOk

`func (o *StockProfileValuationRatio) GetIvDcEarningOk() (*float32, bool)`

GetIvDcEarningOk returns a tuple with the IvDcEarning field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIvDcEarning

`func (o *StockProfileValuationRatio) SetIvDcEarning(v float32)`

SetIvDcEarning sets IvDcEarning field to given value.

### HasIvDcEarning

`func (o *StockProfileValuationRatio) HasIvDcEarning() bool`

HasIvDcEarning returns a boolean if a field has been set.

### GetIvDcf

`func (o *StockProfileValuationRatio) GetIvDcf() float32`

GetIvDcf returns the IvDcf field if non-nil, zero value otherwise.

### GetIvDcfOk

`func (o *StockProfileValuationRatio) GetIvDcfOk() (*float32, bool)`

GetIvDcfOk returns a tuple with the IvDcf field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIvDcf

`func (o *StockProfileValuationRatio) SetIvDcf(v float32)`

SetIvDcf sets IvDcf field to given value.

### HasIvDcf

`func (o *StockProfileValuationRatio) HasIvDcf() bool`

HasIvDcf returns a boolean if a field has been set.

### GetIvDcfDividend

`func (o *StockProfileValuationRatio) GetIvDcfDividend() float32`

GetIvDcfDividend returns the IvDcfDividend field if non-nil, zero value otherwise.

### GetIvDcfDividendOk

`func (o *StockProfileValuationRatio) GetIvDcfDividendOk() (*float32, bool)`

GetIvDcfDividendOk returns a tuple with the IvDcfDividend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIvDcfDividend

`func (o *StockProfileValuationRatio) SetIvDcfDividend(v float32)`

SetIvDcfDividend sets IvDcfDividend field to given value.

### HasIvDcfDividend

`func (o *StockProfileValuationRatio) HasIvDcfDividend() bool`

HasIvDcfDividend returns a boolean if a field has been set.

### GetIvDcfShare

`func (o *StockProfileValuationRatio) GetIvDcfShare() float32`

GetIvDcfShare returns the IvDcfShare field if non-nil, zero value otherwise.

### GetIvDcfShareOk

`func (o *StockProfileValuationRatio) GetIvDcfShareOk() (*float32, bool)`

GetIvDcfShareOk returns a tuple with the IvDcfShare field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIvDcfShare

`func (o *StockProfileValuationRatio) SetIvDcfShare(v float32)`

SetIvDcfShare sets IvDcfShare field to given value.

### HasIvDcfShare

`func (o *StockProfileValuationRatio) HasIvDcfShare() bool`

HasIvDcfShare returns a boolean if a field has been set.

### GetLynchvalue

`func (o *StockProfileValuationRatio) GetLynchvalue() float32`

GetLynchvalue returns the Lynchvalue field if non-nil, zero value otherwise.

### GetLynchvalueOk

`func (o *StockProfileValuationRatio) GetLynchvalueOk() (*float32, bool)`

GetLynchvalueOk returns a tuple with the Lynchvalue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLynchvalue

`func (o *StockProfileValuationRatio) SetLynchvalue(v float32)`

SetLynchvalue sets Lynchvalue field to given value.

### HasLynchvalue

`func (o *StockProfileValuationRatio) HasLynchvalue() bool`

HasLynchvalue returns a boolean if a field has been set.

### GetMarginDcEarning

`func (o *StockProfileValuationRatio) GetMarginDcEarning() float32`

GetMarginDcEarning returns the MarginDcEarning field if non-nil, zero value otherwise.

### GetMarginDcEarningOk

`func (o *StockProfileValuationRatio) GetMarginDcEarningOk() (*float32, bool)`

GetMarginDcEarningOk returns a tuple with the MarginDcEarning field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarginDcEarning

`func (o *StockProfileValuationRatio) SetMarginDcEarning(v float32)`

SetMarginDcEarning sets MarginDcEarning field to given value.

### HasMarginDcEarning

`func (o *StockProfileValuationRatio) HasMarginDcEarning() bool`

HasMarginDcEarning returns a boolean if a field has been set.

### GetMarginDcf

`func (o *StockProfileValuationRatio) GetMarginDcf() float32`

GetMarginDcf returns the MarginDcf field if non-nil, zero value otherwise.

### GetMarginDcfOk

`func (o *StockProfileValuationRatio) GetMarginDcfOk() (*float32, bool)`

GetMarginDcfOk returns a tuple with the MarginDcf field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarginDcf

`func (o *StockProfileValuationRatio) SetMarginDcf(v float32)`

SetMarginDcf sets MarginDcf field to given value.

### HasMarginDcf

`func (o *StockProfileValuationRatio) HasMarginDcf() bool`

HasMarginDcf returns a boolean if a field has been set.

### GetMarginDcfDividend

`func (o *StockProfileValuationRatio) GetMarginDcfDividend() float32`

GetMarginDcfDividend returns the MarginDcfDividend field if non-nil, zero value otherwise.

### GetMarginDcfDividendOk

`func (o *StockProfileValuationRatio) GetMarginDcfDividendOk() (*float32, bool)`

GetMarginDcfDividendOk returns a tuple with the MarginDcfDividend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarginDcfDividend

`func (o *StockProfileValuationRatio) SetMarginDcfDividend(v float32)`

SetMarginDcfDividend sets MarginDcfDividend field to given value.

### HasMarginDcfDividend

`func (o *StockProfileValuationRatio) HasMarginDcfDividend() bool`

HasMarginDcfDividend returns a boolean if a field has been set.

### GetMedpbvalue

`func (o *StockProfileValuationRatio) GetMedpbvalue() float32`

GetMedpbvalue returns the Medpbvalue field if non-nil, zero value otherwise.

### GetMedpbvalueOk

`func (o *StockProfileValuationRatio) GetMedpbvalueOk() (*float32, bool)`

GetMedpbvalueOk returns a tuple with the Medpbvalue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMedpbvalue

`func (o *StockProfileValuationRatio) SetMedpbvalue(v float32)`

SetMedpbvalue sets Medpbvalue field to given value.

### HasMedpbvalue

`func (o *StockProfileValuationRatio) HasMedpbvalue() bool`

HasMedpbvalue returns a boolean if a field has been set.

### GetMedpsvalue

`func (o *StockProfileValuationRatio) GetMedpsvalue() float32`

GetMedpsvalue returns the Medpsvalue field if non-nil, zero value otherwise.

### GetMedpsvalueOk

`func (o *StockProfileValuationRatio) GetMedpsvalueOk() (*float32, bool)`

GetMedpsvalueOk returns a tuple with the Medpsvalue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMedpsvalue

`func (o *StockProfileValuationRatio) SetMedpsvalue(v float32)`

SetMedpsvalue sets Medpsvalue field to given value.

### HasMedpsvalue

`func (o *StockProfileValuationRatio) HasMedpsvalue() bool`

HasMedpsvalue returns a boolean if a field has been set.

### GetNcav

`func (o *StockProfileValuationRatio) GetNcav() float32`

GetNcav returns the Ncav field if non-nil, zero value otherwise.

### GetNcavOk

`func (o *StockProfileValuationRatio) GetNcavOk() (*float32, bool)`

GetNcavOk returns a tuple with the Ncav field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNcav

`func (o *StockProfileValuationRatio) SetNcav(v float32)`

SetNcav sets Ncav field to given value.

### HasNcav

`func (o *StockProfileValuationRatio) HasNcav() bool`

HasNcav returns a boolean if a field has been set.

### GetNcavReal

`func (o *StockProfileValuationRatio) GetNcavReal() float32`

GetNcavReal returns the NcavReal field if non-nil, zero value otherwise.

### GetNcavRealOk

`func (o *StockProfileValuationRatio) GetNcavRealOk() (*float32, bool)`

GetNcavRealOk returns a tuple with the NcavReal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNcavReal

`func (o *StockProfileValuationRatio) SetNcavReal(v float32)`

SetNcavReal sets NcavReal field to given value.

### HasNcavReal

`func (o *StockProfileValuationRatio) HasNcavReal() bool`

HasNcavReal returns a boolean if a field has been set.

### GetNetCash

`func (o *StockProfileValuationRatio) GetNetCash() float32`

GetNetCash returns the NetCash field if non-nil, zero value otherwise.

### GetNetCashOk

`func (o *StockProfileValuationRatio) GetNetCashOk() (*float32, bool)`

GetNetCashOk returns a tuple with the NetCash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetCash

`func (o *StockProfileValuationRatio) SetNetCash(v float32)`

SetNetCash sets NetCash field to given value.

### HasNetCash

`func (o *StockProfileValuationRatio) HasNetCash() bool`

HasNetCash returns a boolean if a field has been set.

### GetP2EPV

`func (o *StockProfileValuationRatio) GetP2EPV() float32`

GetP2EPV returns the P2EPV field if non-nil, zero value otherwise.

### GetP2EPVOk

`func (o *StockProfileValuationRatio) GetP2EPVOk() (*float32, bool)`

GetP2EPVOk returns a tuple with the P2EPV field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2EPV

`func (o *StockProfileValuationRatio) SetP2EPV(v float32)`

SetP2EPV sets P2EPV field to given value.

### HasP2EPV

`func (o *StockProfileValuationRatio) HasP2EPV() bool`

HasP2EPV returns a boolean if a field has been set.

### GetP2OwnerEarnings

`func (o *StockProfileValuationRatio) GetP2OwnerEarnings() float32`

GetP2OwnerEarnings returns the P2OwnerEarnings field if non-nil, zero value otherwise.

### GetP2OwnerEarningsOk

`func (o *StockProfileValuationRatio) GetP2OwnerEarningsOk() (*float32, bool)`

GetP2OwnerEarningsOk returns a tuple with the P2OwnerEarnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2OwnerEarnings

`func (o *StockProfileValuationRatio) SetP2OwnerEarnings(v float32)`

SetP2OwnerEarnings sets P2OwnerEarnings field to given value.

### HasP2OwnerEarnings

`func (o *StockProfileValuationRatio) HasP2OwnerEarnings() bool`

HasP2OwnerEarnings returns a boolean if a field has been set.

### GetP2OwnerEarningsHigh

`func (o *StockProfileValuationRatio) GetP2OwnerEarningsHigh() float32`

GetP2OwnerEarningsHigh returns the P2OwnerEarningsHigh field if non-nil, zero value otherwise.

### GetP2OwnerEarningsHighOk

`func (o *StockProfileValuationRatio) GetP2OwnerEarningsHighOk() (*float32, bool)`

GetP2OwnerEarningsHighOk returns a tuple with the P2OwnerEarningsHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2OwnerEarningsHigh

`func (o *StockProfileValuationRatio) SetP2OwnerEarningsHigh(v float32)`

SetP2OwnerEarningsHigh sets P2OwnerEarningsHigh field to given value.

### HasP2OwnerEarningsHigh

`func (o *StockProfileValuationRatio) HasP2OwnerEarningsHigh() bool`

HasP2OwnerEarningsHigh returns a boolean if a field has been set.

### GetP2OwnerEarningsLow

`func (o *StockProfileValuationRatio) GetP2OwnerEarningsLow() float32`

GetP2OwnerEarningsLow returns the P2OwnerEarningsLow field if non-nil, zero value otherwise.

### GetP2OwnerEarningsLowOk

`func (o *StockProfileValuationRatio) GetP2OwnerEarningsLowOk() (*float32, bool)`

GetP2OwnerEarningsLowOk returns a tuple with the P2OwnerEarningsLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2OwnerEarningsLow

`func (o *StockProfileValuationRatio) SetP2OwnerEarningsLow(v float32)`

SetP2OwnerEarningsLow sets P2OwnerEarningsLow field to given value.

### HasP2OwnerEarningsLow

`func (o *StockProfileValuationRatio) HasP2OwnerEarningsLow() bool`

HasP2OwnerEarningsLow returns a boolean if a field has been set.

### GetP2OwnerEarningsMed

`func (o *StockProfileValuationRatio) GetP2OwnerEarningsMed() float32`

GetP2OwnerEarningsMed returns the P2OwnerEarningsMed field if non-nil, zero value otherwise.

### GetP2OwnerEarningsMedOk

`func (o *StockProfileValuationRatio) GetP2OwnerEarningsMedOk() (*float32, bool)`

GetP2OwnerEarningsMedOk returns a tuple with the P2OwnerEarningsMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2OwnerEarningsMed

`func (o *StockProfileValuationRatio) SetP2OwnerEarningsMed(v float32)`

SetP2OwnerEarningsMed sets P2OwnerEarningsMed field to given value.

### HasP2OwnerEarningsMed

`func (o *StockProfileValuationRatio) HasP2OwnerEarningsMed() bool`

HasP2OwnerEarningsMed returns a boolean if a field has been set.

### GetP2ffo

`func (o *StockProfileValuationRatio) GetP2ffo() float32`

GetP2ffo returns the P2ffo field if non-nil, zero value otherwise.

### GetP2ffoOk

`func (o *StockProfileValuationRatio) GetP2ffoOk() (*float32, bool)`

GetP2ffoOk returns a tuple with the P2ffo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2ffo

`func (o *StockProfileValuationRatio) SetP2ffo(v float32)`

SetP2ffo sets P2ffo field to given value.

### HasP2ffo

`func (o *StockProfileValuationRatio) HasP2ffo() bool`

HasP2ffo returns a boolean if a field has been set.

### GetP2grahamnumber

`func (o *StockProfileValuationRatio) GetP2grahamnumber() float32`

GetP2grahamnumber returns the P2grahamnumber field if non-nil, zero value otherwise.

### GetP2grahamnumberOk

`func (o *StockProfileValuationRatio) GetP2grahamnumberOk() (*float32, bool)`

GetP2grahamnumberOk returns a tuple with the P2grahamnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2grahamnumber

`func (o *StockProfileValuationRatio) SetP2grahamnumber(v float32)`

SetP2grahamnumber sets P2grahamnumber field to given value.

### HasP2grahamnumber

`func (o *StockProfileValuationRatio) HasP2grahamnumber() bool`

HasP2grahamnumber returns a boolean if a field has been set.

### GetP2grahamnumberHigh

`func (o *StockProfileValuationRatio) GetP2grahamnumberHigh() float32`

GetP2grahamnumberHigh returns the P2grahamnumberHigh field if non-nil, zero value otherwise.

### GetP2grahamnumberHighOk

`func (o *StockProfileValuationRatio) GetP2grahamnumberHighOk() (*float32, bool)`

GetP2grahamnumberHighOk returns a tuple with the P2grahamnumberHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2grahamnumberHigh

`func (o *StockProfileValuationRatio) SetP2grahamnumberHigh(v float32)`

SetP2grahamnumberHigh sets P2grahamnumberHigh field to given value.

### HasP2grahamnumberHigh

`func (o *StockProfileValuationRatio) HasP2grahamnumberHigh() bool`

HasP2grahamnumberHigh returns a boolean if a field has been set.

### GetP2grahamnumberLow

`func (o *StockProfileValuationRatio) GetP2grahamnumberLow() float32`

GetP2grahamnumberLow returns the P2grahamnumberLow field if non-nil, zero value otherwise.

### GetP2grahamnumberLowOk

`func (o *StockProfileValuationRatio) GetP2grahamnumberLowOk() (*float32, bool)`

GetP2grahamnumberLowOk returns a tuple with the P2grahamnumberLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2grahamnumberLow

`func (o *StockProfileValuationRatio) SetP2grahamnumberLow(v float32)`

SetP2grahamnumberLow sets P2grahamnumberLow field to given value.

### HasP2grahamnumberLow

`func (o *StockProfileValuationRatio) HasP2grahamnumberLow() bool`

HasP2grahamnumberLow returns a boolean if a field has been set.

### GetP2grahamnumberMed

`func (o *StockProfileValuationRatio) GetP2grahamnumberMed() float32`

GetP2grahamnumberMed returns the P2grahamnumberMed field if non-nil, zero value otherwise.

### GetP2grahamnumberMedOk

`func (o *StockProfileValuationRatio) GetP2grahamnumberMedOk() (*float32, bool)`

GetP2grahamnumberMedOk returns a tuple with the P2grahamnumberMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2grahamnumberMed

`func (o *StockProfileValuationRatio) SetP2grahamnumberMed(v float32)`

SetP2grahamnumberMed sets P2grahamnumberMed field to given value.

### HasP2grahamnumberMed

`func (o *StockProfileValuationRatio) HasP2grahamnumberMed() bool`

HasP2grahamnumberMed returns a boolean if a field has been set.

### GetP2ivDcEarning

`func (o *StockProfileValuationRatio) GetP2ivDcEarning() float32`

GetP2ivDcEarning returns the P2ivDcEarning field if non-nil, zero value otherwise.

### GetP2ivDcEarningOk

`func (o *StockProfileValuationRatio) GetP2ivDcEarningOk() (*float32, bool)`

GetP2ivDcEarningOk returns a tuple with the P2ivDcEarning field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2ivDcEarning

`func (o *StockProfileValuationRatio) SetP2ivDcEarning(v float32)`

SetP2ivDcEarning sets P2ivDcEarning field to given value.

### HasP2ivDcEarning

`func (o *StockProfileValuationRatio) HasP2ivDcEarning() bool`

HasP2ivDcEarning returns a boolean if a field has been set.

### GetP2ivDcEarningHigh

`func (o *StockProfileValuationRatio) GetP2ivDcEarningHigh() float32`

GetP2ivDcEarningHigh returns the P2ivDcEarningHigh field if non-nil, zero value otherwise.

### GetP2ivDcEarningHighOk

`func (o *StockProfileValuationRatio) GetP2ivDcEarningHighOk() (*float32, bool)`

GetP2ivDcEarningHighOk returns a tuple with the P2ivDcEarningHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2ivDcEarningHigh

`func (o *StockProfileValuationRatio) SetP2ivDcEarningHigh(v float32)`

SetP2ivDcEarningHigh sets P2ivDcEarningHigh field to given value.

### HasP2ivDcEarningHigh

`func (o *StockProfileValuationRatio) HasP2ivDcEarningHigh() bool`

HasP2ivDcEarningHigh returns a boolean if a field has been set.

### GetP2ivDcEarningLow

`func (o *StockProfileValuationRatio) GetP2ivDcEarningLow() float32`

GetP2ivDcEarningLow returns the P2ivDcEarningLow field if non-nil, zero value otherwise.

### GetP2ivDcEarningLowOk

`func (o *StockProfileValuationRatio) GetP2ivDcEarningLowOk() (*float32, bool)`

GetP2ivDcEarningLowOk returns a tuple with the P2ivDcEarningLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2ivDcEarningLow

`func (o *StockProfileValuationRatio) SetP2ivDcEarningLow(v float32)`

SetP2ivDcEarningLow sets P2ivDcEarningLow field to given value.

### HasP2ivDcEarningLow

`func (o *StockProfileValuationRatio) HasP2ivDcEarningLow() bool`

HasP2ivDcEarningLow returns a boolean if a field has been set.

### GetP2ivDcEarningMed

`func (o *StockProfileValuationRatio) GetP2ivDcEarningMed() float32`

GetP2ivDcEarningMed returns the P2ivDcEarningMed field if non-nil, zero value otherwise.

### GetP2ivDcEarningMedOk

`func (o *StockProfileValuationRatio) GetP2ivDcEarningMedOk() (*float32, bool)`

GetP2ivDcEarningMedOk returns a tuple with the P2ivDcEarningMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2ivDcEarningMed

`func (o *StockProfileValuationRatio) SetP2ivDcEarningMed(v float32)`

SetP2ivDcEarningMed sets P2ivDcEarningMed field to given value.

### HasP2ivDcEarningMed

`func (o *StockProfileValuationRatio) HasP2ivDcEarningMed() bool`

HasP2ivDcEarningMed returns a boolean if a field has been set.

### GetP2ivDcf

`func (o *StockProfileValuationRatio) GetP2ivDcf() float32`

GetP2ivDcf returns the P2ivDcf field if non-nil, zero value otherwise.

### GetP2ivDcfOk

`func (o *StockProfileValuationRatio) GetP2ivDcfOk() (*float32, bool)`

GetP2ivDcfOk returns a tuple with the P2ivDcf field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2ivDcf

`func (o *StockProfileValuationRatio) SetP2ivDcf(v float32)`

SetP2ivDcf sets P2ivDcf field to given value.

### HasP2ivDcf

`func (o *StockProfileValuationRatio) HasP2ivDcf() bool`

HasP2ivDcf returns a boolean if a field has been set.

### GetP2ivDcfDividend

`func (o *StockProfileValuationRatio) GetP2ivDcfDividend() float32`

GetP2ivDcfDividend returns the P2ivDcfDividend field if non-nil, zero value otherwise.

### GetP2ivDcfDividendOk

`func (o *StockProfileValuationRatio) GetP2ivDcfDividendOk() (*float32, bool)`

GetP2ivDcfDividendOk returns a tuple with the P2ivDcfDividend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2ivDcfDividend

`func (o *StockProfileValuationRatio) SetP2ivDcfDividend(v float32)`

SetP2ivDcfDividend sets P2ivDcfDividend field to given value.

### HasP2ivDcfDividend

`func (o *StockProfileValuationRatio) HasP2ivDcfDividend() bool`

HasP2ivDcfDividend returns a boolean if a field has been set.

### GetP2ivDcfDividendHigh

`func (o *StockProfileValuationRatio) GetP2ivDcfDividendHigh() float32`

GetP2ivDcfDividendHigh returns the P2ivDcfDividendHigh field if non-nil, zero value otherwise.

### GetP2ivDcfDividendHighOk

`func (o *StockProfileValuationRatio) GetP2ivDcfDividendHighOk() (*float32, bool)`

GetP2ivDcfDividendHighOk returns a tuple with the P2ivDcfDividendHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2ivDcfDividendHigh

`func (o *StockProfileValuationRatio) SetP2ivDcfDividendHigh(v float32)`

SetP2ivDcfDividendHigh sets P2ivDcfDividendHigh field to given value.

### HasP2ivDcfDividendHigh

`func (o *StockProfileValuationRatio) HasP2ivDcfDividendHigh() bool`

HasP2ivDcfDividendHigh returns a boolean if a field has been set.

### GetP2ivDcfDividendLow

`func (o *StockProfileValuationRatio) GetP2ivDcfDividendLow() float32`

GetP2ivDcfDividendLow returns the P2ivDcfDividendLow field if non-nil, zero value otherwise.

### GetP2ivDcfDividendLowOk

`func (o *StockProfileValuationRatio) GetP2ivDcfDividendLowOk() (*float32, bool)`

GetP2ivDcfDividendLowOk returns a tuple with the P2ivDcfDividendLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2ivDcfDividendLow

`func (o *StockProfileValuationRatio) SetP2ivDcfDividendLow(v float32)`

SetP2ivDcfDividendLow sets P2ivDcfDividendLow field to given value.

### HasP2ivDcfDividendLow

`func (o *StockProfileValuationRatio) HasP2ivDcfDividendLow() bool`

HasP2ivDcfDividendLow returns a boolean if a field has been set.

### GetP2ivDcfDividendMed

`func (o *StockProfileValuationRatio) GetP2ivDcfDividendMed() float32`

GetP2ivDcfDividendMed returns the P2ivDcfDividendMed field if non-nil, zero value otherwise.

### GetP2ivDcfDividendMedOk

`func (o *StockProfileValuationRatio) GetP2ivDcfDividendMedOk() (*float32, bool)`

GetP2ivDcfDividendMedOk returns a tuple with the P2ivDcfDividendMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2ivDcfDividendMed

`func (o *StockProfileValuationRatio) SetP2ivDcfDividendMed(v float32)`

SetP2ivDcfDividendMed sets P2ivDcfDividendMed field to given value.

### HasP2ivDcfDividendMed

`func (o *StockProfileValuationRatio) HasP2ivDcfDividendMed() bool`

HasP2ivDcfDividendMed returns a boolean if a field has been set.

### GetP2ivDcfHigh

`func (o *StockProfileValuationRatio) GetP2ivDcfHigh() float32`

GetP2ivDcfHigh returns the P2ivDcfHigh field if non-nil, zero value otherwise.

### GetP2ivDcfHighOk

`func (o *StockProfileValuationRatio) GetP2ivDcfHighOk() (*float32, bool)`

GetP2ivDcfHighOk returns a tuple with the P2ivDcfHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2ivDcfHigh

`func (o *StockProfileValuationRatio) SetP2ivDcfHigh(v float32)`

SetP2ivDcfHigh sets P2ivDcfHigh field to given value.

### HasP2ivDcfHigh

`func (o *StockProfileValuationRatio) HasP2ivDcfHigh() bool`

HasP2ivDcfHigh returns a boolean if a field has been set.

### GetP2ivDcfLow

`func (o *StockProfileValuationRatio) GetP2ivDcfLow() float32`

GetP2ivDcfLow returns the P2ivDcfLow field if non-nil, zero value otherwise.

### GetP2ivDcfLowOk

`func (o *StockProfileValuationRatio) GetP2ivDcfLowOk() (*float32, bool)`

GetP2ivDcfLowOk returns a tuple with the P2ivDcfLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2ivDcfLow

`func (o *StockProfileValuationRatio) SetP2ivDcfLow(v float32)`

SetP2ivDcfLow sets P2ivDcfLow field to given value.

### HasP2ivDcfLow

`func (o *StockProfileValuationRatio) HasP2ivDcfLow() bool`

HasP2ivDcfLow returns a boolean if a field has been set.

### GetP2ivDcfMed

`func (o *StockProfileValuationRatio) GetP2ivDcfMed() float32`

GetP2ivDcfMed returns the P2ivDcfMed field if non-nil, zero value otherwise.

### GetP2ivDcfMedOk

`func (o *StockProfileValuationRatio) GetP2ivDcfMedOk() (*float32, bool)`

GetP2ivDcfMedOk returns a tuple with the P2ivDcfMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2ivDcfMed

`func (o *StockProfileValuationRatio) SetP2ivDcfMed(v float32)`

SetP2ivDcfMed sets P2ivDcfMed field to given value.

### HasP2ivDcfMed

`func (o *StockProfileValuationRatio) HasP2ivDcfMed() bool`

HasP2ivDcfMed returns a boolean if a field has been set.

### GetP2ivDcfShare

`func (o *StockProfileValuationRatio) GetP2ivDcfShare() float32`

GetP2ivDcfShare returns the P2ivDcfShare field if non-nil, zero value otherwise.

### GetP2ivDcfShareOk

`func (o *StockProfileValuationRatio) GetP2ivDcfShareOk() (*float32, bool)`

GetP2ivDcfShareOk returns a tuple with the P2ivDcfShare field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2ivDcfShare

`func (o *StockProfileValuationRatio) SetP2ivDcfShare(v float32)`

SetP2ivDcfShare sets P2ivDcfShare field to given value.

### HasP2ivDcfShare

`func (o *StockProfileValuationRatio) HasP2ivDcfShare() bool`

HasP2ivDcfShare returns a boolean if a field has been set.

### GetP2ivDcfShareHigh

`func (o *StockProfileValuationRatio) GetP2ivDcfShareHigh() float32`

GetP2ivDcfShareHigh returns the P2ivDcfShareHigh field if non-nil, zero value otherwise.

### GetP2ivDcfShareHighOk

`func (o *StockProfileValuationRatio) GetP2ivDcfShareHighOk() (*float32, bool)`

GetP2ivDcfShareHighOk returns a tuple with the P2ivDcfShareHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2ivDcfShareHigh

`func (o *StockProfileValuationRatio) SetP2ivDcfShareHigh(v float32)`

SetP2ivDcfShareHigh sets P2ivDcfShareHigh field to given value.

### HasP2ivDcfShareHigh

`func (o *StockProfileValuationRatio) HasP2ivDcfShareHigh() bool`

HasP2ivDcfShareHigh returns a boolean if a field has been set.

### GetP2ivDcfShareLow

`func (o *StockProfileValuationRatio) GetP2ivDcfShareLow() float32`

GetP2ivDcfShareLow returns the P2ivDcfShareLow field if non-nil, zero value otherwise.

### GetP2ivDcfShareLowOk

`func (o *StockProfileValuationRatio) GetP2ivDcfShareLowOk() (*float32, bool)`

GetP2ivDcfShareLowOk returns a tuple with the P2ivDcfShareLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2ivDcfShareLow

`func (o *StockProfileValuationRatio) SetP2ivDcfShareLow(v float32)`

SetP2ivDcfShareLow sets P2ivDcfShareLow field to given value.

### HasP2ivDcfShareLow

`func (o *StockProfileValuationRatio) HasP2ivDcfShareLow() bool`

HasP2ivDcfShareLow returns a boolean if a field has been set.

### GetP2ivDcfShareMed

`func (o *StockProfileValuationRatio) GetP2ivDcfShareMed() float32`

GetP2ivDcfShareMed returns the P2ivDcfShareMed field if non-nil, zero value otherwise.

### GetP2ivDcfShareMedOk

`func (o *StockProfileValuationRatio) GetP2ivDcfShareMedOk() (*float32, bool)`

GetP2ivDcfShareMedOk returns a tuple with the P2ivDcfShareMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2ivDcfShareMed

`func (o *StockProfileValuationRatio) SetP2ivDcfShareMed(v float32)`

SetP2ivDcfShareMed sets P2ivDcfShareMed field to given value.

### HasP2ivDcfShareMed

`func (o *StockProfileValuationRatio) HasP2ivDcfShareMed() bool`

HasP2ivDcfShareMed returns a boolean if a field has been set.

### GetP2lynchvalue

`func (o *StockProfileValuationRatio) GetP2lynchvalue() float32`

GetP2lynchvalue returns the P2lynchvalue field if non-nil, zero value otherwise.

### GetP2lynchvalueOk

`func (o *StockProfileValuationRatio) GetP2lynchvalueOk() (*float32, bool)`

GetP2lynchvalueOk returns a tuple with the P2lynchvalue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2lynchvalue

`func (o *StockProfileValuationRatio) SetP2lynchvalue(v float32)`

SetP2lynchvalue sets P2lynchvalue field to given value.

### HasP2lynchvalue

`func (o *StockProfileValuationRatio) HasP2lynchvalue() bool`

HasP2lynchvalue returns a boolean if a field has been set.

### GetP2lynchvalueHigh

`func (o *StockProfileValuationRatio) GetP2lynchvalueHigh() float32`

GetP2lynchvalueHigh returns the P2lynchvalueHigh field if non-nil, zero value otherwise.

### GetP2lynchvalueHighOk

`func (o *StockProfileValuationRatio) GetP2lynchvalueHighOk() (*float32, bool)`

GetP2lynchvalueHighOk returns a tuple with the P2lynchvalueHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2lynchvalueHigh

`func (o *StockProfileValuationRatio) SetP2lynchvalueHigh(v float32)`

SetP2lynchvalueHigh sets P2lynchvalueHigh field to given value.

### HasP2lynchvalueHigh

`func (o *StockProfileValuationRatio) HasP2lynchvalueHigh() bool`

HasP2lynchvalueHigh returns a boolean if a field has been set.

### GetP2lynchvalueLow

`func (o *StockProfileValuationRatio) GetP2lynchvalueLow() float32`

GetP2lynchvalueLow returns the P2lynchvalueLow field if non-nil, zero value otherwise.

### GetP2lynchvalueLowOk

`func (o *StockProfileValuationRatio) GetP2lynchvalueLowOk() (*float32, bool)`

GetP2lynchvalueLowOk returns a tuple with the P2lynchvalueLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2lynchvalueLow

`func (o *StockProfileValuationRatio) SetP2lynchvalueLow(v float32)`

SetP2lynchvalueLow sets P2lynchvalueLow field to given value.

### HasP2lynchvalueLow

`func (o *StockProfileValuationRatio) HasP2lynchvalueLow() bool`

HasP2lynchvalueLow returns a boolean if a field has been set.

### GetP2lynchvalueMed

`func (o *StockProfileValuationRatio) GetP2lynchvalueMed() float32`

GetP2lynchvalueMed returns the P2lynchvalueMed field if non-nil, zero value otherwise.

### GetP2lynchvalueMedOk

`func (o *StockProfileValuationRatio) GetP2lynchvalueMedOk() (*float32, bool)`

GetP2lynchvalueMedOk returns a tuple with the P2lynchvalueMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2lynchvalueMed

`func (o *StockProfileValuationRatio) SetP2lynchvalueMed(v float32)`

SetP2lynchvalueMed sets P2lynchvalueMed field to given value.

### HasP2lynchvalueMed

`func (o *StockProfileValuationRatio) HasP2lynchvalueMed() bool`

HasP2lynchvalueMed returns a boolean if a field has been set.

### GetP2medpbvalue

`func (o *StockProfileValuationRatio) GetP2medpbvalue() float32`

GetP2medpbvalue returns the P2medpbvalue field if non-nil, zero value otherwise.

### GetP2medpbvalueOk

`func (o *StockProfileValuationRatio) GetP2medpbvalueOk() (*float32, bool)`

GetP2medpbvalueOk returns a tuple with the P2medpbvalue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2medpbvalue

`func (o *StockProfileValuationRatio) SetP2medpbvalue(v float32)`

SetP2medpbvalue sets P2medpbvalue field to given value.

### HasP2medpbvalue

`func (o *StockProfileValuationRatio) HasP2medpbvalue() bool`

HasP2medpbvalue returns a boolean if a field has been set.

### GetP2medpbvalueHigh

`func (o *StockProfileValuationRatio) GetP2medpbvalueHigh() float32`

GetP2medpbvalueHigh returns the P2medpbvalueHigh field if non-nil, zero value otherwise.

### GetP2medpbvalueHighOk

`func (o *StockProfileValuationRatio) GetP2medpbvalueHighOk() (*float32, bool)`

GetP2medpbvalueHighOk returns a tuple with the P2medpbvalueHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2medpbvalueHigh

`func (o *StockProfileValuationRatio) SetP2medpbvalueHigh(v float32)`

SetP2medpbvalueHigh sets P2medpbvalueHigh field to given value.

### HasP2medpbvalueHigh

`func (o *StockProfileValuationRatio) HasP2medpbvalueHigh() bool`

HasP2medpbvalueHigh returns a boolean if a field has been set.

### GetP2medpbvalueLow

`func (o *StockProfileValuationRatio) GetP2medpbvalueLow() float32`

GetP2medpbvalueLow returns the P2medpbvalueLow field if non-nil, zero value otherwise.

### GetP2medpbvalueLowOk

`func (o *StockProfileValuationRatio) GetP2medpbvalueLowOk() (*float32, bool)`

GetP2medpbvalueLowOk returns a tuple with the P2medpbvalueLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2medpbvalueLow

`func (o *StockProfileValuationRatio) SetP2medpbvalueLow(v float32)`

SetP2medpbvalueLow sets P2medpbvalueLow field to given value.

### HasP2medpbvalueLow

`func (o *StockProfileValuationRatio) HasP2medpbvalueLow() bool`

HasP2medpbvalueLow returns a boolean if a field has been set.

### GetP2medpbvalueMed

`func (o *StockProfileValuationRatio) GetP2medpbvalueMed() float32`

GetP2medpbvalueMed returns the P2medpbvalueMed field if non-nil, zero value otherwise.

### GetP2medpbvalueMedOk

`func (o *StockProfileValuationRatio) GetP2medpbvalueMedOk() (*float32, bool)`

GetP2medpbvalueMedOk returns a tuple with the P2medpbvalueMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2medpbvalueMed

`func (o *StockProfileValuationRatio) SetP2medpbvalueMed(v float32)`

SetP2medpbvalueMed sets P2medpbvalueMed field to given value.

### HasP2medpbvalueMed

`func (o *StockProfileValuationRatio) HasP2medpbvalueMed() bool`

HasP2medpbvalueMed returns a boolean if a field has been set.

### GetP2medpsvalue

`func (o *StockProfileValuationRatio) GetP2medpsvalue() float32`

GetP2medpsvalue returns the P2medpsvalue field if non-nil, zero value otherwise.

### GetP2medpsvalueOk

`func (o *StockProfileValuationRatio) GetP2medpsvalueOk() (*float32, bool)`

GetP2medpsvalueOk returns a tuple with the P2medpsvalue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2medpsvalue

`func (o *StockProfileValuationRatio) SetP2medpsvalue(v float32)`

SetP2medpsvalue sets P2medpsvalue field to given value.

### HasP2medpsvalue

`func (o *StockProfileValuationRatio) HasP2medpsvalue() bool`

HasP2medpsvalue returns a boolean if a field has been set.

### GetP2medpsvalueHigh

`func (o *StockProfileValuationRatio) GetP2medpsvalueHigh() float32`

GetP2medpsvalueHigh returns the P2medpsvalueHigh field if non-nil, zero value otherwise.

### GetP2medpsvalueHighOk

`func (o *StockProfileValuationRatio) GetP2medpsvalueHighOk() (*float32, bool)`

GetP2medpsvalueHighOk returns a tuple with the P2medpsvalueHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2medpsvalueHigh

`func (o *StockProfileValuationRatio) SetP2medpsvalueHigh(v float32)`

SetP2medpsvalueHigh sets P2medpsvalueHigh field to given value.

### HasP2medpsvalueHigh

`func (o *StockProfileValuationRatio) HasP2medpsvalueHigh() bool`

HasP2medpsvalueHigh returns a boolean if a field has been set.

### GetP2medpsvalueLow

`func (o *StockProfileValuationRatio) GetP2medpsvalueLow() float32`

GetP2medpsvalueLow returns the P2medpsvalueLow field if non-nil, zero value otherwise.

### GetP2medpsvalueLowOk

`func (o *StockProfileValuationRatio) GetP2medpsvalueLowOk() (*float32, bool)`

GetP2medpsvalueLowOk returns a tuple with the P2medpsvalueLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2medpsvalueLow

`func (o *StockProfileValuationRatio) SetP2medpsvalueLow(v float32)`

SetP2medpsvalueLow sets P2medpsvalueLow field to given value.

### HasP2medpsvalueLow

`func (o *StockProfileValuationRatio) HasP2medpsvalueLow() bool`

HasP2medpsvalueLow returns a boolean if a field has been set.

### GetP2medpsvalueMed

`func (o *StockProfileValuationRatio) GetP2medpsvalueMed() float32`

GetP2medpsvalueMed returns the P2medpsvalueMed field if non-nil, zero value otherwise.

### GetP2medpsvalueMedOk

`func (o *StockProfileValuationRatio) GetP2medpsvalueMedOk() (*float32, bool)`

GetP2medpsvalueMedOk returns a tuple with the P2medpsvalueMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2medpsvalueMed

`func (o *StockProfileValuationRatio) SetP2medpsvalueMed(v float32)`

SetP2medpsvalueMed sets P2medpsvalueMed field to given value.

### HasP2medpsvalueMed

`func (o *StockProfileValuationRatio) HasP2medpsvalueMed() bool`

HasP2medpsvalueMed returns a boolean if a field has been set.

### GetP2ncav

`func (o *StockProfileValuationRatio) GetP2ncav() float32`

GetP2ncav returns the P2ncav field if non-nil, zero value otherwise.

### GetP2ncavOk

`func (o *StockProfileValuationRatio) GetP2ncavOk() (*float32, bool)`

GetP2ncavOk returns a tuple with the P2ncav field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2ncav

`func (o *StockProfileValuationRatio) SetP2ncav(v float32)`

SetP2ncav sets P2ncav field to given value.

### HasP2ncav

`func (o *StockProfileValuationRatio) HasP2ncav() bool`

HasP2ncav returns a boolean if a field has been set.

### GetP2ncavHigh

`func (o *StockProfileValuationRatio) GetP2ncavHigh() float32`

GetP2ncavHigh returns the P2ncavHigh field if non-nil, zero value otherwise.

### GetP2ncavHighOk

`func (o *StockProfileValuationRatio) GetP2ncavHighOk() (*float32, bool)`

GetP2ncavHighOk returns a tuple with the P2ncavHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2ncavHigh

`func (o *StockProfileValuationRatio) SetP2ncavHigh(v float32)`

SetP2ncavHigh sets P2ncavHigh field to given value.

### HasP2ncavHigh

`func (o *StockProfileValuationRatio) HasP2ncavHigh() bool`

HasP2ncavHigh returns a boolean if a field has been set.

### GetP2ncavLow

`func (o *StockProfileValuationRatio) GetP2ncavLow() float32`

GetP2ncavLow returns the P2ncavLow field if non-nil, zero value otherwise.

### GetP2ncavLowOk

`func (o *StockProfileValuationRatio) GetP2ncavLowOk() (*float32, bool)`

GetP2ncavLowOk returns a tuple with the P2ncavLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2ncavLow

`func (o *StockProfileValuationRatio) SetP2ncavLow(v float32)`

SetP2ncavLow sets P2ncavLow field to given value.

### HasP2ncavLow

`func (o *StockProfileValuationRatio) HasP2ncavLow() bool`

HasP2ncavLow returns a boolean if a field has been set.

### GetP2ncavMed

`func (o *StockProfileValuationRatio) GetP2ncavMed() float32`

GetP2ncavMed returns the P2ncavMed field if non-nil, zero value otherwise.

### GetP2ncavMedOk

`func (o *StockProfileValuationRatio) GetP2ncavMedOk() (*float32, bool)`

GetP2ncavMedOk returns a tuple with the P2ncavMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2ncavMed

`func (o *StockProfileValuationRatio) SetP2ncavMed(v float32)`

SetP2ncavMed sets P2ncavMed field to given value.

### HasP2ncavMed

`func (o *StockProfileValuationRatio) HasP2ncavMed() bool`

HasP2ncavMed returns a boolean if a field has been set.

### GetP2netCash

`func (o *StockProfileValuationRatio) GetP2netCash() float32`

GetP2netCash returns the P2netCash field if non-nil, zero value otherwise.

### GetP2netCashOk

`func (o *StockProfileValuationRatio) GetP2netCashOk() (*float32, bool)`

GetP2netCashOk returns a tuple with the P2netCash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2netCash

`func (o *StockProfileValuationRatio) SetP2netCash(v float32)`

SetP2netCash sets P2netCash field to given value.

### HasP2netCash

`func (o *StockProfileValuationRatio) HasP2netCash() bool`

HasP2netCash returns a boolean if a field has been set.

### GetP2netCashHigh

`func (o *StockProfileValuationRatio) GetP2netCashHigh() float32`

GetP2netCashHigh returns the P2netCashHigh field if non-nil, zero value otherwise.

### GetP2netCashHighOk

`func (o *StockProfileValuationRatio) GetP2netCashHighOk() (*float32, bool)`

GetP2netCashHighOk returns a tuple with the P2netCashHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2netCashHigh

`func (o *StockProfileValuationRatio) SetP2netCashHigh(v float32)`

SetP2netCashHigh sets P2netCashHigh field to given value.

### HasP2netCashHigh

`func (o *StockProfileValuationRatio) HasP2netCashHigh() bool`

HasP2netCashHigh returns a boolean if a field has been set.

### GetP2netCashLow

`func (o *StockProfileValuationRatio) GetP2netCashLow() float32`

GetP2netCashLow returns the P2netCashLow field if non-nil, zero value otherwise.

### GetP2netCashLowOk

`func (o *StockProfileValuationRatio) GetP2netCashLowOk() (*float32, bool)`

GetP2netCashLowOk returns a tuple with the P2netCashLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2netCashLow

`func (o *StockProfileValuationRatio) SetP2netCashLow(v float32)`

SetP2netCashLow sets P2netCashLow field to given value.

### HasP2netCashLow

`func (o *StockProfileValuationRatio) HasP2netCashLow() bool`

HasP2netCashLow returns a boolean if a field has been set.

### GetP2netCashMed

`func (o *StockProfileValuationRatio) GetP2netCashMed() float32`

GetP2netCashMed returns the P2netCashMed field if non-nil, zero value otherwise.

### GetP2netCashMedOk

`func (o *StockProfileValuationRatio) GetP2netCashMedOk() (*float32, bool)`

GetP2netCashMedOk returns a tuple with the P2netCashMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2netCashMed

`func (o *StockProfileValuationRatio) SetP2netCashMed(v float32)`

SetP2netCashMed sets P2netCashMed field to given value.

### HasP2netCashMed

`func (o *StockProfileValuationRatio) HasP2netCashMed() bool`

HasP2netCashMed returns a boolean if a field has been set.

### GetP2nnwc

`func (o *StockProfileValuationRatio) GetP2nnwc() float32`

GetP2nnwc returns the P2nnwc field if non-nil, zero value otherwise.

### GetP2nnwcOk

`func (o *StockProfileValuationRatio) GetP2nnwcOk() (*float32, bool)`

GetP2nnwcOk returns a tuple with the P2nnwc field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2nnwc

`func (o *StockProfileValuationRatio) SetP2nnwc(v float32)`

SetP2nnwc sets P2nnwc field to given value.

### HasP2nnwc

`func (o *StockProfileValuationRatio) HasP2nnwc() bool`

HasP2nnwc returns a boolean if a field has been set.

### GetP2tangibleBook

`func (o *StockProfileValuationRatio) GetP2tangibleBook() float32`

GetP2tangibleBook returns the P2tangibleBook field if non-nil, zero value otherwise.

### GetP2tangibleBookOk

`func (o *StockProfileValuationRatio) GetP2tangibleBookOk() (*float32, bool)`

GetP2tangibleBookOk returns a tuple with the P2tangibleBook field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2tangibleBook

`func (o *StockProfileValuationRatio) SetP2tangibleBook(v float32)`

SetP2tangibleBook sets P2tangibleBook field to given value.

### HasP2tangibleBook

`func (o *StockProfileValuationRatio) HasP2tangibleBook() bool`

HasP2tangibleBook returns a boolean if a field has been set.

### GetP2tangibleBookHigh

`func (o *StockProfileValuationRatio) GetP2tangibleBookHigh() float32`

GetP2tangibleBookHigh returns the P2tangibleBookHigh field if non-nil, zero value otherwise.

### GetP2tangibleBookHighOk

`func (o *StockProfileValuationRatio) GetP2tangibleBookHighOk() (*float32, bool)`

GetP2tangibleBookHighOk returns a tuple with the P2tangibleBookHigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2tangibleBookHigh

`func (o *StockProfileValuationRatio) SetP2tangibleBookHigh(v float32)`

SetP2tangibleBookHigh sets P2tangibleBookHigh field to given value.

### HasP2tangibleBookHigh

`func (o *StockProfileValuationRatio) HasP2tangibleBookHigh() bool`

HasP2tangibleBookHigh returns a boolean if a field has been set.

### GetP2tangibleBookLow

`func (o *StockProfileValuationRatio) GetP2tangibleBookLow() float32`

GetP2tangibleBookLow returns the P2tangibleBookLow field if non-nil, zero value otherwise.

### GetP2tangibleBookLowOk

`func (o *StockProfileValuationRatio) GetP2tangibleBookLowOk() (*float32, bool)`

GetP2tangibleBookLowOk returns a tuple with the P2tangibleBookLow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2tangibleBookLow

`func (o *StockProfileValuationRatio) SetP2tangibleBookLow(v float32)`

SetP2tangibleBookLow sets P2tangibleBookLow field to given value.

### HasP2tangibleBookLow

`func (o *StockProfileValuationRatio) HasP2tangibleBookLow() bool`

HasP2tangibleBookLow returns a boolean if a field has been set.

### GetP2tangibleBookMed

`func (o *StockProfileValuationRatio) GetP2tangibleBookMed() float32`

GetP2tangibleBookMed returns the P2tangibleBookMed field if non-nil, zero value otherwise.

### GetP2tangibleBookMedOk

`func (o *StockProfileValuationRatio) GetP2tangibleBookMedOk() (*float32, bool)`

GetP2tangibleBookMedOk returns a tuple with the P2tangibleBookMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetP2tangibleBookMed

`func (o *StockProfileValuationRatio) SetP2tangibleBookMed(v float32)`

SetP2tangibleBookMed sets P2tangibleBookMed field to given value.

### HasP2tangibleBookMed

`func (o *StockProfileValuationRatio) HasP2tangibleBookMed() bool`

HasP2tangibleBookMed returns a boolean if a field has been set.

### GetPb

`func (o *StockProfileValuationRatio) GetPb() float32`

GetPb returns the Pb field if non-nil, zero value otherwise.

### GetPbOk

`func (o *StockProfileValuationRatio) GetPbOk() (*float32, bool)`

GetPbOk returns a tuple with the Pb field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPb

`func (o *StockProfileValuationRatio) SetPb(v float32)`

SetPb sets Pb field to given value.

### HasPb

`func (o *StockProfileValuationRatio) HasPb() bool`

HasPb returns a boolean if a field has been set.

### GetPbhigh

`func (o *StockProfileValuationRatio) GetPbhigh() float32`

GetPbhigh returns the Pbhigh field if non-nil, zero value otherwise.

### GetPbhighOk

`func (o *StockProfileValuationRatio) GetPbhighOk() (*float32, bool)`

GetPbhighOk returns a tuple with the Pbhigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPbhigh

`func (o *StockProfileValuationRatio) SetPbhigh(v float32)`

SetPbhigh sets Pbhigh field to given value.

### HasPbhigh

`func (o *StockProfileValuationRatio) HasPbhigh() bool`

HasPbhigh returns a boolean if a field has been set.

### GetPblow

`func (o *StockProfileValuationRatio) GetPblow() float32`

GetPblow returns the Pblow field if non-nil, zero value otherwise.

### GetPblowOk

`func (o *StockProfileValuationRatio) GetPblowOk() (*float32, bool)`

GetPblowOk returns a tuple with the Pblow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPblow

`func (o *StockProfileValuationRatio) SetPblow(v float32)`

SetPblow sets Pblow field to given value.

### HasPblow

`func (o *StockProfileValuationRatio) HasPblow() bool`

HasPblow returns a boolean if a field has been set.

### GetPbmed

`func (o *StockProfileValuationRatio) GetPbmed() float32`

GetPbmed returns the Pbmed field if non-nil, zero value otherwise.

### GetPbmedOk

`func (o *StockProfileValuationRatio) GetPbmedOk() (*float32, bool)`

GetPbmedOk returns a tuple with the Pbmed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPbmed

`func (o *StockProfileValuationRatio) SetPbmed(v float32)`

SetPbmed sets Pbmed field to given value.

### HasPbmed

`func (o *StockProfileValuationRatio) HasPbmed() bool`

HasPbmed returns a boolean if a field has been set.

### GetPe

`func (o *StockProfileValuationRatio) GetPe() float32`

GetPe returns the Pe field if non-nil, zero value otherwise.

### GetPeOk

`func (o *StockProfileValuationRatio) GetPeOk() (*float32, bool)`

GetPeOk returns a tuple with the Pe field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPe

`func (o *StockProfileValuationRatio) SetPe(v float32)`

SetPe sets Pe field to given value.

### HasPe

`func (o *StockProfileValuationRatio) HasPe() bool`

HasPe returns a boolean if a field has been set.

### GetPebitMed

`func (o *StockProfileValuationRatio) GetPebitMed() float32`

GetPebitMed returns the PebitMed field if non-nil, zero value otherwise.

### GetPebitMedOk

`func (o *StockProfileValuationRatio) GetPebitMedOk() (*float32, bool)`

GetPebitMedOk returns a tuple with the PebitMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPebitMed

`func (o *StockProfileValuationRatio) SetPebitMed(v float32)`

SetPebitMed sets PebitMed field to given value.

### HasPebitMed

`func (o *StockProfileValuationRatio) HasPebitMed() bool`

HasPebitMed returns a boolean if a field has been set.

### GetPebitdaMed

`func (o *StockProfileValuationRatio) GetPebitdaMed() float32`

GetPebitdaMed returns the PebitdaMed field if non-nil, zero value otherwise.

### GetPebitdaMedOk

`func (o *StockProfileValuationRatio) GetPebitdaMedOk() (*float32, bool)`

GetPebitdaMedOk returns a tuple with the PebitdaMed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPebitdaMed

`func (o *StockProfileValuationRatio) SetPebitdaMed(v float32)`

SetPebitdaMed sets PebitdaMed field to given value.

### HasPebitdaMed

`func (o *StockProfileValuationRatio) HasPebitdaMed() bool`

HasPebitdaMed returns a boolean if a field has been set.

### GetPeg

`func (o *StockProfileValuationRatio) GetPeg() float32`

GetPeg returns the Peg field if non-nil, zero value otherwise.

### GetPegOk

`func (o *StockProfileValuationRatio) GetPegOk() (*float32, bool)`

GetPegOk returns a tuple with the Peg field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPeg

`func (o *StockProfileValuationRatio) SetPeg(v float32)`

SetPeg sets Peg field to given value.

### HasPeg

`func (o *StockProfileValuationRatio) HasPeg() bool`

HasPeg returns a boolean if a field has been set.

### GetPeghigh

`func (o *StockProfileValuationRatio) GetPeghigh() float32`

GetPeghigh returns the Peghigh field if non-nil, zero value otherwise.

### GetPeghighOk

`func (o *StockProfileValuationRatio) GetPeghighOk() (*float32, bool)`

GetPeghighOk returns a tuple with the Peghigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPeghigh

`func (o *StockProfileValuationRatio) SetPeghigh(v float32)`

SetPeghigh sets Peghigh field to given value.

### HasPeghigh

`func (o *StockProfileValuationRatio) HasPeghigh() bool`

HasPeghigh returns a boolean if a field has been set.

### GetPeglow

`func (o *StockProfileValuationRatio) GetPeglow() float32`

GetPeglow returns the Peglow field if non-nil, zero value otherwise.

### GetPeglowOk

`func (o *StockProfileValuationRatio) GetPeglowOk() (*float32, bool)`

GetPeglowOk returns a tuple with the Peglow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPeglow

`func (o *StockProfileValuationRatio) SetPeglow(v float32)`

SetPeglow sets Peglow field to given value.

### HasPeglow

`func (o *StockProfileValuationRatio) HasPeglow() bool`

HasPeglow returns a boolean if a field has been set.

### GetPegmed

`func (o *StockProfileValuationRatio) GetPegmed() float32`

GetPegmed returns the Pegmed field if non-nil, zero value otherwise.

### GetPegmedOk

`func (o *StockProfileValuationRatio) GetPegmedOk() (*float32, bool)`

GetPegmedOk returns a tuple with the Pegmed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPegmed

`func (o *StockProfileValuationRatio) SetPegmed(v float32)`

SetPegmed sets Pegmed field to given value.

### HasPegmed

`func (o *StockProfileValuationRatio) HasPegmed() bool`

HasPegmed returns a boolean if a field has been set.

### GetPenri

`func (o *StockProfileValuationRatio) GetPenri() float32`

GetPenri returns the Penri field if non-nil, zero value otherwise.

### GetPenriOk

`func (o *StockProfileValuationRatio) GetPenriOk() (*float32, bool)`

GetPenriOk returns a tuple with the Penri field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPenri

`func (o *StockProfileValuationRatio) SetPenri(v float32)`

SetPenri sets Penri field to given value.

### HasPenri

`func (o *StockProfileValuationRatio) HasPenri() bool`

HasPenri returns a boolean if a field has been set.

### GetPenrihigh

`func (o *StockProfileValuationRatio) GetPenrihigh() float32`

GetPenrihigh returns the Penrihigh field if non-nil, zero value otherwise.

### GetPenrihighOk

`func (o *StockProfileValuationRatio) GetPenrihighOk() (*float32, bool)`

GetPenrihighOk returns a tuple with the Penrihigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPenrihigh

`func (o *StockProfileValuationRatio) SetPenrihigh(v float32)`

SetPenrihigh sets Penrihigh field to given value.

### HasPenrihigh

`func (o *StockProfileValuationRatio) HasPenrihigh() bool`

HasPenrihigh returns a boolean if a field has been set.

### GetPenrilow

`func (o *StockProfileValuationRatio) GetPenrilow() float32`

GetPenrilow returns the Penrilow field if non-nil, zero value otherwise.

### GetPenrilowOk

`func (o *StockProfileValuationRatio) GetPenrilowOk() (*float32, bool)`

GetPenrilowOk returns a tuple with the Penrilow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPenrilow

`func (o *StockProfileValuationRatio) SetPenrilow(v float32)`

SetPenrilow sets Penrilow field to given value.

### HasPenrilow

`func (o *StockProfileValuationRatio) HasPenrilow() bool`

HasPenrilow returns a boolean if a field has been set.

### GetPenrimed

`func (o *StockProfileValuationRatio) GetPenrimed() float32`

GetPenrimed returns the Penrimed field if non-nil, zero value otherwise.

### GetPenrimedOk

`func (o *StockProfileValuationRatio) GetPenrimedOk() (*float32, bool)`

GetPenrimedOk returns a tuple with the Penrimed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPenrimed

`func (o *StockProfileValuationRatio) SetPenrimed(v float32)`

SetPenrimed sets Penrimed field to given value.

### HasPenrimed

`func (o *StockProfileValuationRatio) HasPenrimed() bool`

HasPenrimed returns a boolean if a field has been set.

### GetPettmhigh

`func (o *StockProfileValuationRatio) GetPettmhigh() float32`

GetPettmhigh returns the Pettmhigh field if non-nil, zero value otherwise.

### GetPettmhighOk

`func (o *StockProfileValuationRatio) GetPettmhighOk() (*float32, bool)`

GetPettmhighOk returns a tuple with the Pettmhigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPettmhigh

`func (o *StockProfileValuationRatio) SetPettmhigh(v float32)`

SetPettmhigh sets Pettmhigh field to given value.

### HasPettmhigh

`func (o *StockProfileValuationRatio) HasPettmhigh() bool`

HasPettmhigh returns a boolean if a field has been set.

### GetPettmlow

`func (o *StockProfileValuationRatio) GetPettmlow() float32`

GetPettmlow returns the Pettmlow field if non-nil, zero value otherwise.

### GetPettmlowOk

`func (o *StockProfileValuationRatio) GetPettmlowOk() (*float32, bool)`

GetPettmlowOk returns a tuple with the Pettmlow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPettmlow

`func (o *StockProfileValuationRatio) SetPettmlow(v float32)`

SetPettmlow sets Pettmlow field to given value.

### HasPettmlow

`func (o *StockProfileValuationRatio) HasPettmlow() bool`

HasPettmlow returns a boolean if a field has been set.

### GetPettmmed

`func (o *StockProfileValuationRatio) GetPettmmed() float32`

GetPettmmed returns the Pettmmed field if non-nil, zero value otherwise.

### GetPettmmedOk

`func (o *StockProfileValuationRatio) GetPettmmedOk() (*float32, bool)`

GetPettmmedOk returns a tuple with the Pettmmed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPettmmed

`func (o *StockProfileValuationRatio) SetPettmmed(v float32)`

SetPettmmed sets Pettmmed field to given value.

### HasPettmmed

`func (o *StockProfileValuationRatio) HasPettmmed() bool`

HasPettmmed returns a boolean if a field has been set.

### GetPfcf

`func (o *StockProfileValuationRatio) GetPfcf() float32`

GetPfcf returns the Pfcf field if non-nil, zero value otherwise.

### GetPfcfOk

`func (o *StockProfileValuationRatio) GetPfcfOk() (*float32, bool)`

GetPfcfOk returns a tuple with the Pfcf field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPfcf

`func (o *StockProfileValuationRatio) SetPfcf(v float32)`

SetPfcf sets Pfcf field to given value.

### HasPfcf

`func (o *StockProfileValuationRatio) HasPfcf() bool`

HasPfcf returns a boolean if a field has been set.

### GetPfcfhigh

`func (o *StockProfileValuationRatio) GetPfcfhigh() float32`

GetPfcfhigh returns the Pfcfhigh field if non-nil, zero value otherwise.

### GetPfcfhighOk

`func (o *StockProfileValuationRatio) GetPfcfhighOk() (*float32, bool)`

GetPfcfhighOk returns a tuple with the Pfcfhigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPfcfhigh

`func (o *StockProfileValuationRatio) SetPfcfhigh(v float32)`

SetPfcfhigh sets Pfcfhigh field to given value.

### HasPfcfhigh

`func (o *StockProfileValuationRatio) HasPfcfhigh() bool`

HasPfcfhigh returns a boolean if a field has been set.

### GetPfcflow

`func (o *StockProfileValuationRatio) GetPfcflow() float32`

GetPfcflow returns the Pfcflow field if non-nil, zero value otherwise.

### GetPfcflowOk

`func (o *StockProfileValuationRatio) GetPfcflowOk() (*float32, bool)`

GetPfcflowOk returns a tuple with the Pfcflow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPfcflow

`func (o *StockProfileValuationRatio) SetPfcflow(v float32)`

SetPfcflow sets Pfcflow field to given value.

### HasPfcflow

`func (o *StockProfileValuationRatio) HasPfcflow() bool`

HasPfcflow returns a boolean if a field has been set.

### GetPfcfmed

`func (o *StockProfileValuationRatio) GetPfcfmed() float32`

GetPfcfmed returns the Pfcfmed field if non-nil, zero value otherwise.

### GetPfcfmedOk

`func (o *StockProfileValuationRatio) GetPfcfmedOk() (*float32, bool)`

GetPfcfmedOk returns a tuple with the Pfcfmed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPfcfmed

`func (o *StockProfileValuationRatio) SetPfcfmed(v float32)`

SetPfcfmed sets Pfcfmed field to given value.

### HasPfcfmed

`func (o *StockProfileValuationRatio) HasPfcfmed() bool`

HasPfcfmed returns a boolean if a field has been set.

### GetPocf

`func (o *StockProfileValuationRatio) GetPocf() float32`

GetPocf returns the Pocf field if non-nil, zero value otherwise.

### GetPocfOk

`func (o *StockProfileValuationRatio) GetPocfOk() (*float32, bool)`

GetPocfOk returns a tuple with the Pocf field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPocf

`func (o *StockProfileValuationRatio) SetPocf(v float32)`

SetPocf sets Pocf field to given value.

### HasPocf

`func (o *StockProfileValuationRatio) HasPocf() bool`

HasPocf returns a boolean if a field has been set.

### GetPocfhigh

`func (o *StockProfileValuationRatio) GetPocfhigh() float32`

GetPocfhigh returns the Pocfhigh field if non-nil, zero value otherwise.

### GetPocfhighOk

`func (o *StockProfileValuationRatio) GetPocfhighOk() (*float32, bool)`

GetPocfhighOk returns a tuple with the Pocfhigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPocfhigh

`func (o *StockProfileValuationRatio) SetPocfhigh(v float32)`

SetPocfhigh sets Pocfhigh field to given value.

### HasPocfhigh

`func (o *StockProfileValuationRatio) HasPocfhigh() bool`

HasPocfhigh returns a boolean if a field has been set.

### GetPocflow

`func (o *StockProfileValuationRatio) GetPocflow() float32`

GetPocflow returns the Pocflow field if non-nil, zero value otherwise.

### GetPocflowOk

`func (o *StockProfileValuationRatio) GetPocflowOk() (*float32, bool)`

GetPocflowOk returns a tuple with the Pocflow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPocflow

`func (o *StockProfileValuationRatio) SetPocflow(v float32)`

SetPocflow sets Pocflow field to given value.

### HasPocflow

`func (o *StockProfileValuationRatio) HasPocflow() bool`

HasPocflow returns a boolean if a field has been set.

### GetPocfmed

`func (o *StockProfileValuationRatio) GetPocfmed() float32`

GetPocfmed returns the Pocfmed field if non-nil, zero value otherwise.

### GetPocfmedOk

`func (o *StockProfileValuationRatio) GetPocfmedOk() (*float32, bool)`

GetPocfmedOk returns a tuple with the Pocfmed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPocfmed

`func (o *StockProfileValuationRatio) SetPocfmed(v float32)`

SetPocfmed sets Pocfmed field to given value.

### HasPocfmed

`func (o *StockProfileValuationRatio) HasPocfmed() bool`

HasPocfmed returns a boolean if a field has been set.

### GetPs

`func (o *StockProfileValuationRatio) GetPs() float32`

GetPs returns the Ps field if non-nil, zero value otherwise.

### GetPsOk

`func (o *StockProfileValuationRatio) GetPsOk() (*float32, bool)`

GetPsOk returns a tuple with the Ps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPs

`func (o *StockProfileValuationRatio) SetPs(v float32)`

SetPs sets Ps field to given value.

### HasPs

`func (o *StockProfileValuationRatio) HasPs() bool`

HasPs returns a boolean if a field has been set.

### GetPshigh

`func (o *StockProfileValuationRatio) GetPshigh() float32`

GetPshigh returns the Pshigh field if non-nil, zero value otherwise.

### GetPshighOk

`func (o *StockProfileValuationRatio) GetPshighOk() (*float32, bool)`

GetPshighOk returns a tuple with the Pshigh field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPshigh

`func (o *StockProfileValuationRatio) SetPshigh(v float32)`

SetPshigh sets Pshigh field to given value.

### HasPshigh

`func (o *StockProfileValuationRatio) HasPshigh() bool`

HasPshigh returns a boolean if a field has been set.

### GetPslow

`func (o *StockProfileValuationRatio) GetPslow() float32`

GetPslow returns the Pslow field if non-nil, zero value otherwise.

### GetPslowOk

`func (o *StockProfileValuationRatio) GetPslowOk() (*float32, bool)`

GetPslowOk returns a tuple with the Pslow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPslow

`func (o *StockProfileValuationRatio) SetPslow(v float32)`

SetPslow sets Pslow field to given value.

### HasPslow

`func (o *StockProfileValuationRatio) HasPslow() bool`

HasPslow returns a boolean if a field has been set.

### GetPsmed

`func (o *StockProfileValuationRatio) GetPsmed() float32`

GetPsmed returns the Psmed field if non-nil, zero value otherwise.

### GetPsmedOk

`func (o *StockProfileValuationRatio) GetPsmedOk() (*float32, bool)`

GetPsmedOk returns a tuple with the Psmed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPsmed

`func (o *StockProfileValuationRatio) SetPsmed(v float32)`

SetPsmed sets Psmed field to given value.

### HasPsmed

`func (o *StockProfileValuationRatio) HasPsmed() bool`

HasPsmed returns a boolean if a field has been set.

### GetTangibleBook

`func (o *StockProfileValuationRatio) GetTangibleBook() float32`

GetTangibleBook returns the TangibleBook field if non-nil, zero value otherwise.

### GetTangibleBookOk

`func (o *StockProfileValuationRatio) GetTangibleBookOk() (*float32, bool)`

GetTangibleBookOk returns a tuple with the TangibleBook field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTangibleBook

`func (o *StockProfileValuationRatio) SetTangibleBook(v float32)`

SetTangibleBook sets TangibleBook field to given value.

### HasTangibleBook

`func (o *StockProfileValuationRatio) HasTangibleBook() bool`

HasTangibleBook returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


