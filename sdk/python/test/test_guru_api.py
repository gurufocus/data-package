# coding: utf-8

"""
    Gurufocus Data Package API

    API for accessing Gurufocus data packages, please go to [https://www.gurufocus.com/user/me?tab=account&subtab=api-token](https://www.gurufocus.com/user/me?tab=account&subtab=api-token) to view or generate authorization keys.

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.guru_api import GURUApi


class TestGURUApi(unittest.TestCase):
    """GURUApi unit test stubs"""

    def setUp(self) -> None:
        self.api = GURUApi()

    def tearDown(self) -> None:
        pass

    def test_gurus_id_get(self) -> None:
        """Test case for gurus_id_get

        Access the holdings and trades of over 4,500 institutional investors, enabling broad market trend analysis or fueling investment research tools with extensive institutional activity data
        """
        pass

    def test_gurus_list_get(self) -> None:
        """Test case for gurus_list_get

        Get the list of available gurus' basic information
        """
        pass


if __name__ == '__main__':
    unittest.main()
