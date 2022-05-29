package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Loan;
import io.swagger.model.LoanDetailsLink;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing loan information and interest links.
 */
@ApiModel(description = "Data structure containing loan information and interest links.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class LoanWithLinks   {
  @JsonProperty("loan")
  private Loan loan = null;

  @JsonProperty("loanDetailsLink")
  private LoanDetailsLink loanDetailsLink = null;

  public LoanWithLinks loan(Loan loan) {
    this.loan = loan;
    return this;
  }

  /**
   * Get loan
   * @return loan
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Loan getLoan() {
    return loan;
  }

  public void setLoan(Loan loan) {
    this.loan = loan;
  }

  public LoanWithLinks loanDetailsLink(LoanDetailsLink loanDetailsLink) {
    this.loanDetailsLink = loanDetailsLink;
    return this;
  }

  /**
   * Get loanDetailsLink
   * @return loanDetailsLink
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LoanDetailsLink getLoanDetailsLink() {
    return loanDetailsLink;
  }

  public void setLoanDetailsLink(LoanDetailsLink loanDetailsLink) {
    this.loanDetailsLink = loanDetailsLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanWithLinks loanWithLinks = (LoanWithLinks) o;
    return Objects.equals(this.loan, loanWithLinks.loan) &&
        Objects.equals(this.loanDetailsLink, loanWithLinks.loanDetailsLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loan, loanDetailsLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanWithLinks {\n");
    
    sb.append("    loan: ").append(toIndentedString(loan)).append("\n");
    sb.append("    loanDetailsLink: ").append(toIndentedString(loanDetailsLink)).append("\n");
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

