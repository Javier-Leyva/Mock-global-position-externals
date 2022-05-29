package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Security;
import io.swagger.model.SecurityDetailsLink;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing security information and interest links.
 */
@ApiModel(description = "Data structure containing security information and interest links.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class SecurityWithLinks   {
  @JsonProperty("security")
  private Security security = null;

  @JsonProperty("securityDetailsLink")
  private SecurityDetailsLink securityDetailsLink = null;

  public SecurityWithLinks security(Security security) {
    this.security = security;
    return this;
  }

  /**
   * Get security
   * @return security
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Security getSecurity() {
    return security;
  }

  public void setSecurity(Security security) {
    this.security = security;
  }

  public SecurityWithLinks securityDetailsLink(SecurityDetailsLink securityDetailsLink) {
    this.securityDetailsLink = securityDetailsLink;
    return this;
  }

  /**
   * Get securityDetailsLink
   * @return securityDetailsLink
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SecurityDetailsLink getSecurityDetailsLink() {
    return securityDetailsLink;
  }

  public void setSecurityDetailsLink(SecurityDetailsLink securityDetailsLink) {
    this.securityDetailsLink = securityDetailsLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityWithLinks securityWithLinks = (SecurityWithLinks) o;
    return Objects.equals(this.security, securityWithLinks.security) &&
        Objects.equals(this.securityDetailsLink, securityWithLinks.securityDetailsLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(security, securityDetailsLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityWithLinks {\n");
    
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    securityDetailsLink: ").append(toIndentedString(securityDetailsLink)).append("\n");
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

