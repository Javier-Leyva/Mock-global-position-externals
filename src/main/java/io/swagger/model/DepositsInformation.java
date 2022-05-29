package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DepositTotalBalances;
import io.swagger.model.DepositWithLinks;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing aggregated information from the deposit balances and broken down to deposit level.
 */
@ApiModel(description = "Data structure containing aggregated information from the deposit balances and broken down to deposit level.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class DepositsInformation   {
  @JsonProperty("totalBalances")
  private DepositTotalBalances totalBalances = null;

  @JsonProperty("list")
  @Valid
  private List<DepositWithLinks> _list = null;

  public DepositsInformation totalBalances(DepositTotalBalances totalBalances) {
    this.totalBalances = totalBalances;
    return this;
  }

  /**
   * Get totalBalances
   * @return totalBalances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DepositTotalBalances getTotalBalances() {
    return totalBalances;
  }

  public void setTotalBalances(DepositTotalBalances totalBalances) {
    this.totalBalances = totalBalances;
  }

  public DepositsInformation _list(List<DepositWithLinks> _list) {
    this._list = _list;
    return this;
  }

  public DepositsInformation addListItem(DepositWithLinks _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<DepositWithLinks>();
    }
    this._list.add(_listItem);
    return this;
  }

  /**
   * Array of deposits.
   * @return _list
  **/
  @ApiModelProperty(value = "Array of deposits.")

  @Valid

  public List<DepositWithLinks> getList() {
    return _list;
  }

  public void setList(List<DepositWithLinks> _list) {
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
    DepositsInformation depositsInformation = (DepositsInformation) o;
    return Objects.equals(this.totalBalances, depositsInformation.totalBalances) &&
        Objects.equals(this._list, depositsInformation._list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalBalances, _list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositsInformation {\n");
    
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

