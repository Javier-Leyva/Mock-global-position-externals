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
 * Data structure containing information about an investment fund
 */
@ApiModel(description = "Data structure containing information about an investment fund")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class InvestmentFundViewDetails   {
  @JsonProperty("investmentFundId")
  private String investmentFundId = null;

  @JsonProperty("channelAccessAgreementInformation")
  private Object channelAccessAgreementInformation = null;

  public InvestmentFundViewDetails investmentFundId(String investmentFundId) {
    this.investmentFundId = investmentFundId;
    return this;
  }

  /**
   * Investment fund ID
   * @return investmentFundId
  **/
  @ApiModelProperty(example = "1532928024698765", value = "Investment fund ID")


  public String getInvestmentFundId() {
    return investmentFundId;
  }

  public void setInvestmentFundId(String investmentFundId) {
    this.investmentFundId = investmentFundId;
  }

  public InvestmentFundViewDetails channelAccessAgreementInformation(Object channelAccessAgreementInformation) {
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
    InvestmentFundViewDetails investmentFundViewDetails = (InvestmentFundViewDetails) o;
    return Objects.equals(this.investmentFundId, investmentFundViewDetails.investmentFundId) &&
        Objects.equals(this.channelAccessAgreementInformation, investmentFundViewDetails.channelAccessAgreementInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investmentFundId, channelAccessAgreementInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentFundViewDetails {\n");
    
    sb.append("    investmentFundId: ").append(toIndentedString(investmentFundId)).append("\n");
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

