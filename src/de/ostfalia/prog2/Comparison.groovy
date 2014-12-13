package de.ostfalia.prog2


/*
Comparison
 */

//Identity
Integer a = new Integer(4)
Integer b = a

//Equality
Integer c = new Integer(4)
Integer d = new Integer(4)

//Comparison in Groovy

if( a == 4)
    println "a has value 4"

if(a.is(b))
    println "a is equal b"

if(a == d)
    println "a has the same Value of d"

if(!a.is(d))
    println "a IS not d"



