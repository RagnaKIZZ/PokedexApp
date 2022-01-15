package com.amd.pokedexapp.ui.screen.pokemondetail

import androidx.lifecycle.ViewModel
import com.amd.pokedexapp.data.remote.responses.Pokemon
import com.amd.pokedexapp.repository.PokemonRepository
import com.amd.pokedexapp.util.Resources
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
): ViewModel(){

    suspend fun getPokemonInfo(pokemonName: String): Resources<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }

}