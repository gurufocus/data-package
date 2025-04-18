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

class EtfEtfFundamental(BaseModel):
    """
    EtfEtfFundamental
    """ # noqa: E501
    mktcap: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Market cap is the short version of market capitalization. It is the total market value to buy the whole company. It is equal to the share price times the number of shares outstanding.")
    pb: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Companies use the price-to-book ratio to compare a firm's market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio.")
    pbhigh: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Companies use the price-to-book ratio to compare a firm's market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio.")
    pblow: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Companies use the price-to-book ratio to compare a firm's market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio.")
    pbmed: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Companies use the price-to-book ratio to compare a firm's market to book value by dividing price per share by book value per share. Some people know it as the price-equity ratio.")
    pe: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="<p>The PE ratio, or Price-to-Earnings ratio, is the most widely used metric in the valuation of stocks. It is calculated as:  <b>PE Ratio = Share Price / {{eps_diluated}}</b>.   It can also be calculated from the numbers for the whole company:  <b>PE Ratio = {{mktcap}} / {{net_income}}</b>.</p>  <p>There are at least three kinds of PE ratios used among different investors. They are Trailing Twelve Month PE Ratio({{pettm}}), {{forwardPE}}, and {{penri}}. A new PE ratio based on inflation-adjusted normalized PE ratio is called {{ShillerPE}}, after Yale professor Robert Shiller.</p>  <p>In the calculation of {{pettm}}, the earnings per share used are the earnings per share over the past 12 months({{ttm_eps}}). For {{forwardPE}}, the earnings are the expected earnings for the next twelve months({{forward_eps}}). In the case of {{penri}}, the reported earnings less the non-recurring items are used({{eps_nri}}).For the {{ShillerPE}}, the earnings of the past 10 years are inflation-adjusted and averaged. Since {{ShillerPE}} looks at the average over the last 10 years, it is also called PE10.</p>")
    pettmhigh: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="The highest price-earnings ratio over the past 10 years")
    pettmlow: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="The lowest price-earnings ratio over the past 10 years")
    pettmmed: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="The median price-earnings ratio over the past 10 years")
    shares: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Outstanding shares refer to a company's stock currently held by all its shareholders, including share blocks held by institutional investors and restricted shares owned by the company's officers and insiders.")
    __properties: ClassVar[List[str]] = ["mktcap", "pb", "pbhigh", "pblow", "pbmed", "pe", "pettmhigh", "pettmlow", "pettmmed", "shares"]

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
        """Create an instance of EtfEtfFundamental from a JSON string"""
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
        """Create an instance of EtfEtfFundamental from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "mktcap": obj.get("mktcap"),
            "pb": obj.get("pb"),
            "pbhigh": obj.get("pbhigh"),
            "pblow": obj.get("pblow"),
            "pbmed": obj.get("pbmed"),
            "pe": obj.get("pe"),
            "pettmhigh": obj.get("pettmhigh"),
            "pettmlow": obj.get("pettmlow"),
            "pettmmed": obj.get("pettmmed"),
            "shares": obj.get("shares")
        })
        return _obj


