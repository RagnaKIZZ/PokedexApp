package com.amd.pokedexapp.util

sealed class Resources<out T> {

    class Success<out T>(val data: T) : Resources<T>()
    class Error(val err: Throwable) : Resources<Nothing>()
    object Loading : Resources<Nothing>()

}
