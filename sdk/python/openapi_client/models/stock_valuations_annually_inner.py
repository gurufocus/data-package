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
from openapi_client.models.valuations_inoreitnodirect import ValuationsINOREITNODIRECT
from openapi_client.models.valuations_ireitnodirect import ValuationsIREITNODIRECT
from openapi_client.models.valuations_nnoreitdirect import ValuationsNNOREITDIRECT
from openapi_client.models.valuations_nnoreitnodirect import ValuationsNNOREITNODIRECT
from openapi_client.models.valuations_nreitdirect import ValuationsNREITDIRECT
from openapi_client.models.valuations_nreitnodirect import ValuationsNREITNODIRECT
from pydantic import StrictStr, Field
from typing import Union, List, Set, Optional, Dict
from typing_extensions import Literal, Self

STOCKVALUATIONSANNUALLYINNER_ONE_OF_SCHEMAS = ["ValuationsINOREITNODIRECT", "ValuationsIREITNODIRECT", "ValuationsNNOREITDIRECT", "ValuationsNNOREITNODIRECT", "ValuationsNREITDIRECT", "ValuationsNREITNODIRECT"]

class StockValuationsAnnuallyInner(BaseModel):
    """
    StockValuationsAnnuallyInner
    """
    # data type: ValuationsIREITNODIRECT
    oneof_schema_1_validator: Optional[ValuationsIREITNODIRECT] = None
    # data type: ValuationsINOREITNODIRECT
    oneof_schema_2_validator: Optional[ValuationsINOREITNODIRECT] = None
    # data type: ValuationsNREITDIRECT
    oneof_schema_3_validator: Optional[ValuationsNREITDIRECT] = None
    # data type: ValuationsNNOREITDIRECT
    oneof_schema_4_validator: Optional[ValuationsNNOREITDIRECT] = None
    # data type: ValuationsNREITNODIRECT
    oneof_schema_5_validator: Optional[ValuationsNREITNODIRECT] = None
    # data type: ValuationsNNOREITNODIRECT
    oneof_schema_6_validator: Optional[ValuationsNNOREITNODIRECT] = None
    actual_instance: Optional[Union[ValuationsINOREITNODIRECT, ValuationsIREITNODIRECT, ValuationsNNOREITDIRECT, ValuationsNNOREITNODIRECT, ValuationsNREITDIRECT, ValuationsNREITNODIRECT]] = None
    one_of_schemas: Set[str] = { "ValuationsINOREITNODIRECT", "ValuationsIREITNODIRECT", "ValuationsNNOREITDIRECT", "ValuationsNNOREITNODIRECT", "ValuationsNREITDIRECT", "ValuationsNREITNODIRECT" }

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
        instance = StockValuationsAnnuallyInner.model_construct()
        error_messages = []
        match = 0
        # validate data type: ValuationsIREITNODIRECT
        if not isinstance(v, ValuationsIREITNODIRECT):
            error_messages.append(f"Error! Input type `{type(v)}` is not `ValuationsIREITNODIRECT`")
        else:
            match += 1
        # validate data type: ValuationsINOREITNODIRECT
        if not isinstance(v, ValuationsINOREITNODIRECT):
            error_messages.append(f"Error! Input type `{type(v)}` is not `ValuationsINOREITNODIRECT`")
        else:
            match += 1
        # validate data type: ValuationsNREITDIRECT
        if not isinstance(v, ValuationsNREITDIRECT):
            error_messages.append(f"Error! Input type `{type(v)}` is not `ValuationsNREITDIRECT`")
        else:
            match += 1
        # validate data type: ValuationsNNOREITDIRECT
        if not isinstance(v, ValuationsNNOREITDIRECT):
            error_messages.append(f"Error! Input type `{type(v)}` is not `ValuationsNNOREITDIRECT`")
        else:
            match += 1
        # validate data type: ValuationsNREITNODIRECT
        if not isinstance(v, ValuationsNREITNODIRECT):
            error_messages.append(f"Error! Input type `{type(v)}` is not `ValuationsNREITNODIRECT`")
        else:
            match += 1
        # validate data type: ValuationsNNOREITNODIRECT
        if not isinstance(v, ValuationsNNOREITNODIRECT):
            error_messages.append(f"Error! Input type `{type(v)}` is not `ValuationsNNOREITNODIRECT`")
        else:
            match += 1
        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when setting `actual_instance` in StockValuationsAnnuallyInner with oneOf schemas: ValuationsINOREITNODIRECT, ValuationsIREITNODIRECT, ValuationsNNOREITDIRECT, ValuationsNNOREITNODIRECT, ValuationsNREITDIRECT, ValuationsNREITNODIRECT. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when setting `actual_instance` in StockValuationsAnnuallyInner with oneOf schemas: ValuationsINOREITNODIRECT, ValuationsIREITNODIRECT, ValuationsNNOREITDIRECT, ValuationsNNOREITNODIRECT, ValuationsNREITDIRECT, ValuationsNREITNODIRECT. Details: " + ", ".join(error_messages))
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

        # deserialize data into ValuationsIREITNODIRECT
        try:
            instance.actual_instance = ValuationsIREITNODIRECT.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into ValuationsINOREITNODIRECT
        try:
            instance.actual_instance = ValuationsINOREITNODIRECT.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into ValuationsNREITDIRECT
        try:
            instance.actual_instance = ValuationsNREITDIRECT.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into ValuationsNNOREITDIRECT
        try:
            instance.actual_instance = ValuationsNNOREITDIRECT.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into ValuationsNREITNODIRECT
        try:
            instance.actual_instance = ValuationsNREITNODIRECT.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into ValuationsNNOREITNODIRECT
        try:
            instance.actual_instance = ValuationsNNOREITNODIRECT.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))

        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when deserializing the JSON string into StockValuationsAnnuallyInner with oneOf schemas: ValuationsINOREITNODIRECT, ValuationsIREITNODIRECT, ValuationsNNOREITDIRECT, ValuationsNNOREITNODIRECT, ValuationsNREITDIRECT, ValuationsNREITNODIRECT. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when deserializing the JSON string into StockValuationsAnnuallyInner with oneOf schemas: ValuationsINOREITNODIRECT, ValuationsIREITNODIRECT, ValuationsNNOREITDIRECT, ValuationsNNOREITNODIRECT, ValuationsNREITDIRECT, ValuationsNREITNODIRECT. Details: " + ", ".join(error_messages))
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

    def to_dict(self) -> Optional[Union[Dict[str, Any], ValuationsINOREITNODIRECT, ValuationsIREITNODIRECT, ValuationsNNOREITDIRECT, ValuationsNNOREITNODIRECT, ValuationsNREITDIRECT, ValuationsNREITNODIRECT]]:
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


