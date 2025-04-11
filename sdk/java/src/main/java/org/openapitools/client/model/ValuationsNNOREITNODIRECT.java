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
import org.openapitools.client.model.ValuationsNNOREITNODIRECTBasicInformation;
import org.openapitools.client.model.ValuationsNNOREITNODIRECTPerShareData;
import org.openapitools.client.model.ValuationsNNOREITNODIRECTRatios;
import org.openapitools.client.model.ValuationsNNOREITNODIRECTValuationRatios;
import org.openapitools.client.model.ValuationsNNOREITNODIRECTValuationandQuality;

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
 * ValuationsNNOREITNODIRECT
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-11T01:10:00.357398434Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class ValuationsNNOREITNODIRECT {
  public static final String SERIALIZED_NAME_BASIC_INFORMATION = "basic_information";
  @SerializedName(SERIALIZED_NAME_BASIC_INFORMATION)
  @javax.annotation.Nullable
  private ValuationsNNOREITNODIRECTBasicInformation basicInformation;

  public static final String SERIALIZED_NAME_PER_SHARE_DATA = "per_share_data";
  @SerializedName(SERIALIZED_NAME_PER_SHARE_DATA)
  @javax.annotation.Nullable
  private ValuationsNNOREITNODIRECTPerShareData perShareData;

  public static final String SERIALIZED_NAME_RATIOS = "ratios";
  @SerializedName(SERIALIZED_NAME_RATIOS)
  @javax.annotation.Nullable
  private ValuationsNNOREITNODIRECTRatios ratios;

  public static final String SERIALIZED_NAME_VALUATION_RATIOS = "valuation_ratios";
  @SerializedName(SERIALIZED_NAME_VALUATION_RATIOS)
  @javax.annotation.Nullable
  private ValuationsNNOREITNODIRECTValuationRatios valuationRatios;

  public static final String SERIALIZED_NAME_VALUATIONAND_QUALITY = "valuationand_quality";
  @SerializedName(SERIALIZED_NAME_VALUATIONAND_QUALITY)
  @javax.annotation.Nullable
  private ValuationsNNOREITNODIRECTValuationandQuality valuationandQuality;

  public ValuationsNNOREITNODIRECT() {
  }

  public ValuationsNNOREITNODIRECT basicInformation(@javax.annotation.Nullable ValuationsNNOREITNODIRECTBasicInformation basicInformation) {
    this.basicInformation = basicInformation;
    return this;
  }

  /**
   * Get basicInformation
   * @return basicInformation
   */
  @javax.annotation.Nullable
  public ValuationsNNOREITNODIRECTBasicInformation getBasicInformation() {
    return basicInformation;
  }

  public void setBasicInformation(@javax.annotation.Nullable ValuationsNNOREITNODIRECTBasicInformation basicInformation) {
    this.basicInformation = basicInformation;
  }


  public ValuationsNNOREITNODIRECT perShareData(@javax.annotation.Nullable ValuationsNNOREITNODIRECTPerShareData perShareData) {
    this.perShareData = perShareData;
    return this;
  }

  /**
   * Get perShareData
   * @return perShareData
   */
  @javax.annotation.Nullable
  public ValuationsNNOREITNODIRECTPerShareData getPerShareData() {
    return perShareData;
  }

  public void setPerShareData(@javax.annotation.Nullable ValuationsNNOREITNODIRECTPerShareData perShareData) {
    this.perShareData = perShareData;
  }


  public ValuationsNNOREITNODIRECT ratios(@javax.annotation.Nullable ValuationsNNOREITNODIRECTRatios ratios) {
    this.ratios = ratios;
    return this;
  }

  /**
   * Get ratios
   * @return ratios
   */
  @javax.annotation.Nullable
  public ValuationsNNOREITNODIRECTRatios getRatios() {
    return ratios;
  }

  public void setRatios(@javax.annotation.Nullable ValuationsNNOREITNODIRECTRatios ratios) {
    this.ratios = ratios;
  }


  public ValuationsNNOREITNODIRECT valuationRatios(@javax.annotation.Nullable ValuationsNNOREITNODIRECTValuationRatios valuationRatios) {
    this.valuationRatios = valuationRatios;
    return this;
  }

  /**
   * Get valuationRatios
   * @return valuationRatios
   */
  @javax.annotation.Nullable
  public ValuationsNNOREITNODIRECTValuationRatios getValuationRatios() {
    return valuationRatios;
  }

  public void setValuationRatios(@javax.annotation.Nullable ValuationsNNOREITNODIRECTValuationRatios valuationRatios) {
    this.valuationRatios = valuationRatios;
  }


  public ValuationsNNOREITNODIRECT valuationandQuality(@javax.annotation.Nullable ValuationsNNOREITNODIRECTValuationandQuality valuationandQuality) {
    this.valuationandQuality = valuationandQuality;
    return this;
  }

  /**
   * Get valuationandQuality
   * @return valuationandQuality
   */
  @javax.annotation.Nullable
  public ValuationsNNOREITNODIRECTValuationandQuality getValuationandQuality() {
    return valuationandQuality;
  }

  public void setValuationandQuality(@javax.annotation.Nullable ValuationsNNOREITNODIRECTValuationandQuality valuationandQuality) {
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
    ValuationsNNOREITNODIRECT valuationsNNOREITNODIRECT = (ValuationsNNOREITNODIRECT) o;
    return Objects.equals(this.basicInformation, valuationsNNOREITNODIRECT.basicInformation) &&
        Objects.equals(this.perShareData, valuationsNNOREITNODIRECT.perShareData) &&
        Objects.equals(this.ratios, valuationsNNOREITNODIRECT.ratios) &&
        Objects.equals(this.valuationRatios, valuationsNNOREITNODIRECT.valuationRatios) &&
        Objects.equals(this.valuationandQuality, valuationsNNOREITNODIRECT.valuationandQuality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicInformation, perShareData, ratios, valuationRatios, valuationandQuality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValuationsNNOREITNODIRECT {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to ValuationsNNOREITNODIRECT
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ValuationsNNOREITNODIRECT.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValuationsNNOREITNODIRECT is not found in the empty JSON string", ValuationsNNOREITNODIRECT.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ValuationsNNOREITNODIRECT.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ValuationsNNOREITNODIRECT` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `basic_information`
      if (jsonObj.get("basic_information") != null && !jsonObj.get("basic_information").isJsonNull()) {
        ValuationsNNOREITNODIRECTBasicInformation.validateJsonElement(jsonObj.get("basic_information"));
      }
      // validate the optional field `per_share_data`
      if (jsonObj.get("per_share_data") != null && !jsonObj.get("per_share_data").isJsonNull()) {
        ValuationsNNOREITNODIRECTPerShareData.validateJsonElement(jsonObj.get("per_share_data"));
      }
      // validate the optional field `ratios`
      if (jsonObj.get("ratios") != null && !jsonObj.get("ratios").isJsonNull()) {
        ValuationsNNOREITNODIRECTRatios.validateJsonElement(jsonObj.get("ratios"));
      }
      // validate the optional field `valuation_ratios`
      if (jsonObj.get("valuation_ratios") != null && !jsonObj.get("valuation_ratios").isJsonNull()) {
        ValuationsNNOREITNODIRECTValuationRatios.validateJsonElement(jsonObj.get("valuation_ratios"));
      }
      // validate the optional field `valuationand_quality`
      if (jsonObj.get("valuationand_quality") != null && !jsonObj.get("valuationand_quality").isJsonNull()) {
        ValuationsNNOREITNODIRECTValuationandQuality.validateJsonElement(jsonObj.get("valuationand_quality"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValuationsNNOREITNODIRECT.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValuationsNNOREITNODIRECT' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValuationsNNOREITNODIRECT> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValuationsNNOREITNODIRECT.class));

       return (TypeAdapter<T>) new TypeAdapter<ValuationsNNOREITNODIRECT>() {
           @Override
           public void write(JsonWriter out, ValuationsNNOREITNODIRECT value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValuationsNNOREITNODIRECT read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ValuationsNNOREITNODIRECT given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ValuationsNNOREITNODIRECT
   * @throws IOException if the JSON string is invalid with respect to ValuationsNNOREITNODIRECT
   */
  public static ValuationsNNOREITNODIRECT fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValuationsNNOREITNODIRECT.class);
  }

  /**
   * Convert an instance of ValuationsNNOREITNODIRECT to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

