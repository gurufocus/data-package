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
 * Guru transaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-11T01:10:00.357398434Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class GuruTransaction {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  @javax.annotation.Nullable
  private String action;

  public static final String SERIALIZED_NAME_CHANGE = "change";
  @SerializedName(SERIALIZED_NAME_CHANGE)
  @javax.annotation.Nullable
  private BigDecimal change;

  public static final String SERIALIZED_NAME_PROPERTY_CLASS = "class";
  @SerializedName(SERIALIZED_NAME_PROPERTY_CLASS)
  @javax.annotation.Nullable
  private String propertyClass;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  @javax.annotation.Nullable
  private String comment;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  @javax.annotation.Nullable
  private String companyName;

  public static final String SERIALIZED_NAME_EXCHANGE = "exchange";
  @SerializedName(SERIALIZED_NAME_EXCHANGE)
  @javax.annotation.Nullable
  private String exchange;

  public static final String SERIALIZED_NAME_IMPACT = "impact";
  @SerializedName(SERIALIZED_NAME_IMPACT)
  @javax.annotation.Nullable
  private BigDecimal impact;

  public static final String SERIALIZED_NAME_INDUSTRY_CODE = "industry_code";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_CODE)
  @javax.annotation.Nullable
  private BigDecimal industryCode;

  public static final String SERIALIZED_NAME_PORTDATE = "portdate";
  @SerializedName(SERIALIZED_NAME_PORTDATE)
  @javax.annotation.Nullable
  private String portdate;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  @javax.annotation.Nullable
  private BigDecimal position;

  public static final String SERIALIZED_NAME_PRICE_AVG = "price_avg";
  @SerializedName(SERIALIZED_NAME_PRICE_AVG)
  @javax.annotation.Nullable
  private BigDecimal priceAvg;

  public static final String SERIALIZED_NAME_PRICE_MAX = "price_max";
  @SerializedName(SERIALIZED_NAME_PRICE_MAX)
  @javax.annotation.Nullable
  private BigDecimal priceMax;

  public static final String SERIALIZED_NAME_PRICE_MIN = "price_min";
  @SerializedName(SERIALIZED_NAME_PRICE_MIN)
  @javax.annotation.Nullable
  private BigDecimal priceMin;

  public static final String SERIALIZED_NAME_SHARE_CHANGE = "share_change";
  @SerializedName(SERIALIZED_NAME_SHARE_CHANGE)
  @javax.annotation.Nullable
  private BigDecimal shareChange;

  public static final String SERIALIZED_NAME_SHARES = "shares";
  @SerializedName(SERIALIZED_NAME_SHARES)
  @javax.annotation.Nullable
  private BigDecimal shares;

  public static final String SERIALIZED_NAME_SHARES_OUTSTANDING = "shares_outstanding";
  @SerializedName(SERIALIZED_NAME_SHARES_OUTSTANDING)
  @javax.annotation.Nullable
  private BigDecimal sharesOutstanding;

  public static final String SERIALIZED_NAME_SPLIT_FACTOR = "split_factor";
  @SerializedName(SERIALIZED_NAME_SPLIT_FACTOR)
  @javax.annotation.Nullable
  private BigDecimal splitFactor;

  public static final String SERIALIZED_NAME_STOCKID = "stockid";
  @SerializedName(SERIALIZED_NAME_STOCKID)
  @javax.annotation.Nullable
  private String stockid;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  @javax.annotation.Nullable
  private String symbol;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  @javax.annotation.Nullable
  private BigDecimal value;

  public GuruTransaction() {
  }

  public GuruTransaction action(@javax.annotation.Nullable String action) {
    this.action = action;
    return this;
  }

  /**
   * The transaction type: add, buy, reduce, sold out
   * @return action
   */
  @javax.annotation.Nullable
  public String getAction() {
    return action;
  }

  public void setAction(@javax.annotation.Nullable String action) {
    this.action = action;
  }


  public GuruTransaction change(@javax.annotation.Nullable BigDecimal change) {
    this.change = change;
    return this;
  }

  /**
   * Get change
   * @return change
   */
  @javax.annotation.Nullable
  public BigDecimal getChange() {
    return change;
  }

  public void setChange(@javax.annotation.Nullable BigDecimal change) {
    this.change = change;
  }


  public GuruTransaction propertyClass(@javax.annotation.Nullable String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  /**
   * A unique identifier that describes the stock ticker&#39;s share class. Examples: Class A, Class C, ADR
   * @return propertyClass
   */
  @javax.annotation.Nullable
  public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(@javax.annotation.Nullable String propertyClass) {
    this.propertyClass = propertyClass;
  }


  public GuruTransaction comment(@javax.annotation.Nullable String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(@javax.annotation.Nullable String comment) {
    this.comment = comment;
  }


  public GuruTransaction companyName(@javax.annotation.Nullable String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
   */
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(@javax.annotation.Nullable String companyName) {
    this.companyName = companyName;
  }


  public GuruTransaction exchange(@javax.annotation.Nullable String exchange) {
    this.exchange = exchange;
    return this;
  }

  /**
   * The company&#39;s stock exchange. Example: NAS for Apple.
   * @return exchange
   */
  @javax.annotation.Nullable
  public String getExchange() {
    return exchange;
  }

  public void setExchange(@javax.annotation.Nullable String exchange) {
    this.exchange = exchange;
  }


  public GuruTransaction impact(@javax.annotation.Nullable BigDecimal impact) {
    this.impact = impact;
    return this;
  }

  /**
   * The ratio of the dollar value of the transaction relative to the total value of the portfolio.
   * @return impact
   */
  @javax.annotation.Nullable
  public BigDecimal getImpact() {
    return impact;
  }

  public void setImpact(@javax.annotation.Nullable BigDecimal impact) {
    this.impact = impact;
  }


  public GuruTransaction industryCode(@javax.annotation.Nullable BigDecimal industryCode) {
    this.industryCode = industryCode;
    return this;
  }

  /**
   * Get industryCode
   * @return industryCode
   */
  @javax.annotation.Nullable
  public BigDecimal getIndustryCode() {
    return industryCode;
  }

  public void setIndustryCode(@javax.annotation.Nullable BigDecimal industryCode) {
    this.industryCode = industryCode;
  }


  public GuruTransaction portdate(@javax.annotation.Nullable String portdate) {
    this.portdate = portdate;
    return this;
  }

  /**
   * If the date is the end of quarters, the trades are made during the quarter ended on the dates. Otherwise, the dates are the estimated trade dates.
   * @return portdate
   */
  @javax.annotation.Nullable
  public String getPortdate() {
    return portdate;
  }

  public void setPortdate(@javax.annotation.Nullable String portdate) {
    this.portdate = portdate;
  }


  public GuruTransaction position(@javax.annotation.Nullable BigDecimal position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
   */
  @javax.annotation.Nullable
  public BigDecimal getPosition() {
    return position;
  }

  public void setPosition(@javax.annotation.Nullable BigDecimal position) {
    this.position = position;
  }


  public GuruTransaction priceAvg(@javax.annotation.Nullable BigDecimal priceAvg) {
    this.priceAvg = priceAvg;
    return this;
  }

  /**
   * Get priceAvg
   * @return priceAvg
   */
  @javax.annotation.Nullable
  public BigDecimal getPriceAvg() {
    return priceAvg;
  }

  public void setPriceAvg(@javax.annotation.Nullable BigDecimal priceAvg) {
    this.priceAvg = priceAvg;
  }


  public GuruTransaction priceMax(@javax.annotation.Nullable BigDecimal priceMax) {
    this.priceMax = priceMax;
    return this;
  }

  /**
   * For a guru trade, the highest trading price over a specific quarter
   * @return priceMax
   */
  @javax.annotation.Nullable
  public BigDecimal getPriceMax() {
    return priceMax;
  }

  public void setPriceMax(@javax.annotation.Nullable BigDecimal priceMax) {
    this.priceMax = priceMax;
  }


  public GuruTransaction priceMin(@javax.annotation.Nullable BigDecimal priceMin) {
    this.priceMin = priceMin;
    return this;
  }

  /**
   * For a guru trade, the minimum trading price over a specific quarter
   * @return priceMin
   */
  @javax.annotation.Nullable
  public BigDecimal getPriceMin() {
    return priceMin;
  }

  public void setPriceMin(@javax.annotation.Nullable BigDecimal priceMin) {
    this.priceMin = priceMin;
  }


  public GuruTransaction shareChange(@javax.annotation.Nullable BigDecimal shareChange) {
    this.shareChange = shareChange;
    return this;
  }

  /**
   * Get shareChange
   * @return shareChange
   */
  @javax.annotation.Nullable
  public BigDecimal getShareChange() {
    return shareChange;
  }

  public void setShareChange(@javax.annotation.Nullable BigDecimal shareChange) {
    this.shareChange = shareChange;
  }


  public GuruTransaction shares(@javax.annotation.Nullable BigDecimal shares) {
    this.shares = shares;
    return this;
  }

  /**
   * Outstanding shares refer to a company&#39;s stock currently held by all its shareholders, including share blocks held by institutional investors and restricted shares owned by the company&#39;s officers and insiders.
   * @return shares
   */
  @javax.annotation.Nullable
  public BigDecimal getShares() {
    return shares;
  }

  public void setShares(@javax.annotation.Nullable BigDecimal shares) {
    this.shares = shares;
  }


  public GuruTransaction sharesOutstanding(@javax.annotation.Nullable BigDecimal sharesOutstanding) {
    this.sharesOutstanding = sharesOutstanding;
    return this;
  }

  /**
   * &lt;p&gt;{{Cash_Flow_from_Others}} may include {{ChangeInWorkingCapital}}. These are cash differences caused by the {{ChangeInInventory}}, {{AccountsPayable}}, {{Accts_Rec}} etc. For instance, if a company pays its suppliers slower, its cash position will build up faster. If a company receives payments from its customers slower, its {{Accts_Rec}} will rise, and its cash position will grow more slowly (or even shrink).&lt;/p&gt;
   * @return sharesOutstanding
   */
  @javax.annotation.Nullable
  public BigDecimal getSharesOutstanding() {
    return sharesOutstanding;
  }

  public void setSharesOutstanding(@javax.annotation.Nullable BigDecimal sharesOutstanding) {
    this.sharesOutstanding = sharesOutstanding;
  }


  public GuruTransaction splitFactor(@javax.annotation.Nullable BigDecimal splitFactor) {
    this.splitFactor = splitFactor;
    return this;
  }

  /**
   * Get splitFactor
   * @return splitFactor
   */
  @javax.annotation.Nullable
  public BigDecimal getSplitFactor() {
    return splitFactor;
  }

  public void setSplitFactor(@javax.annotation.Nullable BigDecimal splitFactor) {
    this.splitFactor = splitFactor;
  }


  public GuruTransaction stockid(@javax.annotation.Nullable String stockid) {
    this.stockid = stockid;
    return this;
  }

  /**
   * A unique identifier for the stock
   * @return stockid
   */
  @javax.annotation.Nullable
  public String getStockid() {
    return stockid;
  }

  public void setStockid(@javax.annotation.Nullable String stockid) {
    this.stockid = stockid;
  }


  public GuruTransaction symbol(@javax.annotation.Nullable String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * The company&#39;s stock ticker symbol
   * @return symbol
   */
  @javax.annotation.Nullable
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(@javax.annotation.Nullable String symbol) {
    this.symbol = symbol;
  }


  public GuruTransaction value(@javax.annotation.Nullable BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @javax.annotation.Nullable
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(@javax.annotation.Nullable BigDecimal value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuruTransaction guruTransaction = (GuruTransaction) o;
    return Objects.equals(this.action, guruTransaction.action) &&
        Objects.equals(this.change, guruTransaction.change) &&
        Objects.equals(this.propertyClass, guruTransaction.propertyClass) &&
        Objects.equals(this.comment, guruTransaction.comment) &&
        Objects.equals(this.companyName, guruTransaction.companyName) &&
        Objects.equals(this.exchange, guruTransaction.exchange) &&
        Objects.equals(this.impact, guruTransaction.impact) &&
        Objects.equals(this.industryCode, guruTransaction.industryCode) &&
        Objects.equals(this.portdate, guruTransaction.portdate) &&
        Objects.equals(this.position, guruTransaction.position) &&
        Objects.equals(this.priceAvg, guruTransaction.priceAvg) &&
        Objects.equals(this.priceMax, guruTransaction.priceMax) &&
        Objects.equals(this.priceMin, guruTransaction.priceMin) &&
        Objects.equals(this.shareChange, guruTransaction.shareChange) &&
        Objects.equals(this.shares, guruTransaction.shares) &&
        Objects.equals(this.sharesOutstanding, guruTransaction.sharesOutstanding) &&
        Objects.equals(this.splitFactor, guruTransaction.splitFactor) &&
        Objects.equals(this.stockid, guruTransaction.stockid) &&
        Objects.equals(this.symbol, guruTransaction.symbol) &&
        Objects.equals(this.value, guruTransaction.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, change, propertyClass, comment, companyName, exchange, impact, industryCode, portdate, position, priceAvg, priceMax, priceMin, shareChange, shares, sharesOutstanding, splitFactor, stockid, symbol, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuruTransaction {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    industryCode: ").append(toIndentedString(industryCode)).append("\n");
    sb.append("    portdate: ").append(toIndentedString(portdate)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    priceAvg: ").append(toIndentedString(priceAvg)).append("\n");
    sb.append("    priceMax: ").append(toIndentedString(priceMax)).append("\n");
    sb.append("    priceMin: ").append(toIndentedString(priceMin)).append("\n");
    sb.append("    shareChange: ").append(toIndentedString(shareChange)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    sharesOutstanding: ").append(toIndentedString(sharesOutstanding)).append("\n");
    sb.append("    splitFactor: ").append(toIndentedString(splitFactor)).append("\n");
    sb.append("    stockid: ").append(toIndentedString(stockid)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("change");
    openapiFields.add("class");
    openapiFields.add("comment");
    openapiFields.add("company_name");
    openapiFields.add("exchange");
    openapiFields.add("impact");
    openapiFields.add("industry_code");
    openapiFields.add("portdate");
    openapiFields.add("position");
    openapiFields.add("price_avg");
    openapiFields.add("price_max");
    openapiFields.add("price_min");
    openapiFields.add("share_change");
    openapiFields.add("shares");
    openapiFields.add("shares_outstanding");
    openapiFields.add("split_factor");
    openapiFields.add("stockid");
    openapiFields.add("symbol");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GuruTransaction
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GuruTransaction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GuruTransaction is not found in the empty JSON string", GuruTransaction.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GuruTransaction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GuruTransaction` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if ((jsonObj.get("class") != null && !jsonObj.get("class").isJsonNull()) && !jsonObj.get("class").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `class` to be a primitive type in the JSON string but got `%s`", jsonObj.get("class").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("company_name") != null && !jsonObj.get("company_name").isJsonNull()) && !jsonObj.get("company_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_name").toString()));
      }
      if ((jsonObj.get("exchange") != null && !jsonObj.get("exchange").isJsonNull()) && !jsonObj.get("exchange").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exchange` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exchange").toString()));
      }
      if ((jsonObj.get("portdate") != null && !jsonObj.get("portdate").isJsonNull()) && !jsonObj.get("portdate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `portdate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("portdate").toString()));
      }
      if ((jsonObj.get("stockid") != null && !jsonObj.get("stockid").isJsonNull()) && !jsonObj.get("stockid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stockid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stockid").toString()));
      }
      if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull()) && !jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GuruTransaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GuruTransaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GuruTransaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GuruTransaction.class));

       return (TypeAdapter<T>) new TypeAdapter<GuruTransaction>() {
           @Override
           public void write(JsonWriter out, GuruTransaction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GuruTransaction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GuruTransaction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GuruTransaction
   * @throws IOException if the JSON string is invalid with respect to GuruTransaction
   */
  public static GuruTransaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GuruTransaction.class);
  }

  /**
   * Convert an instance of GuruTransaction to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

