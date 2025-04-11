# coding: utf-8

"""
    Gurufocus Data Package API

    API for accessing Gurufocus data packages, please go to [https://www.gurufocus.com/user/me?tab=account&subtab=api-token](https://www.gurufocus.com/user/me?tab=account&subtab=api-token) to view or generate authorization keys.

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.data_packages_api import DataPackagesApi


class TestDataPackagesApi(unittest.TestCase):
    """DataPackagesApi unit test stubs"""

    def setUp(self) -> None:
        self.api = DataPackagesApi()

    def tearDown(self) -> None:
        pass

    def test_download_id_get(self) -> None:
        """Test case for download_id_get

        Get download url of the data package
        """
        pass

    def test_download_list_get(self) -> None:
        """Test case for download_list_get

        List available data packages
        """
        pass


if __name__ == '__main__':
    unittest.main()
