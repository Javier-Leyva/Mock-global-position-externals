package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.LoanViewDetails;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing loan information
 */
@ApiModel(description = "Data structure containing loan information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class LoansViewInformation   {
  @JsonProperty("presentationOrderPoducts")
  private Integer presentationOrderPoducts = null;

  @JsonProperty("loans")
  @Valid
  private List<LoanViewDetails> loans = null;

  public LoansViewInformation presentationOrderPoducts(Integer presentationOrderPoducts) {
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

  public LoansViewInformation loans(List<LoanViewDetails> loans) {
    this.loans = loans;
    return this;
  }

  public LoansViewInformation addLoansItem(LoanViewDetails loansItem) {
    if (this.loans == null) {
      this.loans = new ArrayList<LoanViewDetails>();
    }
    this.loans.add(loansItem);
    return this;
  }

  /**
   * Array of loans
   * @return loans
  **/
  @ApiModelProperty(value = "Array of loans")

  @Valid

  public List<LoanViewDetails> getLoans() {
    return loans;
  }

  public void setLoans(List<LoanViewDetails> loans) {
    this.loans = loans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoansViewInformation loansViewInformation = (LoansViewInformation) o;
    return Objects.equals(this.presentationOrderPoducts, loansViewInformation.presentationOrderPoducts) &&
        Objects.equals(this.loans, loansViewInformation.loans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presentationOrderPoducts, loans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoansViewInformation {\n");
    
    sb.append("    presentationOrderPoducts: ").append(toIndentedString(presentationOrderPoducts)).append("\n");
    sb.append("    loans: ").append(toIndentedString(loans)).append("\n");
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

