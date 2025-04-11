# # GuruTransaction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **string** | The transaction type: add, buy, reduce, sold out | [optional]
**change** | **float** |  | [optional]
**class** | **string** | A unique identifier that describes the stock ticker&#39;s share class. Examples: Class A, Class C, ADR | [optional]
**comment** | **string** |  | [optional]
**company_name** | **string** |  | [optional]
**exchange** | **string** | The company&#39;s stock exchange. Example: NAS for Apple. | [optional]
**impact** | **float** | The ratio of the dollar value of the transaction relative to the total value of the portfolio. | [optional]
**industry_code** | **float** |  | [optional]
**portdate** | **string** | If the date is the end of quarters, the trades are made during the quarter ended on the dates. Otherwise, the dates are the estimated trade dates. | [optional]
**position** | **float** |  | [optional]
**price_avg** | **float** |  | [optional]
**price_max** | **float** | For a guru trade, the highest trading price over a specific quarter | [optional]
**price_min** | **float** | For a guru trade, the minimum trading price over a specific quarter | [optional]
**share_change** | **float** |  | [optional]
**shares** | **float** | Outstanding shares refer to a company&#39;s stock currently held by all its shareholders, including share blocks held by institutional investors and restricted shares owned by the company&#39;s officers and insiders. | [optional]
**shares_outstanding** | **float** | &lt;p&gt;{{Cash_Flow_from_Others}} may include {{ChangeInWorkingCapital}}. These are cash differences caused by the {{ChangeInInventory}}, {{AccountsPayable}}, {{Accts_Rec}} etc. For instance, if a company pays its suppliers slower, its cash position will build up faster. If a company receives payments from its customers slower, its {{Accts_Rec}} will rise, and its cash position will grow more slowly (or even shrink).&lt;/p&gt; | [optional]
**split_factor** | **float** |  | [optional]
**stockid** | **string** | A unique identifier for the stock | [optional]
**symbol** | **string** | The company&#39;s stock ticker symbol | [optional]
**value** | **float** |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
