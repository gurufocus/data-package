# coding: utf-8

"""
    Gurufocus Data Package API

    API for accessing Gurufocus data packages, please go to [https://www.gurufocus.com/user/me?tab=account&subtab=api-token](https://www.gurufocus.com/user/me?tab=account&subtab=api-token) to view or generate authorization keys.

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
import pprint
from pydantic import BaseModel, ConfigDict, Field, StrictStr, ValidationError, field_validator
from typing import Any, List, Optional
from openapi_client.models.fundamentals_inoreitnodirect import FundamentalsINOREITNODIRECT
from openapi_client.models.fundamentals_ireitnodirect import FundamentalsIREITNODIRECT
from openapi_client.models.fundamentals_nnoreitdirect import FundamentalsNNOREITDIRECT
from openapi_client.models.fundamentals_nnoreitnodirect import FundamentalsNNOREITNODIRECT
from openapi_client.models.fundamentals_nreitdirect import FundamentalsNREITDIRECT
from openapi_client.models.fundamentals_nreitnodirect import FundamentalsNREITNODIRECT
from pydantic import StrictStr, Field
from typing import Union, List, Set, Optional, Dict
from typing_extensions import Literal, Self

STOCKFUNDAMENTALSTTM_ONE_OF_SCHEMAS = ["FundamentalsINOREITNODIRECT", "FundamentalsIREITNODIRECT", "FundamentalsNNOREITDIRECT", "FundamentalsNNOREITNODIRECT", "FundamentalsNREITDIRECT", "FundamentalsNREITNODIRECT"]

class StockFundamentalsTtm(BaseModel):
    """
    StockFundamentalsTtm
    """
    # data type: FundamentalsIREITNODIRECT
    oneof_schema_1_validator: Optional[FundamentalsIREITNODIRECT] = None
    # data type: FundamentalsINOREITNODIRECT
    oneof_schema_2_validator: Optional[FundamentalsINOREITNODIRECT] = None
    # data type: FundamentalsNREITDIRECT
    oneof_schema_3_validator: Optional[FundamentalsNREITDIRECT] = None
    # data type: FundamentalsNNOREITDIRECT
    oneof_schema_4_validator: Optional[FundamentalsNNOREITDIRECT] = None
    # data type: FundamentalsNREITNODIRECT
    oneof_schema_5_validator: Optional[FundamentalsNREITNODIRECT] = None
    # data type: FundamentalsNNOREITNODIRECT
    oneof_schema_6_validator: Optional[FundamentalsNNOREITNODIRECT] = None
    actual_instance: Optional[Union[FundamentalsINOREITNODIRECT, FundamentalsIREITNODIRECT, FundamentalsNNOREITDIRECT, FundamentalsNNOREITNODIRECT, FundamentalsNREITDIRECT, FundamentalsNREITNODIRECT]] = None
    one_of_schemas: Set[str] = { "FundamentalsINOREITNODIRECT", "FundamentalsIREITNODIRECT", "FundamentalsNNOREITDIRECT", "FundamentalsNNOREITNODIRECT", "FundamentalsNREITDIRECT", "FundamentalsNREITNODIRECT" }

    model_config = ConfigDict(
        validate_assignment=True,
        protected_namespaces=(),
    )


    def __init__(self, *args, **kwargs) -> None:
        if args:
            if len(args) > 1:
                raise ValueError("If a position argument is used, only 1 is allowed to set `actual_instance`")
            if kwargs:
                raise ValueError("If a position argument is used, keyword arguments cannot be used.")
            super().__init__(actual_instance=args[0])
        else:
            super().__init__(**kwargs)

    @field_validator('actual_instance')
    def actual_instance_must_validate_oneof(cls, v):
        instance = StockFundamentalsTtm.model_construct()
        error_messages = []
        match = 0
        # validate data type: FundamentalsIREITNODIRECT
        if not isinstance(v, FundamentalsIREITNODIRECT):
            error_messages.append(f"Error! Input type `{type(v)}` is not `FundamentalsIREITNODIRECT`")
        else:
            match += 1
        # validate data type: FundamentalsINOREITNODIRECT
        if not isinstance(v, FundamentalsINOREITNODIRECT):
            error_messages.append(f"Error! Input type `{type(v)}` is not `FundamentalsINOREITNODIRECT`")
        else:
            match += 1
        # validate data type: FundamentalsNREITDIRECT
        if not isinstance(v, FundamentalsNREITDIRECT):
            error_messages.append(f"Error! Input type `{type(v)}` is not `FundamentalsNREITDIRECT`")
        else:
            match += 1
        # validate data type: FundamentalsNNOREITDIRECT
        if not isinstance(v, FundamentalsNNOREITDIRECT):
            error_messages.append(f"Error! Input type `{type(v)}` is not `FundamentalsNNOREITDIRECT`")
        else:
            match += 1
        # validate data type: FundamentalsNREITNODIRECT
        if not isinstance(v, FundamentalsNREITNODIRECT):
            error_messages.append(f"Error! Input type `{type(v)}` is not `FundamentalsNREITNODIRECT`")
        else:
            match += 1
        # validate data type: FundamentalsNNOREITNODIRECT
        if not isinstance(v, FundamentalsNNOREITNODIRECT):
            error_messages.append(f"Error! Input type `{type(v)}` is not `FundamentalsNNOREITNODIRECT`")
        else:
            match += 1
        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when setting `actual_instance` in StockFundamentalsTtm with oneOf schemas: FundamentalsINOREITNODIRECT, FundamentalsIREITNODIRECT, FundamentalsNNOREITDIRECT, FundamentalsNNOREITNODIRECT, FundamentalsNREITDIRECT, FundamentalsNREITNODIRECT. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when setting `actual_instance` in StockFundamentalsTtm with oneOf schemas: FundamentalsINOREITNODIRECT, FundamentalsIREITNODIRECT, FundamentalsNNOREITDIRECT, FundamentalsNNOREITNODIRECT, FundamentalsNREITDIRECT, FundamentalsNREITNODIRECT. Details: " + ", ".join(error_messages))
        else:
            return v

    @classmethod
    def from_dict(cls, obj: Union[str, Dict[str, Any]]) -> Self:
        return cls.from_json(json.dumps(obj))

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Returns the object represented by the json string"""
        instance = cls.model_construct()
        error_messages = []
        match = 0

        # deserialize data into FundamentalsIREITNODIRECT
        try:
            instance.actual_instance = FundamentalsIREITNODIRECT.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into FundamentalsINOREITNODIRECT
        try:
            instance.actual_instance = FundamentalsINOREITNODIRECT.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into FundamentalsNREITDIRECT
        try:
            instance.actual_instance = FundamentalsNREITDIRECT.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into FundamentalsNNOREITDIRECT
        try:
            instance.actual_instance = FundamentalsNNOREITDIRECT.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into FundamentalsNREITNODIRECT
        try:
            instance.actual_instance = FundamentalsNREITNODIRECT.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into FundamentalsNNOREITNODIRECT
        try:
            instance.actual_instance = FundamentalsNNOREITNODIRECT.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))

        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when deserializing the JSON string into StockFundamentalsTtm with oneOf schemas: FundamentalsINOREITNODIRECT, FundamentalsIREITNODIRECT, FundamentalsNNOREITDIRECT, FundamentalsNNOREITNODIRECT, FundamentalsNREITDIRECT, FundamentalsNREITNODIRECT. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when deserializing the JSON string into StockFundamentalsTtm with oneOf schemas: FundamentalsINOREITNODIRECT, FundamentalsIREITNODIRECT, FundamentalsNNOREITDIRECT, FundamentalsNNOREITNODIRECT, FundamentalsNREITDIRECT, FundamentalsNREITNODIRECT. Details: " + ", ".join(error_messages))
        else:
            return instance

    def to_json(self) -> str:
        """Returns the JSON representation of the actual instance"""
        if self.actual_instance is None:
            return "null"

        if hasattr(self.actual_instance, "to_json") and callable(self.actual_instance.to_json):
            return self.actual_instance.to_json()
        else:
            return json.dumps(self.actual_instance)

    def to_dict(self) -> Optional[Union[Dict[str, Any], FundamentalsINOREITNODIRECT, FundamentalsIREITNODIRECT, FundamentalsNNOREITDIRECT, FundamentalsNNOREITNODIRECT, FundamentalsNREITDIRECT, FundamentalsNREITNODIRECT]]:
        """Returns the dict representation of the actual instance"""
        if self.actual_instance is None:
            return None

        if hasattr(self.actual_instance, "to_dict") and callable(self.actual_instance.to_dict):
            return self.actual_instance.to_dict()
        else:
            # primitive type
            return self.actual_instance

    def to_str(self) -> str:
        """Returns the string representation of the actual instance"""
        return pprint.pformat(self.model_dump())


