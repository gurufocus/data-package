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

class ValuationsNNOREITDIRECTPerShareData(BaseModel):
    """
    ValuationsNNOREITDIRECTPerShareData
    """ # noqa: E501
    book_value_per_share: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Per share value of a company based on common shareholders' equity in the company.")
    cash_flow_from_operations_per_share: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Operating Cash Flow per Share is the amount of Operating Cash Flow per outstanding share of the company")
    cash_per_share: Optional[Union[StrictFloat, StrictInt]] = None
    dividends_per_share: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Dividends paid to per common share")
    earning_per_share_diluted: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="The company's diluted earnings per share")
    ebit_per_share: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="The earnings before interest and taxes divided by shares outstanding")
    ebitda_per_share: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="EBITDA per Share is the amount of Earnings Before Interest, Taxes, Depreciation, and  Amortization (EBITDA) per outstanding share of the company™s stock.     Earnings Before Interest, Taxes, Depreciation, and  Amortization (EBITDA) is what the company earns before  it expenses interest, taxes, depreciation and amortization.  EBITDA is calculated as   EBITDA   = {Revenue} - {Cost of Goods Sold} - {Selling, General, & Admin. Expense} - {Research & Development}  = {Gross Profit} - {Selling, General, & Admin. Expense} - {Research & Development}")
    eps_without_nri: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Earnings Per Share (EPS) is the single most important variable used by Wall Street in determining the earnings power of a company. But investors need to be aware that Earnings per Share can be easily manipulated by adjusting depreciation and amortization rate or non-recurring items. That's why GuruFocus lists Earnings per share without Non-Recurring Items, which better reflects the company's underlying performance.    Earnings Per Share without Non-Recurring Items is the amount of earnings without non-recurring items per outstanding share of the company&#146;s stock. In calculating earnings per share without non-recurring items, the dividends of preferred stocks and non-recurring items need to subtracted from the total net income first.")
    free_cash_flow_per_share: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="The company's free cash flow divided by shares outstanding")
    month_end_stock_price: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="The company's share price at the final day of the month")
    owner_earnings: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="If we think through these questions, we can gain some insights about what may be called 'owner earnings.' These represent (A) reported earnings plus (B) depreciation, depletion, amortization, and certain other non-cash charges such as Company N's items (1) and (4) less the average annual amount of capitalized expenditures for plant and equipment, etc. that the business requires to fully maintain its long-term competitive position and its unit volume. (If the business requires additional working capital to maintain its competitive position and unit volume, the increment also should be included in (c). However, businesses following the LIFO inventory method usually do not require additional working capital if unit volume does not change.")
    revenue_per_share: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="The company's total revenue divided by shares outstanding.")
    tangibles_book_per_share: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="The per share value of a company based on common shareholder's equity less intangible assets")
    total_debt_per_share: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="The amount of long-term debt divided by the shares outstanding")
    __properties: ClassVar[List[str]] = ["book_value_per_share", "cash_flow_from_operations_per_share", "cash_per_share", "dividends_per_share", "earning_per_share_diluted", "ebit_per_share", "ebitda_per_share", "eps_without_nri", "free_cash_flow_per_share", "month_end_stock_price", "owner_earnings", "revenue_per_share", "tangibles_book_per_share", "total_debt_per_share"]

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
        """Create an instance of ValuationsNNOREITDIRECTPerShareData from a JSON string"""
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
        """Create an instance of ValuationsNNOREITDIRECTPerShareData from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "book_value_per_share": obj.get("book_value_per_share"),
            "cash_flow_from_operations_per_share": obj.get("cash_flow_from_operations_per_share"),
            "cash_per_share": obj.get("cash_per_share"),
            "dividends_per_share": obj.get("dividends_per_share"),
            "earning_per_share_diluted": obj.get("earning_per_share_diluted"),
            "ebit_per_share": obj.get("ebit_per_share"),
            "ebitda_per_share": obj.get("ebitda_per_share"),
            "eps_without_nri": obj.get("eps_without_nri"),
            "free_cash_flow_per_share": obj.get("free_cash_flow_per_share"),
            "month_end_stock_price": obj.get("month_end_stock_price"),
            "owner_earnings": obj.get("owner_earnings"),
            "revenue_per_share": obj.get("revenue_per_share"),
            "tangibles_book_per_share": obj.get("tangibles_book_per_share"),
            "total_debt_per_share": obj.get("total_debt_per_share")
        })
        return _obj


