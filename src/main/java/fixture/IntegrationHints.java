package fixture;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * Settles Booking instructions and posts the cash movement to Accounting.
 *
 * <p>data_category: SETTLEMENT_INSTRUCTION (MQ inbound), CASH_MOVEMENT (HTTP outbound).
 */
public class IntegrationHints {

  /** data_category SETTLEMENT_INSTRUCTION — produced by Booking */
  @RabbitListener(queues = "settlement.instructions")
  public void onSettlementInstruction(String payload) {}

  // HTTP POST accounting /api/v1/cash-movements — data_category CASH_MOVEMENT (fixture.dto.CashMovementDto)
}
