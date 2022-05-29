package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing information about an insurance
 */
@ApiModel(description = "Data structure containing information about an insurance")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class Insurance   {
  @JsonProperty("insuranceId")
  private String insuranceId = null;

  @JsonProperty("channelAccessAgreementInformation")
  private Object channelAccessAgreementInformation = null;

  @JsonProperty("insuranceIdentification")
  private Object insuranceIdentification = null;

  @JsonProperty("typeCode")
  private String typeCode = null;

  @JsonProperty("typeDescription")
  private String typeDescription = null;

  @JsonProperty("currentAnnualPremium")
  private Object currentAnnualPremium = null;

  @JsonProperty("link")
  private Object link = null;

  @JsonProperty("bankId")
  private String bankId = null;

  public Insurance insuranceId(String insuranceId) {
    this.insuranceId = insuranceId;
    return this;
  }

  /**
   * Unique insurance ID
   * @return insuranceId
  **/
  @ApiModelProperty(example = "001520893020013689", value = "Unique insurance ID")


  public String getInsuranceId() {
    return insuranceId;
  }

  public void setInsuranceId(String insuranceId) {
    this.insuranceId = insuranceId;
  }

  public Insurance channelAccessAgreementInformation(Object channelAccessAgreementInformation) {
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

  public Insurance insuranceIdentification(Object insuranceIdentification) {
    this.insuranceIdentification = insuranceIdentification;
    return this;
  }

  /**
   * Data structure containing identification information for an insurance policy
   * @return insuranceIdentification
  **/
  @ApiModelProperty(value = "Data structure containing identification information for an insurance policy")


  public Object getInsuranceIdentification() {
    return insuranceIdentification;
  }

  public void setInsuranceIdentification(Object insuranceIdentification) {
    this.insuranceIdentification = insuranceIdentification;
  }

  public Insurance typeCode(String typeCode) {
    this.typeCode = typeCode;
    return this;
  }

  /**
   * Insurance type code
   * @return typeCode
  **/
  @ApiModelProperty(example = "A300", value = "Insurance type code")


  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }

  public Insurance typeDescription(String typeDescription) {
    this.typeDescription = typeDescription;
    return this;
  }

  /**
   * Insurance type description
   * @return typeDescription
  **/
  @ApiModelProperty(example = "Family Insurance 123", value = "Insurance type description")


  public String getTypeDescription() {
    return typeDescription;
  }

  public void setTypeDescription(String typeDescription) {
    this.typeDescription = typeDescription;
  }

  public Insurance currentAnnualPremium(Object currentAnnualPremium) {
    this.currentAnnualPremium = currentAnnualPremium;
    return this;
  }

  /**
   * Data structure containing amount details
   * @return currentAnnualPremium
  **/
  @ApiModelProperty(value = "Data structure containing amount details")


  public Object getCurrentAnnualPremium() {
    return currentAnnualPremium;
  }

  public void setCurrentAnnualPremium(Object currentAnnualPremium) {
    this.currentAnnualPremium = currentAnnualPremium;
  }

  public Insurance link(Object link) {
    this.link = link;
    return this;
  }

  /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(value = "")


  public Object getLink() {
    return link;
  }

  public void setLink(Object link) {
    this.link = link;
  }

  public Insurance bankId(String bankId) {
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
    Insurance insurance = (Insurance) o;
    return Objects.equals(this.insuranceId, insurance.insuranceId) &&
        Objects.equals(this.channelAccessAgreementInformation, insurance.channelAccessAgreementInformation) &&
        Objects.equals(this.insuranceIdentification, insurance.insuranceIdentification) &&
        Objects.equals(this.typeCode, insurance.typeCode) &&
        Objects.equals(this.typeDescription, insurance.typeDescription) &&
        Objects.equals(this.currentAnnualPremium, insurance.currentAnnualPremium) &&
        Objects.equals(this.link, insurance.link) &&
        Objects.equals(this.bankId, insurance.bankId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insuranceId, channelAccessAgreementInformation, insuranceIdentification, typeCode, typeDescription, currentAnnualPremium, link, bankId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Insurance {\n");
    
    sb.append("    insuranceId: ").append(toIndentedString(insuranceId)).append("\n");
    sb.append("    channelAccessAgreementInformation: ").append(toIndentedString(channelAccessAgreementInformation)).append("\n");
    sb.append("    insuranceIdentification: ").append(toIndentedString(insuranceIdentification)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    typeDescription: ").append(toIndentedString(typeDescription)).append("\n");
    sb.append("    currentAnnualPremium: ").append(toIndentedString(currentAnnualPremium)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

