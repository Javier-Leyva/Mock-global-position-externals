package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccountsViewInformation;
import io.swagger.model.CardsViewInformation;
import io.swagger.model.DepositsViewInformation;
import io.swagger.model.InvestmentFundsViewInformation;
import io.swagger.model.LoansViewInformation;
import io.swagger.model.PensionsViewInformation;
import io.swagger.model.SecuritiesViewInformation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing all the information related to the customer position view.
 */
@ApiModel(description = "Data structure containing all the information related to the customer position view.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class GlobalPositionView   {
  @JsonProperty("accountsView")
  private AccountsViewInformation accountsView = null;

  @JsonProperty("cardsView")
  private CardsViewInformation cardsView = null;

  @JsonProperty("loansView")
  private LoansViewInformation loansView = null;

  @JsonProperty("depositsView")
  private DepositsViewInformation depositsView = null;

  @JsonProperty("pensionsView")
  private PensionsViewInformation pensionsView = null;

  @JsonProperty("securitiesView")
  private SecuritiesViewInformation securitiesView = null;

  @JsonProperty("investmentFundsView")
  private InvestmentFundsViewInformation investmentFundsView = null;

  public GlobalPositionView accountsView(AccountsViewInformation accountsView) {
    this.accountsView = accountsView;
    return this;
  }

  /**
   * Get accountsView
   * @return accountsView
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountsViewInformation getAccountsView() {
    return accountsView;
  }

  public void setAccountsView(AccountsViewInformation accountsView) {
    this.accountsView = accountsView;
  }

  public GlobalPositionView cardsView(CardsViewInformation cardsView) {
    this.cardsView = cardsView;
    return this;
  }

  /**
   * Get cardsView
   * @return cardsView
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CardsViewInformation getCardsView() {
    return cardsView;
  }

  public void setCardsView(CardsViewInformation cardsView) {
    this.cardsView = cardsView;
  }

  public GlobalPositionView loansView(LoansViewInformation loansView) {
    this.loansView = loansView;
    return this;
  }

  /**
   * Get loansView
   * @return loansView
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LoansViewInformation getLoansView() {
    return loansView;
  }

  public void setLoansView(LoansViewInformation loansView) {
    this.loansView = loansView;
  }

  public GlobalPositionView depositsView(DepositsViewInformation depositsView) {
    this.depositsView = depositsView;
    return this;
  }

  /**
   * Get depositsView
   * @return depositsView
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DepositsViewInformation getDepositsView() {
    return depositsView;
  }

  public void setDepositsView(DepositsViewInformation depositsView) {
    this.depositsView = depositsView;
  }

  public GlobalPositionView pensionsView(PensionsViewInformation pensionsView) {
    this.pensionsView = pensionsView;
    return this;
  }

  /**
   * Get pensionsView
   * @return pensionsView
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PensionsViewInformation getPensionsView() {
    return pensionsView;
  }

  public void setPensionsView(PensionsViewInformation pensionsView) {
    this.pensionsView = pensionsView;
  }

  public GlobalPositionView securitiesView(SecuritiesViewInformation securitiesView) {
    this.securitiesView = securitiesView;
    return this;
  }

  /**
   * Get securitiesView
   * @return securitiesView
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SecuritiesViewInformation getSecuritiesView() {
    return securitiesView;
  }

  public void setSecuritiesView(SecuritiesViewInformation securitiesView) {
    this.securitiesView = securitiesView;
  }

  public GlobalPositionView investmentFundsView(InvestmentFundsViewInformation investmentFundsView) {
    this.investmentFundsView = investmentFundsView;
    return this;
  }

  /**
   * Get investmentFundsView
   * @return investmentFundsView
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InvestmentFundsViewInformation getInvestmentFundsView() {
    return investmentFundsView;
  }

  public void setInvestmentFundsView(InvestmentFundsViewInformation investmentFundsView) {
    this.investmentFundsView = investmentFundsView;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalPositionView globalPositionView = (GlobalPositionView) o;
    return Objects.equals(this.accountsView, globalPositionView.accountsView) &&
        Objects.equals(this.cardsView, globalPositionView.cardsView) &&
        Objects.equals(this.loansView, globalPositionView.loansView) &&
        Objects.equals(this.depositsView, globalPositionView.depositsView) &&
        Objects.equals(this.pensionsView, globalPositionView.pensionsView) &&
        Objects.equals(this.securitiesView, globalPositionView.securitiesView) &&
        Objects.equals(this.investmentFundsView, globalPositionView.investmentFundsView);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountsView, cardsView, loansView, depositsView, pensionsView, securitiesView, investmentFundsView);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalPositionView {\n");
    
    sb.append("    accountsView: ").append(toIndentedString(accountsView)).append("\n");
    sb.append("    cardsView: ").append(toIndentedString(cardsView)).append("\n");
    sb.append("    loansView: ").append(toIndentedString(loansView)).append("\n");
    sb.append("    depositsView: ").append(toIndentedString(depositsView)).append("\n");
    sb.append("    pensionsView: ").append(toIndentedString(pensionsView)).append("\n");
    sb.append("    securitiesView: ").append(toIndentedString(securitiesView)).append("\n");
    sb.append("    investmentFundsView: ").append(toIndentedString(investmentFundsView)).append("\n");
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

