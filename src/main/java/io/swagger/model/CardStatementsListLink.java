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
 * Data structure containing link information
 */
@ApiModel(description = "Data structure containing link information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class CardStatementsListLink   {
  @JsonProperty("href")
  private String href = null;

  public CardStatementsListLink href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference link url, that allows to navigate to specified uri
   * @return href
  **/
  @ApiModelProperty(example = "https://www.host.com/cards/4547420008209985/statements", value = "Reference link url, that allows to navigate to specified uri")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardStatementsListLink cardStatementsListLink = (CardStatementsListLink) o;
    return Objects.equals(this.href, cardStatementsListLink.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardStatementsListLink {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

