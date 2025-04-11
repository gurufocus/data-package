

# EtfEtfFundamental


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mktcap** | **BigDecimal** | Market cap is the short version of market capitalization. It is the total market value to buy the whole company. It is equal to the share price times the number of shares outstanding. |  [optional] |
|**pb** | **BigDecimal** | Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio. |  [optional] |
|**pbhigh** | **BigDecimal** | Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio. |  [optional] |
|**pblow** | **BigDecimal** | Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio. |  [optional] |
|**pbmed** | **BigDecimal** | Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio. |  [optional] |
|**pe** | **BigDecimal** | &lt;p&gt;The PE ratio, or Price-to-Earnings ratio, is the most widely used metric in the valuation of stocks. It is calculated as:  &lt;b&gt;PE Ratio &#x3D; Share Price / {{eps_diluated}}&lt;/b&gt;.   It can also be calculated from the numbers for the whole company:  &lt;b&gt;PE Ratio &#x3D; {{mktcap}} / {{net_income}}&lt;/b&gt;.&lt;/p&gt;  &lt;p&gt;There are at least three kinds of PE ratios used among different investors. They are Trailing Twelve Month PE Ratio({{pettm}}), {{forwardPE}}, and {{penri}}. A new PE ratio based on inflation-adjusted normalized PE ratio is called {{ShillerPE}}, after Yale professor Robert Shiller.&lt;/p&gt;  &lt;p&gt;In the calculation of {{pettm}}, the earnings per share used are the earnings per share over the past 12 months({{ttm_eps}}). For {{forwardPE}}, the earnings are the expected earnings for the next twelve months({{forward_eps}}). In the case of {{penri}}, the reported earnings less the non-recurring items are used({{eps_nri}}).For the {{ShillerPE}}, the earnings of the past 10 years are inflation-adjusted and averaged. Since {{ShillerPE}} looks at the average over the last 10 years, it is also called PE10.&lt;/p&gt; |  [optional] |
|**pettmhigh** | **BigDecimal** | The highest price-earnings ratio over the past 10 years |  [optional] |
|**pettmlow** | **BigDecimal** | The lowest price-earnings ratio over the past 10 years |  [optional] |
|**pettmmed** | **BigDecimal** | The median price-earnings ratio over the past 10 years |  [optional] |
|**shares** | **BigDecimal** | Outstanding shares refer to a company&#39;s stock currently held by all its shareholders, including share blocks held by institutional investors and restricted shares owned by the company&#39;s officers and insiders. |  [optional] |



