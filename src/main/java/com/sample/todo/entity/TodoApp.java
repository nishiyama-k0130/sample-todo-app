package com.sample.todo.entity;

import java.io.Serializable;

/**
 * TODO_APPテーブルに該当するエンティティクラス<br>
 * JavaBeansのルールに従っています。
 */
public class TodoApp implements Serializable {
  /**
   * おまじない
   */
  private static final long serialVersionUID = 1L;

  private int todoId;
  private String title;
  private String detail;

  public TodoApp() {}

  public int getTodoId() {
    return this.todoId;
  }

  public void setTodoId(int todoId) {
    this.todoId = todoId;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDetail() {
    return this.detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }
}
