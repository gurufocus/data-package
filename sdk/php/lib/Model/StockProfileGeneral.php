<?php
/**
 * StockProfileGeneral
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Gurufocus Data Package API
 *
 * API for accessing Gurufocus data packages, please go to [https://www.gurufocus.com/user/me?tab=account&subtab=api-token](https://www.gurufocus.com/user/me?tab=account&subtab=api-token) to view or generate authorization keys.
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.12.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * StockProfileGeneral Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class StockProfileGeneral implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'stock_profile_general';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'ipo_date' => 'string',
        'is_direct' => 'string',
        'naics' => 'float',
        'cik' => 'string',
        'class_descpt' => 'string',
        'company' => 'string',
        'company_id' => 'string',
        'country_iso' => 'string',
        'currency' => 'string',
        'currency_comp' => 'string',
        'depositary_receipt_ratio' => 'float',
        'exchange' => 'string',
        'fiscal_year_end' => 'float',
        'group' => 'string',
        'ind_template' => 'string',
        'industry' => 'string',
        'latest_quarter' => 'string',
        'optionable_stock' => 'bool',
        'primary_exch' => 'string',
        'primary_stockid' => 'string',
        'primary_symbol' => 'string',
        'report_frequency' => 'string',
        'sector' => 'string',
        'sic' => 'float',
        'stockid' => 'string',
        'symbol' => 'string',
        'type' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'ipo_date' => null,
        'is_direct' => null,
        'naics' => null,
        'cik' => null,
        'class_descpt' => null,
        'company' => null,
        'company_id' => null,
        'country_iso' => null,
        'currency' => null,
        'currency_comp' => null,
        'depositary_receipt_ratio' => null,
        'exchange' => null,
        'fiscal_year_end' => null,
        'group' => null,
        'ind_template' => null,
        'industry' => null,
        'latest_quarter' => null,
        'optionable_stock' => null,
        'primary_exch' => null,
        'primary_stockid' => null,
        'primary_symbol' => null,
        'report_frequency' => null,
        'sector' => null,
        'sic' => null,
        'stockid' => null,
        'symbol' => null,
        'type' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'ipo_date' => false,
        'is_direct' => false,
        'naics' => false,
        'cik' => false,
        'class_descpt' => false,
        'company' => false,
        'company_id' => false,
        'country_iso' => false,
        'currency' => false,
        'currency_comp' => false,
        'depositary_receipt_ratio' => false,
        'exchange' => false,
        'fiscal_year_end' => false,
        'group' => false,
        'ind_template' => false,
        'industry' => false,
        'latest_quarter' => false,
        'optionable_stock' => false,
        'primary_exch' => false,
        'primary_stockid' => false,
        'primary_symbol' => false,
        'report_frequency' => false,
        'sector' => false,
        'sic' => false,
        'stockid' => false,
        'symbol' => false,
        'type' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var boolean[]
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return boolean[]
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param boolean[] $openAPINullablesSetToNull
     */
    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    /**
     * Checks if a property is nullable
     *
     * @param string $property
     * @return bool
     */
    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    /**
     * Checks if a nullable property is set to null.
     *
     * @param string $property
     * @return bool
     */
    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'ipo_date' => 'IPO_date',
        'is_direct' => 'IsDirect',
        'naics' => 'NAICS',
        'cik' => 'cik',
        'class_descpt' => 'class_descpt',
        'company' => 'company',
        'company_id' => 'company_id',
        'country_iso' => 'country_iso',
        'currency' => 'currency',
        'currency_comp' => 'currency_comp',
        'depositary_receipt_ratio' => 'depositary_receipt_ratio',
        'exchange' => 'exchange',
        'fiscal_year_end' => 'fiscal_year_end',
        'group' => 'group',
        'ind_template' => 'ind_template',
        'industry' => 'industry',
        'latest_quarter' => 'latest_quarter',
        'optionable_stock' => 'optionable_stock',
        'primary_exch' => 'primary_exch',
        'primary_stockid' => 'primary_stockid',
        'primary_symbol' => 'primary_symbol',
        'report_frequency' => 'report_frequency',
        'sector' => 'sector',
        'sic' => 'sic',
        'stockid' => 'stockid',
        'symbol' => 'symbol',
        'type' => 'type'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'ipo_date' => 'setIpoDate',
        'is_direct' => 'setIsDirect',
        'naics' => 'setNaics',
        'cik' => 'setCik',
        'class_descpt' => 'setClassDescpt',
        'company' => 'setCompany',
        'company_id' => 'setCompanyId',
        'country_iso' => 'setCountryIso',
        'currency' => 'setCurrency',
        'currency_comp' => 'setCurrencyComp',
        'depositary_receipt_ratio' => 'setDepositaryReceiptRatio',
        'exchange' => 'setExchange',
        'fiscal_year_end' => 'setFiscalYearEnd',
        'group' => 'setGroup',
        'ind_template' => 'setIndTemplate',
        'industry' => 'setIndustry',
        'latest_quarter' => 'setLatestQuarter',
        'optionable_stock' => 'setOptionableStock',
        'primary_exch' => 'setPrimaryExch',
        'primary_stockid' => 'setPrimaryStockid',
        'primary_symbol' => 'setPrimarySymbol',
        'report_frequency' => 'setReportFrequency',
        'sector' => 'setSector',
        'sic' => 'setSic',
        'stockid' => 'setStockid',
        'symbol' => 'setSymbol',
        'type' => 'setType'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'ipo_date' => 'getIpoDate',
        'is_direct' => 'getIsDirect',
        'naics' => 'getNaics',
        'cik' => 'getCik',
        'class_descpt' => 'getClassDescpt',
        'company' => 'getCompany',
        'company_id' => 'getCompanyId',
        'country_iso' => 'getCountryIso',
        'currency' => 'getCurrency',
        'currency_comp' => 'getCurrencyComp',
        'depositary_receipt_ratio' => 'getDepositaryReceiptRatio',
        'exchange' => 'getExchange',
        'fiscal_year_end' => 'getFiscalYearEnd',
        'group' => 'getGroup',
        'ind_template' => 'getIndTemplate',
        'industry' => 'getIndustry',
        'latest_quarter' => 'getLatestQuarter',
        'optionable_stock' => 'getOptionableStock',
        'primary_exch' => 'getPrimaryExch',
        'primary_stockid' => 'getPrimaryStockid',
        'primary_symbol' => 'getPrimarySymbol',
        'report_frequency' => 'getReportFrequency',
        'sector' => 'getSector',
        'sic' => 'getSic',
        'stockid' => 'getStockid',
        'symbol' => 'getSymbol',
        'type' => 'getType'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[]|null $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(?array $data = null)
    {
        $this->setIfExists('ipo_date', $data ?? [], null);
        $this->setIfExists('is_direct', $data ?? [], null);
        $this->setIfExists('naics', $data ?? [], null);
        $this->setIfExists('cik', $data ?? [], null);
        $this->setIfExists('class_descpt', $data ?? [], null);
        $this->setIfExists('company', $data ?? [], null);
        $this->setIfExists('company_id', $data ?? [], null);
        $this->setIfExists('country_iso', $data ?? [], null);
        $this->setIfExists('currency', $data ?? [], null);
        $this->setIfExists('currency_comp', $data ?? [], null);
        $this->setIfExists('depositary_receipt_ratio', $data ?? [], null);
        $this->setIfExists('exchange', $data ?? [], null);
        $this->setIfExists('fiscal_year_end', $data ?? [], null);
        $this->setIfExists('group', $data ?? [], null);
        $this->setIfExists('ind_template', $data ?? [], null);
        $this->setIfExists('industry', $data ?? [], null);
        $this->setIfExists('latest_quarter', $data ?? [], null);
        $this->setIfExists('optionable_stock', $data ?? [], null);
        $this->setIfExists('primary_exch', $data ?? [], null);
        $this->setIfExists('primary_stockid', $data ?? [], null);
        $this->setIfExists('primary_symbol', $data ?? [], null);
        $this->setIfExists('report_frequency', $data ?? [], null);
        $this->setIfExists('sector', $data ?? [], null);
        $this->setIfExists('sic', $data ?? [], null);
        $this->setIfExists('stockid', $data ?? [], null);
        $this->setIfExists('symbol', $data ?? [], null);
        $this->setIfExists('type', $data ?? [], null);
    }

    /**
    * Sets $this->container[$variableName] to the given data or to the given default Value; if $variableName
    * is nullable and its value is set to null in the $fields array, then mark it as "set to null" in the
    * $this->openAPINullablesSetToNull array
    *
    * @param string $variableName
    * @param array  $fields
    * @param mixed  $defaultValue
    */
    private function setIfExists(string $variableName, array $fields, $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets ipo_date
     *
     * @return string|null
     */
    public function getIpoDate()
    {
        return $this->container['ipo_date'];
    }

    /**
     * Sets ipo_date
     *
     * @param string|null $ipo_date The date of the company's initial public offering.
     *
     * @return self
     */
    public function setIpoDate($ipo_date)
    {
        if (is_null($ipo_date)) {
            throw new \InvalidArgumentException('non-nullable ipo_date cannot be null');
        }
        $this->container['ipo_date'] = $ipo_date;

        return $this;
    }

    /**
     * Gets is_direct
     *
     * @return string|null
     */
    public function getIsDirect()
    {
        return $this->container['is_direct'];
    }

    /**
     * Sets is_direct
     *
     * @param string|null $is_direct Does the company report its cash flow statement using the direct method (cash collections, cash payments) or the indirect method (net income -> free cash flow)?
     *
     * @return self
     */
    public function setIsDirect($is_direct)
    {
        if (is_null($is_direct)) {
            throw new \InvalidArgumentException('non-nullable is_direct cannot be null');
        }
        $this->container['is_direct'] = $is_direct;

        return $this;
    }

    /**
     * Gets naics
     *
     * @return float|null
     */
    public function getNaics()
    {
        return $this->container['naics'];
    }

    /**
     * Sets naics
     *
     * @param float|null $naics A six-digit code that identifies the company's main business operation
     *
     * @return self
     */
    public function setNaics($naics)
    {
        if (is_null($naics)) {
            throw new \InvalidArgumentException('non-nullable naics cannot be null');
        }
        $this->container['naics'] = $naics;

        return $this;
    }

    /**
     * Gets cik
     *
     * @return string|null
     */
    public function getCik()
    {
        return $this->container['cik'];
    }

    /**
     * Sets cik
     *
     * @param string|null $cik A unique 10-digit number the SEC assigns to companies, mutual funds and hedge funds
     *
     * @return self
     */
    public function setCik($cik)
    {
        if (is_null($cik)) {
            throw new \InvalidArgumentException('non-nullable cik cannot be null');
        }
        $this->container['cik'] = $cik;

        return $this;
    }

    /**
     * Gets class_descpt
     *
     * @return string|null
     */
    public function getClassDescpt()
    {
        return $this->container['class_descpt'];
    }

    /**
     * Sets class_descpt
     *
     * @param string|null $class_descpt A unique identifier that describes the stock ticker's share class. Examples: Class A, Class C, ADR
     *
     * @return self
     */
    public function setClassDescpt($class_descpt)
    {
        if (is_null($class_descpt)) {
            throw new \InvalidArgumentException('non-nullable class_descpt cannot be null');
        }
        $this->container['class_descpt'] = $class_descpt;

        return $this;
    }

    /**
     * Gets company
     *
     * @return string|null
     */
    public function getCompany()
    {
        return $this->container['company'];
    }

    /**
     * Sets company
     *
     * @param string|null $company The name of the company as identified on its SEC filings.
     *
     * @return self
     */
    public function setCompany($company)
    {
        if (is_null($company)) {
            throw new \InvalidArgumentException('non-nullable company cannot be null');
        }
        $this->container['company'] = $company;

        return $this;
    }

    /**
     * Gets company_id
     *
     * @return string|null
     */
    public function getCompanyId()
    {
        return $this->container['company_id'];
    }

    /**
     * Sets company_id
     *
     * @param string|null $company_id company_id
     *
     * @return self
     */
    public function setCompanyId($company_id)
    {
        if (is_null($company_id)) {
            throw new \InvalidArgumentException('non-nullable company_id cannot be null');
        }
        $this->container['company_id'] = $company_id;

        return $this;
    }

    /**
     * Gets country_iso
     *
     * @return string|null
     */
    public function getCountryIso()
    {
        return $this->container['country_iso'];
    }

    /**
     * Sets country_iso
     *
     * @param string|null $country_iso The country containing the company's headquarters.
     *
     * @return self
     */
    public function setCountryIso($country_iso)
    {
        if (is_null($country_iso)) {
            throw new \InvalidArgumentException('non-nullable country_iso cannot be null');
        }
        $this->container['country_iso'] = $country_iso;

        return $this;
    }

    /**
     * Gets currency
     *
     * @return string|null
     */
    public function getCurrency()
    {
        return $this->container['currency'];
    }

    /**
     * Sets currency
     *
     * @param string|null $currency The currency symbol used to report a company's financial data. For example, NYSE stocks have currency USD
     *
     * @return self
     */
    public function setCurrency($currency)
    {
        if (is_null($currency)) {
            throw new \InvalidArgumentException('non-nullable currency cannot be null');
        }
        $this->container['currency'] = $currency;

        return $this;
    }

    /**
     * Gets currency_comp
     *
     * @return string|null
     */
    public function getCurrencyComp()
    {
        return $this->container['currency_comp'];
    }

    /**
     * Sets currency_comp
     *
     * @param string|null $currency_comp The currency symbol used to report a company's financial data. For example, NYSE stocks have currency USD
     *
     * @return self
     */
    public function setCurrencyComp($currency_comp)
    {
        if (is_null($currency_comp)) {
            throw new \InvalidArgumentException('non-nullable currency_comp cannot be null');
        }
        $this->container['currency_comp'] = $currency_comp;

        return $this;
    }

    /**
     * Gets depositary_receipt_ratio
     *
     * @return float|null
     */
    public function getDepositaryReceiptRatio()
    {
        return $this->container['depositary_receipt_ratio'];
    }

    /**
     * Sets depositary_receipt_ratio
     *
     * @param float|null $depositary_receipt_ratio depositary_receipt_ratio
     *
     * @return self
     */
    public function setDepositaryReceiptRatio($depositary_receipt_ratio)
    {
        if (is_null($depositary_receipt_ratio)) {
            throw new \InvalidArgumentException('non-nullable depositary_receipt_ratio cannot be null');
        }
        $this->container['depositary_receipt_ratio'] = $depositary_receipt_ratio;

        return $this;
    }

    /**
     * Gets exchange
     *
     * @return string|null
     */
    public function getExchange()
    {
        return $this->container['exchange'];
    }

    /**
     * Sets exchange
     *
     * @param string|null $exchange The company's stock exchange. Example: NAS for Apple.
     *
     * @return self
     */
    public function setExchange($exchange)
    {
        if (is_null($exchange)) {
            throw new \InvalidArgumentException('non-nullable exchange cannot be null');
        }
        $this->container['exchange'] = $exchange;

        return $this;
    }

    /**
     * Gets fiscal_year_end
     *
     * @return float|null
     */
    public function getFiscalYearEnd()
    {
        return $this->container['fiscal_year_end'];
    }

    /**
     * Sets fiscal_year_end
     *
     * @param float|null $fiscal_year_end The month representing the company's fiscal year end.
     *
     * @return self
     */
    public function setFiscalYearEnd($fiscal_year_end)
    {
        if (is_null($fiscal_year_end)) {
            throw new \InvalidArgumentException('non-nullable fiscal_year_end cannot be null');
        }
        $this->container['fiscal_year_end'] = $fiscal_year_end;

        return $this;
    }

    /**
     * Gets group
     *
     * @return string|null
     */
    public function getGroup()
    {
        return $this->container['group'];
    }

    /**
     * Sets group
     *
     * @param string|null $group group
     *
     * @return self
     */
    public function setGroup($group)
    {
        if (is_null($group)) {
            throw new \InvalidArgumentException('non-nullable group cannot be null');
        }
        $this->container['group'] = $group;

        return $this;
    }

    /**
     * Gets ind_template
     *
     * @return string|null
     */
    public function getIndTemplate()
    {
        return $this->container['ind_template'];
    }

    /**
     * Sets ind_template
     *
     * @param string|null $ind_template The company's financial statement type: either bank, insurance or nonfinancial
     *
     * @return self
     */
    public function setIndTemplate($ind_template)
    {
        if (is_null($ind_template)) {
            throw new \InvalidArgumentException('non-nullable ind_template cannot be null');
        }
        $this->container['ind_template'] = $ind_template;

        return $this;
    }

    /**
     * Gets industry
     *
     * @return string|null
     */
    public function getIndustry()
    {
        return $this->container['industry'];
    }

    /**
     * Sets industry
     *
     * @param string|null $industry The company's industry. Example: Discount Stores for WMT.
     *
     * @return self
     */
    public function setIndustry($industry)
    {
        if (is_null($industry)) {
            throw new \InvalidArgumentException('non-nullable industry cannot be null');
        }
        $this->container['industry'] = $industry;

        return $this;
    }

    /**
     * Gets latest_quarter
     *
     * @return string|null
     */
    public function getLatestQuarter()
    {
        return $this->container['latest_quarter'];
    }

    /**
     * Sets latest_quarter
     *
     * @param string|null $latest_quarter The company's latest quarter-end date
     *
     * @return self
     */
    public function setLatestQuarter($latest_quarter)
    {
        if (is_null($latest_quarter)) {
            throw new \InvalidArgumentException('non-nullable latest_quarter cannot be null');
        }
        $this->container['latest_quarter'] = $latest_quarter;

        return $this;
    }

    /**
     * Gets optionable_stock
     *
     * @return bool|null
     */
    public function getOptionableStock()
    {
        return $this->container['optionable_stock'];
    }

    /**
     * Sets optionable_stock
     *
     * @param bool|null $optionable_stock Does the stock offer options? If yes, the stock is \"optionable.\"
     *
     * @return self
     */
    public function setOptionableStock($optionable_stock)
    {
        if (is_null($optionable_stock)) {
            throw new \InvalidArgumentException('non-nullable optionable_stock cannot be null');
        }
        $this->container['optionable_stock'] = $optionable_stock;

        return $this;
    }

    /**
     * Gets primary_exch
     *
     * @return string|null
     */
    public function getPrimaryExch()
    {
        return $this->container['primary_exch'];
    }

    /**
     * Sets primary_exch
     *
     * @param string|null $primary_exch The stock ticker's primary exchange, which most likely connects to the company's headquarter country
     *
     * @return self
     */
    public function setPrimaryExch($primary_exch)
    {
        if (is_null($primary_exch)) {
            throw new \InvalidArgumentException('non-nullable primary_exch cannot be null');
        }
        $this->container['primary_exch'] = $primary_exch;

        return $this;
    }

    /**
     * Gets primary_stockid
     *
     * @return string|null
     */
    public function getPrimaryStockid()
    {
        return $this->container['primary_stockid'];
    }

    /**
     * Sets primary_stockid
     *
     * @param string|null $primary_stockid primary_stockid
     *
     * @return self
     */
    public function setPrimaryStockid($primary_stockid)
    {
        if (is_null($primary_stockid)) {
            throw new \InvalidArgumentException('non-nullable primary_stockid cannot be null');
        }
        $this->container['primary_stockid'] = $primary_stockid;

        return $this;
    }

    /**
     * Gets primary_symbol
     *
     * @return string|null
     */
    public function getPrimarySymbol()
    {
        return $this->container['primary_symbol'];
    }

    /**
     * Sets primary_symbol
     *
     * @param string|null $primary_symbol The ticker symbol the company trades under its primary exchange
     *
     * @return self
     */
    public function setPrimarySymbol($primary_symbol)
    {
        if (is_null($primary_symbol)) {
            throw new \InvalidArgumentException('non-nullable primary_symbol cannot be null');
        }
        $this->container['primary_symbol'] = $primary_symbol;

        return $this;
    }

    /**
     * Gets report_frequency
     *
     * @return string|null
     */
    public function getReportFrequency()
    {
        return $this->container['report_frequency'];
    }

    /**
     * Sets report_frequency
     *
     * @param string|null $report_frequency How frequently does a company report its earnings?
     *
     * @return self
     */
    public function setReportFrequency($report_frequency)
    {
        if (is_null($report_frequency)) {
            throw new \InvalidArgumentException('non-nullable report_frequency cannot be null');
        }
        $this->container['report_frequency'] = $report_frequency;

        return $this;
    }

    /**
     * Gets sector
     *
     * @return string|null
     */
    public function getSector()
    {
        return $this->container['sector'];
    }

    /**
     * Sets sector
     *
     * @param string|null $sector A three-digit code indicating a company's market sector
     *
     * @return self
     */
    public function setSector($sector)
    {
        if (is_null($sector)) {
            throw new \InvalidArgumentException('non-nullable sector cannot be null');
        }
        $this->container['sector'] = $sector;

        return $this;
    }

    /**
     * Gets sic
     *
     * @return float|null
     */
    public function getSic()
    {
        return $this->container['sic'];
    }

    /**
     * Sets sic
     *
     * @param float|null $sic A four-digit code that classifies a company by its business type
     *
     * @return self
     */
    public function setSic($sic)
    {
        if (is_null($sic)) {
            throw new \InvalidArgumentException('non-nullable sic cannot be null');
        }
        $this->container['sic'] = $sic;

        return $this;
    }

    /**
     * Gets stockid
     *
     * @return string|null
     */
    public function getStockid()
    {
        return $this->container['stockid'];
    }

    /**
     * Sets stockid
     *
     * @param string|null $stockid A unique identifier for the stock
     *
     * @return self
     */
    public function setStockid($stockid)
    {
        if (is_null($stockid)) {
            throw new \InvalidArgumentException('non-nullable stockid cannot be null');
        }
        $this->container['stockid'] = $stockid;

        return $this;
    }

    /**
     * Gets symbol
     *
     * @return string|null
     */
    public function getSymbol()
    {
        return $this->container['symbol'];
    }

    /**
     * Sets symbol
     *
     * @param string|null $symbol The company's stock ticker symbol
     *
     * @return self
     */
    public function setSymbol($symbol)
    {
        if (is_null($symbol)) {
            throw new \InvalidArgumentException('non-nullable symbol cannot be null');
        }
        $this->container['symbol'] = $symbol;

        return $this;
    }

    /**
     * Gets type
     *
     * @return string|null
     */
    public function getType()
    {
        return $this->container['type'];
    }

    /**
     * Sets type
     *
     * @param string|null $type A code that determines if a security represents common stock or preferred stock
     *
     * @return self
     */
    public function setType($type)
    {
        if (is_null($type)) {
            throw new \InvalidArgumentException('non-nullable type cannot be null');
        }
        $this->container['type'] = $type;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset): void
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    #[\ReturnTypeWillChange]
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


