# Settlement (fixture)

Settlement of booked trades. Receives instructions from Booking and posts cash movements to Accounting.

## Integrations (topology)

- Listens on AMQP queue `settlement.instructions` published by **Booking**.
- Posts cash movements to **Accounting** on `/api/v1/cash-movements`.

## Data transiting on flows (Data Model fixture)

| Peer | Kind | Channel | data_category |
|------|------|---------|---------------|
| Booking | MQ (inbound) | settlement.instructions | `SETTLEMENT_INSTRUCTION` |
| Accounting | API | /cash-movements | `CASH_MOVEMENT` |

Constants: `fixture.flow.TransitDataTypes`. DTO: `CashMovementDto`.
