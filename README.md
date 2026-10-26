# Settlement (fixture)

Business function: `BACK_OFFICE` (`app.business_function`).
Pillar: `Trade Processing` (`app.pillar`).

Settlement of booked trades.

## Integrations (topology)

- Listens on AMQP queue `settlement.cashflows` published by **Booking**.
- Posts the cashflow to **Documentation** on `/api/v1/cashflows`.
- Posts the cashflow to **Accounting** on `/api/v1/cash-movements`.

## Data transiting on flows (Data Model fixture)

| Peer | direction | Kind | Channel | data | frequency |
|------|-----------|------|---------|------|-----------|
| Booking | inbound | MQ | settlement.cashflows | `cashflow` | `daily` |
| Documentation | outbound | API | /api/v1/cashflows | `cashflow` | `real-time` |
| Accounting | outbound | API | /api/v1/cash-movements | `cashflow` | `daily` |

See `TransitDataTypes.java` and `application.yml` (`data`, `frequency`).
