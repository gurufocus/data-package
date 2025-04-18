# coding: utf-8

"""
    Gurufocus Data Package API

    API for accessing Gurufocus data packages, please go to [https://www.gurufocus.com/user/me?tab=account&subtab=api-token](https://www.gurufocus.com/user/me?tab=account&subtab=api-token) to view or generate authorization keys.

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.valuations_nnoreitnodirect_basic_information import ValuationsNNOREITNODIRECTBasicInformation

class TestValuationsNNOREITNODIRECTBasicInformation(unittest.TestCase):
    """ValuationsNNOREITNODIRECTBasicInformation unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ValuationsNNOREITNODIRECTBasicInformation:
        """Test ValuationsNNOREITNODIRECTBasicInformation
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ValuationsNNOREITNODIRECTBasicInformation`
        """
        model = ValuationsNNOREITNODIRECTBasicInformation()
        if include_optional:
            return ValuationsNNOREITNODIRECTBasicInformation(
                company = '',
                company_id = '',
                exchange = '',
                stockid = '',
                symbol = ''
            )
        else:
            return ValuationsNNOREITNODIRECTBasicInformation(
        )
        """

    def testValuationsNNOREITNODIRECTBasicInformation(self):
        """Test ValuationsNNOREITNODIRECTBasicInformation"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
