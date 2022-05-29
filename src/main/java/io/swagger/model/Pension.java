package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PensionBalances;
import io.swagger.model.StatusInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing information about a pension plan
 */
@ApiModel(description = "Data structure containing information about a pension plan")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class Pension   {
  @JsonProperty("pensionId")
  private String pensionId = null;

  @JsonProperty("pensionIdentification")
  private Object pensionIdentification = null;

  @JsonProperty("contract")
  private Object contract = null;

  @JsonProperty("channelAccessAgreementInformation")
  private Object channelAccessAgreementInformation = null;

  @JsonProperty("statusInfo")
  private StatusInfo statusInfo = null;

  @JsonProperty("balances")
  private PensionBalances balances = null;

  @JsonProperty("bankId")
  private String bankId = null;

  public Pension pensionId(String pensionId) {
    this.pensionId = pensionId;
    return this;
  }

  /**
   * Unique pension plan ID
   * @return pensionId
  **/
  @ApiModelProperty(example = "1578653139876456", value = "Unique pension plan ID")


  public String getPensionId() {
    return pensionId;
  }

  public void setPensionId(String pensionId) {
    this.pensionId = pensionId;
  }

  public Pension pensionIdentification(Object pensionIdentification) {
    this.pensionIdentification = pensionIdentification;
    return this;
  }

  /**
   * Data structure containing identification information for a pension plan
   * @return pensionIdentification
  **/
  @ApiModelProperty(value = "Data structure containing identification information for a pension plan")


  public Object getPensionIdentification() {
    return pensionIdentification;
  }

  public void setPensionIdentification(Object pensionIdentification) {
    this.pensionIdentification = pensionIdentification;
  }

  public Pension contract(Object contract) {
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

  public Pension channelAccessAgreementInformation(Object channelAccessAgreementInformation) {
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

  public Pension statusInfo(StatusInfo statusInfo) {
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

  public Pension balances(PensionBalances balances) {
    this.balances = balances;
    return this;
  }

  /**
   * Get balances
   * @return balances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PensionBalances getBalances() {
    return balances;
  }

  public void setBalances(PensionBalances balances) {
    this.balances = balances;
  }

  public Pension bankId(String bankId) {
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
    Pension pension = (Pension) o;
    return Objects.equals(this.pensionId, pension.pensionId) &&
        Objects.equals(this.pensionIdentification, pension.pensionIdentification) &&
        Objects.equals(this.contract, pension.contract) &&
        Objects.equals(this.channelAccessAgreementInformation, pension.channelAccessAgreementInformation) &&
        Objects.equals(this.statusInfo, pension.statusInfo) &&
        Objects.equals(this.balances, pension.balances) &&
        Objects.equals(this.bankId, pension.bankId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pensionId, pensionIdentification, contract, channelAccessAgreementInformation, statusInfo, balances, bankId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pension {\n");
    
    sb.append("    pensionId: ").append(toIndentedString(pensionId)).append("\n");
    sb.append("    pensionIdentification: ").append(toIndentedString(pensionIdentification)).append("\n");
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

