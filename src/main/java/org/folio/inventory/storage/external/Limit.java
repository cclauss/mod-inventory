package org.folio.inventory.storage.external;

public final class Limit {
  private static final Limit ONE = limit(1);

  private final int limit;

  private Limit(int limit) {
    this.limit = limit;
  }

  public static Limit limit(int limit) {
    return new Limit(limit);
  }

  public static Limit one() {
    return ONE;
  }

  public int getLimit() {
    return limit;
  }
}
