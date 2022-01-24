package com.illusionist.simple;

import java.math.BigDecimal;

public class PriceUpdate {

  private final String symbol;
  private final BigDecimal price;

  public PriceUpdate(String symbol, BigDecimal price) {
    this.symbol = symbol;
    this.price = price;
  }

  public String getSymbol() {
    return symbol;
  }

  public BigDecimal getPrice() {
    return price;
  }
}
