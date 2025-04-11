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

class ValuationsINOREITNODIRECTRatios(BaseModel):
    """
    ValuationsINOREITNODIRECTRatios
    """ # noqa: E501
    capex_to_operating_cash_flow: Optional[Union[StrictFloat, StrictInt]] = None
    capex_to_revenue: Optional[Union[StrictFloat, StrictInt]] = None
    debt_to_asset: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Debt to assets is a leverage ratio that defines the total amount of debt relative to assets")
    debt_to_equity: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="The Debt/Equity (D/E) Ratio is calculated by dividing a company’s total liabilities by its shareholder equity. The ratio is used to evaluate a company's financial leverage.")
    degree_of_financial_leverage: Optional[Union[StrictFloat, StrictInt]] = None
    degree_of_operating_leverage: Optional[Union[StrictFloat, StrictInt]] = None
    ebitda_margin: Optional[Union[StrictFloat, StrictInt]] = None
    effective_interest_rate: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Effective interest rate on debt is the usage rate that a borrower actually pays on a debt. It is calculated as the positive value of interest expense divided by its average total debt.")
    equity_to_asset: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Equity to Asset ratio is calculated as shareholder's tangible equity divided by its total asset.")
    fcf_margin: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="FCF Margin is calculated as Free Cash Flow divided by total Revenue.")
    liabilities_to_assets: Optional[Union[StrictFloat, StrictInt]] = None
    net_margin: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Net margin is calculated as Net Income divided by its Revenue.")
    payout: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="The dividend payout ratio is the ratio of the total amount of dividends paid out to shareholders relative to the net income of the company.")
    return_on_tangible_asset: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Return on tangible assets is calculated as Net Income divided by its average total tangible assets. Total tangible assets equals to Total Assets minus Intangible Assets.")
    return_on_tangible_equity: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Return on tangible equity is calculated as Net Income attributable to Common Stockholders divided by its average total shareholder tangible equity.")
    roa: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Return on assets is calculated as Net Income divided by its Total Assets.")
    roe: Optional[Union[StrictFloat, StrictInt]] = None
    roe_adj: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="The return on equity adjusted to book values")
    roic: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Return on Invested Capital (ROIC) is calculated as follows:    Return on Invested Capital (ROIC) = (EBIT - Adjusted Taxes) / (Book Value of Debt + Book Value of Equity - Cash)")
    roiic_1y: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="1-Year Return on Invested Incremental Capital (1-Year ROIIC %) measures the change in earnings as a percentage of change in investment over 1-year.")
    rore_5y: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Return on Retained Earnings (RORE) is an indicator of a company's growth potential, it shows how much a company earns by reinvesting its retained earnings.")
    turnover: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Asset Turnover measures how quickly a company turns over its asset through sales. It is defined as     <b>Asset Turnover = Sales / {Total Assets}</b>    Companies with low profit margins tend to have high asset turnover, while those with high profit margins have low asset turnover. Companies in the retail industry tend to have a very high turnover ratio.")
    wacc: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="The weighted average cost of capital (WACC) is the rate that a company is expected to pay on average to all its security holders to finance its assets.")
    __properties: ClassVar[List[str]] = ["capex_to_operating_cash_flow", "capex_to_revenue", "debt_to_asset", "debt_to_equity", "degree_of_financial_leverage", "degree_of_operating_leverage", "ebitda_margin", "effective_interest_rate", "equity_to_asset", "fcf_margin", "liabilities_to_assets", "net_margin", "payout", "return_on_tangible_asset", "return_on_tangible_equity", "roa", "roe", "roe_adj", "roic", "roiic_1y", "rore_5y", "turnover", "wacc"]

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
        """Create an instance of ValuationsINOREITNODIRECTRatios from a JSON string"""
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
        """Create an instance of ValuationsINOREITNODIRECTRatios from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "capex_to_operating_cash_flow": obj.get("capex_to_operating_cash_flow"),
            "capex_to_revenue": obj.get("capex_to_revenue"),
            "debt_to_asset": obj.get("debt_to_asset"),
            "debt_to_equity": obj.get("debt_to_equity"),
            "degree_of_financial_leverage": obj.get("degree_of_financial_leverage"),
            "degree_of_operating_leverage": obj.get("degree_of_operating_leverage"),
            "ebitda_margin": obj.get("ebitda_margin"),
            "effective_interest_rate": obj.get("effective_interest_rate"),
            "equity_to_asset": obj.get("equity_to_asset"),
            "fcf_margin": obj.get("fcf_margin"),
            "liabilities_to_assets": obj.get("liabilities_to_assets"),
            "net_margin": obj.get("net_margin"),
            "payout": obj.get("payout"),
            "return_on_tangible_asset": obj.get("return_on_tangible_asset"),
            "return_on_tangible_equity": obj.get("return_on_tangible_equity"),
            "roa": obj.get("roa"),
            "roe": obj.get("roe"),
            "roe_adj": obj.get("roe_adj"),
            "roic": obj.get("roic"),
            "roiic_1y": obj.get("roiic_1y"),
            "rore_5y": obj.get("rore_5y"),
            "turnover": obj.get("turnover"),
            "wacc": obj.get("wacc")
        })
        return _obj


