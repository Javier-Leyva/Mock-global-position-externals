package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InvestmentFund;
import io.swagger.model.InvestmentFundDetailsLink;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing investment information and interest links.
 */
@ApiModel(description = "Data structure containing investment information and interest links.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class InvestmentFundWithLinks   {
  @JsonProperty("investmentFund")
  private InvestmentFund investmentFund = null;

  @JsonProperty("investmentFundDetailsLink")
  private InvestmentFundDetailsLink investmentFundDetailsLink = null;

  public InvestmentFundWithLinks investmentFund(InvestmentFund investmentFund) {
    this.investmentFund = investmentFund;
    return this;
  }

  /**
   * Get investmentFund
   * @return investmentFund
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InvestmentFund getInvestmentFund() {
    return investmentFund;
  }

  public void setInvestmentFund(InvestmentFund investmentFund) {
    this.investmentFund = investmentFund;
  }

  public InvestmentFundWithLinks investmentFundDetailsLink(InvestmentFundDetailsLink investmentFundDetailsLink) {
    this.investmentFundDetailsLink = investmentFundDetailsLink;
    return this;
  }

  /**
   * Get investmentFundDetailsLink
   * @return investmentFundDetailsLink
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InvestmentFundDetailsLink getInvestmentFundDetailsLink() {
    return investmentFundDetailsLink;
  }

  public void setInvestmentFundDetailsLink(InvestmentFundDetailsLink investmentFundDetailsLink) {
    this.investmentFundDetailsLink = investmentFundDetailsLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentFundWithLinks investmentFundWithLinks = (InvestmentFundWithLinks) o;
    return Objects.equals(this.investmentFund, investmentFundWithLinks.investmentFund) &&
        Objects.equals(this.investmentFundDetailsLink, investmentFundWithLinks.investmentFundDetailsLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investmentFund, investmentFundDetailsLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentFundWithLinks {\n");
    
    sb.append("    investmentFund: ").append(toIndentedString(investmentFund)).append("\n");
    sb.append("    investmentFundDetailsLink: ").append(toIndentedString(investmentFundDetailsLink)).append("\n");
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

