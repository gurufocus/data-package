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

class FundamentalsNNOREITDIRECTIncomeStatement(BaseModel):
    """
    FundamentalsNNOREITDIRECTIncomeStatement
    """ # noqa: E501
    cost_of_goods_sold: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{cogs}} is the aggregate cost of goods produced and sold, and services rendered during the reporting period. It excludes {{TotalOperatingExpense}}, such as {{DDA}} and {{SGA}}. <br>{{cogs}} is directly linked to profitability of the company through {{grossmargin}}. {{grossmargin}} is calculated as ({{revenue}} - {{cogs}}) / {{revenue}}. <br>{{cogs}} is also directly linked to another concept called {{InventoryTurnover}}, which is calculated as {{COGS}} / Average {{Inventory}}.</p>")
    depreciation_depletion_amortization: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{DDA}} is a present expense that accounts for the past cost of an asset that is now providing benefits. Depletion and amortization are synonyms for depreciation. Generally: The term depreciation is used when discussing man made tangible assets. The term depletion is used when discussing natural tangible assets. The term amortization is used when discussing intangible assets</p>")
    ebit: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="In accounting and finance, earnings before interest and taxes (EBIT), is a measure of a firm's profit that includes all expenses except interest and income tax expenses. It is the difference between operating revenues and operating expenses.")
    ebitda: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>Earnings Before Interest, Taxes, Depreciation, and Amortization ({{EBITDA}}) is what the company earns before it expenses interest, taxes, depreciation and amortization. <br>{{EBITDA}} is calculated as {{EBITDA}} = {{Revenue}} - {{COGS}} - {{SGA}} - {{RD}} = {{Gross_Profit}} - {{SGA}} - {{RD}} <br> The use of {{EBITDA}} is an attempt to make the results of different companies more comparable and uniform.</p>")
    ebitda_margin: Optional[Union[StrictFloat, StrictInt]] = None
    eps_basic: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{eps_basic}} is a rough measurement of the amount of a company's profit that can be allocated to one share of its stock. {{eps_basic}} do not factor in the dilutive effects on convertible securities. <br>{{eps_basic}} is calculated as: {{eps_basic}} = ({{Net_Income}} - {{IS_preferred_dividends}}) / {{shares_basic}}</p>")
    eps_diluated: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{eps_diluated}} is a rough measurement of the amount of a company's profit that can be allocated to one share of its stock. {{eps_diluated}} takes into account all of the outstanding dilutive securities that could potentially be exercised (such as stock options and convertible {{Preferred_Stock}}) and shows how such an action would impact {{per_share_eps}}. <br>{{eps_diluated}} is calculated as: {{eps_diluated}} = ({{Net_Income}} - {{IS_preferred_dividends}}) / {{Shares_Outstanding}}</p>")
    gross_margin: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Gross Margin % is calculated as gross profit divided by its revenue.")
    gross_profit: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{Gross_Profit}} is the different between the sale prices and the cost of buying or producing the goods. It is calculated as {{Gross_Profit}} = {{Revenue}} - {{COGS}} <br>{{Gross_Profit}} is the numerator in the calculation of {{grossmargin}}: {{grossmargin}} = {{Gross_Profit}} / {{Revenue}} = ({{Revenue}} - {{COGS}}) / {{Revenue}} <br>A positive {{Gross_Profit}} is only the first step for a company to make a net profit. The {{Gross_Profit}} needs to be big enough to also cover related labor, equipment, rental, marketing/advertising, research and development and a lot of other costs in selling the products.</p>")
    interest_expense: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{InterestExpense}} is the amount reported by a company or individual as an expense for borrowed money. It is related to {{interest_coverage}}, which is a ratio that determines how easily a company can pay interest expenses on outstanding debt. <br>{{interest_coverage}} is calculated as -1 * {{Operating_Income}} / {{InterestExpense}} <br>If both {{InterestExpense}} and {{InterestIncome}} are empty, while {{NetInterestIncome}} is negative, then use {{NetInterestIncome}} as {{InterestExpense}}.</p>")
    interest_income: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{InterestIncome}} is the interest earned on cash temporarily held in savings accounts, certificates of deposits, or other investments.</p>")
    is_preferred_dividends: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{IS_preferred_dividends}} is a dividend that is accrued and paid on a company's preferred shares. In the event that a company is unable to pay all dividends, claims to {{IS_preferred_dividends}} take precedence over claims to dividends that are paid on common shares.</p>")
    net_income: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{Net_Income}} is the net profit that a company earns after deducting all costs and losses including {{COGS}}, {{SGA}}, {{DDA}}, {{InterestExpense}}, non-recurring items and {{tax}}.  <br>{{Net_Income}}  = {{Revenue}} - {{COGS}}, - {{SGA}} - {{RD}}  - {{DDA}} - {{InterestExpense}} + Non-Recurring Items  - {{tax}} = Earnings Before Depreciation and Amortization - {{DDA}} - {{InterestExpense}} - Non-Recurring Items (NRI) - {{tax}} = {{Operating_Income}} - {{InterestExpense}} - Non-Recurring Items (NRI) - {{tax}} = {{Pretax_Income}} - {{tax}}</p>")
    net_income_continuing_operations: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{Net_Income_(Continuing_Operations)}} indicates the net income that a firm brings in from ongoing business activities. These activities are expected to continue into the next reporting period.</p>")
    net_income_discontinued_operations: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{Net_Income_(Discontinued_Operations)}} indicates the net income that a firm brought in from operations that will not be used in future reporting periods.</p>")
    net_income_including_noncontrolling_interests: Optional[Union[StrictFloat, StrictInt]] = None
    net_interest_income: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{IS_NetInterestIncome}} is the income earned by banks from the fund they have on their balance sheet.</p>")
    net_margin: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Net margin is calculated as Net Income divided by its Revenue.")
    operating_income: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{Operating_Income}}, sometimes also called Earnings Before Interest and Taxes (EBIT), is the profit a company earned through operations. All expenses, including cash expenses such as {{COGS}}, {{RD}}, wages, and non-cash expenses, such as {{DDA}}, have been deducted from the sales. <br>{{Operating_Income}} (EBIT) = {{Revenue}} - {{COGS}} - {{SGA}} - {{RD}} - {{DDA}} = {{Gross_Profit}} - {{SGA}} - {{RD}} - {{DDA}} = {{EBITDA}} - {{DDA}}</p>")
    operating_margin: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Operating Margin % is calculated as Operating Income divided by its Revenue.")
    other_income_expense: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{OtherIncomeExpense}} includes {{Minority_interest}}. {{Minority_interest}} is a significant but non-controlling ownership of less than 50% of a company's voting shares by either an investor or another company.</p>")
    other_income_minority_interest: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{OtherIncomeExpense}} includes {{Minority_interest}}. {{Minority_interest}} is a significant but non-controlling ownership of less than 50% of a company's voting shares by either an investor or another company.</p>")
    other_net_income_loss: Optional[Union[StrictFloat, StrictInt]] = None
    other_operating_charges: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>GuruFocus uses a standardized financial statement format for all companies. For non-financial companies, GuruFocus lists {{SGA}}, Advertising, {{RD}}, and {{other_operating_charges}} under the \"{{TotalOperatingExpense}}\" section. {{other_operating_charges}} sometimes includes: Restructuring, and merger, Acquisition related and other, Litigation settlement charge, Other (too numerous to list). Some companies can and do choose to report each of these items separately. Yet, there are a variety of {{other_operating_charges}} which are simply too numerous to list.</p>")
    pretax_income: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{Pretax_Income}} is the income that a company earns before paying income taxes. <br>{{Pretax_Income}} is calculated as {{Operating_Income}} + {{Non_Operating_Income}} + {{InterestExpense}} + {{InterestIncome}} + other</p>")
    research_development: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>This is the expense the company spent on research and development.<br>If competitive advantage is created by a patent or tech advantage, at some point it will disappear. High {{RD}} usually dictates high {{SGA}} which threatens the competitive advantage.</p>")
    revenue: Optional[Union[StrictFloat, StrictInt]] = None
    selling_general_admin_expense: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Selling, General, & Admin. Expense (SGA) includes the direct and indirect costs and all general and administrative expenses of a company. For instance, personnel cost, advertising, rent, communication costs are all part of SGA.")
    shares_outstanding: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{Cash_Flow_from_Others}} may include {{ChangeInWorkingCapital}}. These are cash differences caused by the {{ChangeInInventory}}, {{AccountsPayable}}, {{Accts_Rec}} etc. For instance, if a company pays its suppliers slower, its cash position will build up faster. If a company receives payments from its customers slower, its {{Accts_Rec}} will rise, and its cash position will grow more slowly (or even shrink).</p>")
    tax_provision: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{TaxProvision}} is the tax to be paid.</p>")
    tax_rate: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{TaxRate}} is the ratio of {{tax}} divided by {{Pretax_Income}}, usually presented in percent. <br> {{{TaxRate}} = {{tax}} / {{Pretax_Income}}</p>")
    total_operating_expense: Optional[Union[StrictFloat, StrictInt]] = None
    __properties: ClassVar[List[str]] = ["cost_of_goods_sold", "depreciation_depletion_amortization", "ebit", "ebitda", "ebitda_margin", "eps_basic", "eps_diluated", "gross_margin", "gross_profit", "interest_expense", "interest_income", "is_preferred_dividends", "net_income", "net_income_continuing_operations", "net_income_discontinued_operations", "net_income_including_noncontrolling_interests", "net_interest_income", "net_margin", "operating_income", "operating_margin", "other_income_expense", "other_income_minority_interest", "other_net_income_loss", "other_operating_charges", "pretax_income", "research_development", "revenue", "selling_general_admin_expense", "shares_outstanding", "tax_provision", "tax_rate", "total_operating_expense"]

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
        """Create an instance of FundamentalsNNOREITDIRECTIncomeStatement from a JSON string"""
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
        """Create an instance of FundamentalsNNOREITDIRECTIncomeStatement from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "cost_of_goods_sold": obj.get("cost_of_goods_sold"),
            "depreciation_depletion_amortization": obj.get("depreciation_depletion_amortization"),
            "ebit": obj.get("ebit"),
            "ebitda": obj.get("ebitda"),
            "ebitda_margin": obj.get("ebitda_margin"),
            "eps_basic": obj.get("eps_basic"),
            "eps_diluated": obj.get("eps_diluated"),
            "gross_margin": obj.get("gross_margin"),
            "gross_profit": obj.get("gross_profit"),
            "interest_expense": obj.get("interest_expense"),
            "interest_income": obj.get("interest_income"),
            "is_preferred_dividends": obj.get("is_preferred_dividends"),
            "net_income": obj.get("net_income"),
            "net_income_continuing_operations": obj.get("net_income_continuing_operations"),
            "net_income_discontinued_operations": obj.get("net_income_discontinued_operations"),
            "net_income_including_noncontrolling_interests": obj.get("net_income_including_noncontrolling_interests"),
            "net_interest_income": obj.get("net_interest_income"),
            "net_margin": obj.get("net_margin"),
            "operating_income": obj.get("operating_income"),
            "operating_margin": obj.get("operating_margin"),
            "other_income_expense": obj.get("other_income_expense"),
            "other_income_minority_interest": obj.get("other_income_minority_interest"),
            "other_net_income_loss": obj.get("other_net_income_loss"),
            "other_operating_charges": obj.get("other_operating_charges"),
            "pretax_income": obj.get("pretax_income"),
            "research_development": obj.get("research_development"),
            "revenue": obj.get("revenue"),
            "selling_general_admin_expense": obj.get("selling_general_admin_expense"),
            "shares_outstanding": obj.get("shares_outstanding"),
            "tax_provision": obj.get("tax_provision"),
            "tax_rate": obj.get("tax_rate"),
            "total_operating_expense": obj.get("total_operating_expense")
        })
        return _obj


