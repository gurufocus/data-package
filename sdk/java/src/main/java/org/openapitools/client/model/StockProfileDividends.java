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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * StockProfileDividends
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-11T01:10:00.357398434Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class StockProfileDividends {
  public static final String SERIALIZED_NAME_DIVIDEND2_F_F_O = "Dividend2FFO";
  @SerializedName(SERIALIZED_NAME_DIVIDEND2_F_F_O)
  @javax.annotation.Nullable
  private BigDecimal dividend2FFO;

  public static final String SERIALIZED_NAME_FORWARD_DIVIDEND = "ForwardDividend";
  @SerializedName(SERIALIZED_NAME_FORWARD_DIVIDEND)
  @javax.annotation.Nullable
  private BigDecimal forwardDividend;

  public static final String SERIALIZED_NAME_FORWARD_DIVIDEND_YIELD = "ForwardDividendYield";
  @SerializedName(SERIALIZED_NAME_FORWARD_DIVIDEND_YIELD)
  @javax.annotation.Nullable
  private BigDecimal forwardDividendYield;

  public static final String SERIALIZED_NAME_DIVIDEND_FREQ = "dividend_freq";
  @SerializedName(SERIALIZED_NAME_DIVIDEND_FREQ)
  @javax.annotation.Nullable
  private BigDecimal dividendFreq;

  public static final String SERIALIZED_NAME_DIVIDEND_MONTHS = "dividend_months";
  @SerializedName(SERIALIZED_NAME_DIVIDEND_MONTHS)
  @javax.annotation.Nullable
  private BigDecimal dividendMonths;

  public static final String SERIALIZED_NAME_DIVIDEND_STARTYEAR = "dividend_startyear";
  @SerializedName(SERIALIZED_NAME_DIVIDEND_STARTYEAR)
  @javax.annotation.Nullable
  private String dividendStartyear;

  public static final String SERIALIZED_NAME_DIVIDEND_STARTYEAR_REAL = "dividend_startyear_real";
  @SerializedName(SERIALIZED_NAME_DIVIDEND_STARTYEAR_REAL)
  @javax.annotation.Nullable
  private String dividendStartyearReal;

  public static final String SERIALIZED_NAME_INCREASE_DIVIDEND_STARTYEAR = "increase_dividend_startyear";
  @SerializedName(SERIALIZED_NAME_INCREASE_DIVIDEND_STARTYEAR)
  @javax.annotation.Nullable
  private String increaseDividendStartyear;

  public static final String SERIALIZED_NAME_NEXT_DIVIDEND_AMOUNT = "next_dividend_amount";
  @SerializedName(SERIALIZED_NAME_NEXT_DIVIDEND_AMOUNT)
  @javax.annotation.Nullable
  private String nextDividendAmount;

  public static final String SERIALIZED_NAME_NEXT_DIVIDEND_DATE = "next_dividend_date";
  @SerializedName(SERIALIZED_NAME_NEXT_DIVIDEND_DATE)
  @javax.annotation.Nullable
  private String nextDividendDate;

  public static final String SERIALIZED_NAME_PAYOUT = "payout";
  @SerializedName(SERIALIZED_NAME_PAYOUT)
  @javax.annotation.Nullable
  private BigDecimal payout;

  public static final String SERIALIZED_NAME_PAYOUT_HIGH = "payout_high";
  @SerializedName(SERIALIZED_NAME_PAYOUT_HIGH)
  @javax.annotation.Nullable
  private BigDecimal payoutHigh;

  public static final String SERIALIZED_NAME_PAYOUT_LOW = "payout_low";
  @SerializedName(SERIALIZED_NAME_PAYOUT_LOW)
  @javax.annotation.Nullable
  private BigDecimal payoutLow;

  public static final String SERIALIZED_NAME_PAYOUT_MED = "payout_med";
  @SerializedName(SERIALIZED_NAME_PAYOUT_MED)
  @javax.annotation.Nullable
  private BigDecimal payoutMed;

  public static final String SERIALIZED_NAME_TTM_DIVIDEND = "ttm_dividend";
  @SerializedName(SERIALIZED_NAME_TTM_DIVIDEND)
  @javax.annotation.Nullable
  private BigDecimal ttmDividend;

  public static final String SERIALIZED_NAME_YIELD = "yield";
  @SerializedName(SERIALIZED_NAME_YIELD)
  @javax.annotation.Nullable
  private BigDecimal yield;

  public static final String SERIALIZED_NAME_YIELD_HIGH = "yield_high";
  @SerializedName(SERIALIZED_NAME_YIELD_HIGH)
  @javax.annotation.Nullable
  private BigDecimal yieldHigh;

  public static final String SERIALIZED_NAME_YIELD_LOW = "yield_low";
  @SerializedName(SERIALIZED_NAME_YIELD_LOW)
  @javax.annotation.Nullable
  private BigDecimal yieldLow;

  public static final String SERIALIZED_NAME_YIELD_MED = "yield_med";
  @SerializedName(SERIALIZED_NAME_YIELD_MED)
  @javax.annotation.Nullable
  private BigDecimal yieldMed;

  public static final String SERIALIZED_NAME_YIELD_ON_COST = "yield_on_cost";
  @SerializedName(SERIALIZED_NAME_YIELD_ON_COST)
  @javax.annotation.Nullable
  private BigDecimal yieldOnCost;

  public static final String SERIALIZED_NAME_YIELD_ON_COST_HIGH = "yield_on_cost_high";
  @SerializedName(SERIALIZED_NAME_YIELD_ON_COST_HIGH)
  @javax.annotation.Nullable
  private BigDecimal yieldOnCostHigh;

  public static final String SERIALIZED_NAME_YIELD_ON_COST_LOW = "yield_on_cost_low";
  @SerializedName(SERIALIZED_NAME_YIELD_ON_COST_LOW)
  @javax.annotation.Nullable
  private BigDecimal yieldOnCostLow;

  public static final String SERIALIZED_NAME_YIELD_ON_COST_MED = "yield_on_cost_med";
  @SerializedName(SERIALIZED_NAME_YIELD_ON_COST_MED)
  @javax.annotation.Nullable
  private BigDecimal yieldOnCostMed;

  public StockProfileDividends() {
  }

  public StockProfileDividends dividend2FFO(@javax.annotation.Nullable BigDecimal dividend2FFO) {
    this.dividend2FFO = dividend2FFO;
    return this;
  }

  /**
   * Cash dividends declared on the company&#39;s primary issue of common stock as a percent of funds from operations, on a per-share basis
   * @return dividend2FFO
   */
  @javax.annotation.Nullable
  public BigDecimal getDividend2FFO() {
    return dividend2FFO;
  }

  public void setDividend2FFO(@javax.annotation.Nullable BigDecimal dividend2FFO) {
    this.dividend2FFO = dividend2FFO;
  }


  public StockProfileDividends forwardDividend(@javax.annotation.Nullable BigDecimal forwardDividend) {
    this.forwardDividend = forwardDividend;
    return this;
  }

  /**
   * The aggregate amount of expected dividends for the next 12 months
   * @return forwardDividend
   */
  @javax.annotation.Nullable
  public BigDecimal getForwardDividend() {
    return forwardDividend;
  }

  public void setForwardDividend(@javax.annotation.Nullable BigDecimal forwardDividend) {
    this.forwardDividend = forwardDividend;
  }


  public StockProfileDividends forwardDividendYield(@javax.annotation.Nullable BigDecimal forwardDividendYield) {
    this.forwardDividendYield = forwardDividendYield;
    return this;
  }

  /**
   * A forward dividend yield is an estimation of a year&#39;s dividend expressed as a percentage of the current stock price.
   * @return forwardDividendYield
   */
  @javax.annotation.Nullable
  public BigDecimal getForwardDividendYield() {
    return forwardDividendYield;
  }

  public void setForwardDividendYield(@javax.annotation.Nullable BigDecimal forwardDividendYield) {
    this.forwardDividendYield = forwardDividendYield;
  }


  public StockProfileDividends dividendFreq(@javax.annotation.Nullable BigDecimal dividendFreq) {
    this.dividendFreq = dividendFreq;
    return this;
  }

  /**
   * The number of times a company pays a dividend per year. Example: 4 means quarterly.
   * @return dividendFreq
   */
  @javax.annotation.Nullable
  public BigDecimal getDividendFreq() {
    return dividendFreq;
  }

  public void setDividendFreq(@javax.annotation.Nullable BigDecimal dividendFreq) {
    this.dividendFreq = dividendFreq;
  }


  public StockProfileDividends dividendMonths(@javax.annotation.Nullable BigDecimal dividendMonths) {
    this.dividendMonths = dividendMonths;
    return this;
  }

  /**
   * The months where the company pays its dividend.
   * @return dividendMonths
   */
  @javax.annotation.Nullable
  public BigDecimal getDividendMonths() {
    return dividendMonths;
  }

  public void setDividendMonths(@javax.annotation.Nullable BigDecimal dividendMonths) {
    this.dividendMonths = dividendMonths;
  }


  public StockProfileDividends dividendStartyear(@javax.annotation.Nullable String dividendStartyear) {
    this.dividendStartyear = dividendStartyear;
    return this;
  }

  /**
   * The starting year for dividends that either remain consistent or increase in the subsequent years.
   * @return dividendStartyear
   */
  @javax.annotation.Nullable
  public String getDividendStartyear() {
    return dividendStartyear;
  }

  public void setDividendStartyear(@javax.annotation.Nullable String dividendStartyear) {
    this.dividendStartyear = dividendStartyear;
  }


  public StockProfileDividends dividendStartyearReal(@javax.annotation.Nullable String dividendStartyearReal) {
    this.dividendStartyearReal = dividendStartyearReal;
    return this;
  }

  /**
   * The starting year for the first dividend payments available on GuruFocus.
   * @return dividendStartyearReal
   */
  @javax.annotation.Nullable
  public String getDividendStartyearReal() {
    return dividendStartyearReal;
  }

  public void setDividendStartyearReal(@javax.annotation.Nullable String dividendStartyearReal) {
    this.dividendStartyearReal = dividendStartyearReal;
  }


  public StockProfileDividends increaseDividendStartyear(@javax.annotation.Nullable String increaseDividendStartyear) {
    this.increaseDividendStartyear = increaseDividendStartyear;
    return this;
  }

  /**
   * The starting year from which dividends have consistently increased in subsequent years.
   * @return increaseDividendStartyear
   */
  @javax.annotation.Nullable
  public String getIncreaseDividendStartyear() {
    return increaseDividendStartyear;
  }

  public void setIncreaseDividendStartyear(@javax.annotation.Nullable String increaseDividendStartyear) {
    this.increaseDividendStartyear = increaseDividendStartyear;
  }


  public StockProfileDividends nextDividendAmount(@javax.annotation.Nullable String nextDividendAmount) {
    this.nextDividendAmount = nextDividendAmount;
    return this;
  }

  /**
   * The amount of the company&#39;s next dividend
   * @return nextDividendAmount
   */
  @javax.annotation.Nullable
  public String getNextDividendAmount() {
    return nextDividendAmount;
  }

  public void setNextDividendAmount(@javax.annotation.Nullable String nextDividendAmount) {
    this.nextDividendAmount = nextDividendAmount;
  }


  public StockProfileDividends nextDividendDate(@javax.annotation.Nullable String nextDividendDate) {
    this.nextDividendDate = nextDividendDate;
    return this;
  }

  /**
   * The next date the company goes ex-dividend.
   * @return nextDividendDate
   */
  @javax.annotation.Nullable
  public String getNextDividendDate() {
    return nextDividendDate;
  }

  public void setNextDividendDate(@javax.annotation.Nullable String nextDividendDate) {
    this.nextDividendDate = nextDividendDate;
  }


  public StockProfileDividends payout(@javax.annotation.Nullable BigDecimal payout) {
    this.payout = payout;
    return this;
  }

  /**
   * The dividend payout ratio is the ratio of the total amount of dividends paid out to shareholders relative to the net income of the company.
   * @return payout
   */
  @javax.annotation.Nullable
  public BigDecimal getPayout() {
    return payout;
  }

  public void setPayout(@javax.annotation.Nullable BigDecimal payout) {
    this.payout = payout;
  }


  public StockProfileDividends payoutHigh(@javax.annotation.Nullable BigDecimal payoutHigh) {
    this.payoutHigh = payoutHigh;
    return this;
  }

  /**
   * The dividend payout ratio is the ratio of the total amount of dividends paid out to shareholders relative to the net income of the company.
   * @return payoutHigh
   */
  @javax.annotation.Nullable
  public BigDecimal getPayoutHigh() {
    return payoutHigh;
  }

  public void setPayoutHigh(@javax.annotation.Nullable BigDecimal payoutHigh) {
    this.payoutHigh = payoutHigh;
  }


  public StockProfileDividends payoutLow(@javax.annotation.Nullable BigDecimal payoutLow) {
    this.payoutLow = payoutLow;
    return this;
  }

  /**
   * The dividend payout ratio is the ratio of the total amount of dividends paid out to shareholders relative to the net income of the company.
   * @return payoutLow
   */
  @javax.annotation.Nullable
  public BigDecimal getPayoutLow() {
    return payoutLow;
  }

  public void setPayoutLow(@javax.annotation.Nullable BigDecimal payoutLow) {
    this.payoutLow = payoutLow;
  }


  public StockProfileDividends payoutMed(@javax.annotation.Nullable BigDecimal payoutMed) {
    this.payoutMed = payoutMed;
    return this;
  }

  /**
   * The dividend payout ratio is the ratio of the total amount of dividends paid out to shareholders relative to the net income of the company.
   * @return payoutMed
   */
  @javax.annotation.Nullable
  public BigDecimal getPayoutMed() {
    return payoutMed;
  }

  public void setPayoutMed(@javax.annotation.Nullable BigDecimal payoutMed) {
    this.payoutMed = payoutMed;
  }


  public StockProfileDividends ttmDividend(@javax.annotation.Nullable BigDecimal ttmDividend) {
    this.ttmDividend = ttmDividend;
    return this;
  }

  /**
   * The aggregate amount of dividends over the trailing 12 months
   * @return ttmDividend
   */
  @javax.annotation.Nullable
  public BigDecimal getTtmDividend() {
    return ttmDividend;
  }

  public void setTtmDividend(@javax.annotation.Nullable BigDecimal ttmDividend) {
    this.ttmDividend = ttmDividend;
  }


  public StockProfileDividends yield(@javax.annotation.Nullable BigDecimal yield) {
    this.yield = yield;
    return this;
  }

  /**
   * The dividend yield is the ratio of a company&#39;s annual dividend compared to its share price.
   * @return yield
   */
  @javax.annotation.Nullable
  public BigDecimal getYield() {
    return yield;
  }

  public void setYield(@javax.annotation.Nullable BigDecimal yield) {
    this.yield = yield;
  }


  public StockProfileDividends yieldHigh(@javax.annotation.Nullable BigDecimal yieldHigh) {
    this.yieldHigh = yieldHigh;
    return this;
  }

  /**
   * The dividend yield is the ratio of a company&#39;s annual dividend compared to its share price.
   * @return yieldHigh
   */
  @javax.annotation.Nullable
  public BigDecimal getYieldHigh() {
    return yieldHigh;
  }

  public void setYieldHigh(@javax.annotation.Nullable BigDecimal yieldHigh) {
    this.yieldHigh = yieldHigh;
  }


  public StockProfileDividends yieldLow(@javax.annotation.Nullable BigDecimal yieldLow) {
    this.yieldLow = yieldLow;
    return this;
  }

  /**
   * The dividend yield is the ratio of a company&#39;s annual dividend compared to its share price.
   * @return yieldLow
   */
  @javax.annotation.Nullable
  public BigDecimal getYieldLow() {
    return yieldLow;
  }

  public void setYieldLow(@javax.annotation.Nullable BigDecimal yieldLow) {
    this.yieldLow = yieldLow;
  }


  public StockProfileDividends yieldMed(@javax.annotation.Nullable BigDecimal yieldMed) {
    this.yieldMed = yieldMed;
    return this;
  }

  /**
   * The dividend yield is the ratio of a company&#39;s annual dividend compared to its share price.
   * @return yieldMed
   */
  @javax.annotation.Nullable
  public BigDecimal getYieldMed() {
    return yieldMed;
  }

  public void setYieldMed(@javax.annotation.Nullable BigDecimal yieldMed) {
    this.yieldMed = yieldMed;
  }


  public StockProfileDividends yieldOnCost(@javax.annotation.Nullable BigDecimal yieldOnCost) {
    this.yieldOnCost = yieldOnCost;
    return this;
  }

  /**
   * Yield on Cost (YOC) is the annual dividend rate of a security, divided by its average cost basis.
   * @return yieldOnCost
   */
  @javax.annotation.Nullable
  public BigDecimal getYieldOnCost() {
    return yieldOnCost;
  }

  public void setYieldOnCost(@javax.annotation.Nullable BigDecimal yieldOnCost) {
    this.yieldOnCost = yieldOnCost;
  }


  public StockProfileDividends yieldOnCostHigh(@javax.annotation.Nullable BigDecimal yieldOnCostHigh) {
    this.yieldOnCostHigh = yieldOnCostHigh;
    return this;
  }

  /**
   * The highest yield-on-cost over the past 10 years
   * @return yieldOnCostHigh
   */
  @javax.annotation.Nullable
  public BigDecimal getYieldOnCostHigh() {
    return yieldOnCostHigh;
  }

  public void setYieldOnCostHigh(@javax.annotation.Nullable BigDecimal yieldOnCostHigh) {
    this.yieldOnCostHigh = yieldOnCostHigh;
  }


  public StockProfileDividends yieldOnCostLow(@javax.annotation.Nullable BigDecimal yieldOnCostLow) {
    this.yieldOnCostLow = yieldOnCostLow;
    return this;
  }

  /**
   * The lowest yield-on-cost over the past 10 years
   * @return yieldOnCostLow
   */
  @javax.annotation.Nullable
  public BigDecimal getYieldOnCostLow() {
    return yieldOnCostLow;
  }

  public void setYieldOnCostLow(@javax.annotation.Nullable BigDecimal yieldOnCostLow) {
    this.yieldOnCostLow = yieldOnCostLow;
  }


  public StockProfileDividends yieldOnCostMed(@javax.annotation.Nullable BigDecimal yieldOnCostMed) {
    this.yieldOnCostMed = yieldOnCostMed;
    return this;
  }

  /**
   * The median yield-on-cost over the past 10 years
   * @return yieldOnCostMed
   */
  @javax.annotation.Nullable
  public BigDecimal getYieldOnCostMed() {
    return yieldOnCostMed;
  }

  public void setYieldOnCostMed(@javax.annotation.Nullable BigDecimal yieldOnCostMed) {
    this.yieldOnCostMed = yieldOnCostMed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockProfileDividends stockProfileDividends = (StockProfileDividends) o;
    return Objects.equals(this.dividend2FFO, stockProfileDividends.dividend2FFO) &&
        Objects.equals(this.forwardDividend, stockProfileDividends.forwardDividend) &&
        Objects.equals(this.forwardDividendYield, stockProfileDividends.forwardDividendYield) &&
        Objects.equals(this.dividendFreq, stockProfileDividends.dividendFreq) &&
        Objects.equals(this.dividendMonths, stockProfileDividends.dividendMonths) &&
        Objects.equals(this.dividendStartyear, stockProfileDividends.dividendStartyear) &&
        Objects.equals(this.dividendStartyearReal, stockProfileDividends.dividendStartyearReal) &&
        Objects.equals(this.increaseDividendStartyear, stockProfileDividends.increaseDividendStartyear) &&
        Objects.equals(this.nextDividendAmount, stockProfileDividends.nextDividendAmount) &&
        Objects.equals(this.nextDividendDate, stockProfileDividends.nextDividendDate) &&
        Objects.equals(this.payout, stockProfileDividends.payout) &&
        Objects.equals(this.payoutHigh, stockProfileDividends.payoutHigh) &&
        Objects.equals(this.payoutLow, stockProfileDividends.payoutLow) &&
        Objects.equals(this.payoutMed, stockProfileDividends.payoutMed) &&
        Objects.equals(this.ttmDividend, stockProfileDividends.ttmDividend) &&
        Objects.equals(this.yield, stockProfileDividends.yield) &&
        Objects.equals(this.yieldHigh, stockProfileDividends.yieldHigh) &&
        Objects.equals(this.yieldLow, stockProfileDividends.yieldLow) &&
        Objects.equals(this.yieldMed, stockProfileDividends.yieldMed) &&
        Objects.equals(this.yieldOnCost, stockProfileDividends.yieldOnCost) &&
        Objects.equals(this.yieldOnCostHigh, stockProfileDividends.yieldOnCostHigh) &&
        Objects.equals(this.yieldOnCostLow, stockProfileDividends.yieldOnCostLow) &&
        Objects.equals(this.yieldOnCostMed, stockProfileDividends.yieldOnCostMed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dividend2FFO, forwardDividend, forwardDividendYield, dividendFreq, dividendMonths, dividendStartyear, dividendStartyearReal, increaseDividendStartyear, nextDividendAmount, nextDividendDate, payout, payoutHigh, payoutLow, payoutMed, ttmDividend, yield, yieldHigh, yieldLow, yieldMed, yieldOnCost, yieldOnCostHigh, yieldOnCostLow, yieldOnCostMed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockProfileDividends {\n");
    sb.append("    dividend2FFO: ").append(toIndentedString(dividend2FFO)).append("\n");
    sb.append("    forwardDividend: ").append(toIndentedString(forwardDividend)).append("\n");
    sb.append("    forwardDividendYield: ").append(toIndentedString(forwardDividendYield)).append("\n");
    sb.append("    dividendFreq: ").append(toIndentedString(dividendFreq)).append("\n");
    sb.append("    dividendMonths: ").append(toIndentedString(dividendMonths)).append("\n");
    sb.append("    dividendStartyear: ").append(toIndentedString(dividendStartyear)).append("\n");
    sb.append("    dividendStartyearReal: ").append(toIndentedString(dividendStartyearReal)).append("\n");
    sb.append("    increaseDividendStartyear: ").append(toIndentedString(increaseDividendStartyear)).append("\n");
    sb.append("    nextDividendAmount: ").append(toIndentedString(nextDividendAmount)).append("\n");
    sb.append("    nextDividendDate: ").append(toIndentedString(nextDividendDate)).append("\n");
    sb.append("    payout: ").append(toIndentedString(payout)).append("\n");
    sb.append("    payoutHigh: ").append(toIndentedString(payoutHigh)).append("\n");
    sb.append("    payoutLow: ").append(toIndentedString(payoutLow)).append("\n");
    sb.append("    payoutMed: ").append(toIndentedString(payoutMed)).append("\n");
    sb.append("    ttmDividend: ").append(toIndentedString(ttmDividend)).append("\n");
    sb.append("    yield: ").append(toIndentedString(yield)).append("\n");
    sb.append("    yieldHigh: ").append(toIndentedString(yieldHigh)).append("\n");
    sb.append("    yieldLow: ").append(toIndentedString(yieldLow)).append("\n");
    sb.append("    yieldMed: ").append(toIndentedString(yieldMed)).append("\n");
    sb.append("    yieldOnCost: ").append(toIndentedString(yieldOnCost)).append("\n");
    sb.append("    yieldOnCostHigh: ").append(toIndentedString(yieldOnCostHigh)).append("\n");
    sb.append("    yieldOnCostLow: ").append(toIndentedString(yieldOnCostLow)).append("\n");
    sb.append("    yieldOnCostMed: ").append(toIndentedString(yieldOnCostMed)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("Dividend2FFO");
    openapiFields.add("ForwardDividend");
    openapiFields.add("ForwardDividendYield");
    openapiFields.add("dividend_freq");
    openapiFields.add("dividend_months");
    openapiFields.add("dividend_startyear");
    openapiFields.add("dividend_startyear_real");
    openapiFields.add("increase_dividend_startyear");
    openapiFields.add("next_dividend_amount");
    openapiFields.add("next_dividend_date");
    openapiFields.add("payout");
    openapiFields.add("payout_high");
    openapiFields.add("payout_low");
    openapiFields.add("payout_med");
    openapiFields.add("ttm_dividend");
    openapiFields.add("yield");
    openapiFields.add("yield_high");
    openapiFields.add("yield_low");
    openapiFields.add("yield_med");
    openapiFields.add("yield_on_cost");
    openapiFields.add("yield_on_cost_high");
    openapiFields.add("yield_on_cost_low");
    openapiFields.add("yield_on_cost_med");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StockProfileDividends
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StockProfileDividends.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StockProfileDividends is not found in the empty JSON string", StockProfileDividends.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StockProfileDividends.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StockProfileDividends` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dividend_startyear") != null && !jsonObj.get("dividend_startyear").isJsonNull()) && !jsonObj.get("dividend_startyear").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dividend_startyear` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dividend_startyear").toString()));
      }
      if ((jsonObj.get("dividend_startyear_real") != null && !jsonObj.get("dividend_startyear_real").isJsonNull()) && !jsonObj.get("dividend_startyear_real").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dividend_startyear_real` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dividend_startyear_real").toString()));
      }
      if ((jsonObj.get("increase_dividend_startyear") != null && !jsonObj.get("increase_dividend_startyear").isJsonNull()) && !jsonObj.get("increase_dividend_startyear").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `increase_dividend_startyear` to be a primitive type in the JSON string but got `%s`", jsonObj.get("increase_dividend_startyear").toString()));
      }
      if ((jsonObj.get("next_dividend_amount") != null && !jsonObj.get("next_dividend_amount").isJsonNull()) && !jsonObj.get("next_dividend_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_dividend_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_dividend_amount").toString()));
      }
      if ((jsonObj.get("next_dividend_date") != null && !jsonObj.get("next_dividend_date").isJsonNull()) && !jsonObj.get("next_dividend_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_dividend_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_dividend_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StockProfileDividends.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StockProfileDividends' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StockProfileDividends> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StockProfileDividends.class));

       return (TypeAdapter<T>) new TypeAdapter<StockProfileDividends>() {
           @Override
           public void write(JsonWriter out, StockProfileDividends value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StockProfileDividends read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of StockProfileDividends given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StockProfileDividends
   * @throws IOException if the JSON string is invalid with respect to StockProfileDividends
   */
  public static StockProfileDividends fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StockProfileDividends.class);
  }

  /**
   * Convert an instance of StockProfileDividends to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

