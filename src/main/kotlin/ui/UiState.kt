package ui

sealed class UiState<out T> {
    object Loading : UiState<Nothing>()
    data class Data<T>(val model: T) : UiState<T>()
    data class Error(val throwable: Throwable?) : UiState<Nothing>()
}