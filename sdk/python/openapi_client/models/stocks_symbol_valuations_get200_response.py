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

from pydantic import BaseModel, ConfigDict
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.stock_valuations_annually_inner import StockValuationsAnnuallyInner
from openapi_client.models.stock_valuations_basic_information import StockValuationsBasicInformation
from openapi_client.models.stock_valuations_ttm import StockValuationsTtm
from typing import Optional, Set
from typing_extensions import Self

class StocksSymbolValuationsGet200Response(BaseModel):
    """
    StocksSymbolValuationsGet200Response
    """ # noqa: E501
    annually: Optional[List[StockValuationsAnnuallyInner]] = None
    basic_information: Optional[StockValuationsBasicInformation] = None
    quarterly: Optional[List[StockValuationsAnnuallyInner]] = None
    ttm: Optional[StockValuationsTtm] = None
    __properties: ClassVar[List[str]] = ["annually", "basic_information", "quarterly", "ttm"]

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
        """Create an instance of StocksSymbolValuationsGet200Response from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in annually (list)
        _items = []
        if self.annually:
            for _item_annually in self.annually:
                if _item_annually:
                    _items.append(_item_annually.to_dict())
            _dict['annually'] = _items
        # override the default output from pydantic by calling `to_dict()` of basic_information
        if self.basic_information:
            _dict['basic_information'] = self.basic_information.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in quarterly (list)
        _items = []
        if self.quarterly:
            for _item_quarterly in self.quarterly:
                if _item_quarterly:
                    _items.append(_item_quarterly.to_dict())
            _dict['quarterly'] = _items
        # override the default output from pydantic by calling `to_dict()` of ttm
        if self.ttm:
            _dict['ttm'] = self.ttm.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of StocksSymbolValuationsGet200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "annually": [StockValuationsAnnuallyInner.from_dict(_item) for _item in obj["annually"]] if obj.get("annually") is not None else None,
            "basic_information": StockValuationsBasicInformation.from_dict(obj["basic_information"]) if obj.get("basic_information") is not None else None,
            "quarterly": [StockValuationsAnnuallyInner.from_dict(_item) for _item in obj["quarterly"]] if obj.get("quarterly") is not None else None,
            "ttm": StockValuationsTtm.from_dict(obj["ttm"]) if obj.get("ttm") is not None else None
        })
        return _obj


