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
 * Data structure containing information about different deposit balances
 */
@ApiModel(description = "Data structure containing information about different deposit balances")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class DepositBalances   {
  @JsonProperty("current")
  private Balance current = null;

  @JsonProperty("profit")
  private Balance profit = null;

  public DepositBalances current(Balance current) {
    this.current = current;
    return this;
  }

  /**
   * Get current
   * @return current
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Balance getCurrent() {
    return current;
  }

  public void setCurrent(Balance current) {
    this.current = current;
  }

  public DepositBalances profit(Balance profit) {
    this.profit = profit;
    return this;
  }

  /**
   * Get profit
   * @return profit
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Balance getProfit() {
    return profit;
  }

  public void setProfit(Balance profit) {
    this.profit = profit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositBalances depositBalances = (DepositBalances) o;
    return Objects.equals(this.current, depositBalances.current) &&
        Objects.equals(this.profit, depositBalances.profit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, profit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositBalances {\n");
    
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    profit: ").append(toIndentedString(profit)).append("\n");
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

