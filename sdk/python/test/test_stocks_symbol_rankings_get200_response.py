# coding: utf-8

"""
    Gurufocus Data Package API

    API for accessing Gurufocus data packages, please go to [https://www.gurufocus.com/user/me?tab=account&subtab=api-token](https://www.gurufocus.com/user/me?tab=account&subtab=api-token) to view or generate authorization keys.

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.stocks_symbol_rankings_get200_response import StocksSymbolRankingsGet200Response

class TestStocksSymbolRankingsGet200Response(unittest.TestCase):
    """StocksSymbolRankingsGet200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> StocksSymbolRankingsGet200Response:
        """Test StocksSymbolRankingsGet200Response
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `StocksSymbolRankingsGet200Response`
        """
        model = StocksSymbolRankingsGet200Response()
        if include_optional:
            return StocksSymbolRankingsGet200Response(
                basic_information = openapi_client.models.stock_rankings_basic_information.stock_rankings_basic_information(
                    company = '', 
                    company_id = '', 
                    exchange = '', 
                    stockid = '', 
                    symbol = '', ),
                guru_focus_rankings = openapi_client.models.stock_rankings_guru_focus_rankings.stock_rankings_guru_focus_rankings(
                    gf_score = 1.337, 
                    gf_score_high = 1.337, 
                    gf_score_low = 1.337, 
                    gf_score_med = 1.337, 
                    gf_score_med_5y = 1.337, 
                    gf_value = 1.337, 
                    gf_value_est = 1.337, 
                    gf_value_est_2nd = 1.337, 
                    gf_value_est_3rd = 1.337, 
                    gf_value_pct_change = 1.337, 
                    margin_gf_value = 1.337, 
                    p2gf_value = 1.337, 
                    p2gf_value_est = 1.337, 
                    p2gf_value_high = 1.337, 
                    p2gf_value_low = 1.337, 
                    p2gf_value_med = 1.337, 
                    predictability = '', 
                    rank_balancesheet = 1.337, 
                    rank_balancesheet_high = 1.337, 
                    rank_balancesheet_low = 1.337, 
                    rank_balancesheet_med = 1.337, 
                    rank_gf_value = 1.337, 
                    rank_gf_value_high = 1.337, 
                    rank_gf_value_low = 1.337, 
                    rank_growth = 1.337, 
                    rank_growth_high = 1.337, 
                    rank_growth_low = 1.337, 
                    rank_growth_med = 1.337, 
                    rank_momentum = 1.337, 
                    rank_momentum_high = 1.337, 
                    rank_momentum_low = 1.337, 
                    rank_momentum_med = 1.337, 
                    rank_profitability = 1.337, 
                    rank_profitability_high = 1.337, 
                    rank_profitability_low = 1.337, 
                    rank_profitability_med = 1.337, )
            )
        else:
            return StocksSymbolRankingsGet200Response(
        )
        """

    def testStocksSymbolRankingsGet200Response(self):
        """Test StocksSymbolRankingsGet200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
