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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * MovieRatingRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-03T15:00:27.698Z")
public class MovieRatingRequest   {
  @JsonProperty("movie_id")
  private Integer movieId = null;

  @JsonProperty("rating")
  private Integer rating = null;

  public MovieRatingRequest movieId(Integer movieId) {
    this.movieId = movieId;
    return this;
  }

  /**
   * Movie to rate id
   * @return movieId
   **/
  @JsonProperty("movie_id")
  @ApiModelProperty(required = true, value = "Movie to rate id")
  @NotNull
  public Integer getMovieId() {
    return movieId;
  }

  public void setMovieId(Integer movieId) {
    this.movieId = movieId;
  }

  public MovieRatingRequest rating(Integer rating) {
    this.rating = rating;
    return this;
  }

  /**
   * My rate
   * @return rating
   **/
  @JsonProperty("rating")
  @ApiModelProperty(required = true, value = "My rate")
  @NotNull
  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovieRatingRequest movieRatingRequest = (MovieRatingRequest) o;
    return Objects.equals(this.movieId, movieRatingRequest.movieId) &&
        Objects.equals(this.rating, movieRatingRequest.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movieId, rating);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovieRatingRequest {\n");
    
    sb.append("    movieId: ").append(toIndentedString(movieId)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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

