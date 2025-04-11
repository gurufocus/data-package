# coding: utf-8

"""
    Gurufocus Data Package API

    API for accessing Gurufocus data packages, please go to [https://www.gurufocus.com/user/me?tab=account&subtab=api-token](https://www.gurufocus.com/user/me?tab=account&subtab=api-token) to view or generate authorization keys.

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.valuations_nnoreitdirect_valuationand_quality import ValuationsNNOREITDIRECTValuationandQuality

class TestValuationsNNOREITDIRECTValuationandQuality(unittest.TestCase):
    """ValuationsNNOREITDIRECTValuationandQuality unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ValuationsNNOREITDIRECTValuationandQuality:
        """Test ValuationsNNOREITDIRECTValuationandQuality
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ValuationsNNOREITDIRECTValuationandQuality`
        """
        model = ValuationsNNOREITDIRECTValuationandQuality()
        if include_optional:
            return ValuationsNNOREITDIRECTValuationandQuality(
                beta = 1.337,
                bs_share = 1.337,
                buyback_yield = 1.337,
                cash_ratio = 1.337,
                current_ratio = 1.337,
                earnings_release_date = '',
                ebitda_5y_growth = 1.337,
                enterprise_value = 1.337,
                epv = 1.337,
                filing_date = '',
                filing_date_aor = '',
                forex_rate = 1.337,
                fscore = 1.337,
                graham_number = 1.337,
                growth_per_share_ebitda = 1.337,
                growth_per_share_eps = 1.337,
                growth_revenue_per_share = 1.337,
                interest_coverage = 1.337,
                intrinsic_value_projected_fcf = 1.337,
                medpsvalue = 1.337,
                mktcap = 1.337,
                month_end_stock_price = 1.337,
                mscore = 1.337,
                net_cash_per_share = 1.337,
                net_current_asset_value = 1.337,
                net_net_working_capital = 1.337,
                number_of_share_holders = 1.337,
                peter_lynch_fair_value = 1.337,
                price_high = 1.337,
                price_low = 1.337,
                quick_ratio = 1.337,
                share_buyback_ratio = 1.337,
                shareholder_yield = 1.337,
                shares_basic = 1.337,
                sloan_ratio = 1.337,
                snoa = 1.337,
                total_employee_number = 1.337,
                zscore = 1.337
            )
        else:
            return ValuationsNNOREITDIRECTValuationandQuality(
        )
        """

    def testValuationsNNOREITDIRECTValuationandQuality(self):
        """Test ValuationsNNOREITDIRECTValuationandQuality"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
