# coding: utf-8

"""
    Gurufocus Data Package API

    API for accessing Gurufocus data packages, please go to [https://www.gurufocus.com/user/me?tab=account&subtab=api-token](https://www.gurufocus.com/user/me?tab=account&subtab=api-token) to view or generate authorization keys.

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictFloat, StrictInt
from typing import Any, ClassVar, Dict, List, Optional, Union
from typing import Optional, Set
from typing_extensions import Self

class FundamentalsNREITNODIRECTCashflowStatement(BaseModel):
    """
    FundamentalsNREITNODIRECTCashflowStatement
    """ # noqa: E501
    asset_impairment_charge: Optional[Union[StrictFloat, StrictInt]] = None
    beginning_cash_position: Optional[Union[StrictFloat, StrictInt]] = None
    cash_flow_capital_expenditure: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{Cash_Flow_CPEX}} refers to the funds spent for a company to acquire or upgrade physical assets such as property, industrial buildings or equipment.</p>")
    cash_flow_deferred_tax: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{CF_DeferredTax}} represents future tax liability or asset, resulting from temporary differences between book (accounting) value of assets and liabilities, and their tax value. This arises due to differences between financial accounting for shareholders and tax accounting.</p>")
    cash_flow_depreciation_depletion_amortization: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{DDA}} is a present expense that accounts for the past cost of an asset that is now providing benefits. Depletion and amortization are synonyms for depreciation. Generally: The term depreciation is used when discussing man made tangible assets. The term depletion is used when discussing natural tangible assets. The term amortization is used when discussing intangible assets</p>")
    cash_flow_for_lease_financing: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="https://www.gurufocus.com/glossary/cash_flow_for_lease_financing")
    cash_flow_from_investing: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{Cash_Flow_from_Investing}} covers the cash a company gains or spends from investment activities in financial market and operating subsidiaries. It also includes the cash the company used for {{Net_PPE}}(PPE). If a company spends cash on {{Net_PPE}} (PPE), this will reduce their cash position. This is called {{Cash_Flow_CPEX}} (CPEX). Likewise, if a company buys another company for cash, this will reduce their cash position. <br>{{Cash_Flow_from_Investing}} is calculated as {{Cash_Flow_from_Investing}} = {{PurchaseOfPPE}} + {{SaleOfPPE}} + {{PurchaseOfBusiness}} + {{SaleOfBusiness}} + {{PurchaseOfInvestment}} + {{SaleOfInvestment}} + {{NetIntangiblesPurchaseAndSale}} + {{CashFromDiscontinuedInvestingActivities}} + {{CashFromOtherInvestingActivities}}</p>")
    cash_flow_from_operations: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{Cash_Flow_from_Operations}} refers to the cash brought in through a company's sales. <br>Therefore, {{Cash_Flow_from_Operations}} = {{NetIncomeFromContinuingOperations}} + {{CF_DDA}} + {ChangeInWorkingCapital}} + Deferred Tax + {{Cash_Flow_from_Disc_Op}} + {{AssetImpairmentCharge}} + {{StockBasedCompensation}} + {{Cash_Flow_from_Others}}</p>")
    cash_flow_from_others: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{Cash_Flow_from_Others}} may include {{ChangeInWorkingCapital}}. These are cash differences caused by the {{ChangeInInventory}}, {{AccountsPayable}}, {{Accts_Rec}} etc. For instance, if a company pays its suppliers slower, its cash position will build up faster. If a company receives payments from its customers slower, its {{Accts_Rec}} will rise, and its cash position will grow more slowly (or even shrink).</p>")
    cash_from_discontinued_investing_activities: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{CashFromDiscontinuedInvestingActivities}} means the cash received by a company that comes from the discontinued investing activities.</p>")
    cash_from_discontinued_operating_activities: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="The cash generated from discontinued operations")
    cash_from_financing: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{Cash_from_Financing}} is the cash generated/spent from financial activities such as share issuance (buy back), debt issuance (repayment), and dividends paid to preferred and common stockholders. In the calculation of {{total_freecashflow}}, {{Cash_from_Financing}} is not calculated because it is not related to operating activities. <br>{{Cash_from_Financing}} = {{Issuance_of_Stock}} + {{Repurchase_of_Stock}} + {{Net_Issuance_of_Debt}} + {{Net_Issuance_of_preferred}} + {{Dividends}} + Other Financing</p>")
    cash_from_other_investing_activities: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{CashFromOtherInvestingActivities}} means the cash received by a company that comes from other investing activities.</p>")
    change_in_inventory: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{ChangeInInventory}} is the difference between last period's ending inventory and the current period's ending inventory.</p>")
    change_in_other_working_capital: Optional[Union[StrictFloat, StrictInt]] = None
    change_in_payables_and_accrued_expense: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{ChangeInPayablesAndAccruedExpense}} is the increase or decrease between periods of the {{Accts_Payable}}. Accrued expenses represent expenses incurred at the end of the reporting period but not yet paid; also called accrued liabilities. The accrued liability is shown under Liabilities section in the balance sheet.</p>")
    change_in_prepaid_assets: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{ChangeInPrepaidAssets}} is any increase or decrease between periods of the prepaid assets.</p>")
    change_in_receivables: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>Change In {{Accts_Rec}} relative to the previous period. It is any increase or decrease in the cash a company is owed by its customers.</p>")
    change_in_working_capital: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>Working Capital is a measure of a company's short term liquidity or its ability to cover short term liabilities. It is defined as the difference between a company's {{Total_Current_Assets}} and {{Total_Current_Liabilities}}. <br>Working Capital is calculated as: Working Capital = {{Total_Current_Assets}} - {{Total_Current_Liabilities}} <br>{{ChangeInWorkingCapital}} is reported in the cash flow statement since it is one of the major ways in which {{Net_Income}} can differ from operating cash flow.</p>")
    debt_issuance: Optional[Union[StrictFloat, StrictInt]] = None
    debt_payments: Optional[Union[StrictFloat, StrictInt]] = None
    dividends: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{Dividends}} refers to the payment of cash to shareholders as dividends when the company generates income.</p>")
    effect_of_exchange_rate_changes: Optional[Union[StrictFloat, StrictInt]] = None
    ending_cash_position: Optional[Union[StrictFloat, StrictInt]] = None
    ffo: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{FFO}} (Funds from operations) refers to the figure used by real estate investment trusts (REITs) to define the cash flow from their operations. It is calculated by adding depreciation and amortization to earnings, subtracting any gains on sales.</p>")
    issuance_of_stock: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>A company may raise cash from issuing new shares. It can also use cash to buy back shares. If this number is positive, it means that the company has received more cash from issuing shares than it has paid to buy back shares. If this number is negative, it means that company has paid more cash to buy back shares than it has received for issuing shares.</p>")
    net_change_in_cash: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{Net_Change_in_Cash}} is calculated as {{Net_Change_in_Cash}} = {{Cash_Flow_from_Operations}} + {{Cash_Flow_from_Investing}} + {{Cash_from_Financing}} + {{effect_of_exchange_rate_changes}}</p>")
    net_income_from_continuing_operations: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{NetIncomeFromContinuingOperations}} indicates the {{Net_Income}} that a firm brings in from ongoing business activities. These activities are expected to continue into the next reporting period. It excludes extraordinary items, income from the cumulative effects of accounting changes, non-recurring items, income from tax loss carry forward, and {{IS_preferred_dividends}}.</p>")
    net_intangibles_purchase_and_sale: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{NetIntangiblesPurchaseAndSale}} means the net cash inflow received by a company that comes from the purchase and sale of intangibles. It equals the cash received from sale of intangibles minus the cash spent on purchasing intangibles.</p>")
    net_issuance_of_debt: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{Net_Issuance_of_Debt}} is the cash a company received or spent through debt related activities such as debt issuance or debt repayment. If a company pays down its debt during the period, this number will be negative. If a company issued more debt, it receives cash and this number is positive.</p>")
    net_issuance_of_preferred: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>A company may raise cash from issuing new preferred shares. It can also use cash to buy back preferred shares. If this number is positive, it means that the company has received more cash from issuing preferred shares than it has paid to buy back preferred shares. If this number is negative, it means that company has paid more cash to buy back preferred shares than it has received for issuing preferred shares.</p>")
    other_financing: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{Other_Financing}} represents other {{Cash_from_Financing}} activity that not otherwise classified, which includes: Proceeds From Stock Option Exercised, Other Financing Charges.</p>")
    purchase_of_business: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{PurchaseOfBusiness}} is the amount used to purchase business.</p>")
    purchase_of_investment: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{PurchaseOfInvestment}} represents cash outflow on the purchase of investments in securities.</p>")
    purchase_of_ppe: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{PurchaseOfPPE}} is the amount used to purchase Property, Plant and Equipment.</p>")
    repurchase_of_stock: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>A company may raise cash from issuing new shares. It can also use cash to buy back shares. {{Repurchase_of_Stock}} represents the cash outflow to reacquire common stock during the period.</p>")
    sale_of_business: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{SaleOfBusiness}} is the amount earned to sell business.</p>")
    sale_of_investment: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{SaleOfInvestment}} represents cash inflow on the sale of investments in securities.</p>")
    sale_of_ppe: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{SaleOfPPE}} is the amount earned to sell {{Net_PPE}}. </p>")
    stock_based_compensation: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{StockBasedCompensation}} is a way corporations use stock options to reward employees. It provides executives and employees the opportunity to share in the growth of the company and, if structured properly, can align their interests with the interests of the company's shareholders and investors, without burning the company's cash on hand.</p>")
    total_free_cash_flow: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{total_freecashflow}} is considered one of the most important parameters to measure a company's earnings power by value investors because it is not subject to estimates of {{DDA}} (DDA). However, when we look at the {{total_freecashflow}}, we should look from a long term perspective, because any year's {{total_freecashflow}} can be drastically affected by the spending on {{Net_PPE}} (PPE) of the business in that year. Over the long term, {{total_freecashflow}} should give pretty good picture on the real earnings power of the company. <br>{{total_freecashflow}} is calculated as {{total_freecashflow}} = {{cash_Flow_from_Operations}} + {{Cash_Flow_CPEX}}</p>")
    __properties: ClassVar[List[str]] = ["asset_impairment_charge", "beginning_cash_position", "cash_flow_capital_expenditure", "cash_flow_deferred_tax", "cash_flow_depreciation_depletion_amortization", "cash_flow_for_lease_financing", "cash_flow_from_investing", "cash_flow_from_operations", "cash_flow_from_others", "cash_from_discontinued_investing_activities", "cash_from_discontinued_operating_activities", "cash_from_financing", "cash_from_other_investing_activities", "change_in_inventory", "change_in_other_working_capital", "change_in_payables_and_accrued_expense", "change_in_prepaid_assets", "change_in_receivables", "change_in_working_capital", "debt_issuance", "debt_payments", "dividends", "effect_of_exchange_rate_changes", "ending_cash_position", "ffo", "issuance_of_stock", "net_change_in_cash", "net_income_from_continuing_operations", "net_intangibles_purchase_and_sale", "net_issuance_of_debt", "net_issuance_of_preferred", "other_financing", "purchase_of_business", "purchase_of_investment", "purchase_of_ppe", "repurchase_of_stock", "sale_of_business", "sale_of_investment", "sale_of_ppe", "stock_based_compensation", "total_free_cash_flow"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of FundamentalsNREITNODIRECTCashflowStatement from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of FundamentalsNREITNODIRECTCashflowStatement from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "asset_impairment_charge": obj.get("asset_impairment_charge"),
            "beginning_cash_position": obj.get("beginning_cash_position"),
            "cash_flow_capital_expenditure": obj.get("cash_flow_capital_expenditure"),
            "cash_flow_deferred_tax": obj.get("cash_flow_deferred_tax"),
            "cash_flow_depreciation_depletion_amortization": obj.get("cash_flow_depreciation_depletion_amortization"),
            "cash_flow_for_lease_financing": obj.get("cash_flow_for_lease_financing"),
            "cash_flow_from_investing": obj.get("cash_flow_from_investing"),
            "cash_flow_from_operations": obj.get("cash_flow_from_operations"),
            "cash_flow_from_others": obj.get("cash_flow_from_others"),
            "cash_from_discontinued_investing_activities": obj.get("cash_from_discontinued_investing_activities"),
            "cash_from_discontinued_operating_activities": obj.get("cash_from_discontinued_operating_activities"),
            "cash_from_financing": obj.get("cash_from_financing"),
            "cash_from_other_investing_activities": obj.get("cash_from_other_investing_activities"),
            "change_in_inventory": obj.get("change_in_inventory"),
            "change_in_other_working_capital": obj.get("change_in_other_working_capital"),
            "change_in_payables_and_accrued_expense": obj.get("change_in_payables_and_accrued_expense"),
            "change_in_prepaid_assets": obj.get("change_in_prepaid_assets"),
            "change_in_receivables": obj.get("change_in_receivables"),
            "change_in_working_capital": obj.get("change_in_working_capital"),
            "debt_issuance": obj.get("debt_issuance"),
            "debt_payments": obj.get("debt_payments"),
            "dividends": obj.get("dividends"),
            "effect_of_exchange_rate_changes": obj.get("effect_of_exchange_rate_changes"),
            "ending_cash_position": obj.get("ending_cash_position"),
            "ffo": obj.get("ffo"),
            "issuance_of_stock": obj.get("issuance_of_stock"),
            "net_change_in_cash": obj.get("net_change_in_cash"),
            "net_income_from_continuing_operations": obj.get("net_income_from_continuing_operations"),
            "net_intangibles_purchase_and_sale": obj.get("net_intangibles_purchase_and_sale"),
            "net_issuance_of_debt": obj.get("net_issuance_of_debt"),
            "net_issuance_of_preferred": obj.get("net_issuance_of_preferred"),
            "other_financing": obj.get("other_financing"),
            "purchase_of_business": obj.get("purchase_of_business"),
            "purchase_of_investment": obj.get("purchase_of_investment"),
            "purchase_of_ppe": obj.get("purchase_of_ppe"),
            "repurchase_of_stock": obj.get("repurchase_of_stock"),
            "sale_of_business": obj.get("sale_of_business"),
            "sale_of_investment": obj.get("sale_of_investment"),
            "sale_of_ppe": obj.get("sale_of_ppe"),
            "stock_based_compensation": obj.get("stock_based_compensation"),
            "total_free_cash_flow": obj.get("total_free_cash_flow")
        })
        return _obj


