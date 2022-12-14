/*
 * AMAR : Api de MAj du Rass
 * API to query, create, update and delete entries in the eCPS copy of the RASS referential
 *
 * OpenAPI spec version: v1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package fr.ans.psc.amar.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CivilStatus
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-01T09:34:49.260Z[GMT]")
public class CivilStatus {
  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("firstNames")
  private List<String> firstNames = null;

  @JsonProperty("birthdate")
  private String birthdate = null;

  @JsonProperty("birthTownCode")
  private String birthTownCode = null;

  @JsonProperty("birthCountryCode")
  private String birthCountryCode = null;

  @JsonProperty("birthplace")
  private String birthplace = null;

  @JsonProperty("genderCode")
  private String genderCode = null;

  @JsonProperty("personalCivilityTitle")
  private String personalCivilityTitle = null;

  public CivilStatus lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @Schema(description = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CivilStatus firstNames(List<String> firstNames) {
    this.firstNames = firstNames;
    return this;
  }

  public CivilStatus addFirstNamesItem(String firstNamesItem) {
    if (this.firstNames == null) {
      this.firstNames = new ArrayList<String>();
    }
    this.firstNames.add(firstNamesItem);
    return this;
  }

   /**
   * Get firstNames
   * @return firstNames
  **/
  @Schema(description = "")
  public List<String> getFirstNames() {
    return firstNames;
  }

  public void setFirstNames(List<String> firstNames) {
    this.firstNames = firstNames;
  }

  public CivilStatus birthdate(String birthdate) {
    this.birthdate = birthdate;
    return this;
  }

   /**
   * Get birthdate
   * @return birthdate
  **/
  @Schema(description = "")
  public String getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(String birthdate) {
    this.birthdate = birthdate;
  }

  public CivilStatus birthTownCode(String birthTownCode) {
    this.birthTownCode = birthTownCode;
    return this;
  }

   /**
   * Get birthTownCode
   * @return birthTownCode
  **/
  @Schema(description = "")
  public String getBirthTownCode() {
    return birthTownCode;
  }

  public void setBirthTownCode(String birthTownCode) {
    this.birthTownCode = birthTownCode;
  }

  public CivilStatus birthCountryCode(String birthCountryCode) {
    this.birthCountryCode = birthCountryCode;
    return this;
  }

   /**
   * Get birthCountryCode
   * @return birthCountryCode
  **/
  @Schema(description = "")
  public String getBirthCountryCode() {
    return birthCountryCode;
  }

  public void setBirthCountryCode(String birthCountryCode) {
    this.birthCountryCode = birthCountryCode;
  }

  public CivilStatus birthplace(String birthplace) {
    this.birthplace = birthplace;
    return this;
  }

   /**
   * Get birthplace
   * @return birthplace
  **/
  @Schema(description = "")
  public String getBirthplace() {
    return birthplace;
  }

  public void setBirthplace(String birthplace) {
    this.birthplace = birthplace;
  }

  public CivilStatus genderCode(String genderCode) {
    this.genderCode = genderCode;
    return this;
  }

   /**
   * Get genderCode
   * @return genderCode
  **/
  @Schema(description = "")
  public String getGenderCode() {
    return genderCode;
  }

  public void setGenderCode(String genderCode) {
    this.genderCode = genderCode;
  }

  public CivilStatus personalCivilityTitle(String personalCivilityTitle) {
    this.personalCivilityTitle = personalCivilityTitle;
    return this;
  }

   /**
   * Get personalCivilityTitle
   * @return personalCivilityTitle
  **/
  @Schema(description = "")
  public String getPersonalCivilityTitle() {
    return personalCivilityTitle;
  }

  public void setPersonalCivilityTitle(String personalCivilityTitle) {
    this.personalCivilityTitle = personalCivilityTitle;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CivilStatus civilStatus = (CivilStatus) o;
    return Objects.equals(this.lastName, civilStatus.lastName) &&
        Objects.equals(this.firstNames, civilStatus.firstNames) &&
        Objects.equals(this.birthdate, civilStatus.birthdate) &&
        Objects.equals(this.birthTownCode, civilStatus.birthTownCode) &&
        Objects.equals(this.birthCountryCode, civilStatus.birthCountryCode) &&
        Objects.equals(this.birthplace, civilStatus.birthplace) &&
        Objects.equals(this.genderCode, civilStatus.genderCode) &&
        Objects.equals(this.personalCivilityTitle, civilStatus.personalCivilityTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastName, firstNames, birthdate, birthTownCode, birthCountryCode, birthplace, genderCode, personalCivilityTitle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CivilStatus {\n");

    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstNames: ").append(toIndentedString(firstNames)).append("\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    birthTownCode: ").append(toIndentedString(birthTownCode)).append("\n");
    sb.append("    birthCountryCode: ").append(toIndentedString(birthCountryCode)).append("\n");
    sb.append("    birthplace: ").append(toIndentedString(birthplace)).append("\n");
    sb.append("    genderCode: ").append(toIndentedString(genderCode)).append("\n");
    sb.append("    personalCivilityTitle: ").append(toIndentedString(personalCivilityTitle)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
