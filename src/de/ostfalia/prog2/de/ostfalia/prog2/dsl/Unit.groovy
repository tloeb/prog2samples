package de.ostfalia.prog2.de.ostfalia.prog2.dsl

/**
 * Created by loeb on 13.12.2014.
 */
class Unit {

    def ratio
    String name
    static ratioTable = [

//    mm,    cm,     m,   km
    [  1,     0,     0,    0], // mm
    [ 10,     1,     0,    0], // cm
    [1e3,   1e2,     1,    0], // m
    [1e6,   1e5,   1e3,    1]  // km

    ]

    static def convertUnit(Distance d, Unit newUnit) {
        def factor = ratioTable[d.unit.ratio][newUnit.ratio]
        if(factor)
            return d.length * factor
        else
            return d.length / ratioTable[newUnit.ratio][d.unit.ratio]
    }

    public static final mm = new Unit(ratio: 0, name: "millimeter")
    public static final cm = new Unit(ratio: 1, name: "centimeter")
    public static final m = new Unit(ratio: 2, name: "meter")
    public static final km = new Unit(ratio: 3, name: "kilometer")


}
