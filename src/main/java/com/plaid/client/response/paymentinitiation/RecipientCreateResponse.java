package com.plaid.client.response.paymentinitiation;

import com.plaid.client.response.BaseResponse;

public class RecipientCreateResponse extends BaseResponse {
  private String recipientId;

  public String getRecipientId() {
    return recipientId;
  }
}
