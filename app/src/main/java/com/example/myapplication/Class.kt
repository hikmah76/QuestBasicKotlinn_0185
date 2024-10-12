package com.example.myapplication

class Motor()

class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "mary@gmail.com")

    //prints the value of the property: email
    print(contact.email)
}    