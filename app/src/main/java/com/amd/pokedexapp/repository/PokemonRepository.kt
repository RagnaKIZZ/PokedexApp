package com.amd.pokedexapp.repository

import com.amd.pokedexapp.data.remote.PokeApi
import com.amd.pokedexapp.data.remote.responses.Pokemon
import com.amd.pokedexapp.data.remote.responses.PokemonList
import com.amd.pokedexapp.util.Resources
import dagger.hilt.android.scopes.ActivityScoped
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api: PokeApi
) {

    private suspend fun <T> safeApiCall(
        apiCall: suspend () -> T
    ): Resources<T> {
        return withContext(Dispatchers.IO) {
            try {
                Resources.Success(apiCall.invoke())
            } catch (throwable: Throwable) {
                Resources.Error(throwable)
            }
        }
    }

    private suspend fun <T> baseCallApi(
        api: suspend () -> T
    ): Resources<T> {
        val response = try {
            api.invoke()
        } catch (e: Exception) {
            return Resources.Error(e)
        }
        return Resources.Success(response)
    }

    suspend fun getPokemonList(
        limit: Int,
        offset: Int
    ): Resources<PokemonList> = baseCallApi {
        api.getPokemonList(limit, offset)
    }

    suspend fun getPokemonInfo(pokemonName: String): Resources<Pokemon> =
        baseCallApi { api.getPokemonInfo(pokemonName) }

}