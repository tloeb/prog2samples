package de.ostfalia.prog2.dsl


/**
 * Created by loeb on 14.12.2014.
 */
class Money {

    BigDecimal worth
    Currency currency


    Money plus(Money operand){
        def newWorth = this.worth + Currency.convertCurrency(operand, this.currency)
        new Money(worth : newWorth, currency : this.currency)
    }

    Money minus(Money operand){
        def newWorth = this.worth - Currency.convertCurrency(operand, this.currency)
        new Money(worth : newWorth, currency : this.currency)
    }
}
