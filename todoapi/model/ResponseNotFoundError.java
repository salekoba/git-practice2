package com.example.todoapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 指定したリソースが存在しない
 */

@Schema(name = "ResponseNotFoundError", description = "指定したリソースが存在しない")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-23T13:58:41.222189+09:00[Asia/Tokyo]")
public class ResponseNotFoundError {

  private String title = "Resource Not Found";

  private String detail;

  public ResponseNotFoundError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResponseNotFoundError(String title, String detail) {
    this.title = title;
    this.detail = detail;
  }

  public ResponseNotFoundError title(String title1) {
    this.title = title1;
    return this;
  }

  /**
   * エラーのタイトル
   * @return title
  */
  @NotNull 
  @Schema(name = "title", description = "エラーのタイトル", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ResponseNotFoundError detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * エラーの詳細
   * @return detail
  */
  @NotNull 
  @Schema(name = "detail", description = "エラーの詳細", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseNotFoundError responseNotFoundError = (ResponseNotFoundError) o;
    return Objects.equals(this.title, responseNotFoundError.title) &&
        Objects.equals(this.detail, responseNotFoundError.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseNotFoundError {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

