package com.example.apis

data class Response (
    val state: String,
    val data: List<Supplier>
)

data class Supplier(
    val name: String,
    val countryCode: String
)