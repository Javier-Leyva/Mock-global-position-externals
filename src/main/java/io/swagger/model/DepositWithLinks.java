package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Deposit;
import io.swagger.model.DepositDetailsLink;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing deposit information and interest links.
 */
@ApiModel(description = "Data structure containing deposit information and interest links.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class DepositWithLinks   {
  @JsonProperty("deposit")
  private Deposit deposit = null;

  @JsonProperty("depositDetailsLink")
  private DepositDetailsLink depositDetailsLink = null;

  public DepositWithLinks deposit(Deposit deposit) {
    this.deposit = deposit;
    return this;
  }

  /**
   * Get deposit
   * @return deposit
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Deposit getDeposit() {
    return deposit;
  }

  public void setDeposit(Deposit deposit) {
    this.deposit = deposit;
  }

  public DepositWithLinks depositDetailsLink(DepositDetailsLink depositDetailsLink) {
    this.depositDetailsLink = depositDetailsLink;
    return this;
  }

  /**
   * Get depositDetailsLink
   * @return depositDetailsLink
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DepositDetailsLink getDepositDetailsLink() {
    return depositDetailsLink;
  }

  public void setDepositDetailsLink(DepositDetailsLink depositDetailsLink) {
    this.depositDetailsLink = depositDetailsLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositWithLinks depositWithLinks = (DepositWithLinks) o;
    return Objects.equals(this.deposit, depositWithLinks.deposit) &&
        Objects.equals(this.depositDetailsLink, depositWithLinks.depositDetailsLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deposit, depositDetailsLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositWithLinks {\n");
    
    sb.append("    deposit: ").append(toIndentedString(deposit)).append("\n");
    sb.append("    depositDetailsLink: ").append(toIndentedString(depositDetailsLink)).append("\n");
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

