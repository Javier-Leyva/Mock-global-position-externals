package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccountMonthlyBalance;
import io.swagger.model.MonthlyBalanceItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing all the information related to the customer position view.
 */
@ApiModel(description = "Data structure containing all the information related to the customer position view.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class AccountMonthlyBalanceItem   {
  @JsonProperty("account")
  private AccountMonthlyBalance account = null;

  @JsonProperty("monthlyBalance")
  @Valid
  private List<MonthlyBalanceItem> monthlyBalance = null;

  public AccountMonthlyBalanceItem account(AccountMonthlyBalance account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountMonthlyBalance getAccount() {
    return account;
  }

  public void setAccount(AccountMonthlyBalance account) {
    this.account = account;
  }

  public AccountMonthlyBalanceItem monthlyBalance(List<MonthlyBalanceItem> monthlyBalance) {
    this.monthlyBalance = monthlyBalance;
    return this;
  }

  public AccountMonthlyBalanceItem addMonthlyBalanceItem(MonthlyBalanceItem monthlyBalanceItem) {
    if (this.monthlyBalance == null) {
      this.monthlyBalance = new ArrayList<MonthlyBalanceItem>();
    }
    this.monthlyBalance.add(monthlyBalanceItem);
    return this;
  }

  /**
   * monthly balance for the account specified in the 'accout' parameter
   * @return monthlyBalance
  **/
  @ApiModelProperty(value = "monthly balance for the account specified in the 'accout' parameter")

  @Valid

  public List<MonthlyBalanceItem> getMonthlyBalance() {
    return monthlyBalance;
  }

  public void setMonthlyBalance(List<MonthlyBalanceItem> monthlyBalance) {
    this.monthlyBalance = monthlyBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountMonthlyBalanceItem accountMonthlyBalanceItem = (AccountMonthlyBalanceItem) o;
    return Objects.equals(this.account, accountMonthlyBalanceItem.account) &&
        Objects.equals(this.monthlyBalance, accountMonthlyBalanceItem.monthlyBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, monthlyBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountMonthlyBalanceItem {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    monthlyBalance: ").append(toIndentedString(monthlyBalance)).append("\n");
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

