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

class FundamentalsINOREITNODIRECTIncomeStatement(BaseModel):
    """
    FundamentalsINOREITNODIRECTIncomeStatement
    """ # noqa: E501
    depreciation_depletion_amortization: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{DDA}} is a present expense that accounts for the past cost of an asset that is now providing benefits. Depletion and amortization are synonyms for depreciation. Generally: The term depreciation is used when discussing man made tangible assets. The term depletion is used when discussing natural tangible assets. The term amortization is used when discussing intangible assets</p>")
    ebit: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="In accounting and finance, earnings before interest and taxes (EBIT), is a measure of a firm's profit that includes all expenses except interest and income tax expenses. It is the difference between operating revenues and operating expenses.")
    ebitda: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>Earnings Before Interest, Taxes, Depreciation, and Amortization ({{EBITDA}}) is what the company earns before it expenses interest, taxes, depreciation and amortization. <br>{{EBITDA}} is calculated as {{EBITDA}} = {{Revenue}} - {{COGS}} - {{SGA}} - {{RD}} = {{Gross_Profit}} - {{SGA}} - {{RD}} <br> The use of {{EBITDA}} is an attempt to make the results of different companies more comparable and uniform.</p>")
    ebitda_margin: Optional[Union[StrictFloat, StrictInt]] = None
    eps_basic: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{eps_basic}} is a rough measurement of the amount of a company's profit that can be allocated to one share of its stock. {{eps_basic}} do not factor in the dilutive effects on convertible securities. <br>{{eps_basic}} is calculated as: {{eps_basic}} = ({{Net_Income}} - {{IS_preferred_dividends}}) / {{shares_basic}}</p>")
    eps_diluated: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{eps_diluated}} is a rough measurement of the amount of a company's profit that can be allocated to one share of its stock. {{eps_diluated}} takes into account all of the outstanding dilutive securities that could potentially be exercised (such as stock options and convertible {{Preferred_Stock}}) and shows how such an action would impact {{per_share_eps}}. <br>{{eps_diluated}} is calculated as: {{eps_diluated}} = ({{Net_Income}} - {{IS_preferred_dividends}}) / {{Shares_Outstanding}}</p>")
    interest_income: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{InterestIncome}} is the interest earned on cash temporarily held in savings accounts, certificates of deposits, or other investments.</p>")
    is_fee_revenue_and_other_income: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{IS_FeeRevenueAndOtherIncome}} is the income earned by insurance companies other than providing insurances. It includes investing income, fees and interest income.</p>")
    is_interest_expense: Optional[Union[StrictFloat, StrictInt]] = None
    is_net_investment_income: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{IS_NetInvestmentIncome}} is the income earned by insurance companies through investments. Insurance companies usually invest the float they received in stocks or bonds to generate additional income before the premium is paid to cover insurance losses.</p>")
    is_net_policyholder_benefits_and_claims: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{IS_NetPolicyholderBenefitsAndClaims}} is the fund paid out by insurances companies to cover the insurance losses, liabilities and expenses</p>")
    is_other_expense_insurance: Optional[Union[StrictFloat, StrictInt]] = None
    is_policy_acquisition_expense: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{IS_PolicyAcquisitionExpense}} is the expenses incurred by insurance companies in activities such as marketing, advertising, commissions etc.</p>")
    is_preferred_dividends: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{IS_preferred_dividends}} is a dividend that is accrued and paid on a company's preferred shares. In the event that a company is unable to pay all dividends, claims to {{IS_preferred_dividends}} take precedence over claims to dividends that are paid on common shares.</p>")
    is_total_premiums_earned: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{IS_TotalPremiumsEarned}} is the portion of the premium that insurance companies earned by providing insurances for the time period that has already passed.</p>")
    net_income: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{Net_Income}} is the net profit that a company earns after deducting all costs and losses including {{COGS}}, {{SGA}}, {{DDA}}, {{InterestExpense}}, non-recurring items and {{tax}}.  <br>{{Net_Income}}  = {{Revenue}} - {{COGS}}, - {{SGA}} - {{RD}}  - {{DDA}} - {{InterestExpense}} + Non-Recurring Items  - {{tax}} = Earnings Before Depreciation and Amortization - {{DDA}} - {{InterestExpense}} - Non-Recurring Items (NRI) - {{tax}} = {{Operating_Income}} - {{InterestExpense}} - Non-Recurring Items (NRI) - {{tax}} = {{Pretax_Income}} - {{tax}}</p>")
    net_income_continuing_operations: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{Net_Income_(Continuing_Operations)}} indicates the net income that a firm brings in from ongoing business activities. These activities are expected to continue into the next reporting period.</p>")
    net_income_discontinued_operations: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{Net_Income_(Discontinued_Operations)}} indicates the net income that a firm brought in from operations that will not be used in future reporting periods.</p>")
    net_income_including_noncontrolling_interests: Optional[Union[StrictFloat, StrictInt]] = None
    net_margin: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Net margin is calculated as Net Income divided by its Revenue.")
    other_income_minority_interest: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{OtherIncomeExpense}} includes {{Minority_interest}}. {{Minority_interest}} is a significant but non-controlling ownership of less than 50% of a company's voting shares by either an investor or another company.</p>")
    other_net_income_loss: Optional[Union[StrictFloat, StrictInt]] = None
    pretax_income: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{Pretax_Income}} is the income that a company earns before paying income taxes. <br>{{Pretax_Income}} is calculated as {{Operating_Income}} + {{Non_Operating_Income}} + {{InterestExpense}} + {{InterestIncome}} + other</p>")
    revenue: Optional[Union[StrictFloat, StrictInt]] = None
    selling_general_admin_expense: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Selling, General, & Admin. Expense (SGA) includes the direct and indirect costs and all general and administrative expenses of a company. For instance, personnel cost, advertising, rent, communication costs are all part of SGA.")
    shares_outstanding: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{Cash_Flow_from_Others}} may include {{ChangeInWorkingCapital}}. These are cash differences caused by the {{ChangeInInventory}}, {{AccountsPayable}}, {{Accts_Rec}} etc. For instance, if a company pays its suppliers slower, its cash position will build up faster. If a company receives payments from its customers slower, its {{Accts_Rec}} will rise, and its cash position will grow more slowly (or even shrink).</p>")
    tax_provision: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{TaxProvision}} is the tax to be paid.</p>")
    tax_rate: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{TaxRate}} is the ratio of {{tax}} divided by {{Pretax_Income}}, usually presented in percent. <br> {{{TaxRate}} = {{tax}} / {{Pretax_Income}}</p>")
    total_expenses_insurance: Optional[Union[StrictFloat, StrictInt]] = None
    __properties: ClassVar[List[str]] = ["depreciation_depletion_amortization", "ebit", "ebitda", "ebitda_margin", "eps_basic", "eps_diluated", "interest_income", "is_fee_revenue_and_other_income", "is_interest_expense", "is_net_investment_income", "is_net_policyholder_benefits_and_claims", "is_other_expense_insurance", "is_policy_acquisition_expense", "is_preferred_dividends", "is_total_premiums_earned", "net_income", "net_income_continuing_operations", "net_income_discontinued_operations", "net_income_including_noncontrolling_interests", "net_margin", "other_income_minority_interest", "other_net_income_loss", "pretax_income", "revenue", "selling_general_admin_expense", "shares_outstanding", "tax_provision", "tax_rate", "total_expenses_insurance"]

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
        """Create an instance of FundamentalsINOREITNODIRECTIncomeStatement from a JSON string"""
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
        """Create an instance of FundamentalsINOREITNODIRECTIncomeStatement from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "depreciation_depletion_amortization": obj.get("depreciation_depletion_amortization"),
            "ebit": obj.get("ebit"),
            "ebitda": obj.get("ebitda"),
            "ebitda_margin": obj.get("ebitda_margin"),
            "eps_basic": obj.get("eps_basic"),
            "eps_diluated": obj.get("eps_diluated"),
            "interest_income": obj.get("interest_income"),
            "is_fee_revenue_and_other_income": obj.get("is_fee_revenue_and_other_income"),
            "is_interest_expense": obj.get("is_interest_expense"),
            "is_net_investment_income": obj.get("is_net_investment_income"),
            "is_net_policyholder_benefits_and_claims": obj.get("is_net_policyholder_benefits_and_claims"),
            "is_other_expense_insurance": obj.get("is_other_expense_insurance"),
            "is_policy_acquisition_expense": obj.get("is_policy_acquisition_expense"),
            "is_preferred_dividends": obj.get("is_preferred_dividends"),
            "is_total_premiums_earned": obj.get("is_total_premiums_earned"),
            "net_income": obj.get("net_income"),
            "net_income_continuing_operations": obj.get("net_income_continuing_operations"),
            "net_income_discontinued_operations": obj.get("net_income_discontinued_operations"),
            "net_income_including_noncontrolling_interests": obj.get("net_income_including_noncontrolling_interests"),
            "net_margin": obj.get("net_margin"),
            "other_income_minority_interest": obj.get("other_income_minority_interest"),
            "other_net_income_loss": obj.get("other_net_income_loss"),
            "pretax_income": obj.get("pretax_income"),
            "revenue": obj.get("revenue"),
            "selling_general_admin_expense": obj.get("selling_general_admin_expense"),
            "shares_outstanding": obj.get("shares_outstanding"),
            "tax_provision": obj.get("tax_provision"),
            "tax_rate": obj.get("tax_rate"),
            "total_expenses_insurance": obj.get("total_expenses_insurance")
        })
        return _obj


