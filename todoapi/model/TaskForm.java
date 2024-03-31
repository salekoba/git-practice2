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
 * TaskForm
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-23T13:58:41.222189+09:00[Asia/Tokyo]")
public class TaskForm {

  private String title;

  public TaskForm() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaskForm(String title) {
    this.title = title;
  }

  public TaskForm title(String title) {
    this.title = title;
    return this;
  }

  /**
   * 作成されるタスクのタイトル
   * @return title
  */
  @NotNull 
  @Schema(name = "title", description = "作成されるタスクのタイトル", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskForm taskForm = (TaskForm) o;
    return Objects.equals(this.title, taskForm.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskForm {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

