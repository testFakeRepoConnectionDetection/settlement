package fixture;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * Cashflow in from Booking. Cashflow out to Documentation and Accounting.
 *
 * <p>Edge fields: data cashflow frequency daily from Booking.
 * data cashflow frequency real-time toward Documentation.
 * data cashflow frequency daily toward Accounting.
 */
public class IntegrationHints {

  /** data cashflow, frequency daily — produced by Booking */
  @RabbitListener(queues = "settlement.cashflows")
  public void onCashflow(String payload) {}

  // HTTP POST documentation /api/v1/cashflows — data cashflow, frequency real-time
  // HTTP POST accounting /api/v1/cash-movements — data cashflow, frequency daily
}
