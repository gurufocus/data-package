

# GuruTransaction

Guru transaction

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | **String** | The transaction type: add, buy, reduce, sold out |  [optional] |
|**change** | **BigDecimal** |  |  [optional] |
|**propertyClass** | **String** | A unique identifier that describes the stock ticker&#39;s share class. Examples: Class A, Class C, ADR |  [optional] |
|**comment** | **String** |  |  [optional] |
|**companyName** | **String** |  |  [optional] |
|**exchange** | **String** | The company&#39;s stock exchange. Example: NAS for Apple. |  [optional] |
|**impact** | **BigDecimal** | The ratio of the dollar value of the transaction relative to the total value of the portfolio. |  [optional] |
|**industryCode** | **BigDecimal** |  |  [optional] |
|**portdate** | **String** | If the date is the end of quarters, the trades are made during the quarter ended on the dates. Otherwise, the dates are the estimated trade dates. |  [optional] |
|**position** | **BigDecimal** |  |  [optional] |
|**priceAvg** | **BigDecimal** |  |  [optional] |
|**priceMax** | **BigDecimal** | For a guru trade, the highest trading price over a specific quarter |  [optional] |
|**priceMin** | **BigDecimal** | For a guru trade, the minimum trading price over a specific quarter |  [optional] |
|**shareChange** | **BigDecimal** |  |  [optional] |
|**shares** | **BigDecimal** | Outstanding shares refer to a company&#39;s stock currently held by all its shareholders, including share blocks held by institutional investors and restricted shares owned by the company&#39;s officers and insiders. |  [optional] |
|**sharesOutstanding** | **BigDecimal** | &lt;p&gt;{{Cash_Flow_from_Others}} may include {{ChangeInWorkingCapital}}. These are cash differences caused by the {{ChangeInInventory}}, {{AccountsPayable}}, {{Accts_Rec}} etc. For instance, if a company pays its suppliers slower, its cash position will build up faster. If a company receives payments from its customers slower, its {{Accts_Rec}} will rise, and its cash position will grow more slowly (or even shrink).&lt;/p&gt; |  [optional] |
|**splitFactor** | **BigDecimal** |  |  [optional] |
|**stockid** | **String** | A unique identifier for the stock |  [optional] |
|**symbol** | **String** | The company&#39;s stock ticker symbol |  [optional] |
|**value** | **BigDecimal** |  |  [optional] |



