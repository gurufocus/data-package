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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.StockSegmentBasicInformation;

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
 * StocksSymbolSegmentGet200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-11T01:10:00.357398434Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class StocksSymbolSegmentGet200Response {
  public static final String SERIALIZED_NAME_ANNUALLY = "annually";
  @SerializedName(SERIALIZED_NAME_ANNUALLY)
  @javax.annotation.Nullable
  private List<Object> annually = new ArrayList<>();

  public static final String SERIALIZED_NAME_BASIC_INFORMATION = "basic_information";
  @SerializedName(SERIALIZED_NAME_BASIC_INFORMATION)
  @javax.annotation.Nullable
  private StockSegmentBasicInformation basicInformation;

  public static final String SERIALIZED_NAME_QUARTERLY = "quarterly";
  @SerializedName(SERIALIZED_NAME_QUARTERLY)
  @javax.annotation.Nullable
  private List<Object> quarterly = new ArrayList<>();

  public static final String SERIALIZED_NAME_TTM = "ttm";
  @SerializedName(SERIALIZED_NAME_TTM)
  @javax.annotation.Nullable
  private Object ttm;

  public StocksSymbolSegmentGet200Response() {
  }

  public StocksSymbolSegmentGet200Response annually(@javax.annotation.Nullable List<Object> annually) {
    this.annually = annually;
    return this;
  }

  public StocksSymbolSegmentGet200Response addAnnuallyItem(Object annuallyItem) {
    if (this.annually == null) {
      this.annually = new ArrayList<>();
    }
    this.annually.add(annuallyItem);
    return this;
  }

  /**
   * Get annually
   * @return annually
   */
  @javax.annotation.Nullable
  public List<Object> getAnnually() {
    return annually;
  }

  public void setAnnually(@javax.annotation.Nullable List<Object> annually) {
    this.annually = annually;
  }


  public StocksSymbolSegmentGet200Response basicInformation(@javax.annotation.Nullable StockSegmentBasicInformation basicInformation) {
    this.basicInformation = basicInformation;
    return this;
  }

  /**
   * Get basicInformation
   * @return basicInformation
   */
  @javax.annotation.Nullable
  public StockSegmentBasicInformation getBasicInformation() {
    return basicInformation;
  }

  public void setBasicInformation(@javax.annotation.Nullable StockSegmentBasicInformation basicInformation) {
    this.basicInformation = basicInformation;
  }


  public StocksSymbolSegmentGet200Response quarterly(@javax.annotation.Nullable List<Object> quarterly) {
    this.quarterly = quarterly;
    return this;
  }

  public StocksSymbolSegmentGet200Response addQuarterlyItem(Object quarterlyItem) {
    if (this.quarterly == null) {
      this.quarterly = new ArrayList<>();
    }
    this.quarterly.add(quarterlyItem);
    return this;
  }

  /**
   * Get quarterly
   * @return quarterly
   */
  @javax.annotation.Nullable
  public List<Object> getQuarterly() {
    return quarterly;
  }

  public void setQuarterly(@javax.annotation.Nullable List<Object> quarterly) {
    this.quarterly = quarterly;
  }


  public StocksSymbolSegmentGet200Response ttm(@javax.annotation.Nullable Object ttm) {
    this.ttm = ttm;
    return this;
  }

  /**
   * Get ttm
   * @return ttm
   */
  @javax.annotation.Nullable
  public Object getTtm() {
    return ttm;
  }

  public void setTtm(@javax.annotation.Nullable Object ttm) {
    this.ttm = ttm;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StocksSymbolSegmentGet200Response stocksSymbolSegmentGet200Response = (StocksSymbolSegmentGet200Response) o;
    return Objects.equals(this.annually, stocksSymbolSegmentGet200Response.annually) &&
        Objects.equals(this.basicInformation, stocksSymbolSegmentGet200Response.basicInformation) &&
        Objects.equals(this.quarterly, stocksSymbolSegmentGet200Response.quarterly) &&
        Objects.equals(this.ttm, stocksSymbolSegmentGet200Response.ttm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annually, basicInformation, quarterly, ttm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StocksSymbolSegmentGet200Response {\n");
    sb.append("    annually: ").append(toIndentedString(annually)).append("\n");
    sb.append("    basicInformation: ").append(toIndentedString(basicInformation)).append("\n");
    sb.append("    quarterly: ").append(toIndentedString(quarterly)).append("\n");
    sb.append("    ttm: ").append(toIndentedString(ttm)).append("\n");
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
    openapiFields.add("annually");
    openapiFields.add("basic_information");
    openapiFields.add("quarterly");
    openapiFields.add("ttm");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StocksSymbolSegmentGet200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StocksSymbolSegmentGet200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StocksSymbolSegmentGet200Response is not found in the empty JSON string", StocksSymbolSegmentGet200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StocksSymbolSegmentGet200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StocksSymbolSegmentGet200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("annually") != null && !jsonObj.get("annually").isJsonNull() && !jsonObj.get("annually").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `annually` to be an array in the JSON string but got `%s`", jsonObj.get("annually").toString()));
      }
      // validate the optional field `basic_information`
      if (jsonObj.get("basic_information") != null && !jsonObj.get("basic_information").isJsonNull()) {
        StockSegmentBasicInformation.validateJsonElement(jsonObj.get("basic_information"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("quarterly") != null && !jsonObj.get("quarterly").isJsonNull() && !jsonObj.get("quarterly").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `quarterly` to be an array in the JSON string but got `%s`", jsonObj.get("quarterly").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StocksSymbolSegmentGet200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StocksSymbolSegmentGet200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StocksSymbolSegmentGet200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StocksSymbolSegmentGet200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<StocksSymbolSegmentGet200Response>() {
           @Override
           public void write(JsonWriter out, StocksSymbolSegmentGet200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StocksSymbolSegmentGet200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of StocksSymbolSegmentGet200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StocksSymbolSegmentGet200Response
   * @throws IOException if the JSON string is invalid with respect to StocksSymbolSegmentGet200Response
   */
  public static StocksSymbolSegmentGet200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StocksSymbolSegmentGet200Response.class);
  }

  /**
   * Convert an instance of StocksSymbolSegmentGet200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

