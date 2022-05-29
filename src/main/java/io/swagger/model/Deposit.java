package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DepositBalances;
import io.swagger.model.StatusInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing information about a deposit
 */
@ApiModel(description = "Data structure containing information about a deposit")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class Deposit   {
  @JsonProperty("depositId")
  private String depositId = null;

  @JsonProperty("depositIdentification")
  private Object depositIdentification = null;

  @JsonProperty("contract")
  private Object contract = null;

  @JsonProperty("channelAccessAgreementInformation")
  private Object channelAccessAgreementInformation = null;

  @JsonProperty("statusInfo")
  private StatusInfo statusInfo = null;

  @JsonProperty("balances")
  private DepositBalances balances = null;

  @JsonProperty("bankId")
  private String bankId = null;

  public Deposit depositId(String depositId) {
    this.depositId = depositId;
    return this;
  }

  /**
   * Unique deposit ID
   * @return depositId
  **/
  @ApiModelProperty(example = "1520893020013689", value = "Unique deposit ID")


  public String getDepositId() {
    return depositId;
  }

  public void setDepositId(String depositId) {
    this.depositId = depositId;
  }

  public Deposit depositIdentification(Object depositIdentification) {
    this.depositIdentification = depositIdentification;
    return this;
  }

  /**
   * Data structure containing identification information for a deposit
   * @return depositIdentification
  **/
  @ApiModelProperty(value = "Data structure containing identification information for a deposit")


  public Object getDepositIdentification() {
    return depositIdentification;
  }

  public void setDepositIdentification(Object depositIdentification) {
    this.depositIdentification = depositIdentification;
  }

  public Deposit contract(Object contract) {
    this.contract = contract;
    return this;
  }

  /**
   * Data structure containing contract information
   * @return contract
  **/
  @ApiModelProperty(value = "Data structure containing contract information")


  public Object getContract() {
    return contract;
  }

  public void setContract(Object contract) {
    this.contract = contract;
  }

  public Deposit channelAccessAgreementInformation(Object channelAccessAgreementInformation) {
    this.channelAccessAgreementInformation = channelAccessAgreementInformation;
    return this;
  }

  /**
   * Data structure containing information for a global position.
   * @return channelAccessAgreementInformation
  **/
  @ApiModelProperty(value = "Data structure containing information for a global position.")


  public Object getChannelAccessAgreementInformation() {
    return channelAccessAgreementInformation;
  }

  public void setChannelAccessAgreementInformation(Object channelAccessAgreementInformation) {
    this.channelAccessAgreementInformation = channelAccessAgreementInformation;
  }

  public Deposit statusInfo(StatusInfo statusInfo) {
    this.statusInfo = statusInfo;
    return this;
  }

  /**
   * Get statusInfo
   * @return statusInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StatusInfo getStatusInfo() {
    return statusInfo;
  }

  public void setStatusInfo(StatusInfo statusInfo) {
    this.statusInfo = statusInfo;
  }

  public Deposit balances(DepositBalances balances) {
    this.balances = balances;
    return this;
  }

  /**
   * Get balances
   * @return balances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DepositBalances getBalances() {
    return balances;
  }

  public void setBalances(DepositBalances balances) {
    this.balances = balances;
  }

  public Deposit bankId(String bankId) {
    this.bankId = bankId;
    return this;
  }

  /**
   * Unique bank ID
   * @return bankId
  **/
  @ApiModelProperty(value = "Unique bank ID")


  public String getBankId() {
    return bankId;
  }

  public void setBankId(String bankId) {
    this.bankId = bankId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deposit deposit = (Deposit) o;
    return Objects.equals(this.depositId, deposit.depositId) &&
        Objects.equals(this.depositIdentification, deposit.depositIdentification) &&
        Objects.equals(this.contract, deposit.contract) &&
        Objects.equals(this.channelAccessAgreementInformation, deposit.channelAccessAgreementInformation) &&
        Objects.equals(this.statusInfo, deposit.statusInfo) &&
        Objects.equals(this.balances, deposit.balances) &&
        Objects.equals(this.bankId, deposit.bankId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositId, depositIdentification, contract, channelAccessAgreementInformation, statusInfo, balances, bankId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deposit {\n");
    
    sb.append("    depositId: ").append(toIndentedString(depositId)).append("\n");
    sb.append("    depositIdentification: ").append(toIndentedString(depositIdentification)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    channelAccessAgreementInformation: ").append(toIndentedString(channelAccessAgreementInformation)).append("\n");
    sb.append("    statusInfo: ").append(toIndentedString(statusInfo)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
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

