# coding: utf-8

"""
    Gurufocus Data Package API

    API for accessing Gurufocus data packages, please go to [https://www.gurufocus.com/user/me?tab=account&subtab=api-token](https://www.gurufocus.com/user/me?tab=account&subtab=api-token) to view or generate authorization keys.

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.valuations_nreitdirect_valuation_ratios import ValuationsNREITDIRECTValuationRatios

class TestValuationsNREITDIRECTValuationRatios(unittest.TestCase):
    """ValuationsNREITDIRECTValuationRatios unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ValuationsNREITDIRECTValuationRatios:
        """Test ValuationsNREITDIRECTValuationRatios
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ValuationsNREITDIRECTValuationRatios`
        """
        model = ValuationsNREITDIRECTValuationRatios()
        if include_optional:
            return ValuationsNREITDIRECTValuationRatios(
                cyclically_adjusted_pb_ratio = 1.337,
                cyclically_adjusted_price_to_fcf = 1.337,
                cyclically_adjusted_ps_ratio = 1.337,
                earning_yield_greenblatt = 1.337,
                enterprise_value_to_ebit = 1.337,
                enterprise_value_to_ebitda = 1.337,
                enterprise_value_to_fcf = 1.337,
                enterprise_value_to_revenue = 1.337,
                fcf_yield = 1.337,
                pb_ratio = 1.337,
                pe_ratio = 1.337,
                peg_ratio = 1.337,
                penri = 1.337,
                price_to_ffo = 1.337,
                price_to_free_cash_flow = 1.337,
                price_to_operating_cash_flow = 1.337,
                price_to_owner_earnings = 1.337,
                price_to_tangible_book = 1.337,
                ps_ratio = 1.337,
                rate_of_return_value = 1.337,
                shiller_pe_ratio = 1.337,
                var_yield = 1.337
            )
        else:
            return ValuationsNREITDIRECTValuationRatios(
        )
        """

    def testValuationsNREITDIRECTValuationRatios(self):
        """Test ValuationsNREITDIRECTValuationRatios"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
