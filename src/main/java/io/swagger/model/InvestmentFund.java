package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InvestmentFundBalances;
import io.swagger.model.StatusInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing information about an investment fund
 */
@ApiModel(description = "Data structure containing information about an investment fund")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class InvestmentFund   {
  @JsonProperty("investmentFundId")
  private String investmentFundId = null;

  @JsonProperty("investmentFundIdentification")
  private Object investmentFundIdentification = null;

  @JsonProperty("contract")
  private Object contract = null;

  @JsonProperty("channelAccessAgreementInformation")
  private Object channelAccessAgreementInformation = null;

  @JsonProperty("statusInfo")
  private StatusInfo statusInfo = null;

  @JsonProperty("balances")
  private InvestmentFundBalances balances = null;

  @JsonProperty("bankId")
  private String bankId = null;

  public InvestmentFund investmentFundId(String investmentFundId) {
    this.investmentFundId = investmentFundId;
    return this;
  }

  /**
   * Investment fund ID
   * @return investmentFundId
  **/
  @ApiModelProperty(example = "1578658029699345", value = "Investment fund ID")


  public String getInvestmentFundId() {
    return investmentFundId;
  }

  public void setInvestmentFundId(String investmentFundId) {
    this.investmentFundId = investmentFundId;
  }

  public InvestmentFund investmentFundIdentification(Object investmentFundIdentification) {
    this.investmentFundIdentification = investmentFundIdentification;
    return this;
  }

  /**
   * Data structure containing identification information for an investment fund
   * @return investmentFundIdentification
  **/
  @ApiModelProperty(value = "Data structure containing identification information for an investment fund")


  public Object getInvestmentFundIdentification() {
    return investmentFundIdentification;
  }

  public void setInvestmentFundIdentification(Object investmentFundIdentification) {
    this.investmentFundIdentification = investmentFundIdentification;
  }

  public InvestmentFund contract(Object contract) {
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

  public InvestmentFund channelAccessAgreementInformation(Object channelAccessAgreementInformation) {
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

  public InvestmentFund statusInfo(StatusInfo statusInfo) {
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

  public InvestmentFund balances(InvestmentFundBalances balances) {
    this.balances = balances;
    return this;
  }

  /**
   * Get balances
   * @return balances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InvestmentFundBalances getBalances() {
    return balances;
  }

  public void setBalances(InvestmentFundBalances balances) {
    this.balances = balances;
  }

  public InvestmentFund bankId(String bankId) {
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
    InvestmentFund investmentFund = (InvestmentFund) o;
    return Objects.equals(this.investmentFundId, investmentFund.investmentFundId) &&
        Objects.equals(this.investmentFundIdentification, investmentFund.investmentFundIdentification) &&
        Objects.equals(this.contract, investmentFund.contract) &&
        Objects.equals(this.channelAccessAgreementInformation, investmentFund.channelAccessAgreementInformation) &&
        Objects.equals(this.statusInfo, investmentFund.statusInfo) &&
        Objects.equals(this.balances, investmentFund.balances) &&
        Objects.equals(this.bankId, investmentFund.bankId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investmentFundId, investmentFundIdentification, contract, channelAccessAgreementInformation, statusInfo, balances, bankId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentFund {\n");
    
    sb.append("    investmentFundId: ").append(toIndentedString(investmentFundId)).append("\n");
    sb.append("    investmentFundIdentification: ").append(toIndentedString(investmentFundIdentification)).append("\n");
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

