package de.ostfalia.prog2.dsl

/**
 * Created by loeb on 14.12.2014.
 */

use(CurrencyCategory) {

    def balance = 500.eur
    def bill = 200.dollar

    print("1 Euro plus 1 Dollar = ")
    println(1.eur.plus(1.dollar).worth + " Euro")

    println("#######################")

    print("Balance + 200 Dollar = ")
    println(balance.plus(200.dollar).worth +" Euro")

    println("#######################")

    print("Balance - Bill = ")
    println(balance.minus(bill).worth + " Euro")

    println("#######################")

    //For-Schleife
    println("Balance plus fünf Mal 100 Kronen")
    5.times {
       balance = balance.plus(100.czk)
    }
    println(balance.worth)

    println("#######################")

    println("Balance plus 300 Kronen + 100 Dollar in Euro = ")
    println(balance.plus(300.czk).plus(100.dollar).worth)




}
