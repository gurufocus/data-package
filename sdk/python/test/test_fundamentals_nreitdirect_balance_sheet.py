# coding: utf-8

"""
    Gurufocus Data Package API

    API for accessing Gurufocus data packages, please go to [https://www.gurufocus.com/user/me?tab=account&subtab=api-token](https://www.gurufocus.com/user/me?tab=account&subtab=api-token) to view or generate authorization keys.

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.fundamentals_nreitdirect_balance_sheet import FundamentalsNREITDIRECTBalanceSheet

class TestFundamentalsNREITDIRECTBalanceSheet(unittest.TestCase):
    """FundamentalsNREITDIRECTBalanceSheet unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> FundamentalsNREITDIRECTBalanceSheet:
        """Test FundamentalsNREITDIRECTBalanceSheet
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `FundamentalsNREITDIRECTBalanceSheet`
        """
        model = FundamentalsNREITDIRECTBalanceSheet()
        if include_optional:
            return FundamentalsNREITDIRECTBalanceSheet(
                accounts_payable = 1.337,
                accounts_payable_accrued_expense = 1.337,
                accounts_receivable = 1.337,
                accumulated_depreciation = 1.337,
                accumulated_other_comprehensive_income = 1.337,
                additional_paid_in_capital = 1.337,
                bs_current_deferred_liabilities = 1.337,
                buildings_and_improvements = 1.337,
                cash_and_cash_equivalents = 1.337,
                cash_equivalents_marketable_securities = 1.337,
                common_stock = 1.337,
                construction_in_progress = 1.337,
                current_accrued_expenses = 1.337,
                current_deferred_revenue = 1.337,
                current_deferred_taxes_liabilities = 1.337,
                debt_to_equity = 1.337,
                equity_to_asset = 1.337,
                finished_goods = 1.337,
                good_will = 1.337,
                gross_ppe = 1.337,
                intangibles = 1.337,
                inventories_adjustments_allowances = 1.337,
                inventory = 1.337,
                investments_and_advances = 1.337,
                land_and_improvements = 1.337,
                loans_receivable = 1.337,
                long_term_capital_lease_obligation = 1.337,
                long_term_debt = 1.337,
                long_term_debt_and_capital_lease_obligation = 1.337,
                machinery_furniture_equipment = 1.337,
                marke_table_securities = 1.337,
                minority_interest = 1.337,
                net_ppe = 1.337,
                non_current_deferred_income_tax = 1.337,
                non_current_deferred_liabilities = 1.337,
                notes_receivable = 1.337,
                other_current_assets = 1.337,
                other_current_liabilities = 1.337,
                other_current_payables = 1.337,
                other_current_receivables = 1.337,
                other_equity = 1.337,
                other_gross_ppe = 1.337,
                other_inventories = 1.337,
                other_long_term_assets = 1.337,
                other_long_term_liabilities = 1.337,
                pension_and_retirement_benefit = 1.337,
                preferred_stock = 1.337,
                raw_materials = 1.337,
                retained_earnings = 1.337,
                short_term_capital_lease_obligation = 1.337,
                short_term_debt = 1.337,
                short_term_debt_and_capital_lease_obligation = 1.337,
                total_assets = 1.337,
                total_current_assets = 1.337,
                total_current_liabilities = 1.337,
                total_equity = 1.337,
                total_liabilities = 1.337,
                total_non_current_assets = 1.337,
                total_non_current_liabilities_net_minority_interest = 1.337,
                total_receivables = 1.337,
                total_stockholders_equity = 1.337,
                total_tax_payable = 1.337,
                treasury_stock = 1.337,
                work_in_process = 1.337
            )
        else:
            return FundamentalsNREITDIRECTBalanceSheet(
        )
        """

    def testFundamentalsNREITDIRECTBalanceSheet(self):
        """Test FundamentalsNREITDIRECTBalanceSheet"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
