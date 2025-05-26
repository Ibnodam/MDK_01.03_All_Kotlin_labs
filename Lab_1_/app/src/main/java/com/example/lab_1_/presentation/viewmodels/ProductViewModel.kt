package com.example.lab_1_.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lab_1_.data.Product
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class ProductViewModel : ViewModel() {
    private val products = listOf(
        Product("Товар 1", "2023-01-01", "2023-10-01", 100.0, "SN001"),
        Product("Товар 2", "2023-01-01", "2023-10-05", 150.0, "SN002"),
        Product("Товар 3", "2023-01-01", "2023-10-10", 200.0, "SN003")
    )

    var filteredProducts = mutableListOf<Product>()
        private set

    init {
        filterProducts()
    }

    private fun filterProducts() {
        val today = LocalDate.now()
        val fiveDaysLater = today.plusDays(5)
        filteredProducts = products.filter {
            val expirationDate = LocalDate.parse(it.expirationDate, DateTimeFormatter.ISO_DATE)
            expirationDate.isBefore(fiveDaysLater) || expirationDate.isEqual(fiveDaysLater)
        }.toMutableList()
    }
}