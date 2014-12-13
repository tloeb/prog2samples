package de.ostfalia.prog2.de.ostfalia.prog2.dsl

/**
 * Created by loeb on 13.12.2014.
 */
class Distance{

    BigDecimal length
    Unit unit

    Distance plus(Distance operand){
        def newLength = this.length + Unit.convertUnit(operand, this.unit)
        new Distance(length : newLength, unit : this.unit)
    }
}
