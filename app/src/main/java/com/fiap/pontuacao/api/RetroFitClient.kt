package com.fiap.pontuacao.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetroFitClient{

    companion object{
        private var retrofitInstance: Retrofit? = null

        fun getRetrofit() : Retrofit?{
            if(retrofitInstance == null){
                retrofitInstance = Retrofit.Builder()
                    .baseUrl("https://gamestjd.herokuapp.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofitInstance

        }

        fun getPontuacaoAPI() =
                getRetrofit()?.create(PontuacaoAPI::class.java)


    }




}