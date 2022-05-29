package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccountMonthlyBalanceItem;
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


public class AccountsMonthlyBalanceResponseDTO   {
  @JsonProperty("accountsMonthlyBalance")
  @Valid
  private List<AccountMonthlyBalanceItem> accountsMonthlyBalance = null;

  public AccountsMonthlyBalanceResponseDTO accountsMonthlyBalance(List<AccountMonthlyBalanceItem> accountsMonthlyBalance) {
    this.accountsMonthlyBalance = accountsMonthlyBalance;
    return this;
  }

  public AccountsMonthlyBalanceResponseDTO addAccountsMonthlyBalanceItem(AccountMonthlyBalanceItem accountsMonthlyBalanceItem) {
    if (this.accountsMonthlyBalance == null) {
      this.accountsMonthlyBalance = new ArrayList<AccountMonthlyBalanceItem>();
    }
    this.accountsMonthlyBalance.add(accountsMonthlyBalanceItem);
    return this;
  }

  /**
   * list containing the monthly balances
   * @return accountsMonthlyBalance
  **/
  @ApiModelProperty(value = "list containing the monthly balances")

  @Valid

  public List<AccountMonthlyBalanceItem> getAccountsMonthlyBalance() {
    return accountsMonthlyBalance;
  }

  public void setAccountsMonthlyBalance(List<AccountMonthlyBalanceItem> accountsMonthlyBalance) {
    this.accountsMonthlyBalance = accountsMonthlyBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsMonthlyBalanceResponseDTO accountsMonthlyBalanceResponseDTO = (AccountsMonthlyBalanceResponseDTO) o;
    return Objects.equals(this.accountsMonthlyBalance, accountsMonthlyBalanceResponseDTO.accountsMonthlyBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountsMonthlyBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsMonthlyBalanceResponseDTO {\n");
    
    sb.append("    accountsMonthlyBalance: ").append(toIndentedString(accountsMonthlyBalance)).append("\n");
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

