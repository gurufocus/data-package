# OpenAPIClient-php

API for accessing Gurufocus data packages, please go to [https://www.gurufocus.com/user/me?tab=account&subtab=api-token](https://www.gurufocus.com/user/me?tab=account&subtab=api-token) to view or generate authorization keys.


## Installation & Usage

### Requirements

PHP 7.4 and later.
Should also work with PHP 8.0.

### Composer

To install the bindings via [Composer](https://getcomposer.org/), add the following to `composer.json`:

```json
{
  "repositories": [
    {
      "type": "vcs",
      "url": "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
    }
  ],
  "require": {
    "GIT_USER_ID/GIT_REPO_ID": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
<?php
require_once('/path/to/OpenAPIClient-php/vendor/autoload.php');
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



// Configure API key authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\DataPackagesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = ebe74eed-6a33-4988-b94f-c7afb6b3e919; // string | Data package ID

try {
    $result = $apiInstance->downloadIdGet($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataPackagesApi->downloadIdGet: ', $e->getMessage(), PHP_EOL;
}

```

## API Endpoints

All URIs are relative to *https://api.gurufocus.com/data*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DataPackagesApi* | [**downloadIdGet**](docs/Api/DataPackagesApi.md#downloadidget) | **GET** /download/{id} | Get download url of the data package
*DataPackagesApi* | [**downloadListGet**](docs/Api/DataPackagesApi.md#downloadlistget) | **GET** /download/list | List available data packages
*ETFApi* | [**etfSymbolGet**](docs/Api/ETFApi.md#etfsymbolget) | **GET** /etf/{symbol} | ETF profile, key statistics and holdings.
*GURUApi* | [**gurusIdGet**](docs/Api/GURUApi.md#gurusidget) | **GET** /gurus/{id} | Access the holdings and trades of over 4,500 institutional investors, enabling broad market trend analysis or fueling investment research tools with extensive institutional activity data
*GURUApi* | [**gurusListGet**](docs/Api/GURUApi.md#guruslistget) | **GET** /gurus/list | Get the list of available gurus&#39; basic information
*INSIDERApi* | [**insidersDateGet**](docs/Api/INSIDERApi.md#insidersdateget) | **GET** /insiders/{date} | A comprehensive record of insider trading and institutional ownership for investment research or powering data-driven financial tools that track executive trading behavior over time
*STOCKApi* | [**stocksSymbolFundamentalsGet**](docs/Api/STOCKApi.md#stockssymbolfundamentalsget) | **GET** /stocks/{symbol}/fundamentals | Complete historical financial statements providing the data needed for in-depth analysis, valuation modeling, and building investment research platforms.
*STOCKApi* | [**stocksSymbolProfileGet**](docs/Api/STOCKApi.md#stockssymbolprofileget) | **GET** /stocks/{symbol}/profile | Access essential company details and current valuation metrics to power investment platforms, populate company directories, or enhance financial analysis tools with up-to-date market data.
*STOCKApi* | [**stocksSymbolRankingsGet**](docs/Api/STOCKApi.md#stockssymbolrankingsget) | **GET** /stocks/{symbol}/rankings | Proprietary scoring and ranking systems that assess company quality, valuation, and performance for powering data-driven investment platforms.
*STOCKApi* | [**stocksSymbolSegmentGet**](docs/Api/STOCKApi.md#stockssymbolsegmentget) | **GET** /stocks/{symbol}/segment | Gain insights into a company&#39;s revenue breakdown by product and geography to build detailed financial visualizations, enhance stock research platforms, or create data-driven market analysis tools
*STOCKApi* | [**stocksSymbolValuationsGet**](docs/Api/STOCKApi.md#stockssymbolvaluationsget) | **GET** /stocks/{symbol}/valuations | A deep dataset of historical valuation metrics to support investors and entrepreneurs in the development of data-driven investment platforms.

## Models

- [DownloadIdGet200Response](docs/Model/DownloadIdGet200Response.md)
- [DownloadListGet200ResponseInner](docs/Model/DownloadListGet200ResponseInner.md)
- [DownloadListGet403Response](docs/Model/DownloadListGet403Response.md)
- [DownloadListGet404Response](docs/Model/DownloadListGet404Response.md)
- [DownloadListGet500Response](docs/Model/DownloadListGet500Response.md)
- [EtfEtfBasicInformation](docs/Model/EtfEtfBasicInformation.md)
- [EtfEtfDividends](docs/Model/EtfEtfDividends.md)
- [EtfEtfFundamental](docs/Model/EtfEtfFundamental.md)
- [EtfEtfKeyStatistics](docs/Model/EtfEtfKeyStatistics.md)
- [EtfEtfPortfolioHoldings](docs/Model/EtfEtfPortfolioHoldings.md)
- [EtfEtfSectorBreakdowns](docs/Model/EtfEtfSectorBreakdowns.md)
- [EtfSymbolGet200Response](docs/Model/EtfSymbolGet200Response.md)
- [FundamentalsINOREITNODIRECT](docs/Model/FundamentalsINOREITNODIRECT.md)
- [FundamentalsINOREITNODIRECTBalanceSheet](docs/Model/FundamentalsINOREITNODIRECTBalanceSheet.md)
- [FundamentalsINOREITNODIRECTBasicInformation](docs/Model/FundamentalsINOREITNODIRECTBasicInformation.md)
- [FundamentalsINOREITNODIRECTCashflowStatement](docs/Model/FundamentalsINOREITNODIRECTCashflowStatement.md)
- [FundamentalsINOREITNODIRECTIncomeStatement](docs/Model/FundamentalsINOREITNODIRECTIncomeStatement.md)
- [FundamentalsIREITNODIRECT](docs/Model/FundamentalsIREITNODIRECT.md)
- [FundamentalsIREITNODIRECTBalanceSheet](docs/Model/FundamentalsIREITNODIRECTBalanceSheet.md)
- [FundamentalsIREITNODIRECTBasicInformation](docs/Model/FundamentalsIREITNODIRECTBasicInformation.md)
- [FundamentalsIREITNODIRECTCashflowStatement](docs/Model/FundamentalsIREITNODIRECTCashflowStatement.md)
- [FundamentalsIREITNODIRECTIncomeStatement](docs/Model/FundamentalsIREITNODIRECTIncomeStatement.md)
- [FundamentalsNNOREITDIRECT](docs/Model/FundamentalsNNOREITDIRECT.md)
- [FundamentalsNNOREITDIRECTBalanceSheet](docs/Model/FundamentalsNNOREITDIRECTBalanceSheet.md)
- [FundamentalsNNOREITDIRECTBasicInformation](docs/Model/FundamentalsNNOREITDIRECTBasicInformation.md)
- [FundamentalsNNOREITDIRECTCashflowStatement](docs/Model/FundamentalsNNOREITDIRECTCashflowStatement.md)
- [FundamentalsNNOREITDIRECTIncomeStatement](docs/Model/FundamentalsNNOREITDIRECTIncomeStatement.md)
- [FundamentalsNNOREITNODIRECT](docs/Model/FundamentalsNNOREITNODIRECT.md)
- [FundamentalsNNOREITNODIRECTBalanceSheet](docs/Model/FundamentalsNNOREITNODIRECTBalanceSheet.md)
- [FundamentalsNNOREITNODIRECTBasicInformation](docs/Model/FundamentalsNNOREITNODIRECTBasicInformation.md)
- [FundamentalsNNOREITNODIRECTCashflowStatement](docs/Model/FundamentalsNNOREITNODIRECTCashflowStatement.md)
- [FundamentalsNNOREITNODIRECTIncomeStatement](docs/Model/FundamentalsNNOREITNODIRECTIncomeStatement.md)
- [FundamentalsNREITDIRECT](docs/Model/FundamentalsNREITDIRECT.md)
- [FundamentalsNREITDIRECTBalanceSheet](docs/Model/FundamentalsNREITDIRECTBalanceSheet.md)
- [FundamentalsNREITDIRECTBasicInformation](docs/Model/FundamentalsNREITDIRECTBasicInformation.md)
- [FundamentalsNREITDIRECTCashflowStatement](docs/Model/FundamentalsNREITDIRECTCashflowStatement.md)
- [FundamentalsNREITDIRECTIncomeStatement](docs/Model/FundamentalsNREITDIRECTIncomeStatement.md)
- [FundamentalsNREITNODIRECT](docs/Model/FundamentalsNREITNODIRECT.md)
- [FundamentalsNREITNODIRECTBalanceSheet](docs/Model/FundamentalsNREITNODIRECTBalanceSheet.md)
- [FundamentalsNREITNODIRECTBasicInformation](docs/Model/FundamentalsNREITNODIRECTBasicInformation.md)
- [FundamentalsNREITNODIRECTCashflowStatement](docs/Model/FundamentalsNREITNODIRECTCashflowStatement.md)
- [FundamentalsNREITNODIRECTIncomeStatement](docs/Model/FundamentalsNREITNODIRECTIncomeStatement.md)
- [GuruTransaction](docs/Model/GuruTransaction.md)
- [GurusIdGet200Response](docs/Model/GurusIdGet200Response.md)
- [GurusListGet200Response](docs/Model/GurusListGet200Response.md)
- [GurusListGet200ResponseDataInner](docs/Model/GurusListGet200ResponseDataInner.md)
- [InsiderTransaction](docs/Model/InsiderTransaction.md)
- [StockFundamentalsAnnuallyInner](docs/Model/StockFundamentalsAnnuallyInner.md)
- [StockFundamentalsBasicInformation](docs/Model/StockFundamentalsBasicInformation.md)
- [StockFundamentalsTtm](docs/Model/StockFundamentalsTtm.md)
- [StockProfileBasicInformation](docs/Model/StockProfileBasicInformation.md)
- [StockProfileDividends](docs/Model/StockProfileDividends.md)
- [StockProfileFundamental](docs/Model/StockProfileFundamental.md)
- [StockProfileGeneral](docs/Model/StockProfileGeneral.md)
- [StockProfileGrowth](docs/Model/StockProfileGrowth.md)
- [StockProfilePrice](docs/Model/StockProfilePrice.md)
- [StockProfileProfitability](docs/Model/StockProfileProfitability.md)
- [StockProfileValuationRatio](docs/Model/StockProfileValuationRatio.md)
- [StockRankingsBasicInformation](docs/Model/StockRankingsBasicInformation.md)
- [StockRankingsGuruFocusRankings](docs/Model/StockRankingsGuruFocusRankings.md)
- [StockSegmentBasicInformation](docs/Model/StockSegmentBasicInformation.md)
- [StockValuationsAnnuallyInner](docs/Model/StockValuationsAnnuallyInner.md)
- [StockValuationsBasicInformation](docs/Model/StockValuationsBasicInformation.md)
- [StockValuationsTtm](docs/Model/StockValuationsTtm.md)
- [StocksSymbolFundamentalsGet200Response](docs/Model/StocksSymbolFundamentalsGet200Response.md)
- [StocksSymbolProfileGet200Response](docs/Model/StocksSymbolProfileGet200Response.md)
- [StocksSymbolRankingsGet200Response](docs/Model/StocksSymbolRankingsGet200Response.md)
- [StocksSymbolSegmentGet200Response](docs/Model/StocksSymbolSegmentGet200Response.md)
- [StocksSymbolValuationsGet200Response](docs/Model/StocksSymbolValuationsGet200Response.md)
- [ValuationsINOREITNODIRECT](docs/Model/ValuationsINOREITNODIRECT.md)
- [ValuationsINOREITNODIRECTBasicInformation](docs/Model/ValuationsINOREITNODIRECTBasicInformation.md)
- [ValuationsINOREITNODIRECTPerShareData](docs/Model/ValuationsINOREITNODIRECTPerShareData.md)
- [ValuationsINOREITNODIRECTRatios](docs/Model/ValuationsINOREITNODIRECTRatios.md)
- [ValuationsINOREITNODIRECTValuationRatios](docs/Model/ValuationsINOREITNODIRECTValuationRatios.md)
- [ValuationsINOREITNODIRECTValuationandQuality](docs/Model/ValuationsINOREITNODIRECTValuationandQuality.md)
- [ValuationsIREITNODIRECT](docs/Model/ValuationsIREITNODIRECT.md)
- [ValuationsIREITNODIRECTBasicInformation](docs/Model/ValuationsIREITNODIRECTBasicInformation.md)
- [ValuationsIREITNODIRECTPerShareData](docs/Model/ValuationsIREITNODIRECTPerShareData.md)
- [ValuationsIREITNODIRECTRatios](docs/Model/ValuationsIREITNODIRECTRatios.md)
- [ValuationsIREITNODIRECTValuationRatios](docs/Model/ValuationsIREITNODIRECTValuationRatios.md)
- [ValuationsIREITNODIRECTValuationandQuality](docs/Model/ValuationsIREITNODIRECTValuationandQuality.md)
- [ValuationsNNOREITDIRECT](docs/Model/ValuationsNNOREITDIRECT.md)
- [ValuationsNNOREITDIRECTBasicInformation](docs/Model/ValuationsNNOREITDIRECTBasicInformation.md)
- [ValuationsNNOREITDIRECTPerShareData](docs/Model/ValuationsNNOREITDIRECTPerShareData.md)
- [ValuationsNNOREITDIRECTRatios](docs/Model/ValuationsNNOREITDIRECTRatios.md)
- [ValuationsNNOREITDIRECTValuationRatios](docs/Model/ValuationsNNOREITDIRECTValuationRatios.md)
- [ValuationsNNOREITDIRECTValuationandQuality](docs/Model/ValuationsNNOREITDIRECTValuationandQuality.md)
- [ValuationsNNOREITNODIRECT](docs/Model/ValuationsNNOREITNODIRECT.md)
- [ValuationsNNOREITNODIRECTBasicInformation](docs/Model/ValuationsNNOREITNODIRECTBasicInformation.md)
- [ValuationsNNOREITNODIRECTPerShareData](docs/Model/ValuationsNNOREITNODIRECTPerShareData.md)
- [ValuationsNNOREITNODIRECTRatios](docs/Model/ValuationsNNOREITNODIRECTRatios.md)
- [ValuationsNNOREITNODIRECTValuationRatios](docs/Model/ValuationsNNOREITNODIRECTValuationRatios.md)
- [ValuationsNNOREITNODIRECTValuationandQuality](docs/Model/ValuationsNNOREITNODIRECTValuationandQuality.md)
- [ValuationsNREITDIRECT](docs/Model/ValuationsNREITDIRECT.md)
- [ValuationsNREITDIRECTBasicInformation](docs/Model/ValuationsNREITDIRECTBasicInformation.md)
- [ValuationsNREITDIRECTPerShareData](docs/Model/ValuationsNREITDIRECTPerShareData.md)
- [ValuationsNREITDIRECTRatios](docs/Model/ValuationsNREITDIRECTRatios.md)
- [ValuationsNREITDIRECTValuationRatios](docs/Model/ValuationsNREITDIRECTValuationRatios.md)
- [ValuationsNREITDIRECTValuationandQuality](docs/Model/ValuationsNREITDIRECTValuationandQuality.md)
- [ValuationsNREITNODIRECT](docs/Model/ValuationsNREITNODIRECT.md)
- [ValuationsNREITNODIRECTBasicInformation](docs/Model/ValuationsNREITNODIRECTBasicInformation.md)
- [ValuationsNREITNODIRECTPerShareData](docs/Model/ValuationsNREITNODIRECTPerShareData.md)
- [ValuationsNREITNODIRECTRatios](docs/Model/ValuationsNREITNODIRECTRatios.md)
- [ValuationsNREITNODIRECTValuationRatios](docs/Model/ValuationsNREITNODIRECTValuationRatios.md)
- [ValuationsNREITNODIRECTValuationandQuality](docs/Model/ValuationsNREITNODIRECTValuationandQuality.md)

## Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Tests

To run the tests, use:

```bash
composer install
vendor/bin/phpunit
```

## Author



## About this package

This PHP package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: `1.0.0`
    - Generator version: `7.12.0`
- Build package: `org.openapitools.codegen.languages.PhpClientCodegen`
