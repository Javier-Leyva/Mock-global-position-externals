package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InsuranceTotalBalances;
import io.swagger.model.InsuranceWithLinks;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing aggregated information from the Insurance balances and broken down to Insurance level.
 */
@ApiModel(description = "Data structure containing aggregated information from the Insurance balances and broken down to Insurance level.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class InsuranceInformation   {
  @JsonProperty("totalBalances")
  private InsuranceTotalBalances totalBalances = null;

  @JsonProperty("list")
  @Valid
  private List<InsuranceWithLinks> _list = null;

  public InsuranceInformation totalBalances(InsuranceTotalBalances totalBalances) {
    this.totalBalances = totalBalances;
    return this;
  }

  /**
   * Get totalBalances
   * @return totalBalances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InsuranceTotalBalances getTotalBalances() {
    return totalBalances;
  }

  public void setTotalBalances(InsuranceTotalBalances totalBalances) {
    this.totalBalances = totalBalances;
  }

  public InsuranceInformation _list(List<InsuranceWithLinks> _list) {
    this._list = _list;
    return this;
  }

  public InsuranceInformation addListItem(InsuranceWithLinks _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<InsuranceWithLinks>();
    }
    this._list.add(_listItem);
    return this;
  }

  /**
   * Array of investments.
   * @return _list
  **/
  @ApiModelProperty(value = "Array of investments.")

  @Valid

  public List<InsuranceWithLinks> getList() {
    return _list;
  }

  public void setList(List<InsuranceWithLinks> _list) {
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
    InsuranceInformation insuranceInformation = (InsuranceInformation) o;
    return Objects.equals(this.totalBalances, insuranceInformation.totalBalances) &&
        Objects.equals(this._list, insuranceInformation._list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalBalances, _list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceInformation {\n");
    
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

