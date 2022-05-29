package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Amount;
import io.swagger.model.LoanBalances;
import io.swagger.model.StatusInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing information about a loan
 */
@ApiModel(description = "Data structure containing information about a loan")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class Loan   {
  @JsonProperty("loanId")
  private String loanId = null;

  @JsonProperty("loanIdentification")
  private Object loanIdentification = null;

  @JsonProperty("channelAccessAgreementInformation")
  private Object channelAccessAgreementInformation = null;

  @JsonProperty("contract")
  private Object contract = null;

  @JsonProperty("statusInfo")
  private StatusInfo statusInfo = null;

  @JsonProperty("balances")
  private LoanBalances balances = null;

  @JsonProperty("nextPaymentAmount")
  private Amount nextPaymentAmount = null;

  @JsonProperty("bankId")
  private String bankId = null;

  public Loan loanId(String loanId) {
    this.loanId = loanId;
    return this;
  }

  /**
   * Unique loan ID
   * @return loanId
  **/
  @ApiModelProperty(example = "1520891037864384", value = "Unique loan ID")


  public String getLoanId() {
    return loanId;
  }

  public void setLoanId(String loanId) {
    this.loanId = loanId;
  }

  public Loan loanIdentification(Object loanIdentification) {
    this.loanIdentification = loanIdentification;
    return this;
  }

  /**
   * Data structure containing identification information for a loan
   * @return loanIdentification
  **/
  @ApiModelProperty(value = "Data structure containing identification information for a loan")


  public Object getLoanIdentification() {
    return loanIdentification;
  }

  public void setLoanIdentification(Object loanIdentification) {
    this.loanIdentification = loanIdentification;
  }

  public Loan channelAccessAgreementInformation(Object channelAccessAgreementInformation) {
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

  public Loan contract(Object contract) {
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

  public Loan statusInfo(StatusInfo statusInfo) {
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

  public Loan balances(LoanBalances balances) {
    this.balances = balances;
    return this;
  }

  /**
   * Get balances
   * @return balances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LoanBalances getBalances() {
    return balances;
  }

  public void setBalances(LoanBalances balances) {
    this.balances = balances;
  }

  public Loan nextPaymentAmount(Amount nextPaymentAmount) {
    this.nextPaymentAmount = nextPaymentAmount;
    return this;
  }

  /**
   * Get nextPaymentAmount
   * @return nextPaymentAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getNextPaymentAmount() {
    return nextPaymentAmount;
  }

  public void setNextPaymentAmount(Amount nextPaymentAmount) {
    this.nextPaymentAmount = nextPaymentAmount;
  }

  public Loan bankId(String bankId) {
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
    Loan loan = (Loan) o;
    return Objects.equals(this.loanId, loan.loanId) &&
        Objects.equals(this.loanIdentification, loan.loanIdentification) &&
        Objects.equals(this.channelAccessAgreementInformation, loan.channelAccessAgreementInformation) &&
        Objects.equals(this.contract, loan.contract) &&
        Objects.equals(this.statusInfo, loan.statusInfo) &&
        Objects.equals(this.balances, loan.balances) &&
        Objects.equals(this.nextPaymentAmount, loan.nextPaymentAmount) &&
        Objects.equals(this.bankId, loan.bankId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanId, loanIdentification, channelAccessAgreementInformation, contract, statusInfo, balances, nextPaymentAmount, bankId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Loan {\n");
    
    sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
    sb.append("    loanIdentification: ").append(toIndentedString(loanIdentification)).append("\n");
    sb.append("    channelAccessAgreementInformation: ").append(toIndentedString(channelAccessAgreementInformation)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    statusInfo: ").append(toIndentedString(statusInfo)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    nextPaymentAmount: ").append(toIndentedString(nextPaymentAmount)).append("\n");
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

