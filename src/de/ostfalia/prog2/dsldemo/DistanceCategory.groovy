package de.ostfalia.prog2.dsldemo

/**
 * Created by loeb on 13.12.2014.
 */
class DistanceCategory {

    static Distance getMm(Number n) {
        new Distance(length: n, unit: Unit.mm)
    }

    static Distance getMm(Distance d) {
        new Distance(length: Unit.convertUnit(d, Unit.mm), unit: Unit.mm)
    }

    static Distance getCm(Number n) {
        new Distance(length: n, unit: Unit.cm)
    }

    static Distance getCm(Distance d) {
        new Distance(length: Unit.convertUnit(d, Unit.cm), unit: Unit.cm)
    }

    static Distance getM(Number n) {
        new Distance(length: n, unit: Unit.m)
    }

    static Distance getM(Distance d) {
        new Distance(length: Unit.convertUnit(d, Unit.m), unit: Unit.m)
    }

    static Distance getKm(Number n) {
        new Distance(length: n, unit: Unit.km)
    }

    static Distance getKm(Distance d) {
        new Distance(length: Unit.convertUnit(d, Unit.km), unit: Unit.km)
    }

}
