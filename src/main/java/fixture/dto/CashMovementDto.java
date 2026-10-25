package fixture.dto;

/**
 * Cash movement posted to Accounting after settlement.
 * flow data_category: CASH_MOVEMENT
 */
public record CashMovementDto(String tradeId, String currency, String amount, String valueDate) {}
