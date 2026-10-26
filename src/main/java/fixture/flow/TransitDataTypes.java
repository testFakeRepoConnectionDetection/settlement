package fixture.flow;

/**
 * Edge attributes on Settlement flows.
 * grep: data frequency cashflow real-time daily
 */
public final class TransitDataTypes {

  /** Node attribute business_function for Settlement. */
  public static final String BUSINESS_FUNCTION = "BACK_OFFICE";

  /** Node attribute pillar for Settlement. */
  public static final String PILLAR = "Trade Processing";

  public static final String DATA_CASHFLOW = "cashflow";
  public static final String FREQUENCY_REAL_TIME = "real-time";
  public static final String FREQUENCY_DAILY = "daily";

  private TransitDataTypes() {}
}
