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
 * Data structure containing aggregated information from the deposit balances.
 */
@ApiModel(description = "Data structure containing aggregated information from the deposit balances.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class DepositTotalBalances   {
  @JsonProperty("totalCurrent")
  private Amount totalCurrent = null;

  @JsonProperty("totalProfit")
  private Amount totalProfit = null;

  public DepositTotalBalances totalCurrent(Amount totalCurrent) {
    this.totalCurrent = totalCurrent;
    return this;
  }

  /**
   * Get totalCurrent
   * @return totalCurrent
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getTotalCurrent() {
    return totalCurrent;
  }

  public void setTotalCurrent(Amount totalCurrent) {
    this.totalCurrent = totalCurrent;
  }

  public DepositTotalBalances totalProfit(Amount totalProfit) {
    this.totalProfit = totalProfit;
    return this;
  }

  /**
   * Get totalProfit
   * @return totalProfit
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getTotalProfit() {
    return totalProfit;
  }

  public void setTotalProfit(Amount totalProfit) {
    this.totalProfit = totalProfit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositTotalBalances depositTotalBalances = (DepositTotalBalances) o;
    return Objects.equals(this.totalCurrent, depositTotalBalances.totalCurrent) &&
        Objects.equals(this.totalProfit, depositTotalBalances.totalProfit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCurrent, totalProfit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositTotalBalances {\n");
    
    sb.append("    totalCurrent: ").append(toIndentedString(totalCurrent)).append("\n");
    sb.append("    totalProfit: ").append(toIndentedString(totalProfit)).append("\n");
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

