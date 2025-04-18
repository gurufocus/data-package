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
 * ValuationsNREITNODIRECTPerShareData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-11T01:10:00.357398434Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class ValuationsNREITNODIRECTPerShareData {
  public static final String SERIALIZED_NAME_BOOK_VALUE_PER_SHARE = "book_value_per_share";
  @SerializedName(SERIALIZED_NAME_BOOK_VALUE_PER_SHARE)
  @javax.annotation.Nullable
  private BigDecimal bookValuePerShare;

  public static final String SERIALIZED_NAME_CASH_FLOW_FROM_OPERATIONS_PER_SHARE = "cash_flow_from_operations_per_share";
  @SerializedName(SERIALIZED_NAME_CASH_FLOW_FROM_OPERATIONS_PER_SHARE)
  @javax.annotation.Nullable
  private BigDecimal cashFlowFromOperationsPerShare;

  public static final String SERIALIZED_NAME_CASH_PER_SHARE = "cash_per_share";
  @SerializedName(SERIALIZED_NAME_CASH_PER_SHARE)
  @javax.annotation.Nullable
  private BigDecimal cashPerShare;

  public static final String SERIALIZED_NAME_DIVIDENDS_PER_SHARE = "dividends_per_share";
  @SerializedName(SERIALIZED_NAME_DIVIDENDS_PER_SHARE)
  @javax.annotation.Nullable
  private BigDecimal dividendsPerShare;

  public static final String SERIALIZED_NAME_EARNING_PER_SHARE_DILUTED = "earning_per_share_diluted";
  @SerializedName(SERIALIZED_NAME_EARNING_PER_SHARE_DILUTED)
  @javax.annotation.Nullable
  private BigDecimal earningPerShareDiluted;

  public static final String SERIALIZED_NAME_EBIT_PER_SHARE = "ebit_per_share";
  @SerializedName(SERIALIZED_NAME_EBIT_PER_SHARE)
  @javax.annotation.Nullable
  private BigDecimal ebitPerShare;

  public static final String SERIALIZED_NAME_EBITDA_PER_SHARE = "ebitda_per_share";
  @SerializedName(SERIALIZED_NAME_EBITDA_PER_SHARE)
  @javax.annotation.Nullable
  private BigDecimal ebitdaPerShare;

  public static final String SERIALIZED_NAME_EPS_WITHOUT_NRI = "eps_without_nri";
  @SerializedName(SERIALIZED_NAME_EPS_WITHOUT_NRI)
  @javax.annotation.Nullable
  private BigDecimal epsWithoutNri;

  public static final String SERIALIZED_NAME_FFO_PER_SHARE = "ffo_per_share";
  @SerializedName(SERIALIZED_NAME_FFO_PER_SHARE)
  @javax.annotation.Nullable
  private BigDecimal ffoPerShare;

  public static final String SERIALIZED_NAME_FREE_CASH_FLOW_PER_SHARE = "free_cash_flow_per_share";
  @SerializedName(SERIALIZED_NAME_FREE_CASH_FLOW_PER_SHARE)
  @javax.annotation.Nullable
  private BigDecimal freeCashFlowPerShare;

  public static final String SERIALIZED_NAME_MONTH_END_STOCK_PRICE = "month_end_stock_price";
  @SerializedName(SERIALIZED_NAME_MONTH_END_STOCK_PRICE)
  @javax.annotation.Nullable
  private BigDecimal monthEndStockPrice;

  public static final String SERIALIZED_NAME_OWNER_EARNINGS = "owner_earnings";
  @SerializedName(SERIALIZED_NAME_OWNER_EARNINGS)
  @javax.annotation.Nullable
  private BigDecimal ownerEarnings;

  public static final String SERIALIZED_NAME_REVENUE_PER_SHARE = "revenue_per_share";
  @SerializedName(SERIALIZED_NAME_REVENUE_PER_SHARE)
  @javax.annotation.Nullable
  private BigDecimal revenuePerShare;

  public static final String SERIALIZED_NAME_TANGIBLES_BOOK_PER_SHARE = "tangibles_book_per_share";
  @SerializedName(SERIALIZED_NAME_TANGIBLES_BOOK_PER_SHARE)
  @javax.annotation.Nullable
  private BigDecimal tangiblesBookPerShare;

  public static final String SERIALIZED_NAME_TOTAL_DEBT_PER_SHARE = "total_debt_per_share";
  @SerializedName(SERIALIZED_NAME_TOTAL_DEBT_PER_SHARE)
  @javax.annotation.Nullable
  private BigDecimal totalDebtPerShare;

  public ValuationsNREITNODIRECTPerShareData() {
  }

  public ValuationsNREITNODIRECTPerShareData bookValuePerShare(@javax.annotation.Nullable BigDecimal bookValuePerShare) {
    this.bookValuePerShare = bookValuePerShare;
    return this;
  }

  /**
   * Per share value of a company based on common shareholders&#39; equity in the company.
   * @return bookValuePerShare
   */
  @javax.annotation.Nullable
  public BigDecimal getBookValuePerShare() {
    return bookValuePerShare;
  }

  public void setBookValuePerShare(@javax.annotation.Nullable BigDecimal bookValuePerShare) {
    this.bookValuePerShare = bookValuePerShare;
  }


  public ValuationsNREITNODIRECTPerShareData cashFlowFromOperationsPerShare(@javax.annotation.Nullable BigDecimal cashFlowFromOperationsPerShare) {
    this.cashFlowFromOperationsPerShare = cashFlowFromOperationsPerShare;
    return this;
  }

  /**
   * Operating Cash Flow per Share is the amount of Operating Cash Flow per outstanding share of the company
   * @return cashFlowFromOperationsPerShare
   */
  @javax.annotation.Nullable
  public BigDecimal getCashFlowFromOperationsPerShare() {
    return cashFlowFromOperationsPerShare;
  }

  public void setCashFlowFromOperationsPerShare(@javax.annotation.Nullable BigDecimal cashFlowFromOperationsPerShare) {
    this.cashFlowFromOperationsPerShare = cashFlowFromOperationsPerShare;
  }


  public ValuationsNREITNODIRECTPerShareData cashPerShare(@javax.annotation.Nullable BigDecimal cashPerShare) {
    this.cashPerShare = cashPerShare;
    return this;
  }

  /**
   * Get cashPerShare
   * @return cashPerShare
   */
  @javax.annotation.Nullable
  public BigDecimal getCashPerShare() {
    return cashPerShare;
  }

  public void setCashPerShare(@javax.annotation.Nullable BigDecimal cashPerShare) {
    this.cashPerShare = cashPerShare;
  }


  public ValuationsNREITNODIRECTPerShareData dividendsPerShare(@javax.annotation.Nullable BigDecimal dividendsPerShare) {
    this.dividendsPerShare = dividendsPerShare;
    return this;
  }

  /**
   * Dividends paid to per common share
   * @return dividendsPerShare
   */
  @javax.annotation.Nullable
  public BigDecimal getDividendsPerShare() {
    return dividendsPerShare;
  }

  public void setDividendsPerShare(@javax.annotation.Nullable BigDecimal dividendsPerShare) {
    this.dividendsPerShare = dividendsPerShare;
  }


  public ValuationsNREITNODIRECTPerShareData earningPerShareDiluted(@javax.annotation.Nullable BigDecimal earningPerShareDiluted) {
    this.earningPerShareDiluted = earningPerShareDiluted;
    return this;
  }

  /**
   * The company&#39;s diluted earnings per share
   * @return earningPerShareDiluted
   */
  @javax.annotation.Nullable
  public BigDecimal getEarningPerShareDiluted() {
    return earningPerShareDiluted;
  }

  public void setEarningPerShareDiluted(@javax.annotation.Nullable BigDecimal earningPerShareDiluted) {
    this.earningPerShareDiluted = earningPerShareDiluted;
  }


  public ValuationsNREITNODIRECTPerShareData ebitPerShare(@javax.annotation.Nullable BigDecimal ebitPerShare) {
    this.ebitPerShare = ebitPerShare;
    return this;
  }

  /**
   * The earnings before interest and taxes divided by shares outstanding
   * @return ebitPerShare
   */
  @javax.annotation.Nullable
  public BigDecimal getEbitPerShare() {
    return ebitPerShare;
  }

  public void setEbitPerShare(@javax.annotation.Nullable BigDecimal ebitPerShare) {
    this.ebitPerShare = ebitPerShare;
  }


  public ValuationsNREITNODIRECTPerShareData ebitdaPerShare(@javax.annotation.Nullable BigDecimal ebitdaPerShare) {
    this.ebitdaPerShare = ebitdaPerShare;
    return this;
  }

  /**
   * EBITDA per Share is the amount of Earnings Before Interest, Taxes, Depreciation, and  Amortization (EBITDA) per outstanding share of the company™s stock.     Earnings Before Interest, Taxes, Depreciation, and  Amortization (EBITDA) is what the company earns before  it expenses interest, taxes, depreciation and amortization.  EBITDA is calculated as   EBITDA   &#x3D; {Revenue} - {Cost of Goods Sold} - {Selling, General, &amp; Admin. Expense} - {Research &amp; Development}  &#x3D; {Gross Profit} - {Selling, General, &amp; Admin. Expense} - {Research &amp; Development}
   * @return ebitdaPerShare
   */
  @javax.annotation.Nullable
  public BigDecimal getEbitdaPerShare() {
    return ebitdaPerShare;
  }

  public void setEbitdaPerShare(@javax.annotation.Nullable BigDecimal ebitdaPerShare) {
    this.ebitdaPerShare = ebitdaPerShare;
  }


  public ValuationsNREITNODIRECTPerShareData epsWithoutNri(@javax.annotation.Nullable BigDecimal epsWithoutNri) {
    this.epsWithoutNri = epsWithoutNri;
    return this;
  }

  /**
   * Earnings Per Share (EPS) is the single most important variable used by Wall Street in determining the earnings power of a company. But investors need to be aware that Earnings per Share can be easily manipulated by adjusting depreciation and amortization rate or non-recurring items. That&#39;s why GuruFocus lists Earnings per share without Non-Recurring Items, which better reflects the company&#39;s underlying performance.    Earnings Per Share without Non-Recurring Items is the amount of earnings without non-recurring items per outstanding share of the company&amp;#146;s stock. In calculating earnings per share without non-recurring items, the dividends of preferred stocks and non-recurring items need to subtracted from the total net income first.
   * @return epsWithoutNri
   */
  @javax.annotation.Nullable
  public BigDecimal getEpsWithoutNri() {
    return epsWithoutNri;
  }

  public void setEpsWithoutNri(@javax.annotation.Nullable BigDecimal epsWithoutNri) {
    this.epsWithoutNri = epsWithoutNri;
  }


  public ValuationsNREITNODIRECTPerShareData ffoPerShare(@javax.annotation.Nullable BigDecimal ffoPerShare) {
    this.ffoPerShare = ffoPerShare;
    return this;
  }

  /**
   * &lt;p&gt;{{FFO}} (Funds from operations) refers to the figure used by real estate investment trusts (REITs) to define the cash flow from their operations. It is calculated by adding depreciation and amortization to earnings, subtracting any gains on sales.&lt;/p&gt;
   * @return ffoPerShare
   */
  @javax.annotation.Nullable
  public BigDecimal getFfoPerShare() {
    return ffoPerShare;
  }

  public void setFfoPerShare(@javax.annotation.Nullable BigDecimal ffoPerShare) {
    this.ffoPerShare = ffoPerShare;
  }


  public ValuationsNREITNODIRECTPerShareData freeCashFlowPerShare(@javax.annotation.Nullable BigDecimal freeCashFlowPerShare) {
    this.freeCashFlowPerShare = freeCashFlowPerShare;
    return this;
  }

  /**
   * The company&#39;s free cash flow divided by shares outstanding
   * @return freeCashFlowPerShare
   */
  @javax.annotation.Nullable
  public BigDecimal getFreeCashFlowPerShare() {
    return freeCashFlowPerShare;
  }

  public void setFreeCashFlowPerShare(@javax.annotation.Nullable BigDecimal freeCashFlowPerShare) {
    this.freeCashFlowPerShare = freeCashFlowPerShare;
  }


  public ValuationsNREITNODIRECTPerShareData monthEndStockPrice(@javax.annotation.Nullable BigDecimal monthEndStockPrice) {
    this.monthEndStockPrice = monthEndStockPrice;
    return this;
  }

  /**
   * The company&#39;s share price at the final day of the month
   * @return monthEndStockPrice
   */
  @javax.annotation.Nullable
  public BigDecimal getMonthEndStockPrice() {
    return monthEndStockPrice;
  }

  public void setMonthEndStockPrice(@javax.annotation.Nullable BigDecimal monthEndStockPrice) {
    this.monthEndStockPrice = monthEndStockPrice;
  }


  public ValuationsNREITNODIRECTPerShareData ownerEarnings(@javax.annotation.Nullable BigDecimal ownerEarnings) {
    this.ownerEarnings = ownerEarnings;
    return this;
  }

  /**
   * If we think through these questions, we can gain some insights about what may be called &#39;owner earnings.&#39; These represent (A) reported earnings plus (B) depreciation, depletion, amortization, and certain other non-cash charges such as Company N&#39;s items (1) and (4) less the average annual amount of capitalized expenditures for plant and equipment, etc. that the business requires to fully maintain its long-term competitive position and its unit volume. (If the business requires additional working capital to maintain its competitive position and unit volume, the increment also should be included in (c). However, businesses following the LIFO inventory method usually do not require additional working capital if unit volume does not change.
   * @return ownerEarnings
   */
  @javax.annotation.Nullable
  public BigDecimal getOwnerEarnings() {
    return ownerEarnings;
  }

  public void setOwnerEarnings(@javax.annotation.Nullable BigDecimal ownerEarnings) {
    this.ownerEarnings = ownerEarnings;
  }


  public ValuationsNREITNODIRECTPerShareData revenuePerShare(@javax.annotation.Nullable BigDecimal revenuePerShare) {
    this.revenuePerShare = revenuePerShare;
    return this;
  }

  /**
   * The company&#39;s total revenue divided by shares outstanding.
   * @return revenuePerShare
   */
  @javax.annotation.Nullable
  public BigDecimal getRevenuePerShare() {
    return revenuePerShare;
  }

  public void setRevenuePerShare(@javax.annotation.Nullable BigDecimal revenuePerShare) {
    this.revenuePerShare = revenuePerShare;
  }


  public ValuationsNREITNODIRECTPerShareData tangiblesBookPerShare(@javax.annotation.Nullable BigDecimal tangiblesBookPerShare) {
    this.tangiblesBookPerShare = tangiblesBookPerShare;
    return this;
  }

  /**
   * The per share value of a company based on common shareholder&#39;s equity less intangible assets
   * @return tangiblesBookPerShare
   */
  @javax.annotation.Nullable
  public BigDecimal getTangiblesBookPerShare() {
    return tangiblesBookPerShare;
  }

  public void setTangiblesBookPerShare(@javax.annotation.Nullable BigDecimal tangiblesBookPerShare) {
    this.tangiblesBookPerShare = tangiblesBookPerShare;
  }


  public ValuationsNREITNODIRECTPerShareData totalDebtPerShare(@javax.annotation.Nullable BigDecimal totalDebtPerShare) {
    this.totalDebtPerShare = totalDebtPerShare;
    return this;
  }

  /**
   * The amount of long-term debt divided by the shares outstanding
   * @return totalDebtPerShare
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalDebtPerShare() {
    return totalDebtPerShare;
  }

  public void setTotalDebtPerShare(@javax.annotation.Nullable BigDecimal totalDebtPerShare) {
    this.totalDebtPerShare = totalDebtPerShare;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValuationsNREITNODIRECTPerShareData valuationsNREITNODIRECTPerShareData = (ValuationsNREITNODIRECTPerShareData) o;
    return Objects.equals(this.bookValuePerShare, valuationsNREITNODIRECTPerShareData.bookValuePerShare) &&
        Objects.equals(this.cashFlowFromOperationsPerShare, valuationsNREITNODIRECTPerShareData.cashFlowFromOperationsPerShare) &&
        Objects.equals(this.cashPerShare, valuationsNREITNODIRECTPerShareData.cashPerShare) &&
        Objects.equals(this.dividendsPerShare, valuationsNREITNODIRECTPerShareData.dividendsPerShare) &&
        Objects.equals(this.earningPerShareDiluted, valuationsNREITNODIRECTPerShareData.earningPerShareDiluted) &&
        Objects.equals(this.ebitPerShare, valuationsNREITNODIRECTPerShareData.ebitPerShare) &&
        Objects.equals(this.ebitdaPerShare, valuationsNREITNODIRECTPerShareData.ebitdaPerShare) &&
        Objects.equals(this.epsWithoutNri, valuationsNREITNODIRECTPerShareData.epsWithoutNri) &&
        Objects.equals(this.ffoPerShare, valuationsNREITNODIRECTPerShareData.ffoPerShare) &&
        Objects.equals(this.freeCashFlowPerShare, valuationsNREITNODIRECTPerShareData.freeCashFlowPerShare) &&
        Objects.equals(this.monthEndStockPrice, valuationsNREITNODIRECTPerShareData.monthEndStockPrice) &&
        Objects.equals(this.ownerEarnings, valuationsNREITNODIRECTPerShareData.ownerEarnings) &&
        Objects.equals(this.revenuePerShare, valuationsNREITNODIRECTPerShareData.revenuePerShare) &&
        Objects.equals(this.tangiblesBookPerShare, valuationsNREITNODIRECTPerShareData.tangiblesBookPerShare) &&
        Objects.equals(this.totalDebtPerShare, valuationsNREITNODIRECTPerShareData.totalDebtPerShare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookValuePerShare, cashFlowFromOperationsPerShare, cashPerShare, dividendsPerShare, earningPerShareDiluted, ebitPerShare, ebitdaPerShare, epsWithoutNri, ffoPerShare, freeCashFlowPerShare, monthEndStockPrice, ownerEarnings, revenuePerShare, tangiblesBookPerShare, totalDebtPerShare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValuationsNREITNODIRECTPerShareData {\n");
    sb.append("    bookValuePerShare: ").append(toIndentedString(bookValuePerShare)).append("\n");
    sb.append("    cashFlowFromOperationsPerShare: ").append(toIndentedString(cashFlowFromOperationsPerShare)).append("\n");
    sb.append("    cashPerShare: ").append(toIndentedString(cashPerShare)).append("\n");
    sb.append("    dividendsPerShare: ").append(toIndentedString(dividendsPerShare)).append("\n");
    sb.append("    earningPerShareDiluted: ").append(toIndentedString(earningPerShareDiluted)).append("\n");
    sb.append("    ebitPerShare: ").append(toIndentedString(ebitPerShare)).append("\n");
    sb.append("    ebitdaPerShare: ").append(toIndentedString(ebitdaPerShare)).append("\n");
    sb.append("    epsWithoutNri: ").append(toIndentedString(epsWithoutNri)).append("\n");
    sb.append("    ffoPerShare: ").append(toIndentedString(ffoPerShare)).append("\n");
    sb.append("    freeCashFlowPerShare: ").append(toIndentedString(freeCashFlowPerShare)).append("\n");
    sb.append("    monthEndStockPrice: ").append(toIndentedString(monthEndStockPrice)).append("\n");
    sb.append("    ownerEarnings: ").append(toIndentedString(ownerEarnings)).append("\n");
    sb.append("    revenuePerShare: ").append(toIndentedString(revenuePerShare)).append("\n");
    sb.append("    tangiblesBookPerShare: ").append(toIndentedString(tangiblesBookPerShare)).append("\n");
    sb.append("    totalDebtPerShare: ").append(toIndentedString(totalDebtPerShare)).append("\n");
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
    openapiFields.add("book_value_per_share");
    openapiFields.add("cash_flow_from_operations_per_share");
    openapiFields.add("cash_per_share");
    openapiFields.add("dividends_per_share");
    openapiFields.add("earning_per_share_diluted");
    openapiFields.add("ebit_per_share");
    openapiFields.add("ebitda_per_share");
    openapiFields.add("eps_without_nri");
    openapiFields.add("ffo_per_share");
    openapiFields.add("free_cash_flow_per_share");
    openapiFields.add("month_end_stock_price");
    openapiFields.add("owner_earnings");
    openapiFields.add("revenue_per_share");
    openapiFields.add("tangibles_book_per_share");
    openapiFields.add("total_debt_per_share");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ValuationsNREITNODIRECTPerShareData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ValuationsNREITNODIRECTPerShareData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValuationsNREITNODIRECTPerShareData is not found in the empty JSON string", ValuationsNREITNODIRECTPerShareData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ValuationsNREITNODIRECTPerShareData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ValuationsNREITNODIRECTPerShareData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValuationsNREITNODIRECTPerShareData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValuationsNREITNODIRECTPerShareData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValuationsNREITNODIRECTPerShareData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValuationsNREITNODIRECTPerShareData.class));

       return (TypeAdapter<T>) new TypeAdapter<ValuationsNREITNODIRECTPerShareData>() {
           @Override
           public void write(JsonWriter out, ValuationsNREITNODIRECTPerShareData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValuationsNREITNODIRECTPerShareData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ValuationsNREITNODIRECTPerShareData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ValuationsNREITNODIRECTPerShareData
   * @throws IOException if the JSON string is invalid with respect to ValuationsNREITNODIRECTPerShareData
   */
  public static ValuationsNREITNODIRECTPerShareData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValuationsNREITNODIRECTPerShareData.class);
  }

  /**
   * Convert an instance of ValuationsNREITNODIRECTPerShareData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

