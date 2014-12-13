package de.ostfalia.prog2


def return_thisIsMadness(value) {
    if(value > 1){
        "The Value was greater than 1"
    }
    else if(value < 1) {
        "The Value was lower than 1"
    }
}

println return_thisIsMadness(0)
println return_thisIsMadness(1)
println return_thisIsMadness(2)