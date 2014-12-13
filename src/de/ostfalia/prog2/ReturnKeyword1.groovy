package de.ostfalia.prog2

def return_gotchas(value) {
    if(value > 1){
        "The Value was greater than 1"
    }
    if(value < 1) {
        "The Value was lower than 1"
    }
}

println return_gotchas(0)
println return_gotchas(1)
println return_gotchas(2)