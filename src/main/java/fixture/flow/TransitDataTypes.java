package fixture.flow;

/**
 * Data categories on Settlement flows.
 * grep: data_category SETTLEMENT_INSTRUCTION CASH_MOVEMENT
 */
public final class TransitDataTypes {

  /** Node attribute business_function for Settlement. */
  public static final String BUSINESS_FUNCTION = "BACK_OFFICE";

  public static final String MQ_SETTLEMENT_INSTRUCTION = "SETTLEMENT_INSTRUCTION";
  public static final String HTTP_CASH_MOVEMENT = "CASH_MOVEMENT";

  public static final String MQ_PAYLOAD_FORMAT = "JSON";
  public static final String HTTP_PAYLOAD_FORMAT = "JSON";

  private TransitDataTypes() {}
}
