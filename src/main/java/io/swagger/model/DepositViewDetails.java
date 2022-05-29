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
 * Data structure containing information about a deposit
 */
@ApiModel(description = "Data structure containing information about a deposit")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class DepositViewDetails   {
  @JsonProperty("depositId")
  private String depositId = null;

  @JsonProperty("channelAccessAgreementInformation")
  private Object channelAccessAgreementInformation = null;

  public DepositViewDetails depositId(String depositId) {
    this.depositId = depositId;
    return this;
  }

  /**
   * Unique deposit ID
   * @return depositId
  **/
  @ApiModelProperty(example = "123563-ffet3556", value = "Unique deposit ID")


  public String getDepositId() {
    return depositId;
  }

  public void setDepositId(String depositId) {
    this.depositId = depositId;
  }

  public DepositViewDetails channelAccessAgreementInformation(Object channelAccessAgreementInformation) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositViewDetails depositViewDetails = (DepositViewDetails) o;
    return Objects.equals(this.depositId, depositViewDetails.depositId) &&
        Objects.equals(this.channelAccessAgreementInformation, depositViewDetails.channelAccessAgreementInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositId, channelAccessAgreementInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositViewDetails {\n");
    
    sb.append("    depositId: ").append(toIndentedString(depositId)).append("\n");
    sb.append("    channelAccessAgreementInformation: ").append(toIndentedString(channelAccessAgreementInformation)).append("\n");
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

