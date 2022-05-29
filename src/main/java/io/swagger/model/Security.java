package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SecurityBalances;
import io.swagger.model.StatusInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing information about a security
 */
@ApiModel(description = "Data structure containing information about a security")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class Security   {
  @JsonProperty("securityId")
  private String securityId = null;

  @JsonProperty("securityIdentification")
  private Object securityIdentification = null;

  @JsonProperty("contract")
  private Object contract = null;

  @JsonProperty("channelAccessAgreementInformation")
  private Object channelAccessAgreementInformation = null;

  @JsonProperty("statusInfo")
  private StatusInfo statusInfo = null;

  @JsonProperty("balances")
  private SecurityBalances balances = null;

  @JsonProperty("bankId")
  private String bankId = null;

  public Security securityId(String securityId) {
    this.securityId = securityId;
    return this;
  }

  /**
   * Security ID
   * @return securityId
  **/
  @ApiModelProperty(example = "1532924007658821", value = "Security ID")


  public String getSecurityId() {
    return securityId;
  }

  public void setSecurityId(String securityId) {
    this.securityId = securityId;
  }

  public Security securityIdentification(Object securityIdentification) {
    this.securityIdentification = securityIdentification;
    return this;
  }

  /**
   * Data structure containing identification information for a security
   * @return securityIdentification
  **/
  @ApiModelProperty(value = "Data structure containing identification information for a security")


  public Object getSecurityIdentification() {
    return securityIdentification;
  }

  public void setSecurityIdentification(Object securityIdentification) {
    this.securityIdentification = securityIdentification;
  }

  public Security contract(Object contract) {
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

  public Security channelAccessAgreementInformation(Object channelAccessAgreementInformation) {
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

  public Security statusInfo(StatusInfo statusInfo) {
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

  public Security balances(SecurityBalances balances) {
    this.balances = balances;
    return this;
  }

  /**
   * Get balances
   * @return balances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SecurityBalances getBalances() {
    return balances;
  }

  public void setBalances(SecurityBalances balances) {
    this.balances = balances;
  }

  public Security bankId(String bankId) {
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
    Security security = (Security) o;
    return Objects.equals(this.securityId, security.securityId) &&
        Objects.equals(this.securityIdentification, security.securityIdentification) &&
        Objects.equals(this.contract, security.contract) &&
        Objects.equals(this.channelAccessAgreementInformation, security.channelAccessAgreementInformation) &&
        Objects.equals(this.statusInfo, security.statusInfo) &&
        Objects.equals(this.balances, security.balances) &&
        Objects.equals(this.bankId, security.bankId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityId, securityIdentification, contract, channelAccessAgreementInformation, statusInfo, balances, bankId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Security {\n");
    
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    securityIdentification: ").append(toIndentedString(securityIdentification)).append("\n");
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

