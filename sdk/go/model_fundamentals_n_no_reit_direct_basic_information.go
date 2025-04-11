/*
Gurufocus Data Package API

API for accessing Gurufocus data packages, please go to [https://www.gurufocus.com/user/me?tab=account&subtab=api-token](https://www.gurufocus.com/user/me?tab=account&subtab=api-token) to view or generate authorization keys.

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// checks if the FundamentalsNNOREITDIRECTBasicInformation type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &FundamentalsNNOREITDIRECTBasicInformation{}

// FundamentalsNNOREITDIRECTBasicInformation struct for FundamentalsNNOREITDIRECTBasicInformation
type FundamentalsNNOREITDIRECTBasicInformation struct {
	// The name of the company as identified on its SEC filings.
	Company *string `json:"company,omitempty"`
	CompanyId *string `json:"company_id,omitempty"`
	// The company's stock exchange. Example: NAS for Apple.
	Exchange *string `json:"exchange,omitempty"`
	// A unique identifier for the stock
	Stockid *string `json:"stockid,omitempty"`
	// The company's stock ticker symbol
	Symbol *string `json:"symbol,omitempty"`
}

// NewFundamentalsNNOREITDIRECTBasicInformation instantiates a new FundamentalsNNOREITDIRECTBasicInformation object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewFundamentalsNNOREITDIRECTBasicInformation() *FundamentalsNNOREITDIRECTBasicInformation {
	this := FundamentalsNNOREITDIRECTBasicInformation{}
	return &this
}

// NewFundamentalsNNOREITDIRECTBasicInformationWithDefaults instantiates a new FundamentalsNNOREITDIRECTBasicInformation object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewFundamentalsNNOREITDIRECTBasicInformationWithDefaults() *FundamentalsNNOREITDIRECTBasicInformation {
	this := FundamentalsNNOREITDIRECTBasicInformation{}
	return &this
}

// GetCompany returns the Company field value if set, zero value otherwise.
func (o *FundamentalsNNOREITDIRECTBasicInformation) GetCompany() string {
	if o == nil || IsNil(o.Company) {
		var ret string
		return ret
	}
	return *o.Company
}

// GetCompanyOk returns a tuple with the Company field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FundamentalsNNOREITDIRECTBasicInformation) GetCompanyOk() (*string, bool) {
	if o == nil || IsNil(o.Company) {
		return nil, false
	}
	return o.Company, true
}

// HasCompany returns a boolean if a field has been set.
func (o *FundamentalsNNOREITDIRECTBasicInformation) HasCompany() bool {
	if o != nil && !IsNil(o.Company) {
		return true
	}

	return false
}

// SetCompany gets a reference to the given string and assigns it to the Company field.
func (o *FundamentalsNNOREITDIRECTBasicInformation) SetCompany(v string) {
	o.Company = &v
}

// GetCompanyId returns the CompanyId field value if set, zero value otherwise.
func (o *FundamentalsNNOREITDIRECTBasicInformation) GetCompanyId() string {
	if o == nil || IsNil(o.CompanyId) {
		var ret string
		return ret
	}
	return *o.CompanyId
}

// GetCompanyIdOk returns a tuple with the CompanyId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FundamentalsNNOREITDIRECTBasicInformation) GetCompanyIdOk() (*string, bool) {
	if o == nil || IsNil(o.CompanyId) {
		return nil, false
	}
	return o.CompanyId, true
}

// HasCompanyId returns a boolean if a field has been set.
func (o *FundamentalsNNOREITDIRECTBasicInformation) HasCompanyId() bool {
	if o != nil && !IsNil(o.CompanyId) {
		return true
	}

	return false
}

// SetCompanyId gets a reference to the given string and assigns it to the CompanyId field.
func (o *FundamentalsNNOREITDIRECTBasicInformation) SetCompanyId(v string) {
	o.CompanyId = &v
}

// GetExchange returns the Exchange field value if set, zero value otherwise.
func (o *FundamentalsNNOREITDIRECTBasicInformation) GetExchange() string {
	if o == nil || IsNil(o.Exchange) {
		var ret string
		return ret
	}
	return *o.Exchange
}

// GetExchangeOk returns a tuple with the Exchange field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FundamentalsNNOREITDIRECTBasicInformation) GetExchangeOk() (*string, bool) {
	if o == nil || IsNil(o.Exchange) {
		return nil, false
	}
	return o.Exchange, true
}

// HasExchange returns a boolean if a field has been set.
func (o *FundamentalsNNOREITDIRECTBasicInformation) HasExchange() bool {
	if o != nil && !IsNil(o.Exchange) {
		return true
	}

	return false
}

// SetExchange gets a reference to the given string and assigns it to the Exchange field.
func (o *FundamentalsNNOREITDIRECTBasicInformation) SetExchange(v string) {
	o.Exchange = &v
}

// GetStockid returns the Stockid field value if set, zero value otherwise.
func (o *FundamentalsNNOREITDIRECTBasicInformation) GetStockid() string {
	if o == nil || IsNil(o.Stockid) {
		var ret string
		return ret
	}
	return *o.Stockid
}

// GetStockidOk returns a tuple with the Stockid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FundamentalsNNOREITDIRECTBasicInformation) GetStockidOk() (*string, bool) {
	if o == nil || IsNil(o.Stockid) {
		return nil, false
	}
	return o.Stockid, true
}

// HasStockid returns a boolean if a field has been set.
func (o *FundamentalsNNOREITDIRECTBasicInformation) HasStockid() bool {
	if o != nil && !IsNil(o.Stockid) {
		return true
	}

	return false
}

// SetStockid gets a reference to the given string and assigns it to the Stockid field.
func (o *FundamentalsNNOREITDIRECTBasicInformation) SetStockid(v string) {
	o.Stockid = &v
}

// GetSymbol returns the Symbol field value if set, zero value otherwise.
func (o *FundamentalsNNOREITDIRECTBasicInformation) GetSymbol() string {
	if o == nil || IsNil(o.Symbol) {
		var ret string
		return ret
	}
	return *o.Symbol
}

// GetSymbolOk returns a tuple with the Symbol field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FundamentalsNNOREITDIRECTBasicInformation) GetSymbolOk() (*string, bool) {
	if o == nil || IsNil(o.Symbol) {
		return nil, false
	}
	return o.Symbol, true
}

// HasSymbol returns a boolean if a field has been set.
func (o *FundamentalsNNOREITDIRECTBasicInformation) HasSymbol() bool {
	if o != nil && !IsNil(o.Symbol) {
		return true
	}

	return false
}

// SetSymbol gets a reference to the given string and assigns it to the Symbol field.
func (o *FundamentalsNNOREITDIRECTBasicInformation) SetSymbol(v string) {
	o.Symbol = &v
}

func (o FundamentalsNNOREITDIRECTBasicInformation) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o FundamentalsNNOREITDIRECTBasicInformation) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Company) {
		toSerialize["company"] = o.Company
	}
	if !IsNil(o.CompanyId) {
		toSerialize["company_id"] = o.CompanyId
	}
	if !IsNil(o.Exchange) {
		toSerialize["exchange"] = o.Exchange
	}
	if !IsNil(o.Stockid) {
		toSerialize["stockid"] = o.Stockid
	}
	if !IsNil(o.Symbol) {
		toSerialize["symbol"] = o.Symbol
	}
	return toSerialize, nil
}

type NullableFundamentalsNNOREITDIRECTBasicInformation struct {
	value *FundamentalsNNOREITDIRECTBasicInformation
	isSet bool
}

func (v NullableFundamentalsNNOREITDIRECTBasicInformation) Get() *FundamentalsNNOREITDIRECTBasicInformation {
	return v.value
}

func (v *NullableFundamentalsNNOREITDIRECTBasicInformation) Set(val *FundamentalsNNOREITDIRECTBasicInformation) {
	v.value = val
	v.isSet = true
}

func (v NullableFundamentalsNNOREITDIRECTBasicInformation) IsSet() bool {
	return v.isSet
}

func (v *NullableFundamentalsNNOREITDIRECTBasicInformation) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableFundamentalsNNOREITDIRECTBasicInformation(val *FundamentalsNNOREITDIRECTBasicInformation) *NullableFundamentalsNNOREITDIRECTBasicInformation {
	return &NullableFundamentalsNNOREITDIRECTBasicInformation{value: val, isSet: true}
}

func (v NullableFundamentalsNNOREITDIRECTBasicInformation) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableFundamentalsNNOREITDIRECTBasicInformation) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


