package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Amount;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing aggregated information from the loan balances.
 */
@ApiModel(description = "Data structure containing aggregated information from the loan balances.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class LoanTotalBalances   {
  @JsonProperty("totalPrincipal")
  private Amount totalPrincipal = null;

  @JsonProperty("totalAmortization")
  private Amount totalAmortization = null;

  public LoanTotalBalances totalPrincipal(Amount totalPrincipal) {
    this.totalPrincipal = totalPrincipal;
    return this;
  }

  /**
   * Get totalPrincipal
   * @return totalPrincipal
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getTotalPrincipal() {
    return totalPrincipal;
  }

  public void setTotalPrincipal(Amount totalPrincipal) {
    this.totalPrincipal = totalPrincipal;
  }

  public LoanTotalBalances totalAmortization(Amount totalAmortization) {
    this.totalAmortization = totalAmortization;
    return this;
  }

  /**
   * Get totalAmortization
   * @return totalAmortization
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getTotalAmortization() {
    return totalAmortization;
  }

  public void setTotalAmortization(Amount totalAmortization) {
    this.totalAmortization = totalAmortization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanTotalBalances loanTotalBalances = (LoanTotalBalances) o;
    return Objects.equals(this.totalPrincipal, loanTotalBalances.totalPrincipal) &&
        Objects.equals(this.totalAmortization, loanTotalBalances.totalAmortization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPrincipal, totalAmortization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanTotalBalances {\n");
    
    sb.append("    totalPrincipal: ").append(toIndentedString(totalPrincipal)).append("\n");
    sb.append("    totalAmortization: ").append(toIndentedString(totalAmortization)).append("\n");
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

