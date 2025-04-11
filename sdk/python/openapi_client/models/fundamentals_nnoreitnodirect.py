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
from openapi_client.models.fundamentals_nnoreitnodirect_balance_sheet import FundamentalsNNOREITNODIRECTBalanceSheet
from openapi_client.models.fundamentals_nnoreitnodirect_basic_information import FundamentalsNNOREITNODIRECTBasicInformation
from openapi_client.models.fundamentals_nnoreitnodirect_cashflow_statement import FundamentalsNNOREITNODIRECTCashflowStatement
from openapi_client.models.fundamentals_nnoreitnodirect_income_statement import FundamentalsNNOREITNODIRECTIncomeStatement
from typing import Optional, Set
from typing_extensions import Self

class FundamentalsNNOREITNODIRECT(BaseModel):
    """
    FundamentalsNNOREITNODIRECT
    """ # noqa: E501
    balance_sheet: Optional[FundamentalsNNOREITNODIRECTBalanceSheet] = None
    basic_information: Optional[FundamentalsNNOREITNODIRECTBasicInformation] = None
    cashflow_statement: Optional[FundamentalsNNOREITNODIRECTCashflowStatement] = None
    income_statement: Optional[FundamentalsNNOREITNODIRECTIncomeStatement] = None
    __properties: ClassVar[List[str]] = ["balance_sheet", "basic_information", "cashflow_statement", "income_statement"]

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
        """Create an instance of FundamentalsNNOREITNODIRECT from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of balance_sheet
        if self.balance_sheet:
            _dict['balance_sheet'] = self.balance_sheet.to_dict()
        # override the default output from pydantic by calling `to_dict()` of basic_information
        if self.basic_information:
            _dict['basic_information'] = self.basic_information.to_dict()
        # override the default output from pydantic by calling `to_dict()` of cashflow_statement
        if self.cashflow_statement:
            _dict['cashflow_statement'] = self.cashflow_statement.to_dict()
        # override the default output from pydantic by calling `to_dict()` of income_statement
        if self.income_statement:
            _dict['income_statement'] = self.income_statement.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of FundamentalsNNOREITNODIRECT from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "balance_sheet": FundamentalsNNOREITNODIRECTBalanceSheet.from_dict(obj["balance_sheet"]) if obj.get("balance_sheet") is not None else None,
            "basic_information": FundamentalsNNOREITNODIRECTBasicInformation.from_dict(obj["basic_information"]) if obj.get("basic_information") is not None else None,
            "cashflow_statement": FundamentalsNNOREITNODIRECTCashflowStatement.from_dict(obj["cashflow_statement"]) if obj.get("cashflow_statement") is not None else None,
            "income_statement": FundamentalsNNOREITNODIRECTIncomeStatement.from_dict(obj["income_statement"]) if obj.get("income_statement") is not None else None
        })
        return _obj


