package de.ostfalia.prog2

def helloWorld = { println "Hello World"}
helloWorld()


//Closure with Parameters
def someMath = {x, y -> println x+y}
someMath(2,3)

//Closures as Method Parameters
def list = ['a','b','c','d']
def newList = []

def clos = { it.toUpperCase() }

list.collect( newList, clos )
println(newList.toString())