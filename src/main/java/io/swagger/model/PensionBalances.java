package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Balance;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing information about different pension plan balances
 */
@ApiModel(description = "Data structure containing information about different pension plan balances")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class PensionBalances   {
  @JsonProperty("current")
  private Balance current = null;

  public PensionBalances current(Balance current) {
    this.current = current;
    return this;
  }

  /**
   * Get current
   * @return current
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Balance getCurrent() {
    return current;
  }

  public void setCurrent(Balance current) {
    this.current = current;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PensionBalances pensionBalances = (PensionBalances) o;
    return Objects.equals(this.current, pensionBalances.current);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PensionBalances {\n");
    
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
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

