package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InvestmentFundTotalBalances;
import io.swagger.model.InvestmentFundWithLinks;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing aggregated information from the investment balances and broken down to investment level.
 */
@ApiModel(description = "Data structure containing aggregated information from the investment balances and broken down to investment level.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")


public class InvestmentFundsInformation   {
  @JsonProperty("totalBalances")
  private InvestmentFundTotalBalances totalBalances = null;

  @JsonProperty("list")
  @Valid
  private List<InvestmentFundWithLinks> _list = null;

  public InvestmentFundsInformation totalBalances(InvestmentFundTotalBalances totalBalances) {
    this.totalBalances = totalBalances;
    return this;
  }

  /**
   * Get totalBalances
   * @return totalBalances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InvestmentFundTotalBalances getTotalBalances() {
    return totalBalances;
  }

  public void setTotalBalances(InvestmentFundTotalBalances totalBalances) {
    this.totalBalances = totalBalances;
  }

  public InvestmentFundsInformation _list(List<InvestmentFundWithLinks> _list) {
    this._list = _list;
    return this;
  }

  public InvestmentFundsInformation addListItem(InvestmentFundWithLinks _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<InvestmentFundWithLinks>();
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

  public List<InvestmentFundWithLinks> getList() {
    return _list;
  }

  public void setList(List<InvestmentFundWithLinks> _list) {
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
    InvestmentFundsInformation investmentFundsInformation = (InvestmentFundsInformation) o;
    return Objects.equals(this.totalBalances, investmentFundsInformation.totalBalances) &&
        Objects.equals(this._list, investmentFundsInformation._list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalBalances, _list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentFundsInformation {\n");
    
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

