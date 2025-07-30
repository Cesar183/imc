package com.example.androidmaster.exercises

fun main(){
    val morningNotification = 51;
    val eveningNotification = 135;

    printNotificationSummary(morningNotification);
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages:Int){
    if(numberOfMessages < 100){
        println("Número de mensajes: $numberOfMessages")
    } else {
        println("Número de mensajes: 99+")
    }
}