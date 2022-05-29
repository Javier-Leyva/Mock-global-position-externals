package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DepositViewDetails;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing deposit information
 */
@ApiModel(description = "Data structure containing deposit information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class DepositsViewInformation   {
  @JsonProperty("presentationOrderPoducts")
  private Integer presentationOrderPoducts = null;

  @JsonProperty("deposits")
  @Valid
  private List<DepositViewDetails> deposits = null;

  public DepositsViewInformation presentationOrderPoducts(Integer presentationOrderPoducts) {
    this.presentationOrderPoducts = presentationOrderPoducts;
    return this;
  }

  /**
   * Get presentationOrderPoducts
   * @return presentationOrderPoducts
  **/
  @ApiModelProperty(value = "")


  public Integer getPresentationOrderPoducts() {
    return presentationOrderPoducts;
  }

  public void setPresentationOrderPoducts(Integer presentationOrderPoducts) {
    this.presentationOrderPoducts = presentationOrderPoducts;
  }

  public DepositsViewInformation deposits(List<DepositViewDetails> deposits) {
    this.deposits = deposits;
    return this;
  }

  public DepositsViewInformation addDepositsItem(DepositViewDetails depositsItem) {
    if (this.deposits == null) {
      this.deposits = new ArrayList<DepositViewDetails>();
    }
    this.deposits.add(depositsItem);
    return this;
  }

  /**
   * Array of deposits
   * @return deposits
  **/
  @ApiModelProperty(value = "Array of deposits")

  @Valid

  public List<DepositViewDetails> getDeposits() {
    return deposits;
  }

  public void setDeposits(List<DepositViewDetails> deposits) {
    this.deposits = deposits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositsViewInformation depositsViewInformation = (DepositsViewInformation) o;
    return Objects.equals(this.presentationOrderPoducts, depositsViewInformation.presentationOrderPoducts) &&
        Objects.equals(this.deposits, depositsViewInformation.deposits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presentationOrderPoducts, deposits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositsViewInformation {\n");
    
    sb.append("    presentationOrderPoducts: ").append(toIndentedString(presentationOrderPoducts)).append("\n");
    sb.append("    deposits: ").append(toIndentedString(deposits)).append("\n");
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

