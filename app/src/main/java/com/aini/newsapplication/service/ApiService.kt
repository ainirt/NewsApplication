package com.aini.newsapplication.service

import android.telecom.Call
import com.aini.newsapplication.model.ResponseNews
import com.google.android.gms.common.api.internal.ApiKey
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("top-headlines")
    fun getNewsHeadLines(
        @Query("country") country: String?,
        @Query("apiKey") apiKey : String?
    ): retrofit2.Call<ResponseNews>
}