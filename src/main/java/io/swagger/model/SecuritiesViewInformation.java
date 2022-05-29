package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SecurityViewDetails;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing security information
 */
@ApiModel(description = "Data structure containing security information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class SecuritiesViewInformation   {
  @JsonProperty("presentationOrderPoducts")
  private Integer presentationOrderPoducts = null;

  @JsonProperty("securities")
  @Valid
  private List<SecurityViewDetails> securities = null;

  public SecuritiesViewInformation presentationOrderPoducts(Integer presentationOrderPoducts) {
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

  public SecuritiesViewInformation securities(List<SecurityViewDetails> securities) {
    this.securities = securities;
    return this;
  }

  public SecuritiesViewInformation addSecuritiesItem(SecurityViewDetails securitiesItem) {
    if (this.securities == null) {
      this.securities = new ArrayList<SecurityViewDetails>();
    }
    this.securities.add(securitiesItem);
    return this;
  }

  /**
   * Array of securities
   * @return securities
  **/
  @ApiModelProperty(value = "Array of securities")

  @Valid

  public List<SecurityViewDetails> getSecurities() {
    return securities;
  }

  public void setSecurities(List<SecurityViewDetails> securities) {
    this.securities = securities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritiesViewInformation securitiesViewInformation = (SecuritiesViewInformation) o;
    return Objects.equals(this.presentationOrderPoducts, securitiesViewInformation.presentationOrderPoducts) &&
        Objects.equals(this.securities, securitiesViewInformation.securities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presentationOrderPoducts, securities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritiesViewInformation {\n");
    
    sb.append("    presentationOrderPoducts: ").append(toIndentedString(presentationOrderPoducts)).append("\n");
    sb.append("    securities: ").append(toIndentedString(securities)).append("\n");
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

