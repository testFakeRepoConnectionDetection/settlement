package fixture.flow;

/**
 * Data categories on Settlement flows.
 * grep: data_category SETTLEMENT_INSTRUCTION CASH_MOVEMENT
 */
public final class TransitDataTypes {

  public static final String MQ_SETTLEMENT_INSTRUCTION = "SETTLEMENT_INSTRUCTION";
  public static final String HTTP_CASH_MOVEMENT = "CASH_MOVEMENT";

  public static final String MQ_PAYLOAD_FORMAT = "JSON";
  public static final String HTTP_PAYLOAD_FORMAT = "JSON";

  private TransitDataTypes() {}
}
