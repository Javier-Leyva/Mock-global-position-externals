package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Insurance;
import io.swagger.model.InsuranceDetailsLink;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing Insurance information and interest links.
 */
@ApiModel(description = "Data structure containing Insurance information and interest links.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class InsuranceWithLinks   {
  @JsonProperty("insurance")
  private Insurance insurance = null;

  @JsonProperty("insuranceDetailsLink")
  private InsuranceDetailsLink insuranceDetailsLink = null;

  public InsuranceWithLinks insurance(Insurance insurance) {
    this.insurance = insurance;
    return this;
  }

  /**
   * Get insurance
   * @return insurance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Insurance getInsurance() {
    return insurance;
  }

  public void setInsurance(Insurance insurance) {
    this.insurance = insurance;
  }

  public InsuranceWithLinks insuranceDetailsLink(InsuranceDetailsLink insuranceDetailsLink) {
    this.insuranceDetailsLink = insuranceDetailsLink;
    return this;
  }

  /**
   * Get insuranceDetailsLink
   * @return insuranceDetailsLink
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InsuranceDetailsLink getInsuranceDetailsLink() {
    return insuranceDetailsLink;
  }

  public void setInsuranceDetailsLink(InsuranceDetailsLink insuranceDetailsLink) {
    this.insuranceDetailsLink = insuranceDetailsLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceWithLinks insuranceWithLinks = (InsuranceWithLinks) o;
    return Objects.equals(this.insurance, insuranceWithLinks.insurance) &&
        Objects.equals(this.insuranceDetailsLink, insuranceWithLinks.insuranceDetailsLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insurance, insuranceDetailsLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceWithLinks {\n");
    
    sb.append("    insurance: ").append(toIndentedString(insurance)).append("\n");
    sb.append("    insuranceDetailsLink: ").append(toIndentedString(insuranceDetailsLink)).append("\n");
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

