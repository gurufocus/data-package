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
 * EtfEtfFundamental
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-11T01:10:00.357398434Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class EtfEtfFundamental {
  public static final String SERIALIZED_NAME_MKTCAP = "mktcap";
  @SerializedName(SERIALIZED_NAME_MKTCAP)
  @javax.annotation.Nullable
  private BigDecimal mktcap;

  public static final String SERIALIZED_NAME_PB = "pb";
  @SerializedName(SERIALIZED_NAME_PB)
  @javax.annotation.Nullable
  private BigDecimal pb;

  public static final String SERIALIZED_NAME_PBHIGH = "pbhigh";
  @SerializedName(SERIALIZED_NAME_PBHIGH)
  @javax.annotation.Nullable
  private BigDecimal pbhigh;

  public static final String SERIALIZED_NAME_PBLOW = "pblow";
  @SerializedName(SERIALIZED_NAME_PBLOW)
  @javax.annotation.Nullable
  private BigDecimal pblow;

  public static final String SERIALIZED_NAME_PBMED = "pbmed";
  @SerializedName(SERIALIZED_NAME_PBMED)
  @javax.annotation.Nullable
  private BigDecimal pbmed;

  public static final String SERIALIZED_NAME_PE = "pe";
  @SerializedName(SERIALIZED_NAME_PE)
  @javax.annotation.Nullable
  private BigDecimal pe;

  public static final String SERIALIZED_NAME_PETTMHIGH = "pettmhigh";
  @SerializedName(SERIALIZED_NAME_PETTMHIGH)
  @javax.annotation.Nullable
  private BigDecimal pettmhigh;

  public static final String SERIALIZED_NAME_PETTMLOW = "pettmlow";
  @SerializedName(SERIALIZED_NAME_PETTMLOW)
  @javax.annotation.Nullable
  private BigDecimal pettmlow;

  public static final String SERIALIZED_NAME_PETTMMED = "pettmmed";
  @SerializedName(SERIALIZED_NAME_PETTMMED)
  @javax.annotation.Nullable
  private BigDecimal pettmmed;

  public static final String SERIALIZED_NAME_SHARES = "shares";
  @SerializedName(SERIALIZED_NAME_SHARES)
  @javax.annotation.Nullable
  private BigDecimal shares;

  public EtfEtfFundamental() {
  }

  public EtfEtfFundamental mktcap(@javax.annotation.Nullable BigDecimal mktcap) {
    this.mktcap = mktcap;
    return this;
  }

  /**
   * Market cap is the short version of market capitalization. It is the total market value to buy the whole company. It is equal to the share price times the number of shares outstanding.
   * @return mktcap
   */
  @javax.annotation.Nullable
  public BigDecimal getMktcap() {
    return mktcap;
  }

  public void setMktcap(@javax.annotation.Nullable BigDecimal mktcap) {
    this.mktcap = mktcap;
  }


  public EtfEtfFundamental pb(@javax.annotation.Nullable BigDecimal pb) {
    this.pb = pb;
    return this;
  }

  /**
   * Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio.
   * @return pb
   */
  @javax.annotation.Nullable
  public BigDecimal getPb() {
    return pb;
  }

  public void setPb(@javax.annotation.Nullable BigDecimal pb) {
    this.pb = pb;
  }


  public EtfEtfFundamental pbhigh(@javax.annotation.Nullable BigDecimal pbhigh) {
    this.pbhigh = pbhigh;
    return this;
  }

  /**
   * Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio.
   * @return pbhigh
   */
  @javax.annotation.Nullable
  public BigDecimal getPbhigh() {
    return pbhigh;
  }

  public void setPbhigh(@javax.annotation.Nullable BigDecimal pbhigh) {
    this.pbhigh = pbhigh;
  }


  public EtfEtfFundamental pblow(@javax.annotation.Nullable BigDecimal pblow) {
    this.pblow = pblow;
    return this;
  }

  /**
   * Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio.
   * @return pblow
   */
  @javax.annotation.Nullable
  public BigDecimal getPblow() {
    return pblow;
  }

  public void setPblow(@javax.annotation.Nullable BigDecimal pblow) {
    this.pblow = pblow;
  }


  public EtfEtfFundamental pbmed(@javax.annotation.Nullable BigDecimal pbmed) {
    this.pbmed = pbmed;
    return this;
  }

  /**
   * Companies use the price-to-book ratio to compare a firm&#39;s market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio.
   * @return pbmed
   */
  @javax.annotation.Nullable
  public BigDecimal getPbmed() {
    return pbmed;
  }

  public void setPbmed(@javax.annotation.Nullable BigDecimal pbmed) {
    this.pbmed = pbmed;
  }


  public EtfEtfFundamental pe(@javax.annotation.Nullable BigDecimal pe) {
    this.pe = pe;
    return this;
  }

  /**
   * &lt;p&gt;The PE ratio, or Price-to-Earnings ratio, is the most widely used metric in the valuation of stocks. It is calculated as:  &lt;b&gt;PE Ratio &#x3D; Share Price / {{eps_diluated}}&lt;/b&gt;.   It can also be calculated from the numbers for the whole company:  &lt;b&gt;PE Ratio &#x3D; {{mktcap}} / {{net_income}}&lt;/b&gt;.&lt;/p&gt;  &lt;p&gt;There are at least three kinds of PE ratios used among different investors. They are Trailing Twelve Month PE Ratio({{pettm}}), {{forwardPE}}, and {{penri}}. A new PE ratio based on inflation-adjusted normalized PE ratio is called {{ShillerPE}}, after Yale professor Robert Shiller.&lt;/p&gt;  &lt;p&gt;In the calculation of {{pettm}}, the earnings per share used are the earnings per share over the past 12 months({{ttm_eps}}). For {{forwardPE}}, the earnings are the expected earnings for the next twelve months({{forward_eps}}). In the case of {{penri}}, the reported earnings less the non-recurring items are used({{eps_nri}}).For the {{ShillerPE}}, the earnings of the past 10 years are inflation-adjusted and averaged. Since {{ShillerPE}} looks at the average over the last 10 years, it is also called PE10.&lt;/p&gt;
   * @return pe
   */
  @javax.annotation.Nullable
  public BigDecimal getPe() {
    return pe;
  }

  public void setPe(@javax.annotation.Nullable BigDecimal pe) {
    this.pe = pe;
  }


  public EtfEtfFundamental pettmhigh(@javax.annotation.Nullable BigDecimal pettmhigh) {
    this.pettmhigh = pettmhigh;
    return this;
  }

  /**
   * The highest price-earnings ratio over the past 10 years
   * @return pettmhigh
   */
  @javax.annotation.Nullable
  public BigDecimal getPettmhigh() {
    return pettmhigh;
  }

  public void setPettmhigh(@javax.annotation.Nullable BigDecimal pettmhigh) {
    this.pettmhigh = pettmhigh;
  }


  public EtfEtfFundamental pettmlow(@javax.annotation.Nullable BigDecimal pettmlow) {
    this.pettmlow = pettmlow;
    return this;
  }

  /**
   * The lowest price-earnings ratio over the past 10 years
   * @return pettmlow
   */
  @javax.annotation.Nullable
  public BigDecimal getPettmlow() {
    return pettmlow;
  }

  public void setPettmlow(@javax.annotation.Nullable BigDecimal pettmlow) {
    this.pettmlow = pettmlow;
  }


  public EtfEtfFundamental pettmmed(@javax.annotation.Nullable BigDecimal pettmmed) {
    this.pettmmed = pettmmed;
    return this;
  }

  /**
   * The median price-earnings ratio over the past 10 years
   * @return pettmmed
   */
  @javax.annotation.Nullable
  public BigDecimal getPettmmed() {
    return pettmmed;
  }

  public void setPettmmed(@javax.annotation.Nullable BigDecimal pettmmed) {
    this.pettmmed = pettmmed;
  }


  public EtfEtfFundamental shares(@javax.annotation.Nullable BigDecimal shares) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EtfEtfFundamental etfEtfFundamental = (EtfEtfFundamental) o;
    return Objects.equals(this.mktcap, etfEtfFundamental.mktcap) &&
        Objects.equals(this.pb, etfEtfFundamental.pb) &&
        Objects.equals(this.pbhigh, etfEtfFundamental.pbhigh) &&
        Objects.equals(this.pblow, etfEtfFundamental.pblow) &&
        Objects.equals(this.pbmed, etfEtfFundamental.pbmed) &&
        Objects.equals(this.pe, etfEtfFundamental.pe) &&
        Objects.equals(this.pettmhigh, etfEtfFundamental.pettmhigh) &&
        Objects.equals(this.pettmlow, etfEtfFundamental.pettmlow) &&
        Objects.equals(this.pettmmed, etfEtfFundamental.pettmmed) &&
        Objects.equals(this.shares, etfEtfFundamental.shares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mktcap, pb, pbhigh, pblow, pbmed, pe, pettmhigh, pettmlow, pettmmed, shares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EtfEtfFundamental {\n");
    sb.append("    mktcap: ").append(toIndentedString(mktcap)).append("\n");
    sb.append("    pb: ").append(toIndentedString(pb)).append("\n");
    sb.append("    pbhigh: ").append(toIndentedString(pbhigh)).append("\n");
    sb.append("    pblow: ").append(toIndentedString(pblow)).append("\n");
    sb.append("    pbmed: ").append(toIndentedString(pbmed)).append("\n");
    sb.append("    pe: ").append(toIndentedString(pe)).append("\n");
    sb.append("    pettmhigh: ").append(toIndentedString(pettmhigh)).append("\n");
    sb.append("    pettmlow: ").append(toIndentedString(pettmlow)).append("\n");
    sb.append("    pettmmed: ").append(toIndentedString(pettmmed)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
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
    openapiFields.add("mktcap");
    openapiFields.add("pb");
    openapiFields.add("pbhigh");
    openapiFields.add("pblow");
    openapiFields.add("pbmed");
    openapiFields.add("pe");
    openapiFields.add("pettmhigh");
    openapiFields.add("pettmlow");
    openapiFields.add("pettmmed");
    openapiFields.add("shares");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EtfEtfFundamental
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EtfEtfFundamental.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EtfEtfFundamental is not found in the empty JSON string", EtfEtfFundamental.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EtfEtfFundamental.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EtfEtfFundamental` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EtfEtfFundamental.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EtfEtfFundamental' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EtfEtfFundamental> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EtfEtfFundamental.class));

       return (TypeAdapter<T>) new TypeAdapter<EtfEtfFundamental>() {
           @Override
           public void write(JsonWriter out, EtfEtfFundamental value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EtfEtfFundamental read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EtfEtfFundamental given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EtfEtfFundamental
   * @throws IOException if the JSON string is invalid with respect to EtfEtfFundamental
   */
  public static EtfEtfFundamental fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EtfEtfFundamental.class);
  }

  /**
   * Convert an instance of EtfEtfFundamental to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

