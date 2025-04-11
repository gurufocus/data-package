# coding: utf-8

"""
    Gurufocus Data Package API

    API for accessing Gurufocus data packages, please go to [https://www.gurufocus.com/user/me?tab=account&subtab=api-token](https://www.gurufocus.com/user/me?tab=account&subtab=api-token) to view or generate authorization keys.

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.download_id_get200_response import DownloadIdGet200Response

class TestDownloadIdGet200Response(unittest.TestCase):
    """DownloadIdGet200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DownloadIdGet200Response:
        """Test DownloadIdGet200Response
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DownloadIdGet200Response`
        """
        model = DownloadIdGet200Response()
        if include_optional:
            return DownloadIdGet200Response(
                expiration = '2025-04-03T12:00Z',
                id = 'ebe74eed-6a33-4988-b94f-c7afb6b3e919',
                url = 'https://api.gfmicro.com/data-package/download/ebe74eed-6a33-4988-b94f-c7afb6b3e919'
            )
        else:
            return DownloadIdGet200Response(
        )
        """

    def testDownloadIdGet200Response(self):
        """Test DownloadIdGet200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
