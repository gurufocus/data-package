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
from openapi_client.models.valuations_inoreitnodirect_basic_information import ValuationsINOREITNODIRECTBasicInformation
from openapi_client.models.valuations_inoreitnodirect_per_share_data import ValuationsINOREITNODIRECTPerShareData
from openapi_client.models.valuations_inoreitnodirect_ratios import ValuationsINOREITNODIRECTRatios
from openapi_client.models.valuations_inoreitnodirect_valuation_ratios import ValuationsINOREITNODIRECTValuationRatios
from openapi_client.models.valuations_inoreitnodirect_valuationand_quality import ValuationsINOREITNODIRECTValuationandQuality
from typing import Optional, Set
from typing_extensions import Self

class ValuationsINOREITNODIRECT(BaseModel):
    """
    ValuationsINOREITNODIRECT
    """ # noqa: E501
    basic_information: Optional[ValuationsINOREITNODIRECTBasicInformation] = None
    per_share_data: Optional[ValuationsINOREITNODIRECTPerShareData] = None
    ratios: Optional[ValuationsINOREITNODIRECTRatios] = None
    valuation_ratios: Optional[ValuationsINOREITNODIRECTValuationRatios] = None
    valuationand_quality: Optional[ValuationsINOREITNODIRECTValuationandQuality] = None
    __properties: ClassVar[List[str]] = ["basic_information", "per_share_data", "ratios", "valuation_ratios", "valuationand_quality"]

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
        """Create an instance of ValuationsINOREITNODIRECT from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of basic_information
        if self.basic_information:
            _dict['basic_information'] = self.basic_information.to_dict()
        # override the default output from pydantic by calling `to_dict()` of per_share_data
        if self.per_share_data:
            _dict['per_share_data'] = self.per_share_data.to_dict()
        # override the default output from pydantic by calling `to_dict()` of ratios
        if self.ratios:
            _dict['ratios'] = self.ratios.to_dict()
        # override the default output from pydantic by calling `to_dict()` of valuation_ratios
        if self.valuation_ratios:
            _dict['valuation_ratios'] = self.valuation_ratios.to_dict()
        # override the default output from pydantic by calling `to_dict()` of valuationand_quality
        if self.valuationand_quality:
            _dict['valuationand_quality'] = self.valuationand_quality.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ValuationsINOREITNODIRECT from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "basic_information": ValuationsINOREITNODIRECTBasicInformation.from_dict(obj["basic_information"]) if obj.get("basic_information") is not None else None,
            "per_share_data": ValuationsINOREITNODIRECTPerShareData.from_dict(obj["per_share_data"]) if obj.get("per_share_data") is not None else None,
            "ratios": ValuationsINOREITNODIRECTRatios.from_dict(obj["ratios"]) if obj.get("ratios") is not None else None,
            "valuation_ratios": ValuationsINOREITNODIRECTValuationRatios.from_dict(obj["valuation_ratios"]) if obj.get("valuation_ratios") is not None else None,
            "valuationand_quality": ValuationsINOREITNODIRECTValuationandQuality.from_dict(obj["valuationand_quality"]) if obj.get("valuationand_quality") is not None else None
        })
        return _obj


