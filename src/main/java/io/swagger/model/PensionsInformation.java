package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PensionTotalBalances;
import io.swagger.model.PensionWithLinks;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing aggregated information from the pension plan balances and broken down to pension plan level.
 */
@ApiModel(description = "Data structure containing aggregated information from the pension plan balances and broken down to pension plan level.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class PensionsInformation   {
  @JsonProperty("totalBalances")
  private PensionTotalBalances totalBalances = null;

  @JsonProperty("list")
  @Valid
  private List<PensionWithLinks> _list = null;

  public PensionsInformation totalBalances(PensionTotalBalances totalBalances) {
    this.totalBalances = totalBalances;
    return this;
  }

  /**
   * Get totalBalances
   * @return totalBalances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PensionTotalBalances getTotalBalances() {
    return totalBalances;
  }

  public void setTotalBalances(PensionTotalBalances totalBalances) {
    this.totalBalances = totalBalances;
  }

  public PensionsInformation _list(List<PensionWithLinks> _list) {
    this._list = _list;
    return this;
  }

  public PensionsInformation addListItem(PensionWithLinks _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<PensionWithLinks>();
    }
    this._list.add(_listItem);
    return this;
  }

  /**
   * Array of pension plans.
   * @return _list
  **/
  @ApiModelProperty(value = "Array of pension plans.")

  @Valid

  public List<PensionWithLinks> getList() {
    return _list;
  }

  public void setList(List<PensionWithLinks> _list) {
    this._list = _list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PensionsInformation pensionsInformation = (PensionsInformation) o;
    return Objects.equals(this.totalBalances, pensionsInformation.totalBalances) &&
        Objects.equals(this._list, pensionsInformation._list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalBalances, _list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PensionsInformation {\n");
    
    sb.append("    totalBalances: ").append(toIndentedString(totalBalances)).append("\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
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

