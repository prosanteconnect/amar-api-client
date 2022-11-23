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

import java.util.Objects;

/**
 * AlternativeIdentifier
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-01T09:34:49.260Z[GMT]")
public class AlternativeIdentifier {
  @JsonProperty("identifier")
  private String identifier = null;

  @JsonProperty("origine")
  private String origine = null;

  @JsonProperty("quality")
  private Integer quality = null;

  public AlternativeIdentifier identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @Schema(required = true, description = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public AlternativeIdentifier origine(String origine) {
    this.origine = origine;
    return this;
  }

   /**
   * Get origine
   * @return origine
  **/
  @Schema(description = "")
  public String getOrigine() {
    return origine;
  }

  public void setOrigine(String origine) {
    this.origine = origine;
  }

  public AlternativeIdentifier quality(Integer quality) {
    this.quality = quality;
    return this;
  }

   /**
   * Get quality
   * @return quality
  **/
  @Schema(description = "")
  public Integer getQuality() {
    return quality;
  }

  public void setQuality(Integer quality) {
    this.quality = quality;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlternativeIdentifier alternativeIdentifier = (AlternativeIdentifier) o;
    return Objects.equals(this.identifier, alternativeIdentifier.identifier) &&
        Objects.equals(this.origine, alternativeIdentifier.origine) &&
        Objects.equals(this.quality, alternativeIdentifier.quality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, origine, quality);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternativeIdentifier {\n");

    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    origine: ").append(toIndentedString(origine)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
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