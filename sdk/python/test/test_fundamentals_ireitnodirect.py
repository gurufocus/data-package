# coding: utf-8

"""
    Gurufocus Data Package API

    API for accessing Gurufocus data packages, please go to [https://www.gurufocus.com/user/me?tab=account&subtab=api-token](https://www.gurufocus.com/user/me?tab=account&subtab=api-token) to view or generate authorization keys.

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.fundamentals_ireitnodirect import FundamentalsIREITNODIRECT

class TestFundamentalsIREITNODIRECT(unittest.TestCase):
    """FundamentalsIREITNODIRECT unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> FundamentalsIREITNODIRECT:
        """Test FundamentalsIREITNODIRECT
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `FundamentalsIREITNODIRECT`
        """
        model = FundamentalsIREITNODIRECT()
        if include_optional:
            return FundamentalsIREITNODIRECT(
                balance_sheet = openapi_client.models.fundamentals_i_reit_no_direct_balance_sheet.fundamentals_I_REIT_NO_DIRECT_balance_sheet(
                    accounts_receivable = 1.337, 
                    accumulated_other_comprehensive_income = 1.337, 
                    additional_paid_in_capital = 1.337, 
                    bs_cash_and_cash_equivalents = 1.337, 
                    bs_current_deferred_liabilities = 1.337, 
                    bs_deferred_policy_acquisition_costs = 1.337, 
                    bs_equity_investments = 1.337, 
                    bs_fixed_maturity_investment = 1.337, 
                    bs_future_policy_benefits = 1.337, 
                    bs_net_loan = 1.337, 
                    bs_other_assets_insurance = 1.337, 
                    bs_other_liabilities_insurance = 1.337, 
                    bs_payables_and_accrued_expenses = 1.337, 
                    bs_policyholder_funds = 1.337, 
                    bs_trading_assets = 1.337, 
                    bs_unearned_premiums = 1.337, 
                    bs_unpaid_loss_and_loss_reserve = 1.337, 
                    common_stock = 1.337, 
                    current_deferred_revenue = 1.337, 
                    current_deferred_taxes_liabilities = 1.337, 
                    debt_to_equity = 1.337, 
                    equity_to_asset = 1.337, 
                    good_will = 1.337, 
                    intangibles = 1.337, 
                    long_term_debt_and_capital_lease_obligation = 1.337, 
                    minority_interest = 1.337, 
                    net_ppe = 1.337, 
                    non_current_deferred_income_tax = 1.337, 
                    non_current_deferred_liabilities = 1.337, 
                    notes_receivable = 1.337, 
                    other_current_receivables = 1.337, 
                    other_equity = 1.337, 
                    preferred_stock = 1.337, 
                    retained_earnings = 1.337, 
                    short_term_debt_and_capital_lease_obligation = 1.337, 
                    total_assets = 1.337, 
                    total_equity = 1.337, 
                    total_liabilities = 1.337, 
                    total_receivables = 1.337, 
                    total_stockholders_equity = 1.337, 
                    treasury_stock = 1.337, ),
                basic_information = openapi_client.models.fundamentals_i_reit_no_direct_basic_information.fundamentals_I_REIT_NO_DIRECT_basic_information(
                    company = '', 
                    company_id = '', 
                    exchange = '', 
                    stockid = '', 
                    symbol = '', ),
                cashflow_statement = openapi_client.models.fundamentals_i_reit_no_direct_cashflow_statement.fundamentals_I_REIT_NO_DIRECT_cashflow_statement(
                    asset_impairment_charge = 1.337, 
                    beginning_cash_position = 1.337, 
                    cash_flow_capital_expenditure = 1.337, 
                    cash_flow_deferred_tax = 1.337, 
                    cash_flow_depreciation_depletion_amortization = 1.337, 
                    cash_flow_for_lease_financing = 1.337, 
                    cash_flow_from_investing = 1.337, 
                    cash_flow_from_operations = 1.337, 
                    cash_flow_from_others = 1.337, 
                    cash_from_discontinued_investing_activities = 1.337, 
                    cash_from_discontinued_operating_activities = 1.337, 
                    cash_from_financing = 1.337, 
                    cash_from_other_investing_activities = 1.337, 
                    change_in_inventory = 1.337, 
                    change_in_other_working_capital = 1.337, 
                    change_in_payables_and_accrued_expense = 1.337, 
                    change_in_prepaid_assets = 1.337, 
                    change_in_receivables = 1.337, 
                    change_in_working_capital = 1.337, 
                    debt_issuance = 1.337, 
                    debt_payments = 1.337, 
                    dividends = 1.337, 
                    effect_of_exchange_rate_changes = 1.337, 
                    ending_cash_position = 1.337, 
                    ffo = 1.337, 
                    issuance_of_stock = 1.337, 
                    net_change_in_cash = 1.337, 
                    net_income_from_continuing_operations = 1.337, 
                    net_intangibles_purchase_and_sale = 1.337, 
                    net_issuance_of_debt = 1.337, 
                    net_issuance_of_preferred = 1.337, 
                    other_financing = 1.337, 
                    purchase_of_business = 1.337, 
                    purchase_of_investment = 1.337, 
                    purchase_of_ppe = 1.337, 
                    repurchase_of_stock = 1.337, 
                    sale_of_business = 1.337, 
                    sale_of_investment = 1.337, 
                    sale_of_ppe = 1.337, 
                    stock_based_compensation = 1.337, 
                    total_free_cash_flow = 1.337, ),
                income_statement = openapi_client.models.fundamentals_i_reit_no_direct_income_statement.fundamentals_I_REIT_NO_DIRECT_income_statement(
                    depreciation_depletion_amortization = 1.337, 
                    ebit = 1.337, 
                    ebitda = 1.337, 
                    ebitda_margin = 1.337, 
                    eps_basic = 1.337, 
                    eps_diluated = 1.337, 
                    interest_income = 1.337, 
                    is_fee_revenue_and_other_income = 1.337, 
                    is_interest_expense = 1.337, 
                    is_net_investment_income = 1.337, 
                    is_net_policyholder_benefits_and_claims = 1.337, 
                    is_other_expense_insurance = 1.337, 
                    is_policy_acquisition_expense = 1.337, 
                    is_preferred_dividends = 1.337, 
                    is_total_premiums_earned = 1.337, 
                    net_income = 1.337, 
                    net_income_continuing_operations = 1.337, 
                    net_income_discontinued_operations = 1.337, 
                    net_income_including_noncontrolling_interests = 1.337, 
                    net_margin = 1.337, 
                    other_income_minority_interest = 1.337, 
                    other_net_income_loss = 1.337, 
                    pretax_income = 1.337, 
                    revenue = 1.337, 
                    selling_general_admin_expense = 1.337, 
                    shares_outstanding = 1.337, 
                    tax_provision = 1.337, 
                    tax_rate = 1.337, 
                    total_expenses_insurance = 1.337, )
            )
        else:
            return FundamentalsIREITNODIRECT(
        )
        """

    def testFundamentalsIREITNODIRECT(self):
        """Test FundamentalsIREITNODIRECT"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
