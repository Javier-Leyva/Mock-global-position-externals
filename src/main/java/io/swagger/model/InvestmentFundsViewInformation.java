package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InvestmentFundViewDetails;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing investment funds information
 */
@ApiModel(description = "Data structure containing investment funds information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class InvestmentFundsViewInformation   {
  @JsonProperty("presentationOrderPoducts")
  private Integer presentationOrderPoducts = null;

  @JsonProperty("investmentFunds")
  @Valid
  private List<InvestmentFundViewDetails> investmentFunds = null;

  public InvestmentFundsViewInformation presentationOrderPoducts(Integer presentationOrderPoducts) {
    this.presentationOrderPoducts = presentationOrderPoducts;
    return this;
  }

  /**
   * Get presentationOrderPoducts
   * @return presentationOrderPoducts
  **/
  @ApiModelProperty(value = "")


  public Integer getPresentationOrderPoducts() {
    return presentationOrderPoducts;
  }

  public void setPresentationOrderPoducts(Integer presentationOrderPoducts) {
    this.presentationOrderPoducts = presentationOrderPoducts;
  }

  public InvestmentFundsViewInformation investmentFunds(List<InvestmentFundViewDetails> investmentFunds) {
    this.investmentFunds = investmentFunds;
    return this;
  }

  public InvestmentFundsViewInformation addInvestmentFundsItem(InvestmentFundViewDetails investmentFundsItem) {
    if (this.investmentFunds == null) {
      this.investmentFunds = new ArrayList<InvestmentFundViewDetails>();
    }
    this.investmentFunds.add(investmentFundsItem);
    return this;
  }

  /**
   * Array of loans
   * @return investmentFunds
  **/
  @ApiModelProperty(value = "Array of loans")

  @Valid

  public List<InvestmentFundViewDetails> getInvestmentFunds() {
    return investmentFunds;
  }

  public void setInvestmentFunds(List<InvestmentFundViewDetails> investmentFunds) {
    this.investmentFunds = investmentFunds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentFundsViewInformation investmentFundsViewInformation = (InvestmentFundsViewInformation) o;
    return Objects.equals(this.presentationOrderPoducts, investmentFundsViewInformation.presentationOrderPoducts) &&
        Objects.equals(this.investmentFunds, investmentFundsViewInformation.investmentFunds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presentationOrderPoducts, investmentFunds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentFundsViewInformation {\n");
    
    sb.append("    presentationOrderPoducts: ").append(toIndentedString(presentationOrderPoducts)).append("\n");
    sb.append("    investmentFunds: ").append(toIndentedString(investmentFunds)).append("\n");
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

