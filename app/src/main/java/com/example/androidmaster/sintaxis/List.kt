package com.example.androidmaster.sintaxis

fun main(){
     val readOnly:List<String> = listOf("Lunes", "Martes", "Miercoles")

    val example = readOnly.filter { it.contains("a") }

    println(example)

    for (s in readOnly) {
        println(s)
    }


}