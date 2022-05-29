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
 * Monthly balance
 */
@ApiModel(description = "Monthly balance")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class MonthlyBalanceItem   {
  @JsonProperty("month")
  private Integer month = null;

  @JsonProperty("balance")
  private Amount balance = null;

  @JsonProperty("expense")
  private Amount expense = null;

  @JsonProperty("income")
  private Amount income = null;

  public MonthlyBalanceItem month(Integer month) {
    this.month = month;
    return this;
  }

  /**
   * Get month
   * @return month
  **/
  @ApiModelProperty(value = "")


  public Integer getMonth() {
    return month;
  }

  public void setMonth(Integer month) {
    this.month = month;
  }

  public MonthlyBalanceItem balance(Amount balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getBalance() {
    return balance;
  }

  public void setBalance(Amount balance) {
    this.balance = balance;
  }

  public MonthlyBalanceItem expense(Amount expense) {
    this.expense = expense;
    return this;
  }

  /**
   * Get expense
   * @return expense
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getExpense() {
    return expense;
  }

  public void setExpense(Amount expense) {
    this.expense = expense;
  }

  public MonthlyBalanceItem income(Amount income) {
    this.income = income;
    return this;
  }

  /**
   * Get income
   * @return income
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getIncome() {
    return income;
  }

  public void setIncome(Amount income) {
    this.income = income;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonthlyBalanceItem monthlyBalanceItem = (MonthlyBalanceItem) o;
    return Objects.equals(this.month, monthlyBalanceItem.month) &&
        Objects.equals(this.balance, monthlyBalanceItem.balance) &&
        Objects.equals(this.expense, monthlyBalanceItem.expense) &&
        Objects.equals(this.income, monthlyBalanceItem.income);
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, balance, expense, income);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonthlyBalanceItem {\n");
    
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    expense: ").append(toIndentedString(expense)).append("\n");
    sb.append("    income: ").append(toIndentedString(income)).append("\n");
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

