package com.amd.pokedexapp.di

import com.amd.pokedexapp.data.remote.PokeApi
import com.amd.pokedexapp.repository.PokemonRepository
import com.amd.pokedexapp.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    internal fun providePokemonRepository(
        api: PokeApi
    ) = PokemonRepository(api)

    @Provides
    @Singleton
    internal fun providePokeApi(): PokeApi {
        return Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
            .baseUrl(Constants.BASE_URL).build().create(PokeApi::class.java)
    }

}