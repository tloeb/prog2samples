package de.ostfalia.prog2.dsl


/**
 * Created by loeb on 14.12.2014.
 */
class Currency {
    def ratio
    String name
    static ratioTable = [

    //       eur,     dollar,       czk,       brl,
        [      1,    1.24575,   27.5486,       3.30236], // eur
        [0.80230,          1,   0.04514,       0.37614], // dollar
        [0.03622,    22.1153,         1,       8.31834], // czk
        [0.30178,    2.65090,   0.11967,             1]  // brl

    ]

    static def convertCurrency(Money m, Currency newCurrency) {
        def factor = ratioTable[m.currency.ratio][newCurrency.ratio]
        if(factor)
            return m.worth * factor
        else
            return m.worth / ratioTable[newCurrency.ratio][m.unit.ratio]
    }

    public static final eur = new Currency(ratio: 0, name: "euro")
    public static final dollar = new Currency(ratio: 1, name: "dollar")
    public static final czk = new Currency(ratio: 2, name: "krone")
    public static final brl = new Currency(ratio: 3, name: "real")
}
