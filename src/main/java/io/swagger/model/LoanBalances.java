package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Balance;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing information about different loan balances
 */
@ApiModel(description = "Data structure containing information about different loan balances")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class LoanBalances   {
  @JsonProperty("principal")
  private Balance principal = null;

  @JsonProperty("amortized")
  private Balance amortized = null;

  public LoanBalances principal(Balance principal) {
    this.principal = principal;
    return this;
  }

  /**
   * Get principal
   * @return principal
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Balance getPrincipal() {
    return principal;
  }

  public void setPrincipal(Balance principal) {
    this.principal = principal;
  }

  public LoanBalances amortized(Balance amortized) {
    this.amortized = amortized;
    return this;
  }

  /**
   * Get amortized
   * @return amortized
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Balance getAmortized() {
    return amortized;
  }

  public void setAmortized(Balance amortized) {
    this.amortized = amortized;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanBalances loanBalances = (LoanBalances) o;
    return Objects.equals(this.principal, loanBalances.principal) &&
        Objects.equals(this.amortized, loanBalances.amortized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principal, amortized);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanBalances {\n");
    
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    amortized: ").append(toIndentedString(amortized)).append("\n");
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

