

# StockRankingsGuruFocusRankings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gfScore** | **BigDecimal** | GF Score is a stock performance ranking system developed by GuruFocus using five aspects of valuation. |  [optional] |
|**gfScoreHigh** | **BigDecimal** |  |  [optional] |
|**gfScoreLow** | **BigDecimal** |  |  [optional] |
|**gfScoreMed** | **BigDecimal** |  |  [optional] |
|**gfScoreMed5y** | **BigDecimal** |  |  [optional] |
|**gfValue** | **BigDecimal** |  |  [optional] |
|**gfValueEst** | **BigDecimal** | The estimated GF value at the end of the fiscal year immediately following the current fiscal year. FY1 represents the fiscal year immediately following the current fiscal year. |  [optional] |
|**gfValueEst2nd** | **BigDecimal** | The estimated GF value at the end of the second fiscal year after the current fiscal year. FY2 represents the second fiscal year after the current fiscal year. |  [optional] |
|**gfValueEst3rd** | **BigDecimal** | The estimated GF value at the end of the third fiscal year after the current fiscal year. FY3 represents the third fiscal year after the current fiscal year. |  [optional] |
|**gfValuePctChange** | **BigDecimal** | The percentage change in a company&#39;s GF value from the previous month. |  [optional] |
|**marginGfValue** | **BigDecimal** | The difference between current price and intrinsic value based on GF Value model. |  [optional] |
|**p2gfValue** | **BigDecimal** |  |  [optional] |
|**p2gfValueEst** | **BigDecimal** |  |  [optional] |
|**p2gfValueHigh** | **BigDecimal** |  |  [optional] |
|**p2gfValueLow** | **BigDecimal** |  |  [optional] |
|**p2gfValueMed** | **BigDecimal** |  |  [optional] |
|**predictability** | **String** | &lt;table class&#x3D;\&quot;normal-table\&quot;&gt;         &lt;thead&gt;           &lt;tr&gt;             &lt;th&gt;Rank&lt;/th&gt;             &lt;th&gt;Average Gain&lt;/th&gt;             &lt;th&gt;% of Stocks that are in still loss if held for 10yrs&lt;/th&gt;           &lt;/tr&gt;         &lt;/thead&gt;         &lt;tbody&gt;           &lt;tr&gt;             &lt;td&gt;               2 Star             &lt;/td&gt;             &lt;td&gt;6% per year&lt;/td&gt;             &lt;td&gt;16%&lt;/td&gt;           &lt;/tr&gt;            &lt;tr&gt;             &lt;td&gt;               2.5 Star             &lt;/td&gt;             &lt;td&gt;7.3% per year&lt;/td&gt;             &lt;td&gt;18%&lt;/td&gt;           &lt;/tr&gt;            &lt;tr&gt;             &lt;td&gt;               3 Star             &lt;/td&gt;             &lt;td&gt;8.2% per year&lt;/td&gt;             &lt;td&gt;11%&lt;/td&gt;           &lt;/tr&gt;            &lt;tr&gt;             &lt;td&gt;               3.5 Star             &lt;/td&gt;             &lt;td&gt;9.3% per year&lt;/td&gt;             &lt;td&gt;9%&lt;/td&gt;           &lt;/tr&gt;            &lt;tr&gt;             &lt;td&gt;               4 Star             &lt;/td&gt;             &lt;td&gt;9.8% per year&lt;/td&gt;             &lt;td&gt;8%&lt;/td&gt;           &lt;/tr&gt;            &lt;tr&gt;             &lt;td&gt;               4.5 Star             &lt;/td&gt;             &lt;td&gt;10.6% per year&lt;/td&gt;             &lt;td&gt;10%&lt;/td&gt;           &lt;/tr&gt;            &lt;tr&gt;             &lt;td&gt;               5 Star             &lt;/td&gt;             &lt;td&gt;12.1% per year&lt;/td&gt;             &lt;td&gt;3%&lt;/td&gt;           &lt;/tr&gt;         &lt;/tbody&gt;       &lt;/table&gt; |  [optional] |
|**rankBalancesheet** | **BigDecimal** | Financial Strength is a measure of a company&#39;s overall financial health, rated on a scale of 1 to 10. It evaluates key factors such as interest coverage, debt-to-revenue ratio, and the Altman Z-Score, among others. &lt;br&gt;A higher score indicates a stronger financial position, with companies rated 7 or above considered financially stable and unlikely to face distress. Conversely, a score of 3 or below suggests potential financial difficulties, indicating a higher risk of distress. |  [optional] |
|**rankBalancesheetHigh** | **BigDecimal** |  |  [optional] |
|**rankBalancesheetLow** | **BigDecimal** |  |  [optional] |
|**rankBalancesheetMed** | **BigDecimal** |  |  [optional] |
|**rankGfValue** | **BigDecimal** | GF Value Rank evaluates the exclusive GuruFocus valuation and performance of a stock, rated on a scale from 1 to 10. It is primarily determined by the price-to-GF value ratio and backtesting results. Stocks in the third lowest percentile of valuation receive the highest rank of 10. &lt;br&gt; A higher score indicates a stock with a relatively low valuation and substantial potential for outperformance. Conversely, a lower score often reflects stocks that are either highly overvalued or deeply undervalued, both of which tend to underperform. |  [optional] |
|**rankGfValueHigh** | **BigDecimal** |  |  [optional] |
|**rankGfValueLow** | **BigDecimal** |  |  [optional] |
|**rankGrowth** | **BigDecimal** | Growth Rank measures the growth of a company in terms of its revenue and profitability, rated on a scale from 1 to 10. It considers key factors such as revenue and EBITDA growth rates, as well as the consistency and predictability of revenue. &lt;br&gt; A higher score reflects a greater ability to drive business growth, with companies considered to have strong and sustainable expansion potential. Conversely, a lower score indicates challenges in achieving consistent growth and scalability. |  [optional] |
|**rankGrowthHigh** | **BigDecimal** |  |  [optional] |
|**rankGrowthLow** | **BigDecimal** |  |  [optional] |
|**rankGrowthMed** | **BigDecimal** |  |  [optional] |
|**rankMomentum** | **BigDecimal** | Momentum Rank measures the strength and persistence of a stock&#39;s price movement over time, rated on a scale of 1 to 10. It incorporates the standardized momentum ratio and several other performance metrics. Stocks in the 70th percentile of the momentum ratio receive the highest rank of 10, based on the backtesting result of the stock price performance and the momentum ratio. &lt;br&gt; A higher score reflects strong price momentum and indicates greater potential for superior performance. Conversely, a lower score indicates that momentum is either too high or too low, and stocks tend to underperform. |  [optional] |
|**rankMomentumHigh** | **BigDecimal** |  |  [optional] |
|**rankMomentumLow** | **BigDecimal** |  |  [optional] |
|**rankMomentumMed** | **BigDecimal** |  |  [optional] |
|**rankProfitability** | **BigDecimal** | Profitability Rank measures a company&#39;s profitability and financial stability, rated on a scale of 1 to 10. It takes into account critical factors such as operating margin and its growth, Piotroski F-Score, predictability, and revenue growth, among others. &lt;br&gt; A higher score indicates superior profitability, with companies rated 7 or above considered to have more robust and sustainable profit generation. Conversely, a score of 3 or lower suggests challenges in generating consistent profits. |  [optional] |
|**rankProfitabilityHigh** | **BigDecimal** |  |  [optional] |
|**rankProfitabilityLow** | **BigDecimal** |  |  [optional] |
|**rankProfitabilityMed** | **BigDecimal** |  |  [optional] |



