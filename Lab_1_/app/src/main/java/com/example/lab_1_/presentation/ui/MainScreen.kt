package com.example.lab_1_.presentation.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.lab_1_.data.Product
import com.example.lab_1_.presentation.viewmodels.ProductViewModel

@Composable
fun ProductListScreen(viewModel: ProductViewModel = viewModel()) {
    val products = viewModel.filteredProducts

    LazyColumn {
        items(products.count()) { product ->
            ProductItem(product) {

            }
        }
    }
}

@Composable
fun ProductItem(product: Product, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onClick() }
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = product.name)
            Text(text = "Срок годности: ${product.expirationDate}")
            Text(text = "Цена: ${product.price} руб.")
        }
    }
}