<?php
/**
 * ValuationsNNOREITNODIRECTValuationRatios
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
 * ValuationsNNOREITNODIRECTValuationRatios Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ValuationsNNOREITNODIRECTValuationRatios implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'valuations_N_NO_REIT_NO_DIRECT_valuation_ratios';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'cyclically_adjusted_pb_ratio' => 'float',
        'cyclically_adjusted_price_to_fcf' => 'float',
        'cyclically_adjusted_ps_ratio' => 'float',
        'earning_yield_greenblatt' => 'float',
        'enterprise_value_to_ebit' => 'float',
        'enterprise_value_to_ebitda' => 'float',
        'enterprise_value_to_fcf' => 'float',
        'enterprise_value_to_revenue' => 'float',
        'fcf_yield' => 'float',
        'pb_ratio' => 'float',
        'pe_ratio' => 'float',
        'peg_ratio' => 'float',
        'penri' => 'float',
        'price_to_free_cash_flow' => 'float',
        'price_to_operating_cash_flow' => 'float',
        'price_to_owner_earnings' => 'float',
        'price_to_tangible_book' => 'float',
        'ps_ratio' => 'float',
        'rate_of_return_value' => 'float',
        'shiller_pe_ratio' => 'float',
        'yield' => 'float'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'cyclically_adjusted_pb_ratio' => null,
        'cyclically_adjusted_price_to_fcf' => null,
        'cyclically_adjusted_ps_ratio' => null,
        'earning_yield_greenblatt' => null,
        'enterprise_value_to_ebit' => null,
        'enterprise_value_to_ebitda' => null,
        'enterprise_value_to_fcf' => null,
        'enterprise_value_to_revenue' => null,
        'fcf_yield' => null,
        'pb_ratio' => null,
        'pe_ratio' => null,
        'peg_ratio' => null,
        'penri' => null,
        'price_to_free_cash_flow' => null,
        'price_to_operating_cash_flow' => null,
        'price_to_owner_earnings' => null,
        'price_to_tangible_book' => null,
        'ps_ratio' => null,
        'rate_of_return_value' => null,
        'shiller_pe_ratio' => null,
        'yield' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'cyclically_adjusted_pb_ratio' => false,
        'cyclically_adjusted_price_to_fcf' => false,
        'cyclically_adjusted_ps_ratio' => false,
        'earning_yield_greenblatt' => false,
        'enterprise_value_to_ebit' => false,
        'enterprise_value_to_ebitda' => false,
        'enterprise_value_to_fcf' => false,
        'enterprise_value_to_revenue' => false,
        'fcf_yield' => false,
        'pb_ratio' => false,
        'pe_ratio' => false,
        'peg_ratio' => false,
        'penri' => false,
        'price_to_free_cash_flow' => false,
        'price_to_operating_cash_flow' => false,
        'price_to_owner_earnings' => false,
        'price_to_tangible_book' => false,
        'ps_ratio' => false,
        'rate_of_return_value' => false,
        'shiller_pe_ratio' => false,
        'yield' => false
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
        'cyclically_adjusted_pb_ratio' => 'cyclically_adjusted_pb_ratio',
        'cyclically_adjusted_price_to_fcf' => 'cyclically_adjusted_price_to_fcf',
        'cyclically_adjusted_ps_ratio' => 'cyclically_adjusted_ps_ratio',
        'earning_yield_greenblatt' => 'earning_yield_greenblatt',
        'enterprise_value_to_ebit' => 'enterprise_value_to_ebit',
        'enterprise_value_to_ebitda' => 'enterprise_value_to_ebitda',
        'enterprise_value_to_fcf' => 'enterprise_value_to_fcf',
        'enterprise_value_to_revenue' => 'enterprise_value_to_revenue',
        'fcf_yield' => 'fcf_yield',
        'pb_ratio' => 'pb_ratio',
        'pe_ratio' => 'pe_ratio',
        'peg_ratio' => 'peg_ratio',
        'penri' => 'penri',
        'price_to_free_cash_flow' => 'price_to_free_cash_flow',
        'price_to_operating_cash_flow' => 'price_to_operating_cash_flow',
        'price_to_owner_earnings' => 'price_to_owner_earnings',
        'price_to_tangible_book' => 'price_to_tangible_book',
        'ps_ratio' => 'ps_ratio',
        'rate_of_return_value' => 'rate_of_return_value',
        'shiller_pe_ratio' => 'shiller_pe_ratio',
        'yield' => 'yield'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'cyclically_adjusted_pb_ratio' => 'setCyclicallyAdjustedPbRatio',
        'cyclically_adjusted_price_to_fcf' => 'setCyclicallyAdjustedPriceToFcf',
        'cyclically_adjusted_ps_ratio' => 'setCyclicallyAdjustedPsRatio',
        'earning_yield_greenblatt' => 'setEarningYieldGreenblatt',
        'enterprise_value_to_ebit' => 'setEnterpriseValueToEbit',
        'enterprise_value_to_ebitda' => 'setEnterpriseValueToEbitda',
        'enterprise_value_to_fcf' => 'setEnterpriseValueToFcf',
        'enterprise_value_to_revenue' => 'setEnterpriseValueToRevenue',
        'fcf_yield' => 'setFcfYield',
        'pb_ratio' => 'setPbRatio',
        'pe_ratio' => 'setPeRatio',
        'peg_ratio' => 'setPegRatio',
        'penri' => 'setPenri',
        'price_to_free_cash_flow' => 'setPriceToFreeCashFlow',
        'price_to_operating_cash_flow' => 'setPriceToOperatingCashFlow',
        'price_to_owner_earnings' => 'setPriceToOwnerEarnings',
        'price_to_tangible_book' => 'setPriceToTangibleBook',
        'ps_ratio' => 'setPsRatio',
        'rate_of_return_value' => 'setRateOfReturnValue',
        'shiller_pe_ratio' => 'setShillerPeRatio',
        'yield' => 'setYield'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'cyclically_adjusted_pb_ratio' => 'getCyclicallyAdjustedPbRatio',
        'cyclically_adjusted_price_to_fcf' => 'getCyclicallyAdjustedPriceToFcf',
        'cyclically_adjusted_ps_ratio' => 'getCyclicallyAdjustedPsRatio',
        'earning_yield_greenblatt' => 'getEarningYieldGreenblatt',
        'enterprise_value_to_ebit' => 'getEnterpriseValueToEbit',
        'enterprise_value_to_ebitda' => 'getEnterpriseValueToEbitda',
        'enterprise_value_to_fcf' => 'getEnterpriseValueToFcf',
        'enterprise_value_to_revenue' => 'getEnterpriseValueToRevenue',
        'fcf_yield' => 'getFcfYield',
        'pb_ratio' => 'getPbRatio',
        'pe_ratio' => 'getPeRatio',
        'peg_ratio' => 'getPegRatio',
        'penri' => 'getPenri',
        'price_to_free_cash_flow' => 'getPriceToFreeCashFlow',
        'price_to_operating_cash_flow' => 'getPriceToOperatingCashFlow',
        'price_to_owner_earnings' => 'getPriceToOwnerEarnings',
        'price_to_tangible_book' => 'getPriceToTangibleBook',
        'ps_ratio' => 'getPsRatio',
        'rate_of_return_value' => 'getRateOfReturnValue',
        'shiller_pe_ratio' => 'getShillerPeRatio',
        'yield' => 'getYield'
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
        $this->setIfExists('cyclically_adjusted_pb_ratio', $data ?? [], null);
        $this->setIfExists('cyclically_adjusted_price_to_fcf', $data ?? [], null);
        $this->setIfExists('cyclically_adjusted_ps_ratio', $data ?? [], null);
        $this->setIfExists('earning_yield_greenblatt', $data ?? [], null);
        $this->setIfExists('enterprise_value_to_ebit', $data ?? [], null);
        $this->setIfExists('enterprise_value_to_ebitda', $data ?? [], null);
        $this->setIfExists('enterprise_value_to_fcf', $data ?? [], null);
        $this->setIfExists('enterprise_value_to_revenue', $data ?? [], null);
        $this->setIfExists('fcf_yield', $data ?? [], null);
        $this->setIfExists('pb_ratio', $data ?? [], null);
        $this->setIfExists('pe_ratio', $data ?? [], null);
        $this->setIfExists('peg_ratio', $data ?? [], null);
        $this->setIfExists('penri', $data ?? [], null);
        $this->setIfExists('price_to_free_cash_flow', $data ?? [], null);
        $this->setIfExists('price_to_operating_cash_flow', $data ?? [], null);
        $this->setIfExists('price_to_owner_earnings', $data ?? [], null);
        $this->setIfExists('price_to_tangible_book', $data ?? [], null);
        $this->setIfExists('ps_ratio', $data ?? [], null);
        $this->setIfExists('rate_of_return_value', $data ?? [], null);
        $this->setIfExists('shiller_pe_ratio', $data ?? [], null);
        $this->setIfExists('yield', $data ?? [], null);
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
     * Gets cyclically_adjusted_pb_ratio
     *
     * @return float|null
     */
    public function getCyclicallyAdjustedPbRatio()
    {
        return $this->container['cyclically_adjusted_pb_ratio'];
    }

    /**
     * Sets cyclically_adjusted_pb_ratio
     *
     * @param float|null $cyclically_adjusted_pb_ratio The Cyclically Adjusted PB Ratio, also known as the CAPB Ratio, is the stock price divided by the average of the inflation adjusted book value per share of a company over the past 10 years.
     *
     * @return self
     */
    public function setCyclicallyAdjustedPbRatio($cyclically_adjusted_pb_ratio)
    {
        if (is_null($cyclically_adjusted_pb_ratio)) {
            throw new \InvalidArgumentException('non-nullable cyclically_adjusted_pb_ratio cannot be null');
        }
        $this->container['cyclically_adjusted_pb_ratio'] = $cyclically_adjusted_pb_ratio;

        return $this;
    }

    /**
     * Gets cyclically_adjusted_price_to_fcf
     *
     * @return float|null
     */
    public function getCyclicallyAdjustedPriceToFcf()
    {
        return $this->container['cyclically_adjusted_price_to_fcf'];
    }

    /**
     * Sets cyclically_adjusted_price_to_fcf
     *
     * @param float|null $cyclically_adjusted_price_to_fcf cyclically_adjusted_price_to_fcf
     *
     * @return self
     */
    public function setCyclicallyAdjustedPriceToFcf($cyclically_adjusted_price_to_fcf)
    {
        if (is_null($cyclically_adjusted_price_to_fcf)) {
            throw new \InvalidArgumentException('non-nullable cyclically_adjusted_price_to_fcf cannot be null');
        }
        $this->container['cyclically_adjusted_price_to_fcf'] = $cyclically_adjusted_price_to_fcf;

        return $this;
    }

    /**
     * Gets cyclically_adjusted_ps_ratio
     *
     * @return float|null
     */
    public function getCyclicallyAdjustedPsRatio()
    {
        return $this->container['cyclically_adjusted_ps_ratio'];
    }

    /**
     * Sets cyclically_adjusted_ps_ratio
     *
     * @param float|null $cyclically_adjusted_ps_ratio The Cyclically Adjusted PS Ratio, also referred to as the CAPS Ratio, is the stock price divided by the average of the inflation adjusted revenue per share of a company over the past 10 years.
     *
     * @return self
     */
    public function setCyclicallyAdjustedPsRatio($cyclically_adjusted_ps_ratio)
    {
        if (is_null($cyclically_adjusted_ps_ratio)) {
            throw new \InvalidArgumentException('non-nullable cyclically_adjusted_ps_ratio cannot be null');
        }
        $this->container['cyclically_adjusted_ps_ratio'] = $cyclically_adjusted_ps_ratio;

        return $this;
    }

    /**
     * Gets earning_yield_greenblatt
     *
     * @return float|null
     */
    public function getEarningYieldGreenblatt()
    {
        return $this->container['earning_yield_greenblatt'];
    }

    /**
     * Sets earning_yield_greenblatt
     *
     * @param float|null $earning_yield_greenblatt The standard definition of earnings yield is the earnings per share divided by the price of a share. It's the inverse of P/E and shows the amount of money earned compared to the price you pay for a share.
     *
     * @return self
     */
    public function setEarningYieldGreenblatt($earning_yield_greenblatt)
    {
        if (is_null($earning_yield_greenblatt)) {
            throw new \InvalidArgumentException('non-nullable earning_yield_greenblatt cannot be null');
        }
        $this->container['earning_yield_greenblatt'] = $earning_yield_greenblatt;

        return $this;
    }

    /**
     * Gets enterprise_value_to_ebit
     *
     * @return float|null
     */
    public function getEnterpriseValueToEbit()
    {
        return $this->container['enterprise_value_to_ebit'];
    }

    /**
     * Sets enterprise_value_to_ebit
     *
     * @param float|null $enterprise_value_to_ebit EV-to-EBIT is calculated as Enterprise Value divided by its EBIT.
     *
     * @return self
     */
    public function setEnterpriseValueToEbit($enterprise_value_to_ebit)
    {
        if (is_null($enterprise_value_to_ebit)) {
            throw new \InvalidArgumentException('non-nullable enterprise_value_to_ebit cannot be null');
        }
        $this->container['enterprise_value_to_ebit'] = $enterprise_value_to_ebit;

        return $this;
    }

    /**
     * Gets enterprise_value_to_ebitda
     *
     * @return float|null
     */
    public function getEnterpriseValueToEbitda()
    {
        return $this->container['enterprise_value_to_ebitda'];
    }

    /**
     * Sets enterprise_value_to_ebitda
     *
     * @param float|null $enterprise_value_to_ebitda EV-to-EBITDA is calculated as enterprise value divided by its EBITDA.
     *
     * @return self
     */
    public function setEnterpriseValueToEbitda($enterprise_value_to_ebitda)
    {
        if (is_null($enterprise_value_to_ebitda)) {
            throw new \InvalidArgumentException('non-nullable enterprise_value_to_ebitda cannot be null');
        }
        $this->container['enterprise_value_to_ebitda'] = $enterprise_value_to_ebitda;

        return $this;
    }

    /**
     * Gets enterprise_value_to_fcf
     *
     * @return float|null
     */
    public function getEnterpriseValueToFcf()
    {
        return $this->container['enterprise_value_to_fcf'];
    }

    /**
     * Sets enterprise_value_to_fcf
     *
     * @param float|null $enterprise_value_to_fcf enterprise_value_to_fcf
     *
     * @return self
     */
    public function setEnterpriseValueToFcf($enterprise_value_to_fcf)
    {
        if (is_null($enterprise_value_to_fcf)) {
            throw new \InvalidArgumentException('non-nullable enterprise_value_to_fcf cannot be null');
        }
        $this->container['enterprise_value_to_fcf'] = $enterprise_value_to_fcf;

        return $this;
    }

    /**
     * Gets enterprise_value_to_revenue
     *
     * @return float|null
     */
    public function getEnterpriseValueToRevenue()
    {
        return $this->container['enterprise_value_to_revenue'];
    }

    /**
     * Sets enterprise_value_to_revenue
     *
     * @param float|null $enterprise_value_to_revenue EV-to-Revenue is calculated as enterprise value divided by its revenue.
     *
     * @return self
     */
    public function setEnterpriseValueToRevenue($enterprise_value_to_revenue)
    {
        if (is_null($enterprise_value_to_revenue)) {
            throw new \InvalidArgumentException('non-nullable enterprise_value_to_revenue cannot be null');
        }
        $this->container['enterprise_value_to_revenue'] = $enterprise_value_to_revenue;

        return $this;
    }

    /**
     * Gets fcf_yield
     *
     * @return float|null
     */
    public function getFcfYield()
    {
        return $this->container['fcf_yield'];
    }

    /**
     * Sets fcf_yield
     *
     * @param float|null $fcf_yield Free cash flow yield: the free cash flow divided by share price
     *
     * @return self
     */
    public function setFcfYield($fcf_yield)
    {
        if (is_null($fcf_yield)) {
            throw new \InvalidArgumentException('non-nullable fcf_yield cannot be null');
        }
        $this->container['fcf_yield'] = $fcf_yield;

        return $this;
    }

    /**
     * Gets pb_ratio
     *
     * @return float|null
     */
    public function getPbRatio()
    {
        return $this->container['pb_ratio'];
    }

    /**
     * Sets pb_ratio
     *
     * @param float|null $pb_ratio Companies use the price-to-book ratio to compare a firm's market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio.
     *
     * @return self
     */
    public function setPbRatio($pb_ratio)
    {
        if (is_null($pb_ratio)) {
            throw new \InvalidArgumentException('non-nullable pb_ratio cannot be null');
        }
        $this->container['pb_ratio'] = $pb_ratio;

        return $this;
    }

    /**
     * Gets pe_ratio
     *
     * @return float|null
     */
    public function getPeRatio()
    {
        return $this->container['pe_ratio'];
    }

    /**
     * Sets pe_ratio
     *
     * @param float|null $pe_ratio <p>The PE ratio, or Price-to-Earnings ratio, is the most widely used metric in the valuation of stocks. It is calculated as:  <b>PE Ratio = Share Price / {{eps_diluated}}</b>.   It can also be calculated from the numbers for the whole company:  <b>PE Ratio = {{mktcap}} / {{net_income}}</b>.</p>  <p>There are at least three kinds of PE ratios used among different investors. They are Trailing Twelve Month PE Ratio({{pettm}}), {{forwardPE}}, and {{penri}}. A new PE ratio based on inflation-adjusted normalized PE ratio is called {{ShillerPE}}, after Yale professor Robert Shiller.</p>  <p>In the calculation of {{pettm}}, the earnings per share used are the earnings per share over the past 12 months({{ttm_eps}}). For {{forwardPE}}, the earnings are the expected earnings for the next twelve months({{forward_eps}}). In the case of {{penri}}, the reported earnings less the non-recurring items are used({{eps_nri}}).For the {{ShillerPE}}, the earnings of the past 10 years are inflation-adjusted and averaged. Since {{ShillerPE}} looks at the average over the last 10 years, it is also called PE10.</p>
     *
     * @return self
     */
    public function setPeRatio($pe_ratio)
    {
        if (is_null($pe_ratio)) {
            throw new \InvalidArgumentException('non-nullable pe_ratio cannot be null');
        }
        $this->container['pe_ratio'] = $pe_ratio;

        return $this;
    }

    /**
     * Gets peg_ratio
     *
     * @return float|null
     */
    public function getPegRatio()
    {
        return $this->container['peg_ratio'];
    }

    /**
     * Sets peg_ratio
     *
     * @param float|null $peg_ratio PEG is defined as the PE Ratio without NRI divided by the growth ratio. The growth rate we use is the 5-year average EBITDA growth rate.
     *
     * @return self
     */
    public function setPegRatio($peg_ratio)
    {
        if (is_null($peg_ratio)) {
            throw new \InvalidArgumentException('non-nullable peg_ratio cannot be null');
        }
        $this->container['peg_ratio'] = $peg_ratio;

        return $this;
    }

    /**
     * Gets penri
     *
     * @return float|null
     */
    public function getPenri()
    {
        return $this->container['penri'];
    }

    /**
     * Sets penri
     *
     * @param float|null $penri penri
     *
     * @return self
     */
    public function setPenri($penri)
    {
        if (is_null($penri)) {
            throw new \InvalidArgumentException('non-nullable penri cannot be null');
        }
        $this->container['penri'] = $penri;

        return $this;
    }

    /**
     * Gets price_to_free_cash_flow
     *
     * @return float|null
     */
    public function getPriceToFreeCashFlow()
    {
        return $this->container['price_to_free_cash_flow'];
    }

    /**
     * Sets price_to_free_cash_flow
     *
     * @param float|null $price_to_free_cash_flow Price to free cash flow is an equity valuation metric used to compare a company's per-share market price to its per-share amount of free cash flow (FCF).
     *
     * @return self
     */
    public function setPriceToFreeCashFlow($price_to_free_cash_flow)
    {
        if (is_null($price_to_free_cash_flow)) {
            throw new \InvalidArgumentException('non-nullable price_to_free_cash_flow cannot be null');
        }
        $this->container['price_to_free_cash_flow'] = $price_to_free_cash_flow;

        return $this;
    }

    /**
     * Gets price_to_operating_cash_flow
     *
     * @return float|null
     */
    public function getPriceToOperatingCashFlow()
    {
        return $this->container['price_to_operating_cash_flow'];
    }

    /**
     * Sets price_to_operating_cash_flow
     *
     * @param float|null $price_to_operating_cash_flow The price/cash flow ratio (also called price-to-cash flow ratio or P/CF), is a ratio used to compare a company's market value to its cash flow.
     *
     * @return self
     */
    public function setPriceToOperatingCashFlow($price_to_operating_cash_flow)
    {
        if (is_null($price_to_operating_cash_flow)) {
            throw new \InvalidArgumentException('non-nullable price_to_operating_cash_flow cannot be null');
        }
        $this->container['price_to_operating_cash_flow'] = $price_to_operating_cash_flow;

        return $this;
    }

    /**
     * Gets price_to_owner_earnings
     *
     * @return float|null
     */
    public function getPriceToOwnerEarnings()
    {
        return $this->container['price_to_owner_earnings'];
    }

    /**
     * Sets price_to_owner_earnings
     *
     * @param float|null $price_to_owner_earnings In 1986 Berkshire Hathaway Shareholder Letter, Warren Buffett defined owner earnings as follows:  \"These represent (a) reported earnings plus (b) depreciation, depletion, amortization, and certain other non-cash charges...less (c) the average annual amount of capitalized expenditures for plant and equipment, etc. that the business requires to fully maintain its long-term competitive position and its unit volume. (If the business requires additional working capital to maintain its competitive position and unit volume, the increment also should be included in (c))...Our owner-earnings equation does not yield the deceptively precise figures provided by GAAP, since (c) must be a guess - and one sometimes very difficult to make. Despite this problem, we consider the owner earnings figure, not the GAAP figure, to be the relevant item for valuation purposes - both for investors in buying stocks and for managers in buying entire businesses...All of this points up the absurdity of the 'cash flow' numbers that are often set forth in Wall Street reports. These numbers routinely include (a) plus (b) - but do not subtract (c).\"
     *
     * @return self
     */
    public function setPriceToOwnerEarnings($price_to_owner_earnings)
    {
        if (is_null($price_to_owner_earnings)) {
            throw new \InvalidArgumentException('non-nullable price_to_owner_earnings cannot be null');
        }
        $this->container['price_to_owner_earnings'] = $price_to_owner_earnings;

        return $this;
    }

    /**
     * Gets price_to_tangible_book
     *
     * @return float|null
     */
    public function getPriceToTangibleBook()
    {
        return $this->container['price_to_tangible_book'];
    }

    /**
     * Sets price_to_tangible_book
     *
     * @param float|null $price_to_tangible_book The Price to Tangible Book Value ratio (PTBV) expresses share price as a proportion of the company's tangible book value reported on the company's balance sheet.
     *
     * @return self
     */
    public function setPriceToTangibleBook($price_to_tangible_book)
    {
        if (is_null($price_to_tangible_book)) {
            throw new \InvalidArgumentException('non-nullable price_to_tangible_book cannot be null');
        }
        $this->container['price_to_tangible_book'] = $price_to_tangible_book;

        return $this;
    }

    /**
     * Gets ps_ratio
     *
     * @return float|null
     */
    public function getPsRatio()
    {
        return $this->container['ps_ratio'];
    }

    /**
     * Sets ps_ratio
     *
     * @param float|null $ps_ratio Price–sales ratio, P/S ratio, or PSR, is a valuation metric for stocks.
     *
     * @return self
     */
    public function setPsRatio($ps_ratio)
    {
        if (is_null($ps_ratio)) {
            throw new \InvalidArgumentException('non-nullable ps_ratio cannot be null');
        }
        $this->container['ps_ratio'] = $ps_ratio;

        return $this;
    }

    /**
     * Gets rate_of_return_value
     *
     * @return float|null
     */
    public function getRateOfReturnValue()
    {
        return $this->container['rate_of_return_value'];
    }

    /**
     * Sets rate_of_return_value
     *
     * @param float|null $rate_of_return_value Yacktman defines forward rate of return as the normalized free cash flow yield plus real growth plus inflation.
     *
     * @return self
     */
    public function setRateOfReturnValue($rate_of_return_value)
    {
        if (is_null($rate_of_return_value)) {
            throw new \InvalidArgumentException('non-nullable rate_of_return_value cannot be null');
        }
        $this->container['rate_of_return_value'] = $rate_of_return_value;

        return $this;
    }

    /**
     * Gets shiller_pe_ratio
     *
     * @return float|null
     */
    public function getShillerPeRatio()
    {
        return $this->container['shiller_pe_ratio'];
    }

    /**
     * Sets shiller_pe_ratio
     *
     * @param float|null $shiller_pe_ratio Price earnings ratio is based on average inflation-adjusted earnings from the previous 10 years, known as the Cyclically Adjusted PE Ratio (CAPE Ratio), Shiller PE Ratio, or PE 10
     *
     * @return self
     */
    public function setShillerPeRatio($shiller_pe_ratio)
    {
        if (is_null($shiller_pe_ratio)) {
            throw new \InvalidArgumentException('non-nullable shiller_pe_ratio cannot be null');
        }
        $this->container['shiller_pe_ratio'] = $shiller_pe_ratio;

        return $this;
    }

    /**
     * Gets yield
     *
     * @return float|null
     */
    public function getYield()
    {
        return $this->container['yield'];
    }

    /**
     * Sets yield
     *
     * @param float|null $yield The dividend yield is the ratio of a company's annual dividend compared to its share price.
     *
     * @return self
     */
    public function setYield($yield)
    {
        if (is_null($yield)) {
            throw new \InvalidArgumentException('non-nullable yield cannot be null');
        }
        $this->container['yield'] = $yield;

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


