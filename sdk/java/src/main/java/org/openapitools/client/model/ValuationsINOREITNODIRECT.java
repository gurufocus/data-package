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
import org.openapitools.client.model.ValuationsINOREITNODIRECTBasicInformation;
import org.openapitools.client.model.ValuationsINOREITNODIRECTPerShareData;
import org.openapitools.client.model.ValuationsINOREITNODIRECTRatios;
import org.openapitools.client.model.ValuationsINOREITNODIRECTValuationRatios;
import org.openapitools.client.model.ValuationsINOREITNODIRECTValuationandQuality;

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
 * ValuationsINOREITNODIRECT
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-11T01:10:00.357398434Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class ValuationsINOREITNODIRECT {
  public static final String SERIALIZED_NAME_BASIC_INFORMATION = "basic_information";
  @SerializedName(SERIALIZED_NAME_BASIC_INFORMATION)
  @javax.annotation.Nullable
  private ValuationsINOREITNODIRECTBasicInformation basicInformation;

  public static final String SERIALIZED_NAME_PER_SHARE_DATA = "per_share_data";
  @SerializedName(SERIALIZED_NAME_PER_SHARE_DATA)
  @javax.annotation.Nullable
  private ValuationsINOREITNODIRECTPerShareData perShareData;

  public static final String SERIALIZED_NAME_RATIOS = "ratios";
  @SerializedName(SERIALIZED_NAME_RATIOS)
  @javax.annotation.Nullable
  private ValuationsINOREITNODIRECTRatios ratios;

  public static final String SERIALIZED_NAME_VALUATION_RATIOS = "valuation_ratios";
  @SerializedName(SERIALIZED_NAME_VALUATION_RATIOS)
  @javax.annotation.Nullable
  private ValuationsINOREITNODIRECTValuationRatios valuationRatios;

  public static final String SERIALIZED_NAME_VALUATIONAND_QUALITY = "valuationand_quality";
  @SerializedName(SERIALIZED_NAME_VALUATIONAND_QUALITY)
  @javax.annotation.Nullable
  private ValuationsINOREITNODIRECTValuationandQuality valuationandQuality;

  public ValuationsINOREITNODIRECT() {
  }

  public ValuationsINOREITNODIRECT basicInformation(@javax.annotation.Nullable ValuationsINOREITNODIRECTBasicInformation basicInformation) {
    this.basicInformation = basicInformation;
    return this;
  }

  /**
   * Get basicInformation
   * @return basicInformation
   */
  @javax.annotation.Nullable
  public ValuationsINOREITNODIRECTBasicInformation getBasicInformation() {
    return basicInformation;
  }

  public void setBasicInformation(@javax.annotation.Nullable ValuationsINOREITNODIRECTBasicInformation basicInformation) {
    this.basicInformation = basicInformation;
  }


  public ValuationsINOREITNODIRECT perShareData(@javax.annotation.Nullable ValuationsINOREITNODIRECTPerShareData perShareData) {
    this.perShareData = perShareData;
    return this;
  }

  /**
   * Get perShareData
   * @return perShareData
   */
  @javax.annotation.Nullable
  public ValuationsINOREITNODIRECTPerShareData getPerShareData() {
    return perShareData;
  }

  public void setPerShareData(@javax.annotation.Nullable ValuationsINOREITNODIRECTPerShareData perShareData) {
    this.perShareData = perShareData;
  }


  public ValuationsINOREITNODIRECT ratios(@javax.annotation.Nullable ValuationsINOREITNODIRECTRatios ratios) {
    this.ratios = ratios;
    return this;
  }

  /**
   * Get ratios
   * @return ratios
   */
  @javax.annotation.Nullable
  public ValuationsINOREITNODIRECTRatios getRatios() {
    return ratios;
  }

  public void setRatios(@javax.annotation.Nullable ValuationsINOREITNODIRECTRatios ratios) {
    this.ratios = ratios;
  }


  public ValuationsINOREITNODIRECT valuationRatios(@javax.annotation.Nullable ValuationsINOREITNODIRECTValuationRatios valuationRatios) {
    this.valuationRatios = valuationRatios;
    return this;
  }

  /**
   * Get valuationRatios
   * @return valuationRatios
   */
  @javax.annotation.Nullable
  public ValuationsINOREITNODIRECTValuationRatios getValuationRatios() {
    return valuationRatios;
  }

  public void setValuationRatios(@javax.annotation.Nullable ValuationsINOREITNODIRECTValuationRatios valuationRatios) {
    this.valuationRatios = valuationRatios;
  }


  public ValuationsINOREITNODIRECT valuationandQuality(@javax.annotation.Nullable ValuationsINOREITNODIRECTValuationandQuality valuationandQuality) {
    this.valuationandQuality = valuationandQuality;
    return this;
  }

  /**
   * Get valuationandQuality
   * @return valuationandQuality
   */
  @javax.annotation.Nullable
  public ValuationsINOREITNODIRECTValuationandQuality getValuationandQuality() {
    return valuationandQuality;
  }

  public void setValuationandQuality(@javax.annotation.Nullable ValuationsINOREITNODIRECTValuationandQuality valuationandQuality) {
    this.valuationandQuality = valuationandQuality;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValuationsINOREITNODIRECT valuationsINOREITNODIRECT = (ValuationsINOREITNODIRECT) o;
    return Objects.equals(this.basicInformation, valuationsINOREITNODIRECT.basicInformation) &&
        Objects.equals(this.perShareData, valuationsINOREITNODIRECT.perShareData) &&
        Objects.equals(this.ratios, valuationsINOREITNODIRECT.ratios) &&
        Objects.equals(this.valuationRatios, valuationsINOREITNODIRECT.valuationRatios) &&
        Objects.equals(this.valuationandQuality, valuationsINOREITNODIRECT.valuationandQuality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicInformation, perShareData, ratios, valuationRatios, valuationandQuality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValuationsINOREITNODIRECT {\n");
    sb.append("    basicInformation: ").append(toIndentedString(basicInformation)).append("\n");
    sb.append("    perShareData: ").append(toIndentedString(perShareData)).append("\n");
    sb.append("    ratios: ").append(toIndentedString(ratios)).append("\n");
    sb.append("    valuationRatios: ").append(toIndentedString(valuationRatios)).append("\n");
    sb.append("    valuationandQuality: ").append(toIndentedString(valuationandQuality)).append("\n");
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
    openapiFields.add("basic_information");
    openapiFields.add("per_share_data");
    openapiFields.add("ratios");
    openapiFields.add("valuation_ratios");
    openapiFields.add("valuationand_quality");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ValuationsINOREITNODIRECT
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ValuationsINOREITNODIRECT.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValuationsINOREITNODIRECT is not found in the empty JSON string", ValuationsINOREITNODIRECT.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ValuationsINOREITNODIRECT.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ValuationsINOREITNODIRECT` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `basic_information`
      if (jsonObj.get("basic_information") != null && !jsonObj.get("basic_information").isJsonNull()) {
        ValuationsINOREITNODIRECTBasicInformation.validateJsonElement(jsonObj.get("basic_information"));
      }
      // validate the optional field `per_share_data`
      if (jsonObj.get("per_share_data") != null && !jsonObj.get("per_share_data").isJsonNull()) {
        ValuationsINOREITNODIRECTPerShareData.validateJsonElement(jsonObj.get("per_share_data"));
      }
      // validate the optional field `ratios`
      if (jsonObj.get("ratios") != null && !jsonObj.get("ratios").isJsonNull()) {
        ValuationsINOREITNODIRECTRatios.validateJsonElement(jsonObj.get("ratios"));
      }
      // validate the optional field `valuation_ratios`
      if (jsonObj.get("valuation_ratios") != null && !jsonObj.get("valuation_ratios").isJsonNull()) {
        ValuationsINOREITNODIRECTValuationRatios.validateJsonElement(jsonObj.get("valuation_ratios"));
      }
      // validate the optional field `valuationand_quality`
      if (jsonObj.get("valuationand_quality") != null && !jsonObj.get("valuationand_quality").isJsonNull()) {
        ValuationsINOREITNODIRECTValuationandQuality.validateJsonElement(jsonObj.get("valuationand_quality"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValuationsINOREITNODIRECT.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValuationsINOREITNODIRECT' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValuationsINOREITNODIRECT> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValuationsINOREITNODIRECT.class));

       return (TypeAdapter<T>) new TypeAdapter<ValuationsINOREITNODIRECT>() {
           @Override
           public void write(JsonWriter out, ValuationsINOREITNODIRECT value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValuationsINOREITNODIRECT read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ValuationsINOREITNODIRECT given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ValuationsINOREITNODIRECT
   * @throws IOException if the JSON string is invalid with respect to ValuationsINOREITNODIRECT
   */
  public static ValuationsINOREITNODIRECT fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValuationsINOREITNODIRECT.class);
  }

  /**
   * Convert an instance of ValuationsINOREITNODIRECT to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

