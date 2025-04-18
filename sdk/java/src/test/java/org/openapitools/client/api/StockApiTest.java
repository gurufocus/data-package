/*
 * Gurufocus Data Package API
 * API for accessing Gurufocus data packages, please go to [https://www.gurufocus.com/user/me?tab=account&subtab=api-token](https://www.gurufocus.com/user/me?tab=account&subtab=api-token) to view or generate authorization keys.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.DownloadListGet403Response;
import org.openapitools.client.model.DownloadListGet404Response;
import org.openapitools.client.model.DownloadListGet500Response;
import org.openapitools.client.model.StocksSymbolFundamentalsGet200Response;
import org.openapitools.client.model.StocksSymbolProfileGet200Response;
import org.openapitools.client.model.StocksSymbolRankingsGet200Response;
import org.openapitools.client.model.StocksSymbolSegmentGet200Response;
import org.openapitools.client.model.StocksSymbolValuationsGet200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StockApi
 */
@Disabled
public class StockApiTest {

    private final StockApi api = new StockApi();

    /**
     * Complete historical financial statements providing the data needed for in-depth analysis, valuation modeling, and building investment research platforms.
     *
     * &lt;ul&gt; &lt;li&gt;Income Statement&lt;/li&gt; &lt;li&gt;Balance Sheet&lt;/li&gt; &lt;li&gt;Cash Flow Statement&lt;/li&gt; &lt;/ul&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void stocksSymbolFundamentalsGetTest() throws ApiException {
        String symbol = null;
        StocksSymbolFundamentalsGet200Response response = api.stocksSymbolFundamentalsGet(symbol);
        // TODO: test validations
    }

    /**
     * Access essential company details and current valuation metrics to power investment platforms, populate company directories, or enhance financial analysis tools with up-to-date market data.
     *
     * &lt;ul&gt; &lt;li&gt;Basic company info &lt;p&gt;Name, description, address, etc.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;Current stock price&lt;/li&gt; &lt;li&gt;Current key valuation ratios &lt;p&gt;P/E, P/B, P/S, etc.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;And more!&lt;/li&gt; &lt;/ul&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void stocksSymbolProfileGetTest() throws ApiException {
        String symbol = null;
        StocksSymbolProfileGet200Response response = api.stocksSymbolProfileGet(symbol);
        // TODO: test validations
    }

    /**
     * Proprietary scoring and ranking systems that assess company quality, valuation, and performance for powering data-driven investment platforms.
     *
     * &lt;ul&gt; &lt;li&gt;GF Score&lt;/li&gt; &lt;li&gt;GF Value&lt;/li&gt; &lt;li&gt;Predictability Rank&lt;/li&gt; &lt;li&gt;Financial Strength&lt;/li&gt; &lt;li&gt;Profitability Rank&lt;/li&gt; &lt;li&gt;and more!&lt;/li&gt; &lt;/ul&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void stocksSymbolRankingsGetTest() throws ApiException {
        String symbol = null;
        StocksSymbolRankingsGet200Response response = api.stocksSymbolRankingsGet(symbol);
        // TODO: test validations
    }

    /**
     * Gain insights into a company&#39;s revenue breakdown by product and geography to build detailed financial visualizations, enhance stock research platforms, or create data-driven market analysis tools
     *
     * &lt;ul&gt; &lt;li&gt;Geographic segment data&lt;/li&gt; &lt;li&gt;Product and service segment data&lt;/li&gt; &lt;/ul&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void stocksSymbolSegmentGetTest() throws ApiException {
        String symbol = null;
        StocksSymbolSegmentGet200Response response = api.stocksSymbolSegmentGet(symbol);
        // TODO: test validations
    }

    /**
     * A deep dataset of historical valuation metrics to support investors and entrepreneurs in the development of data-driven investment platforms.
     *
     * &lt;ul&gt; &lt;li&gt;P/E Ratios&lt;/li&gt; &lt;li&gt;P/B Ratios&lt;/li&gt; &lt;li&gt;Dividend Yields&lt;/li&gt; &lt;li&gt;F-Scores&lt;/li&gt; &lt;li&gt;Z-Scores&lt;/li&gt; &lt;li&gt;And more!&lt;/li&gt; &lt;/ul&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void stocksSymbolValuationsGetTest() throws ApiException {
        String symbol = null;
        StocksSymbolValuationsGet200Response response = api.stocksSymbolValuationsGet(symbol);
        // TODO: test validations
    }

}
