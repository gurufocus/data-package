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

from pydantic import BaseModel, ConfigDict, Field, StrictFloat, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional, Union
from typing import Optional, Set
from typing_extensions import Self

class GuruTransaction(BaseModel):
    """
    Guru transaction
    """ # noqa: E501
    action: Optional[StrictStr] = Field(default=None, description="The transaction type: add, buy, reduce, sold out")
    change: Optional[Union[StrictFloat, StrictInt]] = None
    var_class: Optional[StrictStr] = Field(default=None, description="A unique identifier that describes the stock ticker's share class. Examples: Class A, Class C, ADR", alias="class")
    comment: Optional[StrictStr] = None
    company_name: Optional[StrictStr] = None
    exchange: Optional[StrictStr] = Field(default=None, description="The company's stock exchange. Example: NAS for Apple.")
    impact: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="The ratio of the dollar value of the transaction relative to the total value of the portfolio.")
    industry_code: Optional[Union[StrictFloat, StrictInt]] = None
    portdate: Optional[StrictStr] = Field(default=None, description="If the date is the end of quarters, the trades are made during the quarter ended on the dates. Otherwise, the dates are the estimated trade dates.")
    position: Optional[Union[StrictFloat, StrictInt]] = None
    price_avg: Optional[Union[StrictFloat, StrictInt]] = None
    price_max: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="For a guru trade, the highest trading price over a specific quarter")
    price_min: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="For a guru trade, the minimum trading price over a specific quarter")
    share_change: Optional[Union[StrictFloat, StrictInt]] = None
    shares: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Outstanding shares refer to a company's stock currently held by all its shareholders, including share blocks held by institutional investors and restricted shares owned by the company's officers and insiders.")
    shares_outstanding: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>{{Cash_Flow_from_Others}} may include {{ChangeInWorkingCapital}}. These are cash differences caused by the {{ChangeInInventory}}, {{AccountsPayable}}, {{Accts_Rec}} etc. For instance, if a company pays its suppliers slower, its cash position will build up faster. If a company receives payments from its customers slower, its {{Accts_Rec}} will rise, and its cash position will grow more slowly (or even shrink).</p>")
    split_factor: Optional[Union[StrictFloat, StrictInt]] = None
    stockid: Optional[StrictStr] = Field(default=None, description="A unique identifier for the stock")
    symbol: Optional[StrictStr] = Field(default=None, description="The company's stock ticker symbol")
    value: Optional[Union[StrictFloat, StrictInt]] = None
    __properties: ClassVar[List[str]] = ["action", "change", "class", "comment", "company_name", "exchange", "impact", "industry_code", "portdate", "position", "price_avg", "price_max", "price_min", "share_change", "shares", "shares_outstanding", "split_factor", "stockid", "symbol", "value"]

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
        """Create an instance of GuruTransaction from a JSON string"""
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
        """Create an instance of GuruTransaction from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "action": obj.get("action"),
            "change": obj.get("change"),
            "class": obj.get("class"),
            "comment": obj.get("comment"),
            "company_name": obj.get("company_name"),
            "exchange": obj.get("exchange"),
            "impact": obj.get("impact"),
            "industry_code": obj.get("industry_code"),
            "portdate": obj.get("portdate"),
            "position": obj.get("position"),
            "price_avg": obj.get("price_avg"),
            "price_max": obj.get("price_max"),
            "price_min": obj.get("price_min"),
            "share_change": obj.get("share_change"),
            "shares": obj.get("shares"),
            "shares_outstanding": obj.get("shares_outstanding"),
            "split_factor": obj.get("split_factor"),
            "stockid": obj.get("stockid"),
            "symbol": obj.get("symbol"),
            "value": obj.get("value")
        })
        return _obj


