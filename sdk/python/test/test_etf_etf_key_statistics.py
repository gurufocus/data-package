# coding: utf-8

"""
    Gurufocus Data Package API

    API for accessing Gurufocus data packages, please go to [https://www.gurufocus.com/user/me?tab=account&subtab=api-token](https://www.gurufocus.com/user/me?tab=account&subtab=api-token) to view or generate authorization keys.

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.etf_etf_key_statistics import EtfEtfKeyStatistics

class TestEtfEtfKeyStatistics(unittest.TestCase):
    """EtfEtfKeyStatistics unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> EtfEtfKeyStatistics:
        """Test EtfEtfKeyStatistics
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `EtfEtfKeyStatistics`
        """
        model = EtfEtfKeyStatistics()
        if include_optional:
            return EtfEtfKeyStatistics(
                beta = 1.337,
                display_timestamp = '',
                high = 1.337,
                low = 1.337,
                open = 1.337,
                p_pct_change = 1.337,
                price = 1.337,
                price52whigh = 1.337,
                price52wlow = 1.337,
                rsi_14 = 1.337,
                sharpe_ratio_3y = 1.337,
                sma_20 = 1.337,
                sortino_ratio_3y = 1.337,
                volatility = 1.337,
                volumn_day = 1.337
            )
        else:
            return EtfEtfKeyStatistics(
        )
        """

    def testEtfEtfKeyStatistics(self):
        """Test EtfEtfKeyStatistics"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
