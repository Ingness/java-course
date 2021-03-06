/*
 * Java WSB Course Sample Movie App API
 * Sample Movie App API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package pl.wsb.students.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * MovieRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-03T15:00:27.698Z")
public class MovieRequest   {
  /**
   * Movie genre
   */
  public enum GenreEnum {
    ACTION("Action"),
    
    COMEDY("Comedy"),
    
    DRAMA("Drama"),
    
    SCIENCE_FICTION("Science fiction"),
    
    THRILLER("Thriller");

    private String value;

    GenreEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenreEnum fromValue(String text) {
      for (GenreEnum b : GenreEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("genre")
  private GenreEnum genre = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("year")
  private String year = null;

  @JsonProperty("director")
  private String director = null;

  public MovieRequest genre(GenreEnum genre) {
    this.genre = genre;
    return this;
  }

  /**
   * Movie genre
   * @return genre
   **/
  @JsonProperty("genre")
  @ApiModelProperty(required = true, value = "Movie genre")
  @NotNull
  public GenreEnum getGenre() {
    return genre;
  }

  public void setGenre(GenreEnum genre) {
    this.genre = genre;
  }

  public MovieRequest title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Movie title
   * @return title
   **/
  @JsonProperty("title")
  @ApiModelProperty(required = true, value = "Movie title")
  @NotNull
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MovieRequest year(String year) {
    this.year = year;
    return this;
  }

  /**
   * Movie release year
   * @return year
   **/
  @JsonProperty("year")
  @ApiModelProperty(required = true, value = "Movie release year")
  @NotNull
  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public MovieRequest director(String director) {
    this.director = director;
    return this;
  }

  /**
   * Movie director
   * @return director
   **/
  @JsonProperty("director")
  @ApiModelProperty(required = true, value = "Movie director")
  @NotNull
  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovieRequest movieRequest = (MovieRequest) o;
    return Objects.equals(this.genre, movieRequest.genre) &&
        Objects.equals(this.title, movieRequest.title) &&
        Objects.equals(this.year, movieRequest.year) &&
        Objects.equals(this.director, movieRequest.director);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genre, title, year, director);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovieRequest {\n");
    
    sb.append("    genre: ").append(toIndentedString(genre)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    director: ").append(toIndentedString(director)).append("\n");
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

