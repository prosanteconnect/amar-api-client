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
 * User
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-01T09:34:49.260Z[GMT]")
public class User {
  @JsonProperty("nationalId")
  private String nationalId = null;

  @JsonProperty("contactInfo")
  private ContactInfo contactInfo = null;

  @JsonProperty("practices")
  private List<Practice> practices = null;

  @JsonProperty("civilStatus")
  private CivilStatus civilStatus = null;

  @JsonProperty("alternativeIdentifiers")
  private List<AlternativeIdentifier> alternativeIdentifiers = null;

  public User nationalId(String nationalId) {
    this.nationalId = nationalId;
    return this;
  }

   /**
   * Get nationalId
   * @return nationalId
  **/
  @Schema(required = true, description = "")
  public String getNationalId() {
    return nationalId;
  }

  public void setNationalId(String nationalId) {
    this.nationalId = nationalId;
  }

  public User contactInfo(ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

   /**
   * Get contactInfo
   * @return contactInfo
  **/
  @Schema(description = "")
  public ContactInfo getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
  }

  public User practices(List<Practice> practices) {
    this.practices = practices;
    return this;
  }

  public User addPracticesItem(Practice practicesItem) {
    if (this.practices == null) {
      this.practices = new ArrayList<Practice>();
    }
    this.practices.add(practicesItem);
    return this;
  }

   /**
   * Get practices
   * @return practices
  **/
  @Schema(description = "")
  public List<Practice> getPractices() {
    return practices;
  }

  public void setPractices(List<Practice> practices) {
    this.practices = practices;
  }

  public User civilStatus(CivilStatus civilStatus) {
    this.civilStatus = civilStatus;
    return this;
  }

   /**
   * Get civilStatus
   * @return civilStatus
  **/
  @Schema(description = "")
  public CivilStatus getCivilStatus() {
    return civilStatus;
  }

  public void setCivilStatus(CivilStatus civilStatus) {
    this.civilStatus = civilStatus;
  }

  public User alternativeIdentifiers(List<AlternativeIdentifier> alternativeIdentifiers) {
    this.alternativeIdentifiers = alternativeIdentifiers;
    return this;
  }

  public User addAlternativeIdentifiersItem(AlternativeIdentifier alternativeIdentifiersItem) {
    if (this.alternativeIdentifiers == null) {
      this.alternativeIdentifiers = new ArrayList<AlternativeIdentifier>();
    }
    this.alternativeIdentifiers.add(alternativeIdentifiersItem);
    return this;
  }

   /**
   * Get alternativeIdentifiers
   * @return alternativeIdentifiers
  **/
  @Schema(description = "")
  public List<AlternativeIdentifier> getAlternativeIdentifiers() {
    return alternativeIdentifiers;
  }

  public void setAlternativeIdentifiers(List<AlternativeIdentifier> alternativeIdentifiers) {
    this.alternativeIdentifiers = alternativeIdentifiers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.nationalId, user.nationalId) &&
        Objects.equals(this.contactInfo, user.contactInfo) &&
        Objects.equals(this.practices, user.practices) &&
        Objects.equals(this.civilStatus, user.civilStatus) &&
        Objects.equals(this.alternativeIdentifiers, user.alternativeIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nationalId, contactInfo, practices, civilStatus, alternativeIdentifiers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");

    sb.append("    nationalId: ").append(toIndentedString(nationalId)).append("\n");
    sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
    sb.append("    practices: ").append(toIndentedString(practices)).append("\n");
    sb.append("    civilStatus: ").append(toIndentedString(civilStatus)).append("\n");
    sb.append("    alternativeIdentifiers: ").append(toIndentedString(alternativeIdentifiers)).append("\n");
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
