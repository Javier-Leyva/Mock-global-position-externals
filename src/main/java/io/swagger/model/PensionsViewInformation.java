package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PensionViewDetails;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing pension information
 */
@ApiModel(description = "Data structure containing pension information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class PensionsViewInformation   {
  @JsonProperty("presentationOrderPoducts")
  private Integer presentationOrderPoducts = null;

  @JsonProperty("pensionPlans")
  @Valid
  private List<PensionViewDetails> pensionPlans = null;

  public PensionsViewInformation presentationOrderPoducts(Integer presentationOrderPoducts) {
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

  public PensionsViewInformation pensionPlans(List<PensionViewDetails> pensionPlans) {
    this.pensionPlans = pensionPlans;
    return this;
  }

  public PensionsViewInformation addPensionPlansItem(PensionViewDetails pensionPlansItem) {
    if (this.pensionPlans == null) {
      this.pensionPlans = new ArrayList<PensionViewDetails>();
    }
    this.pensionPlans.add(pensionPlansItem);
    return this;
  }

  /**
   * Array of pension plans
   * @return pensionPlans
  **/
  @ApiModelProperty(value = "Array of pension plans")

  @Valid

  public List<PensionViewDetails> getPensionPlans() {
    return pensionPlans;
  }

  public void setPensionPlans(List<PensionViewDetails> pensionPlans) {
    this.pensionPlans = pensionPlans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PensionsViewInformation pensionsViewInformation = (PensionsViewInformation) o;
    return Objects.equals(this.presentationOrderPoducts, pensionsViewInformation.presentationOrderPoducts) &&
        Objects.equals(this.pensionPlans, pensionsViewInformation.pensionPlans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presentationOrderPoducts, pensionPlans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PensionsViewInformation {\n");
    
    sb.append("    presentationOrderPoducts: ").append(toIndentedString(presentationOrderPoducts)).append("\n");
    sb.append("    pensionPlans: ").append(toIndentedString(pensionPlans)).append("\n");
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

