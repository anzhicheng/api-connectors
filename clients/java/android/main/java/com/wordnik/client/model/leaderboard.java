package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Leaderboard {
  @JsonProperty("username")
  private String username = null;
  @JsonProperty("marginBalance")
  private Double marginBalance = null;
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  public Double getMarginBalance() {
    return marginBalance;
  }
  public void setMarginBalance(Double marginBalance) {
    this.marginBalance = marginBalance;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Leaderboard {\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  marginBalance: ").append(marginBalance).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

