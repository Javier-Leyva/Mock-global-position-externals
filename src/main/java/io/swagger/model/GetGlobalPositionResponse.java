package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccountsInformation;
import io.swagger.model.CardsInformation;
import io.swagger.model.DepositsInformation;
import io.swagger.model.InsuranceInformation;
import io.swagger.model.InvestmentFundsInformation;
import io.swagger.model.LoansInformation;
import io.swagger.model.PensionsInformation;
import io.swagger.model.SecuritiesInformation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing all the information related to the customer position.
 */
@ApiModel(description = "Data structure containing all the information related to the customer position.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class GetGlobalPositionResponse   {
  @JsonProperty("accounts")
  private AccountsInformation accounts = null;

  @JsonProperty("cards")
  private CardsInformation cards = null;

  @JsonProperty("loans")
  private LoansInformation loans = null;

  @JsonProperty("deposits")
  private DepositsInformation deposits = null;

  @JsonProperty("pensions")
  private PensionsInformation pensions = null;

  @JsonProperty("securities")
  private SecuritiesInformation securities = null;

  @JsonProperty("investmentFunds")
  private InvestmentFundsInformation investmentFunds = null;

  @JsonProperty("insurances")
  private InsuranceInformation insurances = null;

  public GetGlobalPositionResponse accounts(AccountsInformation accounts) {
    this.accounts = accounts;
    return this;
  }

  /**
   * Get accounts
   * @return accounts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountsInformation getAccounts() {
    return accounts;
  }

  public void setAccounts(AccountsInformation accounts) {
    this.accounts = accounts;
  }

  public GetGlobalPositionResponse cards(CardsInformation cards) {
    this.cards = cards;
    return this;
  }

  /**
   * Get cards
   * @return cards
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CardsInformation getCards() {
    return cards;
  }

  public void setCards(CardsInformation cards) {
    this.cards = cards;
  }

  public GetGlobalPositionResponse loans(LoansInformation loans) {
    this.loans = loans;
    return this;
  }

  /**
   * Get loans
   * @return loans
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LoansInformation getLoans() {
    return loans;
  }

  public void setLoans(LoansInformation loans) {
    this.loans = loans;
  }

  public GetGlobalPositionResponse deposits(DepositsInformation deposits) {
    this.deposits = deposits;
    return this;
  }

  /**
   * Get deposits
   * @return deposits
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DepositsInformation getDeposits() {
    return deposits;
  }

  public void setDeposits(DepositsInformation deposits) {
    this.deposits = deposits;
  }

  public GetGlobalPositionResponse pensions(PensionsInformation pensions) {
    this.pensions = pensions;
    return this;
  }

  /**
   * Get pensions
   * @return pensions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PensionsInformation getPensions() {
    return pensions;
  }

  public void setPensions(PensionsInformation pensions) {
    this.pensions = pensions;
  }

  public GetGlobalPositionResponse securities(SecuritiesInformation securities) {
    this.securities = securities;
    return this;
  }

  /**
   * Get securities
   * @return securities
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SecuritiesInformation getSecurities() {
    return securities;
  }

  public void setSecurities(SecuritiesInformation securities) {
    this.securities = securities;
  }

  public GetGlobalPositionResponse investmentFunds(InvestmentFundsInformation investmentFunds) {
    this.investmentFunds = investmentFunds;
    return this;
  }

  /**
   * Get investmentFunds
   * @return investmentFunds
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InvestmentFundsInformation getInvestmentFunds() {
    return investmentFunds;
  }

  public void setInvestmentFunds(InvestmentFundsInformation investmentFunds) {
    this.investmentFunds = investmentFunds;
  }

  public GetGlobalPositionResponse insurances(InsuranceInformation insurances) {
    this.insurances = insurances;
    return this;
  }

  /**
   * Get insurances
   * @return insurances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InsuranceInformation getInsurances() {
    return insurances;
  }

  public void setInsurances(InsuranceInformation insurances) {
    this.insurances = insurances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGlobalPositionResponse getGlobalPositionResponse = (GetGlobalPositionResponse) o;
    return Objects.equals(this.accounts, getGlobalPositionResponse.accounts) &&
        Objects.equals(this.cards, getGlobalPositionResponse.cards) &&
        Objects.equals(this.loans, getGlobalPositionResponse.loans) &&
        Objects.equals(this.deposits, getGlobalPositionResponse.deposits) &&
        Objects.equals(this.pensions, getGlobalPositionResponse.pensions) &&
        Objects.equals(this.securities, getGlobalPositionResponse.securities) &&
        Objects.equals(this.investmentFunds, getGlobalPositionResponse.investmentFunds) &&
        Objects.equals(this.insurances, getGlobalPositionResponse.insurances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, cards, loans, deposits, pensions, securities, investmentFunds, insurances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGlobalPositionResponse {\n");
    
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
    sb.append("    loans: ").append(toIndentedString(loans)).append("\n");
    sb.append("    deposits: ").append(toIndentedString(deposits)).append("\n");
    sb.append("    pensions: ").append(toIndentedString(pensions)).append("\n");
    sb.append("    securities: ").append(toIndentedString(securities)).append("\n");
    sb.append("    investmentFunds: ").append(toIndentedString(investmentFunds)).append("\n");
    sb.append("    insurances: ").append(toIndentedString(insurances)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

