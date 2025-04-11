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
 * ValuationsIREITNODIRECTBasicInformation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-11T01:10:00.357398434Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class ValuationsIREITNODIRECTBasicInformation {
  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  @javax.annotation.Nullable
  private String company;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  @javax.annotation.Nullable
  private String companyId;

  public static final String SERIALIZED_NAME_EXCHANGE = "exchange";
  @SerializedName(SERIALIZED_NAME_EXCHANGE)
  @javax.annotation.Nullable
  private String exchange;

  public static final String SERIALIZED_NAME_STOCKID = "stockid";
  @SerializedName(SERIALIZED_NAME_STOCKID)
  @javax.annotation.Nullable
  private String stockid;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  @javax.annotation.Nullable
  private String symbol;

  public ValuationsIREITNODIRECTBasicInformation() {
  }

  public ValuationsIREITNODIRECTBasicInformation company(@javax.annotation.Nullable String company) {
    this.company = company;
    return this;
  }

  /**
   * The name of the company as identified on its SEC filings.
   * @return company
   */
  @javax.annotation.Nullable
  public String getCompany() {
    return company;
  }

  public void setCompany(@javax.annotation.Nullable String company) {
    this.company = company;
  }


  public ValuationsIREITNODIRECTBasicInformation companyId(@javax.annotation.Nullable String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
   */
  @javax.annotation.Nullable
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(@javax.annotation.Nullable String companyId) {
    this.companyId = companyId;
  }


  public ValuationsIREITNODIRECTBasicInformation exchange(@javax.annotation.Nullable String exchange) {
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


  public ValuationsIREITNODIRECTBasicInformation stockid(@javax.annotation.Nullable String stockid) {
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


  public ValuationsIREITNODIRECTBasicInformation symbol(@javax.annotation.Nullable String symbol) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValuationsIREITNODIRECTBasicInformation valuationsIREITNODIRECTBasicInformation = (ValuationsIREITNODIRECTBasicInformation) o;
    return Objects.equals(this.company, valuationsIREITNODIRECTBasicInformation.company) &&
        Objects.equals(this.companyId, valuationsIREITNODIRECTBasicInformation.companyId) &&
        Objects.equals(this.exchange, valuationsIREITNODIRECTBasicInformation.exchange) &&
        Objects.equals(this.stockid, valuationsIREITNODIRECTBasicInformation.stockid) &&
        Objects.equals(this.symbol, valuationsIREITNODIRECTBasicInformation.symbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, companyId, exchange, stockid, symbol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValuationsIREITNODIRECTBasicInformation {\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    stockid: ").append(toIndentedString(stockid)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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
    openapiFields.add("company");
    openapiFields.add("company_id");
    openapiFields.add("exchange");
    openapiFields.add("stockid");
    openapiFields.add("symbol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ValuationsIREITNODIRECTBasicInformation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ValuationsIREITNODIRECTBasicInformation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValuationsIREITNODIRECTBasicInformation is not found in the empty JSON string", ValuationsIREITNODIRECTBasicInformation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ValuationsIREITNODIRECTBasicInformation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ValuationsIREITNODIRECTBasicInformation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("company") != null && !jsonObj.get("company").isJsonNull()) && !jsonObj.get("company").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company").toString()));
      }
      if ((jsonObj.get("company_id") != null && !jsonObj.get("company_id").isJsonNull()) && !jsonObj.get("company_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_id").toString()));
      }
      if ((jsonObj.get("exchange") != null && !jsonObj.get("exchange").isJsonNull()) && !jsonObj.get("exchange").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exchange` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exchange").toString()));
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
       if (!ValuationsIREITNODIRECTBasicInformation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValuationsIREITNODIRECTBasicInformation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValuationsIREITNODIRECTBasicInformation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValuationsIREITNODIRECTBasicInformation.class));

       return (TypeAdapter<T>) new TypeAdapter<ValuationsIREITNODIRECTBasicInformation>() {
           @Override
           public void write(JsonWriter out, ValuationsIREITNODIRECTBasicInformation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValuationsIREITNODIRECTBasicInformation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ValuationsIREITNODIRECTBasicInformation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ValuationsIREITNODIRECTBasicInformation
   * @throws IOException if the JSON string is invalid with respect to ValuationsIREITNODIRECTBasicInformation
   */
  public static ValuationsIREITNODIRECTBasicInformation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValuationsIREITNODIRECTBasicInformation.class);
  }

  /**
   * Convert an instance of ValuationsIREITNODIRECTBasicInformation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

