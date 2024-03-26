package com.example.jastipin.widget

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jastipin.R
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update


class SearchViewModel : ViewModel() {

    private val _searchText = MutableStateFlow("")
    val searchText = _searchText.asStateFlow()

    private val _isSearching = MutableStateFlow(false)
    val isSearching = _isSearching.asStateFlow()

    private val _product = MutableStateFlow(items)

    @OptIn(FlowPreview::class)
    val products = searchText
        .debounce(1000L)
        .onEach { _isSearching.value = true }
        .combine(_product) { text, product ->
            if (text.isBlank()) {
                product
            } else {
                delay(2000L)
                product.filter {
                    it.doesMatchSearchQuery(text)
                }
            }
        }
        .onEach { _isSearching.value = false }
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            _product.value
        )


    fun onSearchTextChange(text: String) {
        _searchText.value = text
    }
}

val items = listOf(
    SearchItemList(
        imageResId = R.drawable.searchimage1,
        namaumkm = "Bakso & Soto Kedai Berkah",
        ratingumkm = "4.9",
        lokasiumkm = "Lubuk Linggau"
    ),
    SearchItemList(
        imageResId = R.drawable.searchimage2,
        namaumkm = "Dapur Nenek Restaurant",
        ratingumkm = "4.9",
        lokasiumkm = "Lubuk Linggau"
    ),
    SearchItemList(
        imageResId = R.drawable.searchimage3,
        namaumkm = "Aroma Restaurant Lubuklinggau",
        ratingumkm = "4.9",
        lokasiumkm = "Lubuk Linggau"
    ),
    SearchItemList(
        imageResId = R.drawable.searchimage4,
        namaumkm = "Seafood 21 dan BURYAM",
        ratingumkm = "4.9",
        lokasiumkm = "Lubuk Linggau"
    ),
    SearchItemList(
        imageResId = R.drawable.searchimage5,
        namaumkm = "Pindang Tulang",
        ratingumkm = "4.9",
        lokasiumkm = "Lubuk Linggau"
    ),
    SearchItemList(
        imageResId = R.drawable.searchimage6,
        namaumkm = "Pagi sore Restaurant",
        ratingumkm = "4.9",
        lokasiumkm = "Lubuk Linggau"
    )
)
