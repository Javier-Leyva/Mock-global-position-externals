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
 * Data structure containing card details
 */
@ApiModel(description = "Data structure containing card details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class CardViewDetails   {
  @JsonProperty("cardId")
  private String cardId = null;

  @JsonProperty("channelAccessAgreementInformation")
  private Object channelAccessAgreementInformation = null;

  public CardViewDetails cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

  /**
   * Card ID that is used to uniquely identify the card in card-related operations. For internal use, the value does not require tokenization.  The value is usually the same as the card number.
   * @return cardId
  **/
  @ApiModelProperty(example = "123456789-0", value = "Card ID that is used to uniquely identify the card in card-related operations. For internal use, the value does not require tokenization.  The value is usually the same as the card number.")


  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public CardViewDetails channelAccessAgreementInformation(Object channelAccessAgreementInformation) {
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
    CardViewDetails cardViewDetails = (CardViewDetails) o;
    return Objects.equals(this.cardId, cardViewDetails.cardId) &&
        Objects.equals(this.channelAccessAgreementInformation, cardViewDetails.channelAccessAgreementInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardId, channelAccessAgreementInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardViewDetails {\n");
    
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
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

