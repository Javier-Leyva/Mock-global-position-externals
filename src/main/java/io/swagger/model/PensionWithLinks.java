package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Pension;
import io.swagger.model.PensionDetailsLink;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing pension plan information and interest links.
 */
@ApiModel(description = "Data structure containing pension plan information and interest links.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class PensionWithLinks   {
  @JsonProperty("pension")
  private Pension pension = null;

  @JsonProperty("pensionDetailsLink")
  private PensionDetailsLink pensionDetailsLink = null;

  public PensionWithLinks pension(Pension pension) {
    this.pension = pension;
    return this;
  }

  /**
   * Get pension
   * @return pension
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Pension getPension() {
    return pension;
  }

  public void setPension(Pension pension) {
    this.pension = pension;
  }

  public PensionWithLinks pensionDetailsLink(PensionDetailsLink pensionDetailsLink) {
    this.pensionDetailsLink = pensionDetailsLink;
    return this;
  }

  /**
   * Get pensionDetailsLink
   * @return pensionDetailsLink
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PensionDetailsLink getPensionDetailsLink() {
    return pensionDetailsLink;
  }

  public void setPensionDetailsLink(PensionDetailsLink pensionDetailsLink) {
    this.pensionDetailsLink = pensionDetailsLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PensionWithLinks pensionWithLinks = (PensionWithLinks) o;
    return Objects.equals(this.pension, pensionWithLinks.pension) &&
        Objects.equals(this.pensionDetailsLink, pensionWithLinks.pensionDetailsLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pension, pensionDetailsLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PensionWithLinks {\n");
    
    sb.append("    pension: ").append(toIndentedString(pension)).append("\n");
    sb.append("    pensionDetailsLink: ").append(toIndentedString(pensionDetailsLink)).append("\n");
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

