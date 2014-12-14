package de.ostfalia.prog2.dsl


/**
 * Created by loeb on 14.12.2014.
 */
class CurrencyCategory {

        static Money getEur(Number n) {
            new Money(worth: n, currency: Currency.eur)
        }

        static Money getEur(Money d) {
            new Money(worth: Currency.convertCurrency(d, Currency.eur), currency: Currency.eur)
        }

        static Money getDollar(Number n) {
            new Money(worth: n, currency: Currency.dollar)
        }

        static Money getDollar(Money d) {
            new Money(worth: Currency.convertCurrency(d, Currency.dollar), currency: Currency.dollar)
        }
        static Money getCzk(Number n) {
            new Money(worth: n, currency: Currency.czk)
        }

        static Money getCzk(Money d) {
            new Money(worth: Currency.convertCurrency(d, Currency.czk), currency: Currency.czk)
        }

        static Money getBrl(Number n) {
            new Money(worth: n, currency: Currency.brl)
        }

        static Money getBrl(Money d) {
            new Money(worth: Currency.convertCurrency(d, Currency.brl), currency: Currency.brl)
        }

}
